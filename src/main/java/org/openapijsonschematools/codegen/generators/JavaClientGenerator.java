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

import io.swagger.v3.oas.models.media.Schema;
import org.openapijsonschematools.codegen.common.ModelUtils;
import org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet;
import org.openapijsonschematools.codegen.generators.generatormetadata.Stability;
import org.openapijsonschematools.codegen.generators.generatormetadata.features.SchemaFeature;
import org.openapijsonschematools.codegen.generators.models.CliOption;
import org.openapijsonschematools.codegen.common.CodegenConstants;
import org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorType;
import org.openapijsonschematools.codegen.generators.models.VendorExtension;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenHeader;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenKey;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenParameter;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenRefInfo;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenRequestBody;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenResponse;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenSchema;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenSecurityScheme;
import org.openapijsonschematools.codegen.generators.openapimodels.EnumInfo;
import org.openapijsonschematools.codegen.generators.openapimodels.EnumValue;
import org.openapijsonschematools.codegen.templating.HandlebarsEngineAdapter;
import org.openapijsonschematools.codegen.templating.SupportingFile;
import org.openapijsonschematools.codegen.generators.features.BeanValidationFeatures;
import org.openapijsonschematools.codegen.generators.features.GzipFeatures;
import org.openapijsonschematools.codegen.generators.features.PerformBeanValidationFeatures;
import org.openapijsonschematools.codegen.templating.TemplatingEngineAdapter;
import org.openapijsonschematools.codegen.generators.generatormetadata.features.DocumentationFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.constraints.NotNull;
import java.io.File;
import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.openapijsonschematools.codegen.common.StringUtils.camelize;

public class JavaClientGenerator extends AbstractJavaGenerator
        implements BeanValidationFeatures, PerformBeanValidationFeatures, GzipFeatures {

    static final String MEDIA_TYPE = "mediaType";

    private final Logger LOGGER = LoggerFactory.getLogger(JavaClientGenerator.class);

    public static final String USE_RX_JAVA2 = "useRxJava2";
    public static final String USE_RX_JAVA3 = "useRxJava3";
    public static final String DO_NOT_USE_RX = "doNotUseRx";
    public static final String USE_PLAY_WS = "usePlayWS";
    public static final String ASYNC_NATIVE = "asyncNative";
    public static final String CONFIG_KEY = "configKey";
    public static final String PARCELABLE_MODEL = "parcelableModel";
    public static final String USE_RUNTIME_EXCEPTION = "useRuntimeException";
    public static final String USE_REFLECTION_EQUALS_HASHCODE = "useReflectionEqualsHashCode";
    public static final String CASE_INSENSITIVE_RESPONSE_HEADERS = "caseInsensitiveResponseHeaders";
    public static final String MICROPROFILE_FRAMEWORK = "microprofileFramework";
    public static final String USE_ABSTRACTION_FOR_FILES = "useAbstractionForFiles";
    public static final String DYNAMIC_OPERATIONS = "dynamicOperations";
    public static final String SUPPORT_STREAMING = "supportStreaming";
    public static final String GRADLE_PROPERTIES = "gradleProperties";
    public static final String ERROR_OBJECT_TYPE = "errorObjectType";

    public static final String FEIGN = "feign";
    public static final String GOOGLE_API_CLIENT = "google-api-client";
    public static final String JERSEY1 = "jersey1";
    public static final String JERSEY2 = "jersey2";
    public static final String JERSEY3 = "jersey3";
    public static final String NATIVE = "native";
    public static final String OKHTTP_GSON = "okhttp-gson";
    public static final String RESTEASY = "resteasy";
    public static final String RESTTEMPLATE = "resttemplate";
    public static final String WEBCLIENT = "webclient";
    public static final String REST_ASSURED = "rest-assured";
    public static final String RETROFIT_2 = "retrofit2";
    public static final String VERTX = "vertx";
    public static final String MICROPROFILE = "microprofile";
    public static final String APACHE = "apache-httpclient";
    public static final String MICROPROFILE_REST_CLIENT_VERSION = "microprofileRestClientVersion";
    public static final String MICROPROFILE_REST_CLIENT_DEFAULT_VERSION = "2.0";
    public static final String MICROPROFILE_REST_CLIENT_DEFAULT_ROOT_PACKAGE = "javax";
    public static final String MICROPROFILE_DEFAULT = "default";
    public static final String MICROPROFILE_KUMULUZEE = "kumuluzee";

    public static final String SERIALIZATION_LIBRARY_GSON = "gson";
    public static final String SERIALIZATION_LIBRARY_JACKSON = "jackson";
    public static final String SERIALIZATION_LIBRARY_JSONB = "jsonb";

    protected String gradleWrapperPackage = "gradle.wrapper";
    protected boolean useRxJava = false;
    protected boolean useRxJava2 = false;
    protected boolean useRxJava3 = false;
    // backwards compatibility for openapi configs that specify neither rx1 nor rx2
    // (mustache does not allow for boolean operators so we need this extra field)
    protected boolean doNotUseRx = true;
    protected boolean usePlayWS = false;
    protected String microprofileFramework = MICROPROFILE_DEFAULT;
    protected String configKey = null;

    protected boolean asyncNative = false;
    protected boolean parcelableModel = false;
    protected boolean useBeanValidation = false;
    protected boolean performBeanValidation = false;
    protected boolean useGzipFeature = false;
    protected boolean useRuntimeException = false;
    protected boolean useReflectionEqualsHashCode = false;
    protected boolean caseInsensitiveResponseHeaders = false;
    protected boolean useAbstractionForFiles = false;
    protected boolean dynamicOperations = false;
    protected boolean supportStreaming = false;
    protected String gradleProperties;
    protected String errorObjectType;
    protected String authFolder;
    protected String serializationLibrary = null;
    protected boolean useOneOfDiscriminatorLookup = false; // use oneOf discriminator's mapping for model lookup
    protected String rootJavaEEPackage;
    protected Map<String, MpRestClientVersion> mpRestClientVersions = new HashMap<>();
    protected boolean useSingleRequestParameter = false;
    protected HashMap<String, String> schemaJsonPathToModelName = new HashMap<>();

    private static class MpRestClientVersion {
        public final String rootPackage;
        public final String pomTemplate;

        public MpRestClientVersion(String rootPackage, String pomTemplate) {
            this.rootPackage = rootPackage;
            this.pomTemplate = pomTemplate;
        }
    }

    protected Stability getStability() {
        return Stability.EXPERIMENTAL;
    }

    @Override
    public String toModuleFilename(String name, String jsonPath) {
        String usedName = sanitizeName(name, "[^a-zA-Z0-9]+");
        // todo check if empty and if so them use enum name
        return usedName.toLowerCase(Locale.ROOT);
    }

    @Override
    public String generatorLanguageVersion() {
        return "17";
    }

    public JavaClientGenerator() {
        super();

        requestBodiesIdentifier = "requestbodies";
        securitySchemesIdentifier = "securityschemes";
        requestBodyIdentifier = "requestbody";
        packageName = "org.openapijsonschematools.client";
        addSchemaImportsFromV3SpecLocations = true;
        deepestRefSchemaImportNeeded = true;
        // this must be false for parameter numbers to stay the same as the ones in the spec
        // if another schema $refs a schema in a parameter, the json path
        // and generated module must have the same parameter index as the spec
        sortParamsByRequiredFlag = Boolean.FALSE;
        objectIOClassNamePiece = "Map";
        arrayIOClassNamePiece = "List";


        // TODO: Move GlobalFeature.ParameterizedServer to library: jersey after moving featureSet to generatorMetadata
        modifyFeatureSet(features -> features
                .includeDocumentationFeatures(DocumentationFeature.Readme)
                .includeSchemaFeatures(
                        SchemaFeature.AdditionalProperties,
                        SchemaFeature.AllOf,
                        SchemaFeature.AnyOf,
                        // SchemaFeature.Const,
                        // SchemaFeature.Contains,
                        // SchemaFeature.Default,
                        // SchemaFeature.DependentRequired,
                        // SchemaFeature.DependentSchemas,
                        // SchemaFeature.Discriminator,
                        // SchemaFeature.Else,
                        SchemaFeature.Enum,
                        SchemaFeature.ExclusiveMaximum,
                        SchemaFeature.ExclusiveMinimum,
                        SchemaFeature.Format,
                        // SchemaFeature.If,
                        SchemaFeature.Items,
                        // SchemaFeature.MaxContains,
                        SchemaFeature.MaxItems,
                        SchemaFeature.MaxLength,
                        SchemaFeature.MaxProperties,
                        SchemaFeature.Maximum,
                        // SchemaFeature.MinContains,
                        SchemaFeature.MinItems,
                        SchemaFeature.MinLength,
                        SchemaFeature.MinProperties,
                        SchemaFeature.Minimum,
                        SchemaFeature.MultipleOf,
                        SchemaFeature.Not,
                        SchemaFeature.Nullable,
                        SchemaFeature.OneOf,
                        SchemaFeature.Pattern,
                        // SchemaFeature.PatternProperties,
                        // SchemaFeature.PrefixItems,
                        SchemaFeature.Properties,
                        // SchemaFeature.PropertyNames,
                        SchemaFeature.Ref,
                        SchemaFeature.Required,
                        // SchemaFeature.Then,
                        SchemaFeature.Type,
                        // SchemaFeature.UnevaluatedItems,
                        // SchemaFeature.UnevaluatedProperties,
                        SchemaFeature.UniqueItems
                )
        );

        outputFolder = "generated-code" + File.separator + "java";
        embeddedTemplateDir = templateDir = "java";
        invokerPackage = "org.openapijsonschematools.client";
        artifactId = "openapi-java-client";
        apiPackage = "apis";
        modelPackage = "components.schemas";
        rootJavaEEPackage = MICROPROFILE_REST_CLIENT_DEFAULT_ROOT_PACKAGE;

        // cliOptions default redefinition need to be updated
        updateOption(CodegenConstants.INVOKER_PACKAGE, this.getInvokerPackage());
        updateOption(CodegenConstants.ARTIFACT_ID, this.getArtifactId());
        updateOption(CodegenConstants.API_PACKAGE, apiPackage);
        updateOption(CodegenConstants.MODEL_PACKAGE, modelPackage);

        jsonPathTestTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.SCHEMA,
                new HashMap<String, String>() {{
                    put("src/test/java/packagename/components/schemas/Schema_test.hbs", ".java");
                }}
        );

        cliOptions.add(CliOption.newBoolean(USE_RX_JAVA2, "Whether to use the RxJava2 adapter with the retrofit2 library. IMPORTANT: This option has been deprecated."));
        cliOptions.add(CliOption.newBoolean(USE_RX_JAVA3, "Whether to use the RxJava3 adapter with the retrofit2 library. IMPORTANT: This option has been deprecated."));
        cliOptions.add(CliOption.newBoolean(PARCELABLE_MODEL, "Whether to generate models for Android that implement Parcelable with the okhttp-gson library."));
        cliOptions.add(CliOption.newBoolean(USE_PLAY_WS, "Use Play! Async HTTP client (Play WS API)"));
        cliOptions.add(CliOption.newBoolean(USE_BEANVALIDATION, "Use BeanValidation API annotations"));
        cliOptions.add(CliOption.newBoolean(PERFORM_BEANVALIDATION, "Perform BeanValidation"));
        cliOptions.add(CliOption.newBoolean(USE_GZIP_FEATURE, "Send gzip-encoded requests"));
        cliOptions.add(CliOption.newBoolean(USE_RUNTIME_EXCEPTION, "Use RuntimeException instead of Exception"));
        cliOptions.add(CliOption.newBoolean(ASYNC_NATIVE, "If true, async handlers will be used, instead of the sync version"));
        cliOptions.add(CliOption.newBoolean(USE_REFLECTION_EQUALS_HASHCODE, "Use org.apache.commons.lang3.builder for equals and hashCode in the models. WARNING: This will fail under a security manager, unless the appropriate permissions are set up correctly and also there's potential performance impact."));
        cliOptions.add(CliOption.newBoolean(CASE_INSENSITIVE_RESPONSE_HEADERS, "Make API response's headers case-insensitive. Available on " + OKHTTP_GSON + ", " + JERSEY2 + " libraries"));
        cliOptions.add(CliOption.newString(MICROPROFILE_FRAMEWORK, "Framework for microprofile. Possible values \"kumuluzee\""));
        cliOptions.add(CliOption.newBoolean(USE_ABSTRACTION_FOR_FILES, "Use alternative types instead of java.io.File to allow passing bytes without a file on disk. Available on resttemplate, webclient, libraries"));
        cliOptions.add(CliOption.newBoolean(DYNAMIC_OPERATIONS, "Generate operations dynamically at runtime from an OAS", this.dynamicOperations));
        cliOptions.add(CliOption.newBoolean(SUPPORT_STREAMING, "Support streaming endpoint (beta)", this.supportStreaming));
        cliOptions.add(CliOption.newString(GRADLE_PROPERTIES, "Append additional Gradle properties to the gradle.properties file"));
        cliOptions.add(CliOption.newString(ERROR_OBJECT_TYPE, "Error Object type. (This option is for okhttp-gson-next-gen only)"));
        cliOptions.add(CliOption.newString(CONFIG_KEY, "Config key in @RegisterRestClient. Default to none. Only `microprofile` supports this option."));
        cliOptions.add(CliOption.newBoolean(CodegenConstants.USE_ONEOF_DISCRIMINATOR_LOOKUP, CodegenConstants.USE_ONEOF_DISCRIMINATOR_LOOKUP_DESC + " Only jersey2, jersey3, native, okhttp-gson support this option."));
        cliOptions.add(CliOption.newString(MICROPROFILE_REST_CLIENT_VERSION, "Version of MicroProfile Rest Client API."));
        cliOptions.add(CliOption.newBoolean(CodegenConstants.USE_SINGLE_REQUEST_PARAMETER, "Setting this property to true will generate functions with a single argument containing all API endpoint parameters instead of one argument per parameter. ONLY jersey2, jersey3, okhttp-gson support this option."));

        supportedLibraries.put(JERSEY1, "HTTP client: Jersey client 1.19.x. JSON processing: Jackson 2.9.x. Enable gzip request encoding using '-DuseGzipFeature=true'. IMPORTANT NOTE: jersey 1.x is no longer actively maintained so please upgrade to 'jersey3' or other HTTP libraries instead.");
        supportedLibraries.put(JERSEY2, "HTTP client: Jersey client 2.25.1. JSON processing: Jackson 2.9.x");
        supportedLibraries.put(JERSEY3, "HTTP client: Jersey client 3.x. JSON processing: Jackson 2.x");
        supportedLibraries.put(FEIGN, "HTTP client: OpenFeign 10.x. JSON processing: Jackson 2.9.x.");
        supportedLibraries.put(OKHTTP_GSON, "[DEFAULT] HTTP client: OkHttp 3.x. JSON processing: Gson 2.8.x. Enable Parcelable models on Android using '-DparcelableModel=true'. Enable gzip request encoding using '-DuseGzipFeature=true'.");
        supportedLibraries.put(RETROFIT_2, "HTTP client: OkHttp 3.x. JSON processing: Gson 2.x (Retrofit 2.3.0). Enable the RxJava adapter using '-DuseRxJava[2/3]=true'. (RxJava 1.x or 2.x or 3.x)");
        supportedLibraries.put(RESTTEMPLATE, "HTTP client: Spring RestTemplate 4.x. JSON processing: Jackson 2.9.x");
        supportedLibraries.put(WEBCLIENT, "HTTP client: Spring WebClient 5.x. JSON processing: Jackson 2.9.x");
        supportedLibraries.put(RESTEASY, "HTTP client: Resteasy client 3.x. JSON processing: Jackson 2.9.x");
        supportedLibraries.put(VERTX, "HTTP client: VertX client 3.x. JSON processing: Jackson 2.9.x");
        supportedLibraries.put(GOOGLE_API_CLIENT, "HTTP client: Google API client 1.x. JSON processing: Jackson 2.9.x");
        supportedLibraries.put(REST_ASSURED, "HTTP client: rest-assured : 4.x. JSON processing: Gson 2.x or Jackson 2.10.x. Only for Java 8");
        supportedLibraries.put(NATIVE, "HTTP client: Java native HttpClient. JSON processing: Jackson 2.9.x. Only for Java11+");
        supportedLibraries.put(MICROPROFILE, "HTTP client: Microprofile client 1.x. JSON processing: JSON-B");
        supportedLibraries.put(APACHE, "HTTP client: Apache httpclient 4.x");

        CliOption libraryOption = new CliOption(CodegenConstants.LIBRARY, "library template (sub-template) to use");
        libraryOption.setEnum(supportedLibraries);
        // set okhttp-gson as the default
        libraryOption.setDefault(OKHTTP_GSON);
        cliOptions.add(libraryOption);
        setLibrary(OKHTTP_GSON);

        CliOption serializationLibrary = new CliOption(CodegenConstants.SERIALIZATION_LIBRARY, "Serialization library, default depends on value of the option library");
        Map<String, String> serializationOptions = new HashMap<>();
        serializationOptions.put(SERIALIZATION_LIBRARY_GSON, "Use Gson as serialization library");
        serializationOptions.put(SERIALIZATION_LIBRARY_JACKSON, "Use Jackson as serialization library");
        serializationOptions.put(SERIALIZATION_LIBRARY_JSONB, "Use JSON-B as serialization library");
        serializationLibrary.setEnum(serializationOptions);
        cliOptions.add(serializationLibrary);

        // Ensure the OAS 3.x discriminator mappings include any descendent schemas that allOf
        // inherit from self, any oneOf schemas, any anyOf schemas, any x-discriminator-values,
        // and the discriminator mapping schemas in the OAS document.
        this.setLegacyDiscriminatorBehavior(false);

        initMpRestClientVersionToRootPackage();
    }

    private void initMpRestClientVersionToRootPackage() {
        mpRestClientVersions.put("1.4.1", new MpRestClientVersion("javax", "pom.mustache"));
        mpRestClientVersions.put("2.0", new MpRestClientVersion("javax", "pom.mustache"));
        mpRestClientVersions.put("3.0", new MpRestClientVersion("jakarta", "pom_3.0.mustache"));
    }

    @Override
    public GeneratorType getTag() {
        return GeneratorType.CLIENT;
    }

    @Override
    public String getName() {
        return "java";
    }

    @Override
    public String getHelp() {
        return "Generates a Java client library (HTTP lib: Jersey (1.x, 2.x), Retrofit (2.x), OpenFeign (10.x) and more.";
    }

    public String packagePath() {
        return "src" + File.separatorChar + "main" + File.separatorChar + "java" + File.separatorChar + packageName.replace('.', File.separatorChar);
    }

    protected String testPackagePath() {
        return "src" + File.separatorChar + "test" + File.separatorChar + "java" + File.separatorChar + packageName.replace('.', File.separatorChar);
    }

    @Override
    public void processOpts() {
        HashMap<String, String> schemaDocs = new HashMap<>();
        additionalProperties.put(CodegenConstants.PACKAGE_NAME, packageName);
        List<String> schemaSupportingFiles = new ArrayList<>();
        schemaSupportingFiles.add("AnyTypeJsonSchema");
        schemaSupportingFiles.add("BooleanJsonSchema");
        schemaSupportingFiles.add("DateJsonSchema");
        schemaSupportingFiles.add("DateTimeJsonSchema");
        schemaSupportingFiles.add("DecimalJsonSchema");
        schemaSupportingFiles.add("DoubleJsonSchema");
        schemaSupportingFiles.add("FloatJsonSchema");
        schemaSupportingFiles.add("Int32JsonSchema");
        schemaSupportingFiles.add("Int64JsonSchema");
        schemaSupportingFiles.add("IntJsonSchema");
        schemaSupportingFiles.add("ListJsonSchema");
        schemaSupportingFiles.add("MapMaker");
        schemaSupportingFiles.add("MapJsonSchema");
        schemaSupportingFiles.add("NotAnyTypeJsonSchema");
        schemaSupportingFiles.add("NullJsonSchema");
        schemaSupportingFiles.add("NumberJsonSchema");
        schemaSupportingFiles.add("SetMaker");
        schemaSupportingFiles.add("StringJsonSchema");
        schemaSupportingFiles.add("UuidJsonSchema");
        for (String schemaSupportingFile: schemaSupportingFiles) {
            supportingFiles.add(new SupportingFile(
                    "src/main/java/packagename/schemas/"+schemaSupportingFile+".hbs",
                    packagePath() + File.separatorChar + "schemas",
                    schemaSupportingFile + ".java"));
        }
        // tests
        List<String> schemaTestSupportingFiles = new ArrayList<>();
        schemaTestSupportingFiles.add("AnyTypeSchemaTest");
        schemaTestSupportingFiles.add("ArrayTypeSchemaTest");
        schemaTestSupportingFiles.add("BooleanSchemaTest");
        schemaTestSupportingFiles.add("ListSchemaTest");
        schemaTestSupportingFiles.add("MapSchemaTest");
        schemaTestSupportingFiles.add("NullSchemaTest");
        schemaTestSupportingFiles.add("NumberSchemaTest");
        schemaTestSupportingFiles.add("ObjectTypeSchemaTest");
        schemaTestSupportingFiles.add("RefBooleanSchemaTest");
        for (String schemaTestSupportingFile: schemaTestSupportingFiles) {
            supportingFiles.add(new SupportingFile(
                    "src/test/java/packagename/schemas/"+schemaTestSupportingFile+".hbs",
                    testPackagePath() + File.separatorChar + "schemas",
                    schemaTestSupportingFile + ".java"));
        }

        // validation
        List<String> keywordValidatorFiles = new ArrayList<>();
        keywordValidatorFiles.add("AdditionalPropertiesValidator");
        keywordValidatorFiles.add("AllOfValidator");
        keywordValidatorFiles.add("AnyOfValidator");
        keywordValidatorFiles.add("BooleanEnumValidator");
        keywordValidatorFiles.add("BooleanSchemaValidator");
        keywordValidatorFiles.add("BooleanValueMethod");
        keywordValidatorFiles.add("BigDecimalValidator");
        keywordValidatorFiles.add("CustomIsoparser");
        keywordValidatorFiles.add("DoubleEnumValidator");
        keywordValidatorFiles.add("DoubleValueMethod");
        keywordValidatorFiles.add("EnumValidator");
        keywordValidatorFiles.add("ExclusiveMaximumValidator");
        keywordValidatorFiles.add("ExclusiveMinimumValidator");
        keywordValidatorFiles.add("FakeValidator");
        keywordValidatorFiles.add("FloatEnumValidator");
        keywordValidatorFiles.add("FloatValueMethod");
        keywordValidatorFiles.add("FormatValidator");
        keywordValidatorFiles.add("FrozenList");
        keywordValidatorFiles.add("FrozenMap");
        keywordValidatorFiles.add("IntegerEnumValidator");
        keywordValidatorFiles.add("IntegerValueMethod");
        keywordValidatorFiles.add("ItemsValidator");
        keywordValidatorFiles.add("JsonSchema");
        keywordValidatorFiles.add("JsonSchemaFactory");
        keywordValidatorFiles.add("JsonSchemaInfo");
        keywordValidatorFiles.add("KeywordEntry");
        keywordValidatorFiles.add("KeywordValidator");
        keywordValidatorFiles.add("LengthValidator");
        keywordValidatorFiles.add("ListSchemaValidator");
        keywordValidatorFiles.add("LongEnumValidator");
        keywordValidatorFiles.add("LongValueMethod");
        keywordValidatorFiles.add("MapSchemaValidator");
        keywordValidatorFiles.add("MaximumValidator");
        keywordValidatorFiles.add("MaxItemsValidator");
        keywordValidatorFiles.add("MaxLengthValidator");
        keywordValidatorFiles.add("MaxPropertiesValidator");
        keywordValidatorFiles.add("MinimumValidator");
        keywordValidatorFiles.add("MinItemsValidator");
        keywordValidatorFiles.add("MinLengthValidator");
        keywordValidatorFiles.add("MinPropertiesValidator");
        keywordValidatorFiles.add("MultipleOfValidator");
        keywordValidatorFiles.add("NotValidator");
        keywordValidatorFiles.add("NullEnumValidator");
        keywordValidatorFiles.add("NullSchemaValidator");
        keywordValidatorFiles.add("NullValueMethod");
        keywordValidatorFiles.add("NumberSchemaValidator");
        keywordValidatorFiles.add("OneOfValidator");
        keywordValidatorFiles.add("PathToSchemasMap");
        keywordValidatorFiles.add("PatternValidator");
        keywordValidatorFiles.add("PropertiesValidator");
        keywordValidatorFiles.add("PropertyEntry");
        keywordValidatorFiles.add("RequiredValidator");
        keywordValidatorFiles.add("StringEnumValidator");
        keywordValidatorFiles.add("StringSchemaValidator");
        keywordValidatorFiles.add("StringValueMethod");
        keywordValidatorFiles.add("TypeValidator");
        keywordValidatorFiles.add("UniqueItemsValidator");
        keywordValidatorFiles.add("UnsetAnyTypeJsonSchema");
        keywordValidatorFiles.add("ValidationMetadata");
        for (String keywordValidatorFile: keywordValidatorFiles) {
            supportingFiles.add(new SupportingFile(
                    "src/main/java/packagename/schemas/validation/"+keywordValidatorFile+".hbs",
                    packagePath() + File.separatorChar + "schemas" + File.separatorChar + "validation",
                    keywordValidatorFile + ".java"));
        }
        // tests
        List<String> keywordValidatorTestFiles = new ArrayList<>();
        keywordValidatorTestFiles.add("AdditionalPropertiesValidatorTest");
        keywordValidatorTestFiles.add("CustomIsoparserTest");
        keywordValidatorTestFiles.add("FormatValidatorTest");
        keywordValidatorTestFiles.add("ItemsValidatorTest");
        keywordValidatorTestFiles.add("PropertiesValidatorTest");
        keywordValidatorTestFiles.add("RequiredValidatorTest");
        keywordValidatorTestFiles.add("TypeValidatorTest");
        keywordValidatorTestFiles.add("JsonSchemaTest");
        for (String keywordValidatorTestFile: keywordValidatorTestFiles) {
            supportingFiles.add(new SupportingFile(
                    "src/test/java/packagename/schemas/validation/"+keywordValidatorTestFile+".hbs",
                    testPackagePath() + File.separatorChar + "schemas" + File.separatorChar + "validation",
                    keywordValidatorTestFile + ".java"));
        }

        // exceptions
        List<String> exceptionClasses = new ArrayList<>();
        exceptionClasses.add("BaseException");
        exceptionClasses.add("InvalidAdditionalPropertyException");
        exceptionClasses.add("InvalidTypeException");
        exceptionClasses.add("UnsetPropertyException");
        exceptionClasses.add("ValidationException");
        for (String exceptionClass: exceptionClasses) {
            supportingFiles.add(new SupportingFile(
                    "src/main/java/packagename/exceptions/"+exceptionClass+".hbs",
                    packagePath() + File.separatorChar + "exceptions",
                    exceptionClass + ".java"));
        }


        // configuration
        supportingFiles.add(new SupportingFile(
                "src/main/java/packagename/configurations/JsonSchemaKeywordFlags.hbs",
                packagePath() + File.separatorChar + "configurations",
                "JsonSchemaKeywordFlags.java"));
        supportingFiles.add(new SupportingFile(
                "src/test/java/packagename/configurations/JsonSchemaKeywordFlagsTest.hbs",
                testPackagePath() + File.separatorChar + "configurations",
                "JsonSchemaKeywordFlagsTest.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/packagename/configurations/SchemaConfiguration.hbs",
                packagePath() + File.separatorChar + "configurations",
                "SchemaConfiguration.java"));

        HashMap<String, String> schemaTemplates = new HashMap<>();
        schemaTemplates.put("src/main/java/packagename/components/schemas/Schema.hbs", ".java");
        jsonPathTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.SCHEMA,
                schemaTemplates
        );
        jsonPathDocTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.SCHEMA,
                new HashMap<String, String>() {{
                    put("src/main/java/packagename/components/schemas/Schema_doc.hbs", ".md");
                }}
        );

        if (WEBCLIENT.equals(getLibrary()) || NATIVE.equals(getLibrary())) {
            dateLibrary = "java8";
        } else if (MICROPROFILE.equals(getLibrary())) {
            dateLibrary = "legacy";
        }
        super.processOpts();

        if (additionalProperties.containsKey(CodegenConstants.USE_ONEOF_DISCRIMINATOR_LOOKUP)) {
            setUseOneOfDiscriminatorLookup(convertPropertyToBooleanAndWriteBack(CodegenConstants.USE_ONEOF_DISCRIMINATOR_LOOKUP));
        } else {
            additionalProperties.put(CodegenConstants.USE_ONEOF_DISCRIMINATOR_LOOKUP, useOneOfDiscriminatorLookup);
        }

        // RxJava
        if (additionalProperties.containsKey(USE_RX_JAVA2) && additionalProperties.containsKey(USE_RX_JAVA3)) {
            LOGGER.warn("You specified all RxJava versions 2 and 3 but they are mutually exclusive. Defaulting to v3.");
            this.setUseRxJava3(Boolean.parseBoolean(additionalProperties.get(USE_RX_JAVA3).toString()));
        } else {
            if (additionalProperties.containsKey(USE_RX_JAVA2) && additionalProperties.containsKey(USE_RX_JAVA3)) {
                LOGGER.warn("You specified both RxJava versions 2 and 3 but they are mutually exclusive. Defaulting to v3.");
                this.setUseRxJava3(Boolean.parseBoolean(additionalProperties.get(USE_RX_JAVA3).toString()));
            } else {
                if (additionalProperties.containsKey(USE_RX_JAVA2)) {
                    this.setUseRxJava2(Boolean.parseBoolean(additionalProperties.get(USE_RX_JAVA2).toString()));
                }
                if (additionalProperties.containsKey(USE_RX_JAVA3)) {
                    this.setUseRxJava3(Boolean.parseBoolean(additionalProperties.get(USE_RX_JAVA3).toString()));
                }
            }
        }

        if (additionalProperties.containsKey(CodegenConstants.USE_SINGLE_REQUEST_PARAMETER)) {
            this.setUseSingleRequestParameter(convertPropertyToBoolean(CodegenConstants.USE_SINGLE_REQUEST_PARAMETER));
        }
        writePropertyBack(CodegenConstants.USE_SINGLE_REQUEST_PARAMETER, getUseSingleRequestParameter());

        if (!useRxJava && !useRxJava2 && !useRxJava3) {
            additionalProperties.put(DO_NOT_USE_RX, true);
        }

        // Java Play
        if (additionalProperties.containsKey(USE_PLAY_WS)) {
            this.setUsePlayWS(Boolean.parseBoolean(additionalProperties.get(USE_PLAY_WS).toString()));
        }
        additionalProperties.put(USE_PLAY_WS, usePlayWS);

        // Microprofile framework
        if (additionalProperties.containsKey(MICROPROFILE_FRAMEWORK)) {
            if (!MICROPROFILE_KUMULUZEE.equals(microprofileFramework)) {
                throw new RuntimeException("Invalid microprofileFramework '" + microprofileFramework + "'. Must be 'kumuluzee' or none.");
            }
            this.setMicroprofileFramework(additionalProperties.get(MICROPROFILE_FRAMEWORK).toString());
        }
        additionalProperties.put(MICROPROFILE_FRAMEWORK, microprofileFramework);

        if (!additionalProperties.containsKey(MICROPROFILE_REST_CLIENT_VERSION)) {
            additionalProperties.put(MICROPROFILE_REST_CLIENT_VERSION, MICROPROFILE_REST_CLIENT_DEFAULT_VERSION);
        } else {
            String mpRestClientVersion = (String) additionalProperties.get(MICROPROFILE_REST_CLIENT_VERSION);
            if (!mpRestClientVersions.containsKey(mpRestClientVersion)) {
                throw new IllegalArgumentException(
                        String.format(Locale.ROOT,
                                "Version %s of MicroProfile Rest Client is not supported or incorrect. Supported versions are %s",
                                mpRestClientVersion,
                                String.join(", ", mpRestClientVersions.keySet())
                        )
                );
            }
        }
        if (!additionalProperties.containsKey("rootJavaEEPackage")) {
            String mpRestClientVersion = (String) additionalProperties.get(MICROPROFILE_REST_CLIENT_VERSION);
            if (mpRestClientVersions.containsKey(mpRestClientVersion)) {
                rootJavaEEPackage = mpRestClientVersions.get(mpRestClientVersion).rootPackage;
            }
            additionalProperties.put("rootJavaEEPackage", rootJavaEEPackage);
        }

        if (additionalProperties.containsKey(CONFIG_KEY)) {
            this.setConfigKey(additionalProperties.get(CONFIG_KEY).toString());
        }

        if (additionalProperties.containsKey(ASYNC_NATIVE)) {
            this.setAsyncNative(convertPropertyToBooleanAndWriteBack(ASYNC_NATIVE));
        }

        if (additionalProperties.containsKey(PARCELABLE_MODEL)) {
            this.setParcelableModel(Boolean.parseBoolean(additionalProperties.get(PARCELABLE_MODEL).toString()));
        }
        // put the boolean value back to PARCELABLE_MODEL in additionalProperties
        additionalProperties.put(PARCELABLE_MODEL, parcelableModel);

        if (additionalProperties.containsKey(USE_BEANVALIDATION)) {
            this.setUseBeanValidation(convertPropertyToBooleanAndWriteBack(USE_BEANVALIDATION));
        }

        if (additionalProperties.containsKey(PERFORM_BEANVALIDATION)) {
            this.setPerformBeanValidation(convertPropertyToBooleanAndWriteBack(PERFORM_BEANVALIDATION));
        }

        if (additionalProperties.containsKey(USE_GZIP_FEATURE)) {
            this.setUseGzipFeature(convertPropertyToBooleanAndWriteBack(USE_GZIP_FEATURE));
        }

        if (additionalProperties.containsKey(USE_RUNTIME_EXCEPTION)) {
            this.setUseRuntimeException(convertPropertyToBooleanAndWriteBack(USE_RUNTIME_EXCEPTION));
        }

        if (additionalProperties.containsKey(USE_REFLECTION_EQUALS_HASHCODE)) {
            this.setUseReflectionEqualsHashCode(convertPropertyToBooleanAndWriteBack(USE_REFLECTION_EQUALS_HASHCODE));
        }

        if (additionalProperties.containsKey(CASE_INSENSITIVE_RESPONSE_HEADERS)) {
            this.setUseReflectionEqualsHashCode(convertPropertyToBooleanAndWriteBack(CASE_INSENSITIVE_RESPONSE_HEADERS));
        }

        if (additionalProperties.containsKey(USE_ABSTRACTION_FOR_FILES)) {
            this.setUseAbstractionForFiles(convertPropertyToBooleanAndWriteBack(USE_ABSTRACTION_FOR_FILES));
        }

        if (additionalProperties.containsKey(DYNAMIC_OPERATIONS)) {
            this.setDynamicOperations(Boolean.parseBoolean(additionalProperties.get(DYNAMIC_OPERATIONS).toString()));
        }
        additionalProperties.put(DYNAMIC_OPERATIONS, dynamicOperations);

        if (additionalProperties.containsKey(SUPPORT_STREAMING)) {
            this.setSupportStreaming(Boolean.parseBoolean(additionalProperties.get(SUPPORT_STREAMING).toString()));
        }
        additionalProperties.put(SUPPORT_STREAMING, supportStreaming);

        if (additionalProperties.containsKey(GRADLE_PROPERTIES)) {
            this.setGradleProperties(additionalProperties.get(GRADLE_PROPERTIES).toString());
        }
        additionalProperties.put(GRADLE_PROPERTIES, gradleProperties);

        if (additionalProperties.containsKey(ERROR_OBJECT_TYPE)) {
            this.setErrorObjectType(additionalProperties.get(ERROR_OBJECT_TYPE).toString());
        }
        additionalProperties.put(ERROR_OBJECT_TYPE, errorObjectType);

        final String invokerFolder = (sourceFolder + '/' + invokerPackage).replace(".", "/");
        final String apiFolder = (sourceFolder + '/' + apiPackage).replace(".", "/");
        final String modelsFolder = (sourceFolder + File.separator + modelPackage().replace('.', File.separatorChar)).replace('/', File.separatorChar);
        authFolder = (sourceFolder + '/' + invokerPackage + ".auth").replace(".", "/");

        //Common files
        supportingFiles.add(new SupportingFile("pom.hbs", "", "pom.xml").doNotOverwrite());
        supportingFiles.add(new SupportingFile("README.hbs", "", "README.md").doNotOverwrite());
//        supportingFiles.add(new SupportingFile("build.gradle.mustache", "", "build.gradle").doNotOverwrite());
//        supportingFiles.add(new SupportingFile("build.sbt.mustache", "", "build.sbt").doNotOverwrite());
//        supportingFiles.add(new SupportingFile("settings.gradle.mustache", "", "settings.gradle").doNotOverwrite());
//        supportingFiles.add(new SupportingFile("gradle.properties.mustache", "", "gradle.properties").doNotOverwrite());
//        supportingFiles.add(new SupportingFile("manifest.mustache", projectFolder, "AndroidManifest.xml").doNotOverwrite());
//        supportingFiles.add(new SupportingFile("travis.mustache", "", ".travis.yml"));
//        supportingFiles.add(new SupportingFile("ApiClient.mustache", invokerFolder, "ApiClient.java"));
//        supportingFiles.add(new SupportingFile("ServerConfiguration.mustache", invokerFolder, "ServerConfiguration.java"));
//        supportingFiles.add(new SupportingFile("ServerVariable.mustache", invokerFolder, "ServerVariable.java"));
//        supportingFiles.add(new SupportingFile("maven.yml.mustache", ".github/workflows", "maven.yml"));

//        supportingFiles.add(new SupportingFile("gradlew.mustache", "", "gradlew"));
//        supportingFiles.add(new SupportingFile("gradlew.bat.mustache", "", "gradlew.bat"));
//        supportingFiles.add(new SupportingFile("gradle-wrapper.properties.mustache",
//                gradleWrapperPackage.replace(".", File.separator), "gradle-wrapper.properties"));
//        supportingFiles.add(new SupportingFile("gradle-wrapper.jar",
//                gradleWrapperPackage.replace(".", File.separator), "gradle-wrapper.jar"));
//        supportingFiles.add(new SupportingFile("git_push.sh.mustache", "", "git_push.sh"));
//        supportingFiles.add(new SupportingFile("gitignore.mustache", "", ".gitignore"));

        if (additionalProperties.containsKey(CodegenConstants.SERIALIZATION_LIBRARY)) {
            setSerializationLibrary(additionalProperties.get(CodegenConstants.SERIALIZATION_LIBRARY).toString());
        }

        if (getSerializationLibrary() == null) {
            LOGGER.info("No serializationLibrary configured, using '{}' as fallback", SERIALIZATION_LIBRARY_GSON);
            setSerializationLibrary(SERIALIZATION_LIBRARY_GSON);
        }
        switch (getSerializationLibrary()) {
            case SERIALIZATION_LIBRARY_JACKSON:
                additionalProperties.put(SERIALIZATION_LIBRARY_JACKSON, "true");
                additionalProperties.remove(SERIALIZATION_LIBRARY_GSON);
                additionalProperties.remove(SERIALIZATION_LIBRARY_JSONB);
                supportingFiles.add(new SupportingFile("RFC3339DateFormat.mustache", invokerFolder, "RFC3339DateFormat.java"));
                break;
            case SERIALIZATION_LIBRARY_GSON:
                additionalProperties.put(SERIALIZATION_LIBRARY_GSON, "true");
                additionalProperties.remove(SERIALIZATION_LIBRARY_JACKSON);
                additionalProperties.remove(SERIALIZATION_LIBRARY_JSONB);
                break;
            case SERIALIZATION_LIBRARY_JSONB:
                additionalProperties.put(SERIALIZATION_LIBRARY_JSONB, "true");
                additionalProperties.remove(SERIALIZATION_LIBRARY_JACKSON);
                additionalProperties.remove(SERIALIZATION_LIBRARY_GSON);
                break;
            default:
                additionalProperties.remove(SERIALIZATION_LIBRARY_JACKSON);
                additionalProperties.remove(SERIALIZATION_LIBRARY_GSON);
                additionalProperties.remove(SERIALIZATION_LIBRARY_JSONB);
                break;
        }
    }

    /**
     * Prioritizes consumes mime-type list by moving json-vendor and json mime-types up front, but
     * otherwise preserves original consumes definition order.
     * [application/vnd...+json,... application/json, ..as is..]
     *
     * @param consumes consumes mime-type list
     * @return
     */
    static List<Map<String, String>> prioritizeContentTypes(List<Map<String, String>> consumes) {
        if (consumes.size() <= 1)
            return consumes;

        List<Map<String, String>> prioritizedContentTypes = new ArrayList<>(consumes.size());

        List<Map<String, String>> jsonVendorMimeTypes = new ArrayList<>(consumes.size());
        List<Map<String, String>> jsonMimeTypes = new ArrayList<>(consumes.size());

        for (Map<String, String> consume : consumes) {
            if (isJsonVendorMimeType(consume.get(MEDIA_TYPE))) {
                jsonVendorMimeTypes.add(consume);
            } else if (isJsonMimeType(consume.get(MEDIA_TYPE))) {
                jsonMimeTypes.add(consume);
            } else
                prioritizedContentTypes.add(consume);
        }

        prioritizedContentTypes.addAll(0, jsonMimeTypes);
        prioritizedContentTypes.addAll(0, jsonVendorMimeTypes);
        return prioritizedContentTypes;
    }

    private static boolean isMultipartType(List<Map<String, String>> consumes) {
        Map<String, String> firstType = consumes.get(0);
        if (firstType != null) {
            if ("multipart/form-data".equals(firstType.get(MEDIA_TYPE))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void postProcessModelProperty(CodegenSchema model, CodegenSchema property) {
        super.postProcessModelProperty(model, property);
        if (model.enumInfo == null) {
            //final String lib = getLibrary();
            //Needed imports for Jackson based libraries
            if (additionalProperties.containsKey(SERIALIZATION_LIBRARY_JACKSON)) {
                model.imports.add("JsonProperty");
                model.imports.add("JsonValue");
                model.imports.add("JsonInclude");
                model.imports.add("JsonTypeName");
            }
            if (additionalProperties.containsKey(SERIALIZATION_LIBRARY_GSON)) {
                model.imports.add("SerializedName");
                model.imports.add("TypeAdapter");
                model.imports.add("JsonAdapter");
                model.imports.add("JsonReader");
                model.imports.add("JsonWriter");
                model.imports.add("IOException");
            }
        } else { // enum class
            //Needed imports for Jackson's JsonCreator
            if (additionalProperties.containsKey(SERIALIZATION_LIBRARY_JACKSON)) {
                model.imports.add("JsonValue");
                model.imports.add("JsonCreator");
            }
        }
        if (MICROPROFILE.equals(getLibrary())) {
            model.imports.remove("ApiModelProperty");
            model.imports.remove("ApiModel");
            model.imports.remove("JsonSerialize");
            model.imports.remove("ToStringSerializer");
        }

        if (property.types != null && property.types.contains("array") && property.uniqueItems && !JACKSON.equals(serializationLibrary)) {
            // clean-up
            model.imports.remove("JsonDeserialize");
            property.vendorExtensions.remove("x-setter-extra-annotation");
        }
    }

    public void setUseOneOfDiscriminatorLookup(boolean useOneOfDiscriminatorLookup) {
        this.useOneOfDiscriminatorLookup = useOneOfDiscriminatorLookup;
    }

    public boolean getUseOneOfDiscriminatorLookup() {
        return this.useOneOfDiscriminatorLookup;
    }

    private boolean getUseSingleRequestParameter() {
        return useSingleRequestParameter;
    }

    private void setUseSingleRequestParameter(boolean useSingleRequestParameter) {
        this.useSingleRequestParameter = useSingleRequestParameter;
    }

    public void setUseRxJava(boolean useRxJava) {
        this.useRxJava = useRxJava;
        doNotUseRx = false;
    }

    public void setUseRxJava2(boolean useRxJava2) {
        this.useRxJava2 = useRxJava2;
        doNotUseRx = false;
    }

    public void setUseRxJava3(boolean useRxJava3) {
        this.useRxJava3 = useRxJava3;
        doNotUseRx = false;
    }

    public void setDoNotUseRx(boolean doNotUseRx) {
        this.doNotUseRx = doNotUseRx;
    }

    public void setUsePlayWS(boolean usePlayWS) {
        this.usePlayWS = usePlayWS;
    }

    public void setAsyncNative(boolean asyncNative) {
        this.asyncNative = asyncNative;
    }

    public void setMicroprofileFramework(String microprofileFramework) {
        this.microprofileFramework = microprofileFramework;
    }

    public void setConfigKey(String configKey) {
        this.configKey = configKey;
    }

    public void setParcelableModel(boolean parcelableModel) {
        this.parcelableModel = parcelableModel;
    }

    public void setUseBeanValidation(boolean useBeanValidation) {
        this.useBeanValidation = useBeanValidation;
    }

    public void setPerformBeanValidation(boolean performBeanValidation) {
        this.performBeanValidation = performBeanValidation;
    }

    public void setUseGzipFeature(boolean useGzipFeature) {
        this.useGzipFeature = useGzipFeature;
    }

    public void setUseRuntimeException(boolean useRuntimeException) {
        this.useRuntimeException = useRuntimeException;
    }

    public void setUseReflectionEqualsHashCode(boolean useReflectionEqualsHashCode) {
        this.useReflectionEqualsHashCode = useReflectionEqualsHashCode;
    }

    public void setCaseInsensitiveResponseHeaders(final Boolean caseInsensitiveResponseHeaders) {
        this.caseInsensitiveResponseHeaders = caseInsensitiveResponseHeaders;
    }

    public void setUseAbstractionForFiles(boolean useAbstractionForFiles) {
        this.useAbstractionForFiles = useAbstractionForFiles;
    }

    public void setDynamicOperations(final boolean dynamicOperations) {
        this.dynamicOperations = dynamicOperations;
    }

    public void setSupportStreaming(final boolean supportStreaming) {
        this.supportStreaming = supportStreaming;
    }

    public void setGradleProperties(final String gradleProperties) {
        this.gradleProperties = gradleProperties;
    }

    public void setErrorObjectType(final String errorObjectType) {
        this.errorObjectType = errorObjectType;
    }

    /**
     * Serialization library.
     *
     * @return 'gson' or 'jackson'
     */
    public String getSerializationLibrary() {
        return serializationLibrary;
    }

    public void setSerializationLibrary(String serializationLibrary) {
        if (SERIALIZATION_LIBRARY_JACKSON.equalsIgnoreCase(serializationLibrary)) {
            this.serializationLibrary = SERIALIZATION_LIBRARY_JACKSON;
        } else if (SERIALIZATION_LIBRARY_GSON.equalsIgnoreCase(serializationLibrary)) {
            this.serializationLibrary = SERIALIZATION_LIBRARY_GSON;
        } else if (SERIALIZATION_LIBRARY_JSONB.equalsIgnoreCase(serializationLibrary)) {
            this.serializationLibrary = SERIALIZATION_LIBRARY_JSONB;
        } else {
            throw new IllegalArgumentException("Unexpected serializationLibrary value: " + serializationLibrary);
        }
    }

    public void forceSerializationLibrary(String serializationLibrary) {
        if ((this.serializationLibrary != null) && !this.serializationLibrary.equalsIgnoreCase(serializationLibrary)) {
            LOGGER.warn(
                    "The configured serializationLibrary '{}', is not supported by the library: '{}', switching back to: {}",
                    this.serializationLibrary, getLibrary(), serializationLibrary);
        }
        setSerializationLibrary(serializationLibrary);
    }

    @Override
    public Map<String, Object> postProcessSupportingFileData(Map<String, Object> data) {
        generateYAMLSpecFile(data);
        return super.postProcessSupportingFileData(data);
    }

    @Override
    public String toApiVarName(String name) {
        String apiVarName = super.toApiVarName(name);
        if (reservedWords.contains(apiVarName)) {
            apiVarName = escapeReservedWord(apiVarName);
        }
        return apiVarName;
    }

    @Override
    public List<VendorExtension> getSupportedVendorExtensions() {
        List<VendorExtension> extensions = super.getSupportedVendorExtensions();
        extensions.add(VendorExtension.X_WEBCLIENT_BLOCKING);
        return extensions;
    }

    @Override
    public String defaultTemplatingEngine() {
        return "handlebars";
    }

    @Override
    public TemplatingEngineAdapter getTemplatingEngine() {
        TemplatingEngineAdapter te = super.getTemplatingEngine();
        HandlebarsEngineAdapter hea = (HandlebarsEngineAdapter) te;
        hea.infiniteLoops(true);
        hea.setPrettyPrint(true);
        return hea;
    }

    @Override
    public String toContentTypeFilename(String name) {
        return toModuleFilename(name, null);
    }

    @Override
    public String toModelFilename(String name, String jsonPath) {
        return toModelName(name, jsonPath);
    }

    @Override
    public String toResponseModuleName(String componentName, String jsonPath) {
        if (jsonPath.startsWith("#/components/responses/")) {
            return toModuleFilename(componentName, jsonPath);
        }
        return toModuleFilename("response"+componentName, jsonPath);
    }

    @Override
    @SuppressWarnings("static-method")
    public String sanitizeName(String name, String filterOutRegex) {
        return name.replaceAll(filterOutRegex, "");
    }

    protected boolean isValid(String name) {
        boolean isValid = super.isValid(name);
        if (!isValid) {
            return false;
        }
        return name.matches("^[a-zA-Z]\\w*$");
    }

    @Override
    public String getSchemaCamelCaseName(String name, @NotNull String sourceJsonPath) {
        return getSchemaCamelCaseName(name, sourceJsonPath, true);
    }

    @Override
    public String escapeUnsafeCharacters(String value) {
        // handles escape characters and the like
        String stringValue = value;
        String backslash = "\\";
        if (stringValue.contains(backslash)) {
            stringValue = stringValue.replace(backslash, "\\\\");
        }
        String nullChar = "\0";
        if (stringValue.contains(nullChar)) {
            stringValue = stringValue.replace(nullChar, "\\0");
        }
        String doubleQuoteChar = "\"";
        if (stringValue.contains(doubleQuoteChar)) {
            stringValue = stringValue.replace(doubleQuoteChar, "\\\"");
        }
        String lineSep = System.lineSeparator();
        if (stringValue.contains(lineSep)) {
            stringValue = stringValue.replace(lineSep, "\\n");
        }
        String carriageReturn = "\r";
        if (stringValue.contains(carriageReturn)) {
            stringValue = stringValue.replace(carriageReturn, "\\r");
        }
        String tab = "\t";
        if (stringValue.contains(tab)) {
            stringValue = stringValue.replace(tab, "\\t");
        }
        String formFeed = "\f";
        if (stringValue.contains(formFeed)) {
            stringValue = stringValue.replace(formFeed, "\\f");
        }
        return stringValue;
    }

    private String getSchemaCamelCaseName(String name, @NotNull String sourceJsonPath, boolean useCache) {
        String usedKey = escapeUnsafeCharacters(name);
        usedKey = sanitizeName(usedKey, "[^a-zA-Z0-9_]+");
        /*
        schemas named Schema can collide in:
        response headers
        operation:
        HeaderParameters
        PathParameters
        QueryParameters
        CookieParameter
        To prevent that, those schemas are renamed
        - component responses contain headers
        - those headers are collected into a json object schema
        - header schemas could also be refed
        - so all header schemas must be named by their header name to prevent collisions
         */
        if (sourceJsonPath.endsWith("/schema")) {
            if (sourceJsonPath.startsWith("#/paths") && sourceJsonPath.contains("/parameters/")) {
                String[] pathPieces = sourceJsonPath.split("/");
                if (pathPieces[3].equals("parameters")) {
                    // #/paths/path/parameters/0/Schema -> PathParamSchema0
                    usedKey = "PathParam" + camelize(usedKey) + pathPieces[4]; // PathParamSchema0
                } else {
                    // #/paths/path/get/parameters/0/Schema -> Schema0
                    usedKey = camelize(usedKey) + pathPieces[5]; // Schema0
                }
            } else if (
                    (sourceJsonPath.startsWith("#/paths") && sourceJsonPath.contains("/headers/")) ||
                    sourceJsonPath.startsWith("#/components/headers/") ||
                    (sourceJsonPath.startsWith("#/components/responses/") && sourceJsonPath.contains("/headers/"))
                ) {
                String[] pathPieces = sourceJsonPath.split("/");
                if (pathPieces[2].equals("headers")) {
                    // #/components/headers/someHeader/schema -> SomeHeaderSchema
                    usedKey =  camelize(pathPieces[3])+ camelize(usedKey);
                } else if (sourceJsonPath.startsWith("#/components/responses/") && sourceJsonPath.contains("/headers/")) {
                    // #/components/response/SomeResponse/headers/someHeader/schema
                    usedKey =  camelize(pathPieces[5])+ camelize(usedKey);
                } else {
                    // #/paths/path/verb/responses/SomeResponse/headers/someHeader/schema
                    usedKey =  camelize(pathPieces[7])+ camelize(usedKey);
                }
            }
        }

        HashMap<String, Integer> keyToQty = sourceJsonPathToKeyToQty.getOrDefault(sourceJsonPath, new HashMap<>());
        if (useCache) {
            if (!sourceJsonPathToKeyToQty.containsKey(sourceJsonPath)) {
                sourceJsonPathToKeyToQty.put(sourceJsonPath, keyToQty);
            }
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

        if (useCache) {
            Integer qty = keyToQty.getOrDefault(usedKey, 0);
            qty += 1;
            keyToQty.put(usedKey, qty);
            String suffix = "";
            if (qty > 1) {
                Integer schemaNumber = qty-1;
                suffix = schemaNumber.toString();
            }
            if (qty == 1 && sourceJsonPath.endsWith("/" + name)) {
                schemaJsonPathToModelName.put(sourceJsonPath, usedKey);
            }
            usedKey = usedKey + suffix;
            return usedKey;
        }
        return usedKey;
    }

    @Override
    public String getSchemaFilename(String jsonPath) {
        String modelName = schemaJsonPathToModelName.get(jsonPath);
        if (modelName == null) {
            String[] pathPieces = jsonPath.split("/");
            return getSchemaCamelCaseName(pathPieces[pathPieces.length-1], jsonPath, false);
        }
        return modelName;
    }

    protected CodegenKey getContainerJsonPathPiece(String expectedComponentType, String currentJsonPath, String sourceJsonPath) {
        return getJsonPathPiece(expectedComponentType, currentJsonPath, sourceJsonPath);
    }

    @Override
    public String toParameterFilename(String name, String jsonPath) {
        // adds prefix parameter_ onto the result so modules do not start with _
        try {
            Integer.parseInt(name);
            // for parameters in path, or an endpoint
            return "parameter" + name;
        } catch (NumberFormatException nfe) {
            // for header parameters in responses
            return toModuleFilename(name, null);
        }
    }

    private String toSchemaRefClass(String ref, String sourceJsonPath) {
        int schemaSuffix = 1;
        String[] refPieces = ref.split("/");
        if (ref.equals(sourceJsonPath)) {
            // self reference, no import needed
            if (ref.startsWith("#/components/schemas/") && refPieces.length == 4) {
                return getSchemaFilename(ref)+schemaSuffix;
            }
            Set<String> httpMethods = new HashSet<>(Arrays.asList("post", "put", "patch", "get", "delete", "trace", "options"));
            boolean requestBodyCase = (
                    refPieces.length == 8 &&
                            refPieces[1].equals("paths") &&
                            httpMethods.contains(refPieces[3]) &&
                            refPieces[4].equals("requestBody") &&
                            refPieces[5].equals("content") &&
                            refPieces[7].equals("schema")
            );
            if (requestBodyCase) {
                String contentType = ModelUtils.decodeSlashes(refPieces[6]);
                // the code knows that content-type are never valid python names
                return toVarName(contentType);
            }
            return null;
        }
        if (sourceJsonPath != null && ref.startsWith(sourceJsonPath + "/")) {
            // internal in-schema reference, no import needed
            // TODO handle this in the future
            if (getFilepath(sourceJsonPath).equals(getFilepath(ref))) {
                // TODO ensure that getFilepath returns the same file for somePath/get/QueryParameters
                // TODO ensure that getFilepath returns the same file for schemas/SomeSchema...
                return null;
            }
        }
        return getSchemaFilename(ref)+schemaSuffix;
    }

    private String toRequestBodyRefClass(String ref) {
        String[] refPieces = ref.split("/");
        if (ref.startsWith("#/components/requestBodies/") && refPieces.length == 4) {
            return toModelName(refPieces[3], ref);
        }
        return null;
    }

    private String toResponseRefClass(String ref) {
        String[] refPieces = ref.split("/");
        if (ref.startsWith("#/components/responses/") && refPieces.length == 4) {
            return toModelName(refPieces[3], ref);
        }
        return null;
    }

    private String toHeaderRefClass(String ref) {
        String[] refPieces = ref.split("/");
        if (ref.startsWith("#/components/headers/") && refPieces.length == 4) {
            return toModelName(refPieces[3], ref);
        }
        return null;
    }

    private String toParameterRefClass(String ref) {
        String[] refPieces = ref.split("/");
        if (ref.startsWith("#/components/parameters/") && refPieces.length == 4) {
            return toModelName(refPieces[3], ref);
        }
        return null;
    }

    private String toSecuritySchemesRefClass(String ref) {
        String[] refPieces = ref.split("/");
        if (ref.startsWith("#/components/securitySchemes/") && refPieces.length == 4) {
            return toModelName(refPieces[3], ref);
        }
        return null;
    }

    @Override
    public String toRefClass(String ref, String sourceJsonPath, String expectedComponentType) {
        if (ref == null) {
            return null;
        }
        switch (expectedComponentType) {
            case "schemas":
                return toSchemaRefClass(ref, sourceJsonPath);
            case "requestBodies":
                return toRequestBodyRefClass(ref);
            case "responses":
                return toResponseRefClass(ref);
            case "headers":
                return toHeaderRefClass(ref);
            case "parameters":
                return toParameterRefClass(ref);
            case "securitySchemes":
                return toSecuritySchemesRefClass(ref);
        }
        return null;
    }

    @Override
    public String getRefModuleLocation(String ref) {
        // modules are always in a package one above them, so strip off the last jsonPath fragment
        String smallerRef = ref.substring(0, ref.lastIndexOf("/"));
        String filePath = getFilepath(smallerRef);
        String prefix = outputFolder + File.separatorChar + "src" + File.separatorChar + "main" + File.separatorChar + "java" + File.separatorChar;
        String localFilepath = filePath.substring(prefix.length(), filePath.length());
        return localFilepath.replaceAll(String.valueOf(File.separatorChar), ".");
    }

    @Override
    protected boolean needToImport(String type) {
        return true;
    }

    private Set<String> getDeeperImports(String sourceJsonPath, CodegenSchema schema) {
        /*
        When a map or list schema contains custom items or properties/additionalProperties
        Those output types describe List or Map input types, which may be refs
        All of those refs are referenced and Java types are needed because they are defined in inputs
         */
        Set<String> imports = new HashSet<>();
        if (schema.jsonPath != null && schema.jsonPath.equals(sourceJsonPath)) {
            return imports;
        }
        if (schema.refInfo != null && schema.refInfo.refModule != null) {
            CodegenSchema ref = schema.refInfo.ref;
            if (ref.refInfo != null && schema.refInfo.refModule != null && deepestRefSchemaImportNeeded) {
                CodegenRefInfo<CodegenSchema> deepestRefInfo = schema.refInfo;
                while (deepestRefInfo.ref.refInfo != null) {
                    deepestRefInfo = deepestRefInfo.ref.refInfo;
                }
                imports.addAll(getDeeperImports(sourceJsonPath, deepestRefInfo.ref));
            } else {
                imports.addAll(getDeeperImports(sourceJsonPath, ref));
            }
        }
        if (schema.types != null) {
            if (schema.types.contains("array")) {
                imports.add("import java.util.List;");
                imports.add("import "+packageName + ".schemas.validation.FrozenList;");
                if (schema.items != null) {
                    imports.addAll(getDeeperImports(sourceJsonPath, schema.items));
                }
            }
            if (schema.types.contains("object")) {
                imports.add("import java.util.Map;");
                imports.add("import "+packageName + ".schemas.validation.FrozenMap;");
                if (schema.mapValueSchema != null) {
                    imports.addAll(getDeeperImports(sourceJsonPath, schema.mapValueSchema));
                }
            }
        }
        return imports;
    }

    @Override
    public Set<String> getImports(String sourceJsonPath, CodegenSchema schema, FeatureSet featureSet) {
        Set<String> imports = new HashSet<>();
        // Note: discriminator imports do not need to be added for Java
        // because they are in the package namespace in components.schemas
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
        if (!sourceJsonPath.startsWith("#/components/schemas/") && schema.refInfo != null && schema.refInfo.refModule != null && featureSet.getSchemaSupportFeatures().contains(SchemaFeature.Ref)) {
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
        if (schema.refInfo != null) {
            // todo remove this when ref is supported with adjacent properties
            imports.add("import org.checkerframework.checker.nullness.qual.Nullable;");
            return imports;
        }
        if (schema.types != null) {
            if (schema.types.size() == 1) {
                if (schema.types.contains("boolean")) {
                    if (schema.isSimpleBoolean()) {
                        imports.add("import "+packageName + ".schemas.BooleanJsonSchema;");
                        imports.add("import org.checkerframework.checker.nullness.qual.Nullable;");
                    } else {
                        addCustomSchemaImports(imports, schema);
                        imports.add("import java.util.Set;");
                        addBooleanSchemaImports(imports, schema);
                    }
                } else if (schema.types.contains("null")) {
                    if (schema.isSimpleNull()) {
                        imports.add("import "+packageName + ".schemas.NullJsonSchema;");
                        imports.add("import org.checkerframework.checker.nullness.qual.Nullable;");
                    } else {
                        addCustomSchemaImports(imports, schema);
                        imports.add("import java.util.Set;");
                        addNullSchemaImports(imports, schema);
                    }
                } else if (schema.types.contains("integer")) {
                    if (schema.isSimpleInteger()) {
                        imports.add("import org.checkerframework.checker.nullness.qual.Nullable;");
                        if (schema.format == null) {
                            imports.add("import "+packageName + ".schemas.IntJsonSchema;");
                        } else if (schema.format.equals("int32")) {
                            imports.add("import "+packageName + ".schemas.Int32JsonSchema;");
                        } else if (schema.format.equals("int64")) {
                            imports.add("import "+packageName + ".schemas.Int64JsonSchema;");
                        }
                    } else {
                        addCustomSchemaImports(imports, schema);
                        imports.add("import java.util.Set;");
                        addNumberSchemaImports(imports, schema);
                    }
                } else if (schema.types.contains("number")) {
                    if (schema.isSimpleNumber()) {
                        imports.add("import org.checkerframework.checker.nullness.qual.Nullable;");
                        if (schema.format == null) {
                            imports.add("import "+packageName + ".schemas.NumberJsonSchema;");
                        } else if (schema.format.equals("int32")) {
                            imports.add("import "+packageName + ".schemas.Int32JsonSchema;");
                        } else if (schema.format.equals("int64")) {
                            imports.add("import "+packageName + ".schemas.Int64JsonSchema;");
                        } else if (schema.format.equals("float")) {
                            imports.add("import "+packageName + ".schemas.FloatJsonSchema;");
                        } else if (schema.format.equals("double")) {
                            imports.add("import "+packageName + ".schemas.DoubleJsonSchema;");
                        }
                    } else {
                        addCustomSchemaImports(imports, schema);
                        imports.add("import java.util.Set;");
                        addNumberSchemaImports(imports, schema);
                    }
                } else if (schema.types.contains("string")) {
                    if (schema.isSimpleString()) {
                        imports.add("import org.checkerframework.checker.nullness.qual.Nullable;");
                        if (schema.format == null) {
                            imports.add("import "+packageName + ".schemas.StringJsonSchema;");
                        } else if (schema.format.equals("date")) {
                            imports.add("import "+packageName + ".schemas.DateJsonSchema;");
                        } else if (schema.format.equals("date-time")) {
                            imports.add("import "+packageName + ".schemas.DateTimeJsonSchema;");
                        } else if (schema.format.equals("number")) {
                            imports.add("import "+packageName + ".schemas.DecimalJsonSchema;");
                        } else if (schema.format.equals("uuid")) {
                            imports.add("import "+packageName + ".schemas.UuidJsonSchema;");
                        } else if (schema.format.equals("byte")) {
                            // todo implement this
                            imports.add("import "+packageName + ".schemas.StringJsonSchema;");
                        } else if (schema.format.equals("binary")) {
                            // todo implement this
                            imports.add("import "+packageName + ".schemas.StringJsonSchema;");
                        }
                    } else {
                        addCustomSchemaImports(imports, schema);
                        imports.add("import java.util.Set;");
                        addStringSchemaImports(imports, schema);
                    }
                } else if (schema.types.contains("object")) {
                    if (schema.isSimpleObject()) {
                        imports.add("import org.checkerframework.checker.nullness.qual.Nullable;");
                        imports.add("import "+packageName + ".schemas.MapJsonSchema;");
                        // add this in case the 1 higher schema is an array of FrozenMap
                        imports.add("import "+packageName + ".schemas.validation.FrozenMap;");
                    } else {
                        addCustomSchemaImports(imports, schema);
                        imports.add("import java.util.Set;");
                        addMapSchemaImports(imports, schema);
                        if (schema.mapValueSchema != null) {
                            imports.addAll(getDeeperImports(sourceJsonPath, schema.mapValueSchema));
                        }
                    }
                } else if (schema.types.contains("array")) {
                    if (schema.isSimpleArray()) {
                        imports.add("import org.checkerframework.checker.nullness.qual.Nullable;");
                        imports.add("import "+packageName + ".schemas.ListJsonSchema;");
                        // add this in case the 1 higher schema is a map of FrozenList
                        imports.add("import "+packageName + ".schemas.validation.FrozenList;");
                    } else {
                        addCustomSchemaImports(imports, schema);
                        imports.add("import java.util.Set;");
                        addListSchemaImports(imports, schema);
                        if (schema.items != null) {
                            imports.addAll(getDeeperImports(sourceJsonPath, schema.items));
                        }
                    }
                }
            } else if (schema.types.size() > 1) {
                addCustomSchemaImports(imports, schema);
                imports.add("import java.util.Set;");
                if (schema.types.contains("string")) {
                    addStringSchemaImports(imports, schema);
                }
                if (schema.types.contains("array")) {
                    addListSchemaImports(imports, schema);
                }
                if (schema.types.contains("object")) {
                    addMapSchemaImports(imports, schema);
                }
                if (schema.types.contains("number") || schema.types.contains("integer")) {
                    addNumberSchemaImports(imports, schema);
                }
                if (schema.types.contains("boolean")) {
                    addBooleanSchemaImports(imports, schema);
                }
                if (schema.types.contains("null")) {
                    addNullSchemaImports(imports, schema);
                }
                if (schema.mapValueSchema != null) {
                    imports.addAll(getDeeperImports(sourceJsonPath, schema.mapValueSchema));
                }
                if (schema.items != null) {
                    imports.addAll(getDeeperImports(sourceJsonPath, schema.items));
                }
            }
        } else {
            // no types
            if (schema.isBooleanSchemaTrue) {
                imports.add("import org.checkerframework.checker.nullness.qual.Nullable;");
                imports.add("import "+packageName + ".schemas.AnyTypeJsonSchema;");
            } else if (schema.isBooleanSchemaFalse) {
                imports.add("import org.checkerframework.checker.nullness.qual.Nullable;");
                imports.add("import "+packageName + ".schemas.NotAnyTypeJsonSchema;");
            } else if (schema.isSimpleAnyType()) {
                imports.add("import org.checkerframework.checker.nullness.qual.Nullable;");
                imports.add("import "+packageName + ".schemas.AnyTypeJsonSchema;");
            } else {
                addCustomSchemaImports(imports, schema);
                imports.add("import java.time.LocalDate;");
                imports.add("import java.time.ZonedDateTime;");
                imports.add("import java.util.UUID;");
                imports.add("import "+packageName + ".schemas.validation.FrozenList;");
                imports.add("import java.util.List;");
                imports.add("import "+packageName + ".schemas.validation.FrozenMap;");
                imports.add("import java.util.Map;");
                imports.add("import "+packageName + ".schemas.validation.NullSchemaValidator;");
                imports.add("import "+packageName + ".schemas.validation.BooleanSchemaValidator;");
                imports.add("import "+packageName + ".schemas.validation.NumberSchemaValidator;");
                imports.add("import "+packageName + ".schemas.validation.StringSchemaValidator;");
                imports.add("import "+packageName + ".schemas.validation.ListSchemaValidator;");
                imports.add("import "+packageName + ".schemas.validation.MapSchemaValidator;");
                imports.add("import java.util.LinkedHashMap;");
                imports.add("import java.util.ArrayList;"); // for validate
                addPropertiesValidator(schema, imports);
                addRequiredValidator(schema, imports);
                addAllOfValidator(schema, imports);
                addAnyOfValidator(schema, imports);
                addOneOfValidator(schema, imports);
                addEnumValidator(schema, imports);
                addPatternValidator(schema, imports);
                addMultipleOfValidator(schema, imports);
                if (schema.mapValueSchema != null) {
                    imports.addAll(getDeeperImports(sourceJsonPath, schema.mapValueSchema));
                }
                if (schema.items != null) {
                    imports.addAll(getDeeperImports(sourceJsonPath, schema.items));
                }
                if (schema.additionalProperties == null || !schema.additionalProperties.isBooleanSchemaFalse) {
                    imports.add("import "+packageName + ".exceptions.UnsetPropertyException;");
                    imports.add("import "+packageName + ".exceptions.InvalidAdditionalPropertyException;");
                }
            }
        }
        return imports;
    }

    private void addPatternValidator(CodegenSchema schema, Set<String> imports) {
        if (schema.patternInfo != null) {
            imports.add("import java.util.regex.Pattern;");
        }
    }

    private void addEnumValidator(CodegenSchema schema, Set<String> imports) {
        if (schema.enumInfo != null) {
            imports.add("import "+packageName + ".schemas.SetMaker;");
            if (schema.enumInfo.typeToValues.containsKey("null")) {
                imports.add("import "+packageName + ".schemas.validation.NullEnumValidator;");
                imports.add("import "+packageName + ".schemas.validation.NullValueMethod;");
            }
            if (schema.enumInfo.typeToValues.containsKey("boolean")) {
                imports.add("import "+packageName + ".schemas.validation.BooleanEnumValidator;");
                imports.add("import "+packageName + ".schemas.validation.BooleanValueMethod;");
            }
            if (schema.enumInfo.typeToValues.containsKey("string")) {
                imports.add("import "+packageName + ".schemas.validation.StringEnumValidator;");
                imports.add("import "+packageName + ".schemas.validation.StringValueMethod;");
            }
            if (schema.enumInfo.typeToValues.containsKey("Integer")) {
                imports.add("import java.math.BigDecimal;");
                imports.add("import "+packageName + ".schemas.validation.IntegerEnumValidator;");
                imports.add("import "+packageName + ".schemas.validation.IntegerValueMethod;");
            }
            if (schema.enumInfo.typeToValues.containsKey("Long")) {
                imports.add("import java.math.BigDecimal;");
                imports.add("import "+packageName + ".schemas.validation.LongEnumValidator;");
                imports.add("import "+packageName + ".schemas.validation.LongValueMethod;");
            }
            if (schema.enumInfo.typeToValues.containsKey("Float")) {
                imports.add("import java.math.BigDecimal;");
                imports.add("import "+packageName + ".schemas.validation.FloatEnumValidator;");
                imports.add("import "+packageName + ".schemas.validation.FloatValueMethod;");
            }
            if (schema.enumInfo.typeToValues.containsKey("Double")) {
                imports.add("import java.math.BigDecimal;");
                imports.add("import "+packageName + ".schemas.validation.DoubleEnumValidator;");
                imports.add("import "+packageName + ".schemas.validation.DoubleValueMethod;");
            }
        }
    }

    private void addPropertiesValidator(CodegenSchema schema, Set<String> imports) {
        if (schema.properties != null) {
            imports.add("import "+packageName + ".schemas.validation.PropertyEntry;");
            imports.add("import java.util.Map;");
            imports.add("import java.util.Set;");
            imports.add("import "+packageName + ".exceptions.UnsetPropertyException;");
        }
    }

    private void addAllOfValidator(CodegenSchema schema, Set<String> imports) {
        if (schema.allOf != null) {
            imports.add("import java.util.List;");
        }
    }

    private void addAnyOfValidator(CodegenSchema schema, Set<String> imports) {
        if (schema.anyOf != null) {
            imports.add("import java.util.List;");
        }
    }

    private void addOneOfValidator(CodegenSchema schema, Set<String> imports) {
        if (schema.oneOf != null) {
            imports.add("import java.util.List;");
        }
    }

    private void addRequiredValidator(CodegenSchema schema, Set<String> imports) {
        if (schema.requiredProperties != null) {
            imports.add("import java.util.Set;");
        }
    }

    private void addMultipleOfValidator(CodegenSchema schema, Set<String> imports) {
        if (schema.multipleOf != null) {
            imports.add("import java.math.BigDecimal;");
        }
    }

    private void addCustomSchemaImports(Set<String> imports, CodegenSchema schema) {
        imports.add("import " + packageName + ".schemas.validation.JsonSchema;");
        imports.add("import " + packageName + ".schemas.validation.JsonSchemaInfo;");
        imports.add("import "+packageName + ".configurations.SchemaConfiguration;");
        imports.add("import "+packageName + ".exceptions.ValidationException;");
        imports.add("import "+packageName + ".exceptions.InvalidTypeException;"); // for castToAllowedTypes
        imports.add("import java.util.Set;"); // for validate
        imports.add("import java.util.HashSet;"); // for validate
        imports.add("import java.util.Objects;"); // for validate
        imports.add("import java.util.LinkedHashSet;"); // for validate
        imports.add("import java.util.List;"); // for castToAllowedTypes
        imports.add("import "+packageName + ".schemas.validation.PathToSchemasMap;"); // for getNewInstance
        imports.add("import "+packageName + ".schemas.validation.ValidationMetadata;"); // for getNewInstance
        imports.add("import "+packageName + ".configurations.JsonSchemaKeywordFlags;"); // for getNewInstance
        imports.add("import org.checkerframework.checker.nullness.qual.Nullable;");
    }

    private void addBooleanSchemaImports(Set<String> imports, CodegenSchema schema) {
        imports.add("import " + packageName + ".schemas.validation.BooleanSchemaValidator;");
        addAllOfValidator(schema, imports);
        addAnyOfValidator(schema, imports);
        addOneOfValidator(schema, imports);
        addEnumValidator(schema, imports);
    }

    private void addNullSchemaImports(Set<String> imports, CodegenSchema schema) {
        imports.add("import " + packageName + ".schemas.validation.NullSchemaValidator;");
        addAllOfValidator(schema, imports);
        addAnyOfValidator(schema, imports);
        addOneOfValidator(schema, imports);
        addEnumValidator(schema, imports);
    }

    private void addMapSchemaImports(Set<String> imports, CodegenSchema schema) {
        imports.add("import " + packageName + ".schemas.validation.MapSchemaValidator;");
        imports.add("import "+packageName + ".schemas.validation.FrozenMap;");
        imports.add("import java.util.Map;");
        imports.add("import java.util.ArrayList;"); // for castToAllowedTypes
        imports.add("import java.util.LinkedHashMap;");
        addRequiredValidator(schema, imports);
        addPropertiesValidator(schema, imports);
        addAllOfValidator(schema, imports);
        addAnyOfValidator(schema, imports);
        addOneOfValidator(schema, imports);
        if (schema.additionalProperties == null || !schema.additionalProperties.isBooleanSchemaFalse) {
            imports.add("import "+packageName + ".exceptions.UnsetPropertyException;");
            imports.add("import "+packageName + ".exceptions.InvalidAdditionalPropertyException;");
        }
    }

    private void addListSchemaImports(Set<String> imports, CodegenSchema schema) {
        imports.add("import " + packageName + ".schemas.validation.ListSchemaValidator;");
        imports.add("import "+packageName + ".schemas.validation.FrozenList;");
        imports.add("import java.util.List;");
        imports.add("import java.util.ArrayList;"); // for castToAllowedTypes
        imports.add("import java.util.LinkedHashMap;");
        addAllOfValidator(schema, imports);
        addAnyOfValidator(schema, imports);
        addOneOfValidator(schema, imports);
    }

    private void addNumberSchemaImports(Set<String> imports, CodegenSchema schema) {
        imports.add("import " + packageName + ".schemas.validation.NumberSchemaValidator;");
        addAllOfValidator(schema, imports);
        addAnyOfValidator(schema, imports);
        addOneOfValidator(schema, imports);
        addEnumValidator(schema, imports);
        addMultipleOfValidator(schema, imports);
    }

    private void addStringSchemaImports(Set<String> imports, CodegenSchema schema) {
        if (schema.format != null) {
            if (schema.format.equals("date")) {
                imports.add("import java.time.LocalDate;");
            } else if (schema.format.equals("date-time")) {
                imports.add("import java.time.ZonedDateTime;");
            } else if (schema.format.equals("uuid")) {
                imports.add("import java.util.UUID;");
            }
        }
        imports.add("import " + packageName + ".schemas.validation.StringSchemaValidator;");
        addAllOfValidator(schema, imports);
        addAnyOfValidator(schema, imports);
        addOneOfValidator(schema, imports);
        addEnumValidator(schema, imports);
        addPatternValidator(schema, imports);
    }


    @Override
    public String getImport(CodegenRefInfo refInfo) {
        String prefix = "import " + packageName + ".components.";
        if (refInfo.ref instanceof CodegenSchema) {
            if (refInfo.refModuleAlias == null) {
                return "import " + refInfo.refModuleLocation + "." + refInfo.refModule + ";";
            } else {
                return "import " + refInfo.refModuleLocation + " import " + refInfo.refModule + " as " + refInfo.refModuleAlias + ";";
            }
        } else if (refInfo.ref instanceof CodegenRequestBody) {
            return prefix + "requestbodies." + refInfo.refModule + ";";
        } else if (refInfo.ref instanceof CodegenHeader) {
            return prefix + "headers." + refInfo.refModule + ";";
        } else if (refInfo.ref instanceof CodegenResponse) {
            return prefix + "responses." + refInfo.refModule + ";";
        } else if (refInfo.ref instanceof CodegenParameter) {
            return prefix + "parameters." + refInfo.refModule + ";";
        } else if (refInfo.ref instanceof CodegenSecurityScheme) {
            return prefix + "securityschemes." + refInfo.refModule + ";";
        }
        return null;
    }

    protected String getModuleLocation(String ref) {
        String filePath = getFilepath(ref);
        String prefix = outputFolder + File.separatorChar + "src" + File.separatorChar + "main" + File.separatorChar + "java" + File.separatorChar;
        String localFilepath = filePath.substring(prefix.length());
        return localFilepath.replaceAll(String.valueOf(File.separatorChar), ".");
    }

    @Override
    public String getTestFilepath(String jsonPath) {
        String[] pathPieces = jsonPath.split("/");
        pathPieces[0] = outputFolder + File.separatorChar + testPackagePath();
        if (jsonPath.startsWith("#/components")) {
            // #/components/schemas/someSchema
            updateComponentsFilepath(pathPieces);
            if (pathPieces.length == 4) {
                int lastIndex = pathPieces.length - 1;
                pathPieces[lastIndex] = pathPieces[lastIndex] + "Test";
            }
        }
        List<String> finalPathPieces = Arrays.stream(pathPieces)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        return String.join(File.separator, finalPathPieces);
    }

    /**
     * Return the sanitized variable name for enum
     *
     * @param value    enum variable name
     * @param prop property
     * @return the sanitized variable name for enum
     */
    @Override
    public String toEnumVarName(String value, Schema prop) {
        // our enum var names are keys in a python dict, so change spaces to underscores
        if (value.length() == 0) {
            return "EMPTY";
        }
        if (value.equals("null")) {
            return "NONE";
        }

        // value is int or float
        String intPattern = "^[-+]?\\d+$";
        String floatPattern = "^[-+]?\\d+\\.\\d+$";
        Boolean intMatch = Pattern.matches(intPattern, value);
        Boolean floatMatch = Pattern.matches(floatPattern, value);
        if (intMatch || floatMatch) {
            String plusSign = "^\\+.+";
            String negSign = "^-.+";
            String enumVarName;
            if (Pattern.matches(plusSign, value)) {
                enumVarName = value.replace("+", "POSITIVE_");
            } else if (Pattern.matches(negSign, value)) {
                enumVarName = value.replace("-", "NEGATIVE_");
            } else {
                enumVarName = "POSITIVE_" + value;
            }
            if (floatMatch) {
                enumVarName = enumVarName.replace(".", "_PT_");
            }
            return enumVarName;
        }

        // every character in value is not allowed
        String valueWithAllowedCharsOnly = value.replaceAll("^\\W+", "");
        if (valueWithAllowedCharsOnly.isEmpty()) {
            StringBuilder usedValueBuilder = new StringBuilder();
            for (int i = 0; i < value.length(); i++){
                char c = value.charAt(i);
                String charName = Character.getName(Character.hashCode(c));
                if (usedValueBuilder.length() > 0) {
                    usedValueBuilder.append("_");
                }
                usedValueBuilder.append(charNameToVarName(charName));
            }
            return usedValueBuilder.toString();
        }

        String usedValue = value;
        // Replace " " with _
        usedValue = usedValue.replaceAll("[ ]+", "_");

        // replace all invalid characters with their character name descriptions
        Pattern nonWordCharPattern = Pattern.compile("\\W+");
        Matcher matcher = nonWordCharPattern.matcher(usedValue);
        Stack<AbstractMap.SimpleEntry<Integer, String>> matchStartToGroup = new Stack<>();
        while (matcher.find()) {
            matchStartToGroup.add(new AbstractMap.SimpleEntry<>(matcher.start(), matcher.group()));
        }
        char underscore = "_".charAt(0);
        while (!matchStartToGroup.isEmpty()) {
            AbstractMap.SimpleEntry<Integer, String> entry = matchStartToGroup.pop();
            Integer startIndex = entry.getKey();
            String match = entry.getValue();
            String prefix = "";
            String suffix = "";
            if (startIndex > 0 && usedValue.charAt(startIndex-1) != underscore) {
                prefix = "_";
            }
            int indexAfter = startIndex + match.length();
            if (startIndex + match.length() < usedValue.length() && usedValue.charAt(indexAfter) != underscore) {
                suffix = "_";
            }
            StringBuilder convertedMatch = new StringBuilder();
            for (int i = 0; i < match.length(); i++) {
                String charName = charNameToVarName(Character.getName(Character.hashCode(match.charAt(i))));
                // todo remove the parens portion of charName here
                convertedMatch.append(charName);
                if (i != match.length() - 1) {
                    convertedMatch.append("_");
                }
            }
            String replacement = prefix + convertedMatch + suffix;
            usedValue = usedValue.substring(0, startIndex) + replacement + usedValue.substring(indexAfter);
        }

        // add camel case underscore
        String regex = "([a-z])([A-Z]+)";
        String regexReplacement = "$1_$2";
        usedValue = usedValue.replaceAll(regex, regexReplacement);

        // uppercase
        usedValue = usedValue.toUpperCase(Locale.ROOT);

        if (usedValue.length() > 1) {
            // remove trailing _
            usedValue = usedValue.replaceAll("_$", "");
        }
        return usedValue;
    }

    @Override
    public Function<CodegenSchema, List<CodegenSchema>> getSchemasFn() {
        Function<CodegenSchema, List<CodegenSchema>> getSchemasFn = codegenSchema -> {
            ArrayList<CodegenSchema> schemasBeforeImports = new ArrayList<>();
            ArrayList<CodegenSchema> schemasAfterImports = new ArrayList<>();
            codegenSchema.getAllSchemas(schemasBeforeImports, schemasAfterImports, 0, true);
            schemasBeforeImports.addAll(schemasAfterImports);
            return schemasBeforeImports;
        };
        return getSchemasFn;
    }

    private void addToTypeToValue(LinkedHashMap<String, LinkedHashMap<EnumValue, String>> typeToValues, EnumValue enumValue, String type, String name) {
        if (!typeToValues.containsKey(type)) {
            typeToValues.put(type, new LinkedHashMap<>());
        }
        typeToValues.get(type).put(enumValue, name);
    }

    protected EnumInfo getEnumInfo(ArrayList<Object> values, Schema schema, String currentJsonPath, String sourceJsonPath, LinkedHashSet<String> types, String classSuffix) {
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
            if (!enumNameToValue.containsKey(usedName)) {
                enumNameToValue.put(usedName, enumValue);
            } else {
                LOGGER.error(
                        "Enum error: two generated enum variable names collide. The values {} and {} generate variable name {} . Please file an issue at https://github.com/openapi-json-schema-tools/openapi-json-schema-generator/issues",
                        enumNameToValue.get(usedName).value,
                        enumValue.value,
                        usedName);
            }
            // typeToValues code
            if ("null".equals(enumValue.type) || "boolean".equals(enumValue.type) || "string".equals(enumValue.type)) {
                addToTypeToValue(typeToValues, enumValue, enumValue.type, usedName);
            } else if (value instanceof Integer) {
                addToTypeToValue(typeToValues, enumValue, "Integer", usedName);
                EnumValue longEnumValue = getEnumValue(Long.parseLong(value.toString()), description);
                addToTypeToValue(typeToValues, longEnumValue, "Long", usedName);
                EnumValue floatEnumValue = getEnumValue(Float.valueOf(value.toString()+".0"), description);
                addToTypeToValue(typeToValues, floatEnumValue, "Float", usedName);
                EnumValue doubleEnumValue = getEnumValue(Double.valueOf(value.toString()+".0"), description);
                addToTypeToValue(typeToValues, doubleEnumValue, "Double", usedName);
            } else if (value instanceof Long) {
                addLongEnum(typeToValues, enumValue, (Long) value, usedName);
            } else if (value instanceof Float) {
                addToTypeToValue(typeToValues, enumValue, "Float", usedName);
                EnumValue doubleEnumValue = getEnumValue(Double.valueOf(value.toString()), description);
                addToTypeToValue(typeToValues, doubleEnumValue, "Double", usedName);
            } else if (value instanceof Double) {
                addDoubleEnum(typeToValues, enumValue, (Double) value, usedName);
            } else if (value instanceof BigDecimal) {
                BigDecimal casValue = (BigDecimal) value;
                boolean isInteger = casValue.signum() == 0 || casValue.scale() <= 0 || casValue.stripTrailingZeros().scale() <= 0;
                if (isInteger) {
                    addLongEnum(typeToValues, enumValue, casValue.longValue(), usedName);
                } else {
                    addDoubleEnum(typeToValues, enumValue, casValue.doubleValue(), usedName);
                }
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

    private void addLongEnum(LinkedHashMap<String, LinkedHashMap<EnumValue, String>> typeToValues, EnumValue enumValue, Long value, String usedName) {
        addToTypeToValue(typeToValues, enumValue, "Long", usedName);
        EnumValue doubleEnumValue = getEnumValue(Double.valueOf(value.toString()+".0"), enumValue.description);
        addToTypeToValue(typeToValues, doubleEnumValue, "Double", usedName);
        if (value >= -2147483648L && value <= 2147483647L) {
            EnumValue integerEnumValue = getEnumValue(Integer.valueOf(value.toString()), enumValue.description);
            addToTypeToValue(typeToValues, integerEnumValue, "Integer", usedName);
            EnumValue floatEnumValue = getEnumValue(Float.valueOf(value.toString()+".0"), enumValue.description);
            addToTypeToValue(typeToValues, floatEnumValue, "Float", usedName);
        }
    }

    private void addDoubleEnum(LinkedHashMap<String, LinkedHashMap<EnumValue, String>> typeToValues, EnumValue enumValue, Double value, String usedName) {
        addToTypeToValue(typeToValues, enumValue, "Double", usedName);
        if (value >= -3.4028234663852886e+38d && value <= 3.4028234663852886e+38d) {
            EnumValue floatEnumValue = getEnumValue(Float.valueOf(value.toString()), enumValue.description);
            addToTypeToValue(typeToValues, floatEnumValue, "Float", usedName);
        }
    }
}
