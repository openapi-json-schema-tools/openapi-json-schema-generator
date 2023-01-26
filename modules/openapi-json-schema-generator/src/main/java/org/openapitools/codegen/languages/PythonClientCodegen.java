/*
 * Copyright 2018 OpenAPI-Generator Contributors (https://openapi-generator.tech)
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

package org.openapitools.codegen.languages;

import com.github.curiousoddman.rgxgen.RgxGen;
import com.github.curiousoddman.rgxgen.config.RgxGenOption;
import com.github.curiousoddman.rgxgen.config.RgxGenProperties;
import com.google.common.base.CaseFormat;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.servers.Server;

import org.apache.commons.io.FileUtils;
import org.openapitools.codegen.OpenApiSchema;
import org.openapitools.codegen.api.TemplatePathLocator;
import org.openapitools.codegen.config.GlobalSettings;
import org.openapitools.codegen.ignore.CodegenIgnoreProcessor;
import org.openapitools.codegen.templating.*;
import io.swagger.v3.core.util.Json;
import io.swagger.v3.oas.models.media.*;
import io.swagger.v3.oas.models.parameters.Parameter;
import io.swagger.v3.oas.models.parameters.RequestBody;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.apache.commons.lang3.StringUtils;
import org.openapitools.codegen.*;
import org.openapitools.codegen.CodegenDiscriminator.MappedModel;
import org.openapitools.codegen.api.TemplatingEngineAdapter;
import org.openapitools.codegen.meta.GeneratorMetadata;
import org.openapitools.codegen.meta.Stability;
import org.openapitools.codegen.meta.features.*;
import org.openapitools.codegen.utils.ModelUtils;
import org.openapitools.codegen.utils.ProcessUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openapitools.codegen.api.TemplateProcessor;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.openapitools.codegen.utils.OnceLogger.once;
import static org.openapitools.codegen.utils.StringUtils.camelize;
import static org.openapitools.codegen.utils.StringUtils.underscore;

public class PythonClientCodegen extends AbstractPythonCodegen {
    private final Logger LOGGER = LoggerFactory.getLogger(PythonClientCodegen.class);

    public static final String PACKAGE_URL = "packageUrl";
    public static final String DEFAULT_LIBRARY = "urllib3";
    // nose is a python testing framework, we use pytest if USE_NOSE is unset
    public static final String USE_NOSE = "useNose";
    public static final String RECURSION_LIMIT = "recursionLimit";
    public static final String USE_INLINE_MODEL_RESOLVER = "useInlineModelResolver";

    protected String packageUrl;
    protected String apiDocPath = "docs/apis/tags/";
    protected String modelDocPath = "docs/components/schema/";
    protected String requestBodyDocPath = "docs/components/request_bodies/";
    protected String responseDocPath = "docs/components/responses/";
    protected String headerDocPath = "docs/components/headers/";
    protected String parameterDocPath = "docs/components/parameters/";
    protected boolean useNose = false;
    protected boolean useInlineModelResolver = false;

    protected Map<Character, String> regexModifiers;

    private String testFolder;

    // A cache to efficiently lookup a Schema instance based on the return value of `toModelName()`.
    private Map<String, Schema> modelNameToSchemaCache;
    private DateTimeFormatter iso8601Date = DateTimeFormatter.ISO_DATE;
    private DateTimeFormatter iso8601DateTime = DateTimeFormatter.ISO_DATE_TIME;

    protected CodegenIgnoreProcessor ignoreProcessor;
    protected TemplateProcessor templateProcessor = null;

    // for apis.tags imports
    private Map<String, String> tagModuleNameToApiClassname = new LinkedHashMap<>();
    // for apis.tags tag api definition
    private Map<String, String> tagToApiClassname = new LinkedHashMap<>();

    private boolean nonCompliantUseDiscrIfCompositionFails = false;

    public PythonClientCodegen() {
        super();
        loadDeepObjectIntoItems = false;
        importBaseType = false;
        addSchemaImportsFromV3SpecLocations = true;
        sortModelPropertiesByRequiredFlag = Boolean.TRUE;
        // this must be false for parameter numbers to stay the same as the ones in the spec
        // if another schema $refs a schema in a parameter, the json path
        // and generated module must have the same parameter index as the spec
        sortParamsByRequiredFlag = Boolean.FALSE;
        addSuffixToDuplicateOperationNicknames = false;

        modifyFeatureSet(features -> features
                .includeSchemaSupportFeatures(
                        SchemaSupportFeature.Simple,
                        SchemaSupportFeature.Composite,
                        SchemaSupportFeature.Polymorphism,
                        SchemaSupportFeature.Union,
                        SchemaSupportFeature.allOf,
                        SchemaSupportFeature.anyOf,
                        SchemaSupportFeature.oneOf,
                        SchemaSupportFeature.not
                )
                .includeDocumentationFeatures(DocumentationFeature.Readme)
                .wireFormatFeatures(EnumSet.of(WireFormatFeature.JSON, WireFormatFeature.Custom))
                .securityFeatures(EnumSet.of(
                        SecurityFeature.BasicAuth,
                        SecurityFeature.BearerToken,
                        SecurityFeature.ApiKey,
                        SecurityFeature.OAuth2_Implicit
                ))
                .includeDataTypeFeatures(
                        DataTypeFeature.Null,
                        DataTypeFeature.AnyType,
                        DataTypeFeature.Uuid
                )
                .includeGlobalFeatures(
                        GlobalFeature.ParameterizedServer,
                        GlobalFeature.ParameterStyling
                )
                .excludeGlobalFeatures(
                        GlobalFeature.XMLStructureDefinitions,
                        GlobalFeature.Callbacks,
                        GlobalFeature.LinkObjects
                )
                .excludeSchemaSupportFeatures(
                )
                .excludeParameterFeatures(
                        ParameterFeature.Cookie
                )
        );

        // clear import mapping (from default generator) as python does not use it
        // at the moment
        importMapping.clear();

        modelPackage = "components.schema";
        apiPackage = "apis";
        outputFolder = "generated-code" + File.separatorChar + "python";

        embeddedTemplateDir = templateDir = "python";

        testFolder = "test";

        // default HIDE_GENERATION_TIMESTAMP to true
        hideGenerationTimestamp = Boolean.TRUE;

        // from https://docs.python.org/3/reference/lexical_analysis.html#keywords
        setReservedWordsLowerCase(
                Arrays.asList(
                        // local variable name used in API methods (endpoints)
                        "all_params", "resource_path", "path_params", "query_params",
                        "header_params", "form_params", "local_var_files", "body_params", "auth_settings",
                        // @property
                        "property",
                        // python reserved words
                        "and", "del", "from", "not", "while", "as", "elif", "global", "or", "with",
                        "assert", "else", "if", "pass", "yield", "break", "except", "import",
                        "print", "class", "exec", "in", "raise", "continue", "finally", "is",
                        "return", "def", "for", "lambda", "try", "self", "nonlocal", "None", "True",
                        "False", "async", "await",
                        // types
                        "float", "int", "str", "bool", "none_type", "dict", "frozendict", "list", "tuple", "file_type"));

        regexModifiers = new HashMap<Character, String>();
        regexModifiers.put('i', "IGNORECASE");
        regexModifiers.put('l', "LOCALE");
        regexModifiers.put('m', "MULTILINE");
        regexModifiers.put('s', "DOTALL");
        regexModifiers.put('u', "UNICODE");
        regexModifiers.put('x', "VERBOSE");

        cliOptions.clear();
        cliOptions.add(new CliOption(CodegenConstants.PACKAGE_NAME, "python package name (convention: snake_case).")
                .defaultValue("openapi_client"));
        cliOptions.add(new CliOption(CodegenConstants.PROJECT_NAME, "python project name in setup.py (e.g. petstore-api)."));
        cliOptions.add(new CliOption(CodegenConstants.PACKAGE_VERSION, "python package version.")
                .defaultValue("1.0.0"));
        cliOptions.add(new CliOption(PACKAGE_URL, "python package URL."));
        // this generator does not use SORT_PARAMS_BY_REQUIRED_FLAG
        // this generator uses the following order for endpoint paramters and model properties
        // required params
        // optional params which are set to unset as their default for method signatures only
        // optional params as **kwargs
        cliOptions.add(new CliOption(CodegenConstants.HIDE_GENERATION_TIMESTAMP, CodegenConstants.HIDE_GENERATION_TIMESTAMP_DESC)
                .defaultValue(Boolean.TRUE.toString()));
        cliOptions.add(new CliOption(CodegenConstants.SOURCECODEONLY_GENERATION, CodegenConstants.SOURCECODEONLY_GENERATION_DESC)
                .defaultValue(Boolean.FALSE.toString()));
        cliOptions.add(CliOption.newBoolean(USE_NOSE, "use the nose test framework").
                defaultValue(Boolean.FALSE.toString()));
        cliOptions.add(new CliOption(RECURSION_LIMIT, "Set the recursion limit. If not set, use the system default value."));
        cliOptions.add(CliOption.newBoolean(USE_INLINE_MODEL_RESOLVER, "use the inline model resolver, if true inline complex models will be extracted into components and $refs to them will be used").
                defaultValue(Boolean.FALSE.toString()));
        CliOption nonCompliantUseDiscrIfCompositionFails = CliOption.newBoolean(CodegenConstants.NON_COMPLIANT_USE_DISCR_IF_COMPOSITION_FAILS, CodegenConstants.NON_COMPLIANT_USE_DISCR_IF_COMPOSITION_FAILS_DESC);
        Map<String, String> nonCompliantUseDiscrIfCompositionFailsOpts = new HashMap<>();
        nonCompliantUseDiscrIfCompositionFailsOpts.put("true", "If composition fails and a discriminator exists, the composition errors will be ignored and validation will be attempted with the discriminator");
        nonCompliantUseDiscrIfCompositionFailsOpts.put("false", "Composition validation must succeed. Discriminator validation must succeed.");
        nonCompliantUseDiscrIfCompositionFails.setEnum(nonCompliantUseDiscrIfCompositionFailsOpts);

        cliOptions.add(nonCompliantUseDiscrIfCompositionFails);

        supportedLibraries.put("urllib3", "urllib3-based client");
        CliOption libraryOption = new CliOption(CodegenConstants.LIBRARY, "library template (sub-template) to use: urllib3");
        libraryOption.setDefault(DEFAULT_LIBRARY);
        cliOptions.add(libraryOption);
        setLibrary(DEFAULT_LIBRARY);

        // Composed schemas can have the 'additionalProperties' keyword, as specified in JSON schema.
        // In principle, this should be enabled by default for all code generators. However due to limitations
        // in other code generators, support needs to be enabled on a case-by-case basis.
        supportsAdditionalPropertiesWithComposedSchema = true;

        // When the 'additionalProperties' keyword is not present in a OAS schema, allow
        // undeclared properties. This is compliant with the JSON schema specification.
        this.setDisallowAdditionalPropertiesIfNotPresent(false);
        GlobalSettings.setProperty("x-disallow-additional-properties-if-not-present", "false");

        // this may set datatype right for additional properties
        instantiationTypes.put("map", "dict");

        languageSpecificPrimitives.add("file_type");
        languageSpecificPrimitives.add("none_type");
        typeMapping.put("decimal", "str");

        generatorMetadata = GeneratorMetadata.newBuilder(generatorMetadata)
                .stability(Stability.STABLE)
                .build();
    }

    @Override
    public void processOpts() {
        this.setLegacyDiscriminatorBehavior(false);

        super.processOpts();

        TemplatingEngineAdapter te = getTemplatingEngine();
        if (te instanceof HandlebarsEngineAdapter) {
            HandlebarsEngineAdapter hea = (HandlebarsEngineAdapter) te;
            hea.infiniteLoops(true);
            hea.setPrettyPrint(true);
        } else {
            throw new RuntimeException("Only the HandlebarsEngineAdapter is supported for this generator");
        }

        TemplatePathLocator commonTemplateLocator = new CommonTemplateContentLocator();
        TemplatePathLocator generatorTemplateLocator = new GeneratorTemplateContentLocator(this);
        TemplateManagerOptions templateManagerOptions = new TemplateManagerOptions(this.isEnableMinimalUpdate(),this.isSkipOverwrite());
        templateProcessor = new TemplateManager(
                templateManagerOptions,
                te,
                new TemplatePathLocator[]{generatorTemplateLocator, commonTemplateLocator}
        );

        String ignoreFileLocation = this.getIgnoreFilePathOverride();
        if (ignoreFileLocation != null) {
            final File ignoreFile = new File(ignoreFileLocation);
            if (ignoreFile.exists() && ignoreFile.canRead()) {
                this.ignoreProcessor = new CodegenIgnoreProcessor(ignoreFile);
            } else {
                LOGGER.warn("Ignore file specified at {} is not valid. This will fall back to an existing ignore file if present in the output directory.", ignoreFileLocation);
            }
        }

        if (this.ignoreProcessor == null) {
            this.ignoreProcessor = new CodegenIgnoreProcessor(this.getOutputDir());
        }

        /*
        The pyi stub files exists to allow pycharm to read and use typing.overload decorators for it to see that
        dict_instance["someProp"] is of type SomeClass.properties.someProp
        See https://youtrack.jetbrains.com/issue/PY-42137/PyCharm-type-hinting-doesnt-work-well-with-overload-decorator
         */
        apiTemplateFiles.put("apis/api.hbs", ".py");
        apiDocTemplateFiles.put("apis/api_doc.hbs", ".md");
        apiXToApiTemplateFiles.put("apis/apis_tag_to_api.hbs", "tag_to_api.py");
        apiXToApiTemplateFiles.put("apis/apis_path_to_api.hbs", "path_to_api.py");

        pathEndpointDocTemplateFiles.add("paths/path/verb/operation_doc.hbs");
        pathEndpointTestTemplateFiles.add("paths/path/verb/operation_test.hbs");

        modelDocTemplateFiles.put("components/schemas/schema_doc.hbs", ".md");
        modelTestTemplateFiles.put("components/schemas/schema_test.hbs", ".py");
        requestBodyDocTemplateFiles.put("components/request_bodies/request_body_doc.hbs", ".md");
        parameterDocTemplateFiles.put("components/parameters/parameter_doc.hbs", ".md");
        responseDocTemplateFiles.put("components/responses/response_doc.hbs", ".md");
        headerDocTemplateFiles.put("components/headers/header_doc.hbs", ".md");

        HashMap<String, String> schemaTemplates = new HashMap<>();
        schemaTemplates.put("components/schemas/schema.hbs", ".py");
        schemaTemplates.put("components/schemas/schema_stub.hbs", ".pyi");
        jsonPathTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.SCHEMA,
                schemaTemplates
        );
        jsonPathTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.HEADERS,
                Collections.singletonMap("__init__.hbs", "__init__.py")
        );
        jsonPathTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.HEADER,
                Collections.singletonMap("components/headers/header.hbs", "__init__.py")
        );
        jsonPathTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.PARAMETERS,
                Collections.singletonMap("__init__.hbs", "__init__.py")
        );
        jsonPathTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.PARAMETER,
                Collections.singletonMap("components/parameters/parameter.hbs", "__init__.py")
        );
        jsonPathTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.REQUEST_BODIES,
                Collections.singletonMap("__init__.hbs", "__init__.py")
        );
        jsonPathTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.REQUEST_BODY,
                Collections.singletonMap("components/request_bodies/request_body.hbs", "__init__.py")
        );
        jsonPathTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.RESPONSES,
                Collections.singletonMap("__init__.hbs", "__init__.py")
        );
        jsonPathTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.RESPONSE,
                Collections.singletonMap("components/responses/response.hbs", "__init__.py")
        );
        jsonPathTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.SCHEMAS,
                Collections.singletonMap("components/schemas/__init__schema.hbs", "__init__.py")
        );
        jsonPathTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.PATHS,
                Collections.singletonMap("paths/__init__paths.hbs", "__init__.py")
        );
        jsonPathTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.PATH,
                Collections.singletonMap("paths/path/__init__path.hbs", "__init__.py")
        );
        HashMap<String, String> operationTemplates = new HashMap<>();
        operationTemplates.put("paths/path/verb/operation.hbs", "__init__.py");
        operationTemplates.put("paths/path/verb/operation_stub.hbs", "__init__.pyi");
        jsonPathTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.OPERATION,
                operationTemplates
        );

        jsonPathTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.COMPONENTS,
                Collections.singletonMap("__init__.hbs", "__init__.py")
        );
        jsonPathTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.CONTENT,
                Collections.singletonMap("__init__.hbs", "__init__.py")
        );
        jsonPathTemplateFiles.put(
                CodegenConstants.JSON_PATH_LOCATION_TYPE.CONTENT_TYPE,
                Collections.singletonMap("__init__.hbs", "__init__.py")
        );

        if (StringUtils.isEmpty(System.getenv("PYTHON_POST_PROCESS_FILE"))) {
            LOGGER.info("Environment variable PYTHON_POST_PROCESS_FILE not defined so the Python code may not be properly formatted. To define it, try 'export PYTHON_POST_PROCESS_FILE=\"/usr/local/bin/yapf -i\"' (Linux/Mac)");
            LOGGER.info("NOTE: To enable file post-processing, 'enablePostProcessFile' must be set to `true` (--enable-post-process-file for CLI).");
        }

        Boolean excludeTests = false;

        if (additionalProperties.containsKey(CodegenConstants.PACKAGE_NAME)) {
            setPackageName((String) additionalProperties.get(CodegenConstants.PACKAGE_NAME));
        }

        if (additionalProperties.containsKey(CodegenConstants.PROJECT_NAME)) {
            setProjectName((String) additionalProperties.get(CodegenConstants.PROJECT_NAME));
        } else {
            // default: set project based on package name
            // e.g. petstore_api (package name) => petstore-api (project name)
            setProjectName(packageName.replaceAll("_", "-"));
        }

        if (additionalProperties.containsKey(CodegenConstants.PACKAGE_VERSION)) {
            setPackageVersion((String) additionalProperties.get(CodegenConstants.PACKAGE_VERSION));
        }

        additionalProperties.put(CodegenConstants.PROJECT_NAME, projectName);
        additionalProperties.put(CodegenConstants.PACKAGE_NAME, packageName);
        additionalProperties.put(CodegenConstants.PACKAGE_VERSION, packageVersion);

        if (additionalProperties.containsKey(CodegenConstants.EXCLUDE_TESTS)) {
            excludeTests = Boolean.valueOf(additionalProperties.get(CodegenConstants.EXCLUDE_TESTS).toString());
        }

        Boolean generateSourceCodeOnly = false;
        if (additionalProperties.containsKey(CodegenConstants.SOURCECODEONLY_GENERATION)) {
            generateSourceCodeOnly = Boolean.valueOf(additionalProperties.get(CodegenConstants.SOURCECODEONLY_GENERATION).toString());
        }

        // make api and model doc path available in templates
        additionalProperties.put("apiDocPath", apiDocPath);
        additionalProperties.put("modelDocPath", modelDocPath);

        if (additionalProperties.containsKey(PACKAGE_URL)) {
            setPackageUrl((String) additionalProperties.get(PACKAGE_URL));
        }

        if (additionalProperties.containsKey(USE_NOSE)) {
            setUseNose((String) additionalProperties.get(USE_NOSE));
        }

        if (additionalProperties.containsKey(USE_INLINE_MODEL_RESOLVER)) {
            setUseInlineModelResolver((String) additionalProperties.get(USE_INLINE_MODEL_RESOLVER));
        }

        // check to see if setRecursionLimit is set and whether it's an integer
        if (additionalProperties.containsKey(RECURSION_LIMIT)) {
            try {
                Integer.parseInt((String) additionalProperties.get(RECURSION_LIMIT));
            } catch (NumberFormatException | NullPointerException e) {
                throw new IllegalArgumentException("recursionLimit must be an integer, e.g. 2000.");
            }
        }

        if (additionalProperties.containsKey(CodegenConstants.NON_COMPLIANT_USE_DISCR_IF_COMPOSITION_FAILS)) {
            nonCompliantUseDiscrIfCompositionFails = Boolean.parseBoolean(
                    additionalProperties.get(CodegenConstants.NON_COMPLIANT_USE_DISCR_IF_COMPOSITION_FAILS).toString()
            );
        }

        String readmePath = "README.md";
        String readmeTemplate = "README.hbs";
        if (generateSourceCodeOnly) {
            readmePath = packagePath() + "_" + readmePath;
            readmeTemplate = "README_onlypackage.hbs";
        }
        supportingFiles.add(new SupportingFile(readmeTemplate, "", readmePath));

        if (!generateSourceCodeOnly) {
            supportingFiles.add(new SupportingFile("tox.hbs", "", "tox.ini"));
            supportingFiles.add(new SupportingFile("test-requirements.hbs", "", "test-requirements.txt"));
            supportingFiles.add(new SupportingFile("requirements.hbs", "", "requirements.txt"));

            supportingFiles.add(new SupportingFile("git_push.hbs", "", "git_push.sh"));
            supportingFiles.add(new SupportingFile("gitignore.hbs", "", ".gitignore"));
            supportingFiles.add(new SupportingFile("travis.hbs", "", ".travis.yml"));
            supportingFiles.add(new SupportingFile("gitlab-ci.hbs", "", ".gitlab-ci.yml"));
            supportingFiles.add(new SupportingFile("pyproject.hbs", "", "pyproject.toml"));
        }
        supportingFiles.add(new SupportingFile("configuration.hbs", packagePath(), "configuration.py"));
        supportingFiles.add(new SupportingFile("__init__package.hbs", packagePath(), "__init__.py"));

        // If the package name consists of dots(openapi.client), then we need to create the directory structure like openapi/client with __init__ files.
        String[] packageNameSplits = packageName.split("\\.");
        String currentPackagePath = "";
        for (int i = 0; i < packageNameSplits.length - 1; i++) {
            if (i > 0) {
                currentPackagePath = currentPackagePath + File.separatorChar;
            }
            currentPackagePath = currentPackagePath + packageNameSplits[i];
            supportingFiles.add(new SupportingFile("__init__.hbs", currentPackagePath, "__init__.py"));
        }

        supportingFiles.add(new SupportingFile("exceptions.hbs", packagePath(), "exceptions.py"));

        if (Boolean.FALSE.equals(excludeTests)) {
            supportingFiles.add(new SupportingFile("__init__.hbs", testFolder, "__init__.py"));
            supportingFiles.add(new SupportingFile("__init__.hbs", testFolder + File.separator + modelPackage.replace('.', File.separatorChar), "__init__.py"));
            supportingFiles.add(new SupportingFile("__init__.hbs", testFolder + File.separator + "components", "__init__.py"));
        }

        supportingFiles.add(new SupportingFile("api_client.hbs", packagePath(), "api_client.py"));
        supportingFiles.add(new SupportingFile("rest.hbs", packagePath(), "rest.py"));
        supportingFiles.add(new SupportingFile("schemas.hbs", packagePath(), "schemas.py"));

        // add the models and apis folders
        String modelPackages = modelPackage + "s";
        boolean generateModels = (boolean) additionalProperties().get(CodegenConstants.GENERATE_MODELS);
        if (generateModels) {
            supportingFiles.add(new SupportingFile("components/schemas/__init__schemas.hbs", packagePath() + File.separatorChar + modelPackages.replace('.', File.separatorChar), "__init__.py"));
        }
        boolean generateApis = (boolean) additionalProperties().get(CodegenConstants.GENERATE_APIS);
        if (generateApis) {
            supportingFiles.add(new SupportingFile("apis/__init__apis.hbs", packagePath() + File.separatorChar + apiPackage, "__init__.py"));
        }
        // Generate the 'signing.py' module, but only if the 'HTTP signature' security scheme is specified in the OAS.
        Map<String, SecurityScheme> securitySchemeMap = openAPI != null ?
                (openAPI.getComponents() != null ? openAPI.getComponents().getSecuritySchemes() : null) : null;
        List<CodegenSecurity> authMethods = fromSecurity(securitySchemeMap);
        if (ProcessUtils.hasHttpSignatureMethods(authMethods)) {
            supportingFiles.add(new SupportingFile("signing.hbs", packagePath(), "signing.py"));
        }

        // check library option to ensure only urllib3 is supported
        if (!DEFAULT_LIBRARY.equals(getLibrary())) {
            throw new RuntimeException("Only the `urllib3` library is supported in the refactored `python` client generator at the moment. Please fall back to `python-legacy` client generator for the time being. We welcome contributions to add back `asyncio`, `tornado` support to the `python` client generator.");
        }
    }

    @Override
    public String requestBodyFileFolder(String componentName) {
        String requestBodyFilename = toRequestBodyFilename(componentName);
        return outputFolder + File.separatorChar + packagePath() + File.separatorChar + "components" + File.separatorChar + "request_bodies" + File.separatorChar + requestBodyFilename;
    }

    @Override
    public String headerFileFolder(String componentName) {
        String headerFilename = toHeaderFilename(componentName);
        return outputFolder + File.separatorChar + packagePath() + File.separatorChar + "components" + File.separatorChar + "headers" + File.separatorChar + headerFilename;
    }

    @Override
    public String parameterFileFolder(String componentName) {
        String parameterFilename = toParameterFilename(componentName);
        return outputFolder + File.separatorChar + packagePath() + File.separatorChar + "components" + File.separatorChar + "parameters" + File.separatorChar + parameterFilename;
    }

    public String headerDocFileFolder() {
        return outputFolder + File.separator + headerDocPath;
    }

    public String parameterDocFileFolder() { return outputFolder + File.separator + parameterDocPath; }

    @Override
    public String apiFilename(String templateName, String tag) {
        String suffix = apiTemplateFiles().get(templateName);
        return apiFileFolder() + File.separator + toApiFilename(tag) + suffix;
    }

    @Override
    public String toApiName(String name) {
        if (name.length() == 0) {
            return "DefaultApi";
        }
        return toModelName(name) + apiNameSuffix;
    }

    /*
    We have a custom version of this method so for composed schemas and object schemas we add properties only if they
    are defined in that schema (x.properties). We do this because validation should be done independently in each schema
    If properties are hosted into composed schemas, they can collide or incorrectly list themself as required when
    they are not.
     */
    @Override
    protected void addVarsRequiredVarsAdditionalProps(Schema schema, OpenApiSchema property, String sourceJsonPath, String currentJsonPath){
        setAddProps(schema, property, sourceJsonPath, currentJsonPath);
        if (ModelUtils.isAnyType(schema) && supportsAdditionalPropertiesWithComposedSchema) {
            // if anyType schema has properties then add them
            if (schema.getProperties() != null && !schema.getProperties().isEmpty()) {
                if (schema instanceof ComposedSchema) {
                    ComposedSchema cs = (ComposedSchema) schema;
                    if (cs.getOneOf() != null && !cs.getOneOf().isEmpty()) {
                        LOGGER.warn("'oneOf' is intended to include only the additional optional OAS extension discriminator object. " +
                                "For more details, see https://json-schema.org/draft/2019-09/json-schema-core.html#rfc.section.9.2.1.3 and the OAS section on 'Composition and Inheritance'.");
                    }
                }
                HashSet<String> requiredVars = new HashSet<>();
                if (schema.getRequired() != null) {
                    requiredVars.addAll(schema.getRequired());
                }
                addProperties(property, schema.getProperties(), requiredVars, sourceJsonPath, currentJsonPath);
            }
            addRequiredProperties(schema, property, sourceJsonPath, currentJsonPath);
            return;
        } else if (ModelUtils.isTypeObjectSchema(schema)) {
            HashSet<String> requiredVars = new HashSet<>();
            if (schema.getRequired() != null) {
                requiredVars.addAll(schema.getRequired());
            }
            addProperties(property, schema.getProperties(), requiredVars, sourceJsonPath, currentJsonPath);
        }
        addRequiredProperties(schema, property, sourceJsonPath, currentJsonPath);
    }

    /**
     * Configures a friendly name for the generator.  This will be used by the
     * generator to select the library with the -g flag.
     *
     * @return the friendly name for the generator
     */
    @Override
    public String getName() {
        return "python";
    }

    @Override
    public String getHelp() {
        String newLine = System.getProperty("line.separator");
        return String.join("<br />",
                "Generates a Python client library",
                "",
                "Features in this generator:",
                "- type hints on endpoints and model creation",
                "- model parameter names use the spec defined keys and cases",
                "- robust composition (oneOf/anyOf/allOf/not) where payload data is stored in one instance only",
                "- endpoint parameter names use the spec defined keys and cases",
                "- inline schemas are supported at any location including composition",
                "- multiple content types supported in request body and response bodies",
                "- run time type checking",
                "- Sending/receiving decimals as strings supported with type:string format: number -> DecimalSchema",
                "- Sending/receiving uuids as strings supported with type:string format: uuid -> UUIDSchema",
                "- quicker load time for python modules (a single endpoint can be imported and used without loading others)",
                "- all instances of schemas dynamically inherit from all matching schemas so one can use isinstance to check if validation passed",
                "- composed schemas with type constraints supported (type:object + oneOf/anyOf/allOf)",
                "- schemas are not coerced/cast. For example string + date are both stored as string, and there is a date accessor",
                "    - Exceptions: int/float is stored as Decimal, When receiving data from headers it will start as str and may need to be cast for example to int");
    }

    @Override
    public Schema unaliasSchema(Schema schema) {
        // python allows schemas to be inlined at any location so unaliasing should do nothing
        return schema;
    }

    public String pythonDate(Object dateValue) {
        String strValue = null;
        if (dateValue instanceof OffsetDateTime) {
            OffsetDateTime date = null;
            try {
                date = (OffsetDateTime) dateValue;
            } catch (ClassCastException e) {
                LOGGER.warn("Invalid `date` format for value {}", dateValue.toString());
                date = ((Date) dateValue).toInstant().atOffset(ZoneOffset.UTC);
            }
            strValue = date.format(iso8601Date);
        } else {
            strValue = dateValue.toString();
        }
        return strValue;
    }

    public String pythonDateTime(Object dateTimeValue) {
        String strValue = null;
        if (dateTimeValue instanceof OffsetDateTime) {
            OffsetDateTime dateTime = null;
            try {
                dateTime = (OffsetDateTime) dateTimeValue;
            } catch (ClassCastException e) {
                LOGGER.warn("Invalid `date-time` format for value {}", dateTimeValue.toString());
                dateTime = ((Date) dateTimeValue).toInstant().atOffset(ZoneOffset.UTC);
            }
            strValue = dateTime.format(iso8601DateTime);
        } else {
            strValue = dateTimeValue.toString();
        }
        return strValue;
    }

    /**
     * Return the default value of the property
     *
     * @param p OpenAPI property object
     * @return string presentation of the default value of the property
     */
    @Override
    public String toDefaultValue(Schema p) {
        Object defaultObject = null;
        if (p.getDefault() != null) {
            defaultObject = p.getDefault();
        }

        if (defaultObject == null) {
            return null;
        }

        String defaultValue = defaultObject.toString();
        if (ModelUtils.isDateSchema(p)) {
            defaultValue = pythonDate(defaultObject);
        } else if (ModelUtils.isDateTimeSchema(p)) {
            defaultValue = pythonDateTime(defaultObject);
        } else if (ModelUtils.isStringSchema(p) && !ModelUtils.isByteArraySchema(p) && !ModelUtils.isBinarySchema(p) && !ModelUtils.isFileSchema(p) && !ModelUtils.isUUIDSchema(p) && !ModelUtils.isEmailSchema(p)) {
            defaultValue = ensureQuotes(defaultValue);
        } else if (ModelUtils.isBooleanSchema(p)) {
            if (Boolean.valueOf(defaultValue) == false) {
                defaultValue = "False";
            } else {
                defaultValue = "True";
            }
        }
        return defaultValue;
    }

    @Override
    public String toModelImport(String refClass) {
        // name looks like cat.Cat
        String[] refClassPieces = refClass.split("\\.");
        if (refClassPieces.length != 2) {
            return null;
        }
        String modelModule = refClassPieces[0];
        return "from " + packageName + "." +  modelPackage() + " import " + modelModule;
    }

    /***
     * Override with special post-processing for all models.
     * we have a custom version of this method to:
     * - remove any primitive models that do not contain validations
     *      these models are unaliased as inline definitions wherever the spec has them as refs
     *      this means that the generated client does not use these models
     *      because they are not used we do not write them
     * - fix the model imports, go from model name to the full import string with toModelImport + globalImportFixer
     * Also cleans the test folder if test cases exist and the testFolder is set because the tests are autogenerated
     *
     * @param objs a map going from the model name to a object hoding the model info
     * @return the updated objs
     */
    @Override
    public TreeMap<String, CodegenSchema> postProcessAllModels(TreeMap<String, CodegenSchema> objs) {
        super.postProcessAllModels(objs);

        boolean anyModelContainsTestCases = false;
        Map<String, Schema> allDefinitions = ModelUtils.getSchemas(this.openAPI);
        for (CodegenSchema cm : objs.values()) {
            if (cm.testCases != null && !cm.testCases.isEmpty()) {
                anyModelContainsTestCases = true;
            }
        }
        boolean testFolderSet = testFolder != null;
        if (testFolderSet && anyModelContainsTestCases) {
            // delete the test folder because tests there will be autogenerated
            String testPath = outputFolder + File.separatorChar + testFolder;
            File testDirectory = new File(testPath);
            try {
                FileUtils.cleanDirectory(testDirectory);
            } catch (IOException e) {
                LOGGER.info("Unable to delete the test folder because of exception=" + e.toString());
            }

        }

        return objs;
    }

    protected boolean isValid(String name) {
        boolean isValid = super.isValid(name);
        if (!isValid) {
            return false;
        }
        boolean nameValidPerRegex = name.matches("^[_a-zA-Z][_a-zA-Z0-9]*$");
        return nameValidPerRegex;
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
        // fix needed for values with /n /t etc in them
        CodegenSchema cp = super.fromSchema(p, sourceJsonPath, currentJsonPath);
        if (cp.isInteger && cp.getFormat() == null) {
            // this generator treats integers as type number
            // this is done so type int + float has the same base class (decimal.Decimal)
            // so integer validation info must be set using formatting
            cp.setFormat("int");
        }
        if (cp.isAnyType && cp.isNullable) {
            cp.isNullable = false;
        }
        if (cp.isNullable && cp.refInfo() == null) {
            cp.setIsNull(true);
            cp.isNullable = false;
            cp.setHasMultipleTypes(true);
        }
        if (p.getPattern() != null) {
            postProcessPattern(p.getPattern(), cp.vendorExtensions);
        }
        if (cp.isEnum) {
            updateCodegenPropertyEnum(cp);
        }
        return cp;
    }

    public String getItemsName(Schema containingSchema, String containingSchemaName) {
        return "items";
    }

    /**
     * Update codegen property's enum by adding "enumVars" (with name and value)
     *
     * @param var list of CodegenSchema
     */
    @Override
    public void updateCodegenPropertyEnum(CodegenSchema var) {
        // we have a custom version of this method to omit overwriting the defaultValue
        Map<String, Object> allowableValues = var.allowableValues;

        if (allowableValues == null) {
            return;
        }

        List<Object> values = (List<Object>) allowableValues.get("values");
        if (values == null) {
            return;
        }

        // put "enumVars" map into `allowableValues", including `name` and `value`
        List<Map<String, Object>> enumVars = buildEnumVars(values, var);

        allowableValues.put("enumVars", enumVars);
        // overwriting defaultValue omitted from here
    }

    /**
     * Return the sanitized variable name for enum
     *
     * @param value    enum variable name
     * @param prop property
     * @return the sanitized variable name for enum
     */
    @Override
    public String toEnumVarName(String value, CodegenSchema prop) {
        // our enum var names are keys in a python dict, so change spaces to underscores
        if (value.length() == 0) {
            return "EMPTY";
        } else if (value.equals("null")) {
            return "NONE";
        }

        String intPattern = "^[-\\+]?\\d+$";
        String floatPattern = "^[-\\+]?\\d+\\.\\d+$";
        Boolean intMatch = Pattern.matches(intPattern, value);
        Boolean floatMatch = Pattern.matches(floatPattern, value);
        if (intMatch || floatMatch) {
            String plusSign = "^\\+.+";
            String negSign = "^-.+";
            if (Pattern.matches(plusSign, value)) {
                value = value.replace("+", "POSITIVE_");
            } else if (Pattern.matches(negSign, value)) {
                value = value.replace("-", "NEGATIVE_");
            } else {
                value = "POSITIVE_" + value;
            }
            if (floatMatch) {
                value = value.replace(".", "_PT_");
            }
            return value;
        }
        // Replace " " with _
        String usedValue = value.replaceAll("\\s+", "_");
        // strip first character if it is invalid
        int lengthBeforeFirstCharStrip = usedValue.length();
        Character firstChar = usedValue.charAt(0);
        usedValue = usedValue.replaceAll("^[^_a-zA-Z]", "");
        boolean firstCharStripped = usedValue.length() == lengthBeforeFirstCharStrip - 1;
        // Replace / with _ for path enums
        usedValue = usedValue.replaceAll("/", "_");
        // Replace . with _ for tag enums
        usedValue = usedValue.replaceAll("\\.", "_");
        // add underscore at camelCase locations
        String regex = "([a-z])([A-Z]+)";
        String replacement = "$1_$2";
        usedValue = usedValue.replaceAll(regex, replacement);
        // Replace invalid characters with empty space
        usedValue = usedValue.replaceAll("[^_a-zA-Z0-9]*", "");
        // uppercase
        usedValue = usedValue.toUpperCase(Locale.ROOT);

        if (usedValue.length() == 0) {
            for (int i = 0; i < value.length(); i++){
                Character c = value.charAt(i);
                String charName = Character.getName(c.hashCode());
                usedValue += charNameToVarName(charName);
            }
            // remove trailing _
            usedValue = usedValue.replaceAll("[_]$", "");
        }
        // check first character to see if it is valid
        // if not then add a valid prefix
        boolean validFirstChar = Pattern.matches("^[_a-zA-Z]", usedValue.substring(0,1));
        if (!validFirstChar && firstCharStripped) {
            String charName = Character.getName(firstChar.hashCode());
            usedValue = charNameToVarName(charName) + "_" + usedValue;
        }

        return usedValue;
    }

    /**
     * Replace - and " " with _
     * Remove SIGN
     *
     * @param charName
     * @return
     */
    private String charNameToVarName(String charName) {
        String varName = charName.replaceAll("[\\-\\s]", "_");
        varName = varName.replaceAll("SIGN", "");
        return varName;
    }

    protected List<Map<String, Object>> buildEnumVars(List<Object> values, CodegenSchema prop) {
        List<Map<String, Object>> enumVars = new ArrayList<>();
        int truncateIdx = 0;

        if (isRemoveEnumValuePrefix()) {
            String commonPrefix = findCommonPrefixOfVars(values);
            truncateIdx = commonPrefix.length();
        }

        for (Object value : values) {
            Map<String, Object> enumVar = new HashMap<>();
            String enumName;
            if (truncateIdx == 0) {
                enumName = String.valueOf(value);
            } else {
                enumName = value.toString().substring(truncateIdx);
                if (enumName.isEmpty()) {
                    enumName = value.toString();
                }
            }

            enumVar.put("name", toEnumVarName(enumName, prop));
            if (value instanceof Integer) {
                enumVar.put("value", value);
            } else if (value instanceof Double) {
                enumVar.put("value", value);
            } else if (value instanceof Long) {
                enumVar.put("value", value);
            } else if (value instanceof Float) {
                enumVar.put("value", value);
            } else if (value instanceof BigDecimal) {
                enumVar.put("value", value);
            } else if (value == null) {
                enumVar.put("value", "schemas.NoneClass.NONE");
            } else if (value instanceof Boolean) {
                if (value.equals(Boolean.TRUE)) {
                    enumVar.put("value", "schemas.BoolClass.TRUE");
                } else {
                    enumVar.put("value", "schemas.BoolClass.FALSE");
                }
            } else {
                String fixedValue = (String) processTestExampleData(value);
                enumVar.put("value", ensureQuotes(fixedValue));
            }
            enumVar.put("isString", prop.isString);
            enumVars.add(enumVar);
        }

        if (enumUnknownDefaultCase) {
            // If the server adds new enum cases, that are unknown by an old spec/client, the client will fail to parse the network response.
            // With this option enabled, each enum will have a new case, 'unknown_default_open_api', so that when the server sends an enum case that is not known by the client/spec, they can safely fallback to this case.
            Map<String, Object> enumVar = new HashMap<>();
            String enumName = enumUnknownDefaultCaseName;

            String enumValue;
            if (prop.isString) {
                enumValue = enumUnknownDefaultCaseName;
            } else {
                // This is a dummy value that attempts to avoid collisions with previously specified cases.
                // Int.max / 192
                // The number 192 that is used to calculate this random value, is the Swift Evolution proposal for frozen/non-frozen enums.
                // [SE-0192](https://github.com/apple/swift-evolution/blob/master/proposals/0192-non-exhaustive-enums.md)
                // Since this functionality was born in the Swift 5 generator and latter on broth to all generators
                // https://github.com/OpenAPITools/openapi-generator/pull/11013
                enumValue = String.valueOf(11184809);
            }

            enumVar.put("name", toEnumVarName(enumName, prop));
            enumVar.put("value", toEnumValue(enumValue, prop));
            enumVar.put("isString", prop.isString);
            enumVars.add(enumVar);
        }

        return enumVars;
    }

    protected String toTestCaseName(String specTestCaseName) {
        return CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, specTestCaseName);
    }

    protected String handleSpecialCharacters(String value) {
        // handles escape characters and the like
        String stringValue = value;
        String backslash = "\\";
        if (stringValue.contains(backslash)) {
            stringValue = stringValue.replace(backslash, "\\\\");
        }
        String nullChar = "\0";
        if (stringValue.contains(nullChar)) {
            stringValue = stringValue.replace(nullChar, "\\x00");
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

    protected Object processTestExampleData(Object value) {
        if (value instanceof Integer){
            return value;
        } else if (value instanceof Double || value instanceof Float || value instanceof Boolean){
            return value;
        } else if (value instanceof String) {
            return handleSpecialCharacters((String) value);
        } else if (value instanceof LinkedHashMap) {
            LinkedHashMap<String, Object> fixedValues = new LinkedHashMap();
            for (Map.Entry entry: ((LinkedHashMap<String, Object>) value).entrySet()) {
                String entryKey = (String) processTestExampleData(entry.getKey());
                Object entryValue = processTestExampleData(entry.getValue());
                fixedValues.put(entryKey, entryValue);
            }
            return fixedValues;
        } else if (value instanceof ArrayList) {
            ArrayList<Object> fixedValues = (ArrayList<Object>) value;
            for (int i = 0; i < fixedValues.size(); i++) {
                Object item = processTestExampleData(fixedValues.get(i));
                fixedValues.set(i, item);
            }
            return fixedValues;
        } else if (value == null) {
            return value;
        }
        return value;
    }

    /**
     * Returns the python type for the property.
     *
     * @param schema property schema
     * @return string presentation of the type
     **/
    @SuppressWarnings("static-method")
    @Override
    public String getSchemaType(Schema schema) {
        String openAPIType = getSingleSchemaType(schema);
        if (typeMapping.containsKey(openAPIType)) {
            String type = typeMapping.get(openAPIType);
            return type;
        }
        return toModelName(openAPIType);
    }

    public String getRefClassWithRefModule(Schema sc) {
        String ref = sc.get$ref();
        if (ref != null) {
            return  toRefModule(ref, null, "schemas") + "." + toRefClass(ref, null, "schemas");
        }
        return null;
    }

    @Override
    public String toInstantiationType(Schema property) {
        if (ModelUtils.isArraySchema(property) || ModelUtils.isMapSchema(property) || property.getAdditionalProperties() != null) {
            return getSchemaType(property);
        }
        return super.toInstantiationType(property);
    }

    @Override
    protected void addAdditionPropertiesToCodeGenModel(CodegenSchema codegenModel, Schema schema) {
    }

    /**
     * Gets an example if it exists
     *
     * @param sc input schema
     * @return the example value
     */
    protected Object getObjectExample(Schema sc) {
        Schema schema = sc;
        String ref = sc.get$ref();
        if (ref != null) {
            schema = ModelUtils.getSchema(this.openAPI, ModelUtils.getSimpleRef(ref));
        }
        // TODO handle examples in object models in the future
        Boolean objectModel = (ModelUtils.isObjectSchema(schema) || ModelUtils.isMapSchema(schema) || ModelUtils.isComposedSchema(schema));
        if (objectModel) {
            return null;
        }
        if (schema.getExample() != null) {
            return schema.getExample();
        }
        if (schema.getDefault() != null) {
            return schema.getDefault();
        } else if (schema.getEnum() != null && !schema.getEnum().isEmpty()) {
            return schema.getEnum().get(0);
        }
        return null;
    }

    /***
     * Ensures that the string has a leading and trailing quote
     *
     * @param in input string
     * @return quoted string
     */
    private String ensureQuotes(String in) {
        String strPattern = "^['\"].*?['\"]$";
        if (in.matches(strPattern)) {
            return in;
        }
        return "\"" + in + "\"";
    }

    @Override
    public String toExampleValue(Schema schema) {
        String modelName = getRefClassWithRefModule(schema);
        Object objExample = getObjectExample(schema);
        return toExampleValueRecursive(modelName, schema, objExample, 1, "", 0, new ArrayList<>());
    }

    @Override
    public String toExampleValue(Schema schema, Object objExample) {
        String modelName = getRefClassWithRefModule(schema);
        return toExampleValueRecursive(modelName, schema, objExample, 1, "", 0, new ArrayList<>());
    }

    private Boolean simpleStringSchema(Schema schema) {
        Schema sc = schema;
        String ref = schema.get$ref();
        if (ref != null) {
            sc = ModelUtils.getSchema(this.openAPI, ModelUtils.getSimpleRef(ref));
        }
        if (ModelUtils.isStringSchema(sc) && !ModelUtils.isDateSchema(sc) && !ModelUtils.isDateTimeSchema(sc) && !"Number".equalsIgnoreCase(sc.getFormat()) && !ModelUtils.isByteArraySchema(sc) && !ModelUtils.isBinarySchema(sc) && schema.getPattern() == null) {
            return true;
        }
        return false;
    }

    private String getSchemaName(String complexType) {
        String[] packageNameSplits = complexType.split("\\.");
        if (packageNameSplits.length == 1) {
            return packageNameSplits[0];
        }
        return packageNameSplits[1];
    }

    private MappedModel getDiscriminatorMappedModel(CodegenDiscriminator disc) {
        for (MappedModel mm : disc.getMappedModels()) {
            String complexType = mm.getModelName();
            String schemaName = getSchemaName(complexType);
            Schema modelSchema = getModelNameToSchemaCache().get(schemaName);
            if (ModelUtils.isObjectSchema(modelSchema)) {
                return mm;
            }
        }
        return null;
    }

    /***
     * Recursively generates string examples for schemas
     *
     * @param modelName the string name of the refed model that will be generated for the schema or null
     * @param schema the schema that we need an example for
     * @param objExample the example that applies to this schema, for now only string example are used
     * @param indentationLevel integer indentation level that we are currently at
     *                         we assume the indentaion amount is 4 spaces times this integer
     * @param prefix the string prefix that we will use when assigning an example for this line
     *               this is used when setting key: value, pairs "key: " is the prefix
     *               and this is used when setting properties like some_property='some_property_example'
     * @param exampleLine this is the current line that we are generatign an example for, starts at 0
     *                    we don't indentin the 0th line because using the example value looks like:
     *                    prop = ModelName( line 0
     *                        some_property='some_property_example' line 1
     *                    ) line 2
     *                    and our example value is:
     *                    ModelName( line 0
     *                        some_property='some_property_example' line 1
     *                    ) line 2
     * @param includedSchemas are a list of schemas that we have moved through to get here. If the new schemas that we
     *                        are looking at is in includedSchemas then we have hit a cycle.
     * @return the string example
     */
    private String toExampleValueRecursive(String modelName, Schema schema, Object objExample, int indentationLevel, String prefix, Integer exampleLine, List<Schema> includedSchemas) {
        boolean couldHaveCycle = includedSchemas.size() > 0 && potentiallySelfReferencingSchema(schema);
        // If we have seen the ContextAwareSchemaNode more than once before, we must be in a cycle.
        boolean cycleFound = false;
        if (couldHaveCycle) {
            cycleFound = includedSchemas.subList(0, includedSchemas.size()-1).stream().anyMatch(s -> schema.equals(s));
        }
        final String indentionConst = "    ";
        String currentIndentation = "";
        String closingIndentation = "";
        for (int i = 0; i < indentationLevel; i++) currentIndentation += indentionConst;
        if (exampleLine.equals(0)) {
            closingIndentation = currentIndentation;
            currentIndentation = "";
        } else {
            closingIndentation = currentIndentation;
        }
        String openChars = "";
        String closeChars = "";
        if (modelName != null) {
            openChars = modelName + "(";
            closeChars = ")";
        }

        String fullPrefix = currentIndentation + prefix + openChars;

        String example = null;
        if (objExample != null) {
            example = objExample.toString();
        }
        if (null != schema.get$ref()) {
            Map<String, Schema> allDefinitions = ModelUtils.getSchemas(this.openAPI);
            String ref = ModelUtils.getSimpleRef(schema.get$ref());
            Schema refSchema = allDefinitions.get(ref);
            if (null == refSchema) {
                LOGGER.warn("Unable to find referenced schema " + schema.get$ref() + "\n");
                return fullPrefix + "None" + closeChars;
            }
            String refModelName = getRefClassWithRefModule(schema);
            return toExampleValueRecursive(refModelName, refSchema, objExample, indentationLevel, prefix, exampleLine, includedSchemas);
        } else if (ModelUtils.isNullType(schema)) {
            // The 'null' type is allowed in OAS 3.1 and above. It is not supported by OAS 3.0.x,
            // though this tooling supports it.
            return fullPrefix + "None" + closeChars;
        } else if (ModelUtils.isAnyType(schema)) {
            /*
             This schema may be a composed schema
             TODO generate examples for some of these use cases in the future like
             only oneOf without a discriminator
             */
            if (cycleFound) {
                return "";
            }
            Boolean hasProperties = (schema.getProperties() != null && !schema.getProperties().isEmpty());
            CodegenDiscriminator disc = createDiscriminator(modelName, schema, openAPI, "");
            if (ModelUtils.isComposedSchema(schema)) {
                if(includedSchemas.contains(schema)) {
                    return "";
                }
                includedSchemas.add(schema);
                // complex composed object type schemas not yet handled and the code returns early
                if (hasProperties) {
                    // what if this composed schema defined properties + allOf?
                    // or items + properties, both a ist and a dict could be accepted as payloads
                    return fullPrefix + "{}" + closeChars;
                }
                ComposedSchema cs = (ComposedSchema) schema;
                Integer allOfExists = 0;
                if (cs.getAllOf() != null && !cs.getAllOf().isEmpty()) {
                    allOfExists = 1;
                }
                Integer anyOfExists = 0;
                if (cs.getAnyOf() != null && !cs.getAnyOf().isEmpty()) {
                    anyOfExists = 1;
                }
                Integer oneOfExists = 0;
                if (cs.getOneOf() != null && !cs.getOneOf().isEmpty()) {
                    oneOfExists = 1;
                }
                if (allOfExists + anyOfExists + oneOfExists > 1) {
                    // what if it needs one oneOf schema, one anyOf schema, and two allOf schemas?
                    return fullPrefix + "None" + closeChars;
                }
                // for now only oneOf with discriminator is supported
                if (oneOfExists == 1 && disc != null) {
                    ;
                } else {
                    return fullPrefix + "None" + closeChars;
                }
            }
            if (disc != null) {
                // a discriminator means that the type must be object
                MappedModel mm = getDiscriminatorMappedModel(disc);
                if (mm == null) {
                    return fullPrefix + "None" + closeChars;
                }
                String discPropNameValue = mm.getMappingName();
                String schemaName = getSchemaName(mm.getModelName());
                Schema modelSchema = getModelNameToSchemaCache().get(schemaName);
                CodegenSchema cp = new CodegenSchema();
                CodegenKey ck = getKey(disc.getPropertyName());
                cp.setName(ck);
                cp.setExample(discPropNameValue);
                return exampleForObjectModel(modelSchema, fullPrefix, closeChars, cp, indentationLevel, exampleLine, closingIndentation, includedSchemas);
            }
            return fullPrefix + "None" + closeChars;
        } else if (ModelUtils.isBooleanSchema(schema)) {
            if (example == null) {
                example = "True";
            } else {
                if ("false".equalsIgnoreCase(objExample.toString())) {
                    example = "False";
                } else {
                    example = "True";
                }
            }
            return fullPrefix + example + closeChars;
        } else if (ModelUtils.isStringSchema(schema)) {
            if (example != null) {
                return fullPrefix + ensureQuotes(handleSpecialCharacters(example)) + closeChars;
            }
            if (ModelUtils.isDateSchema(schema)) {
                if (objExample == null) {
                    example = pythonDate("1970-01-01");
                } else {
                    example = pythonDate(objExample);
                }
            } else if (ModelUtils.isDateTimeSchema(schema)) {
                if (objExample == null) {
                    example = pythonDateTime("1970-01-01T00:00:00.00Z");
                } else {
                    example = pythonDateTime(objExample);
                }
            } else if (ModelUtils.isBinarySchema(schema)) {
                if (example == null) {
                    example = "/path/to/file";
                }
                example = "open('" + example + "', 'rb')";
                return fullPrefix + example + closeChars;
            } else if (ModelUtils.isByteArraySchema(schema)) {
                if (objExample == null) {
                    example = "'YQ=='";
                }
            } else if ("Number".equalsIgnoreCase(schema.getFormat())) {
                // a BigDecimal:
                example = "2";
            } else if (StringUtils.isNotBlank(schema.getPattern())) {
                String pattern = schema.getPattern();
                List<Object> results = getPatternAndModifiers(pattern);
                String extractedPattern = (String) results.get(0);
                List<String> regexFlags = (List<String>) results.get(1);
                /*
                RxGen does not support our ECMA dialect https://github.com/curious-odd-man/RgxGen/issues/56
                So strip off the leading / and trailing / and turn on ignore case if we have it
                 */
                RgxGen rgxGen = null;
                if (regexFlags.size() > 0 && regexFlags.contains("i")) {
                    rgxGen = new RgxGen(extractedPattern);
                    RgxGenProperties properties = new RgxGenProperties();
                    RgxGenOption.CASE_INSENSITIVE.setInProperties(properties, true);
                    rgxGen.setProperties(properties);
                } else {
                    rgxGen = new RgxGen(extractedPattern);
                }

                // this seed makes it so if we have [a-z] we pick a
                Random random = new Random(18);
                if (rgxGen != null) {
                    example = rgxGen.generate(random);
                } else {
                    throw new RuntimeException("rgxGen cannot be null. Please open an issue in the openapi-generator github repo.");
                }
            } else if (schema.getMinLength() != null) {
                example = "";
                int len = schema.getMinLength().intValue();
                for (int i = 0; i < len; i++) example += "a";
            } else if (ModelUtils.isUUIDSchema(schema)) {
                example = "046b6c7f-0b8a-43b9-b35d-6489e6daee91";
            } else {
                example = "string_example";
            }
            return fullPrefix + ensureQuotes(example) + closeChars;
        } else if (ModelUtils.isIntegerSchema(schema)) {
            if (objExample == null) {
                if (schema.getMinimum() != null) {
                    example = schema.getMinimum().toString();
                } else {
                    example = "1";
                }
            }
            return fullPrefix + example + closeChars;
        } else if (ModelUtils.isNumberSchema(schema)) {
            if (objExample == null) {
                if (schema.getMinimum() != null) {
                    example = schema.getMinimum().toString();
                } else {
                    example = "3.14";
                }
            }
            return fullPrefix + example + closeChars;
        } else if (ModelUtils.isArraySchema(schema)) {
            if (objExample instanceof Iterable) {
                // If the example is already a list, return it directly instead of wrongly wrap it in another list
                return fullPrefix + objExample.toString() + closeChars;
            }
            if (ModelUtils.isComposedSchema(schema)) {
                // complex composed array type schemas not yet handled and the code returns early
                return fullPrefix + "[]" + closeChars;
            }
            ArraySchema arrayschema = (ArraySchema) schema;
            Schema itemSchema = arrayschema.getItems();
            String itemModelName = getRefClassWithRefModule(itemSchema);
            if(includedSchemas.contains(schema)) {
                return "";
            }
            includedSchemas.add(schema);
            String itemExample = toExampleValueRecursive(itemModelName, itemSchema, objExample, indentationLevel + 1, "", exampleLine + 1, includedSchemas);
            if (StringUtils.isEmpty(itemExample) || cycleFound) {
                return fullPrefix + "[]" + closeChars;
            } else {
                return fullPrefix + "[" + "\n" + itemExample + "\n" + closingIndentation + "]" + closeChars;
            }
        } else if (ModelUtils.isTypeObjectSchema(schema)) {
            if (modelName == null) {
                fullPrefix += "dict(";
                closeChars = ")";
            }
            if (cycleFound) {
                return fullPrefix + closeChars;
            }
            Boolean hasProperties = (schema.getProperties() != null && !schema.getProperties().isEmpty());
            CodegenDiscriminator disc = createDiscriminator(modelName, schema, openAPI, "");
            if (ModelUtils.isComposedSchema(schema)) {
                // complex composed object type schemas not yet handled and the code returns early
                if (hasProperties) {
                    // what if this composed schema defined properties + allOf?
                    return fullPrefix + closeChars;
                }
                ComposedSchema cs = (ComposedSchema) schema;
                Integer allOfExists = 0;
                if (cs.getAllOf() != null && !cs.getAllOf().isEmpty()) {
                    allOfExists = 1;
                }
                Integer anyOfExists = 0;
                if (cs.getAnyOf() != null && !cs.getAnyOf().isEmpty()) {
                    anyOfExists = 1;
                }
                Integer oneOfExists = 0;
                if (cs.getOneOf() != null && !cs.getOneOf().isEmpty()) {
                    oneOfExists = 1;
                }
                if (allOfExists + anyOfExists + oneOfExists > 1) {
                    // what if it needs one oneOf schema, one anyOf schema, and two allOf schemas?
                    return fullPrefix + closeChars;
                }
                // for now only oneOf with discriminator is supported
                if (oneOfExists == 1 && disc != null) {
                    ;
                } else {
                    return fullPrefix + closeChars;
                }
            }
            if (disc != null) {
                MappedModel mm = getDiscriminatorMappedModel(disc);
                if (mm == null) {
                    return fullPrefix + closeChars;
                }
                String discPropNameValue = mm.getMappingName();
                String schemaName = getSchemaName(mm.getModelName());
                Schema modelSchema = getModelNameToSchemaCache().get(schemaName);
                CodegenSchema cp = new CodegenSchema();
                CodegenKey ck = getKey(disc.getPropertyName());
                cp.setName(ck);
                cp.setExample(discPropNameValue);
                return exampleForObjectModel(modelSchema, fullPrefix, closeChars, cp, indentationLevel, exampleLine, closingIndentation, includedSchemas);
            }
            Object addPropsObj = schema.getAdditionalProperties();
            if (hasProperties) {
                return exampleForObjectModel(schema, fullPrefix, closeChars, null, indentationLevel, exampleLine, closingIndentation, includedSchemas);
            } else if (addPropsObj instanceof Schema) {
                // TODO handle true case for additionalProperties
                Schema addPropsSchema = (Schema) addPropsObj;
                String key = "key";
                Object addPropsExample = getObjectExample(addPropsSchema);
                if (addPropsSchema.getEnum() != null && !addPropsSchema.getEnum().isEmpty()) {
                    key = addPropsSchema.getEnum().get(0).toString();
                }
                addPropsExample = exampleFromStringOrArraySchema(addPropsSchema, addPropsExample, key);
                String addPropPrefix = key + "=";
                if (modelName == null) {
                    addPropPrefix = ensureQuotes(key) + ": ";
                }
                String addPropsModelName = getRefClassWithRefModule(addPropsSchema);
                if(includedSchemas.contains(schema)) {
                    return "";
                }
                includedSchemas.add(schema);

                example = fullPrefix + "\n" + toExampleValueRecursive(addPropsModelName, addPropsSchema, addPropsExample, indentationLevel + 1, addPropPrefix, exampleLine + 1, includedSchemas) + ",\n" + closingIndentation + closeChars;
            } else {
                example = fullPrefix + closeChars;
            }
        } else {
            LOGGER.warn("Type " + schema.getType() + " not handled properly in toExampleValue");
        }

        return example;
    }

    private boolean potentiallySelfReferencingSchema(Schema schema) {
        return null != schema.get$ref() || ModelUtils.isArraySchema(schema) || ModelUtils.isMapSchema(schema) || ModelUtils.isObjectSchema(schema) || ModelUtils.isComposedSchema(schema);
    }

    private String exampleForObjectModel(Schema schema, String fullPrefix, String closeChars, CodegenSchema discProp, int indentationLevel, int exampleLine, String closingIndentation, List<Schema> includedSchemas) {

        if (schema == null) {
            String A = "a";
        }
        Map<String, Schema> requiredAndOptionalProps = schema.getProperties();
        if (requiredAndOptionalProps == null || requiredAndOptionalProps.isEmpty()) {
            return fullPrefix + closeChars;
        }

        if(includedSchemas.contains(schema)) {
            return "";
        }
        includedSchemas.add(schema);

        String example = fullPrefix + "\n";

        for (Map.Entry<String, Schema> entry : requiredAndOptionalProps.entrySet()) {
            String propName = entry.getKey();
            Schema propSchema = entry.getValue();
            propName = toVarName(propName);
            String propModelName = null;
            Object propExample = null;
            if (discProp != null && propName.equals(discProp.name())) {
                propModelName = null;
                propExample = discProp.example;
            } else {
                propModelName = getRefClassWithRefModule(propSchema);
                propExample = exampleFromStringOrArraySchema(
                        propSchema,
                        null,
                        propName);
            }

            example += toExampleValueRecursive(propModelName,
                                               propSchema,
                                               propExample,
                                               indentationLevel + 1,
                                               propName + "=",
                                               exampleLine + 1,
                                               includedSchemas) + ",\n";
        }

        // TODO handle additionalProperties also
        example += closingIndentation + closeChars;
        return example;

    }

    private Object exampleFromStringOrArraySchema(Schema sc, Object currentExample, String propName) {
        if (currentExample != null) {
            return currentExample;
        }
        Schema schema = sc;
        String ref = sc.get$ref();
        if (ref != null) {
            schema = ModelUtils.getSchema(this.openAPI, ModelUtils.getSimpleRef(ref));
        }
        Object example = getObjectExample(schema);
        if (example != null) {
            return example;
        } else if (simpleStringSchema(schema)) {
            return propName + "_example";
        } else if (ModelUtils.isArraySchema(schema)) {
            ArraySchema arraySchema = (ArraySchema) schema;
            Schema itemSchema = arraySchema.getItems();
            example = getObjectExample(itemSchema);
            if (example != null) {
                return example;
            } else if (simpleStringSchema(itemSchema)) {
                return propName + "_example";
            }
        }
        return null;
    }


    /***
     *
     * Set the codegenParameter example value
     * We have a custom version of this function so we can invoke toExampleValue
     *
     * @param codegenParameter the item we are setting the example on
     * @param parameter the base parameter that came from the spec
     */
    @Override
    public void setParameterExampleValue(CodegenParameter codegenParameter, Parameter parameter) {
        Schema schema = parameter.getSchema();
        if (schema == null) {
            LOGGER.warn("CodegenParameter.example defaulting to null because parameter lacks a schema");
            return;
        }

        Object example = null;
        if (codegenParameter.getVendorExtensions() != null && codegenParameter.getVendorExtensions().containsKey("x-example")) {
            example = codegenParameter.getVendorExtensions().get("x-example");
        } else if (parameter.getExample() != null) {
            example = parameter.getExample();
        } else if (parameter.getExamples() != null && !parameter.getExamples().isEmpty() && parameter.getExamples().values().iterator().next().getValue() != null) {
            example = parameter.getExamples().values().iterator().next().getValue();
        } else {
            example = getObjectExample(schema);
        }
        example = exampleFromStringOrArraySchema(schema, example, parameter.getName());
        String finalExample = toExampleValue(schema, example);
        codegenParameter.setExample(finalExample);
    }

    /**
     * Return the example value of the parameter.
     *
     * @param codegenParameter Codegen parameter
     * @param requestBody      Request body
     */
    @Override
    public void setParameterExampleValue(CodegenParameter codegenParameter, RequestBody requestBody) {
        if (codegenParameter.getVendorExtensions() != null && codegenParameter.getVendorExtensions().containsKey("x-example")) {
            codegenParameter.setExample(Json.pretty(codegenParameter.getVendorExtensions().get("x-example")));
        }

        Content content = requestBody.getContent();

        if (content.size() > 1) {
            // @see ModelUtils.getSchemaFromContent()
            once(LOGGER).warn("Multiple MediaTypes found, using only the first one");
        }

        MediaType mediaType = content.values().iterator().next();
        Schema schema = mediaType.getSchema();
        if (schema == null) {
            LOGGER.warn("CodegenParameter.example defaulting to null because requestBody content lacks a schema");
            return;
        }

        Object example = null;
        if (mediaType.getExample() != null) {
            example = mediaType.getExample();
        } else if (mediaType.getExamples() != null && !mediaType.getExamples().isEmpty() && mediaType.getExamples().values().iterator().next().getValue() != null) {
            example = mediaType.getExamples().values().iterator().next().getValue();
        } else {
            example = getObjectExample(schema);
        }
        example = exampleFromStringOrArraySchema(schema, example, codegenParameter.baseName);
        codegenParameter.setExample(toExampleValue(schema, example));
    }

    /**
     * Return a map from model name to Schema for efficient lookup.
     *
     * @return map from model name to Schema.
     */
    protected Map<String, Schema> getModelNameToSchemaCache() {
        if (modelNameToSchemaCache == null) {
            // Create a cache to efficiently lookup schema based on model name.
            Map<String, Schema> m = new HashMap<String, Schema>();
            ModelUtils.getSchemas(openAPI).forEach((key, schema) -> {
                m.put(toModelName(key), schema);
            });
            modelNameToSchemaCache = Collections.unmodifiableMap(m);
        }
        return modelNameToSchemaCache;
    }

    protected void updatePropertyForString(CodegenSchema property, Schema p) {
        if (ModelUtils.isByteArraySchema(p)) {
            // isString stays true, format stores that this is a byte
        } else if (ModelUtils.isBinarySchema(p)) {
            // format stores that this is binary
            property.isString = true;
        } else if (ModelUtils.isUUIDSchema(p)) {
            // isString stays true, format stores that this is a uuid
        } else if (ModelUtils.isURISchema(p)) {
            property.isUri = true;
        } else if (ModelUtils.isEmailSchema(p)) {
            property.isEmail = true;
        } else if (ModelUtils.isDateSchema(p)) { // date format
            // isString stays true, format stores that this is a date
        } else if (ModelUtils.isDateTimeSchema(p)) { // date-time format
            // isString stays true, format stores that this is a date-time
        } else if (ModelUtils.isDecimalSchema(p)) { // type: string, format: number
            // isString stays true, format stores that this is a number
        }
        property.pattern = toRegularExpression(p.getPattern());
    }

    @Override
    public String toRegularExpression(String pattern) {
        if (pattern == null) {
            return null;
        }
        List<Object> results = getPatternAndModifiers(pattern);
        String extractedPattern = (String) results.get(0);
        return extractedPattern;
    }

    protected void updatePropertyForNumber(CodegenSchema property, Schema p) {
        property.setIsNumber(true);
        // float and double differentiation is determined with format info
    }

    protected void updatePropertyForInteger(CodegenSchema property, Schema p) {
        property.isInteger = true;
        // int32 and int64 differentiation is determined with format info
    }

    @Override
    public TreeMap<String, CodegenSchema> postProcessModels(TreeMap<String, CodegenSchema> objs) {
        // process enum in models
        return postProcessModelsEnum(objs);
    }

    /**
     * @param pattern the regex pattern
     * @return List<String pattern, List<String modifer>>
     */
    private List<Object> getPatternAndModifiers(String pattern) {
        /*
        Notes:
        RxGen does not support our ECMA dialect https://github.com/curious-odd-man/RgxGen/issues/56
        So strip off the leading / and trailing / and turn on ignore case if we have it

        json schema test cases omit the leading and trailing /s, so make sure that the regex allows that
         */
        Pattern valueExtractor = Pattern.compile("^/?(.+?)/?([simu]{0,4})$");
        Matcher m = valueExtractor.matcher(pattern);
        if (m.find()) {
            int groupCount = m.groupCount();
            if (groupCount == 1) {
                // only pattern found
                String isolatedPattern = m.group(1);
                return Arrays.asList(isolatedPattern, null);
            } else if (groupCount == 2) {
                List<String> modifiers = new ArrayList<String>();
                // patterns and flag found
                String isolatedPattern = m.group(1);
                String flags = m.group(2);
                if (flags.contains("s")) {
                    modifiers.add("DOTALL");
                }
                if (flags.contains("i")) {
                    modifiers.add("IGNORECASE");
                }
                if (flags.contains("m")) {
                    modifiers.add("MULTILINE");
                }
                return Arrays.asList(isolatedPattern, modifiers);
            }
        }
        return Arrays.asList(pattern, new ArrayList<String>());
    }

    /*
     * The OpenAPI pattern spec follows the Perl convention and style of modifiers. Python
     * does not support this in as natural a way so it needs to convert it. See
     * https://docs.python.org/2/howto/regex.html#compilation-flags for details.
     */
    public void postProcessPattern(String pattern, Map<String, Object> vendorExtensions) {
        if (pattern != null) {
            List<Object> results = getPatternAndModifiers(pattern);
            String extractedPattern = (String) results.get(0);
            List<String> modifiers = (List<String>) results.get(1);

            vendorExtensions.put("x-regex", extractedPattern);
            if (modifiers.size() > 0) {
                vendorExtensions.put("x-modifiers", modifiers);
            }
        }
    }

    @Override
    public CodegenType getTag() {
        return CodegenType.CLIENT;
    }

    @Override
    public String apiDocFileFolder() {
        return (outputFolder + File.separator + apiDocPath);
    }

    @Override
    public String modelDocFileFolder() {
        return (outputFolder + File.separator + modelDocPath);
    }

    @Override
    public String toModelDocFilename(String schemaName) {
        return toModelFilename(schemaName) + "." + toModelName(schemaName); }

    @Override
    public String toApiDocFilename(String name) {
        return toApiName(name);
    }

    public String toResponseModuleName(String componentName) {
        String suffix = toModuleFilename(componentName);
        String spacer = "";
        if (!suffix.startsWith("_")) {
            spacer = "_";
        }
        return "response" + spacer + suffix;

    }

    public String toResponseDocFilename(String componentName) { return toResponseModuleName(componentName); }

    public String responseDocFileFolder() {
        return outputFolder + File.separator + responseDocPath;
    }

    @Override
    public String toRequestBodyFilename(String componentName) {
        return toModuleFilename("request_body_" + componentName);
    }

    public String toRequestBodyDocFilename(String componentName) {
        return toRequestBodyFilename(componentName);
    }

    public String requestBodyDocFileFolder() {
        return outputFolder + File.separator + requestBodyDocPath;
    }

    public String toHeaderFilename(String componentName) { return toModuleFilename("header_" + componentName); }

    public String toHeaderDocFilename(String componentName) { return toHeaderFilename(componentName); }

    @Override
    public String addRegularExpressionDelimiter(String pattern) {
        if (StringUtils.isEmpty(pattern)) {
            return pattern;
        }

        if (!pattern.matches("^/.*")) {
            // Perform a negative lookbehind on each `/` to ensure that it is escaped.
            return "/" + pattern.replaceAll("(?<!\\\\)\\/", "\\\\/") + "/";
        }

        return pattern;
    }

    @Override
    public String apiFileFolder() {
        return outputFolder + File.separatorChar + packagePath() + File.separatorChar +  apiPackage() + File.separatorChar + "tags";
    }

    @Override
    public String modelFileFolder() {
        return outputFolder + File.separatorChar + packagePath() + File.separator + modelPackage().replace('.', File.separatorChar);
    }

    @Override
    public String apiTestFileFolder() {
        return outputFolder + File.separatorChar + testFolder;
    }

    @Override
    public String modelTestFileFolder() {
        return outputFolder + File.separatorChar + testFolder + File.separatorChar + modelPackage.replace('.', File.separatorChar);
    }

    public void setUseNose(String val) {
        this.useNose = Boolean.parseBoolean(val);
    }

    @Override
    public boolean getUseInlineModelResolver() { return useInlineModelResolver; }

    public void setUseInlineModelResolver(String val) {
        this.useInlineModelResolver = Boolean.parseBoolean(val);
    }

    public void setPackageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
    }

    public String packagePath() {
        // src is needed for modern packaging per
        // https://packaging.python.org/en/latest/tutorials/packaging-projects/
        return "src" + File.separatorChar + packageName.replace('.', File.separatorChar);    }

    /**
     * Generate Python package name from String `packageName`
     * <p>
     * (PEP 0008) Python packages should also have short, all-lowercase names,
     * although the use of underscores is discouraged.
     *
     * @param packageName Package name
     * @return Python package name that conforms to PEP 0008
     */
    @SuppressWarnings("static-method")
    public String generatePackageName(String packageName) {
        return underscore(packageName.replaceAll("[^\\w]+", ""));
    }

    @Override
    public String packageName() {
        return packageName;
    }

    protected boolean needToImport(String refClass) {
        boolean containsPeriod = refClass.contains(".");
        if (containsPeriod) {
            return true;
        }
        // self import
        return false;
    }

    /**
     * Custom version of this method so we can move the body parameter into bodyParam
     *
     * @param path       the path of the operation
     * @param httpMethod HTTP method
     * @param operation  OAS operation object
     * @param servers    list of servers
     * @return the resultant CodegenOperation instance
     */
    @Override
    public CodegenOperation fromOperation(String path,
                                          String httpMethod,
                                          Operation operation,
                                          List<Server> servers) {
        CodegenOperation co = super.fromOperation(path, httpMethod, operation, servers);
        co.httpMethod = httpMethod.toLowerCase(Locale.ROOT);
        // smuggle pathModuleName in nickname
        co.nickname = toPathFilename(path);
        // smuggle path Api class name ins operationIdSnakeCase
        co.operationIdSnakeCase = toModelName(path);

        return co;
    }

    /**
     * Custom version of this method to prevent mutation of
     * codegenOperation.operationIdLowerCase/operationIdSnakeCase
     * Property Usages:
     * - operationId: endpoint method name when using tagged apis
     * - httpMethod: endpoint method name when using path apis
     * - operationIdCamelCase: Api class name containing single endpoint for tagged apis
     * - nickname: (smuggled) path module name for path apis
     * - operationIdSnakeCase: (smuggled) path Api class name when using path apis
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
        String uniqueName = co.operationId;
        int counter = 0;
        for (CodegenOperation op : opList) {
            if (uniqueName.equals(op.operationId)) {
                uniqueName = co.operationId + "_" + counter;
                counter++;
            }
        }
        if (!co.operationId.equals(uniqueName)) {
            LOGGER.warn("generated unique operationId `{}`", uniqueName);
        }
        co.operationId = uniqueName;
        co.operationIdCamelCase = camelize(uniqueName);
        opList.add(co);
        co.baseName = tag;
    }

    @Override
    public String defaultTemplatingEngine() {
        return "handlebars";
    }

    @Override
    public String generatorLanguageVersion() { return ">=3.7"; };

    @Override
    public void preprocessOpenAPI(OpenAPI openAPI) {
        String originalSpecVersion;
        String xOriginalSwaggerVersion = "x-original-swagger-version";
        if (openAPI.getExtensions() != null && !openAPI.getExtensions().isEmpty() && openAPI.getExtensions().containsKey(xOriginalSwaggerVersion)) {
            originalSpecVersion = (String) openAPI.getExtensions().get(xOriginalSwaggerVersion);
        } else {
            originalSpecVersion = openAPI.getOpenapi();
        }
        Integer specMajorVersion = Integer.parseInt(originalSpecVersion.substring(0, 1));
        if (specMajorVersion < 3) {
            throw new RuntimeException("Your spec version of "+originalSpecVersion+" is too low. " + getName() + " only works with specs with version >= 3.X.X. Please use a tool like Swagger Editor or Swagger Converter to convert your spec to v3");
        }
    }

    /**
     * Note: a custom version of this function is used so the original tag value can be used
     *
     * @param tag Tag
     * @return the tag to use
     */
    @Override
    public String sanitizeTag(String tag) {
        return tag;
    }

    public Map<String, Object> postProcessSupportingFileData(Map<String, Object> objs) {
        objs.put(CodegenConstants.NON_COMPLIANT_USE_DISCR_IF_COMPOSITION_FAILS, nonCompliantUseDiscrIfCompositionFails);
        return objs;
    }

    @Override
    protected String getImport(String className, CodegenSchema schema) {
        if (className == null) {
            return "from " + packageName() + ".components.schema import " + schema.refInfo().getRefModule();
        }
        String[] classPieces = className.split("\\.");
        return "from " + packageName() + ".components.schema import " + classPieces[0];
    }

    @Override
    protected String getRefClassWithModule(String ref, String sourceJsonPath, String expectedComponentType) {
        String refModule = toRefModule(ref, sourceJsonPath, expectedComponentType);
        String refClass = toRefClass(ref, sourceJsonPath, expectedComponentType);
        if (refModule == null) {
            return refClass;
        }
        return refModule + "." + refClass;
    }

    @Override
    public String toParameterFilename(String name) {
        try {
            Integer.parseInt(name);
            // for parameters in path, or an endpoint
            return "parameter_" + name;
        } catch (NumberFormatException nfe) {
            // for header parameters in responses
            return "parameter_" + toModuleFilename(name);
        }
    }

    @Override
    public String toParameterDocFilename(String componentName) { return toParameterFilename(componentName); }

    @Override
    public String toParamName(String basename) {
        return toParameterFilename(basename);
    }

    @Override
    protected String toComponentModule(String componentName, String priorJsonPathSegment) {
        switch (priorJsonPathSegment) {
            case "schemas":
                return getKey(componentName).snakeCaseName;
            case "requestBodies":
                return toRequestBodyFilename(componentName);
            case "responses":
                return toResponseModuleName(componentName);
            case "headers":
                return toHeaderFilename(componentName);
            case "parameters":
                return toParameterFilename(componentName);
        }
        return null;
    }

    private String toSchemaRefClass(String ref, String sourceJsonPath) {
        String[] refPieces = ref.split("/");
        if (ref.equals(sourceJsonPath)) {
            // self reference, no import needed
            if (ref.startsWith("#/components/schemas/") && refPieces.length == 4) {
                return toModelName(refPieces[3]);
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
            return null;
        }
        // reference is external, import needed
        // module info is stored in refModule
        if (ref.startsWith("#/components/schemas/") && refPieces.length == 4) {
            String schemaName = refPieces[3];
            String refClass = toModelName(schemaName);
            return refClass;
        }
        return null;
    }

    private String toRequestBodyRefClass(String ref, String sourceJsonPath) {
        String[] refPieces = ref.split("/");
        if (ref.startsWith("#/components/requestBodies/") && refPieces.length == 4) {
            String refClass = toModelName(refPieces[3]);
            return refClass;
        }
        return null;
    }

    private String toResponseRefClass(String ref, String sourceJsonPath) {
        String[] refPieces = ref.split("/");
        if (ref.startsWith("#/components/responses/") && refPieces.length == 4) {
            String refClass = toModelName(refPieces[3]);
            return refClass;
        }
        return null;
    }

    private String toHeaderRefClass(String ref, String sourceJsonPath) {
        String[] refPieces = ref.split("/");
        if (ref.startsWith("#/components/headers/") && refPieces.length == 4) {
            String refClass = toModelName(refPieces[3]);
            return refClass;
        }
        return null;
    }

    private String toParameterRefClass(String ref, String sourceJsonPath) {
        String[] refPieces = ref.split("/");
        if (ref.startsWith("#/components/parameters/") && refPieces.length == 4) {
            String refClass = toModelName(refPieces[3]);
            return refClass;
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
                return toRequestBodyRefClass(ref, sourceJsonPath);
            case "responses":
                return toResponseRefClass(ref, sourceJsonPath);
            case "headers":
                return toHeaderRefClass(ref, sourceJsonPath);
            case "parameters":
                return toParameterRefClass(ref, sourceJsonPath);
        }
        return null;
    }

    @Override
    public void postProcess() {
        System.out.println("################################################################################");
        System.out.println("# Thanks for using OpenAPI JSON Schema Generator.                              #");
        System.out.println("# Please consider donation to help us maintain this project \uD83D\uDE4F                 #");
        System.out.println("# https://github.com/sponsors/spacether                                        #");
        System.out.println("#                                                                              #");
        System.out.println("# This generator was written by Justin Black (https://github.com/spacether)    #");
        System.out.println("# Please support his work directly via https://github.com/sponsors/spacether \uD83D\uDE4F#");
        System.out.println("################################################################################");
    }
}
