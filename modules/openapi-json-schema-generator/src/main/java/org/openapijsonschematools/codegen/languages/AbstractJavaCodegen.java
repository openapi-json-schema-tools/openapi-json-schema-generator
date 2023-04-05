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

package org.openapijsonschematools.codegen.languages;

import com.google.common.base.Strings;
import com.google.common.collect.Sets;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.PathItem;
import io.swagger.v3.oas.models.examples.Example;
import io.swagger.v3.oas.models.media.*;
import io.swagger.v3.oas.models.parameters.Parameter;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.openapijsonschematools.codegen.CliOption;
import org.openapijsonschematools.codegen.CodegenConfig;
import org.openapijsonschematools.codegen.CodegenConstants;
import org.openapijsonschematools.codegen.model.CodegenPatternInfo;
import org.openapijsonschematools.codegen.model.CodegenSchema;
import org.openapijsonschematools.codegen.DefaultCodegen;
import org.openapijsonschematools.codegen.VendorExtension;
import org.openapijsonschematools.codegen.languages.features.DocumentationProviderFeatures;
import org.openapijsonschematools.codegen.meta.features.ClientModificationFeature;
import org.openapijsonschematools.codegen.meta.features.DocumentationFeature;
import org.openapijsonschematools.codegen.meta.features.GlobalFeature;
import org.openapijsonschematools.codegen.meta.features.SchemaSupportFeature;
import org.openapijsonschematools.codegen.meta.features.SecurityFeature;
import org.openapijsonschematools.codegen.meta.features.WireFormatFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import static org.openapijsonschematools.codegen.utils.StringUtils.*;

public abstract class AbstractJavaCodegen extends DefaultCodegen implements CodegenConfig,
        DocumentationProviderFeatures {

    private final Logger LOGGER = LoggerFactory.getLogger(AbstractJavaCodegen.class);
    private static final String ARTIFACT_VERSION_DEFAULT_VALUE = "1.0.0";

    public static final String FULL_JAVA_UTIL = "fullJavaUtil";
    public static final String DEFAULT_LIBRARY = "<default>";
    public static final String DATE_LIBRARY = "dateLibrary";
    public static final String SUPPORT_ASYNC = "supportAsync";
    public static final String WITH_XML = "withXml";
    public static final String SUPPORT_JAVA6 = "supportJava6";
    public static final String DISABLE_HTML_ESCAPING = "disableHtmlEscaping";
    public static final String BOOLEAN_GETTER_PREFIX = "booleanGetterPrefix";
    public static final String IGNORE_ANYOF_IN_ENUM = "ignoreAnyOfInEnum";
    public static final String ADDITIONAL_MODEL_TYPE_ANNOTATIONS = "additionalModelTypeAnnotations";
    public static final String ADDITIONAL_ENUM_TYPE_ANNOTATIONS = "additionalEnumTypeAnnotations";
    public static final String DISCRIMINATOR_CASE_SENSITIVE = "discriminatorCaseSensitive";
    public static final String OPENAPI_NULLABLE = "openApiNullable";
    public static final String JACKSON = "jackson";
    public static final String TEST_OUTPUT = "testOutput";
    public static final String IMPLICIT_HEADERS = "implicitHeaders";
    public static final String IMPLICIT_HEADERS_REGEX = "implicitHeadersRegex";

    public static final String DEFAULT_TEST_FOLDER = "${project.build.directory}/generated-test-sources/openapi";

    protected String dateLibrary = "java8";
    protected boolean supportAsync = false;
    protected boolean withXml = false;
    protected String invokerPackage = "org.openapijsonschematools";
    protected String groupId = "org.openapijsonschematools";
    protected String artifactId = "openapi-java";
    protected String artifactVersion = null;
    protected String artifactUrl = "https://github.com/openapi-json-schema-tools/openapi-json-schema-generator";
    protected String artifactDescription = "OpenAPI Java";
    protected String developerName = "OpenAPI-Generator Contributors";
    protected String developerEmail = "team@openapijsonschematools.org";
    protected String developerOrganization = "OpenAPITools.org";
    protected String developerOrganizationUrl = "http://openapijsonschematools.org";
    protected String scmConnection = "scm:git:git@github.com:openapi-json-schema-tools/openapi-json-schema-generator.git";
    protected String scmDeveloperConnection = "scm:git:git@github.com:openapi-json-schema-tools/openapi-json-schema-generator.git";
    protected String scmUrl = "https://github.com/openapi-json-schema-tools/openapi-json-schema-generator";
    protected String licenseName = "Unlicense";
    protected String licenseUrl = "http://unlicense.org";
    protected String projectFolder = "src/main";
    protected String projectTestFolder = "src/test";
    // this must not be OS-specific
    protected String sourceFolder = projectFolder + "/java";
    protected String testFolder = projectTestFolder + "/java";
    protected boolean fullJavaUtil;
    protected boolean discriminatorCaseSensitive = true; // True if the discriminator value lookup should be case-sensitive.
    protected String javaUtilPrefix = "";
    protected Boolean serializableModel = false;
    protected boolean serializeBigDecimalAsString = false;
    protected String apiDocPath = "docs/";
    protected String modelDocPath = "docs/";
    protected boolean supportJava6 = false;
    protected boolean disableHtmlEscaping = false;
    protected String booleanGetterPrefix = "get";
    protected boolean ignoreAnyOfInEnum = false;
    protected String parentGroupId = "";
    protected String parentArtifactId = "";
    protected String parentVersion = "";
    protected boolean parentOverridden = false;
    protected List<String> additionalModelTypeAnnotations = new LinkedList<>();
    protected List<String> additionalEnumTypeAnnotations = new LinkedList<>();
    protected boolean openApiNullable = true;
    protected String outputTestFolder = "";
    protected DocumentationProvider documentationProvider;
    protected AnnotationLibrary annotationLibrary;
    protected boolean implicitHeaders = false;
    protected String implicitHeadersRegex = null;

    private Map<String, String> schemaKeyToModelNameCache = new HashMap<>();

    public AbstractJavaCodegen() {
        super();

        modifyFeatureSet(features -> features
                .includeDocumentationFeatures(DocumentationFeature.Readme)
                .wireFormatFeatures(EnumSet.of(WireFormatFeature.JSON, WireFormatFeature.XML))
                .securityFeatures(EnumSet.noneOf(
                        SecurityFeature.class
                ))
                .excludeSchemaSupportFeatures(
                        SchemaSupportFeature.not
                )
                .includeClientModificationFeatures(
                        ClientModificationFeature.BasePath
                )
        );

        supportsInheritance = true;
        jsonPathTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.SCHEMA,
                new HashMap<String, String>() {{
                    put("model.mustache", ".java");
                }}
        );
        jsonPathTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.API_TAG,
                new HashMap<String, String>() {{
                    put("api.mustache", ".java");
                }}
        );
        apiTestTemplateFiles.put("api_test.mustache", ".java");
        HashMap<String, String> schemaDocs = new HashMap<>();
        schemaDocs.put("model_doc.mustache", ".md");
        jsonPathDocTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.SCHEMA,
                schemaDocs
        );
        jsonPathDocTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.API_TAG,
                new HashMap<String, String>() {{
                    put("api_doc.mustache", ".java");
                }}
        );

        hideGenerationTimestamp = false;

        setReservedWordsLowerCase(
                Arrays.asList(
                        // special words
                        "object", "list", "file",
                        // used as internal variables, can collide with parameter names
                        "localVarPath", "localVarQueryParams", "localVarCollectionQueryParams",
                        "localVarHeaderParams", "localVarCookieParams", "localVarFormParams", "localVarPostBody",
                        "localVarAccepts", "localVarAccept", "localVarContentTypes",
                        "localVarContentType", "localVarAuthNames", "localReturnType",
                        "ApiClient", "ApiException", "ApiResponse", "Configuration", "StringUtil",

                        // language reserved words
                        "abstract", "continue", "for", "new", "switch", "assert",
                        "default", "if", "package", "synchronized", "boolean", "do", "goto", "private",
                        "this", "break", "double", "implements", "protected", "throw", "byte", "else",
                        "import", "public", "throws", "case", "enum", "instanceof", "return", "transient",
                        "catch", "extends", "int", "short", "try", "char", "final", "interface", "static",
                        "void", "class", "finally", "long", "strictfp", "volatile", "const", "float",
                        "native", "super", "while", "null")
        );

        languageSpecificPrimitives = Sets.newHashSet("String",
                "boolean",
                "Boolean",
                "Double",
                "Integer",
                "Long",
                "Float",
                "Object",
                "byte[]"
        );
        instantiationTypes.put("array", "ArrayList");
        instantiationTypes.put("set", "LinkedHashSet");
        instantiationTypes.put("map", "HashMap");
        typeMapping.put("date", "Date");
        typeMapping.put("file", "File");
        typeMapping.put("AnyType", "Object");

        importMapping.put("BigDecimal", "java.math.BigDecimal");
        importMapping.put("UUID", "java.util.UUID");
        importMapping.put("URI", "java.net.URI");
        importMapping.put("File", "java.io.File");
        importMapping.put("Date", "java.util.Date");
        importMapping.put("Timestamp", "java.sql.Timestamp");
        importMapping.put("Map", "java.util.Map");
        importMapping.put("HashMap", "java.util.HashMap");
        importMapping.put("Array", "java.util.List");
        importMapping.put("ArrayList", "java.util.ArrayList");
        importMapping.put("List", "java.util.*");
        importMapping.put("Set", "java.util.*");
        importMapping.put("LinkedHashSet", "java.util.LinkedHashSet");
        importMapping.put("DateTime", "org.joda.time.*");
        importMapping.put("LocalDateTime", "org.joda.time.*");
        importMapping.put("LocalDate", "org.joda.time.*");
        importMapping.put("LocalTime", "org.joda.time.*");

        cliOptions.add(new CliOption(CodegenConstants.MODEL_PACKAGE, CodegenConstants.MODEL_PACKAGE_DESC));
        cliOptions.add(new CliOption(CodegenConstants.API_PACKAGE, CodegenConstants.API_PACKAGE_DESC));
        cliOptions.add(new CliOption(CodegenConstants.INVOKER_PACKAGE, CodegenConstants.INVOKER_PACKAGE_DESC).defaultValue(this.getInvokerPackage()));
        cliOptions.add(new CliOption(CodegenConstants.GROUP_ID, CodegenConstants.GROUP_ID_DESC).defaultValue(this.getGroupId()));
        cliOptions.add(new CliOption(CodegenConstants.ARTIFACT_ID, CodegenConstants.ARTIFACT_ID_DESC).defaultValue(this.getArtifactId()));
        cliOptions.add(new CliOption(CodegenConstants.ARTIFACT_VERSION, CodegenConstants.ARTIFACT_VERSION_DESC).defaultValue(ARTIFACT_VERSION_DEFAULT_VALUE));
        cliOptions.add(new CliOption(CodegenConstants.ARTIFACT_URL, CodegenConstants.ARTIFACT_URL_DESC).defaultValue(this.getArtifactUrl()));
        cliOptions.add(new CliOption(CodegenConstants.ARTIFACT_DESCRIPTION, CodegenConstants.ARTIFACT_DESCRIPTION_DESC).defaultValue(this.getArtifactDescription()));
        cliOptions.add(new CliOption(CodegenConstants.SCM_CONNECTION, CodegenConstants.SCM_CONNECTION_DESC).defaultValue(this.getScmConnection()));
        cliOptions.add(new CliOption(CodegenConstants.SCM_DEVELOPER_CONNECTION, CodegenConstants.SCM_DEVELOPER_CONNECTION_DESC).defaultValue(this.getScmDeveloperConnection()));
        cliOptions.add(new CliOption(CodegenConstants.SCM_URL, CodegenConstants.SCM_URL_DESC).defaultValue(this.getScmUrl()));
        cliOptions.add(new CliOption(CodegenConstants.DEVELOPER_NAME, CodegenConstants.DEVELOPER_NAME_DESC).defaultValue(this.getDeveloperName()));
        cliOptions.add(new CliOption(CodegenConstants.DEVELOPER_EMAIL, CodegenConstants.DEVELOPER_EMAIL_DESC).defaultValue(this.getDeveloperEmail()));
        cliOptions.add(new CliOption(CodegenConstants.DEVELOPER_ORGANIZATION, CodegenConstants.DEVELOPER_ORGANIZATION_DESC).defaultValue(this.getDeveloperOrganization()));
        cliOptions.add(new CliOption(CodegenConstants.DEVELOPER_ORGANIZATION_URL, CodegenConstants.DEVELOPER_ORGANIZATION_URL_DESC).defaultValue(this.getDeveloperOrganizationUrl()));
        cliOptions.add(new CliOption(CodegenConstants.LICENSE_NAME, CodegenConstants.LICENSE_NAME_DESC).defaultValue(this.getLicenseName()));
        cliOptions.add(new CliOption(CodegenConstants.LICENSE_URL, CodegenConstants.LICENSE_URL_DESC).defaultValue(this.getLicenseUrl()));
        cliOptions.add(new CliOption(CodegenConstants.SOURCE_FOLDER, CodegenConstants.SOURCE_FOLDER_DESC).defaultValue(this.getSourceFolder()));
        cliOptions.add(CliOption.newBoolean(CodegenConstants.SERIALIZABLE_MODEL, CodegenConstants.SERIALIZABLE_MODEL_DESC, this.getSerializableModel()));
        cliOptions.add(CliOption.newBoolean(CodegenConstants.SERIALIZE_BIG_DECIMAL_AS_STRING, CodegenConstants.SERIALIZE_BIG_DECIMAL_AS_STRING_DESC, serializeBigDecimalAsString));
        cliOptions.add(CliOption.newBoolean(FULL_JAVA_UTIL, "whether to use fully qualified name for classes under java.util. This option only works for Java API client", fullJavaUtil));
        cliOptions.add(CliOption.newBoolean(DISCRIMINATOR_CASE_SENSITIVE, "Whether the discriminator value lookup should be case-sensitive or not. This option only works for Java API client", discriminatorCaseSensitive));
        cliOptions.add(CliOption.newBoolean(CodegenConstants.HIDE_GENERATION_TIMESTAMP, CodegenConstants.HIDE_GENERATION_TIMESTAMP_DESC, this.isHideGenerationTimestamp()));
        cliOptions.add(CliOption.newBoolean(WITH_XML, "whether to include support for application/xml content type and include XML annotations in the model (works with libraries that provide support for JSON and XML)"));

        CliOption dateLibrary = new CliOption(DATE_LIBRARY, "Option. Date library to use").defaultValue(this.getDateLibrary());
        Map<String, String> dateOptions = new HashMap<>();
        dateOptions.put("java8", "Java 8 native JSR310 (preferred for jdk 1.8+)");
        dateOptions.put("java8-localdatetime", "Java 8 using LocalDateTime (for legacy app only)");
        dateOptions.put("joda", "Joda (for legacy app only)");
        dateOptions.put("legacy", "Legacy java.util.Date");
        dateLibrary.setEnum(dateOptions);
        cliOptions.add(dateLibrary);

        cliOptions.add(CliOption.newBoolean(DISABLE_HTML_ESCAPING, "Disable HTML escaping of JSON strings when using gson (needed to avoid problems with byte[] fields)", disableHtmlEscaping));
        cliOptions.add(CliOption.newString(BOOLEAN_GETTER_PREFIX, "Set booleanGetterPrefix").defaultValue(this.getBooleanGetterPrefix()));
        cliOptions.add(CliOption.newBoolean(IGNORE_ANYOF_IN_ENUM, "Ignore anyOf keyword in enum", ignoreAnyOfInEnum));
        cliOptions.add(CliOption.newString(ADDITIONAL_ENUM_TYPE_ANNOTATIONS, "Additional annotations for enum type(class level annotations)"));
        cliOptions.add(CliOption.newString(ADDITIONAL_MODEL_TYPE_ANNOTATIONS, "Additional annotations for model type(class level annotations). List separated by semicolon(;) or new line (Linux or Windows)"));
        cliOptions.add(CliOption.newBoolean(OPENAPI_NULLABLE, "Enable OpenAPI Jackson Nullable library", this.openApiNullable));
        cliOptions.add(CliOption.newBoolean(IMPLICIT_HEADERS, "Skip header parameters in the generated API methods using @ApiImplicitParams annotation.", implicitHeaders));
        cliOptions.add(CliOption.newString(IMPLICIT_HEADERS_REGEX, "Skip header parameters that matches given regex in the generated API methods using @ApiImplicitParams annotation. Note: this parameter is ignored when implicitHeaders=true"));

        cliOptions.add(CliOption.newString(CodegenConstants.PARENT_GROUP_ID, CodegenConstants.PARENT_GROUP_ID_DESC));
        cliOptions.add(CliOption.newString(CodegenConstants.PARENT_ARTIFACT_ID, CodegenConstants.PARENT_ARTIFACT_ID_DESC));
        cliOptions.add(CliOption.newString(CodegenConstants.PARENT_VERSION, CodegenConstants.PARENT_VERSION_DESC));
        CliOption snapShotVersion = CliOption.newString(CodegenConstants.SNAPSHOT_VERSION, CodegenConstants.SNAPSHOT_VERSION_DESC);
        Map<String, String> snapShotVersionOptions = new HashMap<>();
        snapShotVersionOptions.put("true", "Use a SnapShot Version");
        snapShotVersionOptions.put("false", "Use a Release Version");
        snapShotVersion.setEnum(snapShotVersionOptions);
        cliOptions.add(snapShotVersion);
        cliOptions.add(CliOption.newString(TEST_OUTPUT, "Set output folder for models and APIs tests").defaultValue(DEFAULT_TEST_FOLDER));

        if (null != defaultDocumentationProvider()) {
            CliOption documentationProviderCliOption = new CliOption(DOCUMENTATION_PROVIDER,
                    "Select the OpenAPI documentation provider.")
                    .defaultValue(defaultDocumentationProvider().toCliOptValue());
            supportedDocumentationProvider().forEach(dp ->
                    documentationProviderCliOption.addEnum(dp.toCliOptValue(), dp.getDescription()));
            cliOptions.add(documentationProviderCliOption);

            CliOption annotationLibraryCliOption = new CliOption(ANNOTATION_LIBRARY,
                    "Select the complementary documentation annotation library.")
                    .defaultValue(defaultDocumentationProvider().getPreferredAnnotationLibrary().toCliOptValue());
            supportedAnnotationLibraries().forEach(al ->
                    annotationLibraryCliOption.addEnum(al.toCliOptValue(), al.getDescription()));
            cliOptions.add(annotationLibraryCliOption);
        }
    }

    @Override
    public void processOpts() {
        super.processOpts();

        if (null != defaultDocumentationProvider()) {
            documentationProvider = DocumentationProvider.ofCliOption(
                    (String) additionalProperties.getOrDefault(DOCUMENTATION_PROVIDER,
                            defaultDocumentationProvider().toCliOptValue())
            );

            if (!supportedDocumentationProvider().contains(documentationProvider)) {
                String msg = String.format(Locale.ROOT,
                        "The [%s] Documentation Provider is not supported by this generator",
                        documentationProvider.toCliOptValue());
                throw new IllegalArgumentException(msg);
            }

            annotationLibrary = AnnotationLibrary.ofCliOption(
                    (String) additionalProperties.getOrDefault(ANNOTATION_LIBRARY,
                            documentationProvider.getPreferredAnnotationLibrary().toCliOptValue())
            );

            if (!supportedAnnotationLibraries().contains(annotationLibrary)) {
                String msg = String.format(Locale.ROOT, "The Annotation Library [%s] is not supported by this generator",
                        annotationLibrary.toCliOptValue());
                throw new IllegalArgumentException(msg);
            }

            if (!documentationProvider.supportedAnnotationLibraries().contains(annotationLibrary)) {
                String msg = String.format(Locale.ROOT,
                        "The [%s] documentation provider does not support [%s] as complementary annotation library",
                        documentationProvider.toCliOptValue(), annotationLibrary.toCliOptValue());
                throw new IllegalArgumentException(msg);
            }

            additionalProperties.put(DOCUMENTATION_PROVIDER, documentationProvider.toCliOptValue());
            additionalProperties.put(documentationProvider.getPropertyName(), true);
            additionalProperties.put(ANNOTATION_LIBRARY, annotationLibrary.toCliOptValue());
            additionalProperties.put(annotationLibrary.getPropertyName(), true);
        } else {
            additionalProperties.put(DOCUMENTATION_PROVIDER, DocumentationProvider.NONE);
            additionalProperties.put(ANNOTATION_LIBRARY, AnnotationLibrary.NONE);
        }


        if (StringUtils.isEmpty(System.getenv("JAVA_POST_PROCESS_FILE"))) {
            LOGGER.info("Environment variable JAVA_POST_PROCESS_FILE not defined so the Java code may not be properly formatted. To define it, try 'export JAVA_POST_PROCESS_FILE=\"/usr/local/bin/clang-format -i\"' (Linux/Mac)");
            LOGGER.info("NOTE: To enable file post-processing, 'enablePostProcessFile' must be set to `true` (--enable-post-process-file for CLI).");
        }

        if (additionalProperties.containsKey(SUPPORT_JAVA6)) {
            this.setSupportJava6(Boolean.parseBoolean(additionalProperties.get(SUPPORT_JAVA6).toString()));
        }
        additionalProperties.put(SUPPORT_JAVA6, supportJava6);

        if (additionalProperties.containsKey(DISABLE_HTML_ESCAPING)) {
            this.setDisableHtmlEscaping(Boolean.parseBoolean(additionalProperties.get(DISABLE_HTML_ESCAPING).toString()));
        }
        additionalProperties.put(DISABLE_HTML_ESCAPING, disableHtmlEscaping);

        if (additionalProperties.containsKey(BOOLEAN_GETTER_PREFIX)) {
            this.setBooleanGetterPrefix(additionalProperties.get(BOOLEAN_GETTER_PREFIX).toString());
        }
        additionalProperties.put(BOOLEAN_GETTER_PREFIX, booleanGetterPrefix);

        if (additionalProperties.containsKey(IGNORE_ANYOF_IN_ENUM)) {
            this.setIgnoreAnyOfInEnum(Boolean.parseBoolean(additionalProperties.get(IGNORE_ANYOF_IN_ENUM).toString()));
        }
        additionalProperties.put(IGNORE_ANYOF_IN_ENUM, ignoreAnyOfInEnum);

        if (additionalProperties.containsKey(ADDITIONAL_MODEL_TYPE_ANNOTATIONS)) {
            String additionalAnnotationsList = additionalProperties.get(ADDITIONAL_MODEL_TYPE_ANNOTATIONS).toString();
            this.setAdditionalModelTypeAnnotations(Arrays.asList(additionalAnnotationsList.trim().split("\\s*(;|\\r?\\n)\\s*")));
        }

        if (additionalProperties.containsKey(ADDITIONAL_ENUM_TYPE_ANNOTATIONS)) {
            String additionalAnnotationsList = additionalProperties.get(ADDITIONAL_ENUM_TYPE_ANNOTATIONS).toString();

            this.setAdditionalEnumTypeAnnotations(Arrays.asList(additionalAnnotationsList.split(";")));
        }

        if (additionalProperties.containsKey(CodegenConstants.INVOKER_PACKAGE)) {
            this.setInvokerPackage((String) additionalProperties.get(CodegenConstants.INVOKER_PACKAGE));
        } else if (additionalProperties.containsKey(CodegenConstants.API_PACKAGE)) {
            // guess from api package
            String derivedInvokerPackage = deriveInvokerPackageName((String) additionalProperties.get(CodegenConstants.API_PACKAGE));
            this.additionalProperties.put(CodegenConstants.INVOKER_PACKAGE, derivedInvokerPackage);
            this.setInvokerPackage((String) additionalProperties.get(CodegenConstants.INVOKER_PACKAGE));
            LOGGER.info("Invoker Package Name, originally not set, is now derived from api package name: {}", derivedInvokerPackage);
        } else if (additionalProperties.containsKey(CodegenConstants.MODEL_PACKAGE)) {
            // guess from model package
            String derivedInvokerPackage = deriveInvokerPackageName((String) additionalProperties.get(CodegenConstants.MODEL_PACKAGE));
            this.additionalProperties.put(CodegenConstants.INVOKER_PACKAGE, derivedInvokerPackage);
            this.setInvokerPackage((String) additionalProperties.get(CodegenConstants.INVOKER_PACKAGE));
            LOGGER.info("Invoker Package Name, originally not set, is now derived from model package name: {}",
                    derivedInvokerPackage);
        } else {
            //not set, use default to be passed to template
            additionalProperties.put(CodegenConstants.INVOKER_PACKAGE, invokerPackage);
        }

        if (!additionalProperties.containsKey(CodegenConstants.MODEL_PACKAGE)) {
            additionalProperties.put(CodegenConstants.MODEL_PACKAGE, modelPackage);
        }

        if (!additionalProperties.containsKey(CodegenConstants.API_PACKAGE)) {
            additionalProperties.put(CodegenConstants.API_PACKAGE, apiPackage);
        }

        if (additionalProperties.containsKey(CodegenConstants.GROUP_ID)) {
            this.setGroupId((String) additionalProperties.get(CodegenConstants.GROUP_ID));
        } else {
            //not set, use to be passed to template
            additionalProperties.put(CodegenConstants.GROUP_ID, groupId);
        }

        if (additionalProperties.containsKey(CodegenConstants.ARTIFACT_ID)) {
            this.setArtifactId((String) additionalProperties.get(CodegenConstants.ARTIFACT_ID));
        } else {
            //not set, use to be passed to template
            additionalProperties.put(CodegenConstants.ARTIFACT_ID, artifactId);
        }

        if (additionalProperties.containsKey(CodegenConstants.ARTIFACT_URL)) {
            this.setArtifactUrl((String) additionalProperties.get(CodegenConstants.ARTIFACT_URL));
        } else {
            additionalProperties.put(CodegenConstants.ARTIFACT_URL, artifactUrl);
        }

        if (additionalProperties.containsKey(CodegenConstants.ARTIFACT_DESCRIPTION)) {
            this.setArtifactDescription((String) additionalProperties.get(CodegenConstants.ARTIFACT_DESCRIPTION));
        } else {
            additionalProperties.put(CodegenConstants.ARTIFACT_DESCRIPTION, artifactDescription);
        }

        if (additionalProperties.containsKey(CodegenConstants.SCM_CONNECTION)) {
            this.setScmConnection((String) additionalProperties.get(CodegenConstants.SCM_CONNECTION));
        } else {
            additionalProperties.put(CodegenConstants.SCM_CONNECTION, scmConnection);
        }

        if (additionalProperties.containsKey(CodegenConstants.SCM_DEVELOPER_CONNECTION)) {
            this.setScmDeveloperConnection((String) additionalProperties.get(CodegenConstants.SCM_DEVELOPER_CONNECTION));
        } else {
            additionalProperties.put(CodegenConstants.SCM_DEVELOPER_CONNECTION, scmDeveloperConnection);
        }

        if (additionalProperties.containsKey(CodegenConstants.SCM_URL)) {
            this.setScmUrl((String) additionalProperties.get(CodegenConstants.SCM_URL));
        } else {
            additionalProperties.put(CodegenConstants.SCM_URL, scmUrl);
        }

        if (additionalProperties.containsKey(CodegenConstants.DEVELOPER_NAME)) {
            this.setDeveloperName((String) additionalProperties.get(CodegenConstants.DEVELOPER_NAME));
        } else {
            additionalProperties.put(CodegenConstants.DEVELOPER_NAME, developerName);
        }

        if (additionalProperties.containsKey(CodegenConstants.DEVELOPER_EMAIL)) {
            this.setDeveloperEmail((String) additionalProperties.get(CodegenConstants.DEVELOPER_EMAIL));
        } else {
            additionalProperties.put(CodegenConstants.DEVELOPER_EMAIL, developerEmail);
        }

        if (additionalProperties.containsKey(CodegenConstants.DEVELOPER_ORGANIZATION)) {
            this.setDeveloperOrganization((String) additionalProperties.get(CodegenConstants.DEVELOPER_ORGANIZATION));
        } else {
            additionalProperties.put(CodegenConstants.DEVELOPER_ORGANIZATION, developerOrganization);
        }

        if (additionalProperties.containsKey(CodegenConstants.DEVELOPER_ORGANIZATION_URL)) {
            this.setDeveloperOrganizationUrl((String) additionalProperties.get(CodegenConstants.DEVELOPER_ORGANIZATION_URL));
        } else {
            additionalProperties.put(CodegenConstants.DEVELOPER_ORGANIZATION_URL, developerOrganizationUrl);
        }

        if (additionalProperties.containsKey(CodegenConstants.LICENSE_NAME)) {
            this.setLicenseName((String) additionalProperties.get(CodegenConstants.LICENSE_NAME));
        } else {
            additionalProperties.put(CodegenConstants.LICENSE_NAME, licenseName);
        }

        if (additionalProperties.containsKey(CodegenConstants.LICENSE_URL)) {
            this.setLicenseUrl((String) additionalProperties.get(CodegenConstants.LICENSE_URL));
        } else {
            additionalProperties.put(CodegenConstants.LICENSE_URL, licenseUrl);
        }

        if (additionalProperties.containsKey(CodegenConstants.SOURCE_FOLDER)) {
            this.setSourceFolder((String) additionalProperties.get(CodegenConstants.SOURCE_FOLDER));
        }
        additionalProperties.put(CodegenConstants.SOURCE_FOLDER, sourceFolder);

        if (additionalProperties.containsKey(CodegenConstants.SERIALIZABLE_MODEL)) {
            this.setSerializableModel(Boolean.valueOf(additionalProperties.get(CodegenConstants.SERIALIZABLE_MODEL).toString()));
        }

        if (additionalProperties.containsKey(CodegenConstants.LIBRARY)) {
            this.setLibrary((String) additionalProperties.get(CodegenConstants.LIBRARY));
        }

        if (additionalProperties.containsKey(CodegenConstants.SERIALIZE_BIG_DECIMAL_AS_STRING)) {
            this.setSerializeBigDecimalAsString(Boolean.parseBoolean(additionalProperties.get(CodegenConstants.SERIALIZE_BIG_DECIMAL_AS_STRING).toString()));
        }

        // need to put back serializableModel (boolean) into additionalProperties as value in additionalProperties is string
        additionalProperties.put(CodegenConstants.SERIALIZABLE_MODEL, serializableModel);

        if (additionalProperties.containsKey(FULL_JAVA_UTIL)) {
            this.setFullJavaUtil(Boolean.parseBoolean(additionalProperties.get(FULL_JAVA_UTIL).toString()));
        }
        if (additionalProperties.containsKey(DISCRIMINATOR_CASE_SENSITIVE)) {
            this.setDiscriminatorCaseSensitive(Boolean.parseBoolean(additionalProperties.get(DISCRIMINATOR_CASE_SENSITIVE).toString()));
        } else {
            // By default, the discriminator lookup should be case sensitive. There is nothing in the OpenAPI specification
            // that indicates the lookup should be case insensitive. However, some implementations perform
            // a case-insensitive lookup.
            this.setDiscriminatorCaseSensitive(Boolean.TRUE);
        }
        additionalProperties.put(DISCRIMINATOR_CASE_SENSITIVE, this.discriminatorCaseSensitive);

        if (fullJavaUtil) {
            javaUtilPrefix = "java.util.";
        }
        additionalProperties.put(FULL_JAVA_UTIL, fullJavaUtil);
        additionalProperties.put("javaUtilPrefix", javaUtilPrefix);

        if (additionalProperties.containsKey(WITH_XML)) {
            this.setWithXml(Boolean.parseBoolean(additionalProperties.get(WITH_XML).toString()));
        }
        additionalProperties.put(WITH_XML, withXml);

        if (additionalProperties.containsKey(OPENAPI_NULLABLE)) {
            this.setOpenApiNullable(Boolean.parseBoolean(additionalProperties.get(OPENAPI_NULLABLE).toString()));
        }
        additionalProperties.put(OPENAPI_NULLABLE, openApiNullable);

        if (additionalProperties.containsKey(CodegenConstants.PARENT_GROUP_ID)) {
            this.setParentGroupId((String) additionalProperties.get(CodegenConstants.PARENT_GROUP_ID));
        }

        if (additionalProperties.containsKey(CodegenConstants.PARENT_ARTIFACT_ID)) {
            this.setParentArtifactId((String) additionalProperties.get(CodegenConstants.PARENT_ARTIFACT_ID));
        }

        if (additionalProperties.containsKey(CodegenConstants.PARENT_VERSION)) {
            this.setParentVersion((String) additionalProperties.get(CodegenConstants.PARENT_VERSION));
        }

        if (additionalProperties.containsKey(IMPLICIT_HEADERS)) {
            this.setImplicitHeaders(Boolean.parseBoolean(additionalProperties.get(IMPLICIT_HEADERS).toString()));
        }

        if (additionalProperties.containsKey(IMPLICIT_HEADERS_REGEX)) {
            this.setImplicitHeadersRegex(additionalProperties.get(IMPLICIT_HEADERS_REGEX).toString());
        }

        if (!StringUtils.isEmpty(parentGroupId) && !StringUtils.isEmpty(parentArtifactId) && !StringUtils.isEmpty(parentVersion)) {
            additionalProperties.put("parentOverridden", true);
        }

        // make api and model doc path available in mustache template
        additionalProperties.put("apiDocPath", apiDocPath);
        additionalProperties.put("modelDocPath", modelDocPath);

        importMapping.put("List", "java.util.List");
        importMapping.put("Set", "java.util.Set");

        if (fullJavaUtil) {
            typeMapping.put("array", "java.util.List");
            typeMapping.put("set", "java.util.Set");
            typeMapping.put("map", "java.util.Map");
            typeMapping.put("DateTime", "java.util.Date");
            typeMapping.put("UUID", "java.util.UUID");
            typeMapping.remove("List");
            importMapping.remove("Date");
            importMapping.remove("Map");
            importMapping.remove("HashMap");
            importMapping.remove("Array");
            importMapping.remove("ArrayList");
            importMapping.remove("List");
            importMapping.remove("Set");
            importMapping.remove("DateTime");
            importMapping.remove("UUID");
            instantiationTypes.put("array", "java.util.ArrayList");
            instantiationTypes.put("set", "java.util.LinkedHashSet");
            instantiationTypes.put("map", "java.util.HashMap");
        }

        this.sanitizeConfig();

        // optional jackson mappings for BigDecimal support
        importMapping.put("ToStringSerializer", "com.fasterxml.jackson.databind.ser.std.ToStringSerializer");
        importMapping.put("JsonSerialize", "com.fasterxml.jackson.databind.annotation.JsonSerialize");
        importMapping.put("JsonDeserialize", "com.fasterxml.jackson.databind.annotation.JsonDeserialize");

        // imports for pojos
        importMapping.put("ApiModelProperty", "io.swagger.annotations.ApiModelProperty");
        importMapping.put("ApiModel", "io.swagger.annotations.ApiModel");
        importMapping.put("BigDecimal", "java.math.BigDecimal");
        importMapping.put("JsonProperty", "com.fasterxml.jackson.annotation.JsonProperty");
        importMapping.put("JsonSubTypes", "com.fasterxml.jackson.annotation.JsonSubTypes");
        importMapping.put("JsonTypeInfo", "com.fasterxml.jackson.annotation.JsonTypeInfo");
        importMapping.put("JsonTypeName", "com.fasterxml.jackson.annotation.JsonTypeName");
        importMapping.put("JsonCreator", "com.fasterxml.jackson.annotation.JsonCreator");
        importMapping.put("JsonValue", "com.fasterxml.jackson.annotation.JsonValue");
        importMapping.put("JsonIgnore", "com.fasterxml.jackson.annotation.JsonIgnore");
        importMapping.put("JsonIgnoreProperties", "com.fasterxml.jackson.annotation.JsonIgnoreProperties");
        importMapping.put("JsonInclude", "com.fasterxml.jackson.annotation.JsonInclude");
        importMapping.put("JsonNullable", "org.openapijsonschematools.jackson.nullable.JsonNullable");
        importMapping.put("SerializedName", "com.google.gson.annotations.SerializedName");
        importMapping.put("TypeAdapter", "com.google.gson.TypeAdapter");
        importMapping.put("JsonAdapter", "com.google.gson.annotations.JsonAdapter");
        importMapping.put("JsonReader", "com.google.gson.stream.JsonReader");
        importMapping.put("JsonWriter", "com.google.gson.stream.JsonWriter");
        importMapping.put("IOException", "java.io.IOException");
        importMapping.put("Arrays", "java.util.Arrays");
        importMapping.put("Objects", "java.util.Objects");
        importMapping.put("StringUtil", invokerPackage + ".StringUtil");
        // import JsonCreator if JsonProperty is imported
        // used later in recursive import in postProcessingModels
        importMapping.put("com.fasterxml.jackson.annotation.JsonProperty", "com.fasterxml.jackson.annotation.JsonCreator");

        if (additionalProperties.containsKey(SUPPORT_ASYNC)) {
            setSupportAsync(Boolean.parseBoolean(additionalProperties.get(SUPPORT_ASYNC).toString()));
            if (supportAsync) {
                additionalProperties.put(SUPPORT_ASYNC, "true");
            }
        }

        if (additionalProperties.containsKey(DATE_LIBRARY)) {
            setDateLibrary(additionalProperties.get("dateLibrary").toString());
        }

        if ("joda".equals(dateLibrary)) {
            additionalProperties.put("joda", "true");
            typeMapping.put("date", "LocalDate");
            typeMapping.put("DateTime", "DateTime");
            importMapping.put("LocalDate", "org.joda.time.LocalDate");
            importMapping.put("DateTime", "org.joda.time.DateTime");
        } else if (dateLibrary.startsWith("java8")) {
            additionalProperties.put("java8", "true");
            additionalProperties.put("jsr310", "true");
            typeMapping.put("date", "LocalDate");
            importMapping.put("LocalDate", "java.time.LocalDate");
            if ("java8-localdatetime".equals(dateLibrary)) {
                typeMapping.put("DateTime", "LocalDateTime");
                importMapping.put("LocalDateTime", "java.time.LocalDateTime");
            } else {
                typeMapping.put("DateTime", "OffsetDateTime");
                importMapping.put("OffsetDateTime", "java.time.OffsetDateTime");
            }
        } else if (dateLibrary.equals("legacy")) {
            additionalProperties.put("legacyDates", "true");
        }

        if (additionalProperties.containsKey(TEST_OUTPUT)) {
            setOutputTestFolder(additionalProperties.get(TEST_OUTPUT).toString());
        }
    }

    @Override
    public TreeMap<String, CodegenSchema> postProcessAllModels(TreeMap<String, CodegenSchema> objs) {
        objs = super.postProcessAllModels(objs);
        objs = super.updateAllModels(objs);

        if (!additionalModelTypeAnnotations.isEmpty()) {
            for (String modelName : objs.keySet()) {
                Map<String, Object> models = (Map<String, Object>) objs.get(modelName);
                models.put(ADDITIONAL_MODEL_TYPE_ANNOTATIONS, additionalModelTypeAnnotations);
            }
        }

        if (!additionalEnumTypeAnnotations.isEmpty()) {
            for (String modelName : objs.keySet()) {
                Map<String, Object> models = (Map<String, Object>) objs.get(modelName);
                models.put(ADDITIONAL_ENUM_TYPE_ANNOTATIONS, additionalEnumTypeAnnotations);
            }
        }

        return objs;
    }

    private void sanitizeConfig() {
        // Sanitize any config options here. We also have to update the additionalProperties because
        // the whole additionalProperties object is injected into the main object passed to the mustache layer

        this.setApiPackage(sanitizePackageName(apiPackage));
        if (additionalProperties.containsKey(CodegenConstants.API_PACKAGE)) {
            this.additionalProperties.put(CodegenConstants.API_PACKAGE, apiPackage);
        }

        this.setModelPackage(sanitizePackageName(modelPackage));
        if (additionalProperties.containsKey(CodegenConstants.MODEL_PACKAGE)) {
            this.additionalProperties.put(CodegenConstants.MODEL_PACKAGE, modelPackage);
        }

        this.setInvokerPackage(sanitizePackageName(invokerPackage));
        if (additionalProperties.containsKey(CodegenConstants.INVOKER_PACKAGE)) {
            this.additionalProperties.put(CodegenConstants.INVOKER_PACKAGE, invokerPackage);
        }
    }

    @Override
    public String escapeReservedWord(String name) {
        if (this.reservedWordsMappings().containsKey(name)) {
            return this.reservedWordsMappings().get(name);
        }
        return "_" + name;
    }

    @Override
    public String apiFileFolder() {
        return (outputFolder + File.separator + sourceFolder + File.separator + apiPackage().replace('.', File.separatorChar)).replace('/', File.separatorChar);
    }

    @Override
    public String apiTestFileFolder() {
        return (outputTestFolder + File.separator + testFolder + File.separator + apiPackage().replace('.', File.separatorChar)).replace('/', File.separatorChar);
    }

    @Override
    public String modelTestFileFolder() {
        return (outputTestFolder + File.separator + testFolder + File.separator + modelPackage().replace('.', File.separatorChar)).replace('/', File.separatorChar);
    }

    @Override
    public String apiDocFileFolder() {
        return (outputFolder + File.separator + apiDocPath).replace('/', File.separatorChar);
    }

    @Override
    public String toApiDocFilename(String name) {
        return toApiName(name);
    }

    @Override
    public String toApiTestFilename(String name) {
        return toApiName(name) + "Test";
    }

    @Override
    public String toModelTestFilename(String name) {
        return toModelName(name, null) + "Test";
    }

    @Override
    public String toApiFilename(String name) {
        return toApiName(name);
    }

    @Override
    public String toVarName(String name) {
        // sanitize name
        name = sanitizeName(name, "\\W-[\\$]"); // FIXME: a parameter should not be assigned. Also declare the methods parameters as 'final'.

        if (name.toLowerCase(Locale.ROOT).matches("^_*class$")) {
            return "propertyClass";
        }

        if ("_".equals(name)) {
            name = "_u";
        }

        // numbers are not allowed at the beginning
        if (name.matches("^\\d.*")) {
            name = "_" + name;
        }

        // if it's all upper case, do nothing
        if (name.matches("^[A-Z0-9_]*$")) {
            return name;
        }

        if (startsWithTwoUppercaseLetters(name)) {
            name = name.substring(0, 2).toLowerCase(Locale.ROOT) + name.substring(2);
        }

        // If name contains special chars -> replace them.
        if ((((CharSequence) name).chars().anyMatch(character -> specialCharReplacements.containsKey(String.valueOf((char) character))))) {
            List<String> allowedCharacters = new ArrayList<>();
            allowedCharacters.add("_");
            allowedCharacters.add("$");
            name = escape(name, specialCharReplacements, allowedCharacters, "_");
        }

        // camelize (lower first character) the variable name
        // pet_id => petId
        name = camelize(name, true);

        // for reserved word or word starting with number, append _
        if (isReservedWord(name) || name.matches("^\\d.*")) {
            name = escapeReservedWord(name);
        }

        return name;
    }

    private boolean startsWithTwoUppercaseLetters(String name) {
        boolean startsWithTwoUppercaseLetters = false;
        if (name.length() > 1) {
            startsWithTwoUppercaseLetters = name.substring(0, 2).equals(name.substring(0, 2).toUpperCase(Locale.ROOT));
        }
        return startsWithTwoUppercaseLetters;
    }

    @Override
    public String toParamName(String name) {
        // to avoid conflicts with 'callback' parameter for async call
        if ("callback".equals(name)) {
            return "paramCallback";
        }

        // should be the same as variable name
        return toVarName(name);
    }

    @Override
    public String toModelName(final String name, String jsonPath) {
        // We need to check if schema-mapping has a different model for this class, so we use it
        // instead of the auto-generated one.
        if (schemaMapping.containsKey(name)) {
            return schemaMapping.get(name);
        }

        // memoization
        String origName = name;
        if (schemaKeyToModelNameCache.containsKey(origName)) {
            return schemaKeyToModelNameCache.get(origName);
        }

        final String sanitizedName = sanitizeName(name);

        String nameWithPrefixSuffix = sanitizedName;
        if (!StringUtils.isEmpty(modelNamePrefix)) {
            // add '_' so that model name can be camelized correctly
            nameWithPrefixSuffix = modelNamePrefix + "_" + nameWithPrefixSuffix;
        }

        if (!StringUtils.isEmpty(modelNameSuffix)) {
            // add '_' so that model name can be camelized correctly
            nameWithPrefixSuffix = nameWithPrefixSuffix + "_" + modelNameSuffix;
        }

        // camelize the model name
        // phone_number => PhoneNumber
        final String camelizedName = camelize(nameWithPrefixSuffix);

        // model name cannot use reserved keyword, e.g. return
        if (isReservedWord(camelizedName)) {
            final String modelName = "Model" + camelizedName;
            schemaKeyToModelNameCache.put(origName, modelName);
            LOGGER.warn("{} (reserved word) cannot be used as model name. Renamed to {}", camelizedName, modelName);
            return modelName;
        }

        // model name starts with number
        if (camelizedName.matches("^\\d.*")) {
            final String modelName = "Model" + camelizedName; // e.g. 200Response => Model200Response (after camelize)
            schemaKeyToModelNameCache.put(origName, modelName);
            LOGGER.warn("{} (model name starts with number) cannot be used as model name. Renamed to {}", name,
                    modelName);
            return modelName;
        }

        schemaKeyToModelNameCache.put(origName, camelizedName);

        return camelizedName;
    }

    @Override
    public String toModelFilename(String name, String jsonPath) {
        // should be the same as the model name
        return toModelName(name, jsonPath);
    }

    /**
     * Return the example value of the parameter. Overrides the
     * getParameterExampleValue(Parameter) method in
     * DefaultCodegen to always call setParameterExampleValue(CodegenParameter)
     * in this class, which adds single quotes around strings from the
     * x-example property.
     *
     * @param parameter        Parameter
     */
    @Override
    public String getParameterExampleValue(Parameter parameter) {
        String example = null;
        if (parameter.getExample() != null) {
            example = parameter.getExample().toString();
        } else if (parameter.getExamples() != null && !parameter.getExamples().isEmpty()) {
            Example examplesExample = parameter.getExamples().values().iterator().next();
            if (examplesExample.getValue() != null) {
                example = examplesExample.getValue().toString();
            }
        }

        Schema schema = parameter.getSchema();

        if (schema == null) {
            String contentType = (String) parameter.getContent().keySet().toArray()[0];
            schema = parameter.getContent().get(contentType).getSchema();
        }

        if (schema.getExample() != null) {
            example = schema.getExample().toString();
        } else if (schema.getExamples() != null && !schema.getExamples().isEmpty()) {
            example = schema.getExamples().get(0).toString();
        }

        boolean hasAllowableValues = schema.getEnum() != null && !schema.getEnum().isEmpty();
        if (hasAllowableValues) {
            //support examples for inline enums
            final List<Object> values = (List<Object>) schema.getEnum();
            example = String.valueOf(values.get(0));
        } else if (schema.getDefault() != null) {
            example = schema.getDefault().toString();
        } else if (schema.getExample() != null) {
            example = schema.getExample().toString();
        } else if (schema.getExamples() != null && !schema.getExamples().isEmpty()) {
            example = schema.getExamples().get(0).toString();
        }

        Set<String> types = schema.getTypes();
        if (types == null) {
            types = new HashSet<>();
            if (schema.getType() != null) {
                types.add(schema.getType());
            }
        }
        if (types.contains("string")) {
            String format = schema.getFormat();
            if (format != null) {
                if (format.equals("uuid")) {
                    if (example == null) {
                        example = "UUID.randomUUID()";
                    } else {
                        example = "UUID.fromString(\"" + example + "\")";
                    }
                } else if (format.equals("binary")) {
                    if (example == null) {
                        example = "/path/to/file";
                    }
                    example = "new File(\"" + escapeText(example) + "\")";
                } else if (format.equals("date")) {
                    example = "new Date()";
                } else if (format.equals("date-time")) {
                    if (example == null) {
                        example = "LocalDate.now()";
                    } else {
                        example = "LocalDate.parse(\"" + example + "\")";
                    }
                } else if (format.equals("number")) {
                    if (example == null) {
                        example = "new BigDecimal(78)";
                    } else {
                        example = "new BigDecimal(\"" + example + "\")";
                    }
                }
            } else {
                if (example == null) {
                    example = parameter.getName() + "_example";
                }
                example = "\"" + escapeText(example) + "\"";
            }
        } else if (types.contains("integer")) {
            if (example == null) {
                example = "56";
            }
            if (schema.getFormat().equals("int64")) {
                example = StringUtils.appendIfMissingIgnoreCase(example, "L");
            }
        } else if (types.contains("number")) {
            if (example == null) {
                example = "3.4";
            }
            if (schema.getFormat().equals("float")) {
                example = StringUtils.appendIfMissingIgnoreCase(example, "F");
            } else if (schema.getFormat().equals("double")) {
                example = StringUtils.appendIfMissingIgnoreCase(example, "D");
            }
        } else if (types.contains("boolean")) {
            if (example == null) {
                example = "true";
            }
        } else if (types.contains("array")) {
            if (example == null) {
                example = "Arrays.asList()";
            }
        } else if (types.contains("object")) {
            if (example == null) {
                example = "new HashMap()";
            }
        } else if (types.contains("null")) {
            if (example == null) {
                example = "null";
            }
        } else if (hasAllowableValues) {
            //parameter is enum defined as a schema component
            example = ".fromValue(\"" + example + "\")";
        }

        if (example == null) {
            example = "null";
        }

        return example;
    }

    @Override
    public String toExampleValue(Schema p) {
        if (p.getExample() != null) {
            return escapeText(p.getExample().toString());
        } else {
            return null;
        }
    }

    @Override
    public void postProcessModelProperty(CodegenSchema model, CodegenSchema property) {
        if (additionalProperties.containsKey(JACKSON)) {
            model.imports.add("JsonTypeName");
        }

        if (serializeBigDecimalAsString) {
            if (property.types.contains("string") && property.format.equals("number")) {
                // we serialize BigDecimal as `string` to avoid precision loss
                property.vendorExtensions.put("x-extra-annotation", "@JsonSerialize(using = ToStringSerializer.class)");

                // this requires some more imports to be added for this model...
                model.imports.add("ToStringSerializer");
                model.imports.add("JsonSerialize");
            }
        }

        if (!fullJavaUtil) {
            if (property.types != null && property.types.contains("array") && !property.uniqueItems) {
                model.imports.add("ArrayList");
            } else if (property.types != null && property.types.contains("array") && property.uniqueItems) {
                model.imports.add("LinkedHashSet");
                boolean canNotBeWrappedToNullable = !openApiNullable || Boolean.FALSE.equals(property.nullable);
                if (canNotBeWrappedToNullable) {
                    model.imports.add("JsonDeserialize");
                    property.vendorExtensions.put("x-setter-extra-annotation", "@JsonDeserialize(as = LinkedHashSet.class)");
                }
            } else if (property.types != null && property.types.contains("object")) {
                model.imports.add("HashMap");
            }
        }

        if (model.enumValueToName == null) {
            // needed by all pojos, but not enums
            model.imports.add("ApiModelProperty");
            model.imports.add("ApiModel");
        }

        if (openApiNullable) {
            if (Boolean.TRUE.equals(property.nullable)) {
                model.imports.add("JsonNullable");
                model.vendorExtensions.put("x-jackson-optional-nullable-helpers", true);
            }
        }

        if (property.readOnly) {
            model.vendorExtensions.put("x-has-readonly-properties", true);
        }
    }

    @Override
    public void preprocessOpenAPI(OpenAPI openAPI) {
        super.preprocessOpenAPI(openAPI);
        if (openAPI == null) {
            return;
        }
        if (openAPI.getPaths() != null) {
            for (Map.Entry<String, PathItem> openAPIGetPathsEntry : openAPI.getPaths().entrySet()) {
                String pathname = openAPIGetPathsEntry.getKey();
                PathItem path = openAPIGetPathsEntry.getValue();
                if (path.readOperations() == null) {
                    continue;
                }
                for (Operation operation : path.readOperations()) {
                    LOGGER.info("Processing operation {}", operation.getOperationId());
                    if (hasBodyParameter(openAPI, operation) || hasFormParameter(openAPI, operation)) {
                        String defaultContentType = hasFormParameter(openAPI, operation) ? "application/x-www-form-urlencoded" : "application/json";
                        List<String> consumes = new ArrayList<>(getConsumesInfo(openAPI, operation));
                        String contentType = consumes.isEmpty() ? defaultContentType : consumes.get(0);
                        operation.addExtension("x-content-type", contentType);
                    }
                    String accepts = getAccept(openAPI, operation);
                    operation.addExtension("x-accepts", accepts);
                }
            }
        }

        // TODO: Setting additionalProperties is not the responsibility of this method. These side-effects should be moved elsewhere to prevent unexpected behaviors.
        if (artifactVersion == null) {
            // If no artifactVersion is provided in additional properties, version from API specification is used.
            // If none of them is provided then fallbacks to default version
            if (additionalProperties.containsKey(CodegenConstants.ARTIFACT_VERSION) && additionalProperties.get(CodegenConstants.ARTIFACT_VERSION) != null) {
                this.setArtifactVersion((String) additionalProperties.get(CodegenConstants.ARTIFACT_VERSION));
            } else if (openAPI.getInfo() != null && openAPI.getInfo().getVersion() != null) {
                this.setArtifactVersion(openAPI.getInfo().getVersion());
            } else {
                this.setArtifactVersion(ARTIFACT_VERSION_DEFAULT_VALUE);
            }
        }
        additionalProperties.put(CodegenConstants.ARTIFACT_VERSION, artifactVersion);

        if (additionalProperties.containsKey(CodegenConstants.SNAPSHOT_VERSION)) {
            if (convertPropertyToBooleanAndWriteBack(CodegenConstants.SNAPSHOT_VERSION)) {
                this.setArtifactVersion(this.buildSnapshotVersion(this.getArtifactVersion()));
            }
        }
        additionalProperties.put(CodegenConstants.ARTIFACT_VERSION, artifactVersion);

        if (ignoreAnyOfInEnum) {
            // Alter OpenAPI schemas ignore anyOf keyword if it consist of an enum. Example:
            //     anyOf:
            //     - type: string
            //       enum:
            //       - ENUM_A
            //       - ENUM_B
            Stream.concat(
                            Stream.of(openAPI.getComponents().getSchemas()),
                            openAPI.getComponents().getSchemas().values().stream()
                                    .filter(schema -> schema.getProperties() != null)
                                    .map(Schema::getProperties))
                    .forEach(schemas -> schemas.replaceAll(
                            (name, s) -> Stream.of(s)
                                    .filter(schema -> schema instanceof ComposedSchema)
                                    .map(schema -> (ComposedSchema) schema)
                                    .filter(schema -> Objects.nonNull(schema.getAnyOf()))
                                    .flatMap(schema -> schema.getAnyOf().stream())
                                    .filter(schema -> Objects.nonNull(schema.getEnum()))
                                    .findFirst()
                                    .orElse((Schema) s)));
        }
    }

    private static String getAccept(OpenAPI openAPI, Operation operation) {
        String accepts = null;
        String defaultContentType = "application/json";
        Set<String> producesInfo = getProducesInfo(openAPI, operation);
        if (producesInfo != null && !producesInfo.isEmpty()) {
            ArrayList<String> produces = new ArrayList<>(producesInfo);
            StringBuilder sb = new StringBuilder();
            for (String produce : produces) {
                if (defaultContentType.equalsIgnoreCase(produce)) {
                    accepts = defaultContentType;
                    break;
                } else {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(produce);
                }
            }
            if (accepts == null) {
                accepts = sb.toString();
            }
        } else {
            accepts = defaultContentType;
        }

        return accepts;
    }

    @Override
    protected boolean needToImport(String type) {
        return super.needToImport(type) && !type.contains(".");
    }

    @Override
    public String toEnumVarName(String value, Schema prop) {
        if (value.length() == 0) {
            return "EMPTY";
        }

        // for symbol, e.g. $, #
        if (getSymbolName(value) != null) {
            return getSymbolName(value).toUpperCase(Locale.ROOT);
        }

        if (" ".equals(value)) {
            return "SPACE";
        }

        // number
        if (prop.getType().equals("integer") || prop.getType().equals("float")) {
            String varName = "NUMBER_" + value;
            varName = varName.replaceAll("-", "MINUS_");
            varName = varName.replaceAll("\\+", "PLUS_");
            varName = varName.replaceAll("\\.", "_DOT_");
            return varName;
        }

        // string
        String var = value.replaceAll("\\W+", "_").toUpperCase(Locale.ROOT);
        if (var.matches("\\d.*")) {
            return "_" + var;
        } else {
            return var;
        }
    }

    private static String sanitizePackageName(String packageName) {
        packageName = packageName.trim(); // FIXME: a parameter should not be assigned. Also declare the methods parameters as 'final'.
        packageName = packageName.replaceAll("[^a-zA-Z0-9_\\.]", "_");
        if (Strings.isNullOrEmpty(packageName)) {
            return "invalidPackageName";
        }
        return packageName;
    }

    public String getInvokerPackage() {
        return invokerPackage;
    }

    public void setInvokerPackage(String invokerPackage) {
        this.invokerPackage = invokerPackage;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    public String getArtifactVersion() {
        return artifactVersion;
    }

    public void setArtifactVersion(String artifactVersion) {
        this.artifactVersion = artifactVersion;
    }

    public String getArtifactUrl() {
        return artifactUrl;
    }

    public void setArtifactUrl(String artifactUrl) {
        this.artifactUrl = artifactUrl;
    }

    public String getArtifactDescription() {
        return artifactDescription;
    }

    public void setArtifactDescription(String artifactDescription) {
        this.artifactDescription = artifactDescription;
    }

    public String getScmConnection() {
        return scmConnection;
    }

    public void setScmConnection(String scmConnection) {
        this.scmConnection = scmConnection;
    }

    public String getScmDeveloperConnection() {
        return scmDeveloperConnection;
    }

    public void setScmDeveloperConnection(String scmDeveloperConnection) {
        this.scmDeveloperConnection = scmDeveloperConnection;
    }

    public String getScmUrl() {
        return scmUrl;
    }

    public void setScmUrl(String scmUrl) {
        this.scmUrl = scmUrl;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    public String getDeveloperEmail() {
        return developerEmail;
    }

    public void setDeveloperEmail(String developerEmail) {
        this.developerEmail = developerEmail;
    }

    public String getDeveloperOrganization() {
        return developerOrganization;
    }

    public void setDeveloperOrganization(String developerOrganization) {
        this.developerOrganization = developerOrganization;
    }

    public String getDeveloperOrganizationUrl() {
        return developerOrganizationUrl;
    }

    public void setDeveloperOrganizationUrl(String developerOrganizationUrl) {
        this.developerOrganizationUrl = developerOrganizationUrl;
    }

    public String getLicenseName() {
        return licenseName;
    }

    public void setLicenseName(String licenseName) {
        this.licenseName = licenseName;
    }

    public String getLicenseUrl() {
        return licenseUrl;
    }

    public void setLicenseUrl(String licenseUrl) {
        this.licenseUrl = licenseUrl;
    }

    public String getSourceFolder() {
        return sourceFolder;
    }

    public void setSourceFolder(String sourceFolder) {
        this.sourceFolder = sourceFolder;
    }

    public String getTestFolder() {
        return testFolder;
    }

    public void setTestFolder(String testFolder) {
        this.testFolder = testFolder;
    }

    public void setSerializeBigDecimalAsString(boolean s) {
        this.serializeBigDecimalAsString = s;
    }

    public Boolean getSerializableModel() {
        return serializableModel;
    }

    public void setSerializableModel(Boolean serializableModel) {
        this.serializableModel = serializableModel;
    }

    private String sanitizePath(String p) {
        //prefer replace a ", instead of a fuLL URL encode for readability
        return p.replaceAll("\"", "%22");
    }

    public void setFullJavaUtil(boolean fullJavaUtil) {
        this.fullJavaUtil = fullJavaUtil;
    }

    /**
     * Set whether discriminator value lookup is case-sensitive or not.
     *
     * @param discriminatorCaseSensitive true if the discriminator value lookup should be case sensitive.
     */
    public void setDiscriminatorCaseSensitive(boolean discriminatorCaseSensitive) {
        this.discriminatorCaseSensitive = discriminatorCaseSensitive;
    }

    public void setWithXml(boolean withXml) {
        this.withXml = withXml;
    }

    public String getDateLibrary() {
        return dateLibrary;
    }

    public void setDateLibrary(String library) {
        this.dateLibrary = library;
    }

    public void setSupportAsync(boolean enabled) {
        this.supportAsync = enabled;
    }

    public void setDisableHtmlEscaping(boolean disabled) {
        this.disableHtmlEscaping = disabled;
    }

    public String getBooleanGetterPrefix() {
        return booleanGetterPrefix;
    }

    public void setBooleanGetterPrefix(String booleanGetterPrefix) {
        this.booleanGetterPrefix = booleanGetterPrefix;
    }

    public void setIgnoreAnyOfInEnum(boolean ignoreAnyOfInEnum) {
        this.ignoreAnyOfInEnum = ignoreAnyOfInEnum;
    }

    public boolean isOpenApiNullable() {
        return openApiNullable;
    }

    public void setOpenApiNullable(final boolean openApiNullable) {
        this.openApiNullable = openApiNullable;
    }

    @Override
    public void setOutputDir(String dir) {
        super.setOutputDir(dir);
        if (this.outputTestFolder.isEmpty()) {
            setOutputTestFolder(dir);
        }
    }

    public String getOutputTestFolder() {
        if (outputTestFolder.isEmpty()) {
            return DEFAULT_TEST_FOLDER;
        }
        return outputTestFolder;
    }

    public void setOutputTestFolder(String outputTestFolder) {
        this.outputTestFolder = outputTestFolder;
    }

    @Override
    public DocumentationProvider getDocumentationProvider() {
        return documentationProvider;
    }

    @Override
    public void setDocumentationProvider(DocumentationProvider documentationProvider) {
        this.documentationProvider = documentationProvider;
    }

    @Override
    public AnnotationLibrary getAnnotationLibrary() {
        return annotationLibrary;
    }

    @Override
    public void setAnnotationLibrary(AnnotationLibrary annotationLibrary) {
        this.annotationLibrary = annotationLibrary;
    }

    public void setImplicitHeaders(boolean implicitHeaders) {
        this.implicitHeaders = implicitHeaders;
    }

    public void setImplicitHeadersRegex(String implicitHeadersRegex) {
        this.implicitHeadersRegex = implicitHeadersRegex;
    }

    @Override
    public String escapeQuotationMark(String input) {
        // remove " to avoid code injection
        return input.replace("\"", "");
    }

    @Override
    public String escapeUnsafeCharacters(String input) {
        return input.replace("*/", "*_/").replace("/*", "/_*");
    }

    /*
     * Derive invoker package name based on the input
     * e.g. foo.bar.model => foo.bar
     *
     * @param input API package/model name
     * @return Derived invoker package name based on API package/model name
     */
    private String deriveInvokerPackageName(String input) {
        String[] parts = input.split(Pattern.quote(".")); // Split on period.

        StringBuilder sb = new StringBuilder();
        String delim = "";
        for (String p : Arrays.copyOf(parts, parts.length - 1)) {
            sb.append(delim).append(p);
            delim = ".";
        }
        return sb.toString();
    }

    /**
     * Builds a SNAPSHOT version from a given version.
     *
     * @param version
     * @return SNAPSHOT version
     */
    private String buildSnapshotVersion(String version) {
        if (version.endsWith("-SNAPSHOT")) {
            return version;
        }
        return version + "-SNAPSHOT";
    }

    public void setSupportJava6(boolean value) {
        this.supportJava6 = value;
    }

    @Override
    public CodegenPatternInfo getPatternInfo(String pattern) {
        return new CodegenPatternInfo(escapeText(pattern), null);
    }

    @Override
    public String sanitizeTag(String tag) {
        tag = camelize(underscore(sanitizeName(tag)));

        // tag starts with numbers
        if (tag.matches("^\\d.*")) {
            tag = "Class" + tag;
        }
        return tag;
    }

    @Override
    public void postProcessFile(File file, String fileType) {
        if (file == null) {
            return;
        }

        String javaPostProcessFile = System.getenv("JAVA_POST_PROCESS_FILE");
        if (StringUtils.isEmpty(javaPostProcessFile)) {
            return; // skip if JAVA_POST_PROCESS_FILE env variable is not defined
        }

        // only process files with java extension
        if ("java".equals(FilenameUtils.getExtension(file.toString()))) {
            String command = javaPostProcessFile + " " + file;
            try {
                Process p = Runtime.getRuntime().exec(command);
                p.waitFor();
                int exitValue = p.exitValue();
                if (exitValue != 0) {
                    LOGGER.error("Error running the command ({}). Exit value: {}", command, exitValue);
                } else {
                    LOGGER.info("Successfully executed: {}", command);
                }
            } catch (InterruptedException | IOException e) {
                LOGGER.error("Error running the command ({}). Exception: {}", command, e.getMessage());
                // Restore interrupted state
                Thread.currentThread().interrupt();
            }
        }
    }

    public void setParentGroupId(final String parentGroupId) {
        this.parentGroupId = parentGroupId;
    }

    public void setParentArtifactId(final String parentArtifactId) {
        this.parentArtifactId = parentArtifactId;
    }

    public void setParentVersion(final String parentVersion) {
        this.parentVersion = parentVersion;
    }

    public void setParentOverridden(final boolean parentOverridden) {
        this.parentOverridden = parentOverridden;
    }

    public List<String> getAdditionalModelTypeAnnotations() {
        return additionalModelTypeAnnotations;
    }

    public void setAdditionalModelTypeAnnotations(final List<String> additionalModelTypeAnnotations) {
        this.additionalModelTypeAnnotations = additionalModelTypeAnnotations;
    }

    public void setAdditionalEnumTypeAnnotations(final List<String> additionalEnumTypeAnnotations) {
        this.additionalEnumTypeAnnotations = additionalEnumTypeAnnotations;
    }

    /**
     * Search for property by {@link CodegenSchema#jsonPathPiece}
     * @param name - name to search for
     * @param properties - list of properties
     * @return either found property or {@link Optional#empty()} if nothing has been found
     */
    protected Optional<CodegenSchema> findByName(String name, List<CodegenSchema> properties) {
        if (properties == null || properties.isEmpty()) {
            return Optional.empty();
        }

        return properties.stream()
            .filter(p -> p.jsonPathPiece.original.equals(name))
            .findFirst();
    }

    @Override
    public List<VendorExtension> getSupportedVendorExtensions() {
        List<VendorExtension> extensions = super.getSupportedVendorExtensions();
        extensions.add(VendorExtension.X_DISCRIMINATOR_VALUE);
        extensions.add(VendorExtension.X_IMPLEMENTS);
        extensions.add(VendorExtension.X_SETTER_EXTRA_ANNOTATION);
        extensions.add(VendorExtension.X_TAGS);
        extensions.add(VendorExtension.X_ACCEPTS);
        extensions.add(VendorExtension.X_CONTENT_TYPE);
        extensions.add(VendorExtension.X_CLASS_EXTRA_ANNOTATION);
        extensions.add(VendorExtension.X_FIELD_EXTRA_ANNOTATION);
        return extensions;
    }
}
