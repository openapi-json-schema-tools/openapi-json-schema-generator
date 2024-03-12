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

package org.openapijsonschematools.codegen.generators;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.Ticker;
import com.github.curiousoddman.rgxgen.RgxGen;
import com.github.curiousoddman.rgxgen.config.RgxGenOption;
import com.github.curiousoddman.rgxgen.config.RgxGenProperties;
import com.google.common.collect.ImmutableMap;
import com.samskivert.mustache.Mustache;
import com.samskivert.mustache.Mustache.Compiler;
import com.samskivert.mustache.Mustache.Lambda;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.PathItem;
import io.swagger.v3.oas.models.Paths;
import io.swagger.v3.oas.models.SpecVersion;
import io.swagger.v3.oas.models.security.OAuthFlow;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.Pair;
import org.openapijsonschematools.codegen.generators.models.CliOption;
import org.openapijsonschematools.codegen.common.CodegenConstants;
import org.openapijsonschematools.codegen.config.GlobalSettings;
import org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorLanguage;
import org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorType;
import org.openapijsonschematools.codegen.generators.generatormetadata.features.DataTypeFeature;
import org.openapijsonschematools.codegen.generators.generatormetadata.features.GlobalFeature;
import org.openapijsonschematools.codegen.generators.generatormetadata.features.SchemaFeature;
import org.openapijsonschematools.codegen.generators.generatormetadata.features.WireFormatFeature;
import org.openapijsonschematools.codegen.generators.models.VendorExtension;
import org.openapijsonschematools.codegen.generators.openapimodels.ArrayListWithContext;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenCallback;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenDiscriminator;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenEncoding;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenHeader;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenKey;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenMap;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenMediaType;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenOauthFlow;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenOauthFlows;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenOperation;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenParametersInfo;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenParameter;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenPathItem;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenPatternInfo;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenRefInfo;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenRequestBody;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenResponse;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenSchema;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenSecurityRequirementObject;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenSecurityRequirementValue;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenSecurityScheme;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenServer;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenList;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenTag;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenText;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenXml;
import org.openapijsonschematools.codegen.generators.openapimodels.EnumInfo;
import org.openapijsonschematools.codegen.generators.openapimodels.EnumValue;
import org.openapijsonschematools.codegen.generators.openapimodels.LinkedHashMapWithContext;
import org.openapijsonschematools.codegen.generators.openapimodels.MapBuilder;
import org.openapijsonschematools.codegen.generators.openapimodels.PairCacheKey;
import org.openapijsonschematools.codegen.generators.openapimodels.ParameterCollection;
import org.openapijsonschematools.codegen.generators.openapimodels.SchemaTestCase;
import org.openapijsonschematools.codegen.templating.SupportingFile;
import org.openapijsonschematools.codegen.common.SerializerUtils;
import org.openapijsonschematools.codegen.templating.TemplatingEngineLoader;
import org.openapijsonschematools.codegen.templating.mustache.CamelCaseLambda;
import org.openapijsonschematools.codegen.templating.mustache.IndentedLambda;
import org.openapijsonschematools.codegen.templating.mustache.LowercaseLambda;
import org.openapijsonschematools.codegen.templating.mustache.SnakecaseLambda;
import org.openapijsonschematools.codegen.templating.mustache.TitlecaseLambda;
import org.openapijsonschematools.codegen.templating.mustache.UppercaseLambda;
import org.openapijsonschematools.codegen.common.ModelUtils;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenDiscriminator.MappedModel;
import org.openapijsonschematools.codegen.templating.TemplatingEngineAdapter;
import org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet;
import org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata;
import org.openapijsonschematools.codegen.generators.generatormetadata.Stability;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.swagger.v3.core.util.Json;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.examples.Example;
import io.swagger.v3.oas.models.headers.Header;
import io.swagger.v3.oas.models.media.*;
import io.swagger.v3.oas.models.parameters.*;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.security.OAuthFlows;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import io.swagger.v3.oas.models.servers.ServerVariable;

import javax.validation.constraints.NotNull;

import static org.openapijsonschematools.codegen.common.StringUtils.camelize;

@SuppressWarnings("rawtypes")
public class DefaultGenerator implements Generator {
    private final Logger LOGGER = LoggerFactory.getLogger(DefaultGenerator.class);

    public static FeatureSet DefaultFeatureSet;

    // A cache of sanitized words. The sanitizeName() method is invoked many times with the same
    // arguments, this cache is used to optimized performance.
    private static final Cache<SanitizeNameOptions, String> sanitizedNameCache;
    private static final String xSchemaTestExamplesKey = "x-schema-test-examples";
    private static final String xSchemaTestExamplesRefPrefix = "#/components/x-schema-test-examples/";
    protected static Schema falseSchema;
    protected static Schema trueSchema = new Schema();

    protected String requestBodiesIdentifier = "request_bodies";
    protected String securitySchemesIdentifier = "security_schemes";
    protected String requestBodyIdentifier = "request_body";
    private final Pattern patternRegex = Pattern.compile("^/?(.+?)/?([simu]{0,4})$");
    private final CodegenKey additionalPropertySampleKey = new CodegenKey("someAdditionalProperty", true, "additional_property", "AdditionalProperty", "additional-property", "additionalProperty");



    protected String templateEngineName;
    protected String headersSchemaFragment = "Headers";
    protected static final Set<String> operationVerbs = Set.of("get", "put", "post", "delete", "options", "head", "patch", "trace");

    static {
        DefaultFeatureSet = FeatureSet.newBuilder()
                .includeDataTypeFeatures(
                        DataTypeFeature.Int32, DataTypeFeature.Int64, DataTypeFeature.Integer, DataTypeFeature.Float, DataTypeFeature.Double, DataTypeFeature.Number,
                        DataTypeFeature.String,
                        DataTypeFeature.Boolean, DataTypeFeature.Date, DataTypeFeature.DateTime,
                        DataTypeFeature.Array, DataTypeFeature.Object, DataTypeFeature.Enum, DataTypeFeature.Uuid,
                        DataTypeFeature.Null, DataTypeFeature.AnyType
                )
                .includeDocumentationFeatures(
                )
                .includeComponentsFeatures(
                )
                .includeGlobalFeatures(
                        GlobalFeature.Info
                )
                .includeSchemaFeatures(
                        SchemaFeature.Type, SchemaFeature.Format,
                        SchemaFeature.Items, SchemaFeature.Properties,
                        SchemaFeature.Required, SchemaFeature.AdditionalProperties,
                        SchemaFeature.Ref
                )
                .includeParameterFeatures()
                .includeOperationFeatures()
                .includeSecurityFeatures()
                .includeWireFormatFeatures(
                        WireFormatFeature.JSON
                        // PROTOBUF and Custom are generator specific
                )
                .build();

        int cacheSize = Integer.parseInt(GlobalSettings.getProperty(org.openapijsonschematools.codegen.common.StringUtils.NAME_CACHE_SIZE_PROPERTY, "500"));
        int cacheExpiry = Integer.parseInt(GlobalSettings.getProperty(org.openapijsonschematools.codegen.common.StringUtils.NAME_CACHE_EXPIRY_PROPERTY, "10"));
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
    // a map to store the mapping between a schema and the new one
    // a map to store the mapping between inline schema and the name provided by the user
    protected String modelPackage = "components.schema", apiPackage = "";
    protected String modelNamePrefix = "", modelNameSuffix = "";
    protected String apiNamePrefix = "", apiNameSuffix = "Api";
    protected String filesMetadataFilename = "FILES";
    protected String versionMetadataFilename = "VERSION";

    protected String packageName = "src.main.java";

    protected String docsFolder = "docs";
    // for writing api files
    protected HashMap<CodegenConstants.JSON_PATH_LOCATION_TYPE, HashMap<String, String>> jsonPathTemplateFiles = new HashMap<>();
    // for writing doc files
    protected HashMap<CodegenConstants.JSON_PATH_LOCATION_TYPE, HashMap<String, String>> jsonPathDocTemplateFiles = new HashMap<>();
    // for writing test files
    protected HashMap<CodegenConstants.JSON_PATH_LOCATION_TYPE, HashMap<String, String>> jsonPathTestTemplateFiles = new HashMap<>();

    protected String templateDir;
    protected String embeddedTemplateDir;
    protected Map<String, Object> additionalProperties = new HashMap<>();
    protected Map<String, Object> vendorExtensions = new HashMap<>();
    /*
    Supporting files are those which aren't models, APIs, or docs.
    These get a different map of data bound to the templates. Supporting files are written once.
    */
    protected List<SupportingFile> supportingFiles = new ArrayList<>();
    protected List<CliOption> cliOptions = new ArrayList<>();
    protected boolean skipOverwrite;
    protected boolean removeOperationIdPrefix;
    protected String removeOperationIdPrefixDelimiter = "_";
    protected int removeOperationIdPrefixCount = 1;
    protected boolean skipOperationExample;

    private static final Pattern COMMON_PREFIX_ENUM_NAME = Pattern.compile("[a-zA-Z\\d]+\\z");

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
    protected Boolean allowUnicodeIdentifiers = false;
    protected Boolean hideGenerationTimestamp = true;
    // How to encode special characters like $
    // They are translated to words like "Dollar" and prefixed with '
    // Then translated back during JSON encoding and decoding
    protected Map<String, String> specialCharReplacements = new LinkedHashMap<>();
    // The extension of the generated documentation files (defaults to markdown .md)
    protected String docExtension;
    protected String ignoreFilePathOverride;
    // flag to indicate whether to use environment variable to post process file
    protected boolean enablePostProcessFile = false;

    // flag to indicate whether to only update files whose contents have changed
    protected boolean enableMinimalUpdate = false;

    // acts strictly upon a spec, potentially modifying it to have consistent behavior across generators.
    protected boolean strictSpecBehavior = true;
    // flag to indicate whether enum value prefixes are removed
    protected boolean removeEnumValuePrefix = true;

    // make openapi available to all methods
    protected OpenAPI openAPI;

    // A cache to efficiently look up a Schema instance based on the return value of `toModelName()`.
    private Map<String, Schema> modelNameToSchemaCache;

    // A cache to efficiently lookup schema `toModelName()` based on the schema Key
    private final Map<String, String> schemaKeyToModelNameCache = new HashMap<>();

    protected boolean loadDeepObjectIntoItems = true;

    // if true then baseTypes will be imported
    protected boolean importBaseType = true;

    // if True codegenParameter and codegenResponse imports will come
    // from deeper schema defined locations
    protected boolean addSchemaImportsFromV3SpecLocations = false;
    protected boolean deepestRefSchemaImportNeeded = false;
    protected String objectIOClassNamePiece = "Dict";
    protected String arrayIOClassNamePiece = "Tuple";
    protected String arrayObjectInputClassNameSuffix = "Input";

    @Override
    public List<CliOption> cliOptions() {
        return cliOptions;
    }

    @Override
    public void processOpts() {
        if (this.templateEngineName == null && additionalProperties.containsKey(CodegenConstants.TEMPLATING_ENGINE)) {
            setTemplateEngineName((String) additionalProperties.get(CodegenConstants.TEMPLATING_ENGINE));
        }

        if (additionalProperties.containsKey(CodegenConstants.TEMPLATE_DIR)) {
            this.setTemplateDir((String) additionalProperties.get(CodegenConstants.TEMPLATE_DIR));
        }

        if (additionalProperties.containsKey(CodegenConstants.API_PACKAGE)) {
            this.setApiPackage((String) additionalProperties.get(CodegenConstants.API_PACKAGE));
        }

        if (additionalProperties.containsKey(CodegenConstants.HIDE_GENERATION_TIMESTAMP)) {
            setHideGenerationTimestamp(convertPropertyToBooleanAndWriteBack(CodegenConstants.HIDE_GENERATION_TIMESTAMP));
        } else {
            additionalProperties.put(CodegenConstants.HIDE_GENERATION_TIMESTAMP, hideGenerationTimestamp);
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

        requiredAddPropUnsetSchema = fromSchema(new JsonSchema(), null, null);

    }

    /***
     * Preset map builder with commonly used Mustache lambdas.
     * <p>
     * To extend the map, override addMustacheLambdas(), call parent method
     * first and then add additional lambdas to the returned builder.
     * <p>
     * If common lambdas are not desired, override addMustacheLambdas() method
     * and return empty builder.
     *
     * @return map with common lambdas
     */
    @SuppressWarnings("SpellCheckingInspection")
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

        if (lambdas.isEmpty()) {
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
            ModelUtils.getSchemas(openAPI).forEach((key, schema) -> m.put(toModelName(key, "#/components/schemas/"+key), schema));
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
     * @param models Map of models
     * @return maps of models with various updates
     */
    @Override
    public TreeMap<String, CodegenSchema> updateAllModels(TreeMap<String, CodegenSchema> models) {
        return models;
    }

    // override with any special post-processing
    @Override
    @SuppressWarnings("static-method")
    public TreeMap<String, CodegenSchema> postProcessModels(TreeMap<String, CodegenSchema> models) {
        return models;
    }

    /**
     * Returns the common prefix of variables for enum naming if
     * two or more variables are present
     *
     * @param vars List of variable names
     * @return the common prefix for naming
     */
    public String findCommonPrefixOfVars(List<Object> vars) {
        if (!(vars.size() > 1)) {
            return "";
        }
        ArrayList<String> stringVars = new ArrayList<>();
        for (Object var: vars) {
            if (var instanceof String) {
                stringVars.add((String) var);
            } else {
                return "";
            }
        }
        String[] stringVarsArray = Arrays.copyOf(
                stringVars.toArray(), stringVars.size(), String[].class);
        String prefix = StringUtils.getCommonPrefix(stringVarsArray);
        if (prefix == null || prefix.isEmpty()) {
            return "";
        }
        // exclude trailing characters that should be part of a valid variable
        // e.g. ["status-on", "status-off"] => "status-" (not "status-o")
        final Matcher matcher = COMMON_PREFIX_ENUM_NAME.matcher(prefix);
        return matcher.replaceAll("");
    }

    /**
     * Return the sanitized variable name for enum
     *
     * @param value    enum variable name
     * @param prop the property that holds the data type booleans
     * @return the sanitized variable name for enum
     */
    public String toEnumVarName(String value, Schema<?> prop) {
        if (value.isEmpty()) {
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
        this.openAPI = openAPI;
    }

    // override with any message to be shown right before the process finishes
    @Override
    @SuppressWarnings("static-method")
    public void postProcess() {
        LOGGER.info("################################################################################");
        LOGGER.info("# Thanks for using OpenAPI JSON Schema Generator.                              #");
        LOGGER.info("# Please consider donation to help us maintain this project \uD83D\uDE4F                 #");
        LOGGER.info("# https://github.com/sponsors/spacether                                        #");
        LOGGER.info("################################################################################");
    }

    // override with any special post-processing
    @Override
    @SuppressWarnings("static-method")
    public Map<String, Object> postProcessSupportingFileData(Map<String, Object> data) {
        return data;
    }

    // override to post-process any model properties
    @Override
    @SuppressWarnings("unused")
    public void postProcessModelProperty(CodegenSchema model, CodegenSchema property) {
    }

    private void preprocessOpenAPIPaths(Paths paths) {
        if (paths == null) {
            return;
        }
        Set<String> pathsToFix = new HashSet<>();
        for (String path: paths.keySet()) {
            if (!path.startsWith("/")) {
                pathsToFix.add(path);
            }
        }
        for(String path: pathsToFix) {
            LOGGER.warn("Per the openapi spec, paths must begin with a slash; adding a slash onto " + path);
            PathItem pathItem = paths.remove(path);
            paths.put("/" + path, pathItem);
        }
    }

    //override with any special handling of the entire OpenAPI spec document
    @Override
    @SuppressWarnings("unused")
    public void preprocessOpenAPI(OpenAPI openAPI) {
        preprocessOpenAPIPaths(openAPI.getPaths());
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

    // override with any special text escaping logic
    @Override
    @SuppressWarnings("static-method")
    public String escapeText(String input) {
        if (input == null) {
            return null;
        }

        // remove \t, \n, \r
        // replace \ with \\
        // replace " with \"
        // outer unescape to retain the original multibyte characters
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
            return null;
        }

        // remove \t
        // replace \ with \\
        // replace " with \"
        // outer unescape to retain the original multibyte characters
        // finally escalate characters avoiding code injection
        return escapeUnsafeCharacters(
                StringEscapeUtils.unescapeJava(
                                StringEscapeUtils.escapeJava(input)
                                        .replace("\\/", "/"))
                        .replaceAll("\\t", " ")
                        .replace("\\", "\\\\")
                        .replace("\"", "\\\""));
    }

    /**
     * override with any special text escaping logic to handle unsafe
     * characters to avoid code injection
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
    public String modelPackage() {
        return modelPackage;
    }

    @Override
    public String apiPackage() {
        return apiPackage;
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
    public HashMap<CodegenConstants.JSON_PATH_LOCATION_TYPE, HashMap<String, String>> jsonPathTemplateFiles() {
        return jsonPathTemplateFiles;
    }

    @Override
    public HashMap<CodegenConstants.JSON_PATH_LOCATION_TYPE, HashMap<String, String>> jsonPathDocTemplateFiles() {
        return jsonPathDocTemplateFiles;
    }

    @Override
    public HashMap<CodegenConstants.JSON_PATH_LOCATION_TYPE, HashMap<String, String>> jsonPathTestTemplateFiles() {
        return jsonPathTestTemplateFiles;
    }

    public String toResponseModuleName(String componentName, String jsonPath) { return toModuleFilename(componentName, jsonPath); }

    public String getPascalCaseResponse(String componentName, String jsonPath) { return toModelName(componentName, null); }

    public String toHeaderFilename(String componentName, String jsonPath) { return toModuleFilename(componentName, jsonPath); }

    @Override
    public Map<String, Object> additionalProperties() {
        return additionalProperties;
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

    @Override
    public String getVersionMetadataFilename() {
        return versionMetadataFilename;
    }

    public void setTemplateDir(String templateDir) {
        this.templateDir = templateDir;
    }

    public void setModelPackage(String modelPackage) {
        this.modelPackage = modelPackage;
    }

    public void setModelNamePrefix(String modelNamePrefix) {
        this.modelNamePrefix = modelNamePrefix;
    }

    public void setModelNameSuffix(String modelNameSuffix) {
        this.modelNameSuffix = modelNameSuffix;
    }

    public void setApiNameSuffix(String apiNameSuffix) {
        this.apiNameSuffix = apiNameSuffix;
    }

    public void setApiNamePrefix(String apiNamePrefix) {
        this.apiNamePrefix = apiNamePrefix;
    }

    public void setApiPackage(String apiPackage) {
        this.apiPackage = apiPackage;
    }

    public void setAllowUnicodeIdentifiers(Boolean allowUnicodeIdentifiers) {
        this.allowUnicodeIdentifiers = allowUnicodeIdentifiers;
    }

    /**
     * Notes:
     * RgxGen does not support our ECMA dialect
     * <a href="https://github.com/curious-odd-man/RgxGen/issues/56">...</a>
     * So strip off the leading / and trailing / and turn on ignore case if we have it
     * <p>
     * json schema test cases omit the leading and trailing /s, so make sure that the regex allows that
     * <p>
     * Flags:
     * <a href="https://262.ecma-international.org/13.0/#sec-get-regexp.prototype.flags">...</a>
     * d hasIndices: indicates that the result of a regular expression match should contain the start and end indices of the substrings of each capture group
     * g global: the regular expression should be tested against all possible matches in a string
     * i ignoreCase: case should be ignored while attempting a match in a string
     * m multiline: a multiline input string should be treated as multiple lines
     * s dotAll: the dot special character (.) should additionally match 4 line terminator ("newline") characters in a string
     * u unicode: enables various Unicode-related features such as unicode code point escapes
     * y sticky: the regex attempts to match the target string only from the index indicated by the lastIndex property
     * <p>
     * Python flags:
     * <a href="https://docs.python.org/3/library/re.html#flags">...</a>
     * i, m, s u
     *
     * @param pattern the pattern (regular expression)
     * @return the resultant regex for python
     */
    @Override
    public CodegenPatternInfo getPatternInfo(String pattern) {
        if (pattern == null) {
            return null;
        }
        Matcher m = patternRegex.matcher(pattern);
        if (m.find()) {
            int groupCount = m.groupCount();
            boolean patternWithNoFlags = groupCount == 1;
            boolean patternWithFlags = groupCount == 2;
            if (patternWithNoFlags) {
                String isolatedPattern = m.group(1);
                CodegenText usedPattern = new CodegenText(isolatedPattern, escapeUnsafeCharacters(isolatedPattern));
                return new CodegenPatternInfo(usedPattern, null);
            } else if (patternWithFlags) {
                String isolatedPattern = m.group(1);
                CodegenText usedPattern = new CodegenText(isolatedPattern, escapeUnsafeCharacters(isolatedPattern));
                String foundFlags = m.group(2);
                if (foundFlags.isEmpty()) {
                    return new CodegenPatternInfo(usedPattern, null);
                }
                LinkedHashSet<String> flags = new LinkedHashSet<>();
                for (Character c: foundFlags.toCharArray()) {
                    flags.add(c.toString());
                }
                return new CodegenPatternInfo(usedPattern, flags);
            }
        }
        CodegenText usedPattern = new CodegenText(pattern, escapeUnsafeCharacters(pattern));
        return new CodegenPatternInfo(usedPattern, null);
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
    public String toModelFilename(String name, String jsonPath) {
        return toModuleFilename(name, jsonPath);
    }

    @Override
    public String toContentTypeFilename(String name) {
        return name;
    }

    @Override
    public String toModuleFilename(String name, String jsonPath) {
        return org.openapijsonschematools.codegen.common.StringUtils.camelize(name);
    }

    public String toPathFilename(String name, String jsonPath) {
        return toModuleFilename(name, jsonPath);
    }

    @Override
    public String toParameterFilename(String basename, String jsonPath) {
        return toModuleFilename(basename, jsonPath);
    }

    @Override
    public String toSecuritySchemeFilename(String basename, String jsonPath) {
        return toModuleFilename(basename, jsonPath);
    }

    @Override
    public String toServerFilename(String basename, String jsonPath) {
        return toModuleFilename(basename, jsonPath);
    }

    @Override
    public String toSecurityFilename(String basename, String jsonPath) {
        return toModuleFilename(basename, jsonPath);
    }

    @Override
    public String getPascalCaseServer(String basename, String jsonPath) {
        return "Server" + basename;
    }

    public String getPascalCaseParameter(String basename, String jsonPath) {
        return toModelName(basename, null);
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
            return org.openapijsonschematools.codegen.common.StringUtils.escape(name, specialCharReplacements, null, null);
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
            return org.openapijsonschematools.codegen.common.StringUtils.escape(name, specialCharReplacements, null, null);
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

    protected Stability getStability() {
        return Stability.STABLE;
    }

    /**
     * Default constructor.
     * This method will map between OAS type and language-specified type, as well as mapping
     * between OAS type and the corresponding import statement for the language. This will
     * also add some language specified CLI options, if any.
     * returns string presentation of the example path (it's a constructor)
     */
    public DefaultGenerator() {
        GeneratorType generatorType = getTag();
        if (generatorType == null) {
            generatorType = GeneratorType.OTHER;
        }

        generatorMetadata = GeneratorMetadata.newBuilder()
                .stability(getStability())
                .featureSet(DefaultFeatureSet)
                .generationMessage(String.format(Locale.ROOT, "OpenAPI JSON Schema Generator: %s (%s)", getName(), generatorType.toValue()))
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
        // FIXME: java specific type should be in Java Based Abstract Implementations
        typeMapping.put("ByteArray", "byte[]");
        typeMapping.put("binary", "File");
        typeMapping.put("file", "File");
        typeMapping.put("UUID", "UUID");
        typeMapping.put("URI", "URI");
        typeMapping.put("AnyType", "oas_any_type_not_mapped");

        instantiationTypes = new HashMap<>();

        reservedWords = new HashSet<>();

        // name formatting options
        cliOptions.add(CliOption.newBoolean(CodegenConstants.ALLOW_UNICODE_IDENTIFIERS, CodegenConstants
                .ALLOW_UNICODE_IDENTIFIERS_DESC).defaultValue(Boolean.FALSE.toString()));

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
        // TODO add calculated example from CodegenHeader.schema
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
    public EnumValue toDefaultValue(Schema schema) {
        if (schema.getDefault() != null) {
            return getEnumValue(schema.getDefault(), null);
        }

        return null;
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

    /**
     * Return the lowerCamelCase of the string
     *
     * @param name string to be lowerCamelCased
     * @return lowerCamelCase string
     */
    @SuppressWarnings("static-method")
    public String lowerCamelCase(String name) {
        return (!name.isEmpty()) ? (Character.toLowerCase(name.charAt(0)) + name.substring(1)) : "";
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
        if (name.isEmpty()) {
            return "DefaultApi";
        }
        return org.openapijsonschematools.codegen.common.StringUtils.camelize(apiNamePrefix + "_" + name + "_" + apiNameSuffix);
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
    public String toModelName(final String name, String jsonPath) {
        if (schemaKeyToModelNameCache.containsKey(name)) {
            return schemaKeyToModelNameCache.get(name);
        }

        String camelCaseName = org.openapijsonschematools.codegen.common.StringUtils.camelize(modelNamePrefix + "_" + name + "_" + modelNameSuffix);
        schemaKeyToModelNameCache.put(name, camelCaseName);
        return camelCaseName;
    }

    Map<PairCacheKey, CodegenSchema> codegenSchemaCache = new HashMap<>();
    // json path to instance
    Map<String, CodegenResponse> codegenResponseCache = new HashMap<>();
    Map<String, CodegenHeader> codegenHeaderCache = new HashMap<>();
    Map<String, CodegenRequestBody> codegenRequestBodyCache = new HashMap<>();
    Map<String, CodegenSecurityScheme> codegenSecuritySchemeCache = new HashMap<>();
    Map<String, CodegenSecurityRequirementValue> codegenSecurityRequirementCache = new HashMap<>();

    Map<String, CodegenParameter> codegenParameterCache = new HashMap<>();
    // for giving schemas unique names in schema modules
    HashMap<String, HashMap<String, Integer>> sourceJsonPathToKeyToQty = new HashMap<>();
    Map<String, CodegenTag> codegenTagCache = new HashMap<>();
    private CodegenSchema requiredAddPropUnsetSchema = null;

    // for preventing schema import module collisions
    HashMap<String, HashMap<String, Integer>> jsonPathToRefModuleToQty = new HashMap<>();
    HashMap<String, HashMap<String, HashMap<String, String>>> jsonPathToRefModuleToRefToAlias = new HashMap<>();

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
                    LOGGER.error("allOf composed schema is inheriting >1 discriminator. Only use one discriminator: {}", composed);
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

    protected EnumValue getEnumValue(Object value, String description) {
        Object usedValue = value;
        String type = null;
        if (value instanceof Integer || value instanceof Long){
            type = "integer";
        } else if (value instanceof Double || value instanceof Float || value instanceof BigDecimal){
            if (value instanceof BigDecimal) {
                usedValue = ((BigDecimal) value).doubleValue();
            }
            type = "number";
        } else if (value instanceof String) {
            type = "string";
            usedValue = escapeUnsafeCharacters((String) value);
        } else if (value instanceof LinkedHashMap) {
            LinkedHashMap<String, EnumValue> castMap = new LinkedHashMap<>();
            for (Map.Entry entry: ((LinkedHashMap<?, ?>) value).entrySet()) {
                String entryKey = escapeUnsafeCharacters((String) entry.getKey());
                Object entryValue = entry.getValue();
                EnumValue castValue = getEnumValue(entryValue, null);
                castMap.put(entryKey, castValue);
            }
            type = "object";
            usedValue = castMap;
        } else if (value instanceof ArrayList) {
            ArrayList<EnumValue> castList = new ArrayList<>();
            for (Object item: (ArrayList<?>) value) {
                EnumValue castItem = getEnumValue(item, null);
                castList.add(castItem);
            }
            type = "array";
            usedValue = castList;
        } else if (value instanceof Boolean) {
            type = "boolean";
        } else if (value == null) {
            type = "null";
        } else if (value instanceof OffsetDateTime) {
            type = "string";
            usedValue = value.toString();
        }
        return new EnumValue(usedValue, type, description);
    }

    /**
     * Processes any test cases if they exist in the components.x-test-examples vendor extensions
     * If they exist then cast them to java class instances and return them back in a map
     * @param refToTestCases the component schema name that the test cases are for
     */
    private HashMap<String, SchemaTestCase> extractSchemaTestCases(String refToTestCases) {
        Components components = openAPI.getComponents();
        if (components ==  null) {
            return null;
        }
        // schemaName to a map of test case name to test case
        HashMap<String, Object> vendorExtensions = (HashMap<String, Object>) components.getExtensions();
        if (vendorExtensions ==  null || !vendorExtensions.containsKey(xSchemaTestExamplesKey)) {
            return null;
        }
        if (!refToTestCases.startsWith(xSchemaTestExamplesRefPrefix)) {
            return null;
        }
        String schemaName = refToTestCases.substring(xSchemaTestExamplesRefPrefix.length());
        HashMap<String, SchemaTestCase> schemaTestCases = new HashMap<>();
        Object rawData = vendorExtensions.get(xSchemaTestExamplesKey);
        LinkedHashMap<String, Object> schemaNameToTestCases = new LinkedHashMap<>();
        if (rawData instanceof LinkedHashMap) {
            for (Entry entry: ((LinkedHashMap<?, ?>) rawData).entrySet()) {
                String key = (String) entry.getKey();
                Object value = entry.getValue();
                schemaNameToTestCases.put(key, value);
            }
        } else {
            return null;
        }

        if (!schemaNameToTestCases.containsKey(schemaName)) {
            return null;
        }
        rawData = schemaNameToTestCases.get(schemaName);
        if (!(rawData instanceof LinkedHashMap)) {
            return null;
        }
        for (Entry entry: ((LinkedHashMap<?, ?>) rawData).entrySet()) {
            String nameInSnakeCase = toTestCaseName((String) entry.getKey());
            Object testExample = entry.getValue();
            if (!(testExample instanceof LinkedHashMap)) {
                continue;
            }
            LinkedHashMap castTestExample = (LinkedHashMap) testExample;
            Object data = castTestExample.get("data");
            CodegenText description = getCodegenText((String) castTestExample.get("description"));
            boolean valid = (boolean) castTestExample.get("valid");
            SchemaTestCase testCase = new SchemaTestCase(
                    description,
                    getEnumValue(data, null),
                    valid
            );
            schemaTestCases.put(nameInSnakeCase, testCase);
        }
        return schemaTestCases;
    }

    protected CodegenSchema getAdditionalProperties(Schema schema, String sourceJsonPath, String currentJsonPath) {
        if (schema.getAdditionalProperties() == null) {
            return null;
        }
        String additionalPropertiesJsonPath = currentJsonPath + "/additionalProperties";
        if (schema.getAdditionalProperties() instanceof Boolean) {
            Schema usedSchema = getSchemaFromBooleanOrSchema(schema.getAdditionalProperties());
            return fromSchema(usedSchema, sourceJsonPath, additionalPropertiesJsonPath);
        } else {
            return fromSchema((Schema) schema.getAdditionalProperties(), sourceJsonPath, additionalPropertiesJsonPath);
        }
    }

    /**
     * Recursively look in Schema sc for the discriminator discPropName
     * and return a CodegenSchema with the dataType and required params set
     * the returned CodegenSchema may not be required, and it may not be of type string
     *
     * @param composedSchemaName The name of the sc Schema
     * @param sc                 The Schema that may contain the discriminator
     * @param discPropName       The String that is the discriminator propertyName in the schema
     */
    private CodegenSchema discriminatorFound(String composedSchemaName, Schema sc, String discPropName, OpenAPI openAPI) {
        Schema refSchema = ModelUtils.getReferencedSchema(openAPI, sc);
        if (refSchema.getProperties() != null && refSchema.getProperties().get(discPropName) != null) {
            return new CodegenSchema();
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
            if (composedSchema.getOneOf() != null && !composedSchema.getOneOf().isEmpty()) {
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
            if (composedSchema.getAnyOf() != null && !composedSchema.getAnyOf().isEmpty()) {
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
     *
     * @param sc The Schema that may contain the discriminator
     * @param openAPI the spec that is used
     */
    private Discriminator recursiveGetDiscriminator(Schema sc, OpenAPI openAPI) {
        Schema refSchema = ModelUtils.getReferencedSchema(openAPI, sc);
        Discriminator foundDisc = refSchema.getDiscriminator();
        if (foundDisc != null) {
            return foundDisc;
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
            if (composedSchema.getOneOf() != null && !composedSchema.getOneOf().isEmpty()) {
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
                if (foundDisc != null && (hasDiscriminatorCnt + hasNullTypeCnt) == composedSchema.getOneOf().size() && discriminatorsPropNames.size() == 1) {
                    disc.setPropertyName(foundDisc.getPropertyName());
                    disc.setMapping(foundDisc.getMapping());
                    return disc;
                }
                // If the scenario when oneOf has two children and one of them is the 'null' type,
                // there is no need for a discriminator.
            }
            if (composedSchema.getAnyOf() != null && !composedSchema.getAnyOf().isEmpty()) {
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
        List<MappedModel> descendantSchemas = new ArrayList<>();
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
                    continue;
                }
                CodegenSchema df = discriminatorFound(composedSchemaName, sc, discPropName, openAPI);
                String modelName = ModelUtils.getSimpleRef(ref);
                if (df == null || df.types != null && !df.types.contains("string")) {
                    String msgSuffix = "";
                    if (df == null) {
                        msgSuffix += discPropName + " is missing from the schema, define it as required and type string";
                    } else {
                        if (!df.types.contains("string")) {
                            msgSuffix += "invalid type for " + discPropName + ", set it to string";
                        }
                    }
                    LOGGER.warn("'{}' defines discriminator '{}', but the referenced schema '{}' is incorrect. {}",
                            composedSchemaName, discPropName, modelName, msgSuffix);
                }
                String refClass = getRefClassWithModule("#/components/schemas/" + modelName, sourceJsonPath);
                MappedModel mm = new MappedModel(modelName, refClass);
                descendantSchemas.add(mm);
            }
        }
        return descendantSchemas;
    }

    protected List<MappedModel> getAllOfDescendants(String thisSchemaName, OpenAPI openAPI, String sourceJsonPath) {
        ArrayList<String> queue = new ArrayList<>();
        List<MappedModel> descendantSchemas = new ArrayList<>();
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
                                if (queue.contains(childName) || descendantSchemas.stream().anyMatch(i -> childName.equals(i.mappingName))) {
                                    throw new RuntimeException("Stack overflow hit when looking for " + thisSchemaName + " an infinite loop starting and ending at " + childName + " was seen");
                                }
                                queue.add(childName);
                                break;
                            }
                        }
                    }
                }
            }
            if (queue.isEmpty()) {
                break;
            }
            currentSchemaName = queue.remove(0);
            String refClass = getRefClassWithModule("#/components/schemas/" + currentSchemaName, sourceJsonPath);
            MappedModel mm = new MappedModel(currentSchemaName, refClass);
            descendantSchemas.add(mm);
        }
        return descendantSchemas;
    }

    protected String getRefClassWithModule(String ref, String sourceJsonPath) {
        return toRefClass(ref, sourceJsonPath, "schemas");
    }

    protected CodegenDiscriminator createDiscriminator(String schemaName, Schema schema, OpenAPI openAPI, String sourceJsonPath) {
        Discriminator sourceDiscriminator = recursiveGetDiscriminator(schema, openAPI);
        if (sourceDiscriminator == null) {
            return null;
        }
        String discPropName = sourceDiscriminator.getPropertyName();
        CodegenKey propertyName = getKey(discPropName, "misc");
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
                        modelName = getRefClassWithModule(e.getValue(), sourceJsonPath);
                    }
                } else {
                    String ref = "#/components/schemas/" + value;
                    modelName = getRefClassWithModule(ref, sourceJsonPath);
                }
                if (modelName != null) {
                    mappedModels.add(new MappedModel(e.getKey(), modelName));
                }
            }
        }

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

            if (!matched) {
                mappedModels.add(otherDescendant);
            }
        }
        // if there are composed oneOf/anyOf schemas, add them to this discriminator
        if (ModelUtils.isComposedSchema(schema)) {
            List<MappedModel> composedDescendants = getOneOfAnyOfDescendants(schemaName, discPropName, (ComposedSchema) schema, openAPI, sourceJsonPath);
            mappedModels.addAll(composedDescendants);
        }

        return new CodegenDiscriminator(propertyName, mapping, mappedModels);
    }

    protected boolean isValid(String name) {
        return !isReservedWord(name);
    }

    @Override
    public String getImport(CodegenRefInfo<?> refInfo) {
        String prefix = "from " + packageName + ".components.";
        if (refInfo.ref instanceof CodegenSchema) {
            if (refInfo.refModuleAlias == null) {
                return "from " + refInfo.refModuleLocation + " import " + refInfo.refModule;
            } else {
                return "from " + refInfo.refModuleLocation + " import " + refInfo.refModule + " as " + refInfo.refModuleAlias;
            }
        } else if (refInfo.ref instanceof CodegenRequestBody) {
            return prefix + "request_bodies import " + refInfo.refModule;
        } else if (refInfo.ref instanceof CodegenHeader) {
            return prefix + "headers import " + refInfo.refModule;
        } else if (refInfo.ref instanceof CodegenResponse) {
            return prefix + "responses import " + refInfo.refModule;
        } else if (refInfo.ref instanceof CodegenParameter) {
            return prefix + "parameters import " + refInfo.refModule;
        } else if (refInfo.ref instanceof CodegenSecurityScheme) {
            return prefix + "security_schemes import " + refInfo.refModule;
        }
        return null;
    }

    /**
     * Recursively collect all necessary imports to include so that the type may be resolved.
     *
     * @param featureSet the generator feature set, used to determine if composed schemas should be added
     * @return all the imports
     */
    @Override
    public Set<String> getImports(String sourceJsonPath, CodegenSchema schema, FeatureSet featureSet) {
        Set<String> imports = new HashSet<>();
        if (schema.discriminator != null && schema.discriminator.mappedModels != null) {
            CodegenDiscriminator disc = schema.discriminator;
            for (CodegenDiscriminator.MappedModel mm : disc.mappedModels) {
                if (!"".equals(mm.modelName)) {
                    String complexType = mm.modelName;
                    if (shouldAddImport(complexType)) {
                        String refModule = complexType.split("\\.")[0];
                        String refModuleLocation = packageName() + ".components.schema";
                        CodegenRefInfo<CodegenSchema> refInfo = new CodegenRefInfo<>(new CodegenSchema(), null, refModule, refModuleLocation, null);
                        imports.add(getImport(refInfo));
                    }
                }
            }
        }
        if (schema.allOf != null || schema.anyOf != null || schema.oneOf != null || schema.not != null) {
            List<CodegenSchema> allOfs = Collections.emptyList();
            List<CodegenSchema> oneOfs = Collections.emptyList();
            List<CodegenSchema> anyOfs = Collections.emptyList();
            List<CodegenSchema> notSchemas = Collections.emptyList();
            if (schema.allOf != null && featureSet.getSchemaSupportFeatures().contains(SchemaFeature.AllOf)) {
                allOfs = schema.allOf;
            }
            if (schema.oneOf != null && featureSet.getSchemaSupportFeatures().contains(SchemaFeature.OneOf)) {
                oneOfs = schema.oneOf;
            }
            if (schema.anyOf != null && featureSet.getSchemaSupportFeatures().contains(SchemaFeature.AnyOf)) {
                anyOfs = schema.anyOf;
            }
            if (schema.not != null && featureSet.getSchemaSupportFeatures().contains(SchemaFeature.Not)) {
                notSchemas = Collections.singletonList(schema.not);
            }
            Stream<CodegenSchema> allSchemas = Stream.of(
                    allOfs.stream(), anyOfs.stream(), oneOfs.stream(), notSchemas.stream()).flatMap(i -> i);
            for (CodegenSchema cs: allSchemas.collect(Collectors.toList())) {
                imports.addAll(getImports(sourceJsonPath, cs, featureSet));
            }
        }
        // items can exist for AnyType and type array
        if (schema.items != null && schema.types != null && schema.types.contains("array")) {
            imports.addAll(getImports(sourceJsonPath, schema.items, featureSet));
        }
        // additionalProperties can exist for AnyType and type object
        if (schema.additionalProperties != null) {
            imports.addAll(getImports(sourceJsonPath, schema.additionalProperties, featureSet));
        }
        // vars can exist for AnyType and type object
        if (schema.properties != null && !schema.properties.isEmpty()) {
            for (CodegenSchema cs: schema.properties.values()) {
                imports.addAll(getImports(sourceJsonPath, cs, featureSet));
            }
        }
        // referenced or inline schemas
        if (schema.refInfo != null && schema.refInfo.refModule != null) {
            // self reference classes do not contain refModule
            imports.add(getImport(schema.refInfo));
            CodegenSchema ref = schema.refInfo.ref;
            if (ref.refInfo != null && schema.refInfo.refModule != null && deepestRefSchemaImportNeeded) {
                CodegenRefInfo<CodegenSchema> deepestRefInfo = schema.refInfo;
                while (deepestRefInfo.ref.refInfo != null) {
                    deepestRefInfo = deepestRefInfo.ref.refInfo;
                }
                imports.add(getImport(deepestRefInfo));
            }
        }
        return imports;
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
            for (Object typeObj: schema.getTypes()) {
                String type = typeObj.toString();
                switch (type) {
                    case "null":  types.add("null");
                        break;
                    case "object":  types.add("object");
                        break;
                    case "array":  types.add("array");
                        break;
                    case "string":  types.add("string");
                        break;
                    case "number":  types.add("number");
                        break;
                    case "integer": types.add("integer");
                        break;
                    case "boolean":  types.add("boolean");
                        break;
                    default:
                        break;
                }
            }
            // the above order used so mixins will stay the same
        }
        return types;
    }

    private String schemaPathFromDocRoot(String moduleLocation) {
        return moduleLocation.replace('.', File.separatorChar).substring(packageName.length()+1);
    }

    private LinkedHashMap<CodegenPatternInfo, CodegenSchema> getPatternProperties(Map<String, Schema> schemaPatternProperties, String jsonPath, String sourceJsonPath) {
        LinkedHashMap<CodegenPatternInfo, CodegenSchema> patternProperties = new LinkedHashMap<>();
        for (Entry<String, Schema> entry: schemaPatternProperties.entrySet()) {
            String pattern = entry.getKey();
            CodegenPatternInfo patternInfo = getPatternInfo(pattern);
            CodegenSchema schema = fromSchema(entry.getValue(), sourceJsonPath, jsonPath + "/patternProperties/" + ModelUtils.encodeSlashes(pattern));
            patternProperties.put(patternInfo, schema);
        }
        return patternProperties;
    }

    private ArrayList<CodegenSchema> getPrefixItems(List<Schema> schemaPrefixItems, String jsonPath, String sourceJsonPath) {
        ArrayList<CodegenSchema> prefixItems = new ArrayList<>();
        for(int i = 0; i < schemaPrefixItems.size(); i++) {
            Schema schema = schemaPrefixItems.get(i);
            String currentJsonPath = jsonPath + "/prefixItems/" + i;
            CodegenSchema prefixItem = fromSchema(schema, sourceJsonPath, currentJsonPath);
            prefixItems.add(prefixItem);
        }
        return prefixItems;
    }

    private LinkedHashMap<String, ArrayList<String>> getDependentRequired(LinkedHashMap<String, List<String>> schemaDepReq) {
        if (schemaDepReq == null) {
            return null;
        }
        LinkedHashMap<String, ArrayList<String>> dependenteRequired = new LinkedHashMap<>();
        for (Entry<String, List<String>> entry: schemaDepReq.entrySet()) {
            String key = entry.getKey();
            List<String> values = entry.getValue();
            String fixedKey = escapeUnsafeCharacters(key);
            ArrayList<String> fixedValues = new ArrayList<>();
            for (String value: values) {
                fixedValues.add(escapeUnsafeCharacters(value));
            }
            dependenteRequired.put(fixedKey, fixedValues);
        }
        return dependenteRequired;
    }

    private Object getBooleanFromSchema(CodegenSchema schema) {
        if (schema.enumInfo != null && schema.enumInfo.typeToValues.containsKey("boolean")) {
            for(EnumValue enumValue: schema.enumInfo.typeToValues.get("boolean").keySet()) {
                return enumValue.value;
            }
            return null;
        }
        if (schema.constInfo != null && schema.constInfo.typeToValues.containsKey("boolean")) {
            for(EnumValue enumValue: schema.constInfo.typeToValues.get("boolean").keySet()) {
                return enumValue.value;
            }
        }
        // todo handle not const or not enum here
        return true;
    }

    private Object getIntegerFromSchema(CodegenSchema schema) {
        if (schema.enumInfo != null && schema.enumInfo.typeToValues.containsKey("integer")) {
            for(EnumValue enumValue: schema.enumInfo.typeToValues.get("integer").keySet()) {
                return enumValue.value;
            }
            return null;
        }
        if (schema.constInfo != null && schema.constInfo.typeToValues.containsKey("integer")) {
            for(EnumValue enumValue: schema.constInfo.typeToValues.get("integer").keySet()) {
                return enumValue.value;
            }
        }
        // todo handle not const or not enum here
        Object longVal = 1L;
        if (schema.format == null) {
            return longVal;
        } else if ("int64".equals(schema.format)) {
            return longVal;
        }
        return 1;
    }

    private Object getNumberFromSchema(CodegenSchema schema) {
        if (schema.enumInfo != null && schema.enumInfo.typeToValues.containsKey("number")) {
            for(EnumValue enumValue: schema.enumInfo.typeToValues.get("number").keySet()) {
                return enumValue.value;
            }
            return null;
        }
        if (schema.constInfo != null && schema.constInfo.typeToValues.containsKey("number")) {
            for(EnumValue enumValue: schema.constInfo.typeToValues.get("number").keySet()) {
                return enumValue.value;
            }
        }
        // todo handle not const or not enum here
        if (schema.format == null) {
            return 1;
        } else if (schema.format.equals("int32")) {
            return 1;
        } else if (schema.format.equals("int64")) {
            return 1L;
        } else if (schema.format.equals("float")) {
            return 3.14f;
        } else if (schema.format.equals("double")) {
            return 3.14d;
        } else {
            return 1;
        }
    }

    private String getPatternExample(CodegenPatternInfo patternInfo) {
        String extractedPattern = patternInfo.pattern.original;
        LinkedHashSet<String> regexFlags = patternInfo.flags;
                /*
                RxGen does not support our ECMA dialect https://github.com/curious-odd-man/RgxGen/issues/56
                So strip off the leading / and trailing / and turn on ignore case if we have it
                 */
        RgxGen rgxGen;
        if (regexFlags != null && regexFlags.contains("i")) {
            rgxGen = new RgxGen(extractedPattern);
            RgxGenProperties properties = new RgxGenProperties();
            RgxGenOption.CASE_INSENSITIVE.setInProperties(properties, true);
            rgxGen.setProperties(properties);
        } else {
            rgxGen = new RgxGen(extractedPattern);
        }

        // this seed makes it so if we have [a-z] we pick a
        Random random = new Random(18);
        return rgxGen.generate(random);
    }

    private Object getStringFromSchema(CodegenSchema schema) {
        if (schema.enumInfo != null && schema.enumInfo.typeToValues.containsKey("string")) {
            for(EnumValue enumValue: schema.enumInfo.typeToValues.get("string").keySet()) {
                return enumValue.value;
            }
            return null;
        }
        if (schema.constInfo != null && schema.constInfo.typeToValues.containsKey("string")) {
            for(EnumValue enumValue: schema.constInfo.typeToValues.get("string").keySet()) {
                return enumValue.value;
            }
        }
        // todo handle not const or not enum here
        if (schema.patternInfo != null) {
            return getPatternExample(schema.patternInfo);
        }
        if ("date".equals(schema.format)) {
            return "2020-12-13";
        } else if ("date-time".equals(schema.format)) {
            return "1970-01-01T00:00:00.00Z";
        } else if ("number".equals(schema.format)) {
            return "3.14";
        } else if ("uuid".equals(schema.format)) {
            return "046b6c7f-0b8a-43b9-b35d-6489e6daee91";
        }
        return "a";
    }

    private Object getListFromSchema(CodegenSchema listSchema, Set<CodegenSchema> seenSchemas) {
        // todo add enum and const handling once those support array types
        if (listSchema.items == null) {
            return null;
        }
        ArrayList<Object> listVal = new ArrayList<>();
        Map<String, EnumValue> itemsTypeToExample = getTypeToExample(listSchema.items, seenSchemas);
        if (itemsTypeToExample != null && !itemsTypeToExample.isEmpty()) {
            for(EnumValue exampleValue: itemsTypeToExample.values()) {
                listVal.add(exampleValue);
                break;
            }
        }
        return listVal;
    }

    private LinkedHashMap<CodegenKey, Object> getMapFromSchema(CodegenSchema mapSchema, Set<CodegenSchema> seenSchemas) {
        // todo add enum and const handling once those support array types
        if (mapSchema.properties == null && mapSchema.additionalProperties == null && mapSchema.requiredProperties == null) {
            return null;
        }
        LinkedHashMap<CodegenKey, Object> mapVal = new LinkedHashMap<>();
        if (mapSchema.requiredProperties != null && !mapSchema.requiredProperties.isEmpty()) {
            for (Entry<CodegenKey, CodegenSchema> entry: mapSchema.requiredProperties.entrySet()) {
                Map<String, EnumValue> propertyTypeToExample = getTypeToExample(entry.getValue(), seenSchemas);
                if (propertyTypeToExample != null && !propertyTypeToExample.isEmpty()) {
                    for(EnumValue exampleValue: propertyTypeToExample.values()) {
                        mapVal.put(entry.getKey(), exampleValue);
                        break;
                    }
                }
            }
        }
        if (mapSchema.optionalProperties != null && !mapSchema.optionalProperties.isEmpty()) {
            for (Entry<CodegenKey, CodegenSchema> entry: mapSchema.optionalProperties.entrySet()) {
                Map<String, EnumValue> propertyTypeToExample = getTypeToExample(entry.getValue(), seenSchemas);
                if (propertyTypeToExample != null && !propertyTypeToExample.isEmpty()) {
                    for(EnumValue exampleValue: propertyTypeToExample.values()) {
                        mapVal.put(entry.getKey(), exampleValue);
                        break;
                    }
                }
            }
        }

        if (mapSchema.additionalProperties != null && !mapSchema.additionalProperties.isBooleanSchemaFalse) {
            Map<String, EnumValue> propertyTypeToExample = getTypeToExample(mapSchema.additionalProperties, seenSchemas);
            if (propertyTypeToExample != null && !propertyTypeToExample.isEmpty()) {
                for(EnumValue exampleValue: propertyTypeToExample.values()) {
                    mapVal.put(additionalPropertySampleKey, exampleValue);
                    break;
                }
            }
        }
        return mapVal;
    }

    private LinkedHashMap<String, EnumValue> getTypeToExample(CodegenSchema schema, Set<CodegenSchema> seenSchemas) {
        if (schema == null) {
            return null;
        }
        if (seenSchemas.contains(schema)) {
            return null;
        }
        seenSchemas.add(schema);
        CodegenSchema usedSchema = schema;
        if (schema.refInfo != null) {
            // todo adjust this when ref can be adjacent to other properties
            usedSchema = schema.getDeepestRef();
            if (seenSchemas.contains(usedSchema)) {
                return null;
            }
            seenSchemas.add(usedSchema);
        }
        LinkedHashMap<String, EnumValue> typeToExample = new LinkedHashMap<>();
        if (usedSchema.types != null) {
            for (String type: usedSchema.types) {
                switch(type) {
                    case "null":
                        typeToExample.put("null", new EnumValue(null, "null", null));
                        break;
                    case "boolean":
                        Object boolVal = getBooleanFromSchema(usedSchema);
                        if (boolVal != null) {
                            typeToExample.put("boolean", new EnumValue(boolVal, "boolean", null));
                        }
                        break;
                    case "integer":
                        Object intVal = getIntegerFromSchema(usedSchema);
                        if (intVal != null) {
                            typeToExample.put("integer", new EnumValue(intVal, "integer", null));
                        }
                        break;
                    case "number":
                        Object numberVal = getNumberFromSchema(usedSchema);
                        if (numberVal != null) {
                            typeToExample.put("number", new EnumValue(numberVal, "number", null));
                        }
                        break;
                    case "string":
                        Object stringVal = getStringFromSchema(usedSchema);
                        if (stringVal != null) {
                            typeToExample.put("string", new EnumValue(stringVal, "string", null));
                        }
                        break;
                    case "array":
                        Object listVal = getListFromSchema(usedSchema, seenSchemas);
                        if (listVal != null) {
                            typeToExample.put("array", new EnumValue(listVal, "array", null));
                        }
                        break;
                    case "object":
                        Object mapVal = getMapFromSchema(usedSchema, seenSchemas);
                        if (mapVal != null) {
                            typeToExample.put("object", new EnumValue(mapVal, "object", null));
                        }
                        break;
                    default:
                        break;
                }
            }
        }
        if (typeToExample.isEmpty()) {
            return null;
        }
        return typeToExample;
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

        PairCacheKey ck = new PairCacheKey(sourceJsonPath, currentJsonPath);
        CodegenSchema property = codegenSchemaCache.computeIfAbsent(ck, s -> new CodegenSchema());
        property.instanceType = "schema";
        property.jsonPath = currentJsonPath;
        property.getSchemasFn = getSchemasFn();

        String ref = p.get$ref();
        // put toExampleValue in a try-catch block to log the error as example values are not critical
        try {
            property.example = toExampleValue(p);
        } catch (Exception e) {
            LOGGER.error("Error in generating `example` for the property {}. Default to ERROR_TO_EXAMPLE_VALUE. Enable debugging for more info.", sourceJsonPath);
            LOGGER.debug("Exception from toExampleValue: {}", e.getMessage());
            property.example = "ERROR_TO_EXAMPLE_VALUE";
        }
        if (ref != null) {
            setSchemaLocationInfo(ref, sourceJsonPath, currentJsonPath, property);
            if (addSchemaImportsFromV3SpecLocations && sourceJsonPath != null && sourceJsonPath.equals(currentJsonPath)) {
                // import from $ref
                property.imports = new TreeSet<>();
                assert generatorMetadata != null;
                addImports(property.imports, getImports(sourceJsonPath, property, generatorMetadata.getFeatureSet()));
            }
            if (p.getSpecVersion().compareTo(SpecVersion.V31) < 0) {
                //  stop processing if version is less than 3.1.0
                return property;
            }
        }

        if (p.equals(trueSchema)) {
            property.isBooleanSchemaTrue = true;
        } else if (p.equals(falseSchema)) {
            property.isBooleanSchemaFalse = true;
        }
        property.type = p.getType();
        property.types = getTypes(p);

        ModelUtils.syncValidationProperties(p, property);
        property.format = p.getFormat();
        property.externalDocumentation = p.getExternalDocs();
        property.maxContains = p.getMaxContains();
        property.minContains = p.getMinContains();
        property.dependentRequired = getDependentRequired((LinkedHashMap<String, List<String>>) p.getDependentRequired());

        /*
         Order of assigning properties must reverse the order in
         CodegenSchema.getSchemaa
         so that jsonPathPiece.camelCase names can be assigned correctly
         with the root schema having an unmodified jsonPathPiece.className
         -->
        (self)
        unevaluatedProperties
        unevaluatedItems
        then
        propertyNames
        properties
        prefixItems
        patternProperties
        oneOf
        not
        items
        if_
        enums
        else
        dependentSchemas
        contains
        const
        anyOf
        allOf
        additionalProperties
         */
        setSchemaLocationInfo(null, sourceJsonPath, currentJsonPath, property);
        HashMap<String, CodegenKey> requiredAndOptionalProperties = new HashMap<>();
        Schema unevaluatedPropertiesSchema = getSchemaFromBooleanOrSchema(p.getUnevaluatedProperties());
        if (unevaluatedPropertiesSchema != null) {
            property.unevaluatedProperties = fromSchema(unevaluatedPropertiesSchema, sourceJsonPath, currentJsonPath + "/unevaluatedProperties");
        }
        Schema unevaluatedItemsSchema = p.getUnevaluatedItems();
        if (unevaluatedItemsSchema != null) {
            property.unevaluatedItems = fromSchema(unevaluatedItemsSchema, sourceJsonPath, currentJsonPath + "/unevaluatedItems");
        }
        if (p.getThen() != null) {
            property.then = fromSchema(p.getThen(), sourceJsonPath, currentJsonPath + "/then");
        }

        property.properties = getProperties(((Schema<?>) p).getProperties(), sourceJsonPath, currentJsonPath, requiredAndOptionalProperties);
        if (p.getPatternProperties() != null) {
            property.patternProperties = getPatternProperties(p.getPatternProperties(), currentJsonPath, sourceJsonPath);
        }
        if (p.getPrefixItems() != null && !p.getPrefixItems().isEmpty()) {
            property.prefixItems = getPrefixItems(p.getPrefixItems(), currentJsonPath, sourceJsonPath);
        }
        LinkedHashSet<String> required = p.getRequired() == null ? new LinkedHashSet<>()
                : new LinkedHashSet<>(((Schema<?>) p).getRequired());
        List<Schema> oneOfs = ((Schema<?>) p).getOneOf();
        if (oneOfs != null && !oneOfs.isEmpty()) {
            property.oneOf = getComposedProperties(oneOfs, "oneOf", sourceJsonPath, currentJsonPath);
        }
        Schema notSchema = p.getNot();
        if (notSchema != null) {
            property.not = fromSchema(notSchema, sourceJsonPath, currentJsonPath + "/not");
        }
        if (p.getItems() != null) {
            property.items = fromSchema(
                    p.getItems(), sourceJsonPath, currentJsonPath + "/items");
        }
        if (property.prefixItems != null || property.items != null) {
            if (property.prefixItems == null) {
                property.listItemSchema = property.items;
            } else if (property.items == null) {
                // any type of items may be added on after prefixItems
                property.listItemSchema = new CodegenSchema();
            } else {
                // items + prefixItems exists
                property.listItemSchema = property.items;
                for (CodegenSchema prefixItem: property.prefixItems) {
                    property.listItemSchema = property.listItemSchema.add(prefixItem);
                }
            }
        }
        if (p.getIf() != null) {
            property.if_ = fromSchema(p.getIf(), sourceJsonPath, currentJsonPath + "/if");
        }
        if (p.getEnum() != null) {
            ArrayList<Object> values = new ArrayList<>(((Schema<?>) p).getEnum());
            property.enumInfo = getEnumInfo(values, p, currentJsonPath, sourceJsonPath, property.types, "Enums");
        }
        if (p.getElse() != null) {
            property.else_ = fromSchema(p.getElse(), sourceJsonPath, currentJsonPath + "/else");
        }
        property.dependentSchemas = getDependentSchemas(((Schema<?>) p).getDependentSchemas(), sourceJsonPath, currentJsonPath);
        if (p.getContains() != null) {
            property.contains = fromSchema(p.getContains(), sourceJsonPath, currentJsonPath + "/contains");
        }
        if (p.getConst() != null) {
            ArrayList<Object> values = new ArrayList<>();
            values.add(p.getConst());
            property.constInfo = getEnumInfo(values, p, currentJsonPath, sourceJsonPath, property.types, "Const");
        }
        List<Schema> anyOfs = ((Schema<?>) p).getAnyOf();
        if (anyOfs != null && !anyOfs.isEmpty()) {
            property.anyOf = getComposedProperties(anyOfs, "anyOf", sourceJsonPath, currentJsonPath);
        }
        List<Schema> allOfs = ((Schema<?>) p).getAllOf();
        if (allOfs != null && !allOfs.isEmpty()) {
            property.allOf = getComposedProperties(allOfs, "allOf", sourceJsonPath, currentJsonPath);
        }
        property.additionalProperties = getAdditionalProperties(p, sourceJsonPath, currentJsonPath);
        // ideally requiredProperties would come before properties
        if (currentJsonPath != null) {
            String currentName = currentJsonPath.substring(currentJsonPath.lastIndexOf("/") + 1);
            property.requiredProperties = getRequiredProperties(required, property.properties, property.additionalProperties, requiredAndOptionalProperties, sourceJsonPath, ((Schema<?>) p).getProperties(), currentName);
            property.optionalProperties = getOptionalProperties(property.properties, required, sourceJsonPath, currentName);
            if ((property.types == null || property.types.contains("object")) && sourceJsonPath != null) {
                // only set mapInputJsonPathPiece when object input is possible
                boolean requiredPropsExist = property.requiredProperties != null;
                boolean optionalPropsExist = property.optionalProperties != null;
                String firstBoolChar = requiredPropsExist? "1" : "0";
                String SecondBoolChar = optionalPropsExist? "1" : "0";
                String boolState = firstBoolChar + SecondBoolChar;
                switch (boolState) {
                    case "00":
                        if (property.additionalProperties != null) {
                            // only addProps
                            property.mapInputJsonPathPiece = getKey(currentName + objectIOClassNamePiece + arrayObjectInputClassNameSuffix, "schemaProperty", sourceJsonPath);
                            // even though the definition is the same, mapOutputJsonPathPiece needs to be different
                            // so an implementing class can be written
                            property.mapOutputJsonPathPiece = getKey(currentName + objectIOClassNamePiece, "schemaProperty", sourceJsonPath);
                        }
                        break;
                    case "11":
                        // optional + required
                        property.mapInputJsonPathPiece = getKey(currentName + objectIOClassNamePiece + arrayObjectInputClassNameSuffix, "schemaProperty", sourceJsonPath);
                        property.mapOutputJsonPathPiece = getKey(currentName + objectIOClassNamePiece, "schemaProperty", sourceJsonPath);
                        break;
                    case "10":
                        // only required
                        property.mapInputJsonPathPiece = property.requiredProperties.jsonPathPiece();
                        property.mapOutputJsonPathPiece = getKey(currentName + objectIOClassNamePiece, "schemaProperty", sourceJsonPath);
                        break;
                    case "01":
                        // only optional
                        property.mapInputJsonPathPiece = property.optionalProperties.jsonPathPiece();
                        property.mapOutputJsonPathPiece = getKey(currentName + objectIOClassNamePiece, "schemaProperty", sourceJsonPath);
                        break;
                }
            }
            if ((property.types == null || property.types.contains("array")) && sourceJsonPath != null && (property.items != null || property.prefixItems != null)) {
                property.arrayOutputJsonPathPiece = getKey(currentName + arrayIOClassNamePiece, "schemaProperty", sourceJsonPath);
                property.arrayInputJsonPathPiece = getKey(currentName + arrayIOClassNamePiece+arrayObjectInputClassNameSuffix, "schemaProperty", sourceJsonPath);
            }
        }
        Schema propertyNamesSchema = p.getPropertyNames();
        if (propertyNamesSchema != null) {
            if (propertyNamesSchema.getTypes() == null) {
                HashSet<String> types = new HashSet<>();
                types.add("string");
                propertyNamesSchema.setTypes(types);
            }
            property.propertyNames = fromSchema(propertyNamesSchema, sourceJsonPath, currentJsonPath + "/propertyNames");
        }
        property.mapBuilders = getMapBuilders(property, currentJsonPath, sourceJsonPath);
        // end of properties that need to be ordered to set correct camelCase jsonPathPieces
        CodegenSchema additionalProperties = property.additionalProperties;
        LinkedHashMapWithContext<CodegenSchema> properties = property.properties;
        if (additionalProperties == null) {
            property.mapValueSchema = new CodegenSchema();
        } else {
            CodegenSchema mapValueSchema = null;
            if (additionalProperties.isBooleanSchemaFalse) {
                if (properties != null && !properties.isEmpty()) {
                    for (CodegenSchema prop: properties.values()) {
                        mapValueSchema = prop.add(mapValueSchema);
                    }
                }
            } else {
                mapValueSchema = additionalProperties;
                if (properties != null && !properties.isEmpty()) {
                    for (CodegenSchema prop: properties.values()) {
                        mapValueSchema = prop.add(mapValueSchema);
                    }
                }
            }
            property.mapValueSchema = mapValueSchema;
        }

        if (currentJsonPath != null) {
            String[] pathPieces = currentJsonPath.split("/");
            if (pathPieces.length >= 4) {
                // component schemas + properties/items/additionalProperties use case
                String lastPathFragment = pathPieces[pathPieces.length-1];
                String usedName = ModelUtils.decodeSlashes(lastPathFragment);
                if (pathPieces.length >= 5) {
                    // properties/items/additionalProperties use case
                    // # components schemas someSchema additionalProperties/items
                    if (lastPathFragment.equals("additionalProperties")) {
                        String priorFragment = pathPieces[pathPieces.length-2];
                        if (!"properties".equals(priorFragment)) {
                            property.schemaIsFromAdditionalProperties = true;
                        }
                    }
                } else if (currentJsonPath.startsWith("#/components/schemas/"))  {
                    // component schema use case
                    // TODO set discriminator on any schema instances in the future not just component schemas

                    property.discriminator = createDiscriminator(usedName, p, this.openAPI, currentJsonPath);
                    if (p instanceof ComposedSchema) {
                        updateModelForComposedSchema(property, p, currentJsonPath);
                    }

                    if (openAPI != null) {
                        property.testCases = extractSchemaTestCases(xSchemaTestExamplesRefPrefix + usedName);
                    }

                }
            }
        }
        property.description = getCodegenText(p.getDescription());
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
        if (((Schema<?>) p).getExtensions() != null && !((Schema<?>) p).getExtensions().isEmpty()) {
            property.vendorExtensions = ((Schema<?>) p).getExtensions();
        }

        if (ModelUtils.isAnyType(p)) {
            // The 'null' value is allowed when the OAS schema is 'any type'.
            // See https://github.com/OAI/OpenAPI-Specification/issues/1389
            if (Boolean.FALSE.equals(p.getNullable())) {
                LOGGER.warn("Schema '{}' is any type, which includes the 'null' value. 'nullable' cannot be set to 'false'", p.getName());
            }
        }
        property.patternInfo = getPatternInfo(p.getPattern());

        property.example = toExampleValue(p);
        Set<CodegenSchema> seenSchemas = new HashSet<>();
        property.typeToExample = getTypeToExample(property, seenSchemas);
        if (addSchemaImportsFromV3SpecLocations && sourceJsonPath != null && sourceJsonPath.equals(currentJsonPath)) {
            // imports from properties/items/additionalProperties/oneOf/anyOf/allOf/not
            property.imports = new TreeSet<>();
            assert generatorMetadata != null;
            addImports(property.imports, getImports(sourceJsonPath, property, generatorMetadata.getFeatureSet()));
        }

        LOGGER.debug("debugging fromSchema return: {}", property);
        return property;
    }

    protected List<MapBuilder<CodegenSchema>> getMapBuilders(CodegenSchema schema, String currentJsonPath, String sourceJsonPath) {
        return null;
    }

    @Override
    public String toRefClass(String ref, String sourceJsonPath, String expectedComponentType) {
        if (ref == null) {
            return null;
        }
        String[] refPieces = ref.split("/");
        return toModelName(refPieces[refPieces.length-1], ref);
    }

    protected String getOperationIdSnakeCase(String operationId) {
        if (StringUtils.isEmpty(operationId)) {
            throw new RuntimeException("Empty method name (operationId) not allowed");
        }
        return org.openapijsonschematools.codegen.common.StringUtils.underscore(operationId);
    }

    protected CodegenKey getOperationId(Operation operation, String path, String httpMethod) {
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
        String pascalCaseName = toModelName(operationId, null);
        String kebabCase = pascalCaseName.toLowerCase(Locale.ROOT);
        return new CodegenKey(
                operationId,
                isValid(operationId),
                getOperationIdSnakeCase(operationId),
                pascalCaseName,
                kebabCase,
                null
        );
    }

    private void updateXParameters(
            CodegenParameter derefParam,
            CodegenParameter p,
            List<CodegenParameter> xParams,
            List<String> xParametersRequired,
            HashMap<String, Schema> xParametersProperties
            ) {
        xParams.add(p);
        if (Boolean.TRUE.equals(derefParam.required)) {
            xParametersRequired.add(derefParam.name);
        }
        String schemaJsonPath = derefParam.getSchemaJsonPath();
        Schema parameterSchema = new Schema();
        parameterSchema.set$ref(schemaJsonPath);
        xParametersProperties.put(derefParam.name, parameterSchema);
    }

    private CodegenParametersInfo getParametersInfo(LinkedHashMap<Pair<String, String>, CodegenParameter> pathItemParameters, List<Parameter> parameters, String operationJsonPath) {
        if ((pathItemParameters == null || pathItemParameters.isEmpty()) && (parameters == null || parameters.isEmpty())) {
            return null;
        }
        List<CodegenParameter> allParams = new ArrayList<>();
        List<CodegenParameter> pathParams = new ArrayList<>();
        List<CodegenParameter> queryParams = new ArrayList<>();
        List<CodegenParameter> headerParams = new ArrayList<>();
        List<CodegenParameter> cookieParams = new ArrayList<>();
        HashMap<String, Schema> pathParametersProperties = new HashMap<>();
        List<String> pathParametersRequired = new ArrayList<>();
        HashMap<String, Schema> queryParametersProperties = new HashMap<>();
        List<String> queryParametersRequired = new ArrayList<>();
        HashMap<String, Schema> headerParametersProperties = new HashMap<>();
        List<String> headerParametersRequired = new ArrayList<>();
        HashMap<String, Schema> cookieParametersProperties = new HashMap<>();
        List<String> cookieParametersRequired = new ArrayList<>();
        ArrayList<CodegenParameter> usedPathItemParams = null;
        LinkedHashMap<Pair<String, String>, CodegenParameter> usedPathItemParameters = new LinkedHashMap<>();
        if (pathItemParameters != null) {
            usedPathItemParameters.putAll(pathItemParameters);
        }
        ParameterCollection operationParameters = null;
        if (parameters != null) {
            int i = 0;
            for (Parameter param : parameters) {
                String usedSourceJsonPath = operationJsonPath + "/parameters/" + i;
                CodegenParameter p = fromParameter(param, usedSourceJsonPath);
                allParams.add(p);
                i++;

                CodegenParameter derefParam = p.getSelfOrDeepestRef();
                Pair<String, String> inName = Pair.of(derefParam.in, derefParam.name);
                if (pathItemParameters != null && usedPathItemParameters.containsKey(inName)) {
                    // do not use a path item parameter if it is overridden by an operation parameter
                    usedPathItemParameters.remove(inName);
                }

                switch (derefParam.in) {
                    case "query":
                        updateXParameters(derefParam, p, queryParams, queryParametersRequired, queryParametersProperties);
                        break;
                    case "path":
                        updateXParameters(derefParam, p, pathParams, pathParametersRequired, pathParametersProperties);
                        break;
                    case "header":
                        updateXParameters(derefParam, p, headerParams, headerParametersRequired, headerParametersProperties);
                        break;
                    case "cookie":
                        updateXParameters(derefParam, p, cookieParams, cookieParametersRequired, cookieParametersProperties);
                        break;
                    default:
                        LOGGER.warn("Unknown parameter type for {}", derefParam.name);
                        break;
                }
            }
            operationParameters = new ParameterCollection(allParams, pathParams, queryParams, headerParams, cookieParams);
        }
        ArrayList<CodegenParameter> pathItemQueryParams;
        ArrayList<CodegenParameter> pathItemPathParams;
        ArrayList<CodegenParameter> pathItemHeaderParams;
        ArrayList<CodegenParameter> pathItemCookieParams;
        ParameterCollection pathItemParams = null;
        if (!usedPathItemParameters.isEmpty()) {
            pathItemQueryParams = new ArrayList<>();
            pathItemPathParams = new ArrayList<>();
            pathItemHeaderParams = new ArrayList<>();
            pathItemCookieParams = new ArrayList<>();
            if (!usedPathItemParameters.isEmpty()) {
                usedPathItemParams = new ArrayList<>();
            }
            for (CodegenParameter pathItemParam: usedPathItemParameters.values()) {
                usedPathItemParams.add(pathItemParam);
                CodegenParameter derefParam = pathItemParam.getSelfOrDeepestRef();
                switch (derefParam.in) {
                    case "query":
                        updateXParameters(derefParam, pathItemParam, pathItemQueryParams, queryParametersRequired, queryParametersProperties);
                        break;
                    case "path":
                        updateXParameters(derefParam, pathItemParam, pathItemPathParams, pathParametersRequired, pathParametersProperties);
                        break;
                    case "header":
                        updateXParameters(derefParam, pathItemParam, pathItemHeaderParams, headerParametersRequired, headerParametersProperties);
                        break;
                    case "cookie":
                        updateXParameters(derefParam, pathItemParam, pathItemCookieParams, cookieParametersRequired, cookieParametersProperties);
                        break;
                    default:
                        LOGGER.warn("Unknown parameter type for {}", derefParam.name);
                        break;
                }
            }
            pathItemParams = new ParameterCollection(usedPathItemParams, pathItemPathParams, pathItemQueryParams, pathItemHeaderParams, pathItemCookieParams);
        }
        String parametersJsonPath = operationJsonPath + "/parameters";
        CodegenKey jsonPathPiece = getKey("parameters", "parameters", parametersJsonPath);
        String subpackage = getSubpackage(parametersJsonPath);
        CodegenSchema pathParametersSchema = getXParametersSchema(pathParametersProperties, pathParametersRequired, operationJsonPath + "/" + "PathParameters", operationJsonPath + "/" + "PathParameters");
        CodegenSchema queryParametersSchema = getXParametersSchema(queryParametersProperties, queryParametersRequired, operationJsonPath + "/" + "QueryParameters", operationJsonPath + "/" + "QueryParameters");
        CodegenSchema headerParametersSchema = getXParametersSchema(headerParametersProperties, headerParametersRequired, operationJsonPath + "/" + "HeaderParameters", operationJsonPath + "/" + "HeaderParameters");
        CodegenSchema cookieParametersSchema = getXParametersSchema(cookieParametersProperties, cookieParametersRequired, operationJsonPath + "/" + "CookieParameters", operationJsonPath + "/" + "CookieParameters");
        return new CodegenParametersInfo(jsonPathPiece, subpackage, operationParameters, pathParametersSchema, queryParametersSchema, headerParametersSchema, cookieParametersSchema, pathItemParams);
    }

    @Deprecated
    public CodegenOperation fromOperation(Operation operation, String jsonPath, LinkedHashMap<Pair<String, String>, CodegenParameter> pathItemParameters) {
        return fromOperation(operation, jsonPath, pathItemParameters, null);
    }

    /**
     * Convert OAS Operation object to Codegen Operation object
     *
     * @param operation  OAS operation object
     * @param jsonPath   the json path of the operation
     * @return Codegen Operation object
     */
    @Override
    public CodegenOperation fromOperation(Operation operation, String jsonPath, LinkedHashMap<Pair<String, String>, CodegenParameter> pathItemParameters, CodegenList<CodegenServer> rootOrPathServers) {
        LOGGER.debug("fromOperation => operation: {}", operation);
        if (operation == null) {
            throw new RuntimeException("operation cannot be null in fromOperation");
        }

        Map<String, Object> vendorExtensions = null;
        if (operation.getExtensions() != null && !operation.getExtensions().isEmpty()) {
            vendorExtensions = new HashMap<>(operation.getExtensions());
        }

        // tags
        List<String> operationTagNames = operation.getTags();
        Map<String, CodegenTag> tags = new HashMap<>();
        if (operationTagNames != null) {
            for (String tagName: operationTagNames) {
                CodegenTag codegenTag = fromTag(tagName, null);
                tags.put(tagName, codegenTag);
            }
        } else {
            String tagName = "default";
            CodegenTag codegenTag = fromTag(tagName, "operations that lack tags are assigned this default tag");
            tags.put(tagName, codegenTag);
        }

        String[] pathPieces = jsonPath.split("/");
        String httpMethod = pathPieces[pathPieces.length-1];
        String path = ModelUtils.decodeSlashes(pathPieces[pathPieces.length-2]);
        CodegenKey operationId = getOperationId(operation, path, httpMethod);

        // servers setting
        CodegenList<CodegenServer> servers = null;
        if (operation.getServers() != null && !operation.getServers().isEmpty()) {
            // use operation-level servers first if defined
            servers = fromServers(operation.getServers(), jsonPath + "/servers");
        }

        CodegenText summary = null;
        if (operation.getSummary() != null) {
            String sum = operation.getSummary();
            summary = new CodegenText(sum, escapeText(sum));
        }
        CodegenText description = getCodegenText(operation.getDescription());
        Boolean deprecated = operation.getDeprecated();

        CodegenMap<CodegenResponse> responses = null;
        LinkedHashSet<String> produces = null;
        CodegenResponse defaultResponse = null;
        TreeMap<String, CodegenResponse> nonDefaultResponses = null;
        TreeMap<Integer, CodegenResponse> wildcardCodeResponses = null;
        TreeMap<Integer, CodegenResponse> statusCodeResponses = null;
        LinkedHashSet<String> errorStatusCodes = null;
        LinkedHashSet<Integer> errorWildcardStatusCodes = null;
        LinkedHashSet<Integer> nonErrorStatusCodes = null;
        LinkedHashSet<Integer> nonErrorWildcardStatusCodes = null;
        if (operation.getResponses() != null && !operation.getResponses().isEmpty()) {
            Map<String, CodegenResponse> responsesMap = new TreeMap<>();
            String responsesJsonPath = jsonPath + "/responses";
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
                String usedSourceJsonPath = responsesJsonPath + "/" + key;
                CodegenResponse r = fromResponse(response, usedSourceJsonPath);

                responsesMap.put(key, r);
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
                    int firstNumber = Integer.parseInt(key.substring(0, 1));
                    wildcardCodeResponses.put(firstNumber, r);
                    if (firstNumber > 3) {
                        // store error response code whether on not it has a body
                        if (errorWildcardStatusCodes == null) {
                            errorWildcardStatusCodes = new LinkedHashSet<>();
                        }
                        errorWildcardStatusCodes.add(firstNumber);
                    } else {
                        if (nonErrorWildcardStatusCodes == null) {
                            nonErrorWildcardStatusCodes = new LinkedHashSet<>();
                        }
                        nonErrorWildcardStatusCodes.add(firstNumber);
                    }
                    continue;
                }
                if (statusCodeResponses == null) {
                    statusCodeResponses = new TreeMap<>();
                }
                int statusCode = Integer.parseInt(key);
                statusCodeResponses.put(statusCode, r);
                if (statusCode > 399) {
                    // store error response code whether on not it has a body
                    if (errorStatusCodes == null) {
                        errorStatusCodes = new LinkedHashSet<>();
                    }
                    errorStatusCodes.add(key);
                } else {
                    if (nonErrorStatusCodes == null) {
                        nonErrorStatusCodes = new LinkedHashSet<>();
                    }
                    nonErrorStatusCodes.add(statusCode);
                }
            }

            // sort them
            responsesMap = new TreeMap<>(responsesMap);
            if (nonDefaultResponses != null) {
                nonDefaultResponses = new TreeMap<>(nonDefaultResponses);
            }
            if (statusCodeResponses != null) {
                statusCodeResponses = new TreeMap<>(statusCodeResponses);
            }
            if (wildcardCodeResponses != null) {
                wildcardCodeResponses = new TreeMap<>(wildcardCodeResponses);
            }
            CodegenKey responsesJsonPathPiece = getKey("responses", "misc", responsesJsonPath);
            responses = new CodegenMap<>(responsesMap, responsesJsonPathPiece, getSubpackage(responsesJsonPath));
        }

        List<CodegenCallback> callbacks = null;
//        if (operation.getCallbacks() != null && !operation.getCallbacks().isEmpty()) {
//            List<CodegenCallback> foundCallbacks = new ArrayList<>();
//            operation.getCallbacks().forEach((name, callback) -> {
//                CodegenCallback c = fromCallback(name, callback, servers);
//                foundCallbacks.add(c);
//            });
//            callbacks = foundCallbacks;
//        }

        boolean hasRequiredParamOrBody = false;
        boolean hasOptionalParamOrBody = false;

        RequestBody opRequestBody = operation.getRequestBody();
        CodegenRequestBody requestBody = null;
        CodegenSchema requestBodySchema = null;
        if (opRequestBody != null) {
            requestBody = fromRequestBody(opRequestBody, jsonPath + "/requestBody");
            CodegenRequestBody derefRequestBody = requestBody.getSelfOrDeepestRef();
            if (Boolean.TRUE.equals(derefRequestBody.required)) {
                hasRequiredParamOrBody = true;
            } else {
                hasOptionalParamOrBody = true;
            }
            LinkedHashMap<String, Schema> requestBodySchemaProperties = new LinkedHashMap<>();
            for (Entry<CodegenKey, CodegenMediaType> entry: derefRequestBody.content.entrySet()) {
                String contentType = entry.getKey().original;
                CodegenSchema schema = entry.getValue().schema;
                if (schema == null) {
                    continue;
                }
                String bodySchemaRef = schema.getSelfOrDeepestRef().jsonPath;
                Schema bodySchema = new Schema();
                bodySchema.set$ref(bodySchemaRef);
                requestBodySchemaProperties.put(contentType, bodySchema);
            }
            // current json path used because
            // schemas are imported into a python file generated from that jsonPath
            requestBodySchema = getXParametersSchema(requestBodySchemaProperties, new ArrayList<>(), jsonPath, jsonPath);
        }

        CodegenParametersInfo parametersInfo = getParametersInfo(pathItemParameters, operation.getParameters(), jsonPath);
        // create optional, required parameters
        if (parametersInfo != null) {
            if (parametersInfo.hasRequired) {
                hasRequiredParamOrBody = true;
            }
            if (parametersInfo.hasOptional) {
                hasOptionalParamOrBody = true;
            }
        }
        CodegenList<CodegenSecurityRequirementObject> security = fromSecurity(operation.getSecurity(), jsonPath + "/security");
        ExternalDocumentation externalDocs = operation.getExternalDocs();
        CodegenKey jsonPathPiece = getKey(pathPieces[pathPieces.length-1], "verb");
        CodegenList<CodegenServer> usedServers = (servers != null) ? servers : rootOrPathServers;
        List<MapBuilder<?>> builders = getOperationBuilders(jsonPath, requestBody, parametersInfo, usedServers, security);

        return new CodegenOperation(
                deprecated,
                nonErrorStatusCodes,
                nonErrorWildcardStatusCodes,
                errorStatusCodes,
                errorWildcardStatusCodes,
                summary,
                description,
                produces,
                servers,
                requestBody,
                parametersInfo,
                hasRequiredParamOrBody,
                hasOptionalParamOrBody,
                security,
                tags,
                responses,
                statusCodeResponses,
                wildcardCodeResponses,
                nonDefaultResponses,
                defaultResponse,
                callbacks,
                externalDocs,
                vendorExtensions,
                operationId,
                jsonPathPiece,
                requestBodySchema,
                builders
            );
    }

    protected List<MapBuilder<?>> getOperationBuilders(String jsonSchema, CodegenRequestBody requestBody, CodegenParametersInfo parametersInfo, CodegenList<CodegenServer> servers, CodegenList<CodegenSecurityRequirementObject> security) {
        return null;
    }

    private CodegenSchema getXParametersSchema(HashMap<String, Schema> xParametersProperties, List<String> xParametersRequired, String sourceJsonPath, String currentJsonPath) {
        if (xParametersProperties.isEmpty()) {
            return null;
        }
        ObjectSchema xParametersSchema = new ObjectSchema();
        xParametersSchema.setProperties(xParametersProperties);
        xParametersSchema.setRequired(xParametersRequired);
        xParametersSchema.setAdditionalProperties(Boolean.FALSE);
        CodegenSchema schema = fromSchema(xParametersSchema, sourceJsonPath, currentJsonPath);
        schema.imports = new TreeSet<>();
        addImports(schema.imports, getImports(sourceJsonPath, schema, generatorMetadata.getFeatureSet()));
        return schema;
    }

    @Override
    public CodegenList<CodegenSecurityRequirementObject> fromSecurity(List<SecurityRequirement> security, String jsonPath) {
        if (security == null) {
            return null;
        }
        List<CodegenSecurityRequirementObject> items = new ArrayList<>();
        int i = 0;
        for (SecurityRequirement specSecurityRequirement: security) {
            TreeSet<String> imports = new TreeSet<>();
            HashMap<String, CodegenSecurityRequirementValue> map = fromSecurityRequirement(specSecurityRequirement, jsonPath+ "/" + i);
            for (CodegenSecurityRequirementValue val: map.values()) {
                imports.addAll(val.imports);
            }
            String securityJsonPathPiece = jsonPath + "/" + i;
            String subpackage = getSubpackage(securityJsonPathPiece);
            CodegenKey key = getKey(String.valueOf(i), "security", securityJsonPathPiece);
            var securityRequirementObject = new CodegenSecurityRequirementObject(
                    imports,
                    map,
                    subpackage,
                    key
            );
            items.add(securityRequirementObject);
            i++;
        }
        CodegenKey jsonPathPiece = getKey("", "security", jsonPath);
        String subpackage = getSubpackage(jsonPath);
        List<MapBuilder<CodegenSecurityRequirementObject>> builders = getSecurityBuilders(items, jsonPath);
        return new CodegenList<>(
                items,
                jsonPathPiece,
                subpackage,
                builders
        );
    }

    protected List<MapBuilder<CodegenSecurityRequirementObject>> getSecurityBuilders(List<CodegenSecurityRequirementObject> items, String jsonPath) {
        return null;
    }

    private String responsePathFromDocRoot(String sourceJsonPath) {
        if (sourceJsonPath.startsWith("#/components/responses")) {
            String moduleLocation = getModuleLocation(sourceJsonPath);
            return moduleLocation.replace('.', File.separatorChar).substring(packageName.length()+1);
        }
        // otherwise response is inline and the operation file is the location
        // #/paths/somePath/verb/responses/200
        int secondToLastSlashIndex = sourceJsonPath.lastIndexOf("/", sourceJsonPath.lastIndexOf("/")-1);
        String sourceJsonPathSubstring = sourceJsonPath.substring(0, secondToLastSlashIndex);
        String moduleLocation = getModuleLocation(sourceJsonPathSubstring);
        return moduleLocation.replace('.', File.separatorChar).substring(packageName.length()+1);
    }

    private CodegenText getCodegenText(String input) {
        if (input == null) {
            return null;
        }
        return new CodegenText(input, escapeText(input));
    }

    /**
     * Convert OAS Response object to Codegen Response object
     *
     * @param response     OAS Response object
     * @return Codegen Response object
     */
    @Override
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

        CodegenText description = getCodegenText(response.getDescription());
        Map<String, Object> vendorExtensions = null;
        if (response.getExtensions() != null && !response.getExtensions().isEmpty()) {
            vendorExtensions = response.getExtensions();
        }

        Map<String, Header> responseHeaders = response.getHeaders();
        CodegenMap<CodegenHeader> headers = null;
        HashMap<String, Schema> headersProperties = new HashMap<>();
        List<String> headersRequired = new ArrayList<>();
        if (responseHeaders != null && !responseHeaders.isEmpty()) {
            var headersMap = new HashMap<String, CodegenHeader>();
            for (Entry<String, Header> entry : responseHeaders.entrySet()) {
                String headerName = entry.getKey();
                Header header = entry.getValue();
                String headerSourceJsonPath = sourceJsonPath + "/headers/" + headerName;
                CodegenHeader responseHeader = fromHeader(header, headerSourceJsonPath);
                headersMap.put(headerName, responseHeader);
                CodegenHeader derefParam = responseHeader.getSelfOrDeepestRef();
                if (Boolean.TRUE.equals(derefParam.required)) {
                    headersRequired.add(headerName);
                }
                String schemaJsonPath = responseHeader.getSchemaJsonPath();
                Schema parameterSchema = new Schema();
                parameterSchema.set$ref(schemaJsonPath);
                headersProperties.put(headerName, parameterSchema);
            }
            String headersJsonPath = sourceJsonPath + "/headers";
            CodegenKey headersJsonPathPiece = getKey("headers", "headers", headersJsonPath);
            String subpackage = getSubpackage(headersJsonPath);
            headers = new CodegenMap<>(headersMap, headersJsonPathPiece, subpackage);
        }
        LinkedHashMap<CodegenKey, CodegenMediaType> content = getContent(response.getContent(), sourceJsonPath + "/content");
        String expectedComponentType = "responses";
        String ref = response.get$ref();
        CodegenRefInfo<CodegenResponse> refInfo = null;
        TreeSet<String> imports = null;
        if (ref != null) {
            String refModule = toRefModule(ref, sourceJsonPath, expectedComponentType);
            String refClass = toRefClass(ref, sourceJsonPath, expectedComponentType);
            CodegenResponse rb = fromResponse(ModelUtils.getReferencedApiResponse(openAPI, response), ref);
            refInfo = new CodegenRefInfo<>(rb, refClass, refModule, getRefModuleLocation(ref), null);
            imports = new TreeSet<>();
            imports.add(getImport(refInfo));
        }
        CodegenKey jsonPathPiece = getJsonPathPiece(expectedComponentType, sourceJsonPath, sourceJsonPath);
        String[] pathPieces = sourceJsonPath.split("/");
        // #/components/responses/A
        boolean componentModule = pathPieces.length == 4 && sourceJsonPath.startsWith("#/components/" + expectedComponentType + "/");

        Map<String, Object> finalVendorExtensions = vendorExtensions;
        TreeSet<String> finalImports = imports;
        CodegenSchema headersObjectSchema = getXParametersSchema(headersProperties, headersRequired, sourceJsonPath + "/" + headersSchemaFragment, sourceJsonPath + "/" + headersSchemaFragment);
        String pathFromDocRoot = responsePathFromDocRoot(sourceJsonPath);
        String subpackage = getSubpackage(sourceJsonPath);
        r = new CodegenResponse(jsonPathPiece, headers, headersObjectSchema, description, finalVendorExtensions, content, refInfo, finalImports, componentModule, pathFromDocRoot, subpackage);
        codegenResponseCache.put(sourceJsonPath, r);
        return r;
    }

    public CodegenTag fromTag(String name, String description) {
        CodegenTag tag = codegenTagCache.getOrDefault(name, null);
        if (tag != null) {
            return tag;
        }
        CodegenText castDescription = getCodegenText(description);
        tag = new CodegenTag(name, toApiFilename(name), toApiName(name), castDescription);
        codegenTagCache.put(name, tag);
        return tag;
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
        CodegenRefInfo<CodegenHeader> refInfo = null;
        TreeSet<String> imports = null;
        if (ref != null) {
            String refModule = toRefModule(ref, sourceJsonPath, expectedComponentType);
            String refClass = toRefClass(ref, sourceJsonPath, expectedComponentType);
            CodegenHeader rb = fromHeader(ModelUtils.getReferencedHeader(openAPI, header), ref);
            refInfo = new CodegenRefInfo<>(rb, refClass, refModule, getRefModuleLocation(ref), null);
            imports =  new TreeSet<>();
            imports.add(getImport(refInfo));
        }
        CodegenKey jsonPathPiece = getJsonPathPiece(expectedComponentType, sourceJsonPath, sourceJsonPath);
        String[] pathPieces = sourceJsonPath.split("/");
        // #/components/headers/A
        boolean componentModule = pathPieces.length == 4 && sourceJsonPath.startsWith("#/components/" + expectedComponentType + "/");

        CodegenText description = getCodegenText(header.getDescription());
        Map<String, Object> vendorExtensions = null;
        if (header.getExtensions() != null && !header.getExtensions().isEmpty()) {
            vendorExtensions = header.getExtensions();
        }
        Boolean required = header.getRequired();
        LinkedHashMap<CodegenKey, CodegenMediaType> content = null;
        if (header.getContent() != null) {
            content = getContent(header.getContent(), sourceJsonPath + "/content");
        }
        Boolean deprecated = header.getDeprecated();

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

        Boolean explode = header.getExplode();

        String style = null;
        if (header.getStyle() != null) {
            style = header.getStyle().toString();
        }
        TreeSet<String> finalImports = imports;
        String finalStyle = style;
        Map<String, Object> finalVendorExtensions = vendorExtensions;
        LinkedHashMap<CodegenKey, CodegenMediaType> finalContent = content;
        CodegenSchema finalSchema = schema;
        String example = getHeaderExampleValue(header);
        String subpackage = getSubpackage(sourceJsonPath);
        codegenHeader = new CodegenHeader(description, example, finalVendorExtensions, required, finalContent, finalImports, componentModule, jsonPathPiece, explode, finalStyle, deprecated, finalSchema, refInfo, subpackage);
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
        CodegenRefInfo<CodegenParameter> refInfo = null;
        TreeSet<String> imports = null;
        if (ref != null) {
            String refModule = toRefModule(ref, sourceJsonPath, expectedComponentType);
            String refClass = toRefClass(ref, sourceJsonPath, expectedComponentType);
            CodegenParameter rb = fromParameter(ModelUtils.getReferencedParameter(openAPI, parameter), ref);
            refInfo = new CodegenRefInfo<>(rb, refClass, refModule, getRefModuleLocation(ref), null);
            imports = new TreeSet<>();
            imports.add(getImport(refInfo));
        }
        CodegenKey jsonPathPiece = getJsonPathPiece(expectedComponentType, sourceJsonPath, sourceJsonPath);
        String[] pathPieces = sourceJsonPath.split("/");
        // #/components/parameters/A
        boolean componentModule = pathPieces.length == 4 && sourceJsonPath.startsWith("#/components/" + expectedComponentType + "/");

        CodegenText description = getCodegenText(parameter.getDescription());
        Map<String, Object> vendorExtensions = null;
        if (parameter.getExtensions() != null && !parameter.getExtensions().isEmpty()) {
            vendorExtensions = parameter.getExtensions();
        }
        Boolean required = parameter.getRequired();
        LinkedHashMap<CodegenKey, CodegenMediaType> content = null;
        if (parameter.getContent() != null) {
            content = getContent(parameter.getContent(), sourceJsonPath + "/content");
        }

        Boolean deprecated = parameter.getDeprecated();

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

        Boolean explode = parameter.getExplode();

        String style = null;
        if (parameter.getStyle() != null) {
            style = parameter.getStyle().toString();
        }
        String baseName = parameter.getName();

        String in = parameter.getIn();
        Boolean allowEmptyValue = parameter.getAllowEmptyValue();
        if (parameter instanceof PathParameter || "path".equalsIgnoreCase(parameter.getIn())) {
            required = Boolean.TRUE;
        }

        // set the parameter example value
        // should be overridden by lang codegen
        String example = getParameterExampleValue(parameter);

        String finalStyle = style;
        TreeSet<String> finalImports = imports;
        Map<String, Object> finalVendorExtensions = vendorExtensions;
        LinkedHashMap<CodegenKey, CodegenMediaType> finalContent = content;
        CodegenSchema finalSchema = schema;
        Boolean allowReserved = parameter.getAllowReserved();
        String subpackage = getSubpackage(sourceJsonPath);
        codegenParameter = new CodegenParameter(description, example, finalVendorExtensions, required, finalContent, finalImports, componentModule, jsonPathPiece, explode, finalStyle, deprecated, finalSchema, in, allowEmptyValue, baseName, refInfo, allowReserved, subpackage);
        codegenParameterCache.put(sourceJsonPath, codegenParameter);
        LOGGER.debug("debugging codegenParameter return: {}", codegenParameter);
        return codegenParameter;
    }

    @Override
    public Function<CodegenSchema, List<CodegenSchema>> getSchemasFn() {
        return codegenSchema -> {
            ArrayList<CodegenSchema> schemasBeforeImports = new ArrayList<>();
            ArrayList<CodegenSchema> schemasAfterImports = new ArrayList<>();
            codegenSchema.getAllSchemas(schemasBeforeImports, schemasAfterImports, 0, false);
            schemasBeforeImports.addAll(schemasAfterImports);
            return schemasBeforeImports;
        };
    }

    @Override
    public boolean generateSeparateServerSchemas() {
        return false;
    }

    @Override
    public boolean shouldGenerateFile(String jsonPath) {
        return true;
    }

    @Override
    @SuppressWarnings("static-method")
    public HashMap<String, CodegenSecurityRequirementValue> fromSecurityRequirement(SecurityRequirement securityRequirement, String sourceJsonPath) {
        if (securityRequirement == null) {
            String msg = "securityRequirement in fromSecurityRequirement cannot be null!";
            LOGGER.error(msg);
            throw new RuntimeException(msg);
        }
        HashMap<String, CodegenSecurityRequirementValue> securityRequirements = new HashMap<>();
        for (Entry<String, List<String>> entry: securityRequirement.entrySet()) {
            String securitySchemeComponentName = entry.getKey();
            String jsonPath = sourceJsonPath + "/" + securitySchemeComponentName;
            CodegenSecurityRequirementValue codegenSecurityRequirementValue = codegenSecurityRequirementCache.getOrDefault(jsonPath, null);
            if (codegenSecurityRequirementValue != null) {
                securityRequirements.put(securitySchemeComponentName, codegenSecurityRequirementValue);
                continue;
            }
            String ref = "#/components/securitySchemes/" + securitySchemeComponentName;
            String expectedComponentType = "securitySchemes";
            String refModule = toRefModule(ref, jsonPath, expectedComponentType);
            String refClass = toRefClass(ref, jsonPath, expectedComponentType);
            SecurityScheme ss = new SecurityScheme();
            ss.set$ref(ref);
            CodegenSecurityScheme refCs = fromSecurityScheme(ModelUtils.getReferencedSecurityScheme(openAPI, ss), ref);
            CodegenRefInfo<CodegenSecurityScheme> refInfo = new CodegenRefInfo<>(refCs, refClass, refModule, getRefModuleLocation(ref), null);
            TreeSet<String> imports = new TreeSet<>();
            imports.add(getImport(refInfo));
            ArrayList<String> scopeNames = (ArrayList<String>) entry.getValue();

            codegenSecurityRequirementValue = new CodegenSecurityRequirementValue(
                    imports,
                    refInfo,
                    scopeNames
            );
            codegenSecurityRequirementCache.put(jsonPath, codegenSecurityRequirementValue);
            securityRequirements.put(securitySchemeComponentName, codegenSecurityRequirementValue);
        }
        return securityRequirements;
    }

    /**
     * Convert map of OAS SecurityScheme objects to a list of Codegen Security objects
     *
     * @param securityScheme the object being ingested
     * @param jsonPath the json path location being handled
     * @return a list of Codegen Security objects
     */
    @Override
    @SuppressWarnings("static-method")
    public CodegenSecurityScheme fromSecurityScheme(SecurityScheme securityScheme, String jsonPath) {
        if (securityScheme == null) {
            String msg = "securityScheme in fromSecurityScheme cannot be null!";
            LOGGER.error(msg);
            throw new RuntimeException(msg);
        }
        CodegenSecurityScheme codegenRequestBody = codegenSecuritySchemeCache.getOrDefault(jsonPath, null);
        if (codegenRequestBody != null) {
            return codegenRequestBody;
        }

        String ref = securityScheme.get$ref();
        String expectedComponentType = "securitySchemes";
        CodegenRefInfo<CodegenSecurityScheme> refInfo = null;
        TreeSet<String> imports = null;
        if (ref != null) {
            String refModule = toRefModule(ref, jsonPath, expectedComponentType);
            String refClass = toRefClass(ref, jsonPath, expectedComponentType);
            CodegenSecurityScheme refCs = fromSecurityScheme(ModelUtils.getReferencedSecurityScheme(openAPI, securityScheme), ref);
            refInfo = new CodegenRefInfo<>(refCs, refClass, refModule, getRefModuleLocation(ref), null);
            imports = new TreeSet<>();
            imports.add(getImport(refInfo));
        }
        CodegenOauthFlows flows = null;
        OAuthFlows sourceFlows = securityScheme.getFlows();
        if (sourceFlows != null) {
            CodegenOauthFlow implicit = null;
            CodegenOauthFlow password = null;
            CodegenOauthFlow clientCredentials = null;
            CodegenOauthFlow authorizationCode = null;
            Map<String, Object> flowsVendorExtensions = sourceFlows.getExtensions();
            OAuthFlow sourceFlow = sourceFlows.getImplicit();
            if (sourceFlow != null) {
                implicit = new CodegenOauthFlow(
                        sourceFlow.getAuthorizationUrl(),
                        sourceFlow.getTokenUrl(),
                        sourceFlow.getRefreshUrl(),
                        sourceFlow.getScopes(),
                        sourceFlow.getExtensions()
                );
            }
            sourceFlow = sourceFlows.getPassword();
            if (sourceFlow != null) {
                password = new CodegenOauthFlow(
                        sourceFlow.getAuthorizationUrl(),
                        sourceFlow.getTokenUrl(),
                        sourceFlow.getRefreshUrl(),
                        sourceFlow.getScopes(),
                        sourceFlow.getExtensions()
                );
            }
            sourceFlow = sourceFlows.getClientCredentials();
            if (sourceFlow != null) {
                clientCredentials = new CodegenOauthFlow(
                        sourceFlow.getAuthorizationUrl(),
                        sourceFlow.getTokenUrl(),
                        sourceFlow.getRefreshUrl(),
                        sourceFlow.getScopes(),
                        sourceFlow.getExtensions()
                );
            }
            sourceFlow = sourceFlows.getAuthorizationCode();
            if (sourceFlow != null) {
                authorizationCode = new CodegenOauthFlow(
                        sourceFlow.getAuthorizationUrl(),
                        sourceFlow.getTokenUrl(),
                        sourceFlow.getRefreshUrl(),
                        sourceFlow.getScopes(),
                        sourceFlow.getExtensions()
                );
            }
            flows = new CodegenOauthFlows(
                    implicit,
                    password,
                    clientCredentials,
                    authorizationCode,
                    flowsVendorExtensions
            );
        }
        CodegenKey jsonPathPiece = getJsonPathPiece(expectedComponentType, jsonPath, jsonPath);
        String[] pathPieces = jsonPath.split("/");
        // #/components/requestBodies/A
        boolean componentModule = pathPieces.length == 4 && jsonPath.startsWith("#/components/" + expectedComponentType + "/");

        String type = securityScheme.getType().toString();
        CodegenText description = getCodegenText(securityScheme.getDescription());
        String name = securityScheme.getName();
        String in = null;
        if (securityScheme.getIn() != null) {
            in = securityScheme.getIn().toString();
        }
        String scheme = securityScheme.getScheme();
        String bearerFormat = securityScheme.getBearerFormat();
        String openIdConnectUrl = securityScheme.getOpenIdConnectUrl();
        Map<String, Object> vendorExtensions = null;
        if (securityScheme.getExtensions() != null) {
            vendorExtensions = securityScheme.getExtensions();
        }
        final CodegenSecurityScheme cs = new CodegenSecurityScheme(
                type,
                description,
                name,
                in,
                scheme,
                bearerFormat,
                flows,
                openIdConnectUrl,
                imports,
                componentModule,
                jsonPathPiece,
                refInfo,
                vendorExtensions
        );
        codegenSecuritySchemeCache.put(jsonPath, cs);
        return cs;
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
        tmpPath = tmpPath.replaceAll("}", "");
        String[] parts = (tmpPath + "/" + httpMethod).split("/");
        StringBuilder builder = new StringBuilder();
        if ("/".equals(tmpPath)) {
            // must be root tmpPath
            builder.append("root");
        }
        for (String part : parts) {
            if (!part.isEmpty()) {
                if (builder.toString().isEmpty()) {
                    part = Character.toLowerCase(part.charAt(0)) + part.substring(1);
                } else {
                    part = org.openapijsonschematools.codegen.common.StringUtils.camelize(part);
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

    protected void addImports(Set<String> importsToBeAddedTo, Set<String> importsToAdd) {
        importsToAdd.forEach(i -> addImport(importsToBeAddedTo, i));
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
    protected LinkedHashMapWithContext<CodegenSchema> getProperties(Map<String, Schema> properties, String sourceJsonPath, String currentJsonPath, HashMap<String, CodegenKey> requiredAndOptionalProperties) {
        if (properties == null || properties.isEmpty()) {
            return null;
        }

        LinkedHashMapWithContext<CodegenSchema> propertiesMap = new LinkedHashMapWithContext<>();

        boolean allAreInline = true;
        for (Map.Entry<String, Schema> entry : properties.entrySet()) {
            final String propertyName = entry.getKey();
            final Schema prop = entry.getValue();
            if (prop == null) {
                LOGGER.warn("Please report the issue. There shouldn't be null property for {}", propertyName);
            } else {
                final CodegenSchema cp;

                String propertyJsonPath = currentJsonPath + "/properties/" + ModelUtils.encodeSlashes(propertyName);
                cp = fromSchema(prop, sourceJsonPath, propertyJsonPath);
                if (cp.hasAnyRefs()) {
                    allAreInline = false;
                }
                requiredAndOptionalProperties.put(propertyName, cp.jsonPathPiece);

                propertiesMap.put(cp.jsonPathPiece, cp);
            }
        }
        propertiesMap.setAllAreInline(allAreInline);
        CodegenKey jsonPathPiece = getKey("properties", "schemaProperty", sourceJsonPath);
        propertiesMap.setJsonPathPiece(jsonPathPiece);
        return propertiesMap;
    }

    /**
     * Add variables (properties) to codegen model (list of properties, various flags, etc)
     *
     * @param dependentSchemas a map of properties (schema)
     * @param sourceJsonPath the source json path
     * @param currentJsonPath the current json path
     * @return the properties
     */
    protected LinkedHashMapWithContext<CodegenSchema> getDependentSchemas(Map<String, Schema> dependentSchemas, String sourceJsonPath, String currentJsonPath) {
        if (dependentSchemas == null || dependentSchemas.isEmpty()) {
            return null;
        }

        LinkedHashMapWithContext<CodegenSchema> dependentSchemasMap = new LinkedHashMapWithContext<>();

        boolean allAreInline = true;
        for (Map.Entry<String, Schema> entry : dependentSchemas.entrySet()) {
            final String propertyName = entry.getKey();
            final Schema prop = entry.getValue();
            if (prop == null) {
                LOGGER.warn("Please report the issue. There shouldn't be null property for {}", propertyName);
            } else {
                final CodegenSchema cp;

                String propertyJsonPath = currentJsonPath + "/dependentSchemas/" + ModelUtils.encodeSlashes(propertyName);
                cp = fromSchema(prop, sourceJsonPath, propertyJsonPath);
                if (cp.hasAnyRefs()) {
                    allAreInline = false;
                }

                dependentSchemasMap.put(cp.jsonPathPiece, cp);
            }
        }
        dependentSchemasMap.setAllAreInline(allAreInline);
        CodegenKey jsonPathPiece = getKey("dependentSchemas", "schemaProperty", sourceJsonPath);
        dependentSchemasMap.setJsonPathPiece(jsonPathPiece);
        return dependentSchemasMap;
    }

    /**
     * Add variables (properties) to codegen model (list of properties, various flags, etc)
     *
     * @param properties a map of properties (schema)
     * @param required  a set of required properties' name
     * @return the optional properties
     */
    protected LinkedHashMapWithContext<CodegenSchema> getOptionalProperties(LinkedHashMapWithContext<CodegenSchema> properties, Set<String> required, String sourceJsonPath, String currentName) {
        if (properties == null) {
            return null;
        }
        if (required.isEmpty()) {
            // all properties optional and there is no required
            LinkedHashMapWithContext<CodegenSchema> optionalProperties = new LinkedHashMapWithContext<>();
            optionalProperties.putAll(properties);
            optionalProperties.setAllAreInline(properties.allAreInline());
            CodegenKey jsonPathPiece;
            jsonPathPiece = getKey(currentName + objectIOClassNamePiece + arrayObjectInputClassNameSuffix, "schemaProperty", sourceJsonPath);
            optionalProperties.setJsonPathPiece(jsonPathPiece);
            return optionalProperties;
        }

        // required exists and it can come from addProps or props
        LinkedHashMapWithContext<CodegenSchema> optionalProperties = new LinkedHashMapWithContext<>();
        boolean allAreInline = true;
        for (Map.Entry<CodegenKey, CodegenSchema> entry : properties.entrySet()) {
            final CodegenKey key = entry.getKey();
            if (required.contains(key.original)) {
                continue;
            }
            final CodegenSchema prop = entry.getValue();
            if (prop.refInfo != null) {
                allAreInline = false;
            }
            optionalProperties.put(key, prop);
        }
        if (optionalProperties.isEmpty()) {
            // no optional props, all required properties came from props
            return null;
        }
        optionalProperties.setAllAreInline(allAreInline);
        CodegenKey jsonPathPiece = getKey(currentName + "Optional" + objectIOClassNamePiece + arrayObjectInputClassNameSuffix, "schemaProperty", sourceJsonPath);
        optionalProperties.setJsonPathPiece(jsonPathPiece);
        return optionalProperties;
    }

    /**
     * Remove characters not suitable for variable or method name from the input and camel case it
     *
     * @param name string to be camel case
     * @return camel case string
     */
    @SuppressWarnings("static-method")
    public String removeNonNameElementToCamelCase(String name) {
        return removeNonNameElementToCamelCase(name, "[-_:;#" + removeOperationIdPrefixDelimiter + "]");
    }

    /**
     * Remove characters that is not good to be included in method name from the input and camel case it
     *
     * @param name                  string to be camel case
     * @param nonNameElementPattern a regex pattern of the characters that is not good to be included in name
     * @return camel case string
     */
    protected String removeNonNameElementToCamelCase(final String name, final String nonNameElementPattern) {
        String result = Arrays.stream(name.split(nonNameElementPattern))
                .map(StringUtils::capitalize)
                .collect(Collectors.joining(""));
        if (!result.isEmpty()) {
            result = result.substring(0, 1).toLowerCase(Locale.ROOT) + result.substring(1);
        }
        return result;
    }

    @Override
    public String modelPackagePathFragment() {
        return modelPackage.replace('.', File.separatorChar);
    }

    @Override
    public String getSchemaFilename(String jsonPath) {
        String[] pieces = jsonPath.split("/");
        return pieces[pieces.length-1];
    }

    protected void updateComponentsFilepath(String[] pathPieces) {
        if (pathPieces.length < 3) {
            return;
        }
        String[] originalPieces = pathPieces.clone();
        originalPieces[0] = "#";
        String jsonPath = String.join("/", originalPieces);

        // rename schemas + requestBodies
        switch (pathPieces[2]) {
            case "schemas":
                // modelPackage replaces pathPieces[1] + pathPieces[2]
                String fragment = modelPackagePathFragment();
                String[] fragments = fragment.split("/");
                pathPieces[1] = fragments[0];
                pathPieces[2] = fragments[1];
                if (pathPieces.length == 4) {
                    // #/components/schemas/SomeSchema
                    pathPieces[3] = getSchemaFilename(jsonPath);
                }
                return;
            case "requestBodies":
                pathPieces[2] = requestBodiesIdentifier;
                break;
            case "securitySchemes":
                pathPieces[2] = securitySchemesIdentifier;
                break;
        }
        if (pathPieces.length < 4) {
            return;
        }
        if (pathPieces[2].equals("headers")) {
            // #/components/headers
            pathPieces[3] = toHeaderFilename(pathPieces[3], jsonPath);
            if (pathPieces.length == 5 && pathPieces[4].equals("schema")) {
                // #/components/headers/someHeader/schema
                pathPieces[4] = getSchemaFilename(jsonPath);
            } else if (pathPieces.length >= 6 && pathPieces[4].equals("content")) {
                // #/components/headers/someHeader/content/application-json -> length 6
                String contentType = ModelUtils.decodeSlashes(pathPieces[5]);
                pathPieces[5] = toContentTypeFilename(contentType);
                if (pathPieces.length == 7) {
                    pathPieces[6] = getSchemaFilename(jsonPath);
                }
            }
        } else if (pathPieces[2].equals("parameters")) {
            pathPieces[3] = toParameterFilename(pathPieces[3], jsonPath);
            if (pathPieces.length == 5 && pathPieces[4].equals("schema")) {
                pathPieces[4] = getSchemaFilename(jsonPath);
            } else if (pathPieces.length >= 6 && pathPieces[4].equals("content")) {
                // #/components/parameters/someParam/content/application-json -> length 6
                String contentType = ModelUtils.decodeSlashes(pathPieces[5]);
                pathPieces[5] = toContentTypeFilename(contentType);
                if (pathPieces.length == 7) {
                    pathPieces[6] = getSchemaFilename(jsonPath);
                }
            }
        } else if (pathPieces[2].equals(requestBodiesIdentifier)) {
            pathPieces[3] = toRequestBodyFilename(pathPieces[3], jsonPath);
            if (pathPieces.length >= 6 && pathPieces[4].equals("content")) {
                // #/components/requestBodies/someBody/content/application-json -> length 6
                String contentType = ModelUtils.decodeSlashes(pathPieces[5]);
                pathPieces[5] = toContentTypeFilename(contentType);
                if (pathPieces.length == 7) {
                    pathPieces[6] = getSchemaFilename(jsonPath);
                }
            }
        } else if (pathPieces[2].equals("responses")) {
            // #/components/responses/SuccessWithJsonApiResponse/headers
            pathPieces[3] = toResponseModuleName(pathPieces[3], jsonPath);
            if (pathPieces.length == 4) {
                // #/components/responses/SuccessWithJsonApiResponse
                return;
            }

            if (pathPieces.length == 5 && pathPieces[4].equals(headersSchemaFragment)) {
                // synthetic json path
                // #/components/responses/someResponse/Headers
                pathPieces[4] = getSchemaFilename(jsonPath);
                return;
            }

            if (pathPieces[4].equals("headers")) {
                if (pathPieces.length == 5) {
                    pathPieces[4] = toHeaderFilename(pathPieces[4], jsonPath);
                    // #/components/responses/someResponse/headers
                    return;
                }
                // #/components/responses/someResponse/headers/SomeHeader-> length 6
                pathPieces[5] = toHeaderFilename(pathPieces[5], jsonPath);
                if (pathPieces.length == 7 && pathPieces[6].equals("schema")) {
                    // #/components/responses/someResponse/headers/SomeHeader/schema
                    pathPieces[6] = getSchemaFilename(jsonPath);
                } else if (pathPieces.length >= 8 && pathPieces[6].equals("content")) {
                    // #/components/responses/someResponse/headers/SomeHeader/content/application-json -> length 8
                    String contentType = ModelUtils.decodeSlashes(pathPieces[7]);
                    pathPieces[7] = toContentTypeFilename(contentType);
                    if (pathPieces.length == 9) {
                        // #/components/responses/someResponse/headers/SomeHeader/content/application-json/schema
                        pathPieces[8] = getSchemaFilename(jsonPath);
                    }
                }
            } else if (pathPieces[4].equals("content")) {
                if (pathPieces.length == 5) {
                    // #/components/responses/someResponse/content -> length 5
                    return;
                }
                // #/components/responses/someResponse/content/application-json -> length 6
                String contentType = ModelUtils.decodeSlashes(pathPieces[5]);
                pathPieces[5] = toContentTypeFilename(contentType);
                if (pathPieces.length == 7) {
                    pathPieces[6] = getSchemaFilename(jsonPath);
                }
            }
        } else if (pathPieces[2].equals(securitySchemesIdentifier)) {
            pathPieces[3] = toSecuritySchemeFilename(pathPieces[3], null);
        }
    }

    private void updatePathsFilepath(String[] pathPieces) {
        String[] originalPieces = pathPieces.clone();
        originalPieces[0] = "#";
        String jsonPath = String.join("/", originalPieces);
        if (pathPieces.length < 3) {
            return;
        }
        // #/paths/somePath
        pathPieces[2] = toPathFilename(ModelUtils.decodeSlashes(pathPieces[2]), null);
        if (pathPieces.length < 4) {
            return;
        }
        Set<String> xParameters = new HashSet<>();
        xParameters.add("PathParameters");
        xParameters.add("QueryParameters");
        xParameters.add("HeaderParameters");
        xParameters.add("CookieParameters");
        if (pathPieces[3].equals("servers")) {
            if (pathPieces.length == 4) {
                // #/paths/somePath/servers
                pathPieces[3] = toServerFilename("s", jsonPath);
            } else if (pathPieces.length == 5) {
                // #/paths/somePath/servers/0
                pathPieces[4] = toServerFilename(pathPieces[4], jsonPath);
            } else {
                // #/paths/somePath/servers/0/variables
                pathPieces[4] = "server" + pathPieces[4];
                pathPieces[5] = "Variables";
            }
            return;
        } else if (pathPieces[3].equals("parameters")) {
            if (pathPieces.length == 4) {
                // #/paths/somePath/parameters
                return;
            }
            // #/paths/somePath/parameters/0
            pathPieces[4] = toParameterFilename(pathPieces[4], jsonPath);
            if (pathPieces.length >= 7 && pathPieces[5].equals("content")) {
                // #/paths/somePath/parameters/0/content/application-json -> length 7
                String contentType = ModelUtils.decodeSlashes(pathPieces[6]);
                pathPieces[6] = toContentTypeFilename(contentType);
                if (pathPieces.length == 8) {
                    pathPieces[7] = getSchemaFilename(jsonPath);
                    return;
                }
            } else if (pathPieces.length == 6 && pathPieces[5].equals("schema")) {
                // #/paths/somePath/parameters/0/schema -> length 7
                pathPieces[5] = getSchemaFilename(jsonPath);
                return;
            }
        } else if (pathPieces.length == 4) {
            // #/paths/SomePath/get
            return;
        }
        if (xParameters.contains(pathPieces[4])) {
            // #/paths/somePath/get/PathParameters
            // synthetic jsonPath
            pathPieces[4] = getSchemaFilename(jsonPath);
        } else if (pathPieces[4].equals("servers")) {
            if (pathPieces.length == 5) {
                // #/paths/somePath/get/servers
                pathPieces[4] = toServerFilename("servers", jsonPath);
            } else if (pathPieces.length == 6) {
                // #/paths/somePath/get/servers/0
                pathPieces[5] = toServerFilename(pathPieces[5], jsonPath);
            } else {
                // #/paths/somePath/get/servers/0/variables
                pathPieces[5] = "server" + pathPieces[5];
                pathPieces[6] = "Variables";
            }
        } else if (pathPieces[4].equals("security")) {
            // #/paths/somePath/get/security
            if (pathPieces.length == 5) {
                pathPieces[4] = toSecurityFilename("security", jsonPath);
            } else {
                // #/paths/somePath/get/security/0
                pathPieces[5] = toSecurityFilename(pathPieces[5], jsonPath);
            }
            return;
        } else if (pathPieces[4].equals("responses")) {
            if (pathPieces.length == 5) {
                // #/paths/user_login/get/responses -> length 5
                pathPieces[4] = toResponseModuleName(pathPieces[4], jsonPath);
                return;
            }
            // #/paths/user_login/get/responses/200 -> 200 -> response_200 -> length 6
            pathPieces[5] = toResponseModuleName(pathPieces[5], jsonPath);
            if (pathPieces.length == 6) {
                // #/paths/user_login/get/responses/200
                return;
            }

            if (pathPieces.length == 7 && pathPieces[6].equals(headersSchemaFragment)) {
                // synthetic json path
                // #/paths/user_login/get/responses/200/Headers
                pathPieces[6] = getSchemaFilename(jsonPath);
                return;
            }

            if (pathPieces[6].equals("content")) {
                if (pathPieces.length  == 7) {
                    // #/paths/somePath/get/responses/200/content
                    return;
                }
                // #/paths/somePath/get/responses/200/content/application-json -> length 8
                String contentType = ModelUtils.decodeSlashes(pathPieces[7]);
                pathPieces[7] = toContentTypeFilename(contentType);
                if (pathPieces.length == 9) {
                    pathPieces[8] = getSchemaFilename(jsonPath);
                }
            } else if (pathPieces[6].equals("headers")) {
                if (pathPieces.length == 7) {
                    // #/paths/somePath/get/responses/200/headers
                    pathPieces[6] = toHeaderFilename(pathPieces[6], jsonPath);
                    return;
                }
                // #/paths/somePath/get/responses/200/headers/someHeader -> length 8
                pathPieces[7] = toHeaderFilename(pathPieces[7], jsonPath);

                if (pathPieces.length >= 10 && pathPieces[8].equals("content")) {
                    // #/paths/somePath/get/responses/200/headers/someHeader/content/application-json -> length 10
                    String contentType = ModelUtils.decodeSlashes(pathPieces[9]);
                    pathPieces[9] = toContentTypeFilename(contentType);
                    if (pathPieces.length == 11) {
                        pathPieces[10] = getSchemaFilename(jsonPath);
                    }
                } else if (pathPieces.length == 9 && pathPieces[8].equals("schema")) {
                    pathPieces[8] = getSchemaFilename(jsonPath);
                }
            }
        } else if (pathPieces[4].equals("parameters")) {
            if (pathPieces.length == 5) {
                // #/paths/somePath/get/parameters -> length 5
                pathPieces[4] = toParameterFilename(pathPieces[4], jsonPath);
                return;
            }
            // #/paths/somePath/get/parameters/0 -> length 6
            pathPieces[5] = toParameterFilename(pathPieces[5], jsonPath);

            if (pathPieces.length >= 8 && pathPieces[6].equals("content")) {
                // #/paths/somePath/get/parameters/1/content/application-json -> length 8
                String contentType = ModelUtils.decodeSlashes(pathPieces[7]);
                pathPieces[7] = toContentTypeFilename(contentType);
                if (pathPieces.length == 9) {
                    pathPieces[8] = getSchemaFilename(jsonPath);
                }
            } else if (pathPieces.length == 7 && pathPieces[6].equals("schema")) {
                // #/paths/somePath/get/parameters/0/schema -> length 7
                pathPieces[6] = getSchemaFilename(jsonPath);
            }
        } else if (pathPieces[4].equals("requestBody")) {
            if (pathPieces.length == 5) {
                // #/paths/somePath/get/requestBody
                pathPieces[4] = toRequestBodyFilename("requestBody", jsonPath);
                return;
            }
            pathPieces[4] = requestBodyIdentifier;
            if (pathPieces.length >= 7 && pathPieces[5].equals("content")) {
                // #/paths/somePath/get/requestBody/content/application-json -> length 7
                String contentType = ModelUtils.decodeSlashes(pathPieces[6]);
                pathPieces[6] = toContentTypeFilename(contentType);
                if (pathPieces.length == 8) {
                    // #/paths/somePath/get/requestBody/content/application-json/schema
                    pathPieces[7] = getSchemaFilename(jsonPath);
                }
            }
        }
    }

    protected void updateServersFilepath(String[] pathPieces) {
        String jsonPath = String.join("/", pathPieces);
        if (pathPieces.length == 2) {
            // #/servers
        } else if (pathPieces.length == 3) {
            // #/servers/0
            pathPieces[2] = toServerFilename(pathPieces[2], jsonPath);
        } else {
            // #/servers/0/variables
            pathPieces[2] = toServerFilename(pathPieces[2], jsonPath).toLowerCase(Locale.ROOT);
            pathPieces[3] = "Variables";
        }
    }

    private void updateSecurityFilepath(String[] pathPieces) {
        String jsonPath = String.join("/", pathPieces);
        if (pathPieces.length < 3) {
            // #/security
            pathPieces[1] = toSecurityFilename("security", jsonPath);
            return;
        }
        // #/security/0
        pathPieces[2] = toSecurityFilename(pathPieces[2], jsonPath);
    }

    private void updateApisFilepath(String[] pathPieces) {
        // #/apis
        // #/apis/tags
        // #/apis/tags/someTag
        // #/apis/paths
        // #/apis/paths/somePath
        pathPieces[1] = apiPackage.replace('.', File.separatorChar);
        if (pathPieces.length < 4) {
            return;
        }
        if (pathPieces[2].equals("tags")) {
            pathPieces[3] = toApiFilename(pathPieces[3]);
        } else if (pathPieces[2].equals("paths")) {
            pathPieces[3] = toPathFilename(ModelUtils.decodeSlashes(pathPieces[3]), null);
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
        } else if (jsonPath.startsWith("#/servers")) {
            updateServersFilepath(pathPieces);
        } else if (jsonPath.startsWith("#/security")) {
            updateSecurityFilepath(pathPieces);
        } else if (jsonPath.startsWith("#/apis")) {
            // this is a fake json path that the code generates and uses to generate apis
            updateApisFilepath(pathPieces);
        }
        List<String> finalPathPieces = Arrays.stream(pathPieces)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        return String.join(File.separator, finalPathPieces);
    }

    @Override
    public String getSubpackage(String jsonPath) {
        String[] pathPieces = jsonPath.split("/");
        pathPieces[0] = "";
        if (jsonPath.startsWith("#/components")) {
            updateComponentsFilepath(pathPieces);
        } else if (jsonPath.startsWith("#/paths")) {
            updatePathsFilepath(pathPieces);
        } else if (jsonPath.startsWith("#/servers")) {
            updateServersFilepath(pathPieces);
        } else if (jsonPath.startsWith("#/security")) {
            updateSecurityFilepath(pathPieces);
        } else if (jsonPath.startsWith("#/apis")) {
            // this is a fake json path that the code generates and uses to generate apis
            updateApisFilepath(pathPieces);
        }
        List<String> finalPathPieces = Arrays.stream(pathPieces)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        String subpackage = String.join(".", finalPathPieces);
        int lastPeriodIndex = subpackage.lastIndexOf(".");
        if (lastPeriodIndex < 1) {
            return null;
        }
        return subpackage.substring(1,lastPeriodIndex);
    }
    @Override
    public String getTestFilepath(String jsonPath) {
        String[] pathPieces = jsonPath.split("/");
        pathPieces[0] = outputFolder + File.separatorChar + "test";
        if (jsonPath.startsWith("#/components")) {
            // #/components/schemas/someSchema
            updateComponentsFilepath(pathPieces);
            if (pathPieces.length == 4) {
                int lastIndex = pathPieces.length - 1;
                pathPieces[lastIndex] = "test_" + pathPieces[lastIndex];
            }
        } else if (jsonPath.startsWith("#/paths")) {
            updatePathsFilepath(pathPieces);
            // #/paths/somePath/get
            if (pathPieces.length == 4) {
                int lastIndex = pathPieces.length - 1;
                pathPieces[lastIndex] = "test_" + pathPieces[lastIndex];
            }
        }
        List<String> finalPathPieces = Arrays.stream(pathPieces)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        return String.join(File.separator, finalPathPieces);
    }


    @Override
    public String getDocsFilepath(String jsonPath) {
        String[] pathPieces = jsonPath.split("/");
        pathPieces[0] = outputFolder + File.separatorChar + docsFolder;
        if (jsonPath.startsWith("#/components")) {
            updateComponentsFilepath(pathPieces);
        } else if (jsonPath.startsWith("#/paths")) {
            updatePathsFilepath(pathPieces);
        } else if (jsonPath.startsWith("#/servers")) {
            updateServersFilepath(pathPieces);
        } else if (jsonPath.startsWith("#/apis")) {
            // this is a fake json path that the code generates and uses to generate apis
            updateApisFilepath(pathPieces);
        }
        List<String> finalPathPieces = Arrays.stream(pathPieces)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        return String.join(File.separator, finalPathPieces);
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
    public void setRemoveOperationIdPrefix(boolean removeOperationIdPrefix) {
        this.removeOperationIdPrefix = removeOperationIdPrefix;
    }

    public void setRemoveOperationIdPrefixDelimiter(String removeOperationIdPrefixDelimiter) {
        this.removeOperationIdPrefixDelimiter = removeOperationIdPrefixDelimiter;
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
     * Set Documentation files extension
     *
     * @param userDocExtension documentation files extension
     */
    @Override
    public void setDocExtension(String userDocExtension) {
        this.docExtension = userDocExtension;
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
    public void setTemplateEngineName(String templateEngineName) {
        this.templateEngineName = templateEngineName;
    }

    @Override
    public TemplatingEngineAdapter getTemplatingEngine() {
        String loadedTemplateEngineName = templateEngineName;
        if (loadedTemplateEngineName ==  null) {
            loadedTemplateEngineName = defaultTemplatingEngine();
        }
        return TemplatingEngineLoader.byIdentifier(loadedTemplateEngineName);
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
     * @param exceptionList   a list of matches which should not be sanitized (i.e. exception)
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
        if (exceptionList.isEmpty() || !exceptionList.contains(replaceMatch)) {
            return value.replaceAll(replaceMatch, replaceValue);
        }
        return value;
    }

    protected EnumInfo getEnumInfo(ArrayList<Object> values, Schema<?> schema, String currentJsonPath, String sourceJsonPath, LinkedHashSet<String> types, String classSuffix) {
        LinkedHashMap<EnumValue, String> enumValueToName = new LinkedHashMap<>();
        LinkedHashMap<String, LinkedHashMap<EnumValue, String>> typeToValues = new LinkedHashMap<>();
        LinkedHashMap<String, EnumValue> enumNameToValue = new LinkedHashMap<>();
        int truncateIdx = 0;

        if (isRemoveEnumValuePrefix()) {
            String commonPrefix = findCommonPrefixOfVars(values);
            truncateIdx = commonPrefix.length();
        }

        List<String> xEnumVariableNames = null;
        List<String> xEnumDescriptions = null;
        // noinspection SpellCheckingInspection
        String xEnumVariablenamesKey = "x-enum-varnames";
        String xEnumDescriptionsKey = "x-enum-descriptions";
        if (schema.getExtensions() != null) {
            if (schema.getExtensions().containsKey(xEnumVariablenamesKey)) {
                xEnumVariableNames = new ArrayList<>();
                Object result = schema.getExtensions().get(xEnumVariablenamesKey);
                if (result instanceof List) {
                    for (Object item: (List) result) {
                        if (item instanceof String) {
                            xEnumVariableNames.add((String) item);
                        }
                    }
                }
            }
            if (schema.getExtensions().containsKey(xEnumDescriptionsKey)) {
                xEnumDescriptions = new ArrayList<>();
                Object result = schema.getExtensions().get(xEnumDescriptionsKey);
                if (result instanceof List) {
                    for (Object item: (List) result) {
                        if (item instanceof String) {
                            xEnumDescriptions.add((String) item);
                        }
                    }
                }
            }
        }

        int i = 0;
        for (Object value : values) {
            String description = null;
            if (xEnumDescriptions != null && xEnumDescriptions.size() > i) {
                description = xEnumDescriptions.get(i);
            }

            String enumName;
            if (xEnumVariableNames != null && xEnumVariableNames.size() > i) {
                enumName = xEnumVariableNames.get(i);
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
            EnumValue enumValue = getEnumValue(value, description);
            boolean typeIsInteger = enumValue.type.equals("integer");
            boolean intIsNumberUseCase = (typeIsInteger && types!=null && types.contains("number"));
            if (types!=null && !types.contains(enumValue.type) && !intIsNumberUseCase) {
                throw new RuntimeException("Enum value's type is not allowed by schema types for value="+enumValue.value+" types="+types + " jsonPath="+currentJsonPath);
            }
            enumValueToName.put(enumValue, usedName);
            if (!typeToValues.containsKey(enumValue.type)) {
                typeToValues.put(enumValue.type, new LinkedHashMap<>());
            }
            if (typeIsInteger && !typeToValues.containsKey("number")) {
                typeToValues.put("number", new LinkedHashMap<>());
            }
            typeToValues.get(enumValue.type).put(enumValue, usedName);
            if (typeIsInteger) {
                typeToValues.get("number").put(enumValue, usedName);
            }

            if (!enumNameToValue.containsKey(usedName)) {
                enumNameToValue.put(usedName, enumValue);
            } else {
                LOGGER.error(
                        "Enum error: two generated enum variable names collide. The values {} and {} generate variable name {} . Please file an issue at https://github.com/openapi-json-schema-tools/openapi-json-schema-generator/issues",
                        enumNameToValue.get(usedName).value,
                        enumValue.value,
                        usedName);
            }
            i += 1;
        }
        CodegenKey jsonPathPiece = null;
        if (currentJsonPath != null) {
            String currentName = currentJsonPath.substring(currentJsonPath.lastIndexOf("/") + 1);
            jsonPathPiece = getKey(currentName + classSuffix, "schemaProperty", sourceJsonPath);
        }

        return new EnumInfo(enumValueToName, typeToValues, jsonPathPiece);
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

//    private List<Map<String, Object>> getScopes(Scopes scopes) {
//        if (scopes != null && !scopes.isEmpty()) {
//            List<Map<String, Object>> newScopes = new ArrayList<>();
//            for (Map.Entry<String, String> scopeEntry : scopes.entrySet()) {
//                Map<String, Object> scope = new HashMap<>();
//                scope.put("scope", scopeEntry.getKey());
//                scope.put("description", escapeText(scopeEntry.getValue()));
//                newScopes.add(scope);
//            }
//            return newScopes;
//        }
//        return null;
//    }

    public static Set<String> getConsumesInfo(OpenAPI openAPI, Operation operation) {
        RequestBody requestBody = ModelUtils.getReferencedRequestBody(openAPI, operation.getRequestBody());

        if (requestBody == null || requestBody.getContent() == null || requestBody.getContent().isEmpty()) {
            return Collections.emptySet(); // return empty set
        }
        return requestBody.getContent().keySet();
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
        if (contentKeys.isEmpty()) {
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
    public GeneratorType getTag() {
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
                            enc.getExplode(),
                            enc.getAllowReserved()
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
                    String refKey = "$ref";
                    Object refToTestCases = ((LinkedHashMap<?, ?>) objNodeWithRef).getOrDefault(refKey, null);
                    if (refToTestCases instanceof String) {
                        schemaTestCases = extractSchemaTestCases((String) refToTestCases);
                    }
                }
            }

            CodegenMediaType codegenMt = new CodegenMediaType(schemaProp, ceMap, schemaTestCases);
            CodegenKey ck = getKey(contentType, "misc");
            cmtContent.put(ck, codegenMt);
        }
        return cmtContent;
    }

    public String toRequestBodyFilename(String componentName, String jsonPath) {
        return toModuleFilename(componentName, jsonPath);
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
        if (!expectedComponentType.equals("schemas")) {
            if (!ref.startsWith("#/components/")) {
                throw new RuntimeException("The ref must be to a component");
            }
            if (refPieces.length != 4) {
                throw new RuntimeException("The ref must be to a named key in one of the components");
            }
            if (!refPieces[2].equals(expectedComponentType)) {
                throw new RuntimeException("Incorrect component type in ref, expected "+expectedComponentType+" and saw "+refPieces[2]);
            }
        }
        switch (expectedComponentType) {
            case "requestBodies":
                return toRequestBodyFilename(refPieces[3], ref);
            case "responses":
                return toResponseModuleName(refPieces[3], ref);
            case "headers":
                return toHeaderFilename(refPieces[3], ref);
            case "parameters":
                return toParameterFilename(refPieces[3], ref);
            case "schemas":
                if (ref.equals(sourceJsonPath)) {
                    // property is of type self
                    return null;
                }
                // Two use cases
                // 1. #/components/schemas/SomeSchema (component schemas)
                // 2. #/paths/~1pet~1{petId}/get/parameters/0/schema (other schemas: parameters, response headers etc)
                return getSchemaFilename(ref);
            case "securitySchemes":
                return toSecuritySchemeFilename(refPieces[3], ref);
        }
        return null;
    }

    protected CodegenKey getJsonPathPiece(String expectedComponentType, String currentJsonPath, String sourceJsonPathPiece) {
        // last fragment info
        // requestBody -> requestBody
        // headers -> headerName
        // parameters/i -> i
        // components/parameters/someParam -> someParam
        // components/securitySchemes/blah -> Blah
        // schema names
        String usedName = currentJsonPath.substring(currentJsonPath.lastIndexOf("/") + 1);
        usedName = ModelUtils.decodeSlashes(usedName);
        return getKey(usedName, expectedComponentType, sourceJsonPathPiece);
    }

    protected CodegenKey getContainerJsonPathPiece(String expectedComponentType, String currentJsonPath, String sourceJsonPath) {
        return null;
    }

    private void setSchemaLocationInfo(String ref, String sourceJsonPath, String currentJsonPath, CodegenSchema instance) {
        String expectedComponentType = "schemas";
        if (ref != null) {
            String refModule = toRefModule(ref, sourceJsonPath, expectedComponentType);
            String refClass = toRefClass(ref, sourceJsonPath, expectedComponentType);
            PairCacheKey ck = new PairCacheKey(ref, ref);
            CodegenSchema cs = codegenSchemaCache.computeIfAbsent(ck, s -> new CodegenSchema());
            String refModuleLocation = getRefModuleLocation(ref);
            String refModuleAlias = getRefModuleAlias(sourceJsonPath, refModule, ref);
            instance.refInfo = new CodegenRefInfo<>(cs, refClass, refModule, refModuleLocation, refModuleAlias);
        }
        if (currentJsonPath == null) {
            return;
        }
        if (currentJsonPath.equals(sourceJsonPath)) {
            instance.containerJsonPathPiece = getContainerJsonPathPiece(expectedComponentType, currentJsonPath, sourceJsonPath);
        }
        instance.jsonPathPiece = getJsonPathPiece(expectedComponentType, currentJsonPath, sourceJsonPath);
        String[] pathPieces = currentJsonPath.split("/");
        // #/components/schemas/A
        if (pathPieces.length == 4 && currentJsonPath.startsWith("#/components/"+expectedComponentType+"/")) {
            instance.componentModule = true;
        }
        if (sourceJsonPath != null && sourceJsonPath.equals(currentJsonPath)) {
            instance.subpackage = getSubpackage(sourceJsonPath);
        }
        instance.moduleLocation = getModuleLocation(sourceJsonPath);
        instance.pathFromDocRoot = schemaPathFromDocRoot(instance.moduleLocation);
    }

    protected String getModuleLocation(String ref) {
        String filePath = getFilepath(ref);
        String prefix = outputFolder + File.separatorChar + "src" + File.separatorChar;
        String localFilepath = filePath.substring(prefix.length());
        return localFilepath.replaceAll(String.valueOf(File.separatorChar), ".");
    }

    @Override
    public String getRefModuleLocation(String ref) {
        String filePath = getFilepath(ref);
        String prefix = outputFolder + File.separatorChar + "src" + File.separatorChar;
        int endIndex = filePath.lastIndexOf(File.separatorChar);
        String localFilepath = filePath.substring(prefix.length(), endIndex);
        return localFilepath.replaceAll(String.valueOf(File.separatorChar), ".");
    }

    private String getRefModuleAlias(String sourceJsonPath, String refModule, String ref) {
        /*
        If multiple schemas are imported into the same module but they both have the same
        source module name, they need to be aliased to different names

        sourceJsonPath is 1:1 on a module file
        in that module file there can be multiple schemas that collide, but they need different aliases
        HashMap[String, HashMap[String, Int]] jsonPathToRefModuleToQty
        HashMap[String, HashMap[String, HashMap[String, String]]] jsonPathToRefModuleToRefToAlias
        if refModule not in refModuleToQty
        - put it in with qty 1
        - store it in refToAlias unmodified
        - return null
        if refModule is in refModuleToQty:
        - if it is in refToAlias return the alias if the alias is different than the ref
        - if it is not
            - increment the key qty
            - generate new alias and store it in refToAlias
            - return the alias
         */
        if (refModule == null) {
            // self referencing schemas
            return null;
        }
        if (!jsonPathToRefModuleToQty.containsKey(sourceJsonPath)) {
            jsonPathToRefModuleToQty.put(sourceJsonPath, new HashMap<>());
        }
        if (!jsonPathToRefModuleToRefToAlias.containsKey(sourceJsonPath)) {
            jsonPathToRefModuleToRefToAlias.put(sourceJsonPath, new HashMap<>());
        }
        HashMap<String, Integer> refModuleToQty = jsonPathToRefModuleToQty.get(sourceJsonPath);
        HashMap<String, HashMap<String, String>> refModuleToRefToAlias = jsonPathToRefModuleToRefToAlias.get(sourceJsonPath);
        if (!refModuleToRefToAlias.containsKey(refModule)) {
            refModuleToRefToAlias.put(refModule, new HashMap<>());
        }
        HashMap<String, String> refToAlias = refModuleToRefToAlias.get(refModule);
        if (!refModuleToQty.containsKey(refModule)) {
            refModuleToQty.put(refModule, 1);
            refToAlias.put(ref, refModule);
            return null;
        }
        if (refToAlias.containsKey(ref)) {
            String alias = refToAlias.get(ref);
            if (refModule.equals(alias)) {
                return null;
            }
            return alias;
        }
        Integer refQty = refModuleToQty.get(refModule) + 1;
        refModuleToQty.put(refModule, refQty);
        String alias = refModule + "_" + refQty;
        refToAlias.put(ref, alias);
        return alias;
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
        CodegenRefInfo<CodegenRequestBody> refInfo = null;
        TreeSet<String> imports = null;
        if (ref != null) {
            String refModule = toRefModule(ref, sourceJsonPath, expectedComponentType);
            String refClass = toRefClass(ref, sourceJsonPath, expectedComponentType);
            CodegenRequestBody rb = fromRequestBody(ModelUtils.getReferencedRequestBody(openAPI, requestBody), ref);
            refInfo = new CodegenRefInfo<>(rb, refClass, refModule, getRefModuleLocation(ref), null);
            imports = new TreeSet<>();
            imports.add(getImport(refInfo));
        }
        CodegenKey jsonPathPiece = getJsonPathPiece(expectedComponentType, sourceJsonPath, sourceJsonPath);
        String[] pathPieces = sourceJsonPath.split("/");
        // #/components/requestBodies/A
        boolean componentModule = pathPieces.length == 4 && sourceJsonPath.startsWith("#/components/" + expectedComponentType + "/");

        CodegenText description = getCodegenText(requestBody.getDescription());
        Map<String, Object> vendorExtensions = null;
        if (requestBody.getExtensions() != null && !requestBody.getExtensions().isEmpty()) {
            vendorExtensions = requestBody.getExtensions();
        }
        Boolean required = requestBody.getRequired();
        LinkedHashMap<CodegenKey, CodegenMediaType> content = null;
        if (requestBody.getContent() != null) {
            content = getContent(requestBody.getContent(), sourceJsonPath + "/content");
        }
        // set the parameter's example value
        // should be overridden by lang codegen
        TreeSet<String> finalImports = imports;
        Map<String, Object> finalVendorExtensions = vendorExtensions;
        LinkedHashMap<CodegenKey, CodegenMediaType> finalContent = content;

        String subpackage = getSubpackage(sourceJsonPath);
        codegenRequestBody = new CodegenRequestBody(description, finalVendorExtensions, required, finalContent, finalImports, componentModule, jsonPathPiece, refInfo, subpackage);
        codegenRequestBodyCache.put(sourceJsonPath, codegenRequestBody);
        return codegenRequestBody;
    }

    @Override
    public CodegenKey getKey(String key, String keyType) {
        return getKey(key, keyType, null);
    }

    @Override
    public String getSchemaPascalCaseName(String name, @NotNull String sourceJsonPath) {
        String usedKey = escapeUnsafeCharacters(name);
        HashMap<String, Integer> keyToQty = sourceJsonPathToKeyToQty.getOrDefault(sourceJsonPath, new HashMap<>());
        if (!sourceJsonPathToKeyToQty.containsKey(sourceJsonPath)) {
            sourceJsonPathToKeyToQty.put(sourceJsonPath, keyToQty);
        }
        // starts with number
        if (usedKey.matches("^\\d.*")) {
            LOGGER.warn("{} (component name starts with number) cannot be used as name. Renamed to Schema{}", usedKey, usedKey);
            usedKey = "Schema" + usedKey; // 200 -> Schema200
        }

        usedKey = camelize(usedKey);

        // handle case where usedKey is empty
        if (usedKey.isEmpty()) {
            // happens with a name like "/"
            usedKey = camelize(toEnumVarName(name, null).toLowerCase(Locale.ROOT));
        }

        if (isReservedWord(usedKey)) {
            usedKey = usedKey + "Schema"; // e.g. return => ReturnSchema
            LOGGER.warn("{} (reserved word) cannot be used as name. Renamed to {}", name, usedKey);
        }

        Integer qty = keyToQty.getOrDefault(usedKey, 0);
        qty += 1;
        keyToQty.put(usedKey, qty);
        String suffix = "";
        if (qty > 1) {
            suffix = qty.toString();
        }
        usedKey = usedKey + suffix;
        return usedKey;
    }

    protected String getCamelCaseName(String key) {
        String usedName = toEnumVarName(key, new StringSchema());
        usedName = camelize("set_"+ usedName.toLowerCase(Locale.ROOT), true);
        return usedName;
    }

    public CodegenKey getKey(String key, String keyType, String sourceJsonPath) {
        String snakeCaseName = null;
        String camelCaseName = null;
        String kebabCase = null;
        String usedKey = null;
        String pascalCaseName = null;
        boolean isValid = true;
        switch (keyType) {
            case "schemaProperty":
            case "schemas":
                usedKey = escapeUnsafeCharacters(key);
                isValid = isValid(usedKey);
                snakeCaseName = toModelFilename(usedKey, sourceJsonPath);
                pascalCaseName = getSchemaPascalCaseName(key, sourceJsonPath);
                if (!isValid) {
                    camelCaseName = getCamelCaseName(usedKey);
                }
                break;
            case "paths":
                usedKey = escapeUnsafeCharacters(key);
                isValid = isValid(usedKey);
                snakeCaseName = toPathFilename(usedKey, sourceJsonPath);
                pascalCaseName = camelize(toPathFilename(usedKey, null));
                break;
            case "misc":
            case "verb":
                usedKey = escapeUnsafeCharacters(key);
                isValid = isValid(usedKey);
                snakeCaseName = toModelFilename(usedKey, sourceJsonPath);
                pascalCaseName = toModelName(usedKey, sourceJsonPath);
                break;
            case "parameters":
                usedKey = escapeUnsafeCharacters(key);
                isValid = isValid(usedKey);
                snakeCaseName = toParameterFilename(usedKey, sourceJsonPath);
                pascalCaseName = getPascalCaseParameter(usedKey, sourceJsonPath);
                break;
            case "requestBodies":
                usedKey = escapeUnsafeCharacters(key);
                isValid = isValid(usedKey);
                snakeCaseName = toRequestBodyFilename(usedKey, sourceJsonPath);
                // todo add getPascalCaseRequestBody()
                pascalCaseName = toModelName(usedKey, sourceJsonPath);
                break;
            case "headers":
                usedKey = escapeUnsafeCharacters(key);
                isValid = isValid(usedKey);
                snakeCaseName = toHeaderFilename(usedKey, sourceJsonPath);
                pascalCaseName = toModelName(usedKey, sourceJsonPath);
                break;
            case "responses":
                usedKey = escapeUnsafeCharacters(key);
                isValid = isValid(usedKey);
                snakeCaseName = toResponseModuleName(usedKey, sourceJsonPath);
                pascalCaseName = getPascalCaseResponse(usedKey, sourceJsonPath);
                break;
            case "securitySchemes":
                usedKey = escapeUnsafeCharacters(key);
                isValid = isValid(usedKey);
                snakeCaseName = toSecuritySchemeFilename(usedKey, sourceJsonPath);
                pascalCaseName = toModelName(usedKey, sourceJsonPath);
                break;
            case "servers":
                usedKey = escapeUnsafeCharacters(key);
                isValid = isValid(usedKey);
                snakeCaseName = toServerFilename(usedKey, sourceJsonPath);
                pascalCaseName = getPascalCaseServer(usedKey, sourceJsonPath);
                camelCaseName = camelize(pascalCaseName, true);
                break;
            case "security":
                // #/security +
                // #/security/0
                usedKey = escapeUnsafeCharacters(key);
                isValid = isValid(usedKey);
                snakeCaseName = toSecuritySnakeCase(key, sourceJsonPath);
                pascalCaseName =  toSecurityPascalCase(key, sourceJsonPath);
                camelCaseName = camelize(pascalCaseName, true);
                break;
        }
        if (pascalCaseName != null) {
            kebabCase = pascalCaseName.toLowerCase(Locale.ROOT);
        }
        return new CodegenKey(
                usedKey,
                isValid,
                snakeCaseName,
                pascalCaseName,
                kebabCase,
                camelCaseName
        );
    }

    protected String toSecurityPascalCase(String basename, String jsonPath) {
        return toSecurityFilename(basename, jsonPath);
    }

    protected String toSecuritySnakeCase(String basename, String jsonPath) {
        return "security_"+basename;
    }

    protected LinkedHashMapWithContext<CodegenSchema> getRequiredProperties(LinkedHashSet<String> required, LinkedHashMap<CodegenKey, CodegenSchema> properties, CodegenSchema additionalProperties, HashMap<String, CodegenKey> requiredAndOptionalProperties, String sourceJsonPath, Map<String, Schema> schemaProperties, String currentName) {
        if (required.isEmpty()) {
            return null;
        }
        /*
        requiredProperties use cases:
        - no required properties: null or empty list
        - requiredProperties + optionalProperties (properties must exist)
        - requiredProperties + no optionalProperties
            - 1. requiredPropsWithDefAllFromProp - required all come from properties
            - 2. requiredPropsWithDefAllFromAddProp - required all come from addProp and there is no properties
            - 3. required consume all properties and remainder from addProps
        this should be called after vars and additionalProperties are set
        Features added by storing codegenProperty values:
        - refClass stores reference to additionalProperties definition
        - baseName stores original name (can be invalid in a programming language)
        - nameInSnakeCase can store valid name for a programming language
         */
        boolean requiredPropsWithDefAllFromProp = true;
        boolean requiredPropsWithDefAllFromAddProp = true;
        int propReqProps = 0;
        int addPropReqProps = 0;
        int reqPropsWithDef = 0;
        LinkedHashMapWithContext<CodegenSchema> requiredProperties = new LinkedHashMapWithContext<>();
        boolean allAreInline = true;
        boolean addPropsIsFalse = additionalProperties != null && additionalProperties.isBooleanSchemaFalse;
        for (String requiredPropertyName: required) {
            // required property is defined in properties, value is that CodegenSchema
            if (properties != null && requiredAndOptionalProperties.containsKey(requiredPropertyName)) {
                CodegenKey key = requiredAndOptionalProperties.get(requiredPropertyName);
                // get cp from property
                CodegenSchema prop = properties.get(key);
                if (prop != null) {
                    requiredPropsWithDefAllFromAddProp = false;
                    requiredProperties.put(key, prop);
                    reqPropsWithDef++;
                    propReqProps++;
                    if (prop.hasAnyRefs()) {
                        allAreInline = false;
                    }
                } else {
                    throw new RuntimeException("Property " + requiredPropertyName + " is missing from getVars");
                }
            } else if (addPropsIsFalse) {
                // required property is not defined in properties, and additionalProperties is false, value is null
                // no schema definition so this is an error use case
                throw new RuntimeException("Required property defined with name="+requiredPropertyName+" but property is missing from properties. Add it there.");
            } else {
                // required property is not defined in properties
                if (supportsAdditionalPropertiesWithComposedSchema) {
                    CodegenSchema prop;
                    requiredPropsWithDefAllFromProp = false;
                    reqPropsWithDef++;
                    addPropReqProps++;
                    if (additionalProperties == null) {
                        // additionalProperties is null
                        // there is NO schema definition for this so the json paths are null
                        prop = requiredAddPropUnsetSchema;
                    } else if (additionalProperties.isBooleanSchemaTrue) {
                        // additionalProperties is True
                        prop = additionalProperties;
                    } else {
                        // additionalProperties is schema
                        prop = additionalProperties;
                        if (prop.hasAnyRefs()) {
                            allAreInline = false;
                        }
                    }
                    CodegenKey key = getKey(requiredPropertyName, "schemas", sourceJsonPath);
                    requiredProperties.put(key, prop);
                    requiredAndOptionalProperties.put(requiredPropertyName, key);
                }
            }
        }
        String keyName;
        boolean onlyReqPropsCase1 = (requiredPropsWithDefAllFromProp && properties != null && requiredProperties.size() == properties.size());
        boolean onlyReqPropsCase2 = (requiredPropsWithDefAllFromAddProp && properties == null);
        boolean onlyReqPropsCase3 = (propReqProps != 0 && addPropReqProps != 0 && propReqProps + addPropReqProps == reqPropsWithDef && schemaProperties != null && required.containsAll(schemaProperties.keySet()));
        if (onlyReqPropsCase1 || onlyReqPropsCase2 || onlyReqPropsCase3) {
            keyName = currentName + objectIOClassNamePiece + arrayObjectInputClassNameSuffix;
        } else {
            keyName = currentName + "Required" + objectIOClassNamePiece + arrayObjectInputClassNameSuffix;
        }
        requiredProperties.setAllAreInline(allAreInline);
        CodegenKey jsonPathPiece = getKey(keyName, "schemaProperty", sourceJsonPath);
        requiredProperties.setJsonPathPiece(jsonPathPiece);
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

    /**
     * generates OpenAPI specification file in YAML format
     *
     * @param data map of object
     */
    public void generateYAMLSpecFile(Map<String, Object> data) {
        OpenAPI openAPI = (OpenAPI) data.get("openAPI");
        String yaml = SerializerUtils.toYamlString(openAPI);
        if (yaml != null) {
            data.put("openapi-yaml", yaml);
        }
    }

    private String removeTrailingSlash(String value) {
        return StringUtils.removeEnd(value, "/");
    }

    @Deprecated
    public TreeMap<CodegenKey, CodegenPathItem> fromPaths(Paths paths){
        return fromPaths(paths, null);
    }

    @Override
    public TreeMap<CodegenKey, CodegenPathItem> fromPaths(Paths paths, CodegenList<CodegenServer> rootServers){
        if (paths == null) {
            return null;
        }
        String jsonPath = "#/paths/";
        TreeMap<CodegenKey, CodegenPathItem> codegenPaths = new TreeMap<>();
        for (Map.Entry<String, PathItem> entry: paths.entrySet()) {
            String path = entry.getKey();
            PathItem pathItem = entry.getValue();
            String pathItemJsonPath = jsonPath + ModelUtils.encodeSlashes(path);
            CodegenPathItem codegenPathItem = fromPathItem(pathItem, pathItemJsonPath, rootServers);
            CodegenKey pathKey = getKey(path, "paths");
            codegenPaths.put(pathKey, codegenPathItem);
        }
        // sort them
        codegenPaths = new TreeMap<>(codegenPaths);
        return codegenPaths;
    }

    @Deprecated
    public CodegenPathItem fromPathItem(PathItem pathItem, String jsonPath) {
        return fromPathItem(pathItem, jsonPath, null);
    }

    @Override
    public CodegenPathItem fromPathItem(PathItem pathItem, String jsonPath, CodegenList<CodegenServer> rootServers) {
        CodegenText summary = getCodegenText(pathItem.getSummary());
        CodegenText description = getCodegenText(pathItem.getDescription());
        ArrayList<CodegenParameter> parameters = null;
        LinkedHashMap<Pair<String, String>, CodegenParameter> pairToParameter = new LinkedHashMap<>();
        if (pathItem.getParameters() != null && !pathItem.getParameters().isEmpty()) {
            int i = 0;
            parameters = new ArrayList<>();
            for (Parameter pathParam: pathItem.getParameters()) {
                CodegenParameter param = fromParameter(pathParam, jsonPath + "/parameters/" + i) ;
                parameters.add(param);
                i += 1;
                pairToParameter.put(Pair.of(param.in, param.name), param);
            }
        }
        TreeMap<CodegenKey, CodegenOperation> operations = new TreeMap<>();
        ArrayList<Pair<String, Operation>> httpMethodOperationPairs = new ArrayList<>();
        httpMethodOperationPairs.add(Pair.of("get", pathItem.getGet()));
        httpMethodOperationPairs.add(Pair.of("put", pathItem.getPut()));
        httpMethodOperationPairs.add(Pair.of("post", pathItem.getPost()));
        httpMethodOperationPairs.add(Pair.of("delete", pathItem.getDelete()));
        httpMethodOperationPairs.add(Pair.of("options", pathItem.getOptions()));
        httpMethodOperationPairs.add(Pair.of("head", pathItem.getHead()));
        httpMethodOperationPairs.add(Pair.of("patch", pathItem.getPatch()));
        httpMethodOperationPairs.add(Pair.of("trace", pathItem.getTrace()));
        List<Server> specServers = pathItem.getServers();
        CodegenList<CodegenServer> pathItemServers = fromServers(specServers, jsonPath + "/servers");
        CodegenList<CodegenServer> usedServers = (pathItemServers != null) ? pathItemServers : rootServers;
        for (Pair<String, Operation> pair: httpMethodOperationPairs) {
            Operation specOperation = pair.getRight();
            String httpMethod = pair.getLeft();
            if (specOperation != null) {
                operations.put(getKey(
                    httpMethod, "verb"),
                    fromOperation(specOperation, jsonPath + "/" + httpMethod, pairToParameter, usedServers)
                );
            }
        }
        if (!operations.isEmpty())
            // sort them
            operations = new TreeMap<>(operations);

        return new CodegenPathItem(
                summary,
                description,
                operations,
                pathItemServers,
                parameters
        );
    }

    @Override
    public CodegenList<CodegenServer> fromServers(List<Server> servers, String jsonPath) {
        if (servers == null) {
            return null;
        }
        List<CodegenServer> codegenServers = new ArrayList<>();
        boolean rootServer = jsonPath.equals("#/servers");
        for (int i = 0; i < servers.size(); i++) {
            Server server = servers.get(i);
            String serverJsonPath = jsonPath + "/" + i;
            CodegenKey jsonPathPiece = getKey(String.valueOf(i), "servers", serverJsonPath);
            CodegenText description = getCodegenText(server.getDescription());
            String subpackage = getSubpackage(serverJsonPath);
            CodegenServer cs = new CodegenServer(
                removeTrailingSlash(server.getUrl()),  // because trailing slash has no impact on server and path needs slash as first char
                description,
                fromServerVariables(server.getVariables(), serverJsonPath + "/variables"),
                jsonPathPiece,
                rootServer,
                subpackage
            );
            codegenServers.add(cs);
        }
        CodegenKey jsonPathPiece = getKey("servers", "servers", jsonPath);
        String serversSubpackage = getSubpackage(jsonPath);
        return new CodegenList<>(
                codegenServers,
                jsonPathPiece,
                serversSubpackage,
                null
        );
    }

    @Override
    public CodegenSchema fromServerVariables(Map<String, ServerVariable> serverVariables, String jsonPath) {
        if (serverVariables == null) {
            return null;
        }

        LinkedHashMap<String, Schema> properties = new LinkedHashMap<>();
        ArrayList<String> required = new ArrayList<>();
        for (Entry<String, ServerVariable> entry: serverVariables.entrySet()) {
            String variableName = entry.getKey();
            required.add(variableName);
            ServerVariable variable = entry.getValue();
            StringSchema schema = new StringSchema();
            if (variable.getDescription() != null) {
                schema.setDescription(variable.getDescription());
            }
            schema.setDefault(variable.getDefault());
            if (variable.getEnum() != null) {
                schema.setEnum(variable.getEnum());
            }
            properties.put(variableName, schema);
        }
        ObjectSchema variablesSchema = new ObjectSchema();
        variablesSchema.setProperties(properties);
        variablesSchema.setRequired(required);
        // only listed variables are allowed
        variablesSchema.setAdditionalProperties(Boolean.FALSE);
        return fromSchema(variablesSchema, jsonPath, jsonPath);
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

    protected void modifyFeatureSet(Consumer<FeatureSet.Builder> processor) {
        FeatureSet.Builder builder = getFeatureSet().modify();
        processor.accept(builder);
        this.generatorMetadata = GeneratorMetadata.newBuilder(generatorMetadata)
                .featureSet(builder.build()).build();
    }

    /**
     * A map entry for cached sanitized names.
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

        private final String name;
        private final String removeCharRegEx;
        private final List<String> exceptions;

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

    private ArrayListWithContext<CodegenSchema> getComposedProperties(List<Schema> xOfCollection, String collectionName, String sourceJsonPath, String currentJsonPath) {
        if (xOfCollection == null) {
            return null;
        }
        ArrayListWithContext<CodegenSchema> xOf = new ArrayListWithContext<>();
        int i = 0;
        boolean allAreInline = true;
        for (Schema xOfSchema : xOfCollection) {
            CodegenSchema cp = fromSchema(xOfSchema, sourceJsonPath, currentJsonPath + "/" + collectionName + "/" + i);
            if (cp.hasAnyRefs()) {
                allAreInline = false;
            }
            xOf.add(cp);
            i += 1;
        }
        xOf.setAllAreInline(allAreInline);
        CodegenKey jsonPathPiece = getKey(collectionName, "schemaProperty", sourceJsonPath);
        xOf.setJsonPathPiece(jsonPathPiece);
        return xOf;
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
            return (Schema) schema;
        } else if (schema == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid schema type; type must be Boolean or Schema");
    }

    /**
     * Replace - and " " with _
     *
     * @param charName the input
     * @return the variable name
     */
    protected String charNameToVarName(String charName) {
        // - and " " -> _
        String result = charName.replaceAll("[\\-\\s]", "_");
        // remove parentheses
        return result.replaceAll("[()]", "");
    }

    @Override
    public List<VendorExtension> getSupportedVendorExtensions() {
        List<VendorExtension> extensions = new ArrayList<>();
        extensions.add(VendorExtension.X_ENUM_VARNAMES);
        extensions.add(VendorExtension.X_ENUM_DESCRIPTIONS);
        return extensions;
    }
}
