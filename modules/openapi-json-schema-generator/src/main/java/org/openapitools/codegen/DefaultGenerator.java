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

package org.openapitools.codegen;

import io.swagger.v3.core.util.Json;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.PathItem;
import io.swagger.v3.oas.models.Paths;
import io.swagger.v3.oas.models.headers.Header;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.parameters.Parameter;
import io.swagger.v3.oas.models.parameters.RequestBody;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.security.*;
import io.swagger.v3.oas.models.tags.Tag;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.comparator.PathFileComparator;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.openapitools.codegen.api.TemplateDefinition;
import org.openapitools.codegen.api.TemplatePathLocator;
import org.openapitools.codegen.api.TemplateProcessor;
import org.openapitools.codegen.config.GlobalSettings;
import org.openapitools.codegen.api.TemplatingEngineAdapter;
import org.openapitools.codegen.api.TemplateFileType;
import org.openapitools.codegen.ignore.CodegenIgnoreProcessor;
import org.openapitools.codegen.meta.GeneratorMetadata;
import org.openapitools.codegen.meta.Stability;
import org.openapitools.codegen.model.ApiInfoMap;
import org.openapitools.codegen.model.OperationMap;
import org.openapitools.codegen.model.OperationsMap;
import org.openapitools.codegen.serializer.SerializerUtils;
import org.openapitools.codegen.templating.CommonTemplateContentLocator;
import org.openapitools.codegen.templating.GeneratorTemplateContentLocator;
import org.openapitools.codegen.templating.MustacheEngineAdapter;
import org.openapitools.codegen.templating.TemplateManagerOptions;
import org.openapitools.codegen.utils.ImplementationVersion;
import org.openapitools.codegen.utils.ModelUtils;
import org.openapitools.codegen.utils.ProcessUtils;
import org.openapitools.codegen.utils.URLPathUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.apache.commons.lang3.StringUtils.removeStart;
import static org.openapitools.codegen.utils.OnceLogger.once;

@SuppressWarnings("rawtypes")
public class DefaultGenerator implements Generator {
    private static final String METADATA_DIR = ".openapi-generator";
    protected final Logger LOGGER = LoggerFactory.getLogger(DefaultGenerator.class);
    private final boolean dryRun;
    protected CodegenConfig config;
    protected ClientOptInput opts;
    protected OpenAPI openAPI;
    protected CodegenIgnoreProcessor ignoreProcessor;
    private Boolean generateApis = null;
    private Boolean generateModels = null;
    private Boolean generateSupportingFiles = null;
    private Boolean generateApiTests = null;
    private Boolean generateApiDocumentation = null;
    private Boolean generateModelTests = null;
    private Boolean generateModelDocumentation = null;
    private Boolean generateMetadata = true;
    private String basePath;
    private String basePathWithoutHost;
    private String contextPath;
    private Map<String, String> generatorPropertyDefaults = new HashMap<>();
    protected TemplateProcessor templateProcessor = null;

    private List<TemplateDefinition> userDefinedTemplates = new ArrayList<>();


    public DefaultGenerator() {
        this(false);
    }

    public DefaultGenerator(Boolean dryRun) {
        this.dryRun = Boolean.TRUE.equals(dryRun);
        LOGGER.info("Generating with dryRun={}", this.dryRun);
    }

    @SuppressWarnings("deprecation")
    @Override
    public Generator opts(ClientOptInput opts) {
        this.opts = opts;
        this.openAPI = opts.getOpenAPI();
        this.config = opts.getConfig();
        List<TemplateDefinition> userFiles = opts.getUserDefinedTemplates();
        if (userFiles != null) {
            this.userDefinedTemplates = Collections.unmodifiableList(userFiles);
        }

        TemplateManagerOptions templateManagerOptions = new TemplateManagerOptions(this.config.isEnableMinimalUpdate(), this.config.isSkipOverwrite());

        if (this.dryRun) {
            this.templateProcessor = new DryRunTemplateManager(templateManagerOptions);
        } else {
            TemplatingEngineAdapter templatingEngine = this.config.getTemplatingEngine();

            if (templatingEngine instanceof MustacheEngineAdapter) {
                MustacheEngineAdapter mustacheEngineAdapter = (MustacheEngineAdapter) templatingEngine;
                mustacheEngineAdapter.setCompiler(this.config.processCompiler(mustacheEngineAdapter.getCompiler()));
            }

            TemplatePathLocator commonTemplateLocator = new CommonTemplateContentLocator();
            TemplatePathLocator generatorTemplateLocator = new GeneratorTemplateContentLocator(this.config);
            this.templateProcessor = new TemplateManager(
                    templateManagerOptions,
                    templatingEngine,
                    new TemplatePathLocator[]{generatorTemplateLocator, commonTemplateLocator}
            );
        }

        String ignoreFileLocation = this.config.getIgnoreFilePathOverride();
        if (ignoreFileLocation != null) {
            final File ignoreFile = new File(ignoreFileLocation);
            if (ignoreFile.exists() && ignoreFile.canRead()) {
                this.ignoreProcessor = new CodegenIgnoreProcessor(ignoreFile);
            } else {
                LOGGER.warn("Ignore file specified at {} is not valid. This will fall back to an existing ignore file if present in the output directory.", ignoreFileLocation);
            }
        }

        if (this.ignoreProcessor == null) {
            this.ignoreProcessor = new CodegenIgnoreProcessor(this.config.getOutputDir());
        }

        return this;
    }

    /**
     * Retrieves an instance to the configured template processor, available after user-defined options are
     * applied via {@link DefaultGenerator#opts(ClientOptInput)}.
     *
     * @return A configured {@link TemplateProcessor}, or null.
     */
    public TemplateProcessor getTemplateProcessor() {
        return templateProcessor;
    }

    /**
     * Programmatically disable the output of .openapi-generator/VERSION, .openapi-generator-ignore,
     * or other metadata files used by OpenAPI JSON Schema Generator.
     *
     * @param generateMetadata true: enable outputs, false: disable outputs
     */
    @SuppressWarnings("WeakerAccess")
    public void setGenerateMetadata(Boolean generateMetadata) {
        this.generateMetadata = generateMetadata;
    }

    /**
     * Set generator properties otherwise pulled from system properties.
     * Useful for running tests in parallel without relying on System.properties.
     *
     * @param key   The system property key
     * @param value The system property value
     */
    @SuppressWarnings("WeakerAccess")
    public void setGeneratorPropertyDefault(final String key, final String value) {
        this.generatorPropertyDefaults.put(key, value);
    }

    private Boolean getGeneratorPropertyDefaultSwitch(final String key, final Boolean defaultValue) {
        String result = null;
        if (this.generatorPropertyDefaults.containsKey(key)) {
            result = this.generatorPropertyDefaults.get(key);
        }
        if (result != null) {
            return Boolean.valueOf(result);
        }
        return defaultValue;
    }

    void configureGeneratorProperties() {
        // allows generating only models by specifying a CSV of models to generate, or empty for all
        // NOTE: Boolean.TRUE is required below rather than `true` because of JVM boxing constraints and type inference.
        generateApis = GlobalSettings.getProperty(CodegenConstants.APIS) != null ? Boolean.TRUE : getGeneratorPropertyDefaultSwitch(CodegenConstants.APIS, null);
        generateModels = GlobalSettings.getProperty(CodegenConstants.MODELS) != null ? Boolean.TRUE : getGeneratorPropertyDefaultSwitch(CodegenConstants.MODELS, null);
        generateSupportingFiles = GlobalSettings.getProperty(CodegenConstants.SUPPORTING_FILES) != null ? Boolean.TRUE : getGeneratorPropertyDefaultSwitch(CodegenConstants.SUPPORTING_FILES, null);

        if (generateApis == null && generateModels == null && generateSupportingFiles == null) {
            // no specifics are set, generate everything
            generateApis = generateModels = generateSupportingFiles = true;
        } else {
            if (generateApis == null) {
                generateApis = false;
            }
            if (generateModels == null) {
                generateModels = false;
            }
            if (generateSupportingFiles == null) {
                generateSupportingFiles = false;
            }
        }
        // model/api tests and documentation options rely on parent generate options (api or model) and no other options.
        // They default to true in all scenarios and can only be marked false explicitly
        generateModelTests = GlobalSettings.getProperty(CodegenConstants.MODEL_TESTS) != null ? Boolean.valueOf(GlobalSettings.getProperty(CodegenConstants.MODEL_TESTS)) : getGeneratorPropertyDefaultSwitch(CodegenConstants.MODEL_TESTS, true);
        generateModelDocumentation = GlobalSettings.getProperty(CodegenConstants.MODEL_DOCS) != null ? Boolean.valueOf(GlobalSettings.getProperty(CodegenConstants.MODEL_DOCS)) : getGeneratorPropertyDefaultSwitch(CodegenConstants.MODEL_DOCS, true);
        generateApiTests = GlobalSettings.getProperty(CodegenConstants.API_TESTS) != null ? Boolean.valueOf(GlobalSettings.getProperty(CodegenConstants.API_TESTS)) : getGeneratorPropertyDefaultSwitch(CodegenConstants.API_TESTS, true);
        generateApiDocumentation = GlobalSettings.getProperty(CodegenConstants.API_DOCS) != null ? Boolean.valueOf(GlobalSettings.getProperty(CodegenConstants.API_DOCS)) : getGeneratorPropertyDefaultSwitch(CodegenConstants.API_DOCS, true);

        // Additional properties added for tests to exclude references in project related files
        config.additionalProperties().put(CodegenConstants.GENERATE_API_TESTS, generateApiTests);
        config.additionalProperties().put(CodegenConstants.GENERATE_MODEL_TESTS, generateModelTests);

        config.additionalProperties().put(CodegenConstants.GENERATE_API_DOCS, generateApiDocumentation);
        config.additionalProperties().put(CodegenConstants.GENERATE_MODEL_DOCS, generateModelDocumentation);

        config.additionalProperties().put(CodegenConstants.GENERATE_APIS, generateApis);
        config.additionalProperties().put(CodegenConstants.GENERATE_MODELS, generateModels);

        if (!generateApiTests && !generateModelTests) {
            config.additionalProperties().put(CodegenConstants.EXCLUDE_TESTS, true);
        }

        if (GlobalSettings.getProperty("debugOpenAPI") != null) {
            System.out.println(SerializerUtils.toJsonString(openAPI));
        } else if (GlobalSettings.getProperty("debugSwagger") != null) {
            // This exists for backward compatibility
            // We fall to this block only if debugOpenAPI is null. No need to dump this twice.
            LOGGER.info("Please use system property 'debugOpenAPI' instead of 'debugSwagger'.");
            System.out.println(SerializerUtils.toJsonString(openAPI));
        }

        config.processOpts();

        // resolve inline models
        if (config.getUseInlineModelResolver()) {
            InlineModelResolver inlineModelResolver = new InlineModelResolver();
            inlineModelResolver.setInlineSchemaNameMapping(config.inlineSchemaNameMapping());
            inlineModelResolver.setInlineSchemaNameDefaults(config.inlineSchemaNameDefault());
            inlineModelResolver.flatten(openAPI);
        }

        config.preprocessOpenAPI(openAPI);

        // set OpenAPI to make these available to all methods
        config.setOpenAPI(openAPI);

        config.additionalProperties().put("generatorVersion", ImplementationVersion.read());
        config.additionalProperties().put("generatedDate", ZonedDateTime.now().toString());
        config.additionalProperties().put("generatedYear", String.valueOf(ZonedDateTime.now().getYear()));
        config.additionalProperties().put("generatorClass", config.getClass().getName());
        config.additionalProperties().put("inputSpec", config.getInputSpec());

        if (openAPI.getExtensions() != null) {
            config.vendorExtensions().putAll(openAPI.getExtensions());
        }

        // TODO: Allow user to define _which_ servers object in the array to target.
        // Configures contextPath/basePath according to api document's servers
        URL url = URLPathUtils.getServerURL(openAPI, config.serverVariableOverrides());
        contextPath = removeTrailingSlash(config.escapeText(url.getPath())); // for backward compatibility
        basePathWithoutHost = contextPath;
        if (URLPathUtils.isRelativeUrl(openAPI.getServers())) {
            basePath = removeTrailingSlash(basePathWithoutHost);
        } else {
            basePath = removeTrailingSlash(config.escapeText(URLPathUtils.getHost(openAPI, config.serverVariableOverrides())));
        }
    }

    private void configureOpenAPIInfo() {
        Info info = this.openAPI.getInfo();
        if (info == null) {
            return;
        }
        if (info.getTitle() != null) {
            config.additionalProperties().put("appName", config.escapeText(info.getTitle()));
        }
        if (info.getVersion() != null) {
            config.additionalProperties().put("appVersion", config.escapeText(info.getVersion()));
        } else {
            LOGGER.error("Missing required field info version. Default appVersion set to 1.0.0");
            config.additionalProperties().put("appVersion", "1.0.0");
        }

        if (StringUtils.isEmpty(info.getDescription())) {
            // set a default description if none if provided
            config.additionalProperties().put("appDescription",
                    "No description provided (generated by Openapi JSON Schema Generator https://github.com/openapi-json-schema-tools/openapi-json-schema-generator)");
            config.additionalProperties().put("appDescriptionWithNewLines", config.additionalProperties().get("appDescription"));
            config.additionalProperties().put("unescapedAppDescription", "No description provided (generated by Openapi JSON Schema Generator https://github.com/openapi-json-schema-tools/openapi-json-schema-generator)");
        } else {
            config.additionalProperties().put("appDescription", config.escapeText(info.getDescription()));
            config.additionalProperties().put("appDescriptionWithNewLines", config.escapeTextWhileAllowingNewLines(info.getDescription()));
            config.additionalProperties().put("unescapedAppDescription", info.getDescription());
        }

        if (info.getContact() != null) {
            Contact contact = info.getContact();
            if (contact.getEmail() != null) {
                config.additionalProperties().put("infoEmail", config.escapeText(contact.getEmail()));
            }
            if (contact.getName() != null) {
                config.additionalProperties().put("infoName", config.escapeText(contact.getName()));
            }
            if (contact.getUrl() != null) {
                config.additionalProperties().put("infoUrl", config.escapeText(contact.getUrl()));
            }
        }

        if (info.getLicense() != null) {
            License license = info.getLicense();
            if (license.getName() != null) {
                config.additionalProperties().put("licenseInfo", config.escapeText(license.getName()));
            }
            if (license.getUrl() != null) {
                config.additionalProperties().put("licenseUrl", config.escapeText(license.getUrl()));
            }
        }

        if (info.getVersion() != null) {
            config.additionalProperties().put("version", config.escapeText(info.getVersion()));
        } else {
            LOGGER.error("Missing required field info version. Default version set to 1.0.0");
            config.additionalProperties().put("version", "1.0.0");
        }

        if (info.getTermsOfService() != null) {
            config.additionalProperties().put("termsOfService", config.escapeText(info.getTermsOfService()));
        }
    }

    private void generateModelTests(List<File> files, Map<String, Object> modelData, String modelName) throws IOException {
        // to generate model test files
        for (Map.Entry<String, String> configModelTestTemplateFilesEntry : config.modelTestTemplateFiles().entrySet()) {
            String templateName = configModelTestTemplateFilesEntry.getKey();
            String suffix = configModelTestTemplateFilesEntry.getValue();
            String filename = config.modelTestFileFolder() + File.separator + config.toModelTestFilename(modelName) + suffix;

            if (generateModelTests) {
                // do not overwrite test file that already exists (regardless of config's skipOverwrite setting)
                File modelTestFile = new File(filename);
                if (modelTestFile.exists()) {
                    this.templateProcessor.skip(modelTestFile.toPath(), "Test files never overwrite an existing file of the same name.");
                } else {
                    File written = processTemplateToFile(modelData, templateName, filename, generateModelTests, CodegenConstants.MODEL_TESTS, config.modelTestFileFolder());
                    if (written != null) {
                        files.add(written);
                        if (config.isEnablePostProcessFile() && !dryRun) {
                            config.postProcessFile(written, "model-test");
                        }
                    }
                }
            } else if (dryRun) {
                Path skippedPath = java.nio.file.Paths.get(filename);
                this.templateProcessor.skip(skippedPath, "Skipped by modelTests option supplied by user.");
            }
        }
    }

    private void generateModelDocumentation(List<File> files, Map<String, Object> modelData, String modelName) throws IOException {
        for (String templateName : config.modelDocTemplateFiles().keySet()) {
            String docExtension = config.getDocExtension();
            String suffix = docExtension != null ? docExtension : config.modelDocTemplateFiles().get(templateName);
            String filename = config.modelDocFileFolder() + File.separator + config.toModelDocFilename(modelName) + suffix;

            File written = processTemplateToFile(modelData, templateName, filename, generateModelDocumentation, CodegenConstants.MODEL_DOCS);
            if (written != null) {
                files.add(written);
                if (config.isEnablePostProcessFile() && !dryRun) {
                    config.postProcessFile(written, "model-doc");
                }
            }
        }
    }

    private void generateSchema(List<File> files, CodegenSchema schema, String jsonPath) {
        Map<String, Object> schemaData = new HashMap<>();
        schemaData.put("packageName", config.packageName());
        schemaData.put("schema", schema);
        schemaData.putAll(config.additionalProperties());
        Map<String, String> templateInfo = config.jsonPathTemplateFiles().get(CodegenConstants.JSON_PATH_LOCATION_TYPE.SCHEMA);
        if (templateInfo == null || templateInfo.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry: templateInfo.entrySet()) {
            String templateFile = entry.getKey();
            String suffix = entry.getValue();
            String filename = config.getFilepath(jsonPath) + suffix;
            try {
                File written = processTemplateToFile(schemaData, templateFile, filename, generateModels, CodegenConstants.MODELS);
                if (written != null) {
                    files.add(written);
                    if (config.isEnablePostProcessFile() && !dryRun) {
                        config.postProcessFile(written, "model");
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException("Could not generate schema for jsonPath '" + jsonPath + "'", e);
            }
        }
    }

    @Override
    public String requestBodyFileFolder() {
        return "";
    }

    private String packageFilename(List<String> pathSegments) {
        String prefix = config.getOutputDir() + File.separatorChar + config.packagePath() + File.separatorChar;
        String suffix = pathSegments.stream().collect(Collectors.joining(File.separator));
        return prefix + suffix;
    }

    private String filenameFromRoot(List<String> pathSegments) {
        String prefix = config.getOutputDir() + File.separatorChar;
        String suffix = pathSegments.stream().collect(Collectors.joining(File.separator));
        return prefix + suffix;
    }

    private void generateFiles(List<List<Object>> processTemplateToFileInfos, boolean shouldGenerate, String skippedByOption, List<File> files) {
        for (List<Object> processTemplateToFileInfo: processTemplateToFileInfos) {
            Map<String, Object> templateData = (Map<String, Object>) processTemplateToFileInfo.get(0);
            String templateName = (String) processTemplateToFileInfo.get(1);
            String outputFilename = (String) processTemplateToFileInfo.get(2);
            try {
                File written = processTemplateToFile(templateData, templateName, outputFilename, shouldGenerate, skippedByOption);
                if (written != null) {
                    files.add(written);
                    if (config.isEnablePostProcessFile() && !dryRun) {
                        config.postProcessFile(written, skippedByOption);
                    }
                }
            } catch (IOException e) {
                LOGGER.error("Error when writing template file {}", e.toString());
            }
        }
    }

    void generatePaths(List<File> files, Map<String, List<CodegenOperation>> operationsMap) {
        Paths paths = this.openAPI.getPaths();
        if (paths == null || paths.isEmpty()) {
            LOGGER.warn("Skipping generation of paths because the specification document lacks them.");
            return;
        }
        List<List<Object>> apisFiles = new ArrayList<>();
        List<List<Object>> testFiles = new ArrayList<>();
        List<List<Object>> apiDocFiles = new ArrayList<>();
        String outputFilename;

        // endpoint tags may not exist in the root of the spec file
        // this is allowed per openapi
        // because spec tags may be empty or incomplete, tags are also accumulated from endpoints
        List<Tag> tags = openAPI.getTags();
        Map<String, String> tagModuleNameToApiClassname = new LinkedHashMap<>();
        // for apis.tags tag api definition
        Map<String, String> tagToApiClassname = new LinkedHashMap<>();
        Map<String, String> tagToTagModule = new LinkedHashMap<>();

        if (tags != null) {
            for (Tag tag: tags) {
                String tagName = tag.getName();
                String tagModuleName = config.toApiFilename(tagName);
                String apiClassname = config.toApiName(tagName);
                tagModuleNameToApiClassname.put(tagModuleName, apiClassname);
                tagToApiClassname.put(tagName, apiClassname);
                tagToTagModule.put(tagName, tagModuleName);
            }
        }

        HashMap<String, String> pathToPathModule = new HashMap<>();
        String packageName = config.packageName();
        Map<String, Object> initOperationMap = new HashMap<>();
        initOperationMap.put("packageName", packageName);
        boolean shouldGenerateApis = (boolean) config.additionalProperties().get(CodegenConstants.GENERATE_APIS);
        // paths.some_path.post.__init__.py (single endpoint definition)
        // responses are adjacent to the init file
        for (List<CodegenOperation> coList: operationsMap.values()) {
            for (CodegenOperation co: coList) {
                if (co.tags != null) {
                    for (Map.Entry<String, CodegenTag> entry: co.tags.entrySet()) {
                        String tagName = entry.getKey();
                        String tagModuleName = entry.getValue().getModuleName();
                        String apiClassname = entry.getValue().getClassName();
                        tagModuleNameToApiClassname.put(tagModuleName, apiClassname);
                        tagToApiClassname.put(tagName, apiClassname);
                        tagToTagModule.put(tagName, tagModuleName);
                    }
                }
                String path = co.path;
                String operationJsonPath = "#/paths/" + ModelUtils.encodeSlashes(path) + "/" + co.httpMethod;
                String pathModuleName = co.nickname;
                if (!pathToPathModule.containsKey(path)) {
                    pathToPathModule.put(path, pathModuleName);
                }
                Map<String, Object> endpointMap = new HashMap<>();
                endpointMap.put("operation", co);
                generateXs(files, operationJsonPath, CodegenConstants.JSON_PATH_LOCATION_TYPE.OPERATION, CodegenConstants.APIS, endpointMap);

                if (shouldGenerateApis) {
                    // paths.some_path.post.request_body.py, only written if there is no refModule
                    if (co.requestBody != null) {
                        String requestBodyJsonPath = operationJsonPath + "/requestBody";
                        generateRequestBody(files, co.requestBody, requestBodyJsonPath);
                    }

                    // paths.some_path.post.parameters.parameter_0.py
                    if (co.allParams != null && !co.allParams.isEmpty()) {
                        String parametersJsonPath = operationJsonPath + "/parameters";
                        generateXs(files, parametersJsonPath, CodegenConstants.JSON_PATH_LOCATION_TYPE.PARAMETERS, CodegenConstants.PARAMETERS, null);
                        Integer i = 0;
                        for (CodegenParameter cp: co.allParams) {
                            String parameterJsonPath = parametersJsonPath + "/" + i.toString();
                            generateParameter(files, cp, parameterJsonPath);
                            i++;
                        }
                    }

                    if (co.responses != null && !co.responses.isEmpty()) {
                        String responsesJsonPath = operationJsonPath + "/responses";
                        generateXs(files, responsesJsonPath, CodegenConstants.JSON_PATH_LOCATION_TYPE.RESPONSES, CodegenConstants.RESPONSES, null);
                        for (Map.Entry<String, CodegenResponse> responseEntry: co.responses.entrySet()) {
                            // paths.some_path.post.responses.response_200.__init__.py (file per response)
                            // response is a package because responses have Headers which can be refed
                            // so each inline header should be a module in the response package
                            String code = responseEntry.getKey();
                            CodegenResponse response = responseEntry.getValue();
                            String responseJsonPath = responsesJsonPath + "/" + code;
                            generateResponse(files, response, responseJsonPath);
                        }
                    }
                    for (String templateFile: config.pathEndpointTestTemplateFiles()) {
                        Map<String, Object> endpointTestMap = new HashMap<>();
                        endpointTestMap.put("operation", co);
                        endpointTestMap.put("packageName", packageName);
                        outputFilename = filenameFromRoot(Arrays.asList("test", "test_paths", "test_" + pathModuleName, "test_" + co.httpMethod + ".py"));
                        testFiles.add(Arrays.asList(endpointTestMap, templateFile, outputFilename));
                        outputFilename = filenameFromRoot(Arrays.asList("test", "test_paths", "test_" + pathModuleName, "__init__.py"));
                        testFiles.add(Arrays.asList(new HashMap<>(), "__init__.hbs", outputFilename));

                    }
                }
                for (String templateFile: config.pathEndpointDocTemplateFiles()) {
                    for (Map.Entry<String, CodegenTag> entry: co.tags.entrySet()) {
                        CodegenTag tag = entry.getValue();
                        Map<String, Object> endpointInfo = new HashMap<>();
                        List<CodegenOperation> operation = Arrays.asList(co);
                        endpointInfo.put("operation", operation);
                        endpointInfo.put("packageName", packageName);
                        endpointInfo.put("apiPackage", config.apiPackage());
                        endpointInfo.put("basePath", basePath);
                        endpointInfo.put("tag", tag);
                        outputFilename = filenameFromRoot(Arrays.asList("docs", config.apiPackage(), "tags", tag.getModuleName(), co.operationId + ".md"));
                        apiDocFiles.add(Arrays.asList(endpointInfo, templateFile, outputFilename));
                    }
                }
            }
        }
        Map<String, String> pathModuleToApiClassname = new LinkedHashMap<>();
        Map<String, String> pathToApiClassname = new LinkedHashMap<>();
        for (Map.Entry<String, PathItem> pathsEntry : paths.entrySet()) {
            String path = pathsEntry.getKey();
            String apiClassName = config.toModelName(path);
            pathToApiClassname.put(path, apiClassName);
            pathModuleToApiClassname.put(config.toPathFilename(path), apiClassName);
        }
        String pathsJsonPath = "#/paths";
        generateXs(files, pathsJsonPath, CodegenConstants.JSON_PATH_LOCATION_TYPE.PATHS, CodegenConstants.APIS, null);

        // paths.some_path.__init__.py
        for (Map.Entry<String, String> entry: pathToPathModule.entrySet()) {
            String path = entry.getKey();
            String pathModule = entry.getValue();
            String apiClassName = pathToApiClassname.get(path);
            Map<String, Object> pathApiMap = new HashMap<>();
            pathApiMap.put("pathModule", pathModule);
            pathApiMap.put("apiClassName", apiClassName);
            pathApiMap.put("path", path);
            String pathJsonPath = pathsJsonPath + "/" + ModelUtils.encodeSlashes(path);
            generateXs(files, pathJsonPath, CodegenConstants.JSON_PATH_LOCATION_TYPE.PATH, CodegenConstants.APIS, pathApiMap);
        }

        if (!config.pathEndpointTestTemplateFiles().isEmpty()) {
            outputFilename = filenameFromRoot(Arrays.asList("test", "test_paths", "__init__.py"));
            testFiles.add(Arrays.asList(new HashMap<>(), "__init__test_paths.hbs", outputFilename));
        }

        // Note: __init__apis.handlebars is generated as a supporting file
        // apis.tag_to_api.py
        // apis.path_to_api.py
        String apiPackage = config.apiPackage();
        for (Map.Entry<String, String> entry: config.apiXToApiTemplateFiles().entrySet()) {
            String templateFile = entry.getKey();
            String renderedOutputFilename = entry.getValue();
            Map<String, Object> xToApiMap = new HashMap<>();
            xToApiMap.put("packageName", packageName);
            xToApiMap.put("apiClassname", "Api");
            xToApiMap.put("tagModuleNameToApiClassname", tagModuleNameToApiClassname);
            xToApiMap.put("tagToApiClassname", tagToApiClassname);
            xToApiMap.put("pathModuleToApiClassname", pathModuleToApiClassname);
            xToApiMap.put("pathToApiClassname", pathToApiClassname);
            outputFilename = packageFilename(Arrays.asList(apiPackage, renderedOutputFilename));
            apisFiles.add(Arrays.asList(xToApiMap, templateFile, outputFilename));
        }

        if (!config.apiXToApiTemplateFiles().isEmpty()) {
            // apis.tags.__init__.py
            Map<String, Object> initApiTagsMap = new HashMap<>();
            initApiTagsMap.put("packageName", packageName);
            outputFilename = packageFilename(Arrays.asList(apiPackage, "tags", "__init__.py"));
            apisFiles.add(Arrays.asList(initApiTagsMap, "apis/__init__apis_tags.handlebars", outputFilename));

            // apis.paths.__init__.py
            outputFilename = packageFilename(Arrays.asList(apiPackage, "paths", "__init__.py"));
            apisFiles.add(Arrays.asList(initOperationMap, "paths/__init__paths.handlebars", outputFilename));
            // apis.paths.some_path.py
            for (Map.Entry<String, String> entry: pathToPathModule.entrySet()) {
                String path = entry.getKey();
                String pathModule = entry.getValue();
                String apiClassName = pathToApiClassname.get(path);
                PathItem pi = openAPI.getPaths().get(path);
                Map<String, Object> operationMap = new HashMap<>();
                operationMap.put("packageName", packageName);
                operationMap.put("pathModule", pathModule);
                operationMap.put("apiClassName", apiClassName);
                operationMap.put("pathItem", pi);
                outputFilename = packageFilename(Arrays.asList("apis", "paths", pathModule + ".py"));
                apisFiles.add(Arrays.asList(operationMap, "apis/apis_path_module.handlebars", outputFilename));
            }
        }

        boolean shouldGenerateApiTests = (boolean) config.additionalProperties().get(CodegenConstants.GENERATE_API_TESTS);
        boolean shouldGenerateApiDocs = (boolean) config.additionalProperties().get(CodegenConstants.GENERATE_API_DOCS);
        generateFiles(apisFiles, shouldGenerateApis, CodegenConstants.APIS, files);
        generateFiles(testFiles, shouldGenerateApiTests, CodegenConstants.API_TESTS, files);
        generateFiles(apiDocFiles, shouldGenerateApiDocs, CodegenConstants.API_DOCS, files);
    }

    private void generateContent(List<File> files, LinkedHashMap<CodegenKey, CodegenMediaType> content, String jsonPath) {
        String contentJsonPath = jsonPath + "/content";
        boolean schemaExists = false;

        // content-type + schema generation
        for (Map.Entry<CodegenKey, CodegenMediaType> contentInfo: content.entrySet()) {
            String contentType = contentInfo.getKey().getName();
            CodegenMediaType codegenMediaType = contentInfo.getValue();
            CodegenSchema schema = codegenMediaType.getSchema();
            if (schema != null) {
                schemaExists = true;
                String contentTypeJsonPath = contentJsonPath + "/" + ModelUtils.encodeSlashes(contentType);

                // schema
                String schemaJsonPath = contentTypeJsonPath + "/schema";
                generateSchema(files, schema, schemaJsonPath);

                Map<String, String> contentTypeTemplateInfo = config.jsonPathTemplateFiles().get(CodegenConstants.JSON_PATH_LOCATION_TYPE.CONTENT_TYPE);
                if (contentTypeTemplateInfo == null || contentTypeTemplateInfo.isEmpty()) {
                    continue;
                }
                // content-type
                for (Map.Entry<String, String> contentTypeEntry: contentTypeTemplateInfo.entrySet()) {
                    String templateFile = contentTypeEntry.getKey();
                    String outputFile = contentTypeEntry.getValue();
                    String outputFilepath = config.getFilepath(contentTypeJsonPath) + File.separatorChar + outputFile;
                    try {
                        File written = processTemplateToFile(new HashMap<>(), templateFile, outputFilepath, true, CodegenConstants.CONTENT);
                        if (written != null) {
                            files.add(written);
                            if (config.isEnablePostProcessFile() && !dryRun) {
                                config.postProcessFile(written, "content");
                            }
                        }
                    } catch (IOException e) {
                        throw new RuntimeException("Could not generate schema for jsonPath '" + jsonPath + "'", e);
                    }
                }
            }
        }

        Map<String, String> contentTemplateInfo = config.jsonPathTemplateFiles().get(CodegenConstants.JSON_PATH_LOCATION_TYPE.CONTENT);
        if (schemaExists && contentTemplateInfo != null && !contentTemplateInfo.isEmpty()) {
            for (Map.Entry<String, String> contentEntry: contentTemplateInfo.entrySet()) {
                String contentTemplateFile = contentEntry.getKey();
                String outputFile = contentEntry.getValue();
                String outputFilepath = config.getFilepath(contentJsonPath) + File.separatorChar + outputFile;
                try {
                    File written = processTemplateToFile(new HashMap<>(), contentTemplateFile, outputFilepath, true, CodegenConstants.CONTENT);
                    if (written != null) {
                        files.add(written);
                        if (config.isEnablePostProcessFile() && !dryRun) {
                            config.postProcessFile(written, "content");
                        }
                    }
                } catch (IOException e) {
                    throw new RuntimeException("Could not generate schema for jsonPath '" + jsonPath + "'", e);
                }
            }
        }
    }

    private void generateResponse(List<File> files, CodegenResponse response, String jsonPath) {
        Boolean generateResponses = Boolean.TRUE;
        Map<String, Object> templateData = new HashMap<>();
        templateData.put("packageName", config.packageName());
        templateData.put("response", response);
        Map<String, String> templateInfo = config.jsonPathTemplateFiles().get(CodegenConstants.JSON_PATH_LOCATION_TYPE.RESPONSE);
        if (templateInfo != null && !templateInfo.isEmpty()) {
            for (Map.Entry<String, String> entry: templateInfo.entrySet()) {
                String templateFile = entry.getKey();
                String outputFile = entry.getValue();
                String responseFile = config.getFilepath(jsonPath) + File.separatorChar + outputFile;

                try {
                    File written = processTemplateToFile(templateData, templateFile, responseFile, generateResponses, CodegenConstants.RESPONSES);
                    if (written != null) {
                        files.add(written);
                        if (config.isEnablePostProcessFile() && !dryRun) {
                            config.postProcessFile(written, "response");
                        }
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Could not generate file '" + responseFile + "'", e);
                }
            }
        }
        // headers
        if (response.getHeaders() != null && !response.getHeaders().isEmpty()) {
            String headersJsonPath = jsonPath + "/headers";
            generateXs(files, headersJsonPath, CodegenConstants.JSON_PATH_LOCATION_TYPE.HEADERS, CodegenConstants.HEADERS, null);
            for (Map.Entry<String, CodegenHeader> headerInfo: response.getHeaders().entrySet()) {
                String headerName = headerInfo.getKey();
                CodegenHeader header = headerInfo.getValue();
                String headerJsonPath = headersJsonPath + "/" + headerName;
                generateHeader(files, header, headerJsonPath);
            }
        }
        LinkedHashMap<CodegenKey, CodegenMediaType> content = response.getContent();
        if (content != null && !content.isEmpty()) {
            generateContent(files, content, jsonPath);
        }
    }

    private TreeMap<String, CodegenResponse> generateResponses(List<File> files) {
        final Map<String, ApiResponse> specResponses = this.openAPI.getComponents().getResponses();
        if (specResponses == null) {
            LOGGER.warn("Skipping generation of component responses because the specification document lacks them.");
            return null;
        }
        TreeMap<String, CodegenResponse> responses = new TreeMap<>();
        String responsesJsonPath = "#/components/responses";
        generateXs(files, responsesJsonPath, CodegenConstants.JSON_PATH_LOCATION_TYPE.RESPONSES, CodegenConstants.RESPONSES, null);
        for (Map.Entry<String, ApiResponse> responseEntry: specResponses.entrySet()) {
            String componentName = responseEntry.getKey();
            ApiResponse apiResponse = responseEntry.getValue();
            String sourceJsonPath = responsesJsonPath + "/" + componentName;
            CodegenResponse response = config.fromResponse(apiResponse, sourceJsonPath);
            responses.put(componentName, response);
            generateResponse(files, response, sourceJsonPath);

            // TODO make this a property that can be turned off and on
            Boolean generateResponseDocumentation = Boolean.TRUE;
            for (String templateName : config.responseDocTemplateFiles().keySet()) {
                String docExtension = config.getDocExtension();
                String suffix = docExtension != null ? docExtension : config.responseDocTemplateFiles().get(templateName);
                String docFilename = config.toResponseDocFilename(componentName);
                String filename = config.responseDocFileFolder() + File.separator + docFilename + suffix;

                Map<String, Object> templateData = new HashMap<>();
                templateData.put("packageName", config.packageName());
                templateData.put("complexTypePrefix", "../../components/schema/");
                templateData.put("response", response);
                try {
                    File written = processTemplateToFile(templateData, templateName, filename, generateResponseDocumentation, CodegenConstants.REQUEST_BODY_DOCS);
                    if (written != null) {
                        files.add(written);
                        if (config.isEnablePostProcessFile() && !dryRun) {
                            config.postProcessFile(written, "response-doc");
                        }
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Could not generate file '" + filename + "'", e);
                }
            }
        }
        return responses;
    }

    private void generateRequestBody(List<File> files, CodegenRequestBody requestBody, String jsonPath) {
        Map<String, Object> templateData = new HashMap<>();
        templateData.put("packageName", config.packageName());
        templateData.put("requestBody", requestBody);
        templateData.put("docRoot", "../../");
        Boolean generateRequestBodies = Boolean.TRUE;
        Map<String, String> templateInfo =  config.jsonPathTemplateFiles().get(CodegenConstants.JSON_PATH_LOCATION_TYPE.REQUEST_BODY);
        if (templateInfo != null && !templateInfo.isEmpty()) {
            for (Map.Entry<String, String> entry : templateInfo.entrySet()) {
                String templateFile = entry.getKey();
                String outputFilename = entry.getValue();
                String filename = config.getFilepath(jsonPath) + File.separatorChar + outputFilename;

                try {
                    File written = processTemplateToFile(templateData, templateFile, filename, generateRequestBodies, CodegenConstants.REQUEST_BODIES);
                    if (written != null) {
                        files.add(written);
                        if (config.isEnablePostProcessFile() && !dryRun) {
                            config.postProcessFile(written, "requestBody");
                        }
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Could not generate file '" + filename + "'", e);
                }
            }
        }
        // schemas
        LinkedHashMap<CodegenKey, CodegenMediaType> content = requestBody.getContent();
        if (content != null && !content.isEmpty()) {
            generateContent(files, content, jsonPath);
        }
        if (requestBody.getComponentModule() == null) {
            return;
        }
        // doc generation
        Boolean generateRequestBodyDocumentaion = Boolean.TRUE;
        String componentName = jsonPath.substring(jsonPath.lastIndexOf("/") + 1);
        for (Map.Entry<String, String> entry: config.requestBodyDocTemplateFiles().entrySet()) {
            String templateName = entry.getKey();
            String suffix = entry.getValue();
            String docFilename = config.toRequestBodyDocFilename(componentName);
            String filename = config.requestBodyDocFileFolder() + File.separator + docFilename + suffix;

            templateData.put("complexTypePrefix", "../../components/schema/");
            try {
                File written = processTemplateToFile(templateData, templateName, filename, generateRequestBodyDocumentaion, CodegenConstants.REQUEST_BODY_DOCS);
                if (written != null) {
                    files.add(written);
                    if (config.isEnablePostProcessFile() && !dryRun) {
                        config.postProcessFile(written, "request-body-doc");
                    }
                }
            } catch (Exception e) {
                throw new RuntimeException("Could not generate file '" + filename + "'", e);
            }
        }
    }

    private TreeMap<String, CodegenRequestBody> generateRequestBodies(List<File> files) {
        final Map<String, RequestBody> specRequestBodies = this.openAPI.getComponents().getRequestBodies();
        if (specRequestBodies == null) {
            LOGGER.warn("Skipping generation of component requestBodies because the specification document lacks them.");
            return null;
        }
        TreeMap<String, CodegenRequestBody> requestBodies = new TreeMap<>();
        String requestBodiesJsonPath = "#/components/requestBodies";
        generateXs(files, requestBodiesJsonPath, CodegenConstants.JSON_PATH_LOCATION_TYPE.REQUEST_BODIES, CodegenConstants.REQUEST_BODIES, null);
        for (Map.Entry<String, RequestBody> entry: specRequestBodies.entrySet()) {
            String componentName = entry.getKey();
            RequestBody specRequestBody = entry.getValue();
            String sourceJsonPath = requestBodiesJsonPath + "/" + componentName;
            CodegenRequestBody requestBody = config.fromRequestBody(specRequestBody, sourceJsonPath);
            requestBodies.put(componentName, requestBody);

            generateRequestBody(files, requestBody, sourceJsonPath);
        }
        // sort them
        requestBodies = new TreeMap<>(requestBodies);
        return requestBodies;
    }

    private void generateParameter(List<File> files, CodegenParameter parameter, String jsonPath) {
        Boolean generateParameters = Boolean.TRUE;

        Map<String, String> templateInfo = config.jsonPathTemplateFiles().get(CodegenConstants.JSON_PATH_LOCATION_TYPE.PARAMETER);
        if (templateInfo != null && !templateInfo.isEmpty()) {
            for (Map.Entry<String, String> entry: templateInfo.entrySet()) {
                String templateFile = entry.getKey();
                String outputFilename = entry.getValue();
                String filename = config.getFilepath(jsonPath) + File.separatorChar + outputFilename;
                Map<String, Object> templateData = new HashMap<>();
                templateData.put("packageName", config.packageName());
                templateData.put("parameter", parameter);

                try {
                    File written = processTemplateToFile(templateData, templateFile, filename, generateParameters, CodegenConstants.PARAMETERS);
                    if (written != null) {
                        files.add(written);
                        if (config.isEnablePostProcessFile() && !dryRun) {
                            config.postProcessFile(written, "parameter");
                        }
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Could not generate file '" + filename + "'", e);
                }
            }
        }
        // schema
        CodegenSchema schema = parameter.getSchema();
        if (schema != null) {
            String schemaJsonPath = parameter.getSetSchemaJsonPath(jsonPath);
            generateSchema(files, schema, schemaJsonPath);
        }
        LinkedHashMap<CodegenKey, CodegenMediaType> content = parameter.getContent();
        if (schema == null && content != null && !content.isEmpty()) {
            generateContent(files, content, jsonPath);
        }
    }

    private TreeMap<String, CodegenParameter> generateParameters(List<File> files) {
        final Map<String, Parameter> specParameters = this.openAPI.getComponents().getParameters();
        if (specParameters == null || specParameters.isEmpty()) {
            LOGGER.warn("Skipping generation of component parameters because the specification document lacks them.");
            return null;
        }
        TreeMap<String, CodegenParameter> parameters = new TreeMap<>();
        String parametersJsonPath = "#/components/parameters";
        generateXs(files, parametersJsonPath, CodegenConstants.JSON_PATH_LOCATION_TYPE.PARAMETERS, CodegenConstants.PARAMETERS, null);
        for (Map.Entry<String, Parameter> entry: specParameters.entrySet()) {
            String componentName = entry.getKey();
            Parameter specParameter = entry.getValue();
            String sourceJsonPath = parametersJsonPath + "/" + componentName;
            CodegenParameter parameter = config.fromParameter(specParameter, sourceJsonPath);
            parameters.put(componentName, parameter);
            generateParameter(files, parameter, sourceJsonPath);

            Boolean generateParameterDocs = Boolean.TRUE;
            for (Map.Entry<String, String> entryInfo : config.parameterDocTemplateFiles().entrySet()) {
                String templateName = entryInfo.getKey();
                String suffix = entryInfo.getValue();
                String fileFolder = config.parameterDocFileFolder();
                String filename = fileFolder + File.separatorChar + config.toParameterDocFilename(componentName) + suffix;
                Map<String, Object> templateData = new HashMap<>();
                templateData.put("packageName", config.packageName());
                templateData.put("parameter", parameter);
                templateData.put("complexTypePrefix", "../../components/schema/");

                try {
                    File written = processTemplateToFile(templateData, templateName, filename, generateParameterDocs, CodegenConstants.PARAMETER_DOCS, fileFolder);
                    if (written != null) {
                        files.add(written);
                        if (config.isEnablePostProcessFile() && !dryRun) {
                            config.postProcessFile(written, "parameter-doc");
                        }
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Could not generate file '" + filename + "'", e);
                }
            }
        }
        return parameters;
    }

    private void generateHeader(List<File> files, CodegenHeader header, String jsonPath) {
        Map<String, Object> headertTemplateData = new HashMap<>();
        headertTemplateData.put("packageName", config.packageName());
        headertTemplateData.put("header", header);

        // header
        Boolean generateHeaders = Boolean.TRUE;
        Map<String, String> templateInfo = config.jsonPathTemplateFiles().get(CodegenConstants.JSON_PATH_LOCATION_TYPE.HEADER);
        if (templateInfo != null && !templateInfo.isEmpty()) {
            for (Map.Entry<String, String> entry: templateInfo.entrySet()) {
                String templateFile = entry.getKey();
                String outputFilename = entry.getValue();
                String filename = config.getFilepath(jsonPath) + File.separatorChar + outputFilename;
                try {
                    File written = processTemplateToFile(headertTemplateData, templateFile, filename, generateHeaders, CodegenConstants.HEADERS);
                    if (written != null) {
                        files.add(written);
                        if (config.isEnablePostProcessFile() && !dryRun) {
                            config.postProcessFile(written, "header");
                        }
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Could not generate file '" + filename + "'", e);
                }
            }
        }
        // schema
        CodegenSchema schema = header.getSchema();
        if (schema != null) {
            String schemaJsonPath = header.getSetSchemaJsonPath(jsonPath);
            generateSchema(files, schema, schemaJsonPath);
        }
        LinkedHashMap<CodegenKey, CodegenMediaType> content = header.getContent();
        if (schema == null && content != null && !content.isEmpty()) {
            generateContent(files, content, jsonPath);
        }
    }

    private void generateXs(List<File> files, String jsonPath, CodegenConstants.JSON_PATH_LOCATION_TYPE type, String skippedByOption, Map<String, Object> templateInfo) {
        Map<String, String> templateFileToOutputFile = config.jsonPathTemplateFiles().get(type);
        if (templateFileToOutputFile == null || templateFileToOutputFile.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : templateFileToOutputFile.entrySet()) {
            String templateFile = entry.getKey();
            String outputFile = entry.getValue();
            String filename = config.getFilepath(jsonPath) + File.separatorChar + outputFile;

            HashMap<String, Object> templateData = new HashMap<>();
            templateData.put("packageName", config.packageName());
            templateData.put("modelPackage", config.modelPackage());
            if (templateInfo != null && !templateInfo.isEmpty()) {
                templateData.putAll(templateInfo);
            }
            try {
                File written = processTemplateToFile(templateData, templateFile, filename, true, skippedByOption);
                if (written != null) {
                    files.add(written);
                    if (config.isEnablePostProcessFile() && !dryRun) {
                        config.postProcessFile(written, skippedByOption);
                    }
                }
            } catch (Exception e) {
                throw new RuntimeException("Could not generate file '" + filename + "'", e);
            }
        }
    }

    private TreeMap<String, CodegenHeader> generateHeaders(List<File> files) {
        final Map<String, Header> specHeaders = this.openAPI.getComponents().getHeaders();
        if (specHeaders == null || specHeaders.isEmpty()) {
            LOGGER.warn("Skipping generation of component headers because the specification document lacks them.");
            return null;
        }
        TreeMap<String, CodegenHeader> headers = new TreeMap<>();
        String headersJsonPath = "#/components/headers";
        generateXs(files, headersJsonPath, CodegenConstants.JSON_PATH_LOCATION_TYPE.HEADERS, CodegenConstants.HEADERS, null);
        for (Map.Entry<String, Header> entry: specHeaders.entrySet()) {
            String componentName = entry.getKey();
            Header specHeader = entry.getValue();
            String sourceJsonPath = headersJsonPath + "/" + componentName;
            CodegenHeader header = config.fromHeader(specHeader, sourceJsonPath);
            headers.put(componentName, header);

            generateHeader(files, header, sourceJsonPath);

            Boolean generateHeaderDocs = Boolean.TRUE;
            for (Map.Entry<String, String> headerDocInfo : config.headerDocTemplateFiles().entrySet()) {
                String templateName = headerDocInfo.getKey();
                String suffix = headerDocInfo.getValue();
                String fileFolder = config.headerDocFileFolder();
                String filename = fileFolder + File.separatorChar + config.toHeaderDocFilename(componentName) + suffix;
                Map<String, Object> templateData = new HashMap<>();
                templateData.put("packageName", config.packageName());
                templateData.put("header", header);
                templateData.put("complexTypePrefix", "../../components/schema/");
                templateData.put("docRoot", "../../");

                try {
                    File written = processTemplateToFile(templateData, templateName, filename, generateHeaderDocs, CodegenConstants.HEADER_DOCS, fileFolder);
                    if (written != null) {
                        files.add(written);
                        if (config.isEnablePostProcessFile() && !dryRun) {
                            config.postProcessFile(written, "header-doc");
                        }
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Could not generate file '" + filename + "'", e);
                }
            }
        }
        // sort them
        headers = new TreeMap<>(headers);
        return headers;
    }

    protected TreeMap<String, CodegenSchema> generateSchemas(List<File> files) {
        if (!generateModels) {
            LOGGER.info("Skipping generation of component schemas.");
            return null;
        }

        final Map<String, Schema> specSchemas = ModelUtils.getSchemas(this.openAPI);
        if (specSchemas == null || specSchemas.isEmpty()) {
            LOGGER.warn("Skipping generation of component schemas because the specification document lacks them.");
            return null;
        }

        TreeMap<String, CodegenSchema> schemas = new TreeMap<>();
        String modelNames = GlobalSettings.getProperty("models");
        Set<String> modelsToGenerate = null;
        if (modelNames != null && !modelNames.isEmpty()) {
            modelsToGenerate = new HashSet<>(Arrays.asList(modelNames.split(",")));
        }

        // limit to only the specified models
        Set<String> componentNames = specSchemas.keySet();
        if (modelsToGenerate != null && !modelsToGenerate.isEmpty()) {
            Set<String> updatedKeys = new HashSet<>();
            for (String componentName: componentNames) {
                if (modelsToGenerate.contains(componentName)) {
                    updatedKeys.add(componentName);
                }
            }
            componentNames = updatedKeys;
        }

        // create model instances
        for (String componentName : componentNames) {
            try {
                Schema specSchema = specSchemas.get(componentName);

                String sourceJsonPath = "#/components/schemas/" + componentName;
                CodegenSchema codegenSchema = config.fromSchema(specSchema, sourceJsonPath, sourceJsonPath);
                schemas.put(componentName, codegenSchema);

            } catch (Exception e) {
                throw new RuntimeException("Could not process model '" + componentName + "'" + ".Please make sure that your schema is correct!", e);
            }
        }

        String schemasJsonPath = "#/components/schemas";
        generateXs(files, schemasJsonPath, CodegenConstants.JSON_PATH_LOCATION_TYPE.SCHEMAS, CodegenConstants.MODELS, null);
        // generate files based on processed models
        for (Map.Entry<String, CodegenSchema> entry: schemas.entrySet()) {
            String componentName = entry.getKey();
            CodegenSchema schema = entry.getValue();
            try {
                // to generate model files
                String jsonPath = schemasJsonPath + "/" + componentName;
                generateSchema(files, schema, jsonPath);

                // to generate model test files
                Map<String, Object> schemaData = new HashMap<>();
                schemaData.put("packageName", config.packageName());
                schemaData.put("schema", schema);
                schemaData.putAll(config.additionalProperties());
                schemaData.put("complexTypePrefix", "");
                generateModelTests(files, schemaData, componentName);

                // to generate model documentation files
                generateModelDocumentation(files, schemaData, componentName);

            } catch (Exception e) {
                throw new RuntimeException("Could not generate model '" + componentName + "'", e);
            }
        }
        if (GlobalSettings.getProperty("debugModels") != null) {
            LOGGER.info("############ Model info ############");
            Json.prettyPrint(schemas);
        }
        // sort them
        schemas = new TreeMap<>(schemas);
        return schemas;
    }

    @SuppressWarnings("unchecked")
    void generateApis(List<File> files, List<OperationsMap> allOperations, TreeMap<String, CodegenSchema> schemas, Map<String, List<CodegenOperation>> paths) {
        if (!generateApis) {
            // TODO: Process these anyway and present info via dryRun?
            LOGGER.info("Skipping generation of APIs.");
            return;
        }
        Set<String> apisToGenerate = null;
        String apiNames = GlobalSettings.getProperty("apis");
        if (apiNames != null && !apiNames.isEmpty()) {
            apisToGenerate = new HashSet<>(Arrays.asList(apiNames.split(",")));
        }
        if (apisToGenerate != null && !apisToGenerate.isEmpty()) {
            Map<String, List<CodegenOperation>> updatedPaths = new TreeMap<>();
            for (String m : paths.keySet()) {
                if (apisToGenerate.contains(m)) {
                    updatedPaths.put(m, paths.get(m));
                }
            }
            paths = updatedPaths;
        }
        for (String tag : paths.keySet()) {
            try {
                List<CodegenOperation> ops = paths.get(tag);
                ops.sort((one, another) -> ObjectUtils.compare(one.operationId, another.operationId));
                OperationsMap operation = processOperations(config, tag, ops, schemas);
                URL url = URLPathUtils.getServerURL(openAPI, config.serverVariableOverrides());
                operation.put("basePath", basePath);
                operation.put("basePathWithoutHost", removeTrailingSlash(config.encodePath(url.getPath())));
                operation.put("contextPath", contextPath);
                operation.put("baseName", tag);
                operation.put("apiPackage", config.apiPackage());
                operation.put("modelPackage", config.modelPackage());
                operation.putAll(config.additionalProperties());
                CodegenTag codegenTag = operation.getOperations().getOperation().get(0).tags.get(tag);
                operation.put("tag", codegenTag);
                operation.put("classname", config.toApiName(tag));
                operation.put("classVarName", config.toApiVarName(tag));
                operation.put("importPath", config.toApiImport(tag));
                operation.put("classFilename", config.toApiFilename(tag));
                operation.put("strictSpecBehavior", config.isStrictSpecBehavior());

                if (schemas == null || schemas.isEmpty()) {
                    operation.put("hasModel", false);
                } else {
                    operation.put("hasModel", true);
                }

                if (!config.vendorExtensions().isEmpty()) {
                    operation.put("vendorExtensions", config.vendorExtensions());
                }

                // process top-level x-group-parameters
                if (config.vendorExtensions().containsKey("x-group-parameters")) {
                    boolean isGroupParameters = Boolean.parseBoolean(config.vendorExtensions().get("x-group-parameters").toString());

                    OperationMap objectMap = operation.getOperations();
                    List<CodegenOperation> operations = objectMap.getOperation();
                    for (CodegenOperation op : operations) {
                        if (isGroupParameters && !op.vendorExtensions.containsKey("x-group-parameters")) {
                            op.vendorExtensions.put("x-group-parameters", Boolean.TRUE);
                        }
                    }
                }

                // Pass sortParamsByRequiredFlag through to the Mustache template...
                boolean sortParamsByRequiredFlag = true;
                if (this.config.additionalProperties().containsKey(CodegenConstants.SORT_PARAMS_BY_REQUIRED_FLAG)) {
                    sortParamsByRequiredFlag = Boolean.parseBoolean(this.config.additionalProperties().get(CodegenConstants.SORT_PARAMS_BY_REQUIRED_FLAG).toString());
                }
                operation.put("sortParamsByRequiredFlag", sortParamsByRequiredFlag);

                /* consumes, produces are no longer defined in OAS3.0
                processMimeTypes(swagger.getConsumes(), operation, "consumes");
                processMimeTypes(swagger.getProduces(), operation, "produces");
                */

                allOperations.add(operation);

                addAuthenticationSwitches(operation);

                for (String templateName : config.apiTemplateFiles().keySet()) {
                    String filename = config.apiFilename(templateName, tag);
                    File written = processTemplateToFile(operation, templateName, filename, generateApis, CodegenConstants.APIS);
                    if (written != null) {
                        files.add(written);
                        if (config.isEnablePostProcessFile() && !dryRun) {
                            config.postProcessFile(written, "api");
                        }
                    }
                }

                // to generate api test files
                for (String templateName : config.apiTestTemplateFiles().keySet()) {
                    String filename = config.apiTestFilename(templateName, tag);
                    File apiTestFile = new File(filename);
                    // do not overwrite test file that already exists
                    if (apiTestFile.exists()) {
                        this.templateProcessor.skip(apiTestFile.toPath(), "Test files never overwrite an existing file of the same name.");
                    } else {
                        File written = processTemplateToFile(operation, templateName, filename, generateApiTests, CodegenConstants.API_TESTS, config.apiTestFileFolder());
                        if (written != null) {
                            files.add(written);
                            if (config.isEnablePostProcessFile() && !dryRun) {
                                config.postProcessFile(written, "api-test");
                            }
                        }
                    }
                }

                // to generate api documentation files
                for (String templateName : config.apiDocTemplateFiles().keySet()) {
                    String filename = config.apiDocFilename(templateName, tag);
                    File written = processTemplateToFile(operation, templateName, filename, generateApiDocumentation, CodegenConstants.API_DOCS);
                    if (written != null) {
                        files.add(written);
                        if (config.isEnablePostProcessFile() && !dryRun) {
                            config.postProcessFile(written, "api-doc");
                        }
                    }
                }

            } catch (Exception e) {
                throw new RuntimeException("Could not generate api file for '" + tag + "'", e);
            }
        }
        if (GlobalSettings.getProperty("debugOperations") != null) {
            LOGGER.info("############ Operation info ############");
            Json.prettyPrint(allOperations);
        }

    }

    private void generateSupportingFiles(List<File> files, Map<String, Object> bundle) {
        if (!generateSupportingFiles) {
            // TODO: process these anyway and report via dryRun?
            LOGGER.info("Skipping generation of supporting files.");
            return;
        }
        Set<String> supportingFilesToGenerate = null;
        String supportingFiles = GlobalSettings.getProperty(CodegenConstants.SUPPORTING_FILES);
        if (supportingFiles != null && !supportingFiles.isEmpty()) {
            supportingFilesToGenerate = new HashSet<>(Arrays.asList(supportingFiles.split(",")));
        }

        for (SupportingFile support : config.supportingFiles()) {
            try {
                String outputFolder = config.outputFolder();
                if (StringUtils.isNotEmpty(support.getFolder())) {
                    outputFolder += File.separator + support.getFolder();
                }
                File of = new File(outputFolder);
                if (!of.isDirectory()) {
                    if (!dryRun && !of.mkdirs()) {
                        once(LOGGER).debug("Output directory {} not created. It {}.", outputFolder, of.exists() ? "already exists." : "may not have appropriate permissions.");
                    }
                }
                String outputFilename = new File(support.getDestinationFilename()).isAbsolute() // split
                        ? support.getDestinationFilename()
                        : outputFolder + File.separator + support.getDestinationFilename().replace('/', File.separatorChar);

                boolean shouldGenerate = true;
                if (supportingFilesToGenerate != null && !supportingFilesToGenerate.isEmpty()) {
                    shouldGenerate = supportingFilesToGenerate.contains(support.getDestinationFilename());
                }

                File written = processTemplateToFile(bundle, support.getTemplateFile(), outputFilename, shouldGenerate, CodegenConstants.SUPPORTING_FILES);
                if (written != null) {
                    files.add(written);
                    if (config.isEnablePostProcessFile() && !dryRun) {
                        config.postProcessFile(written, "supporting-file");
                    }
                }
            } catch (Exception e) {
                throw new RuntimeException("Could not generate supporting file '" + support + "'", e);
            }
        }

        // Consider .openapi-generator-ignore a supporting file
        // Output .openapi-generator-ignore if it doesn't exist and wasn't explicitly created by a generator
        final String openapiGeneratorIgnore = ".openapi-generator-ignore";
        String ignoreFileNameTarget = config.outputFolder() + File.separator + openapiGeneratorIgnore;
        File ignoreFile = new File(ignoreFileNameTarget);
        if (generateMetadata) {
            try {
                boolean shouldGenerate = !ignoreFile.exists();
                if (shouldGenerate && supportingFilesToGenerate != null && !supportingFilesToGenerate.isEmpty()) {
                    shouldGenerate = supportingFilesToGenerate.contains(openapiGeneratorIgnore);
                }
                File written = processTemplateToFile(bundle, openapiGeneratorIgnore, ignoreFileNameTarget, shouldGenerate, CodegenConstants.SUPPORTING_FILES);
                if (written != null) {
                    files.add(written);
                    if (config.isEnablePostProcessFile() && !dryRun) {
                        config.postProcessFile(written, "openapi-generator-ignore");
                    }
                }
            } catch (Exception e) {
                throw new RuntimeException("Could not generate supporting file '" + ignoreFileNameTarget + "'", e);
            }
        } else {
            this.templateProcessor.skip(ignoreFile.toPath(), "Skipped by generateMetadata option supplied by user.");
        }

        generateVersionMetadata(files);
    }

    Map<String, Object> buildSupportFileBundle(
            List<OperationsMap> allOperations,
            TreeMap<String, CodegenSchema> schemas,
            TreeMap<String, CodegenRequestBody> requestBodies,
            TreeMap<String, CodegenResponse> responses,
            TreeMap<String, CodegenHeader> headers,
            TreeMap<String, CodegenParameter> parameters) {

        Map<String, Object> bundle = new HashMap<>(config.additionalProperties());
        bundle.put("apiPackage", config.apiPackage());

        ApiInfoMap apis = new ApiInfoMap();
        apis.setApis(allOperations);

        TreeMap<String, CodegenOperation> pathAndHttpMethodToOperation = new TreeMap<>();
        for (OperationsMap om: allOperations) {
            OperationMap apiOperations = om.getOperations();
            for (CodegenOperation operation: apiOperations.getOperation()) {
                String pathAndHttpMethod = operation.path + "|" + operation.httpMethod;
                if (!pathAndHttpMethodToOperation.containsKey(pathAndHttpMethod)) {
                    pathAndHttpMethodToOperation.put(pathAndHttpMethod, operation);
                }
            }
        }
        pathAndHttpMethodToOperation = new TreeMap<>(pathAndHttpMethodToOperation);

        URL url = URLPathUtils.getServerURL(openAPI, config.serverVariableOverrides());

        bundle.put("openAPI", openAPI);
        bundle.put("basePath", basePath);
        bundle.put("basePathWithoutHost", basePathWithoutHost);
        bundle.put("scheme", URLPathUtils.getScheme(url, config));
        bundle.put("host", url.getHost());
        if (url.getPort() != 80 && url.getPort() != 443 && url.getPort() != -1) {
            bundle.put("port", url.getPort());
        }
        bundle.put("contextPath", contextPath);
        bundle.put("apiInfo", apis);
        bundle.put("pathAndHttpMethodToOperation", pathAndHttpMethodToOperation);
        bundle.put("requestBodies", requestBodies);
        bundle.put("responses", responses);
        bundle.put("headers", headers);
        bundle.put("parameters", parameters);
        bundle.put("schemas", schemas);
        bundle.put("apiFolder", config.apiPackage().replace('.', File.separatorChar));
        bundle.put("modelPackage", config.modelPackage());
        bundle.put("library", config.getLibrary());
        bundle.put("generatorLanguageVersion", config.generatorLanguageVersion());
        // todo verify support and operation bundles have access to the common variables

        addAuthenticationSwitches(bundle);

        List<CodegenServer> servers = config.fromServers(openAPI.getServers());
        if (servers != null && !servers.isEmpty()) {
            servers.forEach(server -> server.url = removeTrailingSlash(server.url));
            bundle.put("servers", servers);
            bundle.put("hasServers", true);
        }

        if (openAPI.getExternalDocs() != null) {
            bundle.put("externalDocs", openAPI.getExternalDocs());
        }

        config.postProcessSupportingFileData(bundle);

        if (GlobalSettings.getProperty("debugSupportingFiles") != null) {
            LOGGER.info("############ Supporting file info ############");
            Json.prettyPrint(bundle);
        }
        return bundle;
    }

    /**
     * Add authentication methods to the given map
     * This adds a boolean and a collection for each authentication type to the map.
     * <p>
     * Examples:
     * <p>
     *   boolean hasOAuthMethods
     * <p>
     *   List&lt;CodegenSecurity&gt; oauthMethods
     *
     * @param bundle the map which the booleans and collections will be added
     */
    void addAuthenticationSwitches(Map<String, Object> bundle) {
        Map<String, SecurityScheme> securitySchemeMap = openAPI.getComponents() != null ? openAPI.getComponents().getSecuritySchemes() : null;
        List<CodegenSecurity> authMethods = config.fromSecurity(securitySchemeMap);
        if (authMethods != null && !authMethods.isEmpty()) {
            bundle.put("authMethods", authMethods);
            bundle.put("hasAuthMethods", true);

            if (ProcessUtils.hasOAuthMethods(authMethods)) {
                bundle.put("hasOAuthMethods", true);
                bundle.put("oauthMethods", ProcessUtils.getOAuthMethods(authMethods));
            }
            if (ProcessUtils.hasHttpBearerMethods(authMethods)) {
                bundle.put("hasHttpBearerMethods", true);
                bundle.put("httpBearerMethods", ProcessUtils.getHttpBearerMethods(authMethods));
            }
            if (ProcessUtils.hasHttpSignatureMethods(authMethods)) {
                bundle.put("hasHttpSignatureMethods", true);
                bundle.put("httpSignatureMethods", ProcessUtils.getHttpSignatureMethods(authMethods));
            }
            if (ProcessUtils.hasHttpBasicMethods(authMethods)) {
                bundle.put("hasHttpBasicMethods", true);
                bundle.put("httpBasicMethods", ProcessUtils.getHttpBasicMethods(authMethods));
            }
            if (ProcessUtils.hasApiKeyMethods(authMethods)) {
                bundle.put("hasApiKeyMethods", true);
                bundle.put("apiKeyMethods", ProcessUtils.getApiKeyMethods(authMethods));
            }
        }
    }

    @Override
    public List<File> generate() {
        if (openAPI == null) {
            throw new RuntimeException("Issues with the OpenAPI input. Possible causes: invalid/missing spec, malformed JSON/YAML files, etc.");
        }

        if (config == null) {
            throw new RuntimeException("missing config!");
        }

        if (config.getGeneratorMetadata() == null) {
            LOGGER.warn("Generator '{}' is missing generator metadata!", config.getName());
        } else {
            GeneratorMetadata generatorMetadata = config.getGeneratorMetadata();
            if (StringUtils.isNotEmpty(generatorMetadata.getGenerationMessage())) {
                LOGGER.info(generatorMetadata.getGenerationMessage());
            }

            Stability stability = generatorMetadata.getStability();
            String stabilityMessage = String.format(Locale.ROOT, "Generator '%s' is considered %s.", config.getName(), stability.value());
            if (stability == Stability.DEPRECATED) {
                LOGGER.warn(stabilityMessage);
            } else {
                LOGGER.info(stabilityMessage);
            }
        }

        configureGeneratorProperties();
        configureOpenAPIInfo();

        config.processOpenAPI(openAPI);

        processUserDefinedTemplates();

        List<File> files = new ArrayList<>();
        // components.schemas / models
        TreeMap<String, CodegenSchema> schemas = generateSchemas(files);
        // components.requestBodies
        TreeMap<String, CodegenRequestBody> requestBodies = generateRequestBodies(files);
        // components.headers, must be before generateResponses, because those can $ref these
        TreeMap<String, CodegenHeader> headers = generateHeaders(files);
        // components.responses
        TreeMap<String, CodegenResponse> responses = generateResponses(files);
        // components.parameters, must be before processPaths, because those can $ref these
        TreeMap<String, CodegenParameter> parameters = generateParameters(files);

        boolean schemasExist = (schemas != null && !schemas.isEmpty());
        boolean requestBodiesExist = (requestBodies != null && !requestBodies.isEmpty());
        boolean headersExist = (headers != null && !headers.isEmpty());
        boolean responsesExist = (responses != null && !responses.isEmpty());
        boolean parametersExist = (parameters != null && !parameters.isEmpty());
        if (schemasExist || requestBodiesExist || headersExist || responsesExist || parametersExist) {
            generateXs(files, "#/components", CodegenConstants.JSON_PATH_LOCATION_TYPE.COMPONENTS, CodegenConstants.COMPONENTS, null);
        }

        // paths input
        Map<String, List<CodegenOperation>> paths = processPaths(this.openAPI.getPaths());
        // apis
        List<OperationsMap> allOperations = new ArrayList<>();
        generateApis(files, allOperations, schemas, paths);
        // paths
        generatePaths(files, paths);

        // supporting files
        Map<String, Object> bundle = buildSupportFileBundle(allOperations, schemas, requestBodies, responses, headers, parameters);
        generateSupportingFiles(files, bundle);

        if (dryRun) {
            boolean verbose = Boolean.parseBoolean(GlobalSettings.getProperty("verbose"));
            StringBuilder sb = new StringBuilder();

            sb.append(System.lineSeparator()).append(System.lineSeparator());
            sb.append("Dry Run Results:");
            sb.append(System.lineSeparator()).append(System.lineSeparator());

            Map<String, DryRunStatus> dryRunStatusMap = ((DryRunTemplateManager) this.templateProcessor).getDryRunStatusMap();

            dryRunStatusMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(entry -> {
                DryRunStatus status = entry.getValue();
                try {
                    status.appendTo(sb);
                    sb.append(System.lineSeparator());
                    if (verbose) {
                        sb.append("  ")
                                .append(StringUtils.rightPad(status.getState().getDescription(), 20, "."))
                                .append(" ").append(status.getReason())
                                .append(System.lineSeparator());
                    }
                } catch (IOException e) {
                    LOGGER.debug("Unable to document dry run status for {}.", entry.getKey());
                }
            });

            sb.append(System.lineSeparator()).append(System.lineSeparator());
            sb.append("States:");
            sb.append(System.lineSeparator()).append(System.lineSeparator());

            for (DryRunStatus.State state : DryRunStatus.State.values()) {
                sb.append("  - ").append(state.getShortDisplay()).append(" ").append(state.getDescription()).append(System.lineSeparator());
            }

            sb.append(System.lineSeparator());

            LOGGER.error(sb.toString());
        } else {
            // This exists here rather than in the method which generates supporting files to avoid accidentally adding files after this metadata.
            if (generateSupportingFiles) {
                generateFilesMetadata(files);
            }
        }

        // post-process
        config.postProcess();

        // reset GlobalSettings, so that the running thread can be reused for another generator-run
        GlobalSettings.reset();

        return files;
    }

    private void processUserDefinedTemplates() {
        // TODO: initial behavior is "merge" user defined with built-in templates. consider offering user a "replace" option.
        if (userDefinedTemplates != null && !userDefinedTemplates.isEmpty()) {
            Map<String, SupportingFile> supportingFilesMap = config.supportingFiles().stream()
                    .collect(Collectors.toMap(TemplateDefinition::getTemplateFile, Function.identity(), (oldValue, newValue) -> oldValue));

            // TemplateFileType.SupportingFiles
            userDefinedTemplates.stream()
                    .filter(i -> i.getTemplateType().equals(TemplateFileType.SupportingFiles))
                    .forEach(userDefinedTemplate -> {
                        SupportingFile newFile = new SupportingFile(
                                userDefinedTemplate.getTemplateFile(),
                                userDefinedTemplate.getFolder(),
                                userDefinedTemplate.getDestinationFilename()
                        );
                        if (supportingFilesMap.containsKey(userDefinedTemplate.getTemplateFile())) {
                            SupportingFile f = supportingFilesMap.get(userDefinedTemplate.getTemplateFile());
                            config.supportingFiles().remove(f);

                            if (!f.isCanOverwrite()) {
                                newFile.doNotOverwrite();
                            }
                        }
                        config.supportingFiles().add(newFile);
                    });

            // Others, excluding TemplateFileType.SupportingFiles
            userDefinedTemplates.stream()
                    .filter(i -> !i.getTemplateType().equals(TemplateFileType.SupportingFiles))
                    .forEach(userDefinedTemplate -> {
                        // determine file extension…
                        // if template is in format api.ts.mustache, we'll extract .ts
                        // if user has provided an example destination filename, we'll use that extension
                        String templateFile = userDefinedTemplate.getTemplateFile();
                        int lastSeparator = templateFile.lastIndexOf('.');
                        String templateExt = FilenameUtils.getExtension(templateFile.substring(0, lastSeparator));
                        if (StringUtils.isBlank(templateExt)) {
                            // hack: destination filename in this scenario might be a suffix like Impl.java
                            templateExt = userDefinedTemplate.getDestinationFilename();
                        } else {
                            templateExt = StringUtils.prependIfMissing(templateExt, ".");
                        }

                        switch (userDefinedTemplate.getTemplateType()) {
                            case API:
                                config.apiTemplateFiles().put(templateFile, templateExt);
                                break;
                            case Model:
                                config.jsonPathTemplateFiles().get(CodegenConstants.JSON_PATH_LOCATION_TYPE.SCHEMA).put(templateFile, templateExt);
                                break;
                            case APIDocs:
                                config.apiDocTemplateFiles().put(templateFile, templateExt);
                                break;
                            case ModelDocs:
                                config.modelDocTemplateFiles().put(templateFile, templateExt);
                                break;
                            case APITests:
                                config.apiTestTemplateFiles().put(templateFile, templateExt);
                                break;
                            case ModelTests:
                                config.modelTestTemplateFiles().put(templateFile, templateExt);
                                break;
                            case SupportingFiles:
                                // excluded by filter
                                break;
                        }
                    });
        }
    }

    protected File processTemplateToFile(Map<String, Object> templateData, String templateName, String outputFilename, boolean shouldGenerate, String skippedByOption) throws IOException {
        return processTemplateToFile(templateData, templateName, outputFilename, shouldGenerate, skippedByOption, this.config.getOutputDir());
    }

    private File processTemplateToFile(Map<String, Object> templateData, String templateName, String outputFilename, boolean shouldGenerate, String skippedByOption, String intendedOutputDir) throws IOException {
        String adjustedOutputFilename = outputFilename.replaceAll("//", "/").replace('/', File.separatorChar);
        File target = new File(adjustedOutputFilename);
        if (ignoreProcessor.allowsFile(target)) {
            if (shouldGenerate) {
                Path outDir = java.nio.file.Paths.get(intendedOutputDir).toAbsolutePath();
                Path absoluteTarget = target.toPath().toAbsolutePath();
                if (!absoluteTarget.startsWith(outDir)) {
                    throw new RuntimeException(String.format(Locale.ROOT, "Target files must be generated within the output directory; absoluteTarget=%s outDir=%s", absoluteTarget, outDir));
                }
                return this.templateProcessor.write(templateData, templateName, target);
            } else {
                this.templateProcessor.skip(target.toPath(), String.format(Locale.ROOT, "Skipped by %s options supplied by user.", skippedByOption));
                return null;
            }
        } else {
            this.templateProcessor.ignore(target.toPath(), "Ignored by rule in ignore file.");
            return null;
        }
    }

    public Map<String, List<CodegenOperation>> processPaths(Paths paths) {
        Map<String, List<CodegenOperation>> ops = new TreeMap<>();
        // when input file is not valid and doesn't contain any paths
        if (paths == null) {
            return ops;
        }
        for (Map.Entry<String, PathItem> pathsEntry : paths.entrySet()) {
            String resourcePath = pathsEntry.getKey();
            PathItem path = pathsEntry.getValue();
            processOperation(resourcePath, "get", path.getGet(), ops, path);
            processOperation(resourcePath, "head", path.getHead(), ops, path);
            processOperation(resourcePath, "put", path.getPut(), ops, path);
            processOperation(resourcePath, "post", path.getPost(), ops, path);
            processOperation(resourcePath, "delete", path.getDelete(), ops, path);
            processOperation(resourcePath, "patch", path.getPatch(), ops, path);
            processOperation(resourcePath, "options", path.getOptions(), ops, path);
            processOperation(resourcePath, "trace", path.getTrace(), ops, path);
        }
        return ops;
    }

    private void processOperation(String resourcePath, String httpMethod, Operation operation, Map<String, List<CodegenOperation>> operations, PathItem path) {
        if (operation == null) {
            return;
        }

        if (GlobalSettings.getProperty("debugOperations") != null) {
            LOGGER.info("processOperation: resourcePath=  {}\t;{} {}\n", resourcePath, httpMethod, operation);
        }

        List<Tag> tags = new ArrayList<>();
        List<String> tagNames = operation.getTags();
        List<Tag> swaggerTags = openAPI.getTags();
        if (tagNames != null) {
            if (swaggerTags == null) {
                for (String tagName : tagNames) {
                    tags.add(new Tag().name(tagName));
                }
            } else {
                for (String tagName : tagNames) {
                    boolean foundTag = false;
                    for (Tag tag : swaggerTags) {
                        if (tag.getName().equals(tagName)) {
                            tags.add(tag);
                            foundTag = true;
                            break;
                        }
                    }

                    if (!foundTag) {
                        tags.add(new Tag().name(tagName));
                    }
                }
            }
        }

        if (tags.isEmpty()) {
            tags.add(new Tag().name("default"));
        }

        /*
         build up a set of parameter "ids" defined at the operation level
         per the swagger 2.0 spec "A unique parameter is defined by a combination of a name and location"
          i'm assuming "location" == "in"
        */
        Set<String> operationParameters = new HashSet<>();
        if (operation.getParameters() != null) {
            for (Parameter parameter : operation.getParameters()) {
                operationParameters.add(generateParameterId(parameter));
            }
        }

        //need to propagate path level down to the operation
        if (path.getParameters() != null) {
            for (Parameter parameter : path.getParameters()) {
                //skip propagation if a parameter with the same name is already defined at the operation level
                if (!operationParameters.contains(generateParameterId(parameter))) {
                    operation.addParametersItem(parameter);
                }
            }
        }

        final Map<String, SecurityScheme> securitySchemes = openAPI.getComponents() != null ? openAPI.getComponents().getSecuritySchemes() : null;
        final List<SecurityRequirement> globalSecurities = openAPI.getSecurity();
        for (Tag tag : tags) {
            try {
                CodegenOperation codegenOperation = config.fromOperation(resourcePath, httpMethod, operation, path.getServers());
                config.addOperationToGroup(config.sanitizeTag(tag.getName()), resourcePath, operation, codegenOperation, operations);

                List<SecurityRequirement> securities = operation.getSecurity();
                if (securities != null && securities.isEmpty()) {
                    continue;
                }

                Map<String, SecurityScheme> authMethods = getAuthMethods(securities, securitySchemes);

                if (authMethods != null && !authMethods.isEmpty()) {
                    List<CodegenSecurity> fullAuthMethods = config.fromSecurity(authMethods);
                    codegenOperation.authMethods = filterAuthMethods(fullAuthMethods, securities);
                    codegenOperation.hasAuthMethods = true;
                } else {
                    authMethods = getAuthMethods(globalSecurities, securitySchemes);

                    if (authMethods != null && !authMethods.isEmpty()) {
                        List<CodegenSecurity> fullAuthMethods = config.fromSecurity(authMethods);
                        codegenOperation.authMethods = filterAuthMethods(fullAuthMethods, globalSecurities);
                        codegenOperation.hasAuthMethods = true;
                    }
                }

            } catch (Exception ex) {
                String msg = "Could not process operation:\n" //
                        + "  Tag: " + tag + "\n"//
                        + "  Operation: " + operation.getOperationId() + "\n" //
                        + "  Resource: " + httpMethod + " " + resourcePath + "\n"//
                        + "  Schemas: " + openAPI.getComponents().getSchemas() + "\n"  //
                        + "  Exception: " + ex.getMessage();
                throw new RuntimeException(msg, ex);
            }
        }

    }

    private static String generateParameterId(Parameter parameter) {
        return parameter.getName() + ":" + parameter.getIn();
    }

    private OperationsMap processOperations(CodegenConfig config, String tag, List<CodegenOperation> ops, TreeMap<String, CodegenSchema> schemas) {
        OperationsMap operations = new OperationsMap();
        OperationMap objs = new OperationMap();
        objs.setClassname(config.toApiName(tag));
        objs.setPathPrefix(config.toApiVarName(tag));

        // check for nickname uniqueness
        if (config.getAddSuffixToDuplicateOperationNicknames()) {
            Set<String> opIds = new HashSet<>();
            int counter = 0;
            for (CodegenOperation op : ops) {
                String opId = op.nickname;
                if (opIds.contains(opId)) {
                    counter++;
                    op.nickname += "_" + counter;
                }
                opIds.add(opId);
            }
        }
        objs.setOperation(ops);

        operations.setOperation(objs);
        operations.put("package", config.apiPackage());

        Set<String> allImports = new ConcurrentSkipListSet<>();
        for (CodegenOperation op : ops) {
            allImports.addAll(op.imports);
        }

        Map<String, String> mappings = getAllImportsMappings(allImports);
        Set<Map<String, String>> imports = toImportsObjects(mappings);

        //Some codegen implementations rely on a list interface for the imports
        operations.setImports(new ArrayList<>(imports));

        // add a flag to indicate whether there's any {{import}}
        if (!imports.isEmpty()) {
            operations.put("hasImport", true);
        }

        config.postProcessOperationsWithModels(operations, schemas);
        return operations;
    }

    /**
     * Transforms a set of imports to a map with key config.toModelImport(import) and value the import string.
     *
     * @param allImports - Set of imports
     * @return Map of fully qualified import path and initial import.
     */
    private Map<String, String> getAllImportsMappings(Set<String> allImports) {
        Map<String, String> result = new HashMap<>();
        allImports.forEach(nextImport -> {
            String mapping = config.importMapping().get(nextImport);
            if (mapping != null) {
                result.put(mapping, nextImport);
            } else {
                result.putAll(config.toModelImportMap(nextImport));
            }
        });
        return result;
    }

    /**
     * Using an import map created via {@link #getAllImportsMappings(Set)} to build a list import objects.
     * The import objects have two keys: import and classname which hold the key and value of the initial map entry.
     *
     * @param mappedImports Map of fully qualified import and import
     * @return The set of unique imports
     */
    private Set<Map<String, String>> toImportsObjects(Map<String, String> mappedImports) {
        Set<Map<String, String>> result = new TreeSet<>(
            Comparator.comparing(o -> o.get("classname"))
        );

        mappedImports.forEach((key, value) -> {
            Map<String, String> im = new LinkedHashMap<>();
            im.put("import", key);
            im.put("classname", value);
            result.add(im);
        });
        return result;
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
     * Generates a file at .openapi-generator/VERSION to track the version of user's latest run.
     *
     * @param files The list tracking generated files
     */
    private void generateVersionMetadata(List<File> files) {
        String versionMetadata = config.outputFolder() + File.separator + METADATA_DIR + File.separator + config.getVersionMetadataFilename();
        if (generateMetadata) {
            File versionMetadataFile = new File(versionMetadata);
            try {
                File written = this.templateProcessor.writeToFile(versionMetadata, ImplementationVersion.read().getBytes(StandardCharsets.UTF_8));
                if (written != null) {
                    files.add(versionMetadataFile);
                    if (config.isEnablePostProcessFile() && !dryRun) {
                        config.postProcessFile(written, "openapi-generator-version");
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException("Could not generate supporting file '" + versionMetadata + "'", e);
            }
        } else {
            Path metadata = java.nio.file.Paths.get(versionMetadata);
            this.templateProcessor.skip(metadata, "Skipped by generateMetadata option supplied by user.");
        }
    }

    private Path absPath(File input) {
        // intentionally creates a new absolute path instance, disconnected from underlying FileSystem provider of File
        return java.nio.file.Paths.get(input.getAbsolutePath());
    }

    /**
     * Generates a file at .openapi-generator/FILES to track the files created by the user's latest run.
     * This is ideal for CI and regeneration of code without stale/unused files from older generations.
     *
     * @param files The list tracking generated files
     */
    private void generateFilesMetadata(List<File> files) {
        if (generateMetadata) {
            try {
                StringBuilder sb = new StringBuilder();
                Path outDir = absPath(new File(this.config.getOutputDir()));

                List<File> filesToSort = new ArrayList<>();

                // Avoid side-effecting sort in this path when generateMetadata=true
                files.forEach(f -> {
                    // We have seen NPE on CI for getPath() returning null, so guard against this (to be fixed in 5.0 template management refactor)
                    //noinspection ConstantConditions
                    if (f != null && f.getPath() != null) {
                        filesToSort.add(outDir.relativize(absPath(f)).normalize().toFile());
                    }
                });

                // NOTE: Don't use File.separator here as we write linux-style paths to FILES, and File.separator will
                // result in incorrect match on Windows machines.
                String relativeMeta = METADATA_DIR + "/VERSION";
                filesToSort.sort(PathFileComparator.PATH_COMPARATOR);
                filesToSort.forEach(f -> {
                    // some Java implementations don't honor .relativize documentation fully.
                    // When outDir is /a/b and the input is /a/b/c/d, the result should be c/d.
                    // Some implementations make the output ./c/d which seems to mix the logic
                    // as documented for symlinks. So we need to trim any / or ./ from the start,
                    // as nobody should be generating into system root and our expectation is no ./
                    String relativePath = removeStart(removeStart(f.toString(), "." + File.separator), File.separator);
                    if (File.separator.equals("\\")) {
                        // ensure that windows outputs same FILES format
                        relativePath = relativePath.replace(File.separator, "/");
                    }
                    if (!relativePath.equals(relativeMeta)) {
                        sb.append(relativePath).append(System.lineSeparator());
                    }
                });

                String targetFile = config.outputFolder() + File.separator + METADATA_DIR + File.separator + config.getFilesMetadataFilename();

                File filesFile = this.templateProcessor.writeToFile(targetFile, sb.toString().getBytes(StandardCharsets.UTF_8));
                if (filesFile != null) {
                    files.add(filesFile);
                }
            } catch (Exception e) {
                LOGGER.warn("Failed to write FILES metadata to track generated files.");
            }
        }
    }

    private String removeTrailingSlash(String value) {
        return StringUtils.removeEnd(value, "/");
    }

}
