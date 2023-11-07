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

import org.apache.commons.lang3.StringUtils;
import org.openapijsonschematools.codegen.generators.generatormetadata.Stability;
import org.openapijsonschematools.codegen.generators.models.CliOption;
import org.openapijsonschematools.codegen.common.CodegenConstants;
import org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorType;
import org.openapijsonschematools.codegen.generators.models.VendorExtension;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenSchema;
import org.openapijsonschematools.codegen.templating.SupportingFile;
import org.openapijsonschematools.codegen.generators.features.BeanValidationFeatures;
import org.openapijsonschematools.codegen.generators.features.GzipFeatures;
import org.openapijsonschematools.codegen.generators.features.PerformBeanValidationFeatures;
import org.openapijsonschematools.codegen.templating.mustache.CaseFormatLambda;
import org.openapijsonschematools.codegen.generators.generatormetadata.features.DocumentationFeature;
import org.openapijsonschematools.codegen.common.ProcessUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.*;

import static com.google.common.base.CaseFormat.LOWER_CAMEL;
import static com.google.common.base.CaseFormat.UPPER_UNDERSCORE;
import static java.util.Collections.sort;
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
    public String generatorLanguageVersion() {
        return "17";
    }

    public JavaClientGenerator() {
        super();

        packageName = "org.openapijsonschematools";

        // TODO: Move GlobalFeature.ParameterizedServer to library: jersey after moving featureSet to generatorMetadata
        modifyFeatureSet(features -> features
                .includeDocumentationFeatures(DocumentationFeature.Readme)
        );

        outputFolder = "generated-code" + File.separator + "java";
        embeddedTemplateDir = templateDir = "java";
        invokerPackage = "org.openapijsonschematools.client";
        artifactId = "openapi-java-client";
        apiPackage = "org.openapijsonschematools.client.api";
        modelPackage = "org.openapijsonschematools.client.model";
        rootJavaEEPackage = MICROPROFILE_REST_CLIENT_DEFAULT_ROOT_PACKAGE;

        // cliOptions default redefinition need to be updated
        updateOption(CodegenConstants.INVOKER_PACKAGE, this.getInvokerPackage());
        updateOption(CodegenConstants.ARTIFACT_ID, this.getArtifactId());
        updateOption(CodegenConstants.API_PACKAGE, apiPackage);
        updateOption(CodegenConstants.MODEL_PACKAGE, modelPackage);

        modelTestTemplateFiles.put("model_test.mustache", ".java");

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
        supportingFiles.add(new SupportingFile(
                "src/main/java/org/openapitools/schemas/AnyTypeSchema.hbs",
                packagePath() + File.separatorChar + "schemas",
                "AnyTypeSchema.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/org/openapitools/schemas/CustomIsoparser.hbs",
                packagePath() + File.separatorChar + "schemas",
                "CustomIsoparser.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/org/openapitools/schemas/NullSchema.hbs",
                packagePath() + File.separatorChar + "schemas",
                "NullSchema.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/org/openapitools/schemas/PathToSchemasMap.hbs",
                packagePath() + File.separatorChar + "schemas",
                "PathToSchemasMap.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/org/openapitools/schemas/PathToTypeMap.hbs",
                packagePath() + File.separatorChar + "schemas",
                "PathToTypeMap.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/org/openapitools/schemas/Schema.hbs",
                packagePath() + File.separatorChar + "schemas",
                "Schema.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/org/openapitools/schemas/SchemaValidator.hbs",
                packagePath() + File.separatorChar + "schemas",
                "SchemaValidator.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/org/openapitools/schemas/UnsetAnyTypeSchema.hbs",
                packagePath() + File.separatorChar + "schemas",
                "UnsetAnyTypeSchema.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/org/openapitools/schemas/ValidationMetadata.hbs",
                packagePath() + File.separatorChar + "schemas",
                "ValidationMetadata.java"));
        // tests
        supportingFiles.add(new SupportingFile(
                "src/test/java/org/openapitools/schemas/AnyTypeSchemaTest.hbs",
                testPackagePath() + File.separatorChar + "schemas",
                "AnyTypeSchemaTest.java"));
        supportingFiles.add(new SupportingFile(
                "src/test/java/org/openapitools/schemas/CustomIsoparserTest.hbs",
                testPackagePath() + File.separatorChar + "schemas",
                "CustomIsoparserTest.java"));
        supportingFiles.add(new SupportingFile(
                "src/test/java/org/openapitools/schemas/SchemaValidatorTest.hbs",
                testPackagePath() + File.separatorChar + "schemas",
                "SchemaValidatorTest.java"));

        // keyword validators
        supportingFiles.add(new SupportingFile(
                "src/main/java/org/openapitools/schemas/validators/KeywordValidator.hbs",
                packagePath() + File.separatorChar + "schemas" + File.separatorChar + "validators",
                "KeywordValidator.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/org/openapitools/schemas/validators/TypeValidator.hbs",
                packagePath() + File.separatorChar + "schemas" + File.separatorChar + "validators",
                "TypeValidator.java"));
        // tests
        supportingFiles.add(new SupportingFile(
                "src/test/java/org/openapitools/schemas/validators/TypeValidatorTest.hbs",
                testPackagePath() + File.separatorChar + "schemas" + File.separatorChar + "validators",
                "TypeValidatorTest.java"));

        // configuration
        supportingFiles.add(new SupportingFile(
                "src/main/java/org/openapitools/configurations/JsonSchemaKeywordFlags.hbs",
                packagePath() + File.separatorChar + "configurations",
                "JsonSchemaKeywordFlags.java"));
        supportingFiles.add(new SupportingFile(
                "src/test/java/org/openapitools/configurations/JsonSchemaKeywordFlagsTest.hbs",
                testPackagePath() + File.separatorChar + "configurations",
                "JsonSchemaKeywordFlagsTest.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/org/openapitools/configurations/SchemaConfiguration.hbs",
                packagePath() + File.separatorChar + "configurations",
                "SchemaConfiguration.java"));

//        jsonPathDocTemplateFiles.put(
//                CodegenConstants.JSON_PATH_LOCATION_TYPE.SCHEMA,
//                schemaDocs
//        );
//        jsonPathDocTemplateFiles.put(
//                CodegenConstants.JSON_PATH_LOCATION_TYPE.API_TAG,
//                new HashMap<String, String>() {{
//                    put("api_doc.mustache", ".java");
//                }}
//        );

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
}
