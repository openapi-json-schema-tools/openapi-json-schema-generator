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

import com.google.common.base.Strings;
import com.google.common.collect.Sets;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.examples.Example;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.media.StringSchema;
import io.swagger.v3.oas.models.parameters.Parameter;
import io.swagger.v3.oas.models.servers.Server;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.openapijsonschematools.codegen.common.ModelUtils;
import org.openapijsonschematools.codegen.config.GeneratorSettings;
import org.openapijsonschematools.codegen.config.WorkflowSettings;
import org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet;
import org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorLanguage;
import org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata;
import org.openapijsonschematools.codegen.generators.generatormetadata.Stability;
import org.openapijsonschematools.codegen.generators.generatormetadata.features.ComponentsFeature;
import org.openapijsonschematools.codegen.generators.generatormetadata.features.GlobalFeature;
import org.openapijsonschematools.codegen.generators.generatormetadata.features.OperationFeature;
import org.openapijsonschematools.codegen.generators.generatormetadata.features.SchemaFeature;
import org.openapijsonschematools.codegen.common.CodegenConstants;
import org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorType;
import org.openapijsonschematools.codegen.generators.generatormetadata.features.SecurityFeature;
import org.openapijsonschematools.codegen.generators.models.CliOption;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenHeader;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenKey;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenKeyType;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenList;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenParameter;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenParametersInfo;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenRefInfo;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenRequestBody;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenResponse;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenSchema;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenSecurityRequirementObject;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenSecurityScheme;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenServer;
import org.openapijsonschematools.codegen.generators.openapimodels.EnumInfo;
import org.openapijsonschematools.codegen.generators.openapimodels.EnumValue;
import org.openapijsonschematools.codegen.generators.models.GeneratedFileType;
import org.openapijsonschematools.codegen.generators.openapimodels.MapBuilder;
import org.openapijsonschematools.codegen.generators.openapimodels.OperationInput;
import org.openapijsonschematools.codegen.generators.openapimodels.OperationInputProvider;
import org.openapijsonschematools.codegen.templating.HandlebarsEngineAdapter;
import org.openapijsonschematools.codegen.templating.SupportingFile;
import org.openapijsonschematools.codegen.templating.TemplatingEngineAdapter;
import org.openapijsonschematools.codegen.generators.generatormetadata.features.DocumentationFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.constraints.NotNull;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.openapijsonschematools.codegen.common.StringUtils.camelize;
import static org.openapijsonschematools.codegen.common.StringUtils.escape;

public class JavaClientGenerator extends DefaultGenerator implements Generator {
    public JavaClientGenerator(GeneratorSettings generatorSettings, WorkflowSettings workflowSettings) {
        super(
            generatorSettings,
            workflowSettings,
            "java",
            "org.openapijsonschematools.client",
            "generated-code" + File.separator + "java"
        );
        if (this.outputTestFolder.isEmpty()) {
            setOutputTestFolder(this.generatorSettings.outputFolder);
        }
        headersSchemaFragment = "HeadersSchema";

        supportsInheritance = true;

        hideGenerationTimestamp = false;

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
        typeMapping.put("date", "Date");
        typeMapping.put("file", "File");
        typeMapping.put("AnyType", "Object");

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
        cliOptions.add(CliOption.newBoolean(CodegenConstants.HIDE_GENERATION_TIMESTAMP, CodegenConstants.HIDE_GENERATION_TIMESTAMP_DESC, this.isHideGenerationTimestamp()));

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

        requestBodiesIdentifier = "requestbodies";
        securitySchemesIdentifier = "securityschemes";
        requestBodyIdentifier = "requestbody";
        addSchemaImportsFromV3SpecLocations = true;
        deepestRefSchemaImportNeeded = true;
        objectIOClassNamePiece = "Map";
        arrayIOClassNamePiece = "List";
        arrayObjectInputClassNameSuffix = "Builder";

        invokerPackage = "org.openapijsonschematools.client";
        artifactId = "openapi-java-client";
        modelPackage = "components.schemas";

        // cliOptions default redefinition need to be updated
        updateOption(CodegenConstants.INVOKER_PACKAGE, this.getInvokerPackage());
        updateOption(CodegenConstants.ARTIFACT_ID, this.getArtifactId());
//        updateOption(CodegenConstants.API_PACKAGE, apiPackage);

        jsonPathTestTemplateFiles.put(
            CodegenConstants.JSON_PATH_LOCATION_TYPE.SCHEMA,
            new HashMap<>() {{
                put("src/test/java/packagename/components/schemas/Schema_test.hbs", ".java");
            }}
        );
    }

    private final Logger LOGGER = LoggerFactory.getLogger(JavaClientGenerator.class);

    protected String authFolder;
    protected HashMap<String, String> schemaJsonPathToModelName = new HashMap<>();

    private static final String ARTIFACT_VERSION_DEFAULT_VALUE = "1.0.0";

    public static final String TEST_OUTPUT = "testOutput";
    public static final String DEFAULT_TEST_FOLDER = "${project.build.directory}/generated-test-sources/openapi";

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
    // this must not be OS-specific
    protected String sourceFolder = projectFolder + "/java";
    protected String apiDocPath = "docs/";
    protected String modelDocPath = "docs/";
    protected String parentGroupId = "";
    protected String parentArtifactId = "";
    protected String parentVersion = "";
    protected String outputTestFolder = "";
    private final Map<String, String> schemaKeyToModelNameCache = new HashMap<>();

    private static final FeatureSet featureSet = FeatureSet.newBuilder()
        .includeDocumentationFeatures(
            DocumentationFeature.Readme,
            DocumentationFeature.Servers,
            DocumentationFeature.Security,
            DocumentationFeature.ComponentSchemas,
            DocumentationFeature.ComponentSecuritySchemes,
            DocumentationFeature.ComponentRequestBodies,
            DocumentationFeature.ComponentResponses,
            DocumentationFeature.ComponentHeaders,
            DocumentationFeature.ComponentParameters,
            DocumentationFeature.Api
        )
        .includeGlobalFeatures(
            GlobalFeature.Components,
            GlobalFeature.Servers,
            GlobalFeature.Security,
            GlobalFeature.Paths
        )
        .includeComponentsFeatures(
            ComponentsFeature.schemas,
            ComponentsFeature.securitySchemes,
            ComponentsFeature.requestBodies,
            ComponentsFeature.responses,
            ComponentsFeature.headers,
            ComponentsFeature.parameters
        )
        .includeSecurityFeatures(
            SecurityFeature.ApiKey,
            SecurityFeature.HTTP_Basic,
            SecurityFeature.HTTP_Bearer
        )
        .includeOperationFeatures(
            OperationFeature.Security,
            OperationFeature.Servers,
            OperationFeature.Responses_Default,
            OperationFeature.Responses_HttpStatusCode,
            OperationFeature.Responses_RangedResponseCodes,
            OperationFeature.Responses_RedirectionResponse
        )
        .includeSchemaFeatures(
            SchemaFeature.AdditionalProperties,
            SchemaFeature.AllOf,
            SchemaFeature.AnyOf,
            SchemaFeature.Const,
            SchemaFeature.Contains,
            SchemaFeature.Default,
            SchemaFeature.DependentRequired,
            SchemaFeature.DependentSchemas,
            // SchemaFeature.Discriminator,
            SchemaFeature.Else,
            SchemaFeature.Enum,
            SchemaFeature.ExclusiveMaximum,
            SchemaFeature.ExclusiveMinimum,
            SchemaFeature.Format,
            SchemaFeature.If,
            SchemaFeature.Items,
            SchemaFeature.MaxContains,
            SchemaFeature.MaxItems,
            SchemaFeature.MaxLength,
            SchemaFeature.MaxProperties,
            SchemaFeature.Maximum,
            SchemaFeature.MinContains,
            SchemaFeature.MinItems,
            SchemaFeature.MinLength,
            SchemaFeature.MinProperties,
            SchemaFeature.Minimum,
            SchemaFeature.MultipleOf,
            SchemaFeature.Not,
            SchemaFeature.Nullable,
            SchemaFeature.OneOf,
            SchemaFeature.Pattern,
            SchemaFeature.PatternProperties,
            SchemaFeature.PrefixItems,
            SchemaFeature.Properties,
            SchemaFeature.PropertyNames,
            SchemaFeature.Ref,
            SchemaFeature.Required,
            SchemaFeature.Then,
            SchemaFeature.Type,
            SchemaFeature.UnevaluatedItems,
            SchemaFeature.UnevaluatedProperties,
            SchemaFeature.UniqueItems
        )
        .build();
    public static final GeneratorMetadata generatorMetadata = GeneratorMetadata.newBuilder()
        .name("java")
        .language(GeneratorLanguage.JAVA)
        .languageVersion("17")
        .type(GeneratorType.CLIENT)
        .stability(Stability.STABLE)
        .featureSet(featureSet)
        .generationMessage(String.format(Locale.ROOT, "OpenAPI JSON Schema Generator: %s (%s)", "java", GeneratorType.CLIENT))
        .helpMsg(String.join(
            "<br />",
        "Generates a Java client library",
            "",
            "Features in this generator:",
            "- v3.0.0 - [v3.1.0](#schema-feature) OpenAPI Specification support",
            "- Very thorough documentation generated in the style of javadocs",
            "- Input types constrained for a Schema in SomeSchema.validate",
            "  - validate method can accept arbitrary List/Map/null/int/long/double/float/String json data",
            "- Immutable List output classes generated and returned by validate for List&lt;?&gt; input",
            "- Immutable Map output classes generated and returned by validate for Map&lt;?, ?&gt; input",
            "- Strictly typed list input can be instantiated in client code using generated ListBuilders",
            "- Strictly typed map input can be instantiated in client code using generated MapBuilders",
            "  - Sequential map builders are generated ensuring that required properties are set before build is invoked. Looks like:",
            "  - `new MapBuilder().requiredA(\"a\").requiredB(\"b\").build()`",
            "  - `new MapBuilder().requiredA(\"a\").requiredB(\"b\").optionalProp(\"c\").additionalProperty(\"someAddProp\", \"d\").build()`",
            "- Run time type checking and validation when",
            "  - validating schema payloads",
            "  - instantiating List output class (validation run)",
            "  - instantiating Map output class (validation run)",
            "  - Note: if needed, validation of json schema keywords can be deactivated via a SchemaConfiguration class",
            "- Enums classes are generated and may be input into Schema.validate or the List/MapBuilder add/setter methods",
            "- The [Checker-Framework's](https://github.com/typetools/checker-framework) NullnessChecker and @Nullable annotations are used in the java client",
            "  - ensuring that null pointer exceptions will not happen",
            "- Invalid (in java) property names supported like `class`, `1var`, `hi-there` etc in",
            "  - component schema names",
            "  - schema property names (a fallback setter is written in the MapBuilder)",
            "- Generated interfaces are largely consistent with the python code",
            "- Openapi spec inline schemas supported at any depth in any location",
            "- Format support for: int32, int64, float, double, date, datetime, uuid",
            "- Payload values are not coerced when validated, so a date/date-time value can pass other validations that describe the payload only as type string",
            "- enum types are generated for enums of type string/integer/number/boolean/null",
            "- String transmission of numbers supported with type: string, format: number"
        ))
        .postGenerationMsg(defaultPostGenerationMsg)
        .reservedWords(
            getLowerCaseWords(
                Arrays.asList(
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
                    "native", "super", "while", "null",
                    // additional types
                    "localdate", "zoneddatetime", "list", "map", "linkedhashset", "void", "string", "uuid", "number", "integer", "toString"
                )
            )
        )
        .instantiationTypes(
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>("object", "FrozenMap"),
                new AbstractMap.SimpleEntry<>("array", "FrozenList"),
                new AbstractMap.SimpleEntry<>("string", "String"),
                new AbstractMap.SimpleEntry<>("number", "Number (int, long, float, double)"),
                new AbstractMap.SimpleEntry<>("integer", "Number (int, long, float with integer values, double with integer values)"),
                new AbstractMap.SimpleEntry<>("boolean", "boolean"),
                new AbstractMap.SimpleEntry<>("null", "Void (null)")
            )
        )
    .build();

    @Override
    public GeneratorMetadata getGeneratorMetadata() {
        return generatorMetadata;
    }

    @Override
    public String toModuleFilename(String name, String jsonPath) {
        String usedName = sanitizeName(name, "[^a-zA-Z0-9]+");
        // todo check if empty and if so them use enum name
        // todo fix this, this does not handle names starting with numbers
        usedName = usedName.toLowerCase(Locale.ROOT);
        if (usedName.isEmpty()) {
            usedName = toEnumVarName(name, null).toLowerCase(Locale.ROOT);
        }
        return usedName;
    }

    protected void updateServersFilepath(String[] pathPieces) {
        String[] copiedPathPieces = pathPieces.clone();
        copiedPathPieces[0] = "#";
        String jsonPath = String.join("/", copiedPathPieces);
        if (pathPieces.length == 2) {
            // #/servers
            pathPieces[1] = "RootServerInfo";
        } else if (pathPieces.length == 3) {
            // #/servers/0
            pathPieces[2] = getFilename(CodegenKeyType.SERVER, pathPieces[2], jsonPath);
        } else {
            // #/servers/0/variables
            pathPieces[2] = getFilename(CodegenKeyType.SERVER, pathPieces[2], jsonPath).toLowerCase(Locale.ROOT);
            pathPieces[3] = getFilename(CodegenKeyType.SCHEMA, pathPieces[pathPieces.length-1], jsonPath);
        }
    }

    public String packagePath() {
        return "src" + File.separatorChar + "main" + File.separatorChar + "java" + File.separatorChar + generatorSettings.packageName.replace('.', File.separatorChar);
    }

    protected String testPackagePath() {
        return "src" + File.separatorChar + "test" + File.separatorChar + "java" + File.separatorChar + generatorSettings.packageName.replace('.', File.separatorChar);
    }

    @Override
    public void processOpts() {
        if (StringUtils.isEmpty(System.getenv("JAVA_POST_PROCESS_FILE"))) {
            LOGGER.info("Environment variable JAVA_POST_PROCESS_FILE not defined so the Java code may not be properly formatted. To define it, try 'export JAVA_POST_PROCESS_FILE=\"/usr/local/bin/clang-format -i\"' (Linux/Mac)");
            LOGGER.info("NOTE: To enable file post-processing, 'enablePostProcessFile' must be set to `true` (--enable-post-process-file for CLI).");
        }

        if (additionalProperties.containsKey(CodegenConstants.INVOKER_PACKAGE)) {
            this.setInvokerPackage((String) additionalProperties.get(CodegenConstants.INVOKER_PACKAGE));
        } else if (additionalProperties.containsKey(CodegenConstants.API_PACKAGE)) {
            // guess from api package
            String derivedInvokerPackage = deriveInvokerPackageName((String) additionalProperties.get(CodegenConstants.API_PACKAGE));
            this.additionalProperties.put(CodegenConstants.INVOKER_PACKAGE, derivedInvokerPackage);
            this.setInvokerPackage((String) additionalProperties.get(CodegenConstants.INVOKER_PACKAGE));
            LOGGER.info("Invoker Package Name, originally not set, is now derived from api package name: {}", derivedInvokerPackage);
        } else {
            //not set, use default to be passed to template
            additionalProperties.put(CodegenConstants.INVOKER_PACKAGE, invokerPackage);
        }

        if (!additionalProperties.containsKey(CodegenConstants.API_PACKAGE)) {
            additionalProperties.put(CodegenConstants.API_PACKAGE, generatorSettings().apiPackage);
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

        if (additionalProperties.containsKey(CodegenConstants.PARENT_GROUP_ID)) {
            this.setParentGroupId((String) additionalProperties.get(CodegenConstants.PARENT_GROUP_ID));
        }

        if (additionalProperties.containsKey(CodegenConstants.PARENT_ARTIFACT_ID)) {
            this.setParentArtifactId((String) additionalProperties.get(CodegenConstants.PARENT_ARTIFACT_ID));
        }

        if (additionalProperties.containsKey(CodegenConstants.PARENT_VERSION)) {
            this.setParentVersion((String) additionalProperties.get(CodegenConstants.PARENT_VERSION));
        }

        if (!StringUtils.isEmpty(parentGroupId) && !StringUtils.isEmpty(parentArtifactId) && !StringUtils.isEmpty(parentVersion)) {
            additionalProperties.put("parentOverridden", true);
        }

        // make api and model doc path available in mustache template
        additionalProperties.put("apiDocPath", apiDocPath);
        additionalProperties.put("modelDocPath", modelDocPath);

        this.sanitizeConfig();

        if (additionalProperties.containsKey(TEST_OUTPUT)) {
            setOutputTestFolder(additionalProperties.get(TEST_OUTPUT).toString());
        }

        additionalProperties.put(CodegenConstants.PACKAGE_NAME, generatorSettings.packageName);
        List<String> schemaSupportingFiles = new ArrayList<>();
        schemaSupportingFiles.add("AnyTypeJsonSchema");
        schemaSupportingFiles.add("BooleanJsonSchema");
        schemaSupportingFiles.add("DateJsonSchema");
        schemaSupportingFiles.add("DateTimeJsonSchema");
        schemaSupportingFiles.add("DecimalJsonSchema");
        schemaSupportingFiles.add("DoubleJsonSchema");
        schemaSupportingFiles.add("FloatJsonSchema");
        schemaSupportingFiles.add("GenericBuilder");
        schemaSupportingFiles.add("Int32JsonSchema");
        schemaSupportingFiles.add("Int64JsonSchema");
        schemaSupportingFiles.add("IntJsonSchema");
        schemaSupportingFiles.add("ListJsonSchema");
        schemaSupportingFiles.add("MapJsonSchema");
        schemaSupportingFiles.add("NotAnyTypeJsonSchema");
        schemaSupportingFiles.add("NullJsonSchema");
        schemaSupportingFiles.add("NumberJsonSchema");
        schemaSupportingFiles.add("SetMaker");
        schemaSupportingFiles.add("StringJsonSchema");
        schemaSupportingFiles.add("UnsetAddPropsSetter");
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
        schemaTestSupportingFiles.add("ListBuilderTest");
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
        keywordValidatorFiles.add("ConstValidator");
        keywordValidatorFiles.add("ContainsValidator");
        keywordValidatorFiles.add("BigDecimalValidator");
        keywordValidatorFiles.add("CustomIsoparser");
        keywordValidatorFiles.add("DefaultValueMethod");
        keywordValidatorFiles.add("DependentRequiredValidator");
        keywordValidatorFiles.add("DependentSchemasValidator");
        keywordValidatorFiles.add("DoubleEnumValidator");
        keywordValidatorFiles.add("DoubleValueMethod");
        keywordValidatorFiles.add("ElseValidator");
        keywordValidatorFiles.add("EnumValidator");
        keywordValidatorFiles.add("ExclusiveMaximumValidator");
        keywordValidatorFiles.add("ExclusiveMinimumValidator");
        keywordValidatorFiles.add("FloatEnumValidator");
        keywordValidatorFiles.add("FloatValueMethod");
        keywordValidatorFiles.add("FormatValidator");
        keywordValidatorFiles.add("FrozenList");
        keywordValidatorFiles.add("FrozenMap");
        keywordValidatorFiles.add("IfValidator");
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
        keywordValidatorFiles.add("MapUtils");
        keywordValidatorFiles.add("MaxContainsValidator");
        keywordValidatorFiles.add("MaximumValidator");
        keywordValidatorFiles.add("MaxItemsValidator");
        keywordValidatorFiles.add("MaxLengthValidator");
        keywordValidatorFiles.add("MaxPropertiesValidator");
        keywordValidatorFiles.add("MinContainsValidator");
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
        keywordValidatorFiles.add("PatternPropertiesValidator");
        keywordValidatorFiles.add("PatternValidator");
        keywordValidatorFiles.add("PrefixItemsValidator");
        keywordValidatorFiles.add("PropertiesValidator");
        keywordValidatorFiles.add("PropertyEntry");
        keywordValidatorFiles.add("PropertyNamesValidator");
        keywordValidatorFiles.add("RequiredValidator");
        keywordValidatorFiles.add("StringEnumValidator");
        keywordValidatorFiles.add("StringSchemaValidator");
        keywordValidatorFiles.add("StringValueMethod");
        keywordValidatorFiles.add("ThenValidator");
        keywordValidatorFiles.add("TypeValidator");
        keywordValidatorFiles.add("UnevaluatedItemsValidator");
        keywordValidatorFiles.add("UnevaluatedPropertiesValidator");
        keywordValidatorFiles.add("UniqueItemsValidator");
        keywordValidatorFiles.add("UnsetAnyTypeJsonSchema");
        keywordValidatorFiles.add("ValidationData");
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
        exceptionClasses.add("ApiException");
        exceptionClasses.add("BaseException");
        exceptionClasses.add("InvalidAdditionalPropertyException");
        exceptionClasses.add("NotImplementedException");
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
        supportingFiles.add(new SupportingFile(
                "src/main/java/packagename/configurations/ApiConfiguration.hbs",
                packagePath() + File.separatorChar + "configurations",
                "ApiConfiguration.java"));
        // requestbody
        supportingFiles.add(new SupportingFile(
                "src/main/java/packagename/requestbody/GenericRequestBody.hbs",
                packagePath() + File.separatorChar + "requestbody",
                "GenericRequestBody.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/packagename/requestbody/RequestBodySerializer.hbs",
                packagePath() + File.separatorChar + "requestbody",
                "RequestBodySerializer.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/packagename/requestbody/SerializedRequestBody.hbs",
                packagePath() + File.separatorChar + "requestbody",
                "SerializedRequestBody.java"));
        supportingFiles.add(new SupportingFile(
                "src/test/java/packagename/requestbody/RequestBodySerializerTest.hbs",
                testPackagePath() + File.separatorChar + "requestbody",
                "RequestBodySerializerTest.java"));
        // mediatype
        supportingFiles.add(new SupportingFile(
                "src/main/java/packagename/mediatype/MediaType.hbs",
                packagePath() + File.separatorChar + "mediatype",
                "MediaType.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/packagename/mediatype/Encoding.hbs",
                packagePath() + File.separatorChar + "mediatype",
                "Encoding.java"));
        // contenttype
        supportingFiles.add(new SupportingFile(
                "src/main/java/packagename/contenttype/ContentTypeDetector.hbs",
                packagePath() + File.separatorChar + "contenttype",
                "ContentTypeDetector.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/packagename/contenttype/ContentTypeSerializer.hbs",
                packagePath() + File.separatorChar + "contenttype",
                "ContentTypeSerializer.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/packagename/contenttype/ContentTypeDeserializer.hbs",
                packagePath() + File.separatorChar + "contenttype",
                "ContentTypeDeserializer.java"));
        // header
        supportingFiles.add(new SupportingFile(
                "src/main/java/packagename/header/Header.hbs",
                packagePath() + File.separatorChar + "header",
                "Header.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/packagename/header/HeaderBase.hbs",
                packagePath() + File.separatorChar + "header",
                "HeaderBase.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/packagename/header/SchemaHeader.hbs",
                packagePath() + File.separatorChar + "header",
                "SchemaHeader.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/packagename/header/ContentHeader.hbs",
                packagePath() + File.separatorChar + "header",
                "ContentHeader.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/packagename/header/StyleSerializer.hbs",
                packagePath() + File.separatorChar + "header",
                "StyleSerializer.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/packagename/header/Rfc6570Serializer.hbs",
                packagePath() + File.separatorChar + "header",
                "Rfc6570Serializer.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/packagename/header/PrefixSeparatorIterator.hbs",
                packagePath() + File.separatorChar + "header",
                "PrefixSeparatorIterator.java"));
        supportingFiles.add(new SupportingFile(
                "src/test/java/packagename/header/SchemaHeaderTest.hbs",
                testPackagePath() + File.separatorChar + "header",
                "SchemaHeaderTest.java"));
        supportingFiles.add(new SupportingFile(
                "src/test/java/packagename/header/ContentHeaderTest.hbs",
                testPackagePath() + File.separatorChar + "header",
                "ContentHeaderTest.java"));

        // parameter
        supportingFiles.add(new SupportingFile(
                "src/main/java/packagename/parameter/ContentParameter.hbs",
                packagePath() + File.separatorChar + "parameter",
                "ContentParameter.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/packagename/parameter/CookieSerializer.hbs",
                packagePath() + File.separatorChar + "parameter",
                "CookieSerializer.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/packagename/parameter/HeadersSerializer.hbs",
                packagePath() + File.separatorChar + "parameter",
                "HeadersSerializer.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/packagename/parameter/Parameter.hbs",
                packagePath() + File.separatorChar + "parameter",
                "Parameter.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/packagename/parameter/ParameterBase.hbs",
                packagePath() + File.separatorChar + "parameter",
                "ParameterBase.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/packagename/parameter/ParameterInType.hbs",
                packagePath() + File.separatorChar + "parameter",
                "ParameterInType.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/packagename/parameter/ParameterStyle.hbs",
                packagePath() + File.separatorChar + "parameter",
                "ParameterStyle.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/packagename/parameter/PathSerializer.hbs",
                packagePath() + File.separatorChar + "parameter",
                "PathSerializer.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/packagename/parameter/QuerySerializer.hbs",
                packagePath() + File.separatorChar + "parameter",
                "QuerySerializer.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/packagename/parameter/SchemaParameter.hbs",
                packagePath() + File.separatorChar + "parameter",
                "SchemaParameter.java"));
        supportingFiles.add(new SupportingFile(
                "src/test/java/packagename/parameter/CookieSerializerTest.hbs",
                testPackagePath() + File.separatorChar + "parameter",
                "CookieSerializerTest.java"));
        supportingFiles.add(new SupportingFile(
                "src/test/java/packagename/parameter/HeadersSerializerTest.hbs",
                testPackagePath() + File.separatorChar + "parameter",
                "HeadersSerializerTest.java"));
        supportingFiles.add(new SupportingFile(
                "src/test/java/packagename/parameter/PathSerializerTest.hbs",
                testPackagePath() + File.separatorChar + "parameter",
                "PathSerializerTest.java"));
        supportingFiles.add(new SupportingFile(
                "src/test/java/packagename/parameter/QuerySerializerTest.hbs",
                testPackagePath() + File.separatorChar + "parameter",
                "QuerySerializerTest.java"));
        supportingFiles.add(new SupportingFile(
                "src/test/java/packagename/parameter/SchemaNonQueryParameterTest.hbs",
                testPackagePath() + File.separatorChar + "parameter",
                "SchemaNonQueryParameterTest.java"));
        supportingFiles.add(new SupportingFile(
                "src/test/java/packagename/parameter/SchemaQueryParameterTest.hbs",
                testPackagePath() + File.separatorChar + "parameter",
                "SchemaQueryParameterTest.java"));
        // apiclient
        supportingFiles.add(new SupportingFile(
            "src/main/java/packagename/apiclient/ApiClient.hbs",
            packagePath() + File.separatorChar + "apiclient",
            "ApiClient.java"));
        // restclient
        supportingFiles.add(new SupportingFile(
            "src/main/java/packagename/restclient/RestClient.hbs",
            packagePath() + File.separatorChar + "restclient",
            "RestClient.java"));

        // response
        supportingFiles.add(new SupportingFile(
                "src/main/java/packagename/response/ApiResponse.hbs",
                packagePath() + File.separatorChar + "response",
                "ApiResponse.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/packagename/response/DeserializedHttpResponse.hbs",
                packagePath() + File.separatorChar + "response",
                "DeserializedHttpResponse.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/packagename/response/HeadersDeserializer.hbs",
                packagePath() + File.separatorChar + "response",
                "HeadersDeserializer.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/packagename/response/ResponseDeserializer.hbs",
                packagePath() + File.separatorChar + "response",
                "ResponseDeserializer.java"));
        supportingFiles.add(new SupportingFile(
                "src/main/java/packagename/response/ResponsesDeserializer.hbs",
                packagePath() + File.separatorChar + "response",
                "ResponsesDeserializer.java"));
        supportingFiles.add(new SupportingFile(
                "src/test/java/packagename/response/ResponseDeserializerTest.hbs",
                testPackagePath() + File.separatorChar + "response",
                "ResponseDeserializerTest.java"));

        // jsonPaths
        // requestbodies
        jsonPathTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.REQUEST_BODY,
                new HashMap<>() {{
                    put("src/main/java/packagename/components/requestbodies/RequestBody.hbs", ".java");
                }}
        );
        jsonPathDocTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.REQUEST_BODY,
                new HashMap<>() {{
                    put("src/main/java/packagename/components/requestbodies/RequestBodyDoc.hbs", ".md");
                }}
        );
        // header
        jsonPathTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.HEADER,
                new HashMap<>() {{
                    put("src/main/java/packagename/components/headers/Header.hbs", ".java");
                }}
        );
        jsonPathDocTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.HEADER,
                new HashMap<>() {{
                    put("src/main/java/packagename/components/headers/HeaderDoc.hbs", ".md");
                }}
        );
        // parameter
        jsonPathTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.PARAMETER,
                new HashMap<>() {{
                    put("src/main/java/packagename/components/parameter/Parameter.hbs", ".java");
                }}
        );
        jsonPathTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.PARAMETERS,
                new HashMap<>() {{
                    put("src/main/java/packagename/paths/path/verb/Parameters.hbs", ".java");
                }}
        );
        jsonPathDocTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.PARAMETER,
                new HashMap<>() {{
                    put("src/main/java/packagename/components/parameter/ParameterDoc.hbs", ".md");
                }}
        );
        // responses
        jsonPathTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.RESPONSE,
                new HashMap<>() {{
                    put("src/main/java/packagename/components/responses/Response.hbs", ".java");
                }}
        );
        jsonPathTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.RESPONSES,
                new HashMap<>() {{
                    put("src/main/java/packagename/paths/path/verb/Responses.hbs", ".java");
                }}
        );
        jsonPathDocTemplateFiles.put(
            CodegenConstants.JSON_PATH_LOCATION_TYPE.RESPONSES,
            new HashMap<>() {{
                put("src/main/java/packagename/paths/path/verb/ResponsesDoc.hbs", ".md");
            }}
        );
        jsonPathDocTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.RESPONSE,
                new HashMap<>() {{
                    put("src/main/java/packagename/components/responses/ResponseDoc.hbs", ".md");
                }}
        );
        jsonPathTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.HEADERS,
                new HashMap<>() {{
                    put("src/main/java/packagename/components/responses/HeadersDeserializer.hbs", ".java");
                }}
        );
        // operation
        jsonPathTemplateFiles.put(
            CodegenConstants.JSON_PATH_LOCATION_TYPE.OPERATION,
            new HashMap<>() {{
                put("src/main/java/packagename/paths/path/verb/Operation.hbs", ".java");
            }}
        );
        jsonPathDocTemplateFiles.put(
            CodegenConstants.JSON_PATH_LOCATION_TYPE.OPERATION,
            new HashMap<>() {{
                put("src/main/java/packagename/paths/path/verb/OperationDoc.hbs", ".md");
            }}
        );
        // path
        jsonPathTemplateFiles.put(
            CodegenConstants.JSON_PATH_LOCATION_TYPE.PATH,
            new HashMap<>() {{
                put("src/main/java/packagename/paths/path/PathItem.hbs", ".java");
            }}
        );
        // apis
        jsonPathTemplateFiles.put(
            CodegenConstants.JSON_PATH_LOCATION_TYPE.API_PATH,
            new HashMap<>() {{
                put("src/main/java/packagename/apis/paths/Api.hbs", ".java");
            }}
        );
        jsonPathDocTemplateFiles.put(
            CodegenConstants.JSON_PATH_LOCATION_TYPE.API_PATH,
            new HashMap<>() {{
                put("src/main/java/packagename/apis/paths/ApiDoc.hbs", ".md");
            }}
        );
        jsonPathTemplateFiles.put(
            CodegenConstants.JSON_PATH_LOCATION_TYPE.API_TAG,
            new HashMap<>() {{
                put("src/main/java/packagename/apis/tags/Api.hbs", ".java");
            }}
        );
        jsonPathDocTemplateFiles.put(
            CodegenConstants.JSON_PATH_LOCATION_TYPE.API_TAG,
            new HashMap<>() {{
                put("src/main/java/packagename/apis/tags/ApiDoc.hbs", ".md");
            }}
        );

        // schema
        HashMap<String, String> schemaTemplates = new HashMap<>();
        schemaTemplates.put("src/main/java/packagename/components/schemas/Schema.hbs", ".java");
        jsonPathTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.SCHEMA,
                schemaTemplates
        );
        jsonPathDocTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.SCHEMA,
                new HashMap<>() {{
                    put("src/main/java/packagename/components/schemas/Schema_doc.hbs", ".md");
                }}
        );

        super.processOpts();

        authFolder = (sourceFolder + '/' + invokerPackage + ".auth").replace(".", "/");

        //Common files
        supportingFiles.add(new SupportingFile("pom.hbs", "", "pom.xml").doNotOverwrite());
        supportingFiles.add(new SupportingFile("README.hbs", "", "README.md").doNotOverwrite());
    }

    @Override
    public void postProcessModelProperty(CodegenSchema model, CodegenSchema property) {
        super.postProcessModelProperty(model, property);
    }

    @Override
    public Map<String, Object> postProcessSupportingFileData(Map<String, Object> data) {
        generateYAMLSpecFile(data);
        return super.postProcessSupportingFileData(data);
    }

    @Override
    public String toApiVarName(String name) {
        String apiVarName = super.toApiVarName(name);
        if (generatorMetadata.getReservedWords().contains(apiVarName)) {
            apiVarName = escapeReservedWord(apiVarName);
        }
        return apiVarName;
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
    public String toModelFilename(String name, String jsonPath) {
        return toModelName(name, jsonPath);
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

    protected String getCamelCaseName(String key) {
        String usedName = toEnumVarName(key, new StringSchema());
        if (!isValid(usedName)) {
            usedName = "set_" + usedName;
        }
        usedName = camelize(usedName.toLowerCase(Locale.ROOT), true);
        return usedName;
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

    private String getSchemaPascalCaseName(String name, @NotNull String sourceJsonPath, boolean useCache) {
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
        String[] pathPieces = sourceJsonPath.split("/");


        String lastFragment = pathPieces[pathPieces.length-1];
        boolean operationParametersSchema = (sourceJsonPath.startsWith("#/paths/") && xParameters.contains(lastFragment) && xParameters.contains(name));
        boolean serverVariables = (lastFragment.equals("variables") && Set.of(4,6,7).contains(pathPieces.length) && name.equals("variables"));
        if (sourceJsonPath.endsWith("/schema")) {
            if (sourceJsonPath.startsWith("#/paths") && sourceJsonPath.contains("/parameters/")) {
                if (pathPieces[3].equals("parameters")) {
                    // #/paths/path/parameters/0/Schema -> PathParamSchema0
                    usedKey = "RouteParam" + camelize(usedKey) + pathPieces[4]; // RouteParamSchema0
                } else {
                    // #/paths/path/get/parameters/0/Schema -> Schema0
                    usedKey = camelize(usedKey) + pathPieces[5]; // Schema0
                }
            } else if (
                    (sourceJsonPath.startsWith("#/paths") && sourceJsonPath.contains("/headers/")) ||
                    sourceJsonPath.startsWith("#/components/headers/") ||
                    (sourceJsonPath.startsWith("#/components/responses/") && sourceJsonPath.contains("/headers/"))
                ) {
                if (pathPieces[2].equals("headers")) {
                    // #/components/headers/someHeader/schema -> SomeHeaderSchema
                    String headerFragment = pathPieces[3];
                    usedKey =  camelize(headerFragment)+ camelize(usedKey);
                } else if (sourceJsonPath.startsWith("#/components/responses/") && sourceJsonPath.contains("/headers/")) {
                    // #/components/responses/SomeResponse/headers/someHeader/schema
                    String headerFragment = pathPieces[5];
                    usedKey =  camelize(headerFragment) + camelize(usedKey);
                } else {
                    // #/paths/path/verb/responses/SomeResponse/headers/someHeader/schema
                    String headerFragment = pathPieces[7];
                    usedKey =  camelize(headerFragment)+ camelize(usedKey);
                }
            } else if (pathPieces[pathPieces.length-3].equals("content")) {
                // #/requestBodies/SomeRequestBody/content/application-json/schema
                String contentTypeFragment = pathPieces[pathPieces.length-2];
                String prefix = ModelUtils.decodeSlashes(contentTypeFragment);
                prefix = sanitizeName(prefix, "[^a-zA-Z0-9]+");
                prefix = camelize(prefix);
                usedKey = prefix + camelize(usedKey);
            }
        } else if (sourceJsonPath.endsWith(headersSchemaFragment) && pathPieces[pathPieces.length-3].equals("responses")) {
            // #/components/responses/SomeResponse/HeadersSchema
            // #/paths/path/verb/responses/200/HeadersSchema
            String responseJsonPath = String.join("/", Arrays.copyOfRange(pathPieces, 0, pathPieces.length-1));
            String responseFragment = pathPieces[pathPieces.length-2];
            String pascalCaseResponse = getPascalCase(CodegenKeyType.RESPONSE, responseFragment, responseJsonPath);
            usedKey =  pascalCaseResponse + camelize(usedKey);
        } else if (operationParametersSchema) {
            String prefix = getPathClassNamePrefix(sourceJsonPath);
            usedKey = prefix + lastFragment;
        } else if (serverVariables) {
            if (pathPieces.length == 4) {
                // #/servers/0/variables -> 4
                usedKey = "RootServer" + pathPieces[2] + "Variables";
            } else if (pathPieces.length == 6) {
                // #/paths/somePath/servers/0/variables -> 6
                CodegenKey pathKey = getKey(ModelUtils.decodeSlashes(pathPieces[2]), "paths", sourceJsonPath);
                usedKey = pathKey.pascalCase + "Server" + pathPieces[4] + "Variables";
            } else {
                // #/paths/somePath/get/servers/0/variables -> 7
                String prefix = getPathClassNamePrefix(sourceJsonPath);
                usedKey = prefix + "Server" + pathPieces[5] + "Variables";
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
                int schemaNumber = qty-1;
                suffix = Integer.toString(schemaNumber);
            }
            if (qty == 1 && sourceJsonPath.endsWith("/" + name)) {
                schemaJsonPathToModelName.put(sourceJsonPath, usedKey);
            }
            usedKey = usedKey + suffix;
            return usedKey;
        }
        return usedKey;
    }

    protected CodegenKey getContainerJsonPathPiece(String expectedComponentType, String currentJsonPath, String sourceJsonPath) {
        return getJsonPathPiece(expectedComponentType, currentJsonPath, sourceJsonPath);
    }

    private static boolean isInteger(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        if (str.charAt(0) == '-') {
            if (length == 1) {
                return false;
            }
            i = 1;
        }
        for (; i < length; i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    private String toSchemaRefClass(String ref, String sourceJsonPath) {
        int schemaSuffix = 1;
        String[] refPieces = ref.split("/");
        if (ref.equals(sourceJsonPath)) {
            // self reference, no import needed
            if (ref.startsWith("#/components/schemas/") && refPieces.length == 4) {
                return getFilename(CodegenKeyType.SCHEMA, refPieces[refPieces.length-1], ref)+schemaSuffix;
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
            if (getFilePath(GeneratedFileType.CODE, sourceJsonPath).equals(getFilePath(GeneratedFileType.CODE, ref))) {
                // TODO ensure that getFilepath returns the same file for somePath/get/QueryParameters
                // TODO ensure that getFilepath returns the same file for schemas/SomeSchema...
                return null;
            }
        }
        return getFilename(CodegenKeyType.SCHEMA, refPieces[refPieces.length-1], ref)+schemaSuffix;
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
        String filePath = getFilePath(GeneratedFileType.CODE, ref);
        String prefix = generatorSettings.outputFolder + File.separatorChar + "src" + File.separatorChar + "main" + File.separatorChar + "java" + File.separatorChar;
        // modules are always in a package one above them, so strip off the last jsonPath fragment
        String localFilepath = filePath.substring(prefix.length(), filePath.lastIndexOf(File.separatorChar));
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
            if (deepestRefSchemaImportNeeded) {
                CodegenRefInfo<CodegenSchema> deepestRefInfo = schema.refInfo;
                while (deepestRefInfo.ref.refInfo != null) {
                    deepestRefInfo = deepestRefInfo.ref.refInfo;
                }
                imports.addAll(getDeeperImports(sourceJsonPath, deepestRefInfo.ref));
            } else {
                imports.addAll(getDeeperImports(sourceJsonPath, ref));
            }
            // todo remove this when 3.1.0 ref + types is supported
            return imports;
        }
        if (schema.types != null) {
            if (schema.types.contains("array")) {
                imports.add("import java.util.List;");
                imports.add("import "+ generatorSettings.packageName + ".schemas.validation.FrozenList;");
                if (schema.items != null) {
                    imports.addAll(getDeeperImports(sourceJsonPath, schema.items));
                }
            }
            if (schema.types.contains("object")) {
                imports.add("import java.util.Map;");
                imports.add("import "+ generatorSettings.packageName + ".schemas.validation.FrozenMap;");
                if (schema.mapValueSchema != null) {
                    imports.addAll(getDeeperImports(sourceJsonPath, schema.mapValueSchema));
                }
            }
        } else {
            imports.add("import java.util.List;");
            imports.add("import java.util.Map;");
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
        if (schema.patternProperties != null && !schema.patternProperties.isEmpty()) {
            for (CodegenSchema cs: schema.patternProperties.values()) {
                imports.addAll(getImports(sourceJsonPath, cs, featureSet));
            }
        }
        if (schema.dependentSchemas != null && !schema.dependentSchemas.isEmpty()) {
            for (CodegenSchema cs: schema.dependentSchemas.values()) {
                imports.addAll(getImports(sourceJsonPath, cs, featureSet));
            }
        }
        if (schema.unevaluatedItems != null) {
            imports.addAll(getImports(sourceJsonPath, schema.unevaluatedItems, featureSet));
        }
        if (schema.if_ != null) {
            imports.addAll(getImports(sourceJsonPath, schema.if_, featureSet));
        }
        if (schema.then != null) {
            imports.addAll(getImports(sourceJsonPath, schema.then, featureSet));
        }
        if (schema.else_ != null) {
            imports.addAll(getImports(sourceJsonPath, schema.else_, featureSet));
        }
        if (schema.contains != null) {
            imports.addAll(getImports(sourceJsonPath, schema.contains, featureSet));
        }
        if (schema.unevaluatedProperties != null) {
            imports.addAll(getImports(sourceJsonPath, schema.unevaluatedProperties, featureSet));
        }
        if (schema.propertyNames != null) {
            imports.addAll(getImports(sourceJsonPath, schema.propertyNames, featureSet));
        }
        if (schema.prefixItems != null && !schema.prefixItems.isEmpty()) {
            for (CodegenSchema cs: schema.prefixItems) {
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
                        imports.add("import "+ generatorSettings.packageName + ".schemas.BooleanJsonSchema;");
                        imports.add("import org.checkerframework.checker.nullness.qual.Nullable;");
                    } else {
                        addCustomSchemaImports(imports, schema);
                        imports.add("import java.util.Set;");
                        addBooleanSchemaImports(imports, schema);
                    }
                } else if (schema.types.contains("null")) {
                    if (schema.isSimpleNull()) {
                        imports.add("import "+generatorSettings.packageName + ".schemas.NullJsonSchema;");
                        imports.add("import org.checkerframework.checker.nullness.qual.Nullable;");
                    } else {
                        addCustomSchemaImports(imports, schema);
                        imports.add("import java.util.Set;");
                        addNullSchemaImports(imports, schema);
                    }
                } else if (schema.types.contains("integer")) {
                    if (schema.isSimpleInteger()) {
                        imports.add("import org.checkerframework.checker.nullness.qual.Nullable;");
                        if (schema.format == null || schema.format.equals("int")) {
                            imports.add("import "+generatorSettings.packageName + ".schemas.IntJsonSchema;");
                        } else if (schema.format.equals("int32")) {
                            imports.add("import "+generatorSettings.packageName + ".schemas.Int32JsonSchema;");
                        } else if (schema.format.equals("int64")) {
                            imports.add("import "+generatorSettings.packageName + ".schemas.Int64JsonSchema;");
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
                            imports.add("import "+generatorSettings.packageName + ".schemas.NumberJsonSchema;");
                        } else if (schema.format.equals("int32")) {
                            imports.add("import "+generatorSettings.packageName + ".schemas.Int32JsonSchema;");
                        } else if (schema.format.equals("int64")) {
                            imports.add("import "+generatorSettings.packageName + ".schemas.Int64JsonSchema;");
                        } else if (schema.format.equals("float")) {
                            imports.add("import "+generatorSettings.packageName + ".schemas.FloatJsonSchema;");
                        } else if (schema.format.equals("double")) {
                            imports.add("import "+generatorSettings.packageName + ".schemas.DoubleJsonSchema;");
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
                            imports.add("import "+generatorSettings.packageName + ".schemas.StringJsonSchema;");
                        } else if (schema.format.equals("date")) {
                            imports.add("import "+generatorSettings.packageName + ".schemas.DateJsonSchema;");
                        } else if (schema.format.equals("date-time")) {
                            imports.add("import "+generatorSettings.packageName + ".schemas.DateTimeJsonSchema;");
                        } else if (schema.format.equals("number")) {
                            imports.add("import "+generatorSettings.packageName + ".schemas.DecimalJsonSchema;");
                        } else if (schema.format.equals("uuid")) {
                            imports.add("import "+generatorSettings.packageName + ".schemas.UuidJsonSchema;");
                        } else if (schema.format.equals("byte")) {
                            // todo implement this
                            imports.add("import "+generatorSettings.packageName + ".schemas.StringJsonSchema;");
                        } else if (schema.format.equals("binary")) {
                            // todo implement this
                            imports.add("import "+generatorSettings.packageName + ".schemas.StringJsonSchema;");
                        }
                    } else {
                        addCustomSchemaImports(imports, schema);
                        imports.add("import java.util.Set;");
                        addStringSchemaImports(imports, schema);
                    }
                } else if (schema.types.contains("object")) {
                    if (schema.isSimpleObject()) {
                        imports.add("import org.checkerframework.checker.nullness.qual.Nullable;");
                        imports.add("import "+generatorSettings.packageName + ".schemas.MapJsonSchema;");
                        // add this in case the 1 higher schema is an array of FrozenMap
                        imports.add("import "+generatorSettings.packageName + ".schemas.validation.FrozenMap;");
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
                        imports.add("import "+generatorSettings.packageName + ".schemas.ListJsonSchema;");
                        // add this in case the 1 higher schema is a map of FrozenList
                        imports.add("import "+generatorSettings.packageName + ".schemas.validation.FrozenList;");
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
                imports.add("import "+generatorSettings.packageName + ".schemas.AnyTypeJsonSchema;");
            } else if (schema.isBooleanSchemaFalse) {
                imports.add("import org.checkerframework.checker.nullness.qual.Nullable;");
                imports.add("import "+generatorSettings.packageName + ".schemas.NotAnyTypeJsonSchema;");
            } else if (schema.isSimpleAnyType()) {
                imports.add("import org.checkerframework.checker.nullness.qual.Nullable;");
                imports.add("import "+generatorSettings.packageName + ".schemas.AnyTypeJsonSchema;");
                // in case higher schema is ListBuilder add List + Map
            } else {
                addCustomSchemaImports(imports, schema);
                imports.add("import java.time.LocalDate;");
                imports.add("import java.time.ZonedDateTime;");
                imports.add("import java.util.UUID;");
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.FrozenList;");
                imports.add("import java.util.List;");
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.FrozenMap;");
                imports.add("import java.util.Map;");
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.NullSchemaValidator;");
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.BooleanSchemaValidator;");
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.NumberSchemaValidator;");
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.StringSchemaValidator;");
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.ListSchemaValidator;");
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.MapSchemaValidator;");
                imports.add("import java.util.LinkedHashMap;");
                imports.add("import java.util.ArrayList;"); // for validate
                addPropertiesImports(schema, imports);
                addRequiredValidator(schema, imports);
                addAllOfValidator(schema, imports);
                addAnyOfValidator(schema, imports);
                addOneOfValidator(schema, imports);
                addEnumValidator(schema, imports);
                addConstImports(schema, imports);
                addPatternValidator(schema, imports);
                addMultipleOfValidator(schema, imports);
                addAdditionalPropertiesImports(schema, imports);
                addDefaultValueImport(schema, imports);
                addDependentRequiredImports(schema, imports);
                addDependentSchemasImports(schema, imports);
                addPatternPropertiesImports(schema, imports);
                if (schema.mapValueSchema != null) {
                    imports.addAll(getDeeperImports(sourceJsonPath, schema.mapValueSchema));
                }
                if (schema.items != null) {
                    imports.addAll(getDeeperImports(sourceJsonPath, schema.items));
                }
                if (schema.additionalProperties == null || !schema.additionalProperties.isBooleanSchemaFalse) {
                    imports.add("import "+generatorSettings.packageName + ".exceptions.UnsetPropertyException;");
                    imports.add("import "+generatorSettings.packageName + ".exceptions.InvalidAdditionalPropertyException;");
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

    private void addDefaultValueImport(CodegenSchema schema, Set<String> imports) {
        if (schema.defaultValue != null) {
            imports.add("import "+generatorSettings.packageName + ".schemas.validation.DefaultValueMethod;");
        }
    }


    private void addEnumValidator(CodegenSchema schema, Set<String> imports) {
        if (schema.enumInfo != null) {
            imports.add("import "+generatorSettings.packageName + ".schemas.SetMaker;");
            if (schema.enumInfo.typeToValues.containsKey("null")) {
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.NullEnumValidator;");
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.NullValueMethod;");
            }
            if (schema.enumInfo.typeToValues.containsKey("boolean")) {
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.BooleanEnumValidator;");
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.BooleanValueMethod;");
            }
            if (schema.enumInfo.typeToValues.containsKey("string")) {
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.StringEnumValidator;");
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.StringValueMethod;");
            }
            if (schema.enumInfo.typeToValues.containsKey("Integer")) {
                imports.add("import java.math.BigDecimal;");
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.IntegerEnumValidator;");
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.IntegerValueMethod;");
            }
            if (schema.enumInfo.typeToValues.containsKey("Long")) {
                imports.add("import java.math.BigDecimal;");
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.LongEnumValidator;");
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.LongValueMethod;");
            }
            if (schema.enumInfo.typeToValues.containsKey("Float")) {
                imports.add("import java.math.BigDecimal;");
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.FloatEnumValidator;");
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.FloatValueMethod;");
            }
            if (schema.enumInfo.typeToValues.containsKey("Double")) {
                imports.add("import java.math.BigDecimal;");
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.DoubleEnumValidator;");
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.DoubleValueMethod;");
            }
        }
    }

    private void addConstImports(CodegenSchema schema, Set<String> imports) {
        if (schema.constInfo != null) {
            if (schema.constInfo.typeToValues.containsKey("null")) {
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.NullEnumValidator;");
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.NullValueMethod;");
            }
            if (schema.constInfo.typeToValues.containsKey("boolean")) {
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.BooleanEnumValidator;");
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.BooleanValueMethod;");
            }
            if (schema.constInfo.typeToValues.containsKey("string")) {
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.StringEnumValidator;");
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.StringValueMethod;");
            }
            if (schema.constInfo.typeToValues.containsKey("Integer")) {
                imports.add("import java.math.BigDecimal;");
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.IntegerEnumValidator;");
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.IntegerValueMethod;");
            }
            if (schema.constInfo.typeToValues.containsKey("Long")) {
                imports.add("import java.math.BigDecimal;");
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.LongEnumValidator;");
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.LongValueMethod;");
            }
            if (schema.constInfo.typeToValues.containsKey("Float")) {
                imports.add("import java.math.BigDecimal;");
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.FloatEnumValidator;");
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.FloatValueMethod;");
            }
            if (schema.constInfo.typeToValues.containsKey("Double")) {
                imports.add("import java.math.BigDecimal;");
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.DoubleEnumValidator;");
                imports.add("import "+generatorSettings.packageName + ".schemas.validation.DoubleValueMethod;");
            }
        }
    }

    private void addPropertiesImports(CodegenSchema schema, Set<String> imports) {
        if (schema.properties != null) {
            imports.add("import " + generatorSettings.packageName + ".schemas.validation.PropertyEntry;");
            imports.add("import java.util.Map;");
            imports.add("import java.util.Set;");
            imports.add("import " + generatorSettings.packageName + ".exceptions.UnsetPropertyException;");
            imports.add("import " + generatorSettings.packageName + ".schemas.GenericBuilder;");
        }
    }

    private void addPatternPropertiesImports(CodegenSchema schema, Set<String> imports) {
        if (schema.patternProperties != null) {
            imports.add("import java.util.AbstractMap;");
            imports.add("import java.util.Map;");
            imports.add("import java.util.regex.Pattern;");
        }
    }

    private void addDependentSchemasImports(CodegenSchema schema, Set<String> imports) {
        if (schema.dependentSchemas != null) {
            imports.add("import " + generatorSettings.packageName + ".schemas.validation.PropertyEntry;");
            imports.add("import java.util.Map;");
        }
    }

    private void addDependentRequiredImports(CodegenSchema schema, Set<String> imports) {
        if (schema.dependentRequired != null) {
            imports.add("import "+generatorSettings.packageName + ".schemas.validation.MapUtils;");
            imports.add("import java.util.AbstractMap;");
            imports.add("import "+generatorSettings.packageName + ".schemas.SetMaker;");
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

    private void addAdditionalPropertiesImports(CodegenSchema schema, Set<String> imports) {
        if (schema.additionalProperties == null || !schema.additionalProperties.isBooleanSchemaFalse) {
            imports.add("import "+generatorSettings.packageName + ".exceptions.UnsetPropertyException;");
            imports.add("import "+generatorSettings.packageName + ".exceptions.InvalidAdditionalPropertyException;");
        }
        if (schema.additionalProperties != null) {
            imports.add("import "+generatorSettings.packageName + ".schemas.GenericBuilder;");
            imports.add("import "+generatorSettings.packageName + ".schemas.validation.MapUtils;");
        } else {
            imports.add("import "+generatorSettings.packageName + ".schemas.UnsetAddPropsSetter;");
        }
    }


    private void addRequiredValidator(CodegenSchema schema, Set<String> imports) {
        if (schema.requiredProperties != null) {
            imports.add("import java.util.Set;");
            imports.add("import "+generatorSettings.packageName + ".schemas.GenericBuilder;");
        }
    }

    private void addMultipleOfValidator(CodegenSchema schema, Set<String> imports) {
        if (schema.multipleOf != null) {
            imports.add("import java.math.BigDecimal;");
        }
    }

    private void addCustomSchemaImports(Set<String> imports, CodegenSchema schema) {
        imports.add("import " + generatorSettings.packageName + ".schemas.validation.JsonSchema;");
        imports.add("import " + generatorSettings.packageName + ".schemas.validation.JsonSchemaInfo;");
        imports.add("import "+generatorSettings.packageName + ".configurations.SchemaConfiguration;");
        imports.add("import "+generatorSettings.packageName + ".exceptions.ValidationException;");
        imports.add("import java.util.Set;"); // for validate
        imports.add("import java.util.HashSet;"); // for validate
        imports.add("import java.util.Objects;"); // for validate
        imports.add("import java.util.LinkedHashSet;"); // for validate
        imports.add("import java.util.List;"); // for castToAllowedTypes
        imports.add("import "+generatorSettings.packageName + ".schemas.validation.PathToSchemasMap;"); // for getNewInstance
        imports.add("import "+generatorSettings.packageName + ".schemas.validation.ValidationMetadata;"); // for getNewInstance
        imports.add("import "+generatorSettings.packageName + ".configurations.JsonSchemaKeywordFlags;"); // for getNewInstance
        imports.add("import org.checkerframework.checker.nullness.qual.Nullable;");
    }

    private void addBooleanSchemaImports(Set<String> imports, CodegenSchema schema) {
        imports.add("import " + generatorSettings.packageName + ".schemas.validation.BooleanSchemaValidator;");
        addAllOfValidator(schema, imports);
        addAnyOfValidator(schema, imports);
        addOneOfValidator(schema, imports);
        addEnumValidator(schema, imports);
        addDefaultValueImport(schema, imports);
        addConstImports(schema, imports);
    }

    private void addNullSchemaImports(Set<String> imports, CodegenSchema schema) {
        imports.add("import " + generatorSettings.packageName + ".schemas.validation.NullSchemaValidator;");
        addAllOfValidator(schema, imports);
        addAnyOfValidator(schema, imports);
        addOneOfValidator(schema, imports);
        addEnumValidator(schema, imports);
        addDefaultValueImport(schema, imports);
        addConstImports(schema, imports);
    }

    private void addMapSchemaImports(Set<String> imports, CodegenSchema schema) {
        imports.add("import " + generatorSettings.packageName + ".schemas.validation.MapSchemaValidator;");
        imports.add("import "+generatorSettings.packageName + ".schemas.validation.FrozenMap;");
        imports.add("import java.util.Map;");
        imports.add("import java.util.ArrayList;"); // for castToAllowedTypes
        imports.add("import java.util.LinkedHashMap;");
        addRequiredValidator(schema, imports);
        addPropertiesImports(schema, imports);
        addAllOfValidator(schema, imports);
        addAnyOfValidator(schema, imports);
        addOneOfValidator(schema, imports);
        addAdditionalPropertiesImports(schema, imports);
        addDependentRequiredImports(schema, imports);
        addDependentSchemasImports(schema, imports);
        addPatternPropertiesImports(schema, imports);
    }

    private void addListSchemaImports(Set<String> imports, CodegenSchema schema) {
        imports.add("import " + generatorSettings.packageName + ".schemas.validation.ListSchemaValidator;");
        imports.add("import "+generatorSettings.packageName + ".schemas.validation.FrozenList;");
        imports.add("import java.util.List;");
        imports.add("import java.util.ArrayList;"); // for castToAllowedTypes
        imports.add("import java.util.LinkedHashMap;");
        addAllOfValidator(schema, imports);
        addAnyOfValidator(schema, imports);
        addOneOfValidator(schema, imports);
    }

    private void addNumberSchemaImports(Set<String> imports, CodegenSchema schema) {
        imports.add("import " + generatorSettings.packageName + ".schemas.validation.NumberSchemaValidator;");
        addAllOfValidator(schema, imports);
        addAnyOfValidator(schema, imports);
        addOneOfValidator(schema, imports);
        addEnumValidator(schema, imports);
        addMultipleOfValidator(schema, imports);
        addDefaultValueImport(schema, imports);
        addConstImports(schema, imports);
    }

    private void addStringSchemaImports(Set<String> imports, CodegenSchema schema) {
        if (schema.format != null) {
            switch (schema.format) {
                case "date":
                    imports.add("import java.time.LocalDate;");
                    break;
                case "date-time":
                    imports.add("import java.time.ZonedDateTime;");
                    break;
                case "uuid":
                    imports.add("import java.util.UUID;");
                    break;
            }
        }
        imports.add("import " + generatorSettings.packageName + ".schemas.validation.StringSchemaValidator;");
        addAllOfValidator(schema, imports);
        addAnyOfValidator(schema, imports);
        addOneOfValidator(schema, imports);
        addEnumValidator(schema, imports);
        addPatternValidator(schema, imports);
        addDefaultValueImport(schema, imports);
        addConstImports(schema, imports);
    }


    @Override
    public String getImport(CodegenRefInfo<?> refInfo) {
        String prefix = "import " + generatorSettings.packageName + ".components.";
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
        String filePath = getFilePath(GeneratedFileType.CODE, ref);
        String prefix = generatorSettings.outputFolder + File.separatorChar + "src" + File.separatorChar + "main" + File.separatorChar + "java" + File.separatorChar;
        String localFilepath = filePath.substring(prefix.length());
        return localFilepath.replaceAll(String.valueOf(File.separatorChar), ".");
    }

    @Override
    public String getFilePath(GeneratedFileType type, String jsonPath) {
        if (type != GeneratedFileType.TEST) {
            return super.getFilePath(type, jsonPath);
        }
        String[] pathPieces = jsonPath.split("/");
        pathPieces[0] = generatorSettings.outputFolder + File.separatorChar + testPackagePath();
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
    public String toEnumVarName(String value, Schema<?> prop) {
        // our enum var names are keys in a python dict, so change spaces to underscores
        if (value.isEmpty()) {
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
        // replace all invalid characters with their character name descriptions
        Stack<AbstractMap.SimpleEntry<Integer, String>> matchStartToGroup = new Stack<>();
        Pattern nonLetterCharPattern = Pattern.compile("^[^a-zA-Z]");
        Matcher matcher = nonLetterCharPattern.matcher(usedValue);
        while (matcher.find()) {
            matchStartToGroup.add(new AbstractMap.SimpleEntry<>(matcher.start(), matcher.group()));
        }
        Pattern nonWordPattern = Pattern.compile("\\W+");
        matcher = nonWordPattern.matcher(usedValue);
        while (matcher.find()) {
            if (matcher.start() == 0) {
                // skip adding first because it was already added
                continue;
            }
            matchStartToGroup.add(new AbstractMap.SimpleEntry<>(matcher.start(), matcher.group()));
        }
        char underscore = '_';
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
        return codegenSchema -> {
            ArrayList<CodegenSchema> schemasBeforeImports = new ArrayList<>();
            ArrayList<CodegenSchema> schemasAfterImports = new ArrayList<>();
            codegenSchema.getAllSchemas(schemasBeforeImports, schemasAfterImports, 0, true);
            schemasBeforeImports.addAll(schemasAfterImports);
            return schemasBeforeImports;
        };
    }

    private void addToTypeToValue(LinkedHashMap<String, LinkedHashMap<EnumValue, String>> typeToValues, EnumValue enumValue, String type, String name) {
        if (!typeToValues.containsKey(type)) {
            typeToValues.put(type, new LinkedHashMap<>());
        }
        typeToValues.get(type).put(enumValue, name);
    }

    protected EnumInfo getEnumInfo(ArrayList<Object> values, Schema<?> schema, String currentJsonPath, String sourceJsonPath, LinkedHashSet<String> types, String classSuffix) {
        LinkedHashMap<EnumValue, String> enumValueToName = new LinkedHashMap<>();
        LinkedHashMap<String, LinkedHashMap<EnumValue, String>> typeToValues = new LinkedHashMap<>();
        LinkedHashMap<String, EnumValue> enumNameToValue = new LinkedHashMap<>();
        int truncateIdx = 0;

        if (generatorSettings.removeEnumValuePrefix) {
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
                    for (Object item: (List<?>) result) {
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
                    for (Object item: (List<?>) result) {
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
                EnumValue floatEnumValue = getEnumValue(Float.valueOf(value +".0"), description);
                addToTypeToValue(typeToValues, floatEnumValue, "Float", usedName);
                EnumValue doubleEnumValue = getEnumValue(Double.valueOf(value +".0"), description);
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
            EnumValue floatEnumValue = getEnumValue(Float.valueOf(value +".0"), enumValue.description);
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

    protected List<MapBuilder<?>> getOperationBuilders(String jsonPath, CodegenRequestBody requestBody, CodegenParametersInfo parametersInfo, CodegenList<CodegenServer> servers, CodegenList<CodegenSecurityRequirementObject> security) {
        if (requestBody == null && parametersInfo == null && servers == null && security == null) {
            return null;
        }
        int qtyBuilders = 1; // last one with optional params
        int reqPropsSize = 0;
        boolean requestBodyExists = requestBody != null;
        boolean parametersExist = parametersInfo != null;
        List<OperationInputProvider> requiredProperties = new ArrayList<>();
        List<OperationInputProvider> optionalProperties = new ArrayList<>();
        if (requestBodyExists) {
            if (Boolean.TRUE.equals(requestBody.getSelfOrDeepestRef().required)) {
                reqPropsSize += 1;
                requiredProperties.add(requestBody);
            } else {
                optionalProperties.add(requestBody);
            }
        }
        if (parametersExist) {
            if (parametersInfo.headerParametersSchema != null) {
                if (parametersInfo.headerParametersSchema.requiredProperties != null) {
                    reqPropsSize += 1;
                    requiredProperties.add(parametersInfo.headerParametersSchema);
                } else {
                    optionalProperties.add(parametersInfo.headerParametersSchema);
                }
            }
            if (parametersInfo.pathParametersSchema != null) {
                if (parametersInfo.pathParametersSchema.requiredProperties != null) {
                    reqPropsSize += 1;
                    requiredProperties.add(parametersInfo.pathParametersSchema);
                } else {
                    optionalProperties.add(parametersInfo.pathParametersSchema);
                }
            }
            if (parametersInfo.queryParametersSchema != null) {
                if (parametersInfo.queryParametersSchema.requiredProperties != null) {
                    reqPropsSize += 1;
                    requiredProperties.add(parametersInfo.queryParametersSchema);
                } else {
                    optionalProperties.add(parametersInfo.queryParametersSchema);
                }
            }
            if (parametersInfo.cookieParametersSchema != null) {
                if (parametersInfo.cookieParametersSchema.requiredProperties != null) {
                    reqPropsSize += 1;
                    requiredProperties.add(parametersInfo.cookieParametersSchema);
                } else {
                    optionalProperties.add(parametersInfo.cookieParametersSchema);
                }
            }
        }
        if (servers != null) {
            optionalProperties.add(servers);
        }
        if (security != null) {
            optionalProperties.add(security);
        }
        OperationInput timeout = new OperationInput(
            getKey("Duration", "misc"),
            "timeout",
            null
        );
        optionalProperties.add(timeout);

        Map<String, MapBuilder<Object>> bitStrToBuilder = new HashMap<>();
        MapBuilder<Object> lastBuilder = null;
        // builders are built last to first, last builder has build method
        String[] pathPieces = jsonPath.split("/");
        CodegenKey operationKey = getKey(pathPieces[pathPieces.length-1], "misc", jsonPath);
        String builderName = operationKey.pascalCase;
        List<MapBuilder<?>> builders = new ArrayList<>();
        if (requiredProperties.size() > 0) {
            qtyBuilders = (int) Math.pow(2, requiredProperties.size());
        }
        for (int i=0; i < qtyBuilders; i++) {
            String bitStr = "";
            if (reqPropsSize != 0) {
                bitStr = String.format("%"+reqPropsSize+"s", Integer.toBinaryString(i)).replace(' ', '0');
            }
            CodegenKey builderClassName;
            if (i == qtyBuilders - 1) {
                // first invoked builder has the simplest name with no bitStr
                builderClassName = getKey(builderName + "RequestBuilder", "misc", jsonPath);
            } else {
                builderClassName = getKey(builderName + bitStr + "RequestBuilder", "misc", jsonPath);
            }
            MapBuilder<Object> builder;
            if (i == 0) {
                builder = new MapBuilder<>(builderClassName, new LinkedHashMap<>());
                lastBuilder = builder;
            } else {
                LinkedHashMap<CodegenKey, MapBuilder.BuilderPropertyPair<Object>> keyToBuilder = new LinkedHashMap<>();
                for (int c=0; c < reqPropsSize; c++) {
                    if (bitStr.charAt(c) == '1') {
                        StringBuilder nextBuilderBitStr = new StringBuilder(bitStr);
                        nextBuilderBitStr.setCharAt(c, '0');
                        CodegenKey key = getKey(requiredProperties.get(c).operationInputVariableName(), "misc");
                        if (key == null) {
                            throw new RuntimeException("key must exist at c="+c);
                        }
                        MapBuilder<Object> nextBuilder = bitStrToBuilder.get(nextBuilderBitStr.toString());
                        if (nextBuilder == null) {
                            throw new RuntimeException("Next builder must exist for bitStr="+ nextBuilderBitStr);
                        }
                        var pair = new MapBuilder.BuilderPropertyPair<>(nextBuilder, requiredProperties.get(c));
                        keyToBuilder.put(key, pair);
                    }
                }
                builder = new MapBuilder<>(builderClassName, keyToBuilder);
            }
            bitStrToBuilder.put(bitStr, builder);
            builders.add(builder);
        }
        // todo add builder that allows
        if (!optionalProperties.isEmpty()) {
            for (OperationInputProvider property: optionalProperties) {
                var pair = new MapBuilder.BuilderPropertyPair<>(lastBuilder, property);
                CodegenKey key = getKey(property.operationInputVariableName(), "misc");
                lastBuilder.keyToBuilder.put(key, pair);
            }
        }
        return builders;
    }

    private String getPathClassNamePrefix(String jsonPath) {
        // #/paths/somePath/get -> SomepathGet
        String[] pathPieces = jsonPath.split("/");
        String pathJsonPath = "#/paths/"+pathPieces[2];
        String pathClassName = getFilename(CodegenKeyType.PATH, ModelUtils.decodeSlashes(pathPieces[2]), pathJsonPath);
        return pathClassName + StringUtils.capitalize(pathPieces[3]);
    }

    @Override
    public String getPascalCase(CodegenKeyType type, String lastJsonPathFragment, String jsonPath) {
        switch (type) {
            case SCHEMA:
                return getSchemaPascalCaseName(lastJsonPathFragment, jsonPath, true);
            case PATH:
                return camelize(getFilename(CodegenKeyType.PATH, lastJsonPathFragment, jsonPath));
            case REQUEST_BODY:
                if (jsonPath.startsWith("#/paths")) {
                    String prefix = getPathClassNamePrefix(jsonPath);
                    return prefix + "RequestBody";
                }
                return toModelName(lastJsonPathFragment, jsonPath);
            case MISC:
            case HEADER:
            case CONTENT_TYPE:
            case SECURITY_SCHEME:
                return toModelName(lastJsonPathFragment, jsonPath);
            case OPERATION:
                return getFilename(CodegenKeyType.OPERATION, lastJsonPathFragment, jsonPath);
            case PARAMETER:
                return getFilename(CodegenKeyType.PARAMETER, lastJsonPathFragment, jsonPath);
            case RESPONSE:
                if (jsonPath.startsWith("#/components/responses/")) {
                    return toModelName(lastJsonPathFragment, null);
                } else {
                    String prefix = getPathClassNamePrefix(jsonPath);
                    if (jsonPath.endsWith("/responses")) {
                        // #/paths/somePath/get/responses
                        return prefix + "Responses";
                    }
                    // #/paths/somePath/get/responses/200
                    return prefix + "Code" + lastJsonPathFragment + "Response";
                }
            case SERVER:
                String[] pathPieces = jsonPath.split("/");
                if (jsonPath.startsWith("#/servers")) {
                    if (pathPieces.length == 2) {
                        // #/servers
                        return "RootServerInfo";
                    }
                    // #/servers/0
                    return "RootServer"+pathPieces[2];
                } else if (jsonPath.startsWith("#/paths") && pathPieces.length >= 4 && pathPieces[3].equals("servers")) {
                    CodegenKey pathKey = getKey(ModelUtils.decodeSlashes(pathPieces[2]), "paths", jsonPath);
                    if (pathPieces.length == 4) {
                        // #/paths/somePath/servers
                        return pathKey.pascalCase + "ServerInfo";
                    }
                    // #/paths/somePath/servers/0
                    return pathKey.pascalCase + "Server"+ pathPieces[4];
                }
                // jsonPath.startsWith("#/paths") && pathPieces.length >= 5 && pathPieces[4].equals("servers")
                String prefix = getPathClassNamePrefix(jsonPath);
                if (pathPieces.length == 5) {
                    // #/paths/somePath/get/servers
                    return prefix + "ServerInfo";
                }
                // #/paths/somePath/get/servers/0
                return prefix + "Server" + pathPieces[5];
            case SECURITY:
                return getFilename(CodegenKeyType.SECURITY, lastJsonPathFragment, jsonPath);
            default:
                return null;
        }
    }

    @Override
    public String getFilename(CodegenKeyType type, String lastJsonPathFragment, String jsonPath) {
        String[] pathPieces = jsonPath.split("/");
        switch(type) {
            case SCHEMA:
                String modelName = schemaJsonPathToModelName.get(jsonPath);
                if (modelName != null) {
                    return modelName;
                }
                return getSchemaPascalCaseName(pathPieces[pathPieces.length-1], jsonPath, false);
            case SERVER:
                return getPascalCase(CodegenKeyType.SERVER, lastJsonPathFragment, jsonPath);
            case SECURITY_SCHEME:
                return toModelName(lastJsonPathFragment, jsonPath);
            case OPERATION:
                String pathJsonPath = "#/paths/"+pathPieces[2];
                String pthClassName = getFilename(CodegenKeyType.PATH, ModelUtils.decodeSlashes(pathPieces[2]), pathJsonPath);
                String operationFileName = pthClassName + StringUtils.capitalize(lastJsonPathFragment);
                return operationFileName;
            case PARAMETER:
                if (jsonPath.startsWith("#/components/parameters/")) {
                    if (pathPieces.length == 4) {
                        // #/components/parameters/SomeParameter
                        return toModelName(lastJsonPathFragment, null);
                    }
                    return toModuleFilename(lastJsonPathFragment, jsonPath);
                }
                if (operationVerbs.contains(pathPieces[3])) {
                    if (pathPieces.length == 5) {
                        // #/paths/somePath/verb/parameters
                        return "Parameters";
                    }
                    if (pathPieces[pathPieces.length-2].equals("parameters") && isInteger(lastJsonPathFragment) && pathPieces.length == 6) {
                        // #/paths/somePath/verb/parameters/0
                        return "Parameter" + lastJsonPathFragment;
                    }
                    return "parameter" + lastJsonPathFragment;
                }
                if (pathPieces[pathPieces.length-2].equals("parameters") && isInteger(lastJsonPathFragment) && pathPieces.length == 5) {
                    // #/paths/somePath/parameters/0
                    return "RouteParameter" + lastJsonPathFragment;
                }
                return "routeparameter" + lastJsonPathFragment;
            case PATH:
                boolean pathClassCase = (pathPieces.length == 3 || (pathPieces.length == 4 && pathPieces[1].equals("apis")));
                if (pathClassCase) {
                    // #/paths/somePath -> Somepath
                    // #/apis/paths/somePath -> Somepath
                    String moduleFilename = toModuleFilename(lastJsonPathFragment, jsonPath);
                    return camelize(moduleFilename, false);
                }
                // #/paths/somePath/blah -> somepath
                return toModuleFilename(lastJsonPathFragment, jsonPath);
            case HEADER:
                if (jsonPath.startsWith("#/components/headers/")) {
                    if (pathPieces.length == 4) {
                        // #/components/headers/SomeHeader
                        return toModelName(lastJsonPathFragment, null);
                    }
                    // deeper paths
                    return toModuleFilename(lastJsonPathFragment, jsonPath);
                } else if (jsonPath.startsWith("#/components/responses/")) {
                    if (pathPieces.length == 5) {
                        // #/components/responses/SomeResponse/headers
                        return "Headers";
                    } else if (pathPieces.length == 6) {
                        // #/components/responses/SomeResponse/headers/SomeHeader
                        return toModelName(lastJsonPathFragment, null);
                    }
                    // deeper paths
                    return toModuleFilename(lastJsonPathFragment, jsonPath);
                }
                if (pathPieces.length == 7) {
                    // #/paths/somePath/verb/responses/200/headers
                    return "Headers";
                } else if (pathPieces.length == 8) {
                    // #/paths/somePath/verb/responses/200/headers/SomeHeader
                    return toModelName(lastJsonPathFragment, null);
                }
                // deeper paths
                return toModuleFilename(lastJsonPathFragment, jsonPath);
            case REQUEST_BODY:
                if (pathPieces[2].equals("requestbodies") || pathPieces[2].equals("requestBodies")) {
                    if (pathPieces.length == 4) {
                        // #/components/requestBodies/Pet
                        return toModelName(lastJsonPathFragment, null);
                    }
                    return toModuleFilename(lastJsonPathFragment, null);
                }
                if (pathPieces.length == 5) {
                    // #/paths/somePath/verb/requestBody
                    String pathClassName = getPathClassNamePrefix(jsonPath);
                    return pathClassName + "RequestBody";
                }
                return toModuleFilename(lastJsonPathFragment, null);
            case CONTENT_TYPE:
                return toModuleFilename(lastJsonPathFragment, null);
            case SECURITY:
                if (pathPieces.length == 2) {
                    // #/security
                    return "SecurityInfo";
                } else if (pathPieces.length == 3) {
                    // #/security/0
                    return "SecurityRequirementObject"+pathPieces[pathPieces.length-1];
                } else if (pathPieces.length == 5) {
                    // #/paths/somePath/verb/security
                    String prefix = getPathClassNamePrefix(jsonPath);
                    return prefix + "SecurityInfo";
                }
                // pathPieces.length == 6
                // #/paths/somePath/verb/security/0
                String prefix = getPathClassNamePrefix(jsonPath);
                return prefix + "SecurityRequirementObject"+pathPieces[pathPieces.length-1];
            case RESPONSE:
                if (jsonPath.startsWith("#/components/responses/")) {
                    if (pathPieces.length == 4) {
                        // #/components/responses/SomeResponse
                        return toModelName(lastJsonPathFragment, null);
                    }
                    return toModuleFilename(lastJsonPathFragment, jsonPath);
                }
                String clsNamePrefix = getPathClassNamePrefix(jsonPath);
                switch (pathPieces.length) {
                    case 5:
                        // #/paths/somePath/verb/responses
                        return clsNamePrefix + "Responses";
                    case 6:
                        // #/paths/somePath/verb/responses/200
                        return clsNamePrefix + "Code"+ lastJsonPathFragment + "Response";
                    default:
                        return toModuleFilename("code"+lastJsonPathFragment+"response", null);
                }
            default:
                return null;
        }
    }

    protected List<MapBuilder<CodegenSchema>> getMapBuilders(CodegenSchema schema, String currentJsonPath, String sourceJsonPath) {
        List<MapBuilder<CodegenSchema>> builders = new ArrayList<>();
        if (sourceJsonPath == null) {
            return builders;
        }
        String schemaName = currentJsonPath.substring(currentJsonPath.lastIndexOf("/") + 1);
        schemaName = ModelUtils.decodeSlashes(schemaName);
        int qtyBuilders = 1;
        int reqPropsSize = 0;
        if (schema.requiredProperties != null) {
            qtyBuilders = (int) Math.pow(2, schema.requiredProperties.size());
            reqPropsSize = schema.requiredProperties.size();
        }
        Map<String, MapBuilder<CodegenSchema>> bitStrToBuilder = new HashMap<>();
        List<CodegenKey> reqPropKeys = new ArrayList<>();
        if (schema.requiredProperties != null) {
            reqPropKeys.addAll(schema.requiredProperties.keySet());
        }
        MapBuilder<CodegenSchema> lastBuilder = null;
        // builders are built last to first, last builder has build method
        for (int i=0; i < qtyBuilders; i++) {
            String bitStr = "";
            if (reqPropsSize != 0) {
                bitStr = String.format("%"+reqPropsSize+"s", Integer.toBinaryString(i)).replace(' ', '0');
            }
            CodegenKey builderClassName;
            if (i == qtyBuilders - 1) {
                // first invoked builder has the simplest name with no bitStr
                if (schema.mapInputJsonPathPiece != null) {
                    builderClassName = schema.mapInputJsonPathPiece;
                } else {
                    builderClassName = getKey(
                        schemaName + objectIOClassNamePiece + "Builder",
                        "schemas",
                        sourceJsonPath
                    );
                }
            } else {
                builderClassName = getKey(
                    schemaName + objectIOClassNamePiece + bitStr + "Builder",
                    "schemas",
                    sourceJsonPath
                );
            }
            MapBuilder<CodegenSchema> builder;
            if (i == 0) {
                builder = new MapBuilder<>(builderClassName, new LinkedHashMap<>());
                lastBuilder = builder;
            } else {
                LinkedHashMap<CodegenKey, MapBuilder.BuilderPropertyPair<CodegenSchema>> keyToBuilder = new LinkedHashMap<>();
                for (int c=0; c < reqPropsSize; c++) {
                    if (bitStr.charAt(c) == '1') {
                        StringBuilder nextBuilderBitStr = new StringBuilder(bitStr);
                        nextBuilderBitStr.setCharAt(c, '0');
                        CodegenKey key = reqPropKeys.get(c);
                        if (key == null) {
                            throw new RuntimeException("key must exist at c="+c);
                        }
                        MapBuilder<CodegenSchema> nextBuilder = bitStrToBuilder.get(nextBuilderBitStr.toString());
                        if (nextBuilder == null) {
                            throw new RuntimeException("Next builder must exist for bitStr="+ nextBuilderBitStr);
                        }
                        var pair = new MapBuilder.BuilderPropertyPair<>(nextBuilder, schema.requiredProperties.get(key));
                        keyToBuilder.put(key, pair);
                    }
                }
                builder = new MapBuilder<>(builderClassName, keyToBuilder);
            }
            bitStrToBuilder.put(bitStr, builder);
            builders.add(builder);
        }
        if (lastBuilder != null && schema.optionalProperties != null) {
            for (Map.Entry<CodegenKey, CodegenSchema> entry: schema.optionalProperties.entrySet()) {
                var pair = new MapBuilder.BuilderPropertyPair<>(lastBuilder, entry.getValue());
                lastBuilder.keyToBuilder.put(entry.getKey(), pair);
            }
        }
        return builders;
    }

    @Override
    public TreeMap<String, CodegenSchema> postProcessAllModels(TreeMap<String, CodegenSchema> objs) {
        objs = super.postProcessAllModels(objs);
        objs = super.updateAllModels(objs);

        return objs;
    }

    private void sanitizeConfig() {
        // Sanitize any config options here. We also have to update the additionalProperties because
        // the whole additionalProperties object is injected into the main object passed to the mustache layer

        this.setModelPackage(sanitizePackageName(modelPackage));

        this.setInvokerPackage(sanitizePackageName(invokerPackage));
        if (additionalProperties.containsKey(CodegenConstants.INVOKER_PACKAGE)) {
            this.additionalProperties.put(CodegenConstants.INVOKER_PACKAGE, invokerPackage);
        }
    }

    @Override
    public String escapeReservedWord(String name) {
        return "_" + name;
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
    public String toModelName(final String name, String jsonPath) {
        // We need to check if schema-mapping has a different model for this class, so we use it
        // instead of the auto-generated one.

        // memoization
        if (schemaKeyToModelNameCache.containsKey(name)) {
            return schemaKeyToModelNameCache.get(name);
        }

        String nameWithPrefixSuffix = sanitizeName(name);

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
            schemaKeyToModelNameCache.put(name, modelName);
            LOGGER.warn("{} (reserved word) cannot be used as model name. Renamed to {}", camelizedName, modelName);
            return modelName;
        }

        // model name starts with number
        if (camelizedName.matches("^\\d.*")) {
            final String modelName = "Model" + camelizedName; // e.g. 200Response => Model200Response (after camelize)
            schemaKeyToModelNameCache.put(name, modelName);
            LOGGER.warn("{} (model name starts with number) cannot be used as model name. Renamed to {}", name,
                    modelName);
            return modelName;
        }

        schemaKeyToModelNameCache.put(name, camelizedName);

        return camelizedName;
    }

    /**
     * Return the example value of the parameter. Overrides the
     * getParameterExampleValue(Parameter) method in
     * DefaultGenerator to always call setParameterExampleValue(CodegenParameter)
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

        Schema<?> schema = parameter.getSchema();

        if (schema == null && parameter.getContent() != null) {
            String contentType = (String) parameter.getContent().keySet().toArray()[0];
            schema = parameter.getContent().get(contentType).getSchema();
        }

        if (schema == null) {
            return null;
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
                switch (format) {
                    case "uuid":
                        if (example == null) {
                            example = "UUID.randomUUID()";
                        } else {
                            example = "UUID.fromString(\"" + example + "\")";
                        }
                        break;
                    case "binary":
                        if (example == null) {
                            example = "/path/to/file";
                        }
                        example = "new File(\"" + escapeText(example) + "\")";
                        break;
                    case "date":
                        example = "new Date()";
                        break;
                    case "date-time":
                        if (example == null) {
                            example = "LocalDate.now()";
                        } else {
                            example = "LocalDate.parse(\"" + example + "\")";
                        }
                        break;
                    case "number":
                        if (example == null) {
                            example = "new BigDecimal(78)";
                        } else {
                            example = "new BigDecimal(\"" + example + "\")";
                        }
                        break;
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
    public void setOpenAPI(OpenAPI openAPI) {
        super.setOpenAPI(openAPI);
        Components components = openAPI.getComponents();
        if (components != null && components.getSecuritySchemes() != null) {
            supportingFiles.add(new SupportingFile(
                    "src/main/java/packagename/securityrequirementobjects/SecurityRequirementObject.hbs",
                    packagePath() + File.separatorChar + "securityrequirementobjects",
                    "SecurityRequirementObject.java"));
            supportingFiles.add(new SupportingFile(
                "src/main/java/packagename/securityrequirementobjects/AuthApplier.hbs",
                packagePath() + File.separatorChar + "securityrequirementobjects",
                "AuthApplier.java"));
            supportingFiles.add(new SupportingFile(
                    "src/main/java/packagename/securityrequirementobjects/EmptySecurityRequirementObject.hbs",
                    packagePath() + File.separatorChar + "securityrequirementobjects",
                    "EmptySecurityRequirementObject.java"));
            supportingFiles.add(new SupportingFile(
                    "src/main/java/packagename/securityrequirementobjects/SecurityRequirementObjectProvider.hbs",
                    packagePath() + File.separatorChar + "securityrequirementobjects",
                    "SecurityRequirementObjectProvider.java"));
            supportingFiles.add(new SupportingFile(
                    "src/main/java/packagename/securityschemes/SecurityScheme.hbs",
                    packagePath() + File.separatorChar + "securityschemes",
                    "SecurityScheme.java"));
            supportingFiles.add(new SupportingFile(
                    "src/main/java/packagename/securityschemes/ApiKeyCookieSecurityScheme.hbs",
                    packagePath() + File.separatorChar + "securityschemes",
                    "ApiKeyCookieSecurityScheme.java"));
            supportingFiles.add(new SupportingFile(
                    "src/main/java/packagename/securityschemes/ApiKeyHeaderSecurityScheme.hbs",
                    packagePath() + File.separatorChar + "securityschemes",
                    "ApiKeyHeaderSecurityScheme.java"));
            supportingFiles.add(new SupportingFile(
                    "src/main/java/packagename/securityschemes/ApiKeyQuerySecurityScheme.hbs",
                    packagePath() + File.separatorChar + "securityschemes",
                    "ApiKeyQuerySecurityScheme.java"));
            supportingFiles.add(new SupportingFile(
                    "src/main/java/packagename/securityschemes/HttpBasicSecurityScheme.hbs",
                    packagePath() + File.separatorChar + "securityschemes",
                    "HttpBasicSecurityScheme.java"));
            supportingFiles.add(new SupportingFile(
                    "src/main/java/packagename/securityschemes/HttpBearerSecurityScheme.hbs",
                    packagePath() + File.separatorChar + "securityschemes",
                    "HttpBearerSecurityScheme.java"));
            supportingFiles.add(new SupportingFile(
                    "src/main/java/packagename/securityschemes/HttpSignatureSecurityScheme.hbs",
                    packagePath() + File.separatorChar + "securityschemes",
                    "HttpSignatureSecurityScheme.java"));
            supportingFiles.add(new SupportingFile(
                    "src/main/java/packagename/securityschemes/HttpDigestSecurityScheme.hbs",
                    packagePath() + File.separatorChar + "securityschemes",
                    "HttpDigestSecurityScheme.java"));
            supportingFiles.add(new SupportingFile(
                    "src/main/java/packagename/securityschemes/MutualTlsSecurityScheme.hbs",
                    packagePath() + File.separatorChar + "securityschemes",
                    "MutualTlsSecurityScheme.java"));
            supportingFiles.add(new SupportingFile(
                    "src/main/java/packagename/securityschemes/OAuth2SecurityScheme.hbs",
                    packagePath() + File.separatorChar + "securityschemes",
                    "OAuth2SecurityScheme.java"));
            supportingFiles.add(new SupportingFile(
                    "src/main/java/packagename/securityschemes/OpenIdConnectSecurityScheme.hbs",
                    packagePath() + File.separatorChar + "securityschemes",
                    "OpenIdConnectSecurityScheme.java"));

            jsonPathTemplateFiles.put(
                    CodegenConstants.JSON_PATH_LOCATION_TYPE.SECURITY,
                    new HashMap<>() {{
                        put("src/main/java/packagename/securityrequirementobjects/SecurityRequirementObjectN.hbs", ".java");
                    }}
            );
            jsonPathDocTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.SECURITY,
                new HashMap<>() {{
                    put("src/main/java/packagename/securityrequirementobjects/SecurityRequirementObjectNDoc.hbs", ".md");
                }}
            );
            jsonPathTemplateFiles.put(
                    CodegenConstants.JSON_PATH_LOCATION_TYPE.SECURITIES,
                    new HashMap<>() {{
                        put("src/main/java/packagename/securityrequirementobjects/SecurityInfo.hbs", ".java");
                    }}
            );
            jsonPathDocTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.SECURITIES,
                new HashMap<>() {{
                    put("src/main/java/packagename/securityrequirementobjects/SecurityInfoDoc.hbs", ".md");
                }}
            );
            jsonPathTemplateFiles.put(
                    CodegenConstants.JSON_PATH_LOCATION_TYPE.SECURITY_SCHEME,
                    new HashMap<>() {{
                        put("src/main/java/packagename/components/securityschemes/SecurityScheme.hbs", ".java");
                    }}
            );
            jsonPathDocTemplateFiles.put(
                    CodegenConstants.JSON_PATH_LOCATION_TYPE.SECURITY_SCHEME,
                    new HashMap<>() {{
                        put("src/main/java/packagename/components/securityschemes/SecurityScheme_doc.hbs", ".md");
                    }}
            );
        }
        List<Server> servers = openAPI.getServers();
        if (servers != null && !servers.isEmpty()) {
            supportingFiles.add(new SupportingFile(
                    "src/main/java/packagename/servers/Server.hbs",
                    packagePath() + File.separatorChar + "servers",
                    "Server.java"));
            supportingFiles.add(new SupportingFile(
                    "src/main/java/packagename/servers/ServerProvider.hbs",
                    packagePath() + File.separatorChar + "servers",
                    "ServerProvider.java"));

            supportingFiles.add(new SupportingFile(
                    "src/main/java/packagename/servers/ServerWithoutVariables.hbs",
                    packagePath() + File.separatorChar + "servers",
                    "ServerWithoutVariables.java"));

            supportingFiles.add(new SupportingFile(
                    "src/main/java/packagename/servers/ServerWithVariables.hbs",
                    packagePath() + File.separatorChar + "servers",
                    "ServerWithVariables.java"));
            jsonPathTemplateFiles.put(
                    CodegenConstants.JSON_PATH_LOCATION_TYPE.SERVER,
                    new HashMap<>() {{
                        put("src/main/java/packagename/servers/ServerN.hbs", ".java");
                    }}
            );
            jsonPathTemplateFiles.put(
                    CodegenConstants.JSON_PATH_LOCATION_TYPE.SERVERS,
                    new HashMap<>() {{
                        put("src/main/java/packagename/servers/ServerInfo.hbs", ".java");
                    }}
            );
            jsonPathDocTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.SERVERS,
                new HashMap<>() {{
                    put("src/main/java/packagename/servers/ServerInfoDoc.hbs", ".md");
                }}
            );
            jsonPathDocTemplateFiles.put(
                    CodegenConstants.JSON_PATH_LOCATION_TYPE.SERVER,
                    new HashMap<>() {{
                        put("src/main/java/packagename/servers/ServerDoc.hbs", ".md");
                    }}
            );
        }
    }

    @Override
    public void preprocessOpenAPI(OpenAPI openAPI) {
        super.preprocessOpenAPI(openAPI);
        if (openAPI == null) {
            return;
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
        // must be sequential after initial setting above
        if (additionalProperties.containsKey(CodegenConstants.SNAPSHOT_VERSION)) {
            if (convertPropertyToBooleanAndWriteBack(CodegenConstants.SNAPSHOT_VERSION)) {
                this.setArtifactVersion(this.buildSnapshotVersion(this.getArtifactVersion()));
            }
        }
        additionalProperties.put(CodegenConstants.ARTIFACT_VERSION, artifactVersion);
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

    public void setOutputTestFolder(String outputTestFolder) {
        this.outputTestFolder = outputTestFolder;
    }

    @Override
    public String escapeQuotationMark(String input) {
        // remove " to avoid code injection
        return input.replace("\"", "");
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
     * @param version the version
     * @return SNAPSHOT version
     */
    private String buildSnapshotVersion(String version) {
        if (version.endsWith("-SNAPSHOT")) {
            return version;
        }
        return version + "-SNAPSHOT";
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

    @Override
    public boolean generateSeparateServerSchemas() {
        return true;
    }

    /**
     * Convert OAS Property object to Codegen Property object
     * We have a custom version of this method to always set allowableValues.enumVars on all enum variables
     * Together with unaliasSchema this sets primitive types with validations as models
     * This method is used by fromResponse
     *
     * @param p OAS property schema
     * @return Codegen Property object
     */
    @Override
    public CodegenSchema fromSchema(Schema p, String sourceJsonPath, String currentJsonPath) {
        // fix needed for values with /n /t etc. in them
        CodegenSchema cp = super.fromSchema(p, sourceJsonPath, currentJsonPath);
        if (cp.types != null && cp.types.contains("integer") && cp.format == null) {
            // this generator treats integers as type number
            // so integer validation info must be set using formatting
            cp.format = "int";
        }
        return cp;
    }

    @Override
    public boolean shouldGenerateFile(String jsonPath, boolean isDoc) {
        // exclude certain collection jsonPaths
        if (jsonPath.equals("#/components/responses")) {
            return false;
        } else if (jsonPath.equals("#/components/headers")) {
            return false;
        } else if (jsonPath.equals("#/components/parameters")) {
            return false;
        }
        String[] pathPieces = jsonPath.split("/");
        if (pathPieces.length == 4 && jsonPath.endsWith("/parameters")) {
            // #/paths/path/parameters
            return false;
        }
        return true;
    }

    @Override
    public String toApiFilename(String name) {
        return toApiName(name);
    }

    @Override
    public String toApiName(String name) {
        if (name.isEmpty()) {
            return "DefaultApi";
        }
        String usedName = sanitizeName(name, "[^a-zA-Z0-9]+");
        // todo check if empty and if so them use enum name
        // todo fix this, this does not handle names starting with numbers
        if (usedName.isEmpty()) {
            usedName = toEnumVarName(name, null).toLowerCase(Locale.ROOT);
        }
        usedName = camelize(usedName, false);
        return usedName;
    }

    protected String responsePathFromDocRoot(String sourceJsonPath) {
        return getPathFromDocRoot(sourceJsonPath);
    }
}
