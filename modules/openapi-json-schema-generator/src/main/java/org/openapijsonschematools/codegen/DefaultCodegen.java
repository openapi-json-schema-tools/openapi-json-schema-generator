/*
 * Copyright 2018 OpenAPI-Generator Contributors (https://openapi-generator.tech)
 * Copyright 2018 SmartBear Software
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openapijsonschematools.codegen;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.Ticker;
import com.google.common.collect.ImmutableMap;
import com.samskivert.mustache.Mustache;
import com.samskivert.mustache.Mustache.Compiler;
import com.samskivert.mustache.Mustache.Lambda;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.security.OAuthFlow;
import io.swagger.v3.oas.models.security.Scopes;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.Pair;
import org.openapijsonschematools.codegen.config.GlobalSettings;
import org.openapijsonschematools.codegen.meta.features.DataTypeFeature;
import org.openapijsonschematools.codegen.meta.features.DocumentationFeature;
import org.openapijsonschematools.codegen.meta.features.GlobalFeature;
import org.openapijsonschematools.codegen.meta.features.ParameterFeature;
import org.openapijsonschematools.codegen.meta.features.SchemaSupportFeature;
import org.openapijsonschematools.codegen.meta.features.SecurityFeature;
import org.openapijsonschematools.codegen.meta.features.WireFormatFeature;
import org.openapijsonschematools.codegen.model.CodegenDiscriminator;
import org.openapijsonschematools.codegen.model.CodegenEncoding;
import org.openapijsonschematools.codegen.model.CodegenHeader;
import org.openapijsonschematools.codegen.model.CodegenKey;
import org.openapijsonschematools.codegen.model.CodegenMediaType;
import org.openapijsonschematools.codegen.model.CodegenOperation;
import org.openapijsonschematools.codegen.model.CodegenParameter;
import org.openapijsonschematools.codegen.model.CodegenPatternInfo;
import org.openapijsonschematools.codegen.model.CodegenRefInfo;
import org.openapijsonschematools.codegen.model.CodegenRequestBody;
import org.openapijsonschematools.codegen.model.CodegenResponse;
import org.openapijsonschematools.codegen.model.CodegenSchema;
import org.openapijsonschematools.codegen.model.CodegenSecurity;
import org.openapijsonschematools.codegen.model.CodegenServer;
import org.openapijsonschematools.codegen.model.CodegenServerVariable;
import org.openapijsonschematools.codegen.model.CodegenTag;
import org.openapijsonschematools.codegen.model.CodegenXml;
import org.openapijsonschematools.codegen.model.EnumValue;
import org.openapijsonschematools.codegen.model.OperationsMap;
import org.openapijsonschematools.codegen.model.SchemaTestCase;
import org.openapijsonschematools.codegen.serializer.SerializerUtils;
import org.openapijsonschematools.codegen.templating.MustacheEngineAdapter;
import org.openapijsonschematools.codegen.templating.mustache.CamelCaseLambda;
import org.openapijsonschematools.codegen.templating.mustache.IndentedLambda;
import org.openapijsonschematools.codegen.templating.mustache.LowercaseLambda;
import org.openapijsonschematools.codegen.templating.mustache.SnakecaseLambda;
import org.openapijsonschematools.codegen.templating.mustache.TitlecaseLambda;
import org.openapijsonschematools.codegen.templating.mustache.UppercaseLambda;
import org.openapijsonschematools.codegen.utils.ModelUtils;
import org.openapijsonschematools.codegen.utils.OnceLogger;
import org.openapijsonschematools.codegen.model.CodegenDiscriminator.MappedModel;
import org.openapijsonschematools.codegen.api.TemplatingEngineAdapter;
import org.openapijsonschematools.codegen.meta.FeatureSet;
import org.openapijsonschematools.codegen.meta.GeneratorMetadata;
import org.openapijsonschematools.codegen.meta.Stability;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.math.BigDecimal;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.swagger.v3.core.util.Json;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.callbacks.Callback;
import io.swagger.v3.oas.models.examples.Example;
import io.swagger.v3.oas.models.headers.Header;
import io.swagger.v3.oas.models.media.*;
import io.swagger.v3.oas.models.parameters.*;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.security.OAuthFlows;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import io.swagger.v3.oas.models.servers.ServerVariable;
import io.swagger.v3.parser.util.SchemaTypeUtil;

public class DefaultCodegen implements CodegenConfig {
    private final Logger LOGGER = LoggerFactory.getLogger(DefaultCodegen.class);

    public static FeatureSet DefaultFeatureSet;

    // A cache of sanitized words. The sanitizeName() method is invoked many times with the same
    // arguments, this cache is used to optimized performance.
    private static Cache<SanitizeNameOptions, String> sanitizedNameCache;
    private static final String xSchemaTestExamplesKey = "x-schema-test-examples";
    private static final String xSchemaTestExamplesRefPrefix = "#/components/x-schema-test-examples/";
    protected static Schema falseSchema;
    protected static Schema trueSchema = new Schema();

    static {
        DefaultFeatureSet = FeatureSet.newBuilder()
                .includeDataTypeFeatures(
                        DataTypeFeature.Int32, DataTypeFeature.Int64, DataTypeFeature.Float, DataTypeFeature.Double,
                        DataTypeFeature.Decimal, DataTypeFeature.String, DataTypeFeature.Byte, DataTypeFeature.Binary,
                        DataTypeFeature.Boolean, DataTypeFeature.Date, DataTypeFeature.DateTime, DataTypeFeature.Password,
                        DataTypeFeature.File, DataTypeFeature.Array, DataTypeFeature.Object, DataTypeFeature.Maps, DataTypeFeature.CollectionFormat,
                        DataTypeFeature.CollectionFormatMulti, DataTypeFeature.Enum, DataTypeFeature.ArrayOfEnum, DataTypeFeature.ArrayOfModel,
                        DataTypeFeature.ArrayOfCollectionOfPrimitives, DataTypeFeature.ArrayOfCollectionOfModel, DataTypeFeature.ArrayOfCollectionOfEnum,
                        DataTypeFeature.MapOfEnum, DataTypeFeature.MapOfModel, DataTypeFeature.MapOfCollectionOfPrimitives,
                        DataTypeFeature.MapOfCollectionOfModel, DataTypeFeature.MapOfCollectionOfEnum
                        // Custom types are template specific
                )
                .includeDocumentationFeatures(
                        DocumentationFeature.Api, DocumentationFeature.Model
                        // README is template specific
                )
                .includeGlobalFeatures(
                        GlobalFeature.Host, GlobalFeature.BasePath, GlobalFeature.Info, GlobalFeature.PartialSchemes,
                        GlobalFeature.Consumes, GlobalFeature.Produces, GlobalFeature.ExternalDocumentation, GlobalFeature.Examples,
                        GlobalFeature.Callbacks
                        // TODO: xml structures, styles, link objects, parameterized servers, full schemes for OAS 2.0
                )
                .includeSchemaSupportFeatures(
                        SchemaSupportFeature.Simple, SchemaSupportFeature.Composite,
                        SchemaSupportFeature.Polymorphism
                        // Union (OneOf) not 100% yet.
                )
                .includeParameterFeatures(
                        ParameterFeature.Path, ParameterFeature.Query, ParameterFeature.Header, ParameterFeature.Body,
                        ParameterFeature.FormUnencoded, ParameterFeature.FormMultipart, ParameterFeature.Cookie
                )
                .includeSecurityFeatures(
                        SecurityFeature.BasicAuth, SecurityFeature.ApiKey, SecurityFeature.BearerToken,
                        SecurityFeature.OAuth2_Implicit, SecurityFeature.OAuth2_Password,
                        SecurityFeature.OAuth2_ClientCredentials, SecurityFeature.OAuth2_AuthorizationCode
                        // OpenIDConnect not yet supported
                )
                .includeWireFormatFeatures(
                        WireFormatFeature.JSON, WireFormatFeature.XML
                        // PROTOBUF and Custom are generator specific
                )
                .build();

        int cacheSize = Integer.parseInt(GlobalSettings.getProperty(org.openapijsonschematools.codegen.utils.StringUtils.NAME_CACHE_SIZE_PROPERTY, "500"));
        int cacheExpiry = Integer.parseInt(GlobalSettings.getProperty(org.openapijsonschematools.codegen.utils.StringUtils.NAME_CACHE_EXPIRY_PROPERTY, "10"));
        sanitizedNameCache = Caffeine.newBuilder()
                .maximumSize(cacheSize)
                .expireAfterAccess(cacheExpiry, TimeUnit.SECONDS)
                .ticker(Ticker.systemTicker())
                .build();
        falseSchema = new Schema();
        falseSchema.setNot(new Schema());
    }

    protected GeneratorMetadata generatorMetadata;
    protected String inputSpec;
    protected String outputFolder = "";
    protected Set<String> defaultIncludes;
    protected Map<String, String> typeMapping;
    // instantiationTypes map from container types only: set, map, and array to the in language-type
    protected Map<String, String> instantiationTypes;
    protected Set<String> reservedWords;
    protected Set<String> languageSpecificPrimitives = new HashSet<>();
    protected Map<String, String> importMapping = new HashMap<>();
    // a map to store the mappping between a schema and the new one
    protected Map<String, String> schemaMapping = new HashMap<>();
    // a map to store the mappping between inline schema and the name provided by the user
    protected Map<String, String> inlineSchemaNameMapping = new HashMap<>();
    // a map to store the inline schema naming conventions
    protected Map<String, String> inlineSchemaNameDefault = new HashMap<>();
    protected String modelPackage = "", apiPackage = "", fileSuffix;
    protected String modelNamePrefix = "", modelNameSuffix = "";
    protected String apiNamePrefix = "", apiNameSuffix = "Api";
    protected String testPackage = "";
    protected String filesMetadataFilename = "FILES";
    protected String versionMetadataFilename = "VERSION";

    protected String packageName = "src.main.java";
    /*
    apiTemplateFiles are for API outputs only (controllers/handlers).
    API templates may be written multiple times; APIs are grouped by tag and the file is written once per tag group.
    */
    protected Map<String, String> apiTemplateFiles = new HashMap<>();
    protected Map<String, String> apiXToApiTemplateFiles = new HashMap<>();
    protected Map<CodegenConstants.JSON_PATH_LOCATION_TYPE, Map<String, String>> jsonPathTemplateFiles = new HashMap<>();
    protected Map<String, String> requestBodyDocTemplateFiles = new HashMap();
    protected Map<String, String> headerDocTemplateFiles = new HashMap<>();
    protected Map<String, String> responseDocTemplateFiles = new HashMap<>();
    protected Set<String> pathEndpointDocTemplateFiles = new HashSet<>();
    protected Set<String> pathEndpointTestTemplateFiles = new HashSet<>();
    protected Map<String, String> apiTestTemplateFiles = new HashMap<>();
    protected Map<String, String> modelTestTemplateFiles = new HashMap<>();
    protected Map<String, String> apiDocTemplateFiles = new HashMap<>();
    protected Map<String, String> modelDocTemplateFiles = new HashMap<>();
    protected Map<String, String> parameterDocTemplateFiles = new HashMap<>();
    protected Map<String, String> reservedWordsMappings = new HashMap<>();
    protected String templateDir;
    protected String embeddedTemplateDir;
    protected Map<String, Object> additionalProperties = new HashMap<>();
    protected Map<String, String> serverVariables = new HashMap<>();
    protected Map<String, Object> vendorExtensions = new HashMap<>();
    /*
    Supporting files are those which aren't models, APIs, or docs.
    These get a different map of data bound to the templates. Supporting files are written once.
    See also 'apiTemplateFiles'.
    */
    protected List<SupportingFile> supportingFiles = new ArrayList<>();
    protected List<CliOption> cliOptions = new ArrayList<>();
    protected boolean skipOverwrite;
    protected boolean removeOperationIdPrefix;
    protected String removeOperationIdPrefixDelimiter = "_";
    protected int removeOperationIdPrefixCount = 1;
    protected boolean skipOperationExample;

    protected final static Pattern JSON_MIME_PATTERN = Pattern.compile("(?i)application\\/json(;.*)?");
    protected final static Pattern JSON_VENDOR_MIME_PATTERN = Pattern.compile("(?i)application\\/vnd.(.*)+json(;.*)?");
    private static final Pattern COMMON_PREFIX_ENUM_NAME = Pattern.compile("[a-zA-Z0-9]+\\z");

    /**
     * True if the code generator supports multiple class inheritance.
     * This is used to model the parent hierarchy based on the 'allOf' composed schemas.
     */
    protected boolean supportsMultipleInheritance;
    /**
     * True if the code generator supports single class inheritance.
     * This is used to model the parent hierarchy based on the 'allOf' composed schemas.
     * Note: the single-class inheritance technique has inherent limitations because
     * a 'allOf' composed schema may have multiple $ref child schemas, each one
     * potentially representing a "parent" in the class inheritance hierarchy.
     * Some language generators also use class inheritance to implement the `additionalProperties`
     * keyword. For example, the Java code generator may generate 'extends HashMap'.
     */
    protected boolean supportsInheritance;
    /**
     * True if the language generator supports the 'additionalProperties' keyword
     * as sibling of a composed (allOf/anyOf/oneOf) schema.
     * Note: all language generators should support this to comply with the OAS specification.
     */
    protected boolean supportsAdditionalPropertiesWithComposedSchema = true;
    protected boolean supportsMixins;
    protected Map<String, String> supportedLibraries = new LinkedHashMap<>();
    protected String library;
    protected Boolean sortParamsByRequiredFlag = true;
    protected Boolean sortModelPropertiesByRequiredFlag = false;
    protected Boolean ensureUniqueParams = true;
    protected Boolean allowUnicodeIdentifiers = false;
    protected String gitHost, gitUserId, gitRepoId, releaseNote;
    protected String httpUserAgent;
    protected Boolean hideGenerationTimestamp = true;
    // How to encode special characters like $
    // They are translated to words like "Dollar" and prefixed with '
    // Then translated back during JSON encoding and decoding
    protected Map<String, String> specialCharReplacements = new LinkedHashMap<>();
    // When a model is an alias for a simple type
    protected Map<String, String> typeAliases = null;
    // The extension of the generated documentation files (defaults to markdown .md)
    protected String docExtension;
    protected String ignoreFilePathOverride;
    // flag to indicate whether to use environment variable to post process file
    protected boolean enablePostProcessFile = false;
    private TemplatingEngineAdapter templatingEngine = new MustacheEngineAdapter();

    // flag to indicate whether to only update files whose contents have changed
    protected boolean enableMinimalUpdate = false;

    // acts strictly upon a spec, potentially modifying it to have consistent behavior across generators.
    protected boolean strictSpecBehavior = true;
    // flag to indicate whether enum value prefixes are removed
    protected boolean removeEnumValuePrefix = true;

    // Support legacy logic for evaluating discriminators
    protected boolean legacyDiscriminatorBehavior = true;

    // Specify what to do if the 'additionalProperties' keyword is not present in a schema.
    // See CodegenConstants.java for more details.
    // This should be false for generators that support openapi + json schema
    protected boolean disallowAdditionalPropertiesIfNotPresent = false;

    // If the server adds new enum cases, that are unknown by an old spec/client, the client will fail to parse the network response.
    // With this option enabled, each enum will have a new case, 'unknown_default_open_api', so that when the server sends an enum case that is not known by the client/spec, they can safely fallback to this case.
    protected boolean enumUnknownDefaultCase = false;
    protected String enumUnknownDefaultCaseName = "unknown_default_open_api";

    // make openapi available to all methods
    protected OpenAPI openAPI;

    // A cache to efficiently lookup a Schema instance based on the return value of `toModelName()`.
    private Map<String, Schema> modelNameToSchemaCache;

    // A cache to efficiently lookup schema `toModelName()` based on the schema Key
    private final Map<String, String> schemaKeyToModelNameCache = new HashMap<>();

    protected boolean loadDeepObjectIntoItems = true;

    // if true then baseTypes will be imported
    protected boolean importBaseType = true;

    // if True codegenParameter and codegenResponse imports will come
    // from deeper schema defined locations
    protected boolean addSchemaImportsFromV3SpecLocations = false;

    @Override
    public List<CliOption> cliOptions() {
        return cliOptions;
    }

    @Override
    public void processOpts() {

        if (additionalProperties.containsKey(CodegenConstants.TEMPLATE_DIR)) {
            this.setTemplateDir((String) additionalProperties.get(CodegenConstants.TEMPLATE_DIR));
        }

        if (additionalProperties.containsKey(CodegenConstants.MODEL_PACKAGE)) {
            this.setModelPackage((String) additionalProperties.get(CodegenConstants.MODEL_PACKAGE));
        }

        if (additionalProperties.containsKey(CodegenConstants.API_PACKAGE)) {
            this.setApiPackage((String) additionalProperties.get(CodegenConstants.API_PACKAGE));
        }

        if (additionalProperties.containsKey(CodegenConstants.HIDE_GENERATION_TIMESTAMP)) {
            setHideGenerationTimestamp(convertPropertyToBooleanAndWriteBack(CodegenConstants.HIDE_GENERATION_TIMESTAMP));
        } else {
            additionalProperties.put(CodegenConstants.HIDE_GENERATION_TIMESTAMP, hideGenerationTimestamp);
        }

        if (additionalProperties.containsKey(CodegenConstants.SORT_PARAMS_BY_REQUIRED_FLAG)) {
            this.setSortParamsByRequiredFlag(Boolean.valueOf(additionalProperties
                    .get(CodegenConstants.SORT_PARAMS_BY_REQUIRED_FLAG).toString()));
        }

        if (additionalProperties.containsKey(CodegenConstants.SORT_MODEL_PROPERTIES_BY_REQUIRED_FLAG)) {
            this.setSortModelPropertiesByRequiredFlag(Boolean.valueOf(additionalProperties
                    .get(CodegenConstants.SORT_MODEL_PROPERTIES_BY_REQUIRED_FLAG).toString()));
        }

        if (additionalProperties.containsKey(CodegenConstants.ENSURE_UNIQUE_PARAMS)) {
            this.setEnsureUniqueParams(Boolean.valueOf(additionalProperties
                    .get(CodegenConstants.ENSURE_UNIQUE_PARAMS).toString()));
        }

        if (additionalProperties.containsKey(CodegenConstants.ALLOW_UNICODE_IDENTIFIERS)) {
            this.setAllowUnicodeIdentifiers(Boolean.valueOf(additionalProperties
                    .get(CodegenConstants.ALLOW_UNICODE_IDENTIFIERS).toString()));
        }

        if (additionalProperties.containsKey(CodegenConstants.API_NAME_PREFIX)) {
            this.setApiNamePrefix((String) additionalProperties.get(CodegenConstants.API_NAME_PREFIX));
        }

        if (additionalProperties.containsKey(CodegenConstants.API_NAME_SUFFIX)) {
            this.setApiNameSuffix((String) additionalProperties.get(CodegenConstants.API_NAME_SUFFIX));
        }

        if (additionalProperties.containsKey(CodegenConstants.MODEL_NAME_PREFIX)) {
            this.setModelNamePrefix((String) additionalProperties.get(CodegenConstants.MODEL_NAME_PREFIX));
        }

        if (additionalProperties.containsKey(CodegenConstants.MODEL_NAME_SUFFIX)) {
            this.setModelNameSuffix((String) additionalProperties.get(CodegenConstants.MODEL_NAME_SUFFIX));
        }

        if (additionalProperties.containsKey(CodegenConstants.REMOVE_OPERATION_ID_PREFIX)) {
            this.setRemoveOperationIdPrefix(Boolean.parseBoolean(additionalProperties
                    .get(CodegenConstants.REMOVE_OPERATION_ID_PREFIX).toString()));
        }

        if (additionalProperties.containsKey(CodegenConstants.REMOVE_OPERATION_ID_PREFIX_DELIMITER)) {
            this.setRemoveOperationIdPrefixDelimiter(additionalProperties
                    .get(CodegenConstants.REMOVE_OPERATION_ID_PREFIX_DELIMITER).toString());
        }

        if (additionalProperties.containsKey(CodegenConstants.REMOVE_OPERATION_ID_PREFIX_COUNT)) {
            this.setRemoveOperationIdPrefixCount(Integer.parseInt(additionalProperties
                    .get(CodegenConstants.REMOVE_OPERATION_ID_PREFIX_COUNT).toString()));
        }

        if (additionalProperties.containsKey(CodegenConstants.SKIP_OPERATION_EXAMPLE)) {
            this.setSkipOperationExample(Boolean.parseBoolean(additionalProperties
                    .get(CodegenConstants.SKIP_OPERATION_EXAMPLE).toString()));
        }

        if (additionalProperties.containsKey(CodegenConstants.DOCEXTENSION)) {
            this.setDocExtension(String.valueOf(additionalProperties
                    .get(CodegenConstants.DOCEXTENSION).toString()));
        }

        if (additionalProperties.containsKey(CodegenConstants.ENABLE_POST_PROCESS_FILE)) {
            this.setEnablePostProcessFile(Boolean.parseBoolean(additionalProperties
                    .get(CodegenConstants.ENABLE_POST_PROCESS_FILE).toString()));
        }

        if (additionalProperties.containsKey(CodegenConstants.REMOVE_ENUM_VALUE_PREFIX)) {
            this.setRemoveEnumValuePrefix(Boolean.parseBoolean(additionalProperties
                    .get(CodegenConstants.REMOVE_ENUM_VALUE_PREFIX).toString()));
        }

        if (additionalProperties.containsKey(CodegenConstants.LEGACY_DISCRIMINATOR_BEHAVIOR)) {
            this.setLegacyDiscriminatorBehavior(Boolean.parseBoolean(additionalProperties
                    .get(CodegenConstants.LEGACY_DISCRIMINATOR_BEHAVIOR).toString()));
        }
        if (additionalProperties.containsKey(CodegenConstants.DISALLOW_ADDITIONAL_PROPERTIES_IF_NOT_PRESENT)) {
            this.setDisallowAdditionalPropertiesIfNotPresent(Boolean.parseBoolean(additionalProperties
                    .get(CodegenConstants.DISALLOW_ADDITIONAL_PROPERTIES_IF_NOT_PRESENT).toString()));
        }
        if (additionalProperties.containsKey(CodegenConstants.ENUM_UNKNOWN_DEFAULT_CASE)) {
            this.setEnumUnknownDefaultCase(Boolean.parseBoolean(additionalProperties
                    .get(CodegenConstants.ENUM_UNKNOWN_DEFAULT_CASE).toString()));
        }
    }

    /***
     * Preset map builder with commonly used Mustache lambdas.
     *
     * To extend the map, override addMustacheLambdas(), call parent method
     * first and then add additional lambdas to the returned builder.
     *
     * If common lambdas are not desired, override addMustacheLambdas() method
     * and return empty builder.
     *
     * @return preinitialized map with common lambdas
     */
    protected ImmutableMap.Builder<String, Lambda> addMustacheLambdas() {

        return new ImmutableMap.Builder<String, Mustache.Lambda>()
                .put("lowercase", new LowercaseLambda().generator(this))
                .put("uppercase", new UppercaseLambda())
                .put("snakecase", new SnakecaseLambda())
                .put("titlecase", new TitlecaseLambda())
                .put("camelcase", new CamelCaseLambda(true).generator(this))
                .put("pascalcase", new CamelCaseLambda(false).generator(this))
                .put("indented", new IndentedLambda())
                .put("indented_8", new IndentedLambda(8, " "))
                .put("indented_12", new IndentedLambda(12, " "))
                .put("indented_16", new IndentedLambda(16, " "));
    }

    private void registerMustacheLambdas() {
        ImmutableMap<String, Lambda> lambdas = addMustacheLambdas().build();

        if (lambdas.size() == 0) {
            return;
        }

        if (additionalProperties.containsKey("lambda")) {
            LOGGER.error("A property called 'lambda' already exists in additionalProperties");
            throw new RuntimeException("A property called 'lambda' already exists in additionalProperties");
        }
        additionalProperties.put("lambda", lambdas);
    }

    // override with any special post-processing for all models
    @Override
    @SuppressWarnings("static-method")
    public TreeMap<String, CodegenSchema> postProcessAllModels(TreeMap<String, CodegenSchema> schemas) {
        return schemas;
    }

    /**
     * Return a map from model name to Schema for efficient lookup.
     *
     * @return map from model name to Schema.
     */
    protected Map<String, Schema> getModelNameToSchemaCache() {
        if (modelNameToSchemaCache == null) {
            // Create a cache to efficiently lookup schema based on model name.
            Map<String, Schema> m = new HashMap<>();
            ModelUtils.getSchemas(openAPI).forEach((key, schema) -> m.put(toModelName(key), schema));
            modelNameToSchemaCache = Collections.unmodifiableMap(m);
        }
        return modelNameToSchemaCache;
    }

    @Override
    public String packageName() {
        // used to generate imports
        return packageName;
    }

    public String packagePath() {
        return packageName.replace('.', File.separatorChar);
    }

    /**
     * Loop through all models to update different flags (e.g. isSelfReference), children models, etc
     *
     * @param objs Map of models
     * @return maps of models with various updates
     */
    @Override
    public TreeMap<String, CodegenSchema> updateAllModels(TreeMap<String, CodegenSchema> objs) {
        return objs;
    }

    // override with any special post-processing
    @Override
    @SuppressWarnings("static-method")
    public TreeMap<String, CodegenSchema> postProcessModels(TreeMap<String, CodegenSchema> objs) {
        return objs;
    }

    /**
     * Returns the common prefix of variables for enum naming if
     * two or more variables are present
     *
     * @param vars List of variable names
     * @return the common prefix for naming
     */
    public String findCommonPrefixOfVars(List<Object> vars) {
        if (vars.size() > 1) {
            try {
                String[] listStr = vars.toArray(new String[vars.size()]);
                String prefix = StringUtils.getCommonPrefix(listStr);
                // exclude trailing characters that should be part of a valid variable
                // e.g. ["status-on", "status-off"] => "status-" (not "status-o")
                final Matcher matcher = COMMON_PREFIX_ENUM_NAME.matcher(prefix);
                return matcher.replaceAll("");
            } catch (ArrayStoreException e) {
                // do nothing, just return default value
            }
        }
        return "";
    }

    /**
     * Return the sanitized variable name for enum
     *
     * @param value    enum variable name
     * @param prop the property that holds the data type booleans
     * @return the sanitized variable name for enum
     */
    public String toEnumVarName(String value, Schema prop) {
        if (value.length() == 0) {
            return "EMPTY";
        }

        String var = value.replaceAll("\\W+", "_").toUpperCase(Locale.ROOT);
        if (var.matches("\\d.*")) {
            return "_" + var;
        } else {
            return var;
        }
    }

    /**
     * Set the OpenAPI document.
     * This method is invoked when the input OpenAPI document has been parsed and validated.
     */
    @Override
    public void setOpenAPI(OpenAPI openAPI) {
        String originalSpecVersion;
        String xOriginalSwaggerVersion = "x-original-swagger-version";
        if (openAPI.getExtensions() != null && !openAPI.getExtensions().isEmpty() && openAPI.getExtensions().containsValue(xOriginalSwaggerVersion)) {
            originalSpecVersion = (String) openAPI.getExtensions().get(xOriginalSwaggerVersion);
        } else {
            originalSpecVersion = openAPI.getOpenapi();
        }
        Integer specMajorVersion = Integer.parseInt(originalSpecVersion.substring(0, 1));
        Integer specMinorVersion = Integer.parseInt(originalSpecVersion.substring(2, 3));
        boolean specVersionGreaterThanOrEqualTo310 = (specMajorVersion == 3 && specMinorVersion >= 1);
        if (specVersionGreaterThanOrEqualTo310) {
            LOGGER.warn(CodegenConstants.UNSUPPORTED_V310_SPEC_MSG);
        }
        this.openAPI = openAPI;
        // Set global settings such that helper functions in ModelUtils can lookup the value
        // of the CLI option.
        ModelUtils.setDisallowAdditionalPropertiesIfNotPresent(getDisallowAdditionalPropertiesIfNotPresent());
    }

    // override with any message to be shown right before the process finishes
    @Override
    @SuppressWarnings("static-method")
    public void postProcess() {
        System.out.println("################################################################################");
        System.out.println("# Thanks for using OpenAPI JSON Schema Generator.                              #");
        System.out.println("# Please consider donation to help us maintain this project \uD83D\uDE4F                 #");
        System.out.println("# https://github.com/sponsors/spacether                                        #");
        System.out.println("################################################################################");
    }

    // override with any special post-processing
    @Override
    @SuppressWarnings("static-method")
    public OperationsMap postProcessOperationsWithModels(OperationsMap objs, TreeMap<String, CodegenSchema> schemas) {
        return objs;
    }

    // override with any special post-processing
    @Override
    @SuppressWarnings("static-method")
    public Map<String, Object> postProcessSupportingFileData(Map<String, Object> objs) {
        return objs;
    }

    // override to post-process any model properties
    @Override
    @SuppressWarnings("unused")
    public void postProcessModelProperty(CodegenSchema model, CodegenSchema property) {
    }

    //override with any special handling of the entire OpenAPI spec document
    @Override
    @SuppressWarnings("unused")
    public void preprocessOpenAPI(OpenAPI openAPI) {
    }

    // override with any special handling of the entire OpenAPI spec document
    @Override
    @SuppressWarnings("unused")
    public void processOpenAPI(OpenAPI openAPI) {
    }

    // override with any special handling of the JMustache compiler
    @Override
    @SuppressWarnings("unused")
    public Compiler processCompiler(Compiler compiler) {
        return compiler;
    }

    // override with any special handling for the templating engine
    @Override
    @SuppressWarnings("unused")
    public TemplatingEngineAdapter processTemplatingEngine(TemplatingEngineAdapter templatingEngine) {
        return templatingEngine;
    }

    // override with any special text escaping logic
    @Override
    @SuppressWarnings("static-method")
    public String escapeText(String input) {
        if (input == null) {
            return input;
        }

        // remove \t, \n, \r
        // replace \ with \\
        // replace " with \"
        // outer unescape to retain the original multi-byte characters
        // finally escalate characters avoiding code injection
        return escapeUnsafeCharacters(
                StringEscapeUtils.unescapeJava(
                                StringEscapeUtils.escapeJava(input)
                                        .replace("\\/", "/"))
                        .replaceAll("[\\t\\n\\r]", " ")
                        .replace("\\", "\\\\")
                        .replace("\"", "\\\""));
    }

    /**
     * Escape characters while allowing new lines
     *
     * @param input String to be escaped
     * @return escaped string
     */
    @Override
    public String escapeTextWhileAllowingNewLines(String input) {
        if (input == null) {
            return input;
        }

        // remove \t
        // replace \ with \\
        // replace " with \"
        // outer unescape to retain the original multi-byte characters
        // finally escalate characters avoiding code injection
        return escapeUnsafeCharacters(
                StringEscapeUtils.unescapeJava(
                                StringEscapeUtils.escapeJava(input)
                                        .replace("\\/", "/"))
                        .replaceAll("[\\t]", " ")
                        .replace("\\", "\\\\")
                        .replace("\"", "\\\""));
    }

    // override with any special encoding and escaping logic
    @Override
    @SuppressWarnings("static-method")
    public String encodePath(String input) {
        return escapeText(input);
    }

    /**
     * override with any special text escaping logic to handle unsafe
     * characters so as to avoid code injection
     *
     * @param input String to be cleaned up
     * @return string with unsafe characters removed or escaped
     */
    @Override
    public String escapeUnsafeCharacters(String input) {
        LOGGER.warn("escapeUnsafeCharacters should be overridden in the code generator with proper logic to escape " +
                "unsafe characters");
        // doing nothing by default and code generator should implement
        // the logic to prevent code injection
        // later we'll make this method abstract to make sure
        // code generator implements this method
        return input;
    }

    /**
     * Escape single and/or double quote to avoid code injection
     *
     * @param input String to be cleaned up
     * @return string with quotation mark removed or escaped
     */
    @Override
    public String escapeQuotationMark(String input) {
        LOGGER.warn("escapeQuotationMark should be overridden in the code generator with proper logic to escape " +
                "single/double quote");
        return input.replace("\"", "\\\"");
    }

    @Override
    public Set<String> defaultIncludes() {
        return defaultIncludes;
    }

    @Override
    public Map<String, String> typeMapping() {
        return typeMapping;
    }

    @Override
    public Map<String, String> instantiationTypes() {
        return instantiationTypes;
    }

    @Override
    public Set<String> reservedWords() {
        return reservedWords;
    }

    @Override
    public Set<String> languageSpecificPrimitives() {
        return languageSpecificPrimitives;
    }

    @Override
    public Map<String, String> importMapping() {
        return importMapping;
    }

    @Override
    public Map<String, String> schemaMapping() {
        return schemaMapping;
    }

    @Override
    public Map<String, String> inlineSchemaNameMapping() {
        return inlineSchemaNameMapping;
    }

    @Override
    public Map<String, String> inlineSchemaNameDefault() {
        return inlineSchemaNameDefault;
    }

    @Override
    public String testPackage() {
        return testPackage;
    }

    @Override
    public String modelPackage() {
        return modelPackage;
    }

    @Override
    public String apiPackage() {
        return apiPackage;
    }

    @Override
    public String fileSuffix() {
        return fileSuffix;
    }

    @Override
    public String templateDir() {
        return templateDir;
    }

    @Override
    public String embeddedTemplateDir() {
        if (embeddedTemplateDir != null) {
            return embeddedTemplateDir;
        } else {
            return templateDir;
        }
    }

    @Override
    public Map<String, String> apiDocTemplateFiles() {
        return apiDocTemplateFiles;
    }

    @Override
    public Map<String, String> modelDocTemplateFiles() {
        return modelDocTemplateFiles;
    }

    @Override
    public Map<String, String> reservedWordsMappings() {
        return reservedWordsMappings;
    }

    @Override
    public Map<String, String> apiTestTemplateFiles() {
        return apiTestTemplateFiles;
    }

    @Override
    public Map<String, String> modelTestTemplateFiles() {
        return modelTestTemplateFiles;
    }

    @Override
    public Map<String, String> apiTemplateFiles() {
        return apiTemplateFiles;
    }

    @Override
    public Map<String, String> apiXToApiTemplateFiles() { return apiXToApiTemplateFiles; }

    @Override
    public Map<CodegenConstants.JSON_PATH_LOCATION_TYPE, Map<String, String>> jsonPathTemplateFiles() {
        return jsonPathTemplateFiles;
    }

    @Override
    public Map<String, String> requestBodyDocTemplateFiles() { return requestBodyDocTemplateFiles; }

    @Override
    public Map<String, String> headerDocTemplateFiles() { return headerDocTemplateFiles; }

    @Override
    public Map<String, String> responseDocTemplateFiles() { return responseDocTemplateFiles; }

    @Override
    public Map<String, String> parameterDocTemplateFiles() { return parameterDocTemplateFiles; }

    @Override
    public Set<String> pathEndpointDocTemplateFiles() { return pathEndpointDocTemplateFiles; }

    @Override
    public Set<String> pathEndpointTestTemplateFiles() { return pathEndpointTestTemplateFiles; }

    public String toResponseModuleName(String componentName) { return toModuleFilename(componentName); }

    public String toHeaderFilename(String componentName) { return toModuleFilename(componentName); }

    public String toRequestBodyDocFilename(String componentName) { return toModuleFilename(componentName); }

    public String toResponseDocFilename(String componentName) { return toModuleFilename(componentName); }

    public String toHeaderDocFilename(String componentName) { return toModuleFilename(componentName); }

    @Override
    public String apiFileFolder() {
        return outputFolder + File.separator + apiPackage().replace('.', File.separatorChar);
    }

    @Override
    public String modelFileFolder() {
        return outputFolder + File.separator + modelPackage().replace('.', File.separatorChar);
    }

    @Override
    public String apiTestFileFolder() {
        return outputFolder + File.separator + testPackage().replace('.', File.separatorChar);
    }

    @Override
    public String modelTestFileFolder() {
        return outputFolder + File.separator + testPackage().replace('.', File.separatorChar);
    }

    @Override
    public String apiDocFileFolder() {
        return outputFolder;
    }

    @Override
    public String modelDocFileFolder() {
        return outputFolder;
    }

    @Override
    public String requestBodyDocFileFolder() { return outputFolder; }

    @Override
    public String responseDocFileFolder() { return outputFolder; }

    @Override
    public String headerFileFolder(String componentName) { return outputFolder; }

    @Override
    public String headerDocFileFolder() { return outputFolder; }

    @Override
    public String parameterFileFolder(String componentName) { return outputFolder; }

    @Override
    public String parameterDocFileFolder() { return outputFolder; }

    @Override
    public Map<String, Object> additionalProperties() {
        return additionalProperties;
    }

    @Override
    public Map<String, String> serverVariableOverrides() {
        return serverVariables;
    }

    @Override
    public Map<String, Object> vendorExtensions() {
        return vendorExtensions;
    }

    @Override
    public List<SupportingFile> supportingFiles() {
        return supportingFiles;
    }

    @Override
    public String outputFolder() {
        return outputFolder;
    }

    @Override
    public void setOutputDir(String dir) {
        this.outputFolder = dir;
    }

    @Override
    public String getOutputDir() {
        return outputFolder();
    }

    @Override
    public String getInputSpec() {
        return inputSpec;
    }

    @Override
    public void setInputSpec(String inputSpec) {
        this.inputSpec = inputSpec;
    }

    @Override
    public String getFilesMetadataFilename() {
        return filesMetadataFilename;
    }

    public void setFilesMetadataFilename(String filesMetadataFilename) {
        this.filesMetadataFilename = filesMetadataFilename;
    }

    @Override
    public String getVersionMetadataFilename() {
        return versionMetadataFilename;
    }

    public void setVersionMetadataFilename(String versionMetadataFilename) {
        this.versionMetadataFilename = versionMetadataFilename;
    }

    public void setTemplateDir(String templateDir) {
        this.templateDir = templateDir;
    }

    public void setModelPackage(String modelPackage) {
        this.modelPackage = modelPackage;
    }

    public String getModelNamePrefix() {
        return modelNamePrefix;
    }

    public void setModelNamePrefix(String modelNamePrefix) {
        this.modelNamePrefix = modelNamePrefix;
    }

    public String getModelNameSuffix() {
        return modelNameSuffix;
    }

    public void setModelNameSuffix(String modelNameSuffix) {
        this.modelNameSuffix = modelNameSuffix;
    }

    public String getApiNameSuffix() {
        return apiNameSuffix;
    }

    public void setApiNameSuffix(String apiNameSuffix) {
        this.apiNameSuffix = apiNameSuffix;
    }

    public String getApiNamePrefix() {
        return apiNamePrefix;
    }

    public void setApiNamePrefix(String apiNamePrefix) {
        this.apiNamePrefix = apiNamePrefix;
    }

    public void setApiPackage(String apiPackage) {
        this.apiPackage = apiPackage;
    }

    public Boolean getSortParamsByRequiredFlag() {
        return sortParamsByRequiredFlag;
    }

    public void setSortParamsByRequiredFlag(Boolean sortParamsByRequiredFlag) {
        this.sortParamsByRequiredFlag = sortParamsByRequiredFlag;
    }

    public Boolean getSortModelPropertiesByRequiredFlag() {
        return sortModelPropertiesByRequiredFlag;
    }

    public void setSortModelPropertiesByRequiredFlag(Boolean sortModelPropertiesByRequiredFlag) {
        this.sortModelPropertiesByRequiredFlag = sortModelPropertiesByRequiredFlag;
    }
    public Boolean getEnsureUniqueParams() {
        return ensureUniqueParams;
    }

    public void setEnsureUniqueParams(Boolean ensureUniqueParams) {
        this.ensureUniqueParams = ensureUniqueParams;
    }

    public Boolean getLegacyDiscriminatorBehavior() {
        return legacyDiscriminatorBehavior;
    }

    public void setLegacyDiscriminatorBehavior(boolean val) {
        this.legacyDiscriminatorBehavior = val;
    }

    public Boolean getDisallowAdditionalPropertiesIfNotPresent() {
        return disallowAdditionalPropertiesIfNotPresent;
    }

    public void setDisallowAdditionalPropertiesIfNotPresent(boolean val) {
        this.disallowAdditionalPropertiesIfNotPresent = val;
    }

    public Boolean getEnumUnknownDefaultCase() {
        return enumUnknownDefaultCase;
    }

    public void setEnumUnknownDefaultCase(boolean val) {
        this.enumUnknownDefaultCase = val;
    }

    public Boolean getAllowUnicodeIdentifiers() {
        return allowUnicodeIdentifiers;
    }

    public void setAllowUnicodeIdentifiers(Boolean allowUnicodeIdentifiers) {
        this.allowUnicodeIdentifiers = allowUnicodeIdentifiers;
    }

    /**
     * Return the regular expression/JSON schema pattern (http://json-schema.org/latest/json-schema-validation.html#anchor33)
     *
     * @param pattern the pattern (regular expression)
     * @return properly-escaped pattern
     */
    @Override
    public CodegenPatternInfo getPatternInfo(String pattern) {
        if (pattern == null) {
            return null;
        }
        return addRegularExpressionDelimiter(escapeText(pattern));
    }

    /**
     * Return the file name of the Api Test
     *
     * @param name the file name of the Api
     * @return the file name of the Api
     */
    @Override
    public String toApiFilename(String name) {
        return toApiName(name);
    }

    /**
     * Return the file name of the Api Documentation
     *
     * @param name the file name of the Api
     * @return the file name of the Api
     */
    @Override
    public String toApiDocFilename(String name) {
        return toApiName(name);
    }

    /**
     * Return the file name of the Api Test
     *
     * @param name the file name of the Api
     * @return the file name of the Api
     */
    @Override
    public String toApiTestFilename(String name) {
        return toApiName(name) + "Test";
    }

    /**
     * Return the variable name in the Api
     *
     * @param name the variable name of the Api
     * @return the snake-cased variable name
     */
    @Override
    public String toApiVarName(String name) {
        return lowerCamelCase(name);
    }

    /**
     * Return the capitalized file name of the model
     *
     * @param name the model name
     * @return the file name of the model
     */
    @Override
    public String toModelFilename(String name) {
        return toModuleFilename(name);
    }

    @Override
    public String toModuleFilename(String name) {
        return org.openapijsonschematools.codegen.utils.StringUtils.camelize(name);
    }

    public String toPathFilename(String name) {
        return toModuleFilename(name);
    }

    @Override
    public String toParameterFilename(String basename) {
        return toModuleFilename(basename);
    }

    @Override
    public String toParameterDocFilename(String componentName) { return toModuleFilename(componentName); }

    /**
     * Return the capitalized file name of the model test
     *
     * @param name the model name
     * @return the file name of the model
     */
    @Override
    public String toModelTestFilename(String name) {
        return org.openapijsonschematools.codegen.utils.StringUtils.camelize(name) + "Test";
    }

    /**
     * Return the capitalized file name of the model documentation
     *
     * @param name the model name
     * @return the file name of the model
     */
    @Override
    public String toModelDocFilename(String name) {
        return org.openapijsonschematools.codegen.utils.StringUtils.camelize(name);
    }

    /**
     * Returns metadata about the generator.
     *
     * @return A provided {@link GeneratorMetadata} instance
     */
    @Override
    public GeneratorMetadata getGeneratorMetadata() {
        return generatorMetadata;
    }

    /**
     * Return the operation ID (method name)
     *
     * @param operationId operation ID
     * @return the sanitized method name
     */
    @SuppressWarnings("static-method")
    public String toOperationId(String operationId) {
        // throw exception if method name is empty
        if (StringUtils.isEmpty(operationId)) {
            throw new RuntimeException("Empty method name (operationId) not allowed");
        }

        return operationId;
    }

    /**
     * Return the variable name by removing invalid characters and proper escaping if
     * it's a reserved word.
     *
     * @param name the variable name
     * @return the sanitized variable name
     */
    public String toVarName(final String name) {
        if (reservedWords.contains(name)) {
            return escapeReservedWord(name);
        } else if (name.chars().anyMatch(character -> specialCharReplacements.containsKey(String.valueOf((char) character)))) {
            return org.openapijsonschematools.codegen.utils.StringUtils.escape(name, specialCharReplacements, null, null);
        }
        return name;
    }

    /**
     * Return the parameter name by removing invalid characters and proper escaping if
     * it's a reserved word.
     *
     * @param name Codegen property object
     * @return the sanitized parameter name
     */
    @Override
    public String toParamName(String name) {
        name = removeNonNameElementToCamelCase(name); // FIXME: a parameter should not be assigned. Also declare the methods parameters as 'final'.
        if (reservedWords.contains(name)) {
            return escapeReservedWord(name);
        } else if (name.chars().anyMatch(character -> specialCharReplacements.containsKey(String.valueOf((char) character)))) {
            return org.openapijsonschematools.codegen.utils.StringUtils.escape(name, specialCharReplacements, null, null);
        }
        return name;

    }

    /**
     * Return the escaped name of the reserved word
     *
     * @param name the name to be escaped
     * @return the escaped reserved word
     * <p>
     * throws Runtime exception as reserved word is not allowed (default behavior)
     */
    @Override
    @SuppressWarnings("static-method")
    public String escapeReservedWord(String name) {
        throw new RuntimeException("reserved word " + name + " not allowed");
    }

    /**
     * Return the fully-qualified "Model" name for import
     *
     * @param refClass the name of the "Model"
     * @return the fully-qualified "Model" name for import
     */
    @Override
    public String toModelImport(String refClass) {
        if ("".equals(modelPackage())) {
            return refClass;
        } else {
            return modelPackage() + "." + refClass;
        }
    }

    /**
     * Returns the same content as [[toModelImport]] with key the fully-qualified Model name and value the initial input.
     * In case of union types this method has a key for each separate model and import.
     *
     * @param name the name of the "Model"
     * @return Map of fully-qualified models.
     */
    @Override
    public Map<String, String> toModelImportMap(String name) {
        return Collections.singletonMap(this.toModelImport(name), name);
    }

    /**
     * Return the fully-qualified "Api" name for import
     *
     * @param name the name of the "Api"
     * @return the fully-qualified "Api" name for import
     */
    @Override
    public String toApiImport(String name) {
        return apiPackage() + "." + name;
    }

    /**
     * Default constructor.
     * This method will map between OAS type and language-specified type, as well as mapping
     * between OAS type and the corresponding import statement for the language. This will
     * also add some language specified CLI options, if any.
     * returns string presentation of the example path (it's a constructor)
     */
    public DefaultCodegen() {
        CodegenType codegenType = getTag();
        if (codegenType == null) {
            codegenType = CodegenType.OTHER;
        }

        generatorMetadata = GeneratorMetadata.newBuilder()
                .stability(Stability.STABLE)
                .featureSet(DefaultFeatureSet)
                .generationMessage(String.format(Locale.ROOT, "OpenAPI JSON Schema Generator: %s (%s)", getName(), codegenType.toValue()))
                .build();

        defaultIncludes = new HashSet<>(
                Arrays.asList("double",
                        "int",
                        "long",
                        "short",
                        "char",
                        "float",
                        "String",
                        "boolean",
                        "Boolean",
                        "Double",
                        "Void",
                        "Integer",
                        "Long",
                        "Float")
        );

        typeMapping = new HashMap<>();
        typeMapping.put("array", "List");
        typeMapping.put("set", "Set");
        typeMapping.put("map", "Map");
        typeMapping.put("boolean", "Boolean");
        typeMapping.put("string", "String");
        typeMapping.put("int", "Integer");
        typeMapping.put("float", "Float");
        typeMapping.put("double", "Double");
        typeMapping.put("number", "BigDecimal");
        typeMapping.put("decimal", "BigDecimal");
        typeMapping.put("DateTime", "Date");
        typeMapping.put("long", "Long");
        typeMapping.put("short", "Short");
        typeMapping.put("char", "String");
        typeMapping.put("object", "Object");
        typeMapping.put("integer", "Integer");
        // FIXME: java specific type should be in Java Based Abstract Impl's
        typeMapping.put("ByteArray", "byte[]");
        typeMapping.put("binary", "File");
        typeMapping.put("file", "File");
        typeMapping.put("UUID", "UUID");
        typeMapping.put("URI", "URI");
        typeMapping.put("AnyType", "oas_any_type_not_mapped");

        instantiationTypes = new HashMap<>();

        reservedWords = new HashSet<>();

        cliOptions.add(CliOption.newBoolean(CodegenConstants.SORT_PARAMS_BY_REQUIRED_FLAG,
                CodegenConstants.SORT_PARAMS_BY_REQUIRED_FLAG_DESC).defaultValue(Boolean.TRUE.toString()));
        cliOptions.add(CliOption.newBoolean(CodegenConstants.SORT_MODEL_PROPERTIES_BY_REQUIRED_FLAG,
                CodegenConstants.SORT_MODEL_PROPERTIES_BY_REQUIRED_FLAG_DESC).defaultValue(Boolean.TRUE.toString()));
        cliOptions.add(CliOption.newBoolean(CodegenConstants.ENSURE_UNIQUE_PARAMS, CodegenConstants
                .ENSURE_UNIQUE_PARAMS_DESC).defaultValue(Boolean.TRUE.toString()));
        // name formatting options
        cliOptions.add(CliOption.newBoolean(CodegenConstants.ALLOW_UNICODE_IDENTIFIERS, CodegenConstants
                .ALLOW_UNICODE_IDENTIFIERS_DESC).defaultValue(Boolean.FALSE.toString()));
        // option to change the order of form/body parameter
        cliOptions.add(CliOption.newBoolean(CodegenConstants.PREPEND_FORM_OR_BODY_PARAMETERS,
                CodegenConstants.PREPEND_FORM_OR_BODY_PARAMETERS_DESC).defaultValue(Boolean.FALSE.toString()));

        // option to change how we process + set the data in the discriminator mapping
        CliOption legacyDiscriminatorBehaviorOpt = CliOption.newBoolean(CodegenConstants.LEGACY_DISCRIMINATOR_BEHAVIOR, CodegenConstants.LEGACY_DISCRIMINATOR_BEHAVIOR_DESC).defaultValue(Boolean.TRUE.toString());
        Map<String, String> legacyDiscriminatorBehaviorOpts = new HashMap<>();
        legacyDiscriminatorBehaviorOpts.put("true", "The mapping in the discriminator includes descendent schemas that allOf inherit from self and the discriminator mapping schemas in the OAS document.");
        legacyDiscriminatorBehaviorOpts.put("false", "The mapping in the discriminator includes any descendent schemas that allOf inherit from self, any oneOf schemas, any anyOf schemas, any x-discriminator-values, and the discriminator mapping schemas in the OAS document AND Codegen validates that oneOf and anyOf schemas contain the required discriminator and throws an error if the discriminator is missing.");
        legacyDiscriminatorBehaviorOpt.setEnum(legacyDiscriminatorBehaviorOpts);
        cliOptions.add(legacyDiscriminatorBehaviorOpt);

        // option to change how we process + set the data in the 'additionalProperties' keyword.
        CliOption disallowAdditionalPropertiesIfNotPresentOpt = CliOption.newBoolean(
                CodegenConstants.DISALLOW_ADDITIONAL_PROPERTIES_IF_NOT_PRESENT,
                CodegenConstants.DISALLOW_ADDITIONAL_PROPERTIES_IF_NOT_PRESENT_DESC).defaultValue(Boolean.TRUE.toString());
        Map<String, String> disallowAdditionalPropertiesIfNotPresentOpts = new HashMap<>();
        disallowAdditionalPropertiesIfNotPresentOpts.put("false",
                "The 'additionalProperties' implementation is compliant with the OAS and JSON schema specifications.");
        disallowAdditionalPropertiesIfNotPresentOpts.put("true",
                "Keep the old (incorrect) behaviour that 'additionalProperties' is set to false by default.");
        disallowAdditionalPropertiesIfNotPresentOpt.setEnum(disallowAdditionalPropertiesIfNotPresentOpts);
        cliOptions.add(disallowAdditionalPropertiesIfNotPresentOpt);

        CliOption enumUnknownDefaultCaseOpt = CliOption.newBoolean(
                CodegenConstants.ENUM_UNKNOWN_DEFAULT_CASE,
                CodegenConstants.ENUM_UNKNOWN_DEFAULT_CASE_DESC).defaultValue(Boolean.FALSE.toString());
        Map<String, String> enumUnknownDefaultCaseOpts = new HashMap<>();
        enumUnknownDefaultCaseOpts.put("false",
                "No changes to the enum's are made, this is the default option.");
        enumUnknownDefaultCaseOpts.put("true",
                "With this option enabled, each enum will have a new case, 'unknown_default_open_api', so that when the enum case sent by the server is not known by the client/spec, can safely be decoded to this case.");
        enumUnknownDefaultCaseOpt.setEnum(enumUnknownDefaultCaseOpts);
        cliOptions.add(enumUnknownDefaultCaseOpt);
        this.setEnumUnknownDefaultCase(false);

        // initialize special character mapping
        initializeSpecialCharacterMapping();

        // Register common Mustache lambdas.
        registerMustacheLambdas();
    }

    /**
     * Initialize special character mapping
     */
    protected void initializeSpecialCharacterMapping() {
        // Initialize special characters
        specialCharReplacements.put("$", "Dollar");
        specialCharReplacements.put("^", "Caret");
        specialCharReplacements.put("|", "Pipe");
        specialCharReplacements.put("=", "Equal");
        specialCharReplacements.put("*", "Star");
        specialCharReplacements.put("-", "Minus");
        specialCharReplacements.put("&", "Ampersand");
        specialCharReplacements.put("%", "Percent");
        specialCharReplacements.put("#", "Hash");
        specialCharReplacements.put("@", "At");
        specialCharReplacements.put("!", "Exclamation");
        specialCharReplacements.put("+", "Plus");
        specialCharReplacements.put(":", "Colon");
        specialCharReplacements.put(";", "Semicolon");
        specialCharReplacements.put(">", "Greater_Than");
        specialCharReplacements.put("<", "Less_Than");
        specialCharReplacements.put(".", "Period");
        specialCharReplacements.put("_", "Underscore");
        specialCharReplacements.put("?", "Question_Mark");
        specialCharReplacements.put(",", "Comma");
        specialCharReplacements.put("'", "Quote");
        specialCharReplacements.put("\"", "Double_Quote");
        specialCharReplacements.put("/", "Slash");
        specialCharReplacements.put("\\", "Back_Slash");
        specialCharReplacements.put("(", "Left_Parenthesis");
        specialCharReplacements.put(")", "Right_Parenthesis");
        specialCharReplacements.put("{", "Left_Curly_Bracket");
        specialCharReplacements.put("}", "Right_Curly_Bracket");
        specialCharReplacements.put("[", "Left_Square_Bracket");
        specialCharReplacements.put("]", "Right_Square_Bracket");
        specialCharReplacements.put("~", "Tilde");
        specialCharReplacements.put("`", "Backtick");

        specialCharReplacements.put("<=", "Less_Than_Or_Equal_To");
        specialCharReplacements.put(">=", "Greater_Than_Or_Equal_To");
        specialCharReplacements.put("!=", "Not_Equal");
        specialCharReplacements.put("<>", "Not_Equal");
        specialCharReplacements.put("~=", "Tilde_Equal");
    }

    /**
     * Return the symbol name of a symbol
     *
     * @param input Symbol (e.g. $)
     * @return Symbol name (e.g. Dollar)
     */
    protected String getSymbolName(String input) {
        return specialCharReplacements.get(input);
    }

    /**
     * Return the example path
     *
     * @param path      the path of the operation
     * @param operation OAS operation object
     * @return string presentation of the example path
     */
    @Override
    @SuppressWarnings("static-method")
    public String generateExamplePath(String path, Operation operation) {
        StringBuilder sb = new StringBuilder();
        sb.append(path);

        if (operation.getParameters() != null) {
            int count = 0;

            for (Parameter param : operation.getParameters()) {
                if (param instanceof QueryParameter) {
                    StringBuilder paramPart = new StringBuilder();
                    QueryParameter qp = (QueryParameter) param;

                    if (count == 0) {
                        paramPart.append("?");
                    } else {
                        paramPart.append(",");
                    }
                    count += 1;
                    if (!param.getRequired()) {
                        paramPart.append("[");
                    }
                    paramPart.append(param.getName()).append("=");
                    paramPart.append("{");

                    // TODO support for multi, tsv?
                    if (qp.getStyle() != null) {
                        paramPart.append(param.getName()).append("1");
                        if (Parameter.StyleEnum.FORM.equals(qp.getStyle())) {
                            if (qp.getExplode() != null && qp.getExplode()) {
                                paramPart.append(",");
                            } else {
                                paramPart.append("&").append(param.getName()).append("=");
                                paramPart.append(param.getName()).append("2");
                            }
                        } else if (Parameter.StyleEnum.PIPEDELIMITED.equals(qp.getStyle())) {
                            paramPart.append("|");
                        } else if (Parameter.StyleEnum.SPACEDELIMITED.equals(qp.getStyle())) {
                            paramPart.append("%20");
                        } else {
                            LOGGER.warn("query parameter '{}' style not support: {}", param.getName(), qp.getStyle());
                        }
                    } else {
                        paramPart.append(param.getName());
                    }

                    paramPart.append("}");
                    if (!param.getRequired()) {
                        paramPart.append("]");
                    }
                    sb.append(paramPart);
                }
            }
        }

        return sb.toString();
    }

    public String toExampleValue(Schema schema, Object objExample) {
        return null;
    }


    /**
     * Return the example value of the parameter.
     *
     * @param header        Header
     * @return string example
     */
    public String getHeaderExampleValue(Header header) {
        if (header.getExample() != null) {
            return header.getExample().toString();
        }

        if (header.getExamples() != null && !header.getExamples().isEmpty()) {
            Example example = header.getExamples().values().iterator().next();
            if (example.getValue() != null) {
                return example.getValue().toString();
            }
        }

        Schema schema = header.getSchema();
        if (schema != null && schema.getExample() != null) {
            return schema.getExample().toString();
        }
        // TODO add content-type
        // TODO add calculated example from codegenheader.schema
        return null;
    }

    /**
     * Return the example value of the parameter.
     *
     * @param parameter        Parameter
     * @return string example
     */
    public String getParameterExampleValue(Parameter parameter) {
        if (parameter.getExample() != null) {
            return parameter.getExample().toString();
        }

        if (parameter.getExamples() != null && !parameter.getExamples().isEmpty()) {
            Example example = parameter.getExamples().values().iterator().next();
            if (example.getValue() != null) {
                return example.getValue().toString();
            }
        }

        Schema schema = parameter.getSchema();
        if (schema != null && schema.getExample() != null) {
            return schema.getExample().toString();
        }

        if (parameter.getExtensions() != null && parameter.getExtensions().containsKey("x-example")) {
            return Json.pretty(parameter.getExtensions().get("x-example"));
        }
        return null;
    }

    /**
     * Return the example value of the property
     *
     * @param schema Property schema
     * @return string presentation of the example value of the property
     */
    public String toExampleValue(Schema schema) {
        if (schema.getExample() != null) {
            return schema.getExample().toString();
        }

        return getPropertyDefaultValue(schema);
    }

    /**
     * Return the default value of the property
     * <p>
     * Return null if you do NOT want a default value.
     * Any non-null value will cause {{#defaultValue} check to pass.
     *
     * @param schema Property schema
     * @return string presentation of the default value of the property
     */
    @SuppressWarnings("static-method")
    public String toDefaultValue(Schema schema) {
        if (schema.getDefault() != null) {
            return schema.getDefault().toString();
        }

        return getPropertyDefaultValue(schema);
    }

    /**
     * Return property value depending on property type.
     *
     * @param schema property type
     * @return property value
     */
    @SuppressWarnings("squid:S3923")
    private String getPropertyDefaultValue(Schema schema) {
        /*
         * Although all branches return null, this is left intentionally as examples for new contributors
         */
        if (ModelUtils.isBooleanSchema(schema)) {
            return "null";
        } else if (ModelUtils.isDateSchema(schema)) {
            return "null";
        } else if (ModelUtils.isDateTimeSchema(schema)) {
            return "null";
        } else if (ModelUtils.isNumberSchema(schema)) {
            return "null";
        } else if (ModelUtils.isIntegerSchema(schema)) {
            return "null";
        } else if (ModelUtils.isStringSchema(schema)) {
            return "null";
        } else if (ModelUtils.isObjectSchema(schema)) {
            return "null";
        } else {
            return "null";
        }
    }

    protected Schema<?> getSchemaItems(ArraySchema schema) {
        Schema<?> items = schema.getItems();
        if (items == null) {
            LOGGER.error("Undefined array inner type for `{}`. Default to String.", schema.getName());
            items = new StringSchema().description("TODO default missing array inner type to string");
            schema.setItems(items);
        }
        return items;
    }

    /**
     * Return the name of the 'allOf' composed schema.
     *
     * @param names          List of names
     * @param composedSchema composed schema
     * @return name of the allOf schema
     */
    @SuppressWarnings("static-method")
    public String toAllOfName(List<String> names, ComposedSchema composedSchema) {
        Map<String, Object> exts = composedSchema.getExtensions();
        if (exts != null && exts.containsKey("x-all-of-name")) {
            return (String) exts.get("x-all-of-name");
        }
        if (names.size() == 0) {
            LOGGER.error("allOf has no member defined: {}. Default to ERROR_ALLOF_SCHEMA", composedSchema);
            return "ERROR_ALLOF_SCHEMA";
        } else if (names.size() == 1) {
            return names.get(0);
        } else {
            LOGGER.warn("allOf with multiple schemas defined. Using only the first one: {}", names.get(0));
            return names.get(0);
        }
    }

    /**
     * Return the name of the anyOf schema
     *
     * @param names          List of names
     * @param composedSchema composed schema
     * @return name of the anyOf schema
     */
    @SuppressWarnings("static-method")
    public String toAnyOfName(List<String> names, ComposedSchema composedSchema) {
        return "anyOf<" + String.join(",", names) + ">";
    }

    /**
     * Return the name of the oneOf schema.
     * <p>
     * This name is used to set the value of CodegenSchema.openApiType.
     * <p>
     * If the 'x-one-of-name' extension is specified in the OAS document, return that value.
     * Otherwise, a name is constructed by creating a comma-separated list of all the names
     * of the oneOf schemas.
     *
     * @param names          List of names
     * @param composedSchema composed schema
     * @return name of the oneOf schema
     */
    @SuppressWarnings("static-method")
    public String toOneOfName(List<String> names, ComposedSchema composedSchema) {
        Map<String, Object> exts = composedSchema.getExtensions();
        if (exts != null && exts.containsKey("x-one-of-name")) {
            return (String) exts.get("x-one-of-name");
        }
        return "oneOf<" + String.join(",", names) + ">";
    }

    /**
     * Return the OAI type (e.g. integer, long, etc) corresponding to a schema.
     * <pre>$ref</pre> is not taken into account by this method.
     * <p>
     * If the schema is free-form (i.e. 'type: object' with no properties) or inline
     * schema, the returned OAI type is 'object'.
     *
     * @param schema
     */
    private String getPrimitiveType(Schema schema) {
        if (schema == null) {
            throw new RuntimeException("schema cannot be null in getPrimitiveType");
        } else if (typeMapping.containsKey(schema.getType() + "+" + schema.getFormat())) {
            // allows custom type_format mapping.
            // use {type}+{format}
            return typeMapping.get(schema.getType() + "+" + schema.getFormat());
        } else if (ModelUtils.isNullType(schema)) {
            // The 'null' type is allowed in OAS 3.1 and above. It is not supported by OAS 3.0.x,
            // though this tooling supports it.
            return "null";
        } else if (ModelUtils.isDecimalSchema(schema)) {
            // special handle of type: string, format: number
            return "decimal";
        } else if (ModelUtils.isByteArraySchema(schema)) {
            return "ByteArray";
        } else if (ModelUtils.isFileSchema(schema)) {
            return "file";
        } else if (ModelUtils.isBinarySchema(schema)) {
            return SchemaTypeUtil.BINARY_FORMAT;
        } else if (ModelUtils.isBooleanSchema(schema)) {
            return SchemaTypeUtil.BOOLEAN_TYPE;
        } else if (ModelUtils.isDateSchema(schema)) {
            return SchemaTypeUtil.DATE_FORMAT;
        } else if (ModelUtils.isDateTimeSchema(schema)) {
            return "DateTime";
        } else if (ModelUtils.isNumberSchema(schema)) {
            if (schema.getFormat() == null) { // no format defined
                return "number";
            } else if (ModelUtils.isFloatSchema(schema)) {
                return SchemaTypeUtil.FLOAT_FORMAT;
            } else if (ModelUtils.isDoubleSchema(schema)) {
                return SchemaTypeUtil.DOUBLE_FORMAT;
            } else {
                LOGGER.warn("Unknown `format` {} detected for type `number`. Defaulting to `number`", schema.getFormat());
                return "number";
            }
        } else if (ModelUtils.isIntegerSchema(schema)) {
            if (ModelUtils.isLongSchema(schema)) {
                return "long";
            } else {
                return schema.getType(); // integer
            }
        } else if (ModelUtils.isMapSchema(schema)) {
            return "map";
        } else if (ModelUtils.isArraySchema(schema)) {
            if (ModelUtils.isSet(schema)) {
                return "set";
            } else {
                return "array";
            }
        } else if (ModelUtils.isUUIDSchema(schema)) {
            return "UUID";
        } else if (ModelUtils.isURISchema(schema)) {
            return "URI";
        } else if (ModelUtils.isStringSchema(schema)) {
            if (typeMapping.containsKey(schema.getFormat())) {
                // If the format matches a typeMapping (supplied with the --typeMappings flag)
                // then treat the format as a primitive type.
                // This allows the typeMapping flag to add a new custom type which can then
                // be used in the format field.
                return schema.getFormat();
            }
            return "string";
        } else if (schema.getProperties() != null && !schema.getProperties().isEmpty()) { // having property implies it's a model
            return "object";
        } else if (ModelUtils.isAnyType(schema)) {
            return "AnyType";
        } else if (StringUtils.isNotEmpty(schema.getType())) {
            if (!schemaMapping.containsKey(schema.getType())) {
                LOGGER.warn("Unknown type found in the schema: {}. To map it, please use the schema mapping option (e.g. --schema-mappings in CLI)", schema.getType());
            }
            return schema.getType();
        }
        // The 'type' attribute has not been set in the OAS schema, which means the value
        // can be an arbitrary type, e.g. integer, string, object, array, number...
        // TODO: we should return a different value to distinguish between free-form object
        // and arbitrary type.
        return "object";
    }

    /**
     * Return the lowerCamelCase of the string
     *
     * @param name string to be lowerCamelCased
     * @return lowerCamelCase string
     */
    @SuppressWarnings("static-method")
    public String lowerCamelCase(String name) {
        return (name.length() > 0) ? (Character.toLowerCase(name.charAt(0)) + name.substring(1)) : "";
    }

    /**
     * Determine the type alias for the given type if it exists. This feature
     * was originally developed for Java because the language does not have an aliasing
     * mechanism of its own but later extends to handle other languages
     *
     * @param name The type name.
     * @return The alias of the given type, if it exists. If there is no alias
     * for this type, then returns the input type name.
     */
    public String getAlias(String name) {
        if (typeAliases != null && typeAliases.containsKey(name)) {
            return typeAliases.get(name);
        }
        return name;
    }

    /**
     * Output the API (class) name (capitalized) ending with the specified or default suffix
     * Return DefaultApi if name is empty
     *
     * @param name the name of the Api
     * @return capitalized Api name
     */
    @Override
    public String toApiName(String name) {
        if (name.length() == 0) {
            return "DefaultApi";
        }
        return org.openapijsonschematools.codegen.utils.StringUtils.camelize(apiNamePrefix + "_" + name + "_" + apiNameSuffix);
    }

    /**
     * Converts the OpenAPI schema name to a model name suitable for the current code generator.
     * May be overridden for each programming language.
     * In case the name belongs to the TypeSystem it won't be renamed.
     *
     * @param name the name of the model
     * @return capitalized model name
     */
    @Override
    public String toModelName(final String name) {
        if (schemaKeyToModelNameCache.containsKey(name)) {
            return schemaKeyToModelNameCache.get(name);
        }

        String camelizedName = org.openapijsonschematools.codegen.utils.StringUtils.camelize(modelNamePrefix + "_" + name + "_" + modelNameSuffix);
        schemaKeyToModelNameCache.put(name, camelizedName);
        return camelizedName;
    }

    private static class CodegenSchemaCacheKey {
        private CodegenSchemaCacheKey(String sourceJsonPath, String currentJsonPath) {
            this.sourceJsonPath = sourceJsonPath;
            this.currentJsonPath = currentJsonPath;
        }

        private String sourceJsonPath;
        private String currentJsonPath;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CodegenSchemaCacheKey that = (CodegenSchemaCacheKey) o;
            return Objects.equals(sourceJsonPath, that.sourceJsonPath) &&
                    Objects.equals(currentJsonPath, that.currentJsonPath);
        }

        @Override
        public int hashCode() {
            return Objects.hash(sourceJsonPath, currentJsonPath);
        }
    }

    Map<CodegenSchemaCacheKey, CodegenSchema> codegenSchemaCache = new HashMap<>();
    // json path to instance
    Map<String, CodegenResponse> codegenResponseCache = new HashMap<>();
    Map<String, CodegenHeader> codegenHeaderCache = new HashMap<>();
    Map<String, CodegenRequestBody> codegenRequestBodyCache = new HashMap<>();

    Map<String, CodegenParameter> codegenParameterCache = new HashMap<>();
    private CodegenSchema requiredAddPropUnsetSchema = fromSchema(new Schema(), null, null);

    protected void updateModelForComposedSchema(CodegenSchema m, Schema schema, String sourceJsonPath) {
        final ComposedSchema composed = (ComposedSchema) schema;

        // TODO revise the logic below to set discriminator
        if (composed.getAllOf() != null) {
            int modelImplCnt = 0; // only one inline object allowed in a ComposedModel
            int modelDiscriminators = 0; // only one discriminator allowed in a ComposedModel
            for (Schema innerSchema : composed.getAllOf()) { // TODO need to work with anyOf, oneOf as well
                if (m.discriminator == null && innerSchema.getDiscriminator() != null) {
                    LOGGER.debug("discriminator is set to null (not correctly set earlier): {}", m.jsonPathPiece);
                    m.discriminator = createDiscriminator(m.jsonPathPiece.original, innerSchema, this.openAPI, sourceJsonPath);
                    modelDiscriminators++;
                }

                if (modelDiscriminators > 1) {
                    LOGGER.error("Allof composed schema is inheriting >1 discriminator. Only use one discriminator: {}", composed);
                }

                if (modelImplCnt++ > 1) {
                    LOGGER.warn("More than one inline schema specified in allOf:. Only the first one is recognized. All others are ignored.");
                    break; // only one schema with discriminator allowed in allOf
                }
            }
        }
    }

    protected String toTestCaseName(String specTestCaseName) {
        return specTestCaseName;
    }

    /**
     * A method that allows generators to pre-process test example payloads
     * This can be useful if one needs to change how values like null in string are represnted
     * @param data the test data payload
     * @return the updated test data payload
     */
    protected Object processTestExampleData(Object data) {
        return data;
    }

    protected EnumValue toEnumValue(Object value, String description) {
        Object usedValue = value;
        String type = null;
        if (value instanceof Integer){
            type = "integer";
        } else if (value instanceof Double || value instanceof Float || value instanceof BigDecimal){
            type = "number";
        } else if (value instanceof String) {
            type = "string";
        } else if (value instanceof LinkedHashMap) {
            LinkedHashMap<String, EnumValue> castMap = new LinkedHashMap<>();
            for (Map.Entry entry: ((LinkedHashMap<String, Object>) value).entrySet()) {
                String entryKey = (String) entry.getKey();
                Object entryValue = entry.getValue();
                EnumValue castValue = toEnumValue(entryValue, null);
                castMap.put(entryKey, castValue);
            }
            type = "object";
            usedValue = castMap;
        } else if (value instanceof ArrayList) {
            ArrayList<EnumValue> castList = new ArrayList<>();
            for (Object item: (ArrayList<Object>) value) {
                EnumValue castItem = toEnumValue(item, null);
                castList.add(castItem);
            }
            type = "array";
            usedValue = castList;
        } else if (value instanceof Boolean) {
            type = "boolean";
        } else if (value == null) {
            type = "null";
        }
        return new EnumValue(usedValue, type, description);
    }

    /**
     * Processes any test cases if they exist in the components.x-test-examples vendor extensions
     * If they exist then cast them to java class instances and return them back in a map
     * @param refToTestCases the component schema name that the test cases are for
     */
    private HashMap<String, SchemaTestCase> extractSchemaTestCases(String refToTestCases) {
        // schemaName to a map of test case name to test case
        HashMap<String, Object> vendorExtensions = (HashMap<String, Object>) openAPI.getComponents().getExtensions();
        if (vendorExtensions ==  null || !vendorExtensions.containsKey(xSchemaTestExamplesKey)) {
            return null;
        }
        if (!refToTestCases.startsWith(xSchemaTestExamplesRefPrefix)) {
            return null;
        }
        String schemaName = refToTestCases.substring(xSchemaTestExamplesRefPrefix.length());
        HashMap<String, SchemaTestCase> schemaTestCases = new HashMap<>();
        LinkedHashMap<String, Object> schemaNameToTestCases = (LinkedHashMap<String, Object>) vendorExtensions.get(xSchemaTestExamplesKey);

        if (!schemaNameToTestCases.containsKey(schemaName)) {
            return null;
        }
        LinkedHashMap<String, LinkedHashMap<String, Object>> testNameToTesCase = (LinkedHashMap<String, LinkedHashMap<String, Object>>) schemaNameToTestCases.get(schemaName);
        for (Entry<String, LinkedHashMap<String, Object>> entry: testNameToTesCase.entrySet()) {
            LinkedHashMap<String, Object> testExample = (LinkedHashMap<String, Object>) entry.getValue();
            String nameInSnakeCase = toTestCaseName(entry.getKey());
            Object data = processTestExampleData(testExample.get("data"));
            SchemaTestCase testCase = new SchemaTestCase(
                    (String) testExample.getOrDefault("description", ""),
                    toEnumValue(data, null),
                    (boolean) testExample.get("valid")
            );
            schemaTestCases.put(nameInSnakeCase, testCase);
        }
        return schemaTestCases;
    }

    protected String toComponentModule(String componentName, String priorJsonPathSegment) {
        return packageName + "." + priorJsonPathSegment + "." + componentName;
    }

    protected CodegenSchema getAdditionalProperties(Schema schema, String sourceJsonPath, String currentJsonPath) {
        if (schema.getAdditionalProperties() == null) {
            return null;
        }
        String additonalPropertiesJsonPath = currentJsonPath + "/additionalProperties";
        if (schema.getAdditionalProperties() instanceof Boolean) {
            Schema usedSchema = getSchemaFromBooleanOrSchema(schema.getAdditionalProperties());
            return fromSchema(usedSchema, sourceJsonPath, additonalPropertiesJsonPath);
        } else {
            return fromSchema((Schema) schema.getAdditionalProperties(), sourceJsonPath, additonalPropertiesJsonPath);
        }
    }

    /**
     * Recursively look in Schema sc for the discriminator discPropName
     * and return a CodegenSchema with the dataType and required params set
     * the returned CodegenSchema may not be required and it may not be of type string
     *
     * @param composedSchemaName The name of the sc Schema
     * @param sc                 The Schema that may contain the discriminator
     * @param discPropName       The String that is the discriminator propertyName in the schema
     */
    private CodegenSchema discriminatorFound(String composedSchemaName, Schema sc, String discPropName, OpenAPI openAPI) {
        Schema refSchema = ModelUtils.getReferencedSchema(openAPI, sc);
        if (refSchema.getProperties() != null && refSchema.getProperties().get(discPropName) != null) {
            Schema discSchema = (Schema) refSchema.getProperties().get(discPropName);
            CodegenSchema cp = new CodegenSchema();
            return cp;
        }
        if (ModelUtils.isComposedSchema(refSchema)) {
            ComposedSchema composedSchema = (ComposedSchema) refSchema;
            if (composedSchema.getAllOf() != null) {
                // If our discriminator is in one of the allOf schemas break when we find it
                for (Schema allOf : composedSchema.getAllOf()) {
                    CodegenSchema cp = discriminatorFound(composedSchemaName, allOf, discPropName, openAPI);
                    if (cp != null) {
                        return cp;
                    }
                }
            }
            if (composedSchema.getOneOf() != null && composedSchema.getOneOf().size() != 0) {
                // All oneOf definitions must contain the discriminator
                CodegenSchema cp = new CodegenSchema();
                for (Schema oneOf : composedSchema.getOneOf()) {
                    String modelName = ModelUtils.getSimpleRef(oneOf.get$ref());
                    CodegenSchema thisCp = discriminatorFound(composedSchemaName, oneOf, discPropName, openAPI);
                    if (thisCp == null) {
                        LOGGER.warn(
                                "'{}' defines discriminator '{}', but the referenced OneOf schema '{}' is missing {}",
                                composedSchemaName, discPropName, modelName, discPropName);
                    }
                    if (cp != null && cp.refInfo == null) {
                        cp = thisCp;
                        continue;
                    }
                    if (cp != thisCp) {
                        LOGGER.warn(
                                "'{}' defines discriminator '{}', but the OneOf schema '{}' has a different {} definition than the prior OneOf schema's. Make sure the {} type and required values are the same",
                                composedSchemaName, discPropName, modelName, discPropName, discPropName);
                    }
                }
                return cp;
            }
            if (composedSchema.getAnyOf() != null && composedSchema.getAnyOf().size() != 0) {
                // All anyOf definitions must contain the discriminator because a min of one must be selected
                CodegenSchema cp = new CodegenSchema();
                for (Schema anyOf : composedSchema.getAnyOf()) {
                    String modelName = ModelUtils.getSimpleRef(anyOf.get$ref());
                    CodegenSchema thisCp = discriminatorFound(composedSchemaName, anyOf, discPropName, openAPI);
                    if (thisCp == null) {
                        LOGGER.warn(
                                "'{}' defines discriminator '{}', but the referenced AnyOf schema '{}' is missing {}",
                                composedSchemaName, discPropName, modelName, discPropName);
                    }
                    if (cp != null && cp.refInfo == null) {
                        cp = thisCp;
                        continue;
                    }
                    if (cp != thisCp) {
                        LOGGER.warn(
                                "'{}' defines discriminator '{}', but the AnyOf schema '{}' has a different {} definition than the prior AnyOf schema's. Make sure the {} type and required values are the same",
                                composedSchemaName, discPropName, modelName, discPropName, discPropName);
                    }
                }
                return cp;

            }
        }
        return null;
    }

    /**
     * Recursively look in Schema sc for the discriminator and return it
     * Schema sc location
     * OpenAPI openAPI the spec where we are searching for the discriminator
     *
     * @param sc The Schema that may contain the discriminator
     */
    private Discriminator recursiveGetDiscriminator(Schema sc, OpenAPI openAPI) {
        Schema refSchema = ModelUtils.getReferencedSchema(openAPI, sc);
        Discriminator foundDisc = refSchema.getDiscriminator();
        if (foundDisc != null) {
            return foundDisc;
        }

        if (this.getLegacyDiscriminatorBehavior()) {
            return null;
        }
        Discriminator disc = new Discriminator();
        if (ModelUtils.isComposedSchema(refSchema)) {
            ComposedSchema composedSchema = (ComposedSchema) refSchema;
            if (composedSchema.getAllOf() != null) {
                // If our discriminator is in one of the allOf schemas break when we find it
                for (Schema allOf : composedSchema.getAllOf()) {
                    foundDisc = recursiveGetDiscriminator(allOf, openAPI);
                    if (foundDisc != null) {
                        disc.setPropertyName(foundDisc.getPropertyName());
                        disc.setMapping(foundDisc.getMapping());
                        return disc;
                    }
                }
            }
            if (composedSchema.getOneOf() != null && composedSchema.getOneOf().size() != 0) {
                // All oneOf definitions must contain the discriminator
                Integer hasDiscriminatorCnt = 0;
                Integer hasNullTypeCnt = 0;
                Set<String> discriminatorsPropNames = new HashSet<>();
                for (Schema oneOf : composedSchema.getOneOf()) {
                    if (ModelUtils.isNullType(oneOf)) {
                        // The null type does not have a discriminator. Skip.
                        hasNullTypeCnt++;
                        continue;
                    }
                    foundDisc = recursiveGetDiscriminator(oneOf, openAPI);
                    if (foundDisc != null) {
                        discriminatorsPropNames.add(foundDisc.getPropertyName());
                        hasDiscriminatorCnt++;
                    }
                }
                if (discriminatorsPropNames.size() > 1) {
                    LOGGER.warn("The oneOf schemas have conflicting discriminator property names. " +
                            "oneOf schemas must have the same property name, but found " + String.join(", ", discriminatorsPropNames));
                }
                if (foundDisc != null && (hasDiscriminatorCnt + hasNullTypeCnt) == composedSchema.getOneOf().size() && discriminatorsPropNames.size() == 1) {
                    disc.setPropertyName(foundDisc.getPropertyName());
                    disc.setMapping(foundDisc.getMapping());
                    return disc;
                }
                // If the scenario when oneOf has two children and one of them is the 'null' type,
                // there is no need for a discriminator.
            }
            if (composedSchema.getAnyOf() != null && composedSchema.getAnyOf().size() != 0) {
                // All anyOf definitions must contain the discriminator because a min of one must be selected
                Integer hasDiscriminatorCnt = 0;
                Integer hasNullTypeCnt = 0;
                Set<String> discriminatorsPropNames = new HashSet<>();
                for (Schema anyOf : composedSchema.getAnyOf()) {
                    if (ModelUtils.isNullType(anyOf)) {
                        // The null type does not have a discriminator. Skip.
                        hasNullTypeCnt++;
                        continue;
                    }
                    foundDisc = recursiveGetDiscriminator(anyOf, openAPI);
                    if (foundDisc != null) {
                        discriminatorsPropNames.add(foundDisc.getPropertyName());
                        hasDiscriminatorCnt++;
                    }
                }
                if (discriminatorsPropNames.size() > 1) {
                    LOGGER.warn("The anyOf schemas have conflicting discriminator property names. " +
                            "anyOf schemas must have the same property name, but found " + String.join(", ", discriminatorsPropNames));
                }
                if (foundDisc != null && (hasDiscriminatorCnt + hasNullTypeCnt) == composedSchema.getAnyOf().size() && discriminatorsPropNames.size() == 1) {
                    disc.setPropertyName(foundDisc.getPropertyName());
                    disc.setMapping(foundDisc.getMapping());
                    return disc;
                }
                // If the scenario when anyOf has two children and one of them is the 'null' type,
                // there is no need for a discriminator.
            }
        }
        return null;
    }

    /**
     * This function is only used for composed schemas which have a discriminator
     * Process oneOf and anyOf models in a composed schema and adds them into
     * a list if the oneOf and anyOf models contain
     * the required discriminator. If they don't contain the required
     * discriminator or the discriminator is the wrong type then an error is
     * thrown
     *
     * @param composedSchemaName The String model name of the composed schema where we are setting the discriminator map
     * @param discPropName       The String that is the discriminator propertyName in the schema
     * @param c                  The ComposedSchema that contains the discriminator and oneOf/anyOf schemas
     * @param openAPI            The OpenAPI spec that we are using
     * @param sourceJsonPath     The json path location being examined
     * @return the list of oneOf and anyOf MappedModel that need to be added to the discriminator map
     */
    protected List<MappedModel> getOneOfAnyOfDescendants(String composedSchemaName, String discPropName, ComposedSchema c, OpenAPI openAPI, String sourceJsonPath) {
        ArrayList<List<Schema>> listOLists = new ArrayList<>();
        listOLists.add(c.getOneOf());
        listOLists.add(c.getAnyOf());
        List<MappedModel> descendentSchemas = new ArrayList<>();
        for (List<Schema> schemaList : listOLists) {
            if (schemaList == null) {
                continue;
            }
            for (Schema sc : schemaList) {
                if (ModelUtils.isNullType(sc)) {
                    continue;
                }
                String ref = sc.get$ref();
                if (ref == null) {
                    // for schemas with no ref, it is not possible to build the discriminator map
                    // because ref is how we get the model name
                    // we only hit this use case for a schema with inline composed schemas, and one of those
                    // schemas also has inline composed schemas
                    // Note: if it is only inline one level, then the inline model resolver will move it into its own
                    // schema and make it a $ref schema in the oneOf/anyOf location
                    LOGGER.warn(
                            "Invalid inline schema defined in oneOf/anyOf in '{}'. Per the OpenApi spec, for this case when a composed schema defines a discriminator, the oneOf/anyOf schemas must use $ref. Change this inline definition to a $ref definition",
                            composedSchemaName);
                }
                CodegenSchema df = discriminatorFound(composedSchemaName, sc, discPropName, openAPI);
                String modelName = ModelUtils.getSimpleRef(ref);
                if (df == null || df.types != null && !df.types.contains("string")) {
                    String msgSuffix = "";
                    if (df == null) {
                        msgSuffix += discPropName + " is missing from the schema, define it as required and type string";
                    } else {
                        if (df.types != null && !df.types.contains("string")) {
                            msgSuffix += "invalid type for " + discPropName + ", set it to string";
                        }
                    }
                    LOGGER.warn("'{}' defines discriminator '{}', but the referenced schema '{}' is incorrect. {}",
                            composedSchemaName, discPropName, modelName, msgSuffix);
                }
                MappedModel mm = new MappedModel(modelName, getRefClassWithModule("#/components/schemas/" + modelName, sourceJsonPath, "schemas"));
                descendentSchemas.add(mm);
                Schema cs = ModelUtils.getSchema(openAPI, modelName);
                if (cs == null) { // cannot lookup the model based on the name
                    LOGGER.error("Failed to lookup the schema '{}' when processing oneOf/anyOf. Please check to ensure it's defined properly.", modelName);
                } else {
                    Map<String, Object> vendorExtensions = cs.getExtensions();
                    if (vendorExtensions != null && !vendorExtensions.isEmpty() && vendorExtensions.containsKey("x-discriminator-value")) {
                        String xDiscriminatorValue = (String) vendorExtensions.get("x-discriminator-value");
                        mm = new MappedModel(xDiscriminatorValue, getRefClassWithModule("#/components/schemas/" + modelName, sourceJsonPath, "schemas"));
                        descendentSchemas.add(mm);
                    }
                }
            }
        }
        return descendentSchemas;
    }

    protected List<MappedModel> getAllOfDescendants(String thisSchemaName, OpenAPI openAPI, String sourceJsonPath) {
        ArrayList<String> queue = new ArrayList();
        List<MappedModel> descendentSchemas = new ArrayList();
        Map<String, Schema> schemas = ModelUtils.getSchemas(openAPI);
        String currentSchemaName = thisSchemaName;
        Set<String> keys = schemas.keySet();

        int count = 0;
        // hack: avoid infinite loop on potential self-references in event our checks fail.
        while (100000 > count++) {
            for (String childName : keys) {
                if (childName.equals(thisSchemaName)) {
                    // skip the source schema
                    continue;
                }
                Schema child = schemas.get(childName);
                if (ModelUtils.isComposedSchema(child)) {
                    ComposedSchema composedChild = (ComposedSchema) child;
                    List<Schema> parents = composedChild.getAllOf();
                    if (parents != null) {
                        for (Schema parent : parents) {
                            String ref = parent.get$ref();
                            if (ref == null) {
                                // for schemas with no ref, it is not possible to build the discriminator map
                                // because ref is how we get the model name
                                // we hit this use case when an allOf composed schema contains an inline schema
                                continue;
                            }
                            String parentName = ModelUtils.getSimpleRef(ref);
                            if (parentName != null && parentName.equals(currentSchemaName)) {
                                if (queue.contains(childName) || descendentSchemas.stream().anyMatch(i -> childName.equals(i.mappingName))) {
                                    throw new RuntimeException("Stack overflow hit when looking for " + thisSchemaName + " an infinite loop starting and ending at " + childName + " was seen");
                                }
                                queue.add(childName);
                                break;
                            }
                        }
                    }
                }
            }
            if (queue.size() == 0) {
                break;
            }
            currentSchemaName = queue.remove(0);
            MappedModel mm = new MappedModel(currentSchemaName, getRefClassWithModule("#/components/schemas/" + currentSchemaName, sourceJsonPath, "schemas"));
            descendentSchemas.add(mm);
            Schema cs = schemas.get(currentSchemaName);
            Map<String, Object> vendorExtensions = cs.getExtensions();
            if (vendorExtensions != null && !vendorExtensions.isEmpty() && vendorExtensions.containsKey("x-discriminator-value")) {
                String xDiscriminatorValue = (String) vendorExtensions.get("x-discriminator-value");
                mm = new MappedModel(xDiscriminatorValue, getRefClassWithModule("#/components/schemas/" + currentSchemaName, sourceJsonPath, "schemas"));
                descendentSchemas.add(mm);
            }
        }
        return descendentSchemas;
    }

    protected String getRefClassWithModule(String ref, String sourceJsonPath, String expectedComponentType) {
        String refClass = toRefClass(ref, sourceJsonPath, expectedComponentType);
        return refClass;
    }

    protected CodegenDiscriminator createDiscriminator(String schemaName, Schema schema, OpenAPI openAPI, String sourceJsonPath) {
        Discriminator sourceDiscriminator = recursiveGetDiscriminator(schema, openAPI);
        if (sourceDiscriminator == null) {
            return null;
        }
        String discPropName = sourceDiscriminator.getPropertyName();
        String propertyName = toVarName(discPropName);
        String propertyBaseName = sourceDiscriminator.getPropertyName();
        Map<String, String> mapping = sourceDiscriminator.getMapping();

        TreeSet<MappedModel> mappedModels = new TreeSet<>();
        if (sourceDiscriminator.getMapping() != null && !sourceDiscriminator.getMapping().isEmpty()) {
            for (Entry<String, String> e : sourceDiscriminator.getMapping().entrySet()) {
                String name;
                String value = e.getValue();
                String modelName = null;
                if (value.indexOf('/') >= 0) {
                    name = ModelUtils.getSimpleRef(value);
                    if (ModelUtils.getSchema(openAPI, name) == null) {
                        LOGGER.error("Failed to lookup the schema '{}' when processing the discriminator mapping of oneOf/anyOf. Please check to ensure it's defined properly.", name);
                    } else {
                        modelName = getRefClassWithModule(e.getValue(), sourceJsonPath, "schemas");
                    }
                } else {
                    String ref = "#/components/schemas/" + value;
                    modelName = getRefClassWithModule(ref, sourceJsonPath, "schemas");
                }
                if (modelName != null) {
                    mappedModels.add(new MappedModel(e.getKey(), modelName));
                }
            }
        }

        boolean legacyUseCase = (this.getLegacyDiscriminatorBehavior() && mappedModels.isEmpty());
        if (!this.getLegacyDiscriminatorBehavior() || legacyUseCase) {
            // for schemas that allOf inherit from this schema, add those descendants to this discriminator map
            List<MappedModel> otherDescendants = getAllOfDescendants(schemaName, openAPI, sourceJsonPath);
            for (MappedModel otherDescendant : otherDescendants) {
                // add only if the mapping names are not the same
                boolean matched = false;
                for (MappedModel uniqueDescendant : mappedModels) {
                    if (uniqueDescendant.mappingName.equals(otherDescendant.mappingName)) {
                        matched = true;
                        break;
                    }
                }

                if (matched == false) {
                    mappedModels.add(otherDescendant);
                }
            }
        }
        // if there are composed oneOf/anyOf schemas, add them to this discriminator
        if (ModelUtils.isComposedSchema(schema) && !this.getLegacyDiscriminatorBehavior()) {
            List<MappedModel> otherDescendants = getOneOfAnyOfDescendants(schemaName, discPropName, (ComposedSchema) schema, openAPI, sourceJsonPath);
            for (MappedModel otherDescendant : otherDescendants) {
                if (!mappedModels.contains(otherDescendant)) {
                    mappedModels.add(otherDescendant);
                }
            }
        }
        CodegenDiscriminator discriminator = new CodegenDiscriminator(propertyName, propertyBaseName, mapping, mappedModels);

        return discriminator;
    }

    protected boolean isValid(String name) {
        return !isReservedWord(name);
    }

    protected String getImport(CodegenRefInfo refInfo) {
        String prefix = "from " + packageName + ".components.";
        if (refInfo.ref instanceof CodegenRequestBody) {
            return prefix + "request_bodies import " + refInfo.refModule;
        } else if (refInfo.ref instanceof CodegenHeader) {
            return prefix + "headers import " + refInfo.refModule;
        } else if (refInfo.ref instanceof CodegenResponse) {
            return prefix + "responses import " + refInfo.refModule;
        } else if (refInfo.ref instanceof CodegenParameter) {
            return prefix + "parameters import " + refInfo.refModule;
        }
        return null;
    }

    protected String getImport(String className, CodegenSchema schema) {
        if (className == null) {
            return schema.refInfo.refClass;
        }
        return className;
    }

    /**
     * Recursively collect all necessary imports to include so that the type may be resolved.
     *
     * @param featureSet the generator feature set, used to determine if composed schemas should be added
     * @return all of the imports
     */
    private Set<String> getImports(CodegenSchema schema, FeatureSet featureSet) {
        Set<String> imports = new HashSet<>();
        if (schema.discriminator != null && schema.discriminator.mappedModels != null) {
            CodegenDiscriminator disc = schema.discriminator;
            for (CodegenDiscriminator.MappedModel mm : disc.mappedModels) {
                if (!"".equals(mm.modelName)) {
                    String complexType = mm.modelName;
                    if (shouldAddImport(complexType)) {
                        imports.add(getImport(complexType, null));
                    }
                }
            }
        }
        if (schema.allOf != null || schema.anyOf != null || schema.oneOf != null || schema.not != null) {
            List<CodegenSchema> allOfs = Collections.emptyList();
            List<CodegenSchema> oneOfs = Collections.emptyList();
            List<CodegenSchema> anyOfs = Collections.emptyList();
            List<CodegenSchema> nots = Collections.emptyList();
            if (schema.allOf != null && featureSet.getSchemaSupportFeatures().contains(SchemaSupportFeature.allOf)) {
                allOfs = schema.allOf;
            }
            if (schema.oneOf != null && featureSet.getSchemaSupportFeatures().contains(SchemaSupportFeature.oneOf)) {
                oneOfs = schema.oneOf;
            }
            if (schema.anyOf != null && featureSet.getSchemaSupportFeatures().contains(SchemaSupportFeature.anyOf)) {
                anyOfs = schema.anyOf;
            }
            if (schema.not != null && featureSet.getSchemaSupportFeatures().contains(SchemaSupportFeature.not)) {
                nots = Arrays.asList(schema.not);
            }
            Stream<CodegenSchema> allSchemas = Stream.of(
                    allOfs.stream(), anyOfs.stream(), oneOfs.stream(), nots.stream()).flatMap(i -> i);
            for (CodegenSchema cs: allSchemas.collect(Collectors.toList())) {
                imports.addAll(getImports(cs, featureSet));
            }
        }
        // items can exist for AnyType and type array
        if (schema.items != null && schema.types != null && schema.types.contains("array")) {
            imports.addAll(getImports(schema.items, featureSet));
        }
        // additionalProperties can exist for AnyType and type object
        if (schema.additionalProperties != null) {
            imports.addAll(getImports(schema.additionalProperties, featureSet));
        }
        // vars can exist for AnyType and type object
        if (schema.properties != null && !schema.properties.isEmpty()) {
            for (CodegenSchema cs: schema.properties.values()) {
                imports.addAll(getImports(cs, featureSet));
            }
        }
        // referenced or inline schemas
        if (schema.refInfo != null && schema.refInfo.refModule != null) {
            // self reference classes do not contain refModule
            imports.add(getImport(null, schema));
        }
        return imports;
    }

    private String getUsedName(String currentJsonPath) {
        String[] refPieces = currentJsonPath.split("/");
        if (refPieces.length >= 4) {
            // component schemas + proprties/items/additionalProperties use case
            String lastPathFragment = refPieces[refPieces.length-1];
            String usedName = lastPathFragment;
            if (refPieces.length >= 5) {
                // properties/items/additionalProperties use case
                // # components schemas someSchema additionalProperties/items
                if (!lastPathFragment.equals("schema")) {
                    try {
                        Integer.parseInt(usedName);
                        // for oneOf/anyOf/allOf
                        String priorFragment = refPieces[refPieces.length-2];
                        if ("allOf".equals(priorFragment) || "anyOf".equals(priorFragment) || "oneOf".equals(priorFragment)) {
                            usedName = refPieces[refPieces.length-2] + "_" + usedName;
                        }
                    } catch (NumberFormatException nfe) {
                        // any other case
                        ;
                    }
                }
            } else {
                // component schema use case
                // TODO set discriminator on any schema instances in the future not just these
                if (!currentJsonPath.startsWith("#/components/schemas/") || refPieces.length != 4) {
                    throw new RuntimeException("Invalid sourceJsonPath "+ currentJsonPath);
                }
            }
            return usedName;
        }
        return null;
    }

    protected LinkedHashSet<String> getTypes(Schema schema) {
        if (schema.getType() == null && schema.getTypes() == null) {
            return null;
        }
        LinkedHashSet<String> types = new LinkedHashSet<>();
        // TODO when does nullable False apply? Only AnyTypeSchema?
        // TODO limit this to v3-3.0.03 schemas only
        Boolean nullable = schema.getNullable();
        if (Boolean.TRUE.equals(nullable) && schema.get$ref() == null) {
            types.add("null");
        }
        if (schema.getType() != null) {
            types.add(schema.getType());
        }
        if (schema.getTypes() != null) {
            // NoneFrozenDictTupleStrDecimalBoolFileBytes
            if (types.contains("null")) {
                types.add("null");
            }
            if (types.contains("object")) {
                types.add("object");
            }
            if (types.contains("array")) {
                types.add("array");
            }
            if (types.contains("string")) {
                types.add("string");
            }
            if (types.contains("number")) {
                types.add("number");
            }
            if (types.contains("integer")) {
                types.add("integer");
            }
            if (types.contains("boolean")) {
                types.add("boolean");
            }
            // the above order used so mixins will stay the same
        }
        return types;
    }

    /**
     * Convert OAS Property object to Codegen Property object.
     * <p>
     * The return value is cached. An internal cache is looked up to determine
     * if the CodegenSchema return value has already been instantiated for
     * the (String name, Schema p) arguments.
     * Any subsequent processing of the CodegenSchema return value must be idempotent
     * for a given (String name, Schema schema).
     *
     * @param p        OAS property schema
     * @param sourceJsonPath the path when the schema started being created
     * @param currentJsonPath the current json path
     * @return Codegen Property object
     */
    public CodegenSchema fromSchema(Schema p, String sourceJsonPath, String currentJsonPath) {
        if (p == null) {
            LOGGER.error("Undefined property/schema at `{}`", currentJsonPath);
            return null;
        }
        LOGGER.debug("debugging fromSchema for {} {} : {}", sourceJsonPath, currentJsonPath, p);

        CodegenSchemaCacheKey ck = new CodegenSchemaCacheKey(sourceJsonPath, currentJsonPath);
        CodegenSchema property = codegenSchemaCache.computeIfAbsent(ck, s -> new CodegenSchema());

        String ref = p.get$ref();
        setSchemaLocationInfo(ref, sourceJsonPath, currentJsonPath, property);
        // put toExampleValue in a try-catch block to log the error as example values are not critical
        try {
            property.example = toExampleValue(p);
        } catch (Exception e) {
            LOGGER.error("Error in generating `example` for the property {}. Default to ERROR_TO_EXAMPLE_VALUE. Enable debugging for more info.", sourceJsonPath);
            LOGGER.debug("Exception from toExampleValue: {}", e.getMessage());
            property.example = "ERROR_TO_EXAMPLE_VALUE";
        }
        if (ref != null) {
            if (addSchemaImportsFromV3SpecLocations && sourceJsonPath != null && sourceJsonPath.equals(currentJsonPath)) {
                // import from $ref
                property.imports = new TreeSet<>();
                addImports(property.imports, getImports(property, generatorMetadata.getFeatureSet()));
            }
            // TODO with 3.1.0 schemas continue processing
            return property;
        }

        if (p.equals(trueSchema)) {
            property.isBooleanSchemaTrue = true;
        } else if (p.equals(falseSchema)) {
            property.isBooleanSchemaFalse = true;
        }
        property.enumNameToValue = getEnumNameToValue(p);
        property.type = p.getType();
        property.types = getTypes(p);

        ModelUtils.syncValidationProperties(p, property);
        property.format = p.getFormat();
        property.externalDocumentation = p.getExternalDocs();

        if (currentJsonPath != null) {
            String[] pathPieces = currentJsonPath.split("/");
            if (pathPieces.length >= 4) {
                // component schemas + proprties/items/additionalProperties use case
                String lastPathFragment = pathPieces[pathPieces.length-1];
                String usedName = getUsedName(currentJsonPath);
                if (pathPieces.length >= 5) {
                    // proprties/items/additionalProperties use case
                    // # components schemas someSchema additionalProperties/items
                    if (lastPathFragment.equals("additionalProperties")) {
                        String priorFragment = pathPieces[pathPieces.length-2];
                        if (!"properties".equals(priorFragment)) {
                            property.schemaIsFromAdditionalProperties = true;
                        }
                    }
                } else {
                    // component schema use case
                    // TODO set discriminator on any schema instances in the future not just these
                    if (!currentJsonPath.startsWith("#/components/schemas/") || pathPieces.length != 4) {
                        throw new RuntimeException("Invalid currentJsonPath "+ currentJsonPath);
                    }

                    property.discriminator = createDiscriminator(usedName, p, this.openAPI, currentJsonPath);
                    if (p instanceof ComposedSchema) {
                        updateModelForComposedSchema(property, p, currentJsonPath);
                    }

                    if (openAPI != null) {
                        HashMap<String, SchemaTestCase> schemaTestCases = extractSchemaTestCases(xSchemaTestExamplesRefPrefix + usedName);
                        property.testCases = schemaTestCases;
                    }

                }
            }
        }
        property.description = escapeText(p.getDescription());
        property.unescapedDescription = p.getDescription();
        property.title = p.getTitle();
        property.defaultValue = toDefaultValue(p);

        property.deprecated = p.getDeprecated();
        property.readOnly = p.getReadOnly();
        property.writeOnly = p.getWriteOnly();
        property.nullable = p.getNullable();

        CodegenXml xml = null;
        if (p.getXml() != null) {
            xml = new CodegenXml(
                    p.getXml().getName(),
                    p.getXml().getNamespace(),
                    p.getXml().getPrefix(),
                    p.getXml().getAttribute(),
                    p.getXml().getWrapped()
            );
        }
        property.xml = xml;
        if (p.getExtensions() != null && !p.getExtensions().isEmpty()) {
            property.vendorExtensions.putAll(p.getExtensions());
        }

        Schema notSchema = p.getNot();
        if (notSchema != null) {
            CodegenSchema notProperty = fromSchema(notSchema, sourceJsonPath, currentJsonPath + "/not");
            property.not = notProperty;
        }
        List<Schema> allOfs = p.getAllOf();
        if (allOfs != null && !allOfs.isEmpty()) {
            List<CodegenSchema> allOfProps = getComposedProperties(allOfs, "allOf", sourceJsonPath, currentJsonPath);
            property.allOf = allOfProps;
        }
        List<Schema> anyOfs = p.getAnyOf();
        if (anyOfs != null && !anyOfs.isEmpty()) {
            List<CodegenSchema> anyOfProps = getComposedProperties(anyOfs, "anyOf", sourceJsonPath, currentJsonPath);
            property.anyOf = anyOfProps;
        }
        List<Schema> oneOfs = p.getOneOf();
        if (oneOfs != null && !oneOfs.isEmpty()) {
            List<CodegenSchema> oneOfProps = getComposedProperties(oneOfs, "oneOf", sourceJsonPath, currentJsonPath);
            property.oneOf = oneOfProps;
        }
        if (ModelUtils.isAnyType(p)) {
            // The 'null' value is allowed when the OAS schema is 'any type'.
            // See https://github.com/OAI/OpenAPI-Specification/issues/1389
            if (Boolean.FALSE.equals(p.getNullable())) {
                LOGGER.warn("Schema '{}' is any type, which includes the 'null' value. 'nullable' cannot be set to 'false'", p.getName());
            }
        }
        property.patternInfo = getPatternInfo(p.getPattern());
        // handle inner property
        if (p.getItems() != null) {
            CodegenSchema items = fromSchema(
                    p.getItems(), sourceJsonPath, currentJsonPath + "/items");
            property.items = items;
        }
        property.additionalProperties = getAdditionalProperties(p, sourceJsonPath, currentJsonPath);
        property.properties = getProperties(p.getProperties(), sourceJsonPath, currentJsonPath);
        LinkedHashSet<String> required = p.getRequired() == null ? new LinkedHashSet<>()
                : new LinkedHashSet<String>(p.getRequired());
        property.optionalProperties = getOptionalProperties(property.properties, required);
        property.requiredProperties = getRequiredProperties(required, property.properties, p.getAdditionalProperties(), property.additionalProperties);

        String example = toExampleValue(p);
        property.example = example;
        if (addSchemaImportsFromV3SpecLocations && sourceJsonPath != null && sourceJsonPath.equals(currentJsonPath)) {
            // imports from properties/items/additionalPoperties/oneOf/anyOf/allOf/not
            property.imports = new TreeSet<>();
            addImports(property.imports, getImports(property, generatorMetadata.getFeatureSet()));
        }

        LOGGER.debug("debugging fromSchema return: {}", property);
        return property;
    }

    public String toRefClass(String ref, String sourceJsonPath, String expectedComponentType) {
        if (ref == null) {
            return null;
        }
        String[] refPieces = ref.split("/");
        return toModelName(refPieces[refPieces.length-1]);
    }

    private Map<String, SecurityScheme> getAuthMethods(List<SecurityRequirement> securities, Map<String, SecurityScheme> securitySchemes) {
        if (securities == null || (securitySchemes == null || securitySchemes.isEmpty())) {
            return null;
        }
        final Map<String, SecurityScheme> authMethods = new HashMap<>();
        for (SecurityRequirement requirement : securities) {
            for (Map.Entry<String, List<String>> entry : requirement.entrySet()) {
                final String key = entry.getKey();
                SecurityScheme securityScheme = securitySchemes.get(key);
                if (securityScheme != null) {

                    if (securityScheme.getType().equals(SecurityScheme.Type.OAUTH2)) {
                        OAuthFlows oauthUpdatedFlows = new OAuthFlows();
                        oauthUpdatedFlows.extensions(securityScheme.getFlows().getExtensions());

                        SecurityScheme oauthUpdatedScheme = new SecurityScheme()
                                .type(securityScheme.getType())
                                .description(securityScheme.getDescription())
                                .name(securityScheme.getName())
                                .$ref(securityScheme.get$ref())
                                .in(securityScheme.getIn())
                                .scheme(securityScheme.getScheme())
                                .bearerFormat(securityScheme.getBearerFormat())
                                .openIdConnectUrl(securityScheme.getOpenIdConnectUrl())
                                .extensions(securityScheme.getExtensions())
                                .flows(oauthUpdatedFlows);

                        // Ensure inserted AuthMethod only contains scopes of actual operation, and not all of them defined in the Security Component
                        // have to iterate through and create new SecurityScheme objects with the scopes 'fixed/updated'
                        final OAuthFlows securitySchemeFlows = securityScheme.getFlows();


                        if (securitySchemeFlows.getAuthorizationCode() != null) {
                            OAuthFlow updatedFlow = cloneOAuthFlow(securitySchemeFlows.getAuthorizationCode(), entry.getValue());

                            oauthUpdatedFlows.setAuthorizationCode(updatedFlow);
                        }
                        if (securitySchemeFlows.getImplicit() != null) {
                            OAuthFlow updatedFlow = cloneOAuthFlow(securitySchemeFlows.getImplicit(), entry.getValue());

                            oauthUpdatedFlows.setImplicit(updatedFlow);
                        }
                        if (securitySchemeFlows.getPassword() != null) {
                            OAuthFlow updatedFlow = cloneOAuthFlow(securitySchemeFlows.getPassword(), entry.getValue());

                            oauthUpdatedFlows.setPassword(updatedFlow);
                        }
                        if (securitySchemeFlows.getClientCredentials() != null) {
                            OAuthFlow updatedFlow = cloneOAuthFlow(securitySchemeFlows.getClientCredentials(), entry.getValue());

                            oauthUpdatedFlows.setClientCredentials(updatedFlow);
                        }

                        authMethods.put(key, oauthUpdatedScheme);
                    } else {
                        authMethods.put(key, securityScheme);
                    }
                }
            }
        }
        return authMethods;
    }

    private static OAuthFlow cloneOAuthFlow(OAuthFlow originFlow, List<String> operationScopes) {
        Scopes newScopes = new Scopes();
        for (String operationScope : operationScopes) {
            if (originFlow.getScopes().containsKey(operationScope)) {
                newScopes.put(operationScope, originFlow.getScopes().get(operationScope));
            }
        }

        return new OAuthFlow()
                .authorizationUrl(originFlow.getAuthorizationUrl())
                .tokenUrl(originFlow.getTokenUrl())
                .refreshUrl(originFlow.getRefreshUrl())
                .extensions(originFlow.getExtensions())
                .scopes(newScopes);
    }

    private List<CodegenSecurity> filterAuthMethods(List<CodegenSecurity> authMethods, List<SecurityRequirement> securities) {
        if (securities == null || securities.isEmpty() || authMethods == null) {
            return authMethods;
        }

        List<CodegenSecurity> result = new ArrayList<>();

        for (CodegenSecurity security : authMethods) {
            boolean filtered = false;
            if (security != null && security.scopes != null) {
                for (SecurityRequirement requirement : securities) {
                    List<String> opScopes = requirement.get(security.name);
                    if (opScopes != null) {
                        // We have operation-level scopes for this method, so filter the auth method to
                        // describe the operation auth method with only the scopes that it requires.
                        // We have to create a new auth method instance because the original object must
                        // not be modified.
                        CodegenSecurity opSecurity = security.filterByScopeNames(opScopes);
                        result.add(opSecurity);
                        filtered = true;
                        break;
                    }
                }
            }

            // If we didn't get a filtered version, then we can keep the original auth method.
            if (!filtered) {
                result.add(security);
            }
        }

        return result;
    }

    /**
     * Convert OAS Operation object to Codegen Operation object
     *
     * @param httpMethod HTTP method
     * @param operation  OAS operation object
     * @param path       the path of the operation
     * @param servers    list of servers
     * @return Codegen Operation object
     */
    @Override
    public CodegenOperation fromOperation(String path,
                                          String httpMethod,
                                          Operation operation,
                                          List<Server> servers) {
        LOGGER.debug("fromOperation => operation: {}", operation);
        if (operation == null) {
            throw new RuntimeException("operation cannot be null in fromOperation");
        }

        Map<String, Object> vendorExtensions = null;
        if (operation.getExtensions() != null && !operation.getExtensions().isEmpty()) {
            vendorExtensions = new HashMap<>();
            vendorExtensions.putAll(operation.getExtensions());
        }

        // servers setting
        List<CodegenServer> codegenServers = null;
        if (operation.getServers() != null && !operation.getServers().isEmpty()) {
            // use operation-level servers first if defined
            codegenServers = fromServers(operation.getServers());
        } else if (servers != null && !servers.isEmpty()) {
            // use path-level servers
            codegenServers = fromServers(servers);
        }

        // tags
        List<String> operationTagNames = operation.getTags();
        Map<String, CodegenTag> tags = new HashMap<>();
        if (operationTagNames != null) {
            for (String tagName: operationTagNames) {
                CodegenTag codegenTag = new CodegenTag(tagName, toApiFilename(tagName), toApiName(tagName));
                tags.put(tagName, codegenTag);
            }
        } else {
            String tagName = "default";
            CodegenTag codegenTag = new CodegenTag(tagName, toApiFilename(tagName), toApiName(tagName));
            tags.put(tagName, codegenTag);
        }

        String operationId = getOrGenerateOperationId(operation, path, httpMethod);

        // remove prefix in operationId
        if (removeOperationIdPrefix) {
            // The prefix is everything before the removeOperationIdPrefixCount occurrence of removeOperationIdPrefixDelimiter
            String[] components = operationId.split("[" + removeOperationIdPrefixDelimiter + "]");
            if (components.length > 1) {
                // If removeOperationIdPrefixCount is -1 or bigger that the number of occurrences, uses the last one
                int component_number = removeOperationIdPrefixCount == -1 ? components.length - 1 : removeOperationIdPrefixCount;
                component_number = Math.min(component_number, components.length - 1);
                // Reconstruct the operationId from its split elements and the delimiter
                operationId = String.join(removeOperationIdPrefixDelimiter, Arrays.copyOfRange(components, component_number, components.length));
            }
        }
        CodegenKey operationIdKey = new CodegenKey(
                operationId,
                isValid(operationId),
                toPathFilename(operationId),
                toModelName(operationId)
        );

        String usedPath;
        if (isStrictSpecBehavior() && !path.startsWith("/")) {
            // modifies an operation.path to strictly conform to OpenAPI Spec
            usedPath = "/" + path;
        } else {
            usedPath = path;
        }
        CodegenKey pathKey = new CodegenKey(
                usedPath,
                false,  // false because paths have lots of invalid characters
                toPathFilename(path),
                toModelName(path)
        );
        String sourceJsonPath = "#/paths/" + ModelUtils.encodeSlashes(pathKey.original) + "/" + httpMethod;

        String summary = escapeText(operation.getSummary());
        String unescapedNotes = operation.getDescription();
        String notes = escapeText(operation.getDescription());
        boolean isDeprecated = false;
        if (operation.getDeprecated() != null) {
            isDeprecated = operation.getDeprecated();
        }

        TreeMap<String, CodegenResponse> responses = null;
        LinkedHashSet<String> produces = null;
        CodegenResponse defaultResponse = null;
        TreeMap<String, CodegenResponse> nonDefaultResponses = null;
        TreeMap<Integer, CodegenResponse> wildcardCodeResponses = null;
        TreeMap<Integer, CodegenResponse> statusCodeResponses = null;
        boolean hasErrorResponseObject = false;
        if (operation.getResponses() != null && !operation.getResponses().isEmpty()) {
            responses = new TreeMap<>();
            for (Map.Entry<String, ApiResponse> operationGetResponsesEntry : operation.getResponses().entrySet()) {
                String key = operationGetResponsesEntry.getKey();
                ApiResponse response = operationGetResponsesEntry.getValue();
                LinkedHashSet<String> responseProduces = getProducesInfo(response);
                if (responseProduces!= null) {
                    if (produces == null) {
                        produces = new LinkedHashSet<>();
                    }
                    produces.addAll(responseProduces);
                }
                String usedSourceJsonPath = sourceJsonPath + "/responses/" + key;
                CodegenResponse r = fromResponse(response, usedSourceJsonPath);

                responses.put(key, r);
                if ("default".equals(key)) {
                    defaultResponse = r;
                    continue;
                }
                if (nonDefaultResponses == null) {
                    nonDefaultResponses = new TreeMap<>();
                }
                nonDefaultResponses.put(key, r);
                if (key.endsWith("XX") && key.length() == 3) {
                    if (wildcardCodeResponses == null) {
                        wildcardCodeResponses = new TreeMap<>();
                    }
                    Integer firstNumber = Integer.parseInt(key.substring(0, 1));
                    wildcardCodeResponses.put(firstNumber, r);
                    if (firstNumber > 3 && r.content != null) {
                        for (CodegenMediaType cm: r.content.values()) {
                            if (cm.schema != null) {
                                hasErrorResponseObject = true;
                                break;
                            }
                        }
                    }
                    continue;
                }
                if (statusCodeResponses == null) {
                    statusCodeResponses = new TreeMap<>();
                }
                Integer statusCode = Integer.parseInt(key);
                statusCodeResponses.put(statusCode, r);
                if (statusCode > 299 && r.content != null) {
                    for (CodegenMediaType cm: r.content.values()) {
                        if (cm.schema != null) {
                            hasErrorResponseObject = true;
                            break;
                        }
                    }
                }
            }

            // sort them
            if (responses != null) {
                responses = new TreeMap<>(responses);
            }
            if (nonDefaultResponses != null) {
                nonDefaultResponses = new TreeMap<>(nonDefaultResponses);
            }
            if (statusCodeResponses != null) {
                statusCodeResponses = new TreeMap<>(statusCodeResponses);
            }
            if (wildcardCodeResponses != null) {
                wildcardCodeResponses = new TreeMap<>(wildcardCodeResponses);
            }
        }

        List<CodegenCallback> callbacks = null;
        if (operation.getCallbacks() != null && !operation.getCallbacks().isEmpty()) {
            List<CodegenCallback> foundCallbacks = new ArrayList<>();
            operation.getCallbacks().forEach((name, callback) -> {
                CodegenCallback c = fromCallback(name, callback, servers);
                foundCallbacks.add(c);
            });
            callbacks = foundCallbacks;
        }

        List<Parameter> parameters = operation.getParameters();
        List<CodegenParameter> allParams = new ArrayList<>();
        List<CodegenParameter> pathParams = new ArrayList<>();
        List<CodegenParameter> queryParams = new ArrayList<>();
        List<CodegenParameter> headerParams = new ArrayList<>();
        List<CodegenParameter> cookieParams = new ArrayList<>();
        boolean hasRequiredParamOrBody = false;
        boolean hasOptionalParamOrBody = false;

        RequestBody opRequestBody = operation.getRequestBody();
        CodegenRequestBody requestBody = null;
        if (opRequestBody != null) {
            requestBody = fromRequestBody(opRequestBody, sourceJsonPath + "/requestBody");
            if (requestBody.refInfo != null) {
                if (requestBody.getDeepestRef().required) {
                    hasRequiredParamOrBody = true;
                } else {
                    hasOptionalParamOrBody = true;
                }
            } else {
                if (requestBody.required) {
                    hasRequiredParamOrBody = true;
                } else {
                    hasOptionalParamOrBody = true;
                }
            }
        }

        if (parameters != null) {
            Integer i = 0;
            for (Parameter param : parameters) {
                String usedSourceJsonPath = sourceJsonPath + "/parameters/" + i.toString();
                CodegenParameter p = fromParameter(param, usedSourceJsonPath);
                allParams.add(p);
                i++;

                CodegenParameter paramOrRef = p;
                if (p.refInfo != null) {
                    paramOrRef = p.getDeepestRef();
                }
                if (paramOrRef.in.equals("query")) {
                    queryParams.add(p);
                } else if (paramOrRef.in.equals("path")) {
                    pathParams.add(p);
                } else if (paramOrRef.in.equals("header")) {
                    headerParams.add(p);
                } else if (paramOrRef.in.equals("cookie")) {
                    cookieParams.add(p);
                } else {
                    LOGGER.warn("Unknown parameter type for {}", p.name);
                }

            }
        }

        // create optional, required parameters
        for (CodegenParameter cp : allParams) {
            if (cp.refInfo != null) {
                if (cp.getDeepestRef().required) { //required parameters
                    hasRequiredParamOrBody = true;
                } else { // optional parameters
                    hasOptionalParamOrBody = true;
                }
            } else {
                if (cp.required) { //required parameters
                    hasRequiredParamOrBody = true;
                } else { // optional parameters
                    hasOptionalParamOrBody = true;
                }
            }
        }

        CodegenKey httpMethodKey = new CodegenKey(
                httpMethod,
                true,
                org.openapijsonschematools.codegen.utils.StringUtils.underscore(httpMethod),
                org.openapijsonschematools.codegen.utils.StringUtils.camelize(httpMethod)
        );

        // move "required" parameters in front of "optional" parameters
        if (sortParamsByRequiredFlag) {
            Collections.sort(allParams, new Comparator<CodegenParameter>() {
                @Override
                public int compare(CodegenParameter one, CodegenParameter another) {
                    if (one.required == another.required)
                        return 0;
                    else if (one.required)
                        return -1;
                    else
                        return 1;
                }
            });
        }
        List<CodegenSecurity> authMethods = null;
        List<SecurityRequirement> securities = operation.getSecurity();
        if (securities != null && !securities.isEmpty()) {
            final Map<String, SecurityScheme> securitySchemes = openAPI.getComponents() != null ? openAPI.getComponents().getSecuritySchemes() : null;
            final List<SecurityRequirement> globalSecurities = openAPI.getSecurity();
            Map<String, SecurityScheme> theseAuthMethods = getAuthMethods(securities, securitySchemes);
            if (theseAuthMethods != null && !theseAuthMethods.isEmpty()) {
                List<CodegenSecurity> fullAuthMethods = fromSecurity(theseAuthMethods);
                authMethods = filterAuthMethods(fullAuthMethods, securities);
            } else {
                theseAuthMethods = getAuthMethods(globalSecurities, securitySchemes);

                if (theseAuthMethods != null && !theseAuthMethods.isEmpty()) {
                    List<CodegenSecurity> fullAuthMethods = fromSecurity(theseAuthMethods);
                    authMethods = filterAuthMethods(fullAuthMethods, globalSecurities);
                }
            }
        }

        ExternalDocumentation externalDocs = operation.getExternalDocs();
        CodegenOperation op = new CodegenOperation(
                isDeprecated,
                hasErrorResponseObject,
                summary,
                unescapedNotes,
                notes,
                httpMethodKey,
                pathKey,
                produces,
                codegenServers,
                requestBody,
                allParams,
                pathParams,
                queryParams,
                headerParams,
                cookieParams,
                hasRequiredParamOrBody,
                hasOptionalParamOrBody,
                authMethods,
                tags,
                responses,
                statusCodeResponses,
                wildcardCodeResponses,
                nonDefaultResponses,
                defaultResponse,
                callbacks,
                externalDocs,
                vendorExtensions,
                operationIdKey);
        return op;
    }

    /**
     * Convert OAS Response object to Codegen Response object
     *
     * @param response     OAS Response object
     * @return Codegen Response object
     */
    public CodegenResponse fromResponse(ApiResponse response, String sourceJsonPath) {
        if (response == null) {
            String msg = "response in fromResponse cannot be null!";
            LOGGER.error(msg);
            throw new RuntimeException(msg);
        }

        CodegenResponse r = codegenResponseCache.getOrDefault(sourceJsonPath, null);
        if (r != null) {
            return r;
        }

        String description = escapeText(response.getDescription());
        Map<String, Object> vendorExtensions = null;
        if (response.getExtensions() != null && !response.getExtensions().isEmpty()) {
            vendorExtensions = response.getExtensions();
        }

        Map<String, Header> responseHeaders = response.getHeaders();
        Map<String, CodegenHeader> headers = null;
        if (responseHeaders != null && !responseHeaders.isEmpty()) {
            headers = new HashMap<>();
            for (Entry<String, Header> entry : responseHeaders.entrySet()) {
                String headerName = entry.getKey();
                Header header = entry.getValue();
                String headerSourceJsonPath = sourceJsonPath + "/headers/" + headerName;
                CodegenHeader responseHeader = fromHeader(header, headerSourceJsonPath);
                headers.put(headerName, responseHeader);
            }
        }
        LinkedHashMap<CodegenKey, CodegenMediaType> content = getContent(response.getContent(), sourceJsonPath + "/content");
        String expectedComponentType = "responses";
        String ref = response.get$ref();
        CodegenRefInfo refInfo = null;
        TreeSet<String> imports = null;
        if (ref != null) {
            String refModule = toRefModule(ref, sourceJsonPath, expectedComponentType);
            String refClass = toRefClass(ref, sourceJsonPath, expectedComponentType);
            CodegenResponse rb = fromResponse(ModelUtils.getReferencedApiResponse(openAPI, response), ref);
            refInfo = new CodegenRefInfo<>(rb, refClass, refModule);
            imports = new TreeSet<>();
            imports.add(getImport(refInfo));
        }
        CodegenKey name = getName(expectedComponentType, sourceJsonPath);
        String[] pathPieces = sourceJsonPath.split("/");
        // #/components/responses/A
        String componentModule = null;
        if (pathPieces.length == 4 && sourceJsonPath.startsWith("#/components/"+expectedComponentType+"/")) {
            componentModule = toComponentModule(pathPieces[3], expectedComponentType);
        }

        Map<String, CodegenHeader> finalHeaders = headers;
        Map<String, Object> finalVendorExtensions = vendorExtensions;
        CodegenRefInfo finalRefInfo = refInfo;
        String finalComponentModule = componentModule;
        TreeSet<String> finalImports = imports;
        r = new CodegenResponse(name, finalHeaders, description, finalVendorExtensions, content, finalRefInfo, finalImports, finalComponentModule);
        codegenResponseCache.put(sourceJsonPath, r);
        return r;
    }

    /**
     * Convert OAS Callback object to Codegen Callback object
     *
     * @param name     callback name
     * @param callback OAS Callback object
     * @param servers  list of servers
     * @return Codegen Response object
     */
    public CodegenCallback fromCallback(String name, Callback callback, List<Server> servers) {
        CodegenCallback c = new CodegenCallback();
        c.name = name;

        if (callback.getExtensions() != null && !callback.getExtensions().isEmpty()) {
            c.vendorExtensions.putAll(callback.getExtensions());
        }

        callback.forEach((expression, pi) -> {
            CodegenCallback.Url u = new CodegenCallback.Url();
            u.expression = expression;

            if (pi.getExtensions() != null && !pi.getExtensions().isEmpty()) {
                u.vendorExtensions.putAll(pi.getExtensions());
            }

            Stream.of(
                            Pair.of("get", pi.getGet()),
                            Pair.of("head", pi.getHead()),
                            Pair.of("put", pi.getPut()),
                            Pair.of("post", pi.getPost()),
                            Pair.of("delete", pi.getDelete()),
                            Pair.of("patch", pi.getPatch()),
                            Pair.of("options", pi.getOptions()))
                    .filter(p -> p.getValue() != null)
                    .forEach(p -> {
                        String method = p.getKey();
                        Operation op = p.getValue();

                        boolean genId = op.getOperationId() == null;
                        if (genId) {
                            op.setOperationId(getOrGenerateOperationId(op, c.name + "_" + expression.replaceAll("\\{\\$.*}", ""), method));
                        }

                        if (op.getExtensions() == null) {
                            op.setExtensions(new HashMap<>());
                        }
                        // This extension will be removed later by `fromOperation()` as it is only needed here to
                        // distinguish between normal operations and callback requests
                        op.getExtensions().put("x-callback-request", true);

                        CodegenOperation co = fromOperation(expression, method, op, servers);
                        u.requests.add(co);
                    });

            c.urls.add(u);
        });

        return c;
    }

    public CodegenHeader fromHeader(Header header, String sourceJsonPath) {
        if (header == null) {
            String msg = "header in fromHeader cannot be null!";
            LOGGER.error(msg);
            throw new RuntimeException(msg);
        }
        CodegenHeader codegenHeader = codegenHeaderCache.getOrDefault(sourceJsonPath, null);
        if (codegenHeader != null) {
            return codegenHeader;
        }

        String ref = header.get$ref();
        String expectedComponentType = "headers";
        CodegenRefInfo refInfo = null;
        TreeSet<String> imports = null;
        if (ref != null) {
            String refModule = toRefModule(ref, sourceJsonPath, expectedComponentType);
            String refClass = toRefClass(ref, sourceJsonPath, expectedComponentType);
            CodegenHeader rb = fromHeader(ModelUtils.getReferencedHeader(openAPI, header), ref);
            refInfo = new CodegenRefInfo<>(rb, refClass, refModule);
            imports =  new TreeSet<>();
            imports.add(getImport(refInfo));
        }
        CodegenKey name = getName(expectedComponentType, sourceJsonPath);
        String[] pathPieces = sourceJsonPath.split("/");
        // #/components/headers/A
        String componentModule = null;
        if (pathPieces.length == 4 && sourceJsonPath.startsWith("#/components/"+expectedComponentType+"/")) {
            componentModule = toComponentModule(pathPieces[3], expectedComponentType);
        }

        String description = escapeText(header.getDescription());
        String unescapedDescription = header.getDescription();
        Map<String, Object> vendorExtensions = null;
        if (header.getExtensions() != null && !header.getExtensions().isEmpty()) {
            vendorExtensions = header.getExtensions();
        }
        boolean required = false;
        if (header.getRequired() != null) {
            required = header.getRequired();
        }
        LinkedHashMap<CodegenKey, CodegenMediaType> content = null;
        if (header.getContent() != null) {
            content = getContent(header.getContent(), sourceJsonPath + "/content");
        }
        boolean isDeprecated = false;
        if (header.getDeprecated() != null) {
            isDeprecated = header.getDeprecated();
        }

        // the parameter model name is obtained from the schema $ref
        // e.g. #/components/schemas/list_pageQuery_parameter => toModelName(list_pageQuery_parameter)
        CodegenSchema schema = null;
        if (header.getSchema() != null) {
            String usedSourceJsonPath = sourceJsonPath + "/schema";
            schema = fromSchema(
                    header.getSchema(),
                    usedSourceJsonPath,
                    usedSourceJsonPath
            );
        }

        // the default value is false
        // https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.0.2.md#user-content-parameterexplode
        boolean isExplode = header.getExplode() == null ? false : header.getExplode();

        String style = null;
        if (header.getStyle() != null) {
            style = header.getStyle().toString();
        }
        TreeSet<String> finalImports = imports;
        String finalComponentModule = componentModule;
        String finalStyle = style;
        CodegenRefInfo finalRefInfo = refInfo;
        Map<String, Object> finalVendorExtensions = vendorExtensions;
        boolean finalRequired = required;
        LinkedHashMap<CodegenKey, CodegenMediaType> finalContent = content;
        boolean finalIsDeprecated = isDeprecated;
        CodegenSchema finalSchema = schema;
        String example = getHeaderExampleValue(header);
        codegenHeader = new CodegenHeader(description, unescapedDescription, example, finalVendorExtensions, finalRequired, finalContent, finalImports, finalComponentModule, name, isExplode, finalStyle, finalIsDeprecated, finalSchema, finalRefInfo);
        codegenHeaderCache.put(sourceJsonPath, codegenHeader);
        return codegenHeader;
    }

    /**
     * Convert OAS Parameter object to Codegen Parameter object
     *
     * @param parameter OAS parameter object
     * @param sourceJsonPath the json path to the parameter
     * @return Codegen Parameter object
     */
    public CodegenParameter fromParameter(Parameter parameter, String sourceJsonPath) {
        if (parameter == null) {
            String msg = "parameter in fromParameter cannot be null!";
            LOGGER.error(msg);
            throw new RuntimeException(msg);
        }
        if (GlobalSettings.getProperty("debugParser") != null) {
            LOGGER.info("working on Parameter {}", parameter.getName());
            LOGGER.info("jsonPath: {}", sourceJsonPath);
        }
        CodegenParameter codegenParameter = codegenParameterCache.getOrDefault(sourceJsonPath, null);
        if (codegenParameter != null) {
            return codegenParameter;
        }

        String ref = parameter.get$ref();
        String expectedComponentType = "parameters";
        CodegenRefInfo refInfo = null;
        TreeSet<String> imports = null;
        if (ref != null) {
            String refModule = toRefModule(ref, sourceJsonPath, expectedComponentType);
            String refClass = toRefClass(ref, sourceJsonPath, expectedComponentType);
            CodegenParameter rb = fromParameter(ModelUtils.getReferencedParameter(openAPI, parameter), ref);
            refInfo = new CodegenRefInfo<>(rb, refClass, refModule);
            imports = new TreeSet<>();
            imports.add(getImport(refInfo));
        }
        CodegenKey name = getName(expectedComponentType, sourceJsonPath);
        String[] pathPieces = sourceJsonPath.split("/");
        // #/components/parameters/A
        String componentModule = null;
        if (pathPieces.length == 4 && sourceJsonPath.startsWith("#/components/"+expectedComponentType+"/")) {
            componentModule = toComponentModule(pathPieces[3], expectedComponentType);
        }

        String description = escapeText(parameter.getDescription());
        String unescapedDescription = parameter.getDescription();
        Map<String, Object> vendorExtensions = null;
        if (parameter.getExtensions() != null && !parameter.getExtensions().isEmpty()) {
            vendorExtensions = parameter.getExtensions();
        }
        boolean required = false;
        if (parameter.getRequired() != null) {
            required = parameter.getRequired();
        }
        LinkedHashMap<CodegenKey, CodegenMediaType> content = null;
        if (parameter.getContent() != null) {
            content = getContent(parameter.getContent(), sourceJsonPath + "/content");
        }

        boolean isDeprecated = false;
        if (parameter.getDeprecated() != null) {
            isDeprecated = parameter.getDeprecated();
        }

        // the parameter model name is obtained from the schema $ref
        // e.g. #/components/schemas/list_pageQuery_parameter => toModelName(list_pageQuery_parameter)
        CodegenSchema schema = null;
        if (parameter.getSchema() != null) {
            String usedSourceJsonPath = sourceJsonPath + "/schema";
            schema = fromSchema(
                    parameter.getSchema(),
                    usedSourceJsonPath,
                    usedSourceJsonPath
            );
        }

        // the default value is false
        // https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.0.2.md#user-content-parameterexplode
        boolean isExplode = parameter.getExplode() == null ? false : parameter.getExplode();

        String style = null;
        if (parameter.getStyle() != null) {
            style = parameter.getStyle().toString();
        }
        String baseName = parameter.getName();

        String in = parameter.getIn();
        boolean isAllowEmptyValue = false;
        if (parameter instanceof QueryParameter || "query".equalsIgnoreCase(parameter.getIn())) {
            isAllowEmptyValue = parameter.getAllowEmptyValue() != null && parameter.getAllowEmptyValue();
        } else if (parameter instanceof PathParameter || "path".equalsIgnoreCase(parameter.getIn())) {
            required = true;
        } else if (parameter instanceof HeaderParameter || "header".equalsIgnoreCase(parameter.getIn())) {
        } else if (parameter instanceof CookieParameter || "cookie".equalsIgnoreCase(parameter.getIn())) {
        } else {
            LOGGER.warn("Unknown parameter type: {}", parameter.getName());
        }
        boolean isDeepObject = false;
        if (parameter.getStyle() != null) {
            isDeepObject = Parameter.StyleEnum.DEEPOBJECT == parameter.getStyle();
        }

        // set the parameter example value
        // should be overridden by lang codegen
        String example = getParameterExampleValue(parameter);

        boolean finalRequired = required;
        boolean finalIsAllowEmptyValue = isAllowEmptyValue;
        boolean finalIsDeepObject = isDeepObject;
        String finalStyle = style;
        TreeSet<String> finalImports = imports;
        String finalComponentModule = componentModule;
        CodegenRefInfo finalRefInfo = refInfo;
        Map<String, Object> finalVendorExtensions = vendorExtensions;
        LinkedHashMap<CodegenKey, CodegenMediaType> finalContent = content;
        boolean finalIsDeprecated = isDeprecated;
        CodegenSchema finalSchema = schema;
        codegenParameter = new CodegenParameter(description, unescapedDescription, example, finalVendorExtensions, finalRequired, finalContent, finalImports, finalComponentModule, name, isExplode, finalStyle, finalIsDeprecated, finalSchema, in, finalIsAllowEmptyValue, finalIsDeepObject, baseName, finalRefInfo);
        codegenParameterCache.put(sourceJsonPath, codegenParameter);
        LOGGER.debug("debugging codegenParameter return: {}", codegenParameter);
        return codegenParameter;
    }

    /**
     * Convert map of OAS SecurityScheme objects to a list of Codegen Security objects
     *
     * @param securitySchemeMap a map of OAS SecuritySchemeDefinition object
     * @return a list of Codegen Security objects
     */
    @Override
    @SuppressWarnings("static-method")
    public List<CodegenSecurity> fromSecurity(Map<String, SecurityScheme> securitySchemeMap) {
        if (securitySchemeMap == null) {
            return Collections.emptyList();
        }

        List<CodegenSecurity> codegenSecurities = new ArrayList<>(securitySchemeMap.size());
        for (Entry<String, SecurityScheme> entry: securitySchemeMap.entrySet()) {
            String name = entry.getKey();
            final SecurityScheme securityScheme = entry.getValue();
            String type = securityScheme.getType().toString();
            String scheme = securityScheme.getScheme();
            Boolean isBasic = null;
            Boolean isOAuth = null;
            Boolean isApiKey = null;
            Boolean isBasicBasic = null;
            Boolean isBasicBearer = null;
            Boolean isHttpSignature = null;
            String bearerFormat = null;
            Map<String, Object> vendorExtensions = null;
            if (securityScheme.getExtensions() != null) {
                vendorExtensions = securityScheme.getExtensions();
            }
            String keyParamName = null;
            Boolean isKeyInQuery = null;
            Boolean isKeyInHeader = null;
            Boolean isKeyInCookie = null;
            String flow = null;
            String authorizationUrl = null;
            String tokenUrl = null;
            String refreshUrl = null;
            List<Map<String, Object>> scopes = null;
            Boolean isCode = null;
            Boolean isPassword = null;
            Boolean isApplication = null;
            Boolean isImplicit = null;

            SecurityScheme.Type typeEnum = securityScheme.getType();
            if (SecurityScheme.Type.APIKEY.equals(typeEnum)) {
                isBasic = isOAuth = false;
                isApiKey = true;
                keyParamName = securityScheme.getName();
                isKeyInHeader = securityScheme.getIn() == SecurityScheme.In.HEADER;
                isKeyInQuery = securityScheme.getIn() == SecurityScheme.In.QUERY;
                isKeyInCookie = securityScheme.getIn() == SecurityScheme.In.COOKIE;  //it assumes a validation step prior to generation. (cookie-auth supported from OpenAPI 3.0.0)
            } else if (SecurityScheme.Type.HTTP.equals(typeEnum)) {
                isKeyInHeader = isKeyInQuery = isKeyInCookie = isApiKey = isOAuth = false;
                isBasic = true;
                if ("basic".equalsIgnoreCase(securityScheme.getScheme())) {
                    isBasicBasic = true;
                } else if ("bearer".equalsIgnoreCase(securityScheme.getScheme())) {
                    isBasicBearer = true;
                    bearerFormat = securityScheme.getBearerFormat();
                } else if ("signature".equalsIgnoreCase(securityScheme.getScheme())) {
                    // HTTP signature as defined in https://datatracker.ietf.org/doc/draft-cavage-http-signatures/
                    // The registry of security schemes is maintained by IANA.
                    // https://www.iana.org/assignments/http-authschemes/http-authschemes.xhtml
                    // As of January 2020, the "signature" scheme has not been registered with IANA yet.
                    // This scheme may have to be changed when it is officially registered with IANA.
                    isHttpSignature = true;
                    OnceLogger.once(LOGGER).warn("Security scheme 'HTTP signature' is a draft IETF RFC and subject to change.");
                } else {
                    OnceLogger.once(LOGGER).warn("Unknown scheme `{}` found in the HTTP security definition.", securityScheme.getScheme());
                }
            } else if (SecurityScheme.Type.OAUTH2.equals(securityScheme.getType())) {
                final OAuthFlows flows = securityScheme.getFlows();
                boolean isFlowEmpty = true;
                isOAuth = true;
                if (securityScheme.getFlows() == null) {
                    throw new RuntimeException("missing oauth flow in " + name);
                }
                if (flows.getPassword() != null) {
                    authorizationUrl = flows.getPassword().getAuthorizationUrl();
                    tokenUrl = flows.getPassword().getTokenUrl();
                    refreshUrl = flows.getPassword().getRefreshUrl();

                    scopes = getScopes(flows.getPassword().getScopes());
                    isPassword = true;
                    flow = "password";
                    isFlowEmpty = false;
                    final CodegenSecurity cs = new CodegenSecurity(
                            name,
                            type,
                            scheme,
                            isBasic,
                            isOAuth,
                            isApiKey,
                            isBasicBasic,
                            isBasicBearer,
                            isHttpSignature,
                            bearerFormat,
                            vendorExtensions,
                            keyParamName,
                            isKeyInQuery,
                            isKeyInHeader,
                            isKeyInCookie,
                            flow,
                            authorizationUrl,
                            tokenUrl,
                            refreshUrl,
                            scopes,
                            isCode,
                            isPassword,
                            isApplication,
                            isImplicit
                    );
                    codegenSecurities.add(cs);
                }
                if (flows.getImplicit() != null) {
                    authorizationUrl = flows.getImplicit().getAuthorizationUrl();
                    tokenUrl = flows.getImplicit().getTokenUrl();
                    refreshUrl = flows.getImplicit().getRefreshUrl();

                    scopes = getScopes(flows.getImplicit().getScopes());
                    isImplicit = true;
                    flow = "implicit";
                    isFlowEmpty = false;
                    final CodegenSecurity cs = new CodegenSecurity(
                            name,
                            type,
                            scheme,
                            isBasic,
                            isOAuth,
                            isApiKey,
                            isBasicBasic,
                            isBasicBearer,
                            isHttpSignature,
                            bearerFormat,
                            vendorExtensions,
                            keyParamName,
                            isKeyInQuery,
                            isKeyInHeader,
                            isKeyInCookie,
                            flow,
                            authorizationUrl,
                            tokenUrl,
                            refreshUrl,
                            scopes,
                            isCode,
                            isPassword,
                            isApplication,
                            isImplicit
                    );
                    codegenSecurities.add(cs);
                }
                if (flows.getClientCredentials() != null) {
                    authorizationUrl = flows.getClientCredentials().getAuthorizationUrl();
                    tokenUrl = flows.getClientCredentials().getTokenUrl();
                    refreshUrl = flows.getClientCredentials().getRefreshUrl();

                    scopes = getScopes(flows.getClientCredentials().getScopes());
                    isApplication = true;
                    flow = "application";
                    isFlowEmpty = false;
                    final CodegenSecurity cs = new CodegenSecurity(
                            name,
                            type,
                            scheme,
                            isBasic,
                            isOAuth,
                            isApiKey,
                            isBasicBasic,
                            isBasicBearer,
                            isHttpSignature,
                            bearerFormat,
                            vendorExtensions,
                            keyParamName,
                            isKeyInQuery,
                            isKeyInHeader,
                            isKeyInCookie,
                            flow,
                            authorizationUrl,
                            tokenUrl,
                            refreshUrl,
                            scopes,
                            isCode,
                            isPassword,
                            isApplication,
                            isImplicit
                    );
                    codegenSecurities.add(cs);
                }
                if (flows.getAuthorizationCode() != null) {
                    authorizationUrl = flows.getAuthorizationCode().getAuthorizationUrl();
                    tokenUrl = flows.getAuthorizationCode().getTokenUrl();
                    refreshUrl = flows.getAuthorizationCode().getRefreshUrl();

                    scopes = getScopes(flows.getAuthorizationCode().getScopes());
                    isCode = true;
                    flow = "accessCode";
                    isFlowEmpty = false;
                    final CodegenSecurity cs = new CodegenSecurity(
                            name,
                            type,
                            scheme,
                            isBasic,
                            isOAuth,
                            isApiKey,
                            isBasicBasic,
                            isBasicBearer,
                            isHttpSignature,
                            bearerFormat,
                            vendorExtensions,
                            keyParamName,
                            isKeyInQuery,
                            isKeyInHeader,
                            isKeyInCookie,
                            flow,
                            authorizationUrl,
                            tokenUrl,
                            refreshUrl,
                            scopes,
                            isCode,
                            isPassword,
                            isApplication,
                            isImplicit
                    );
                    codegenSecurities.add(cs);
                }

                if (isFlowEmpty) {
                    OnceLogger.once(LOGGER).error("Invalid flow definition defined in the security scheme: {}", flows);
                }
                continue;
            } else {
                OnceLogger.once(LOGGER).error("Unknown type `{}` found in the security definition `{}`.", securityScheme.getType(), securityScheme.getName());
            }
            final CodegenSecurity cs = new CodegenSecurity(
                    name,
                    type,
                    scheme,
                    isBasic,
                    isOAuth,
                    isApiKey,
                    isBasicBasic,
                    isBasicBearer,
                    isHttpSignature,
                    bearerFormat,
                    vendorExtensions,
                    keyParamName,
                    isKeyInQuery,
                    isKeyInHeader,
                    isKeyInCookie,
                    flow,
                    authorizationUrl,
                    tokenUrl,
                    refreshUrl,
                    scopes,
                    isCode,
                    isPassword,
                    isApplication,
                    isImplicit
            );
            codegenSecurities.add(cs);
        }

        // sort auth methods to maintain the same order
        Collections.sort(codegenSecurities, new Comparator<CodegenSecurity>() {
            @Override
            public int compare(CodegenSecurity one, CodegenSecurity another) {
                return ObjectUtils.compare(one.name, another.name);
            }
        });

        return codegenSecurities;
    }

    protected void setReservedWordsLowerCase(List<String> words) {
        reservedWords = new HashSet<>();
        for (String word : words) {
            reservedWords.add(word.toLowerCase(Locale.ROOT));
        }
    }

    protected boolean isReservedWord(String word) {
        return word != null && reservedWords.contains(word.toLowerCase(Locale.ROOT));
    }

    /**
     * Get operationId from the operation object, and if it's blank, generate a new one from the given parameters.
     *
     * @param operation  the operation object
     * @param path       the path of the operation
     * @param httpMethod the HTTP method of the operation
     * @return the (generated) operationId
     */
    protected String getOrGenerateOperationId(Operation operation, String path, String httpMethod) {
        String operationId = operation.getOperationId();
        if (!StringUtils.isBlank(operationId)) {
            return operationId;
        }
        String tmpPath = path;
        tmpPath = tmpPath.replaceAll("\\{", "");
        tmpPath = tmpPath.replaceAll("\\}", "");
        String[] parts = (tmpPath + "/" + httpMethod).split("/");
        StringBuilder builder = new StringBuilder();
        if ("/".equals(tmpPath)) {
            // must be root tmpPath
            builder.append("root");
        }
        for (String part : parts) {
            if (part.length() > 0) {
                if (builder.toString().length() == 0) {
                    part = Character.toLowerCase(part.charAt(0)) + part.substring(1);
                } else {
                    part = org.openapijsonschematools.codegen.utils.StringUtils.camelize(part);
                }
                builder.append(part);
            }
        }
        operationId = sanitizeName(builder.toString());
        LOGGER.warn("Empty operationId found for path: {} {}. Renamed to auto-generated operationId: {}", httpMethod, path, operationId);
        return operationId;
    }

    /**
     * Check the type to see if it needs import the library/module/package
     *
     * @param type name of the type
     * @return true if the library/module/package of the corresponding type needs to be imported
     */
    protected boolean needToImport(String type) {
        return StringUtils.isNotBlank(type) && !defaultIncludes.contains(type)
                && !languageSpecificPrimitives.contains(type);
    }

    /**
     * Add operation to group
     *
     * @param tag          name of the tag
     * @param resourcePath path of the resource
     * @param operation    OAS Operation object
     * @param co           Codegen Operation object
     * @param operations   map of Codegen operations
     */
    @Override
    @SuppressWarnings("static-method")
    public void addOperationToGroup(String tag, String resourcePath, Operation operation, CodegenOperation
            co, Map<String, List<CodegenOperation>> operations) {
        List<CodegenOperation> opList = operations.get(tag);
        if (opList == null) {
            opList = new ArrayList<>();
            operations.put(tag, opList);
        }
        // check for operationId uniqueness
        String operationId = co.operationId.original;
        int counter = 0;
        for (CodegenOperation op : opList) {
            if (operationId.equals(op.operationId.original)) {
                counter++;
                if (counter > 1) {
                    LOGGER.error("Invalid spec contains multiple operations with the same operationId=`{}` in tag='{}'.Update your spec to use unique operationIds.", operationId, tag);
                }
            }
        }
        opList.add(co);
    }

    protected void addImports(CodegenSchema m, CodegenSchema type) {
        addImports(m.imports, type);
    }

    protected void addImports(Set<String> importsToBeAddedTo, CodegenSchema type) {
        addImports(importsToBeAddedTo, getImports(type, generatorMetadata.getFeatureSet()));
    }

    protected void addImports(Set<String> importsToBeAddedTo, Set<String> importsToAdd) {
        importsToAdd.stream().forEach(i -> addImport(importsToBeAddedTo, i));
    }

    protected void addImport(Set<String> importsToBeAddedTo, String type) {
        if (shouldAddImport(type)) {
            importsToBeAddedTo.add(type);
        }
    }

    protected boolean shouldAddImport(String type) {
        return type != null && needToImport(type);
    }

    /**
     * Add variables (properties) to codegen model (list of properties, various flags, etc)
     *
     * @param properties a map of properties (schema)
     * @param sourceJsonPath the source json path
     * @param currentJsonPath the current json path
     * @return the properties
     */
    protected LinkedHashMap<CodegenKey, CodegenSchema> getProperties(Map<String, Schema> properties, String sourceJsonPath, String currentJsonPath) {
        if (properties == null || properties.isEmpty()) {
            return null;
        }

        LinkedHashMap<CodegenKey, CodegenSchema> propertiesMap = new LinkedHashMap<>();

        for (Map.Entry<String, Schema> entry : properties.entrySet()) {
            final String propertyName = entry.getKey();
            final Schema prop = entry.getValue();
            if (prop == null) {
                LOGGER.warn("Please report the issue. There shouldn't be null property for {}", propertyName);
            } else {
                final CodegenSchema cp;

                String propertyJsonPath = currentJsonPath + "/properties/" + ModelUtils.encodeSlashes(propertyName);
                cp = fromSchema(prop, sourceJsonPath, propertyJsonPath);

                CodegenKey key = getKey(propertyName);
                propertiesMap.put(key, cp);
            }
        }
        return propertiesMap;
    }

    /**
     * Add variables (properties) to codegen model (list of properties, various flags, etc)
     *
     * @param properties a map of properties (schema)
     * @param mandatory  a set of required properties' name
     * @return the optional properties
     */
    protected LinkedHashMap<CodegenKey, CodegenSchema> getOptionalProperties(LinkedHashMap<CodegenKey, CodegenSchema> properties, Set<String> mandatory) {
        if (properties == null) {
            return null;
        }
        if (mandatory.size() == properties.size()) {
            return null;
        }
        if (mandatory.isEmpty()) {
            return properties;
        }

        LinkedHashMap<CodegenKey, CodegenSchema> optionalProperties = new LinkedHashMap<>();
        for (Map.Entry<CodegenKey, CodegenSchema> entry : properties.entrySet()) {
            final CodegenKey key = entry.getKey();
            if (mandatory.contains(key.original)) {
                continue;
            }
            final CodegenSchema prop = entry.getValue();
            optionalProperties.put(key, prop);
        }
        return optionalProperties;
    }

    /**
     * Determine all of the types in the model definitions (schemas) that are aliases of
     * simple types.
     *
     * @param schemas The complete set of model definitions (schemas).
     * @return A mapping from model name to type alias
     */
    Map<String, String> getAllAliases(Map<String, Schema> schemas) {
        if (schemas == null || schemas.isEmpty()) {
            return new HashMap<>();
        }

        Map<String, String> aliases = new HashMap<>();
        for (Map.Entry<String, Schema> entry : schemas.entrySet()) {
            Schema schema = entry.getValue();
            if (isAliasOfSimpleTypes(schema)) {
                String oasName = entry.getKey();
                String schemaType = getPrimitiveType(schema);
                aliases.put(oasName, schemaType);
            }

        }

        return aliases;
    }

    private static Boolean isAliasOfSimpleTypes(Schema schema) {
        return (!ModelUtils.isObjectSchema(schema)
                && !ModelUtils.isArraySchema(schema)
                && !ModelUtils.isMapSchema(schema)
                && !ModelUtils.isComposedSchema(schema)
                && schema.getEnum() == null);
    }

    /**
     * Remove characters not suitable for variable or method name from the input and camelize it
     *
     * @param name string to be camelize
     * @return camelized string
     */
    @SuppressWarnings("static-method")
    public String removeNonNameElementToCamelCase(String name) {
        return removeNonNameElementToCamelCase(name, "[-_:;#" + removeOperationIdPrefixDelimiter + "]");
    }

    /**
     * Remove characters that is not good to be included in method name from the input and camelize it
     *
     * @param name                  string to be camelize
     * @param nonNameElementPattern a regex pattern of the characters that is not good to be included in name
     * @return camelized string
     */
    protected String removeNonNameElementToCamelCase(final String name, final String nonNameElementPattern) {
        String result = Arrays.stream(name.split(nonNameElementPattern))
                .map(StringUtils::capitalize)
                .collect(Collectors.joining(""));
        if (result.length() > 0) {
            result = result.substring(0, 1).toLowerCase(Locale.ROOT) + result.substring(1);
        }
        return result;
    }

    @Override
    public String apiFilename(String templateName, String tag) {
        String suffix = apiTemplateFiles().get(templateName);
        return apiFileFolder() + File.separatorChar + toApiFilename(tag) + suffix;
    }

    @Override
    public String modelPackagePathFragment() {
        return modelPackage.replace('.', File.separatorChar);
    }

    private void updateComponentsFilepath(String[] pathPieces) {
        if (pathPieces.length < 3) {
            return;
        }
        String requestBodiesIdentifier = "request_bodies";
        // rename schemas + requestBodies
        if (pathPieces[2].equals("schemas")) {
            // modelPackage replaces pathPieces[1] + pathPieces[2]
            pathPieces[1] = modelPackagePathFragment();
            pathPieces[2] = null;
            if (pathPieces.length == 4) {
                // #/components/schemas/SomeSchema
                pathPieces[3] = getKey(pathPieces[3]).snakeCase;
            }
            return;
        } else if (pathPieces[2].equals("requestBodies")) {
            pathPieces[2] = requestBodiesIdentifier;
        }
        if (pathPieces.length < 4) {
            return;
        }
        if (pathPieces[2].equals("headers")) {
            pathPieces[3] = toHeaderFilename(pathPieces[3]);
            if (pathPieces.length >= 6 && pathPieces[4].equals("content")) {
                // #/components/headers/someHeader/content/application-json -> length 6
                String contentType = ModelUtils.decodeSlashes(pathPieces[5]);
                pathPieces[5] = getKey(contentType).snakeCase;
            }
        } else if (pathPieces[2].equals("parameters")) {
            pathPieces[3] = toParameterFilename(pathPieces[3]);
            if (pathPieces.length >= 6 && pathPieces[4].equals("content")) {
                // #/components/parameters/someParam/content/application-json -> length 6
                String contentType = ModelUtils.decodeSlashes(pathPieces[5]);
                pathPieces[5] = getKey(contentType).snakeCase;
            }
        } else if (pathPieces[2].equals(requestBodiesIdentifier)) {
            pathPieces[3] = toRequestBodyFilename(pathPieces[3]);
            if (pathPieces.length >= 6 && pathPieces[4].equals("content")) {
                // #/components/requestBodies/someBody/content/application-json -> length 6
                String contentType = ModelUtils.decodeSlashes(pathPieces[5]);
                pathPieces[5] = getKey(contentType).snakeCase;
            }
        } else if (pathPieces[2].equals("responses")) {
            // #/components/responses/SuccessWithJsonApiResponse/headers
            pathPieces[3] = toResponseModuleName(pathPieces[3]);

            if (pathPieces.length < 6) {
                return;
            }
            if (pathPieces[4].equals("headers")) {
                // #/components/responses/someResponse/headers/SomeHeader-> length 6
                pathPieces[5] = toHeaderFilename(pathPieces[5]);
                if (pathPieces.length >= 8 && pathPieces[6].equals("content")) {
                    // #/components/responses/someResponse/headers/SomeHeader/content/application-json -> length 8
                    String contentType = ModelUtils.decodeSlashes(pathPieces[7]);
                    pathPieces[7] = getKey(contentType).snakeCase;
                }
            } else if (pathPieces[4].equals("content")) {
                // #/components/responses/someResponse/content/application-json -> length 6
                String contentType = ModelUtils.decodeSlashes(pathPieces[5]);
                pathPieces[5] = getKey(contentType).snakeCase;
            }
        }
    }

    private void updatePathsFilepath(String[] pathPieces) {
        if (pathPieces.length < 3) {
            return;
        }
        // #/paths/somePath
        pathPieces[2] = toPathFilename(ModelUtils.decodeSlashes(pathPieces[2]));
        if (pathPieces.length < 4) {
            return;
        }
        Set<String> httpVerbs = new HashSet<>(Arrays.asList("get", "put", "post", "delete", "options", "head", "patch", "trace"));
        String requestBodyIdentifier = "request_body";
        if (!httpVerbs.contains(pathPieces[3])) {
            return;
        }
        if (pathPieces.length < 5) {
            return;
        }
        if (pathPieces[4].equals("requestBody")) {
            // #/paths/somePath/get/requestBody
            pathPieces[4] = requestBodyIdentifier;
        }
        if (pathPieces.length < 6) {
            return;
        }
        if (pathPieces[4].equals("responses")) {
            // #/paths/user_login/get/responses/200 -> 200 -> response_200 -> length 6
            pathPieces[5] = toResponseModuleName(pathPieces[5]);

            if (pathPieces.length < 8) {
                return;
            }
            if (pathPieces[6].equals("content")) {
                // #/paths/somePath/get/responses/200/content/application-json -> length 8
                String contentType = ModelUtils.decodeSlashes(pathPieces[7]);
                pathPieces[7] = getKey(contentType).snakeCase;
            } else if (pathPieces[6].equals("headers")) {
                // #/paths/somePath/get/responses/200/headers/someHeader -> length 8
                pathPieces[7] = toHeaderFilename(pathPieces[7]);

                if (pathPieces.length >= 10 && pathPieces[8].equals("content")) {
                    // #/paths/somePath/get/responses/200/headers/someHeader/content/application-json -> length 10
                    String contentType = ModelUtils.decodeSlashes(pathPieces[9]);
                    pathPieces[9] = getKey(contentType).snakeCase;
                }
            }
        } else if (pathPieces[4].equals("parameters")) {
            // #/paths/somePath/get/parameters/0 -> length 6
            pathPieces[5] = toParameterFilename(pathPieces[5]);

            if (pathPieces.length >= 8 && pathPieces[6].equals("content")) {
                // #/paths/somePath/get/parameters/1/content/application-json -> length 8
                String contentType = ModelUtils.decodeSlashes(pathPieces[7]);
                pathPieces[7] = getKey(contentType).snakeCase;
            }
        } else if (pathPieces[4].equals(requestBodyIdentifier)) {
            if (pathPieces.length >= 7 && pathPieces[5].equals("content")) {
                // #/paths/somePath/get/requestBody/content/application-json -> length 7
                String contentType = ModelUtils.decodeSlashes(pathPieces[6]);
                pathPieces[6] = getKey(contentType).snakeCase;
            }
        }
    }

    @Override
    public String getFilepath(String jsonPath) {
        String[] pathPieces = jsonPath.split("/");
        pathPieces[0] = outputFolder + File.separatorChar + packagePath();
        if (jsonPath.startsWith("#/components")) {
            updateComponentsFilepath(pathPieces);
        } else if (jsonPath.startsWith("#/paths")) {
            updatePathsFilepath(pathPieces);
        }
        List<String> finalPathPieces = Arrays.stream(pathPieces)
                .filter(p -> Objects.nonNull(p))
                .collect(Collectors.toList());
        return String.join(File.separator, finalPathPieces);
    }

    /**
     * Return the full path and API documentation file
     *
     * @param templateName template name
     * @param tag          tag
     * @return the API documentation file name with full path
     */
    @Override
    public String apiDocFilename(String templateName, String tag) {
        String docExtension = getDocExtension();
        String suffix = docExtension != null ? docExtension : apiDocTemplateFiles().get(templateName);
        return apiDocFileFolder() + File.separator + toApiDocFilename(tag) + suffix;
    }

    /**
     * Return the full path and API test file
     *
     * @param templateName template name
     * @param tag          tag
     * @return the API test file name with full path
     */
    @Override
    public String apiTestFilename(String templateName, String tag) {
        String suffix = apiTestTemplateFiles().get(templateName);
        return apiTestFileFolder() + File.separator + toApiTestFilename(tag) + suffix;
    }

    @Override
    public boolean shouldOverwrite(String filename) {
        return !(skipOverwrite && new File(filename).exists());
    }

    @Override
    public boolean isSkipOverwrite() {
        return skipOverwrite;
    }

    @Override
    public void setSkipOverwrite(boolean skipOverwrite) {
        this.skipOverwrite = skipOverwrite;
    }

    @Override
    public boolean isRemoveOperationIdPrefix() {
        return removeOperationIdPrefix;
    }

    @Override
    public boolean isSkipOperationExample() {
        return skipOperationExample;
    }

    @Override
    public void setRemoveOperationIdPrefix(boolean removeOperationIdPrefix) {
        this.removeOperationIdPrefix = removeOperationIdPrefix;
    }

    public String getRemoveOperationIdPrefixDelimiter() {
        return removeOperationIdPrefixDelimiter;
    }

    public void setRemoveOperationIdPrefixDelimiter(String removeOperationIdPrefixDelimiter) {
        this.removeOperationIdPrefixDelimiter = removeOperationIdPrefixDelimiter;
    }

    public int getRemoveOperationIdPrefixCount() {
        return removeOperationIdPrefixCount;
    }

    public void setRemoveOperationIdPrefixCount(int removeOperationIdPrefixCount) {
        this.removeOperationIdPrefixCount = removeOperationIdPrefixCount;
    }

    @Override
    public void setSkipOperationExample(boolean skipOperationExample) {
        this.skipOperationExample = skipOperationExample;
    }

    @Override
    public boolean isHideGenerationTimestamp() {
        return hideGenerationTimestamp;
    }

    @Override
    public void setHideGenerationTimestamp(boolean hideGenerationTimestamp) {
        this.hideGenerationTimestamp = hideGenerationTimestamp;
    }

    /**
     * All library templates supported.
     * (key: library name, value: library description)
     *
     * @return the supported libraries
     */
    @Override
    public Map<String, String> supportedLibraries() {
        return supportedLibraries;
    }

    /**
     * Set library template (sub-template).
     *
     * @param library Library template
     */
    @Override
    public void setLibrary(String library) {
        if (library != null && !supportedLibraries.containsKey(library)) {
            StringBuilder sb = new StringBuilder("Unknown library: " + library + "\nAvailable libraries:");
            if (supportedLibraries.size() == 0) {
                sb.append("\n  ").append("NONE");
            } else {
                for (String lib : supportedLibraries.keySet()) {
                    sb.append("\n  ").append(lib);
                }
            }
            throw new RuntimeException(sb.toString());
        }
        this.library = library;
    }

    /**
     * Library template (sub-template).
     *
     * @return Library template
     */
    @Override
    public String getLibrary() {
        return library;
    }

    /**
     * check if current active library equals to passed
     *
     * @param library - library to be compared with
     * @return {@code true} if passed library is active, {@code false} otherwise
     */
    public final boolean isLibrary(String library) {
        return library.equals(this.library);
    }

    /**
     * Set Git host.
     *
     * @param gitHost Git host
     */
    @Override
    public void setGitHost(String gitHost) {
        this.gitHost = gitHost;
    }

    /**
     * Git host.
     *
     * @return Git host
     */
    @Override
    public String getGitHost() {
        return gitHost;
    }

    /**
     * Set Git user ID.
     *
     * @param gitUserId Git user ID
     */
    @Override
    public void setGitUserId(String gitUserId) {
        this.gitUserId = gitUserId;
    }

    /**
     * Git user ID
     *
     * @return Git user ID
     */
    @Override
    public String getGitUserId() {
        return gitUserId;
    }

    /**
     * Set Git repo ID.
     *
     * @param gitRepoId Git repo ID
     */
    @Override
    public void setGitRepoId(String gitRepoId) {
        this.gitRepoId = gitRepoId;
    }

    /**
     * Git repo ID
     *
     * @return Git repo ID
     */
    @Override
    public String getGitRepoId() {
        return gitRepoId;
    }

    /**
     * Set release note.
     *
     * @param releaseNote Release note
     */
    @Override
    public void setReleaseNote(String releaseNote) {
        this.releaseNote = releaseNote;
    }

    /**
     * Release note
     *
     * @return Release note
     */
    @Override
    public String getReleaseNote() {
        return releaseNote;
    }

    /**
     * Documentation files extension
     *
     * @return Documentation files extension
     */
    @Override
    public String getDocExtension() {
        return docExtension;
    }

    /**
     * Set Documentation files extension
     *
     * @param userDocExtension documentation files extension
     */
    @Override
    public void setDocExtension(String userDocExtension) {
        this.docExtension = userDocExtension;
    }

    /**
     * Set HTTP user agent.
     *
     * @param httpUserAgent HTTP user agent
     */
    @Override
    public void setHttpUserAgent(String httpUserAgent) {
        this.httpUserAgent = httpUserAgent;
    }

    /**
     * HTTP user agent
     *
     * @return HTTP user agent
     */
    @Override
    public String getHttpUserAgent() {
        return httpUserAgent;
    }

    @SuppressWarnings("static-method")
    protected CliOption buildLibraryCliOption(Map<String, String> supportedLibraries) {
        StringBuilder sb = new StringBuilder("library template (sub-template) to use:");
        for (String lib : supportedLibraries.keySet()) {
            sb.append("\n").append(lib).append(" - ").append(supportedLibraries.get(lib));
        }
        return new CliOption(CodegenConstants.LIBRARY, sb.toString());
    }

    /**
     * Sanitize name (parameter, property, method, etc)
     *
     * @param name string to be sanitize
     * @return sanitized string
     */
    @Override
    @SuppressWarnings("static-method")
    public String sanitizeName(String name) {
        return sanitizeName(name, "\\W");
    }

    @Override
    public void setTemplatingEngine(TemplatingEngineAdapter templatingEngine) {
        this.templatingEngine = templatingEngine;
    }

    @Override
    public TemplatingEngineAdapter getTemplatingEngine() {
        return this.templatingEngine;
    }

    /**
     * Sanitize name (parameter, property, method, etc)
     *
     * @param name            string to be sanitize
     * @param removeCharRegEx a regex containing all char that will be removed
     * @return sanitized string
     */
    public String sanitizeName(String name, String removeCharRegEx) {
        return sanitizeName(name, removeCharRegEx, new ArrayList<>());
    }

    /**
     * Sanitize name (parameter, property, method, etc)
     *
     * @param name            string to be sanitize
     * @param removeCharRegEx a regex containing all char that will be removed
     * @param exceptionList   a list of matches which should not be sanitized (i.e exception)
     * @return sanitized string
     */
    @SuppressWarnings("static-method")
    public String sanitizeName(final String name, String removeCharRegEx, ArrayList<String> exceptionList) {
        // NOTE: performance wise, we should have written with 2 replaceAll to replace desired
        // character with _ or empty character. Below aims to spell out different cases we've
        // encountered so far and hopefully make it easier for others to add more special
        // cases in the future.

        // better error handling when map/array type is invalid
        if (name == null) {
            LOGGER.error("String to be sanitized is null. Default to ERROR_UNKNOWN");
            return "ERROR_UNKNOWN";
        }

        // if the name is just '$', map it to 'value' for the time being.
        if ("$".equals(name)) {
            return "value";
        }

        SanitizeNameOptions opts = new SanitizeNameOptions(name, removeCharRegEx, exceptionList);

        return sanitizedNameCache.get(opts, sanitizeNameOptions -> {
            String modifiable = sanitizeNameOptions.getName();
            List<String> exceptions = sanitizeNameOptions.getExceptions();
            // input[] => input
            modifiable = this.sanitizeValue(modifiable, "\\[\\]", "", exceptions);

            // input[a][b] => input_a_b
            modifiable = this.sanitizeValue(modifiable, "\\[", "_", exceptions);
            modifiable = this.sanitizeValue(modifiable, "\\]", "", exceptions);

            // input(a)(b) => input_a_b
            modifiable = this.sanitizeValue(modifiable, "\\(", "_", exceptions);
            modifiable = this.sanitizeValue(modifiable, "\\)", "", exceptions);

            // input.name => input_name
            modifiable = this.sanitizeValue(modifiable, "\\.", "_", exceptions);

            // input-name => input_name
            modifiable = this.sanitizeValue(modifiable, "-", "_", exceptions);

            // a|b => a_b
            modifiable = this.sanitizeValue(modifiable, "\\|", "_", exceptions);

            // input name and age => input_name_and_age
            modifiable = this.sanitizeValue(modifiable, " ", "_", exceptions);

            // /api/films/get => _api_films_get
            // \api\films\get => _api_films_get
            modifiable = modifiable.replaceAll("/", "_");
            modifiable = modifiable.replaceAll("\\\\", "_");

            // remove everything else other than word, number and _
            // $php_variable => php_variable
            if (allowUnicodeIdentifiers) { //could be converted to a single line with ?: operator
                modifiable = Pattern.compile(sanitizeNameOptions.getRemoveCharRegEx(), Pattern.UNICODE_CHARACTER_CLASS).matcher(modifiable).replaceAll("");
            } else {
                modifiable = modifiable.replaceAll(sanitizeNameOptions.getRemoveCharRegEx(), "");
            }
            return modifiable;
        });
    }

    private String sanitizeValue(String value, String replaceMatch, String replaceValue, List<String> exceptionList) {
        if (exceptionList.size() == 0 || !exceptionList.contains(replaceMatch)) {
            return value.replaceAll(replaceMatch, replaceValue);
        }
        return value;
    }

    /**
     * Sanitize tag
     *
     * @param tag Tag
     * @return Sanitized tag
     */
    @Override
    public String sanitizeTag(String tag) {
        tag = org.openapijsonschematools.codegen.utils.StringUtils.camelize(sanitizeName(tag));

        // tag starts with numbers
        if (tag.matches("^\\d.*")) {
            tag = "Class" + tag;
        }

        return tag;
    }

    protected LinkedHashMap<String, EnumValue> getEnumNameToValue(Schema schema) {
        if (schema.getEnum() == null) {
            return null;
        }

        List<Object> values = schema.getEnum();
        LinkedHashMap<String, EnumValue> enumNameToValue = new LinkedHashMap<>();
        int truncateIdx = 0;

        if (isRemoveEnumValuePrefix()) {
            String commonPrefix = findCommonPrefixOfVars(values);
            truncateIdx = commonPrefix.length();
        }

        List<String> xEnumVarnames = null;
        List<String> xEnumDescriptions = null;
        String xEnumVarnamesKey = "x-enum-varnames";
        String xEnumDescriptionsKey = "x-enum-descriptions";
        if (schema.getExtensions() != null) {
            if (schema.getExtensions().containsKey(xEnumVarnamesKey)) {
                xEnumVarnames = (List<String>) schema.getExtensions().get(xEnumVarnamesKey);
            }
            if (schema.getExtensions().containsKey(xEnumDescriptionsKey)) {
                xEnumDescriptions = (List<String>) schema.getExtensions().get(xEnumDescriptionsKey);
            }
        }

        Integer i = 0;
        for (Object value : values) {
            String description = null;
            if (xEnumDescriptions != null && xEnumDescriptions.size() > i) {
                description = xEnumDescriptions.get(i);
            }

            String enumName;
            if (xEnumVarnames != null && xEnumVarnames.size() > i) {
                enumName = xEnumVarnames.get(i);
            } else {
                if (truncateIdx == 0) {
                    enumName = String.valueOf(value);
                } else {
                    enumName = value.toString().substring(truncateIdx);
                    if (enumName.isEmpty()) {
                        enumName = value.toString();
                    }
                }
            }

            String usedName = toEnumVarName(enumName, schema);
            EnumValue enumValue = toEnumValue(value, description);
            enumNameToValue.put(usedName, enumValue);
            i += 1;
        }

        // TODO remove this
        if (enumUnknownDefaultCase) {
            // If the server adds new enum cases, that are unknown by an old spec/client, the client will fail to parse the network response.
            // With this option enabled, each enum will have a new case, 'unknown_default_open_api', so that when the server sends an enum case that is not known by the client/spec, they can safely fallback to this case.
            Map<String, Object> enumVar = new HashMap<>();
            String enumName = enumUnknownDefaultCaseName;

            String value;
            boolean typeIsString = schema.getType() != null && schema.getType().equals("string");
            if (typeIsString) {
                value = enumUnknownDefaultCaseName;
            } else {
                // This is a dummy value that attempts to avoid collisions with previously specified cases.
                // Int.max / 192
                // The number 192 that is used to calculate this random value, is the Swift Evolution proposal for frozen/non-frozen enums.
                // [SE-0192](https://github.com/apple/swift-evolution/blob/master/proposals/0192-non-exhaustive-enums.md)
                // Since this functionality was born in the Swift 5 generator and latter on broth to all generators
                // https://github.com/OpenAPITools/openapi-generator/pull/11013
                value = String.valueOf(11184809);
            }

            String usedName = toEnumVarName(enumName, schema);
            EnumValue enumValue = toEnumValue(value, null);
            enumNameToValue.put(usedName, enumValue);
        }

        return enumNameToValue;
    }

    /**
     * If the pattern misses the delimiter, add "/" to the beginning and end
     * Otherwise, return the original pattern
     *
     * @param pattern the pattern (regular expression)
     * @return the pattern with delimiter
     */
    public CodegenPatternInfo addRegularExpressionDelimiter(String pattern) {
        if (StringUtils.isEmpty(pattern)) {
            return new CodegenPatternInfo(pattern, null);
        }

        String usedPattern = pattern;
        if (!pattern.matches("^/.*")) {
            usedPattern = "/" + pattern.replaceAll("/", "\\\\/") + "/";
        }

        return new CodegenPatternInfo(usedPattern, null);
    }

    /**
     * reads propertyKey from additionalProperties, converts it to a boolean and
     * writes it back to additionalProperties to be usable as a boolean in
     * mustache files.
     *
     * @param propertyKey property key
     * @return property value as boolean
     */
    public boolean convertPropertyToBooleanAndWriteBack(String propertyKey) {
        boolean result = convertPropertyToBoolean(propertyKey);
        writePropertyBack(propertyKey, result);
        return result;
    }

    /**
     * Provides an override location, if any is specified, for the .openapi-generator-ignore.
     * <p>
     * This is originally intended for the first generation only.
     *
     * @return a string of the full path to an override ignore file.
     */
    @Override
    public String getIgnoreFilePathOverride() {
        return ignoreFilePathOverride;
    }

    /**
     * Sets an override location for the '.openapi-generator-ignore' location for the first code generation.
     *
     * @param ignoreFileOverride The full path to an ignore file
     */
    @Override
    public void setIgnoreFilePathOverride(final String ignoreFileOverride) {
        this.ignoreFilePathOverride = ignoreFileOverride;
    }

    public boolean convertPropertyToBoolean(String propertyKey) {
        final Object booleanValue = additionalProperties.get(propertyKey);
        boolean result = Boolean.FALSE;
        if (booleanValue instanceof Boolean) {
            result = (Boolean) booleanValue;
        } else if (booleanValue instanceof String) {
            result = Boolean.parseBoolean((String) booleanValue);
        } else {
            LOGGER.warn("The value (generator's option) must be either boolean or string. Default to `false`.");
        }
        return result;
    }

    public void writePropertyBack(String propertyKey, boolean value) {
        additionalProperties.put(propertyKey, value);
    }

    private List<Map<String, Object>> getScopes(Scopes scopes) {
        if (scopes != null && !scopes.isEmpty()) {
            List<Map<String, Object>> newScopes = new ArrayList<>();
            for (Map.Entry<String, String> scopeEntry : scopes.entrySet()) {
                Map<String, Object> scope = new HashMap<>();
                scope.put("scope", scopeEntry.getKey());
                scope.put("description", escapeText(scopeEntry.getValue()));
                newScopes.add(scope);
            }
            return newScopes;
        }
        return null;
    }

    public static Set<String> getConsumesInfo(OpenAPI openAPI, Operation operation) {
        RequestBody requestBody = ModelUtils.getReferencedRequestBody(openAPI, operation.getRequestBody());

        if (requestBody == null || requestBody.getContent() == null || requestBody.getContent().isEmpty()) {
            return Collections.emptySet(); // return empty set
        }
        return requestBody.getContent().keySet();
    }

    public boolean hasFormParameter(OpenAPI openAPI, Operation operation) {
        Set<String> consumesInfo = getConsumesInfo(openAPI, operation);

        if (consumesInfo == null || consumesInfo.isEmpty()) {
            return false;
        }

        for (String consume : consumesInfo) {
            if (consume != null &&
                    (consume.toLowerCase(Locale.ROOT).startsWith("application/x-www-form-urlencoded") ||
                            consume.toLowerCase(Locale.ROOT).startsWith("multipart"))) {
                return true;
            }
        }

        return false;
    }

    public boolean hasBodyParameter(OpenAPI openAPI, Operation operation) {
        RequestBody requestBody = ModelUtils.getReferencedRequestBody(openAPI, operation.getRequestBody());
        if (requestBody == null) {
            return false;
        }

        Schema schema = ModelUtils.getSchemaFromRequestBody(requestBody);
        return ModelUtils.getReferencedSchema(openAPI, schema) != null;
    }

    private LinkedHashSet<String> getProducesInfo(ApiResponse inputResponse) {
        ApiResponse response = ModelUtils.getReferencedApiResponse(this.openAPI, inputResponse);
        if (response == null || response.getContent() == null || response.getContent().isEmpty()) {
            return null;
        }

        Set<String> contentKeys = response.getContent().keySet();
        if (contentKeys == null || contentKeys.isEmpty()) {
            return null;
        }
        LinkedHashSet<String> produces = new LinkedHashSet<>();
        for (String key : contentKeys) {
            // escape quotation to avoid code injection, "*/*" is a special case, do nothing
            String encodedKey = "*/*".equals(key) ? key : escapeQuotationMark(key);
            produces.add(encodedKey);
        }
        return produces;
    }

    /**
     * returns the list of MIME types the APIs can produce
     *
     * @param openAPI   current specification instance
     * @param operation Operation
     * @return a set of MIME types
     */
    public static Set<String> getProducesInfo(final OpenAPI openAPI, final Operation operation) {
        if (operation.getResponses() == null || operation.getResponses().isEmpty()) {
            return null;
        }

        Set<String> produces = new ConcurrentSkipListSet<>();

        for (ApiResponse r : operation.getResponses().values()) {
            ApiResponse response = ModelUtils.getReferencedApiResponse(openAPI, r);
            if (response.getContent() != null) {
                produces.addAll(response.getContent().keySet());
            }
        }

        return produces;
    }

    @Override
    public CodegenType getTag() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getHelp() {
        return null;
    }

    protected LinkedHashMap<CodegenKey, CodegenMediaType> getContent(Content content, String sourceJsonPath) {
        if (content == null) {
            return null;
        }
        LinkedHashMap<CodegenKey, CodegenMediaType> cmtContent = new LinkedHashMap<>();
        for (Entry<String, MediaType> contentEntry : content.entrySet()) {
            String contentType = contentEntry.getKey();
            MediaType mt = contentEntry.getValue();
            LinkedHashMap<String, CodegenEncoding> ceMap = null;
            if (mt.getEncoding() != null) {
                ceMap = new LinkedHashMap<>();
                Map<String, Encoding> encMap = mt.getEncoding();
                for (Entry<String, Encoding> encodingEntry : encMap.entrySet()) {
                    String encodingPropertyName = encodingEntry.getKey();
                    Encoding enc = encodingEntry.getValue();
                    Map<String, CodegenHeader> headers = new HashMap<>();
                    if (enc.getHeaders() != null) {
                        Map<String, Header> encHeaders = enc.getHeaders();
                        for (Entry<String, Header> headerEntry : encHeaders.entrySet()) {
                            String headerName = headerEntry.getKey();
                            Header header = headerEntry.getValue();
                            String usedSourceJsonPath = sourceJsonPath + "/" + ModelUtils.encodeSlashes(contentType) + "/encoding/" + encodingPropertyName + "/headers/" + headerName;
                            CodegenHeader codegenHeader = fromHeader(header, usedSourceJsonPath);
                            headers.put(headerName, codegenHeader);
                        }
                    }
                    CodegenEncoding ce = new CodegenEncoding(
                            enc.getContentType(),
                            headers,
                            enc.getStyle().toString(),
                            enc.getExplode() == null ? false : enc.getExplode().booleanValue(),
                            enc.getAllowReserved() == null ? false : enc.getAllowReserved().booleanValue()
                    );
                    ceMap.put(encodingPropertyName, ce);
                }
            }
            CodegenSchema schemaProp = null;
            if (mt.getSchema() != null) {
                String usedSourceJsonPath = sourceJsonPath + "/" + ModelUtils.encodeSlashes(contentType) + "/schema";
                schemaProp = fromSchema(mt.getSchema(), usedSourceJsonPath, usedSourceJsonPath);
            }
            HashMap<String, SchemaTestCase> schemaTestCases = null;
            if (mt.getExtensions() != null && mt.getExtensions().containsKey(xSchemaTestExamplesKey)) {
                Object objNodeWithRef = mt.getExtensions().get(xSchemaTestExamplesKey);
                if (objNodeWithRef instanceof LinkedHashMap) {
                    LinkedHashMap<String, String> nodeWithRef = (LinkedHashMap<String, String>) objNodeWithRef;
                    String refKey = "$ref";
                    String refToTestCases = nodeWithRef.getOrDefault(refKey, null);
                    if (refToTestCases != null) {
                        schemaTestCases = extractSchemaTestCases(refToTestCases);
                    }
                }
            }

            CodegenMediaType codegenMt = new CodegenMediaType(schemaProp, ceMap, schemaTestCases);
            CodegenKey ck = getKey(contentType);
            cmtContent.put(ck, codegenMt);
        }
        return cmtContent;
    }

    public String toRequestBodyFilename(String componentName) {
        return toModuleFilename(componentName);
    }

    protected String toRefModule(String ref, String sourceJsonPath, String expectedComponentType) {
        if (ref == null) {
            return null;
        }
        // ref #/components/schemas/SomeModel -> some_model
        // ref #/components/requestBodies/SomeBody -> some_body
        // ref #/components/parameters/SomeParam -> some_param
        // ref #/components/headers/SomeHeader -> some_header

        String[] refPieces = ref.split("/");
        if (!ref.startsWith("#/components/")) {
            throw new RuntimeException("The ref must be to a component");
        }
        if (refPieces.length != 4) {
            throw new RuntimeException("The ref must be to a named key in one of the components");
        }
        if (!refPieces[2].equals(expectedComponentType)) {
            throw new RuntimeException("Incorrect component type in ref, expected "+expectedComponentType+" and saw "+refPieces[2]);
        }
        switch (expectedComponentType) {
            case "requestBodies":
                return toRequestBodyFilename(refPieces[3]);
            case "responses":
                return toResponseModuleName(refPieces[3]);
            case "headers":
                return toHeaderFilename(refPieces[3]);
            case "parameters":
                return toParameterFilename(refPieces[3]);
            case "schemas":
                if (ref.equals(sourceJsonPath)) {
                    // property is of type self
                    return null;
                }
                return getKey(refPieces[3]).snakeCase;
        }
        return null;
    }

    private CodegenKey getName(String expectedComponentType, String currentJsonPath) {
        // last fragment info
        // requestBody -> requestBody
        // headers -> headerName
        // parameters/i -> i
        // components/parameters/someParam -> someParam
        String usedName;
        if (expectedComponentType.equals("schemas")) {
            usedName = getUsedName(currentJsonPath);
        } else {
            usedName = currentJsonPath.substring(currentJsonPath.lastIndexOf("/") + 1);
        }
        CodegenKey name = getKey(usedName, expectedComponentType);
        return name;
    }

    private void setSchemaLocationInfo(String ref, String sourceJsonPath, String currentJsonPath, CodegenSchema instance) {
        String expectedComponentType = "schemas";
        if (ref != null) {
            String refModule = toRefModule(ref, sourceJsonPath, expectedComponentType);
            String refClass = toRefClass(ref, sourceJsonPath, expectedComponentType);
            CodegenSchemaCacheKey ck = new CodegenSchemaCacheKey(ref, ref);
            CodegenSchema cs = codegenSchemaCache.computeIfAbsent(ck, s -> new CodegenSchema());
            instance.refInfo = new CodegenRefInfo<>(cs, refClass, refModule);
        }
        if (currentJsonPath == null) {
            return;
        }
        CodegenKey name = getName(expectedComponentType, currentJsonPath);
        instance.jsonPathPiece = name;
        String[] pathPieces = currentJsonPath.split("/");
        // #/components/schemas/A
        if (pathPieces.length == 4 && currentJsonPath.startsWith("#/components/"+expectedComponentType+"/")) {
            instance.componentModule = toComponentModule(pathPieces[3], expectedComponentType);
        }
    }

    public CodegenRequestBody fromRequestBody(RequestBody requestBody, String sourceJsonPath) {
        // process body parameter
        if (requestBody == null) {
            String msg = "body in fromRequestBody cannot be null!";
            LOGGER.error(msg);
            throw new RuntimeException(msg);
        }
        CodegenRequestBody codegenRequestBody = codegenRequestBodyCache.getOrDefault(sourceJsonPath, null);
        if (codegenRequestBody != null) {
            return codegenRequestBody;
        }

        String ref = requestBody.get$ref();
        String expectedComponentType = "requestBodies";
        CodegenRefInfo refInfo = null;
        TreeSet<String> imports = null;
        if (ref != null) {
            String refModule = toRefModule(ref, sourceJsonPath, expectedComponentType);
            String refClass = toRefClass(ref, sourceJsonPath, expectedComponentType);
            CodegenRequestBody rb = fromRequestBody(ModelUtils.getReferencedRequestBody(openAPI, requestBody), ref);
            refInfo = new CodegenRefInfo<>(rb, refClass, refModule);
            imports = new TreeSet<>();
            imports.add(getImport(refInfo));
        }
        CodegenKey name = getName(expectedComponentType, sourceJsonPath);
        String[] pathPieces = sourceJsonPath.split("/");
        // #/components/requestBodies/A
        String componentModule = null;
        if (pathPieces.length == 4 && sourceJsonPath.startsWith("#/components/"+expectedComponentType+"/")) {
            componentModule = toComponentModule(pathPieces[3], expectedComponentType);
        }

        String description = escapeText(requestBody.getDescription());
        String unescapedDescription = requestBody.getDescription();
        Map<String, Object> vendorExtensions = null;
        if (requestBody.getExtensions() != null && !requestBody.getExtensions().isEmpty()) {
            vendorExtensions = requestBody.getExtensions();
        }
        boolean required = false;
        if (requestBody.getRequired() != null) {
            required = requestBody.getRequired();
        }
        LinkedHashMap<CodegenKey, CodegenMediaType> content = null;
        if (requestBody.getContent() != null) {
            content = getContent(requestBody.getContent(), sourceJsonPath + "/content");
        }
        // set the parameter's example value
        // should be overridden by lang codegen
        TreeSet<String> finalImports = imports;
        String finalComponentModule = componentModule;
        CodegenRefInfo finalRefInfo = refInfo;
        Map<String, Object> finalVendorExtensions = vendorExtensions;
        boolean finalRequired = required;
        LinkedHashMap<CodegenKey, CodegenMediaType> finalContent = content;
        codegenRequestBody = new CodegenRequestBody(description, unescapedDescription, finalVendorExtensions, finalRequired, finalContent, finalImports, finalComponentModule, name, finalRefInfo);
        codegenRequestBodyCache.put(sourceJsonPath, codegenRequestBody);
        return codegenRequestBody;
    }

    public CodegenKey getKey(String key, String expectedComponentType) {
        String usedKey = handleSpecialCharacters(key);
        boolean isValid = isValid(usedKey);
        String snakeCaseName = null;
        String camelCaseName = null;
        switch (expectedComponentType) {
            case "schemas":
                snakeCaseName = toModelFilename(usedKey);
                camelCaseName = toModelName(usedKey);
                break;
            case "parameters":
                snakeCaseName = toParameterFilename(usedKey);
                camelCaseName = toModelName(usedKey);
                break;
            case "requestBodies":
                snakeCaseName = toRequestBodyFilename(usedKey);
                camelCaseName = toModelName(usedKey);
                break;
            case "headers":
                snakeCaseName = toHeaderFilename(usedKey);
                camelCaseName = toModelName(usedKey);
                break;
            case "responses":
                snakeCaseName = toResponseModuleName(usedKey);
                camelCaseName = toModelName(usedKey);
                break;
        }
        CodegenKey ck = new CodegenKey(
                usedKey,
                isValid,
                snakeCaseName,
                camelCaseName
        );
        return ck;
    }

    public CodegenKey getKey(String key) {
        String usedKey = handleSpecialCharacters(key);
        boolean isValid = isValid(usedKey);
        CodegenKey ck = new CodegenKey(
                usedKey,
                isValid,
                toModelFilename(usedKey),
                toModelName(usedKey)
        );
        return ck;
    }

    protected LinkedHashMap<CodegenKey, CodegenSchema> getRequiredProperties(LinkedHashSet<String> required, LinkedHashMap<CodegenKey, CodegenSchema> properties, Object schemaAdditionalProperties, CodegenSchema additionalProperties) {
        if (required.isEmpty()) {
            return null;
        }
        /*
        this should be called after vars and additionalProperties are set
        Features added by storing codegenProperty values:
        - refClass stores reference to additionalProperties definition
        - baseName stores original name (can be invalid in a programming language)
        - nameInSnakeCase can store valid name for a programming language
         */
        LinkedHashMap<CodegenKey, CodegenSchema> requiredProperties = new LinkedHashMap<>();
        for (String requiredPropertyName: required) {
            // required property is defined in properties, value is that CodegenSchema
            CodegenKey key = getKey(requiredPropertyName);
            if (properties != null && properties.containsKey(key)) {
                // get cp from property
                CodegenSchema prop = properties.get(key);
                if (prop != null) {
                    requiredProperties.put(key, prop);
                } else {
                    throw new RuntimeException("Property " + requiredPropertyName + " is missing from getVars");
                }
            } else if (schemaAdditionalProperties instanceof Boolean && Boolean.FALSE.equals(schemaAdditionalProperties)) {
                // required property is not defined in properties, and additionalProperties is false, value is null
                requiredProperties.put(key, null);
            } else {
                // required property is not defined in properties, and additionalProperties is true or unset value is CodegenSchema made from empty schema
                // required property is not defined in properties, and additionalProperties is schema, value is CodegenSchema made from schema
                if (supportsAdditionalPropertiesWithComposedSchema && !disallowAdditionalPropertiesIfNotPresent) {
                    CodegenSchema prop;
                    if (schemaAdditionalProperties == null) {
                        // additionalProperties is null
                        // there is NO schema definition for this so the json paths are null
                        prop = requiredAddPropUnsetSchema;
                    } else if (schemaAdditionalProperties instanceof Boolean && Boolean.TRUE.equals(schemaAdditionalProperties)) {
                        // additionalProperties is True
                        prop = additionalProperties;
                    } else {
                        // additionalProperties is schema
                        prop = additionalProperties;
                    }
                    requiredProperties.put(key, prop);
                }
            }
        }
        return requiredProperties;
    }

    protected void addOption(String key, String description, String defaultValue) {
        CliOption option = new CliOption(key, description);
        if (defaultValue != null)
            option.defaultValue(defaultValue);
        cliOptions.add(option);
    }

    protected void updateOption(String key, String defaultValue) {
        for (CliOption cliOption : cliOptions) {
            if (cliOption.getOpt().equals(key)) {
                cliOption.setDefault(defaultValue);
                break;
            }
        }
    }

    protected void removeOption(String key) {
        for (int i = 0; i < cliOptions.size(); i++) {
            if (key.equals(cliOptions.get(i).getOpt())) {
                cliOptions.remove(i);
                break;
            }
        }
    }

    protected void addSwitch(String key, String description, Boolean defaultValue) {
        CliOption option = CliOption.newBoolean(key, description);
        if (defaultValue != null)
            option.defaultValue(defaultValue.toString());
        cliOptions.add(option);
    }

    /**
     * generates OpenAPI specification file in YAML format
     *
     * @param objs map of object
     */
    public void generateYAMLSpecFile(Map<String, Object> objs) {
        OpenAPI openAPI = (OpenAPI) objs.get("openAPI");
        String yaml = SerializerUtils.toYamlString(openAPI);
        if (yaml != null) {
            objs.put("openapi-yaml", yaml);
        }
    }

    private String removeTrailingSlash(String value) {
        return StringUtils.removeEnd(value, "/");
    }

    @Override
    public List<CodegenServer> fromServers(List<Server> servers) {
        if (servers == null) {
            return Collections.emptyList();
        }
        List<CodegenServer> codegenServers = new LinkedList<>();
        for (Server server : servers) {
            CodegenServer cs = new CodegenServer(
                removeTrailingSlash(server.getUrl()),  // because trailing slash has no impact on server and path needs slash as first char
                escapeText(server.getDescription()),
                fromServerVariables(server.getVariables())
            );
            codegenServers.add(cs);
        }
        return codegenServers;
    }

    @Override
    public List<CodegenServerVariable> fromServerVariables(Map<String, ServerVariable> variables) {
        if (variables == null) {
            return Collections.emptyList();
        }

        Map<String, String> variableOverrides = serverVariableOverrides();

        List<CodegenServerVariable> codegenServerVariables = new LinkedList<>();
        for (Entry<String, ServerVariable> variableEntry : variables.entrySet()) {
            ServerVariable variable = variableEntry.getValue();
            List<String> enums = variable.getEnum();
            // Sets the override value for a server variable pattern.
            // NOTE: OpenAPI Specification doesn't prevent multiple server URLs with variables. If multiple objects have the same
            //       variables pattern, user overrides will apply to _all_ of these patterns. We may want to consider indexed overrides.
            String value;
            if (variableOverrides != null && !variableOverrides.isEmpty()) {
                value = variableOverrides.getOrDefault(variableEntry.getKey(), variable.getDefault());

                if (enums != null && !enums.isEmpty() && !enums.contains(value)) {
                    if (LOGGER.isWarnEnabled()) { // prevents calculating StringUtils.join when debug isn't enabled
                        LOGGER.warn("Variable override of '{}' is not listed in the enum of allowed values ({}).", value, StringUtils.join(enums, ","));
                    }
                }
            } else {
                value = variable.getDefault();
            }
            CodegenServerVariable codegenServerVariable = new CodegenServerVariable(
                    variableEntry.getKey(),
                    variable.getDefault(),
                    escapeText(variable.getDescription()),
                    enums,
                    value
            );
            codegenServerVariables.add(codegenServerVariable);
        }
        return codegenServerVariables;
    }

    /**
     * Post-process the auto-generated file, e.g. using go-fmt to format the Go code. The file type can be "model-test",
     * "model-doc", "model", "api", "api-test", "api-doc", "supporting-mustache", "supporting-common",
     * "openapi-generator-ignore", "openapi-generator-version"
     * <p>
     * TODO: store these values in enum instead
     *
     * @param file     file to be processed
     * @param fileType file type
     */
    @Override
    public void postProcessFile(File file, String fileType) {
        LOGGER.debug("Post processing file {} ({})", file, fileType);
    }

    /**
     * Boolean value indicating the state of the option for post-processing file using environment variables.
     *
     * @return true if the option is enabled
     */
    @Override
    public boolean isEnablePostProcessFile() {
        return enablePostProcessFile;
    }

    /**
     * Set the boolean value indicating the state of the option for post-processing file using environment variables.
     *
     * @param enablePostProcessFile true to enable post-processing file
     */
    @Override
    public void setEnablePostProcessFile(boolean enablePostProcessFile) {
        this.enablePostProcessFile = enablePostProcessFile;
    }

    /**
     * Get the boolean value indicating the state of the option for updating only changed files
     */
    @Override
    public boolean isEnableMinimalUpdate() {
        return enableMinimalUpdate;
    }

    /**
     * Set the boolean value indicating the state of the option for updating only changed files
     *
     * @param enableMinimalUpdate true to enable minimal update
     */
    @Override
    public void setEnableMinimalUpdate(boolean enableMinimalUpdate) {
        this.enableMinimalUpdate = enableMinimalUpdate;
    }

    /**
     * Indicates whether the codegen configuration should treat documents as strictly defined by the OpenAPI specification.
     *
     * @return true to act strictly upon spec documents, potentially modifying the spec to strictly fit the spec.
     */
    @Override
    public boolean isStrictSpecBehavior() {
        return this.strictSpecBehavior;
    }

    /**
     * Sets the boolean valid indicating whether generation will work strictly against the specification, potentially making
     * minor changes to the input document.
     *
     * @param strictSpecBehavior true if we will behave strictly, false to allow specification documents which pass validation to be loosely interpreted against the spec.
     */
    @Override
    public void setStrictSpecBehavior(final boolean strictSpecBehavior) {
        this.strictSpecBehavior = strictSpecBehavior;
    }

    @Override
    public FeatureSet getFeatureSet() {
        return this.generatorMetadata.getFeatureSet();
    }

    /**
     * Get the boolean value indicating whether to remove enum value prefixes
     */
    @Override
    public boolean isRemoveEnumValuePrefix() {
        return this.removeEnumValuePrefix;
    }

    /**
     * Set the boolean value indicating whether to remove enum value prefixes
     *
     * @param removeEnumValuePrefix true to enable enum value prefix removal
     */
    @Override
    public void setRemoveEnumValuePrefix(final boolean removeEnumValuePrefix) {
        this.removeEnumValuePrefix = removeEnumValuePrefix;
    }

    //// Following methods are related to the "useOneOfInterfaces" feature

    /**
     * Add "x-one-of-name" extension to a given oneOf schema (assuming it has at least 1 oneOf elements)
     *
     * @param s    schema to add the extension to
     * @param name name of the parent oneOf schema
     */
    public void addOneOfNameExtension(ComposedSchema s, String name) {
        if (s.getOneOf() != null && s.getOneOf().size() > 0) {
            s.addExtension("x-one-of-name", name);
        }
    }

    public void addImportsToOneOfInterface(List<Map<String, String>> imports) {
    }
    //// End of methods related to the "useOneOfInterfaces" feature

    protected void modifyFeatureSet(Consumer<FeatureSet.Builder> processor) {
        FeatureSet.Builder builder = getFeatureSet().modify();
        processor.accept(builder);
        this.generatorMetadata = GeneratorMetadata.newBuilder(generatorMetadata)
                .featureSet(builder.build()).build();
    }

    /**
     * An map entry for cached sanitized names.
     */
    private static class SanitizeNameOptions {
        public SanitizeNameOptions(String name, String removeCharRegEx, List<String> exceptions) {
            this.name = name;
            this.removeCharRegEx = removeCharRegEx;
            if (exceptions != null) {
                this.exceptions = Collections.unmodifiableList(exceptions);
            } else {
                this.exceptions = Collections.emptyList();
            }
        }

        public String getName() {
            return name;
        }

        public String getRemoveCharRegEx() {
            return removeCharRegEx;
        }

        public List<String> getExceptions() {
            return exceptions;
        }

        private String name;
        private String removeCharRegEx;
        private List<String> exceptions;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            SanitizeNameOptions that = (SanitizeNameOptions) o;
            return Objects.equals(getName(), that.getName()) &&
                    Objects.equals(getRemoveCharRegEx(), that.getRemoveCharRegEx()) &&
                    Objects.equals(getExceptions(), that.getExceptions());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getName(), getRemoveCharRegEx(), getExceptions());
        }
    }

    /**
     * Returns the additionalProperties Schema for the specified input schema.
     * <p>
     * The additionalProperties keyword is used to control the handling of additional, undeclared
     * properties, that is, properties whose names are not listed in the properties keyword.
     * The additionalProperties keyword may be either a boolean or an object.
     * If additionalProperties is a boolean and set to false, no additional properties are allowed.
     * By default when the additionalProperties keyword is not specified in the input schema,
     * any additional properties are allowed. This is equivalent to setting additionalProperties
     * to the boolean value True or setting additionalProperties: {}
     *
     * @param schema the input schema that may or may not have the additionalProperties keyword.
     * @return the Schema of the additionalProperties. The null value is returned if no additional
     * properties are allowed.
     */
    protected Schema getAdditionalProperties(Schema schema) {
        return ModelUtils.getAdditionalProperties(openAPI, schema);
    }

    /**
     * Check if the given MIME is a JSON MIME.
     * JSON MIME examples:
     * application/json
     * application/json; charset=UTF8
     * APPLICATION/JSON
     *
     * @param mime MIME string
     * @return true if the input matches the JSON MIME
     */
    protected static boolean isJsonMimeType(String mime) {
        return mime != null && (JSON_MIME_PATTERN.matcher(mime).matches());
    }

    /**
     * Check if the given MIME is a JSON Vendor MIME.
     * JSON MIME examples:
     * application/vnd.mycompany+json
     * application/vnd.mycompany.resourceA.version1+json
     *
     * @param mime MIME string
     * @return true if the input matches the JSON vendor MIME
     */
    protected static boolean isJsonVendorMimeType(String mime) {
        return mime != null && JSON_VENDOR_MIME_PATTERN.matcher(mime).matches();
    }

    private List<CodegenSchema> getComposedProperties(List<Schema> xOfCollection, String collectionName, String sourceJsonPath, String currentJsonPath) {
        if (xOfCollection == null) {
            return null;
        }
        List<CodegenSchema> xOf = new ArrayList<>();
        int i = 0;
        for (Schema xOfSchema : xOfCollection) {
            CodegenSchema cp = fromSchema(xOfSchema, sourceJsonPath, currentJsonPath + "/" + collectionName + "/" + String.valueOf(i));
            xOf.add(cp);
            i += 1;
        }
        return xOf;
    }

    @Override
    public String requestBodyFileFolder(String componentName) {
        return outputFolder + File.separatorChar + packagePath() + File.separatorChar + "components" + File.separatorChar + "request_bodies" + toRequestBodyFilename(componentName);
    }

    @Override
    public String responseFileFolder(String componentName) {
        return outputFolder + File.separatorChar + packagePath() + File.separatorChar + "components" + File.separatorChar + "responses" + File.separatorChar + toResponseModuleName(componentName);
    }

    @Override
    public String defaultTemplatingEngine() {
        return "mustache";
    }

    @Override
    public GeneratorLanguage generatorLanguage() {
        return GeneratorLanguage.JAVA;
    }

    @Override
    public String generatorLanguageVersion() {
        return null;
    }

    @Override
    public List<VendorExtension> getSupportedVendorExtensions() {
        return new ArrayList<>();
    }

    @Override
    public boolean getUseInlineModelResolver() { return true; }

    /*
    A function to convert yaml or json ingested strings like property names
    And convert special characters like newline, tab, carriage return
    Into strings that can be rendered in the language that the generator will output to
    */
    protected String handleSpecialCharacters(String name) { return name; }

    public String getItemsName(Schema containingSchema, String containingSchemaName) {
        if (containingSchema.getExtensions() != null && containingSchema.getExtensions().get("x-item-name") != null) {
            return containingSchema.getExtensions().get("x-item-name").toString();
        }
        return toVarName(containingSchemaName);
    }

    public String getAdditionalPropertiesName() {
        return "additional_properties";
    }


    /**
     * Used to ensure that null or Schema is returned given an input Boolean/Schema/null
     * This will be used in openapi 3.1.0 spec processing to ensure that Booleans become Schemas
     * Because our generators only understand Schemas
     * Note: use getIsBooleanSchemaTrue or getIsBooleanSchemaFalse on the OpenApiSchema
     * if you need to be able to detect if the original schema's value was true or false
     *
     * @param schema the input Boolean or Schema data to convert to a Schema
     * @return Schema the input data converted to a Schema if possible
     */
    protected Schema getSchemaFromBooleanOrSchema(Object schema) {
        if (schema instanceof Boolean) {
            if (Boolean.TRUE.equals(schema)) {
                return trueSchema;
            } else if (Boolean.FALSE.equals(schema)) {
                return falseSchema;
            }
            // null case
            return null;
        } else if (schema instanceof Schema) {
            if (schema == null) {
                return null;
            }
            return (Schema) schema;
        } else if (schema == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid schema type; type must be Boolean or Schema");
    }
}
