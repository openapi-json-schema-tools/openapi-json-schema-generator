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

import com.samskivert.mustache.Mustache.Compiler;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.PathItem;
import io.swagger.v3.oas.models.Paths;
import io.swagger.v3.oas.models.headers.Header;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.parameters.Parameter;
import io.swagger.v3.oas.models.parameters.RequestBody;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import io.swagger.v3.oas.models.servers.ServerVariable;
import org.openapijsonschematools.codegen.model.CodegenHeader;
import org.openapijsonschematools.codegen.model.CodegenKey;
import org.openapijsonschematools.codegen.model.CodegenOperation;
import org.openapijsonschematools.codegen.model.CodegenParameter;
import org.openapijsonschematools.codegen.model.CodegenPathItem;
import org.openapijsonschematools.codegen.model.CodegenPatternInfo;
import org.openapijsonschematools.codegen.model.CodegenRequestBody;
import org.openapijsonschematools.codegen.model.CodegenResponse;
import org.openapijsonschematools.codegen.model.CodegenSchema;
import org.openapijsonschematools.codegen.model.CodegenSecurityRequirementValue;
import org.openapijsonschematools.codegen.model.CodegenSecurityScheme;
import org.openapijsonschematools.codegen.model.CodegenServer;
import org.openapijsonschematools.codegen.api.TemplatingEngineAdapter;
import org.openapijsonschematools.codegen.meta.FeatureSet;
import org.openapijsonschematools.codegen.meta.GeneratorMetadata;
import org.openapijsonschematools.codegen.model.CodegenTag;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public interface CodegenConfig {
    String getFilesMetadataFilename();

    String getVersionMetadataFilename();

    GeneratorMetadata getGeneratorMetadata();

    CodegenType getTag();

    String getName();

    String getHelp();

    Map<String, Object> additionalProperties();

    Map<String, String> serverVariableOverrides();

    Map<String, Object> vendorExtensions();

    String testPackage();

    String apiPackage();

    String apiFileFolder();

    String apiTestFileFolder();

    String apiDocFileFolder();

    String outputFolder();

    String templateDir();

    String embeddedTemplateDir();

    String modelTestFileFolder();

    String modelPackage();

    String modelPackagePathFragment();

    String packageName();

    String toApiName(String name);

    String toApiVarName(String name);

    String toModelName(String name, String jsonPath);

    String toParamName(String name);

    String escapeText(String text);

    String escapeTextWhileAllowingNewLines(String text);

    String encodePath(String text);

    String escapeUnsafeCharacters(String input);

    String escapeReservedWord(String name);

    String escapeQuotationMark(String input);

    void processOpts();

    List<CliOption> cliOptions();

    Set<String> reservedWords();

    List<SupportingFile> supportingFiles();

    String getInputSpec();

    void setInputSpec(String inputSpec);

    String getOutputDir();

    String packagePath();

    void setOutputDir(String dir);

    CodegenSchema fromSchema(Schema<?> schema, String sourceJsonPath, String currentJsonPath);

    CodegenTag fromTag(String name, String description);

    List<HashMap<String, CodegenSecurityRequirementValue>> fromSecurity(List<SecurityRequirement> security, String jsonPath);

    CodegenOperation fromOperation(Operation operation, String jsonPath);

    CodegenKey getKey(String key);

    CodegenSecurityScheme fromSecurityScheme(SecurityScheme securityScheme, String jsonPath);

    HashMap<String, CodegenSecurityRequirementValue> fromSecurityRequirement(SecurityRequirement securityScheme, String jsonPath);

    TreeMap<CodegenKey, CodegenPathItem> fromPaths(Paths paths);

    CodegenPathItem fromPathItem(PathItem pathItem, String jsonPath);

    List<CodegenServer> fromServers(List<Server> servers, String jsonPath);

    CodegenSchema fromServerVariables(Map<String, ServerVariable> variables, String jsonPath);

    Map<String, String> typeMapping();

    Map<String, String> instantiationTypes();

    Map<String, String> schemaMapping();

    Map<String, String> inlineSchemaNameMapping();

    Map<String, String> inlineSchemaNameDefault();

    HashMap<CodegenConstants.JSON_PATH_LOCATION_TYPE, HashMap<String, String>> jsonPathTemplateFiles();

    HashMap<CodegenConstants.JSON_PATH_LOCATION_TYPE, HashMap<String, String>> jsonPathDocTemplateFiles();

    Set<String> pathEndpointTestTemplateFiles();

    Map<String, String> apiTestTemplateFiles();

    Map<String, String> modelTestTemplateFiles();

    Set<String> languageSpecificPrimitives();

    Map<String, String> reservedWordsMappings();

    void preprocessOpenAPI(OpenAPI openAPI);

    void processOpenAPI(OpenAPI openAPI);

    Compiler processCompiler(Compiler compiler);

    String sanitizeTag(String tag);

    String toApiFilename(String name);

    String toModelFilename(String name, String jsonPath);

    String toModuleFilename(String name, String jsonPath);

    String toApiTestFilename(String name);

    String toModelTestFilename(String name);

    String toApiDocFilename(String name);

    String toRequestBodyFilename(String componentName);

    String toHeaderFilename(String componentName, String jsonPath);

    String toPathFilename(String path, String jsonPath);

    String toParameterFilename(String baseName, String jsonPath);

    String toSecuritySchemeFilename(String baseName, String jsonPath);

    String toServerFilename(String baseName, String jsonPath);

    String toSecurityRequirementObjectFilename(String baseName, String jsonPath);

    String getCamelCaseServer(String baseName);

    String toModelImport(String refClass);

    Map<String, String> toModelImportMap(String name);

    String toApiImport(String name);

    void addOperationToGroup(String tag, String resourcePath, Operation operation, CodegenOperation co, Map<String, List<CodegenOperation>> operations);

    TreeMap<String, CodegenSchema> updateAllModels(TreeMap<String, CodegenSchema> models);

    void postProcess();

    TreeMap<String, CodegenSchema> postProcessAllModels(TreeMap<String, CodegenSchema> schemas);

    TreeMap<String, CodegenSchema> postProcessModels(TreeMap<String, CodegenSchema> models);

    Map<String, Object> postProcessSupportingFileData(Map<String, Object> data);

    void postProcessModelProperty(CodegenSchema model, CodegenSchema property);

    // handles almost all files to be written
    String getFilepath(String jsonPath);

    String getDocsFilepath(String jsonPath);

    String apiTestFilename(String templateName, String tag);

    boolean isSkipOverwrite();

    void setSkipOverwrite(boolean skipOverwrite);

    void setRemoveOperationIdPrefix(boolean removeOperationIdPrefix);

    void setSkipOperationExample(boolean skipOperationExample);

    boolean isHideGenerationTimestamp();

    void setHideGenerationTimestamp(boolean hideGenerationTimestamp);

    void setLibrary(String library);

    /**
     * Library template (sub-template).
     *
     * @return library template
     */
    String getLibrary();

    void setHttpUserAgent(String httpUserAgent);

    String getHttpUserAgent();

    void setDocExtension(String docExtension);

    String getDocExtension();

    void setIgnoreFilePathOverride(String ignoreFileOverride);

    String getIgnoreFilePathOverride();

    String sanitizeName(String name);

    void postProcessFile(File file, String fileType);

    boolean isEnablePostProcessFile();

    void setEnablePostProcessFile(boolean isEnablePostProcessFile);

    /**
     * Set the OpenAPI instance. This method needs to be called right after the instantiation of the Codegen class.
     *
     * @param openAPI specification being generated
     */
    void setOpenAPI(OpenAPI openAPI);

    void setTemplatingEngine(TemplatingEngineAdapter s);

    TemplatingEngineAdapter getTemplatingEngine();

    boolean isEnableMinimalUpdate();

    void setEnableMinimalUpdate(boolean isEnableMinimalUpdate);

    boolean isStrictSpecBehavior();

    void setStrictSpecBehavior(boolean strictSpecBehavior);

    FeatureSet getFeatureSet();

    CodegenPatternInfo getPatternInfo(String pattern);

    boolean isRemoveEnumValuePrefix();

    void setRemoveEnumValuePrefix(boolean removeEnumValuePrefix);

    String defaultTemplatingEngine();

    GeneratorLanguage generatorLanguage();

    /*
    the version of the language that the generator implements
    For python 3.9.0, generatorLanguageVersion would be "3.9.0"
    */
    String generatorLanguageVersion();

    List<VendorExtension> getSupportedVendorExtensions();

    String toRefClass(String ref, String sourceJsonPath, String expectedComponentType);

    CodegenRequestBody fromRequestBody(RequestBody body, String sourceJsonPath);

    CodegenResponse fromResponse(ApiResponse response, String sourceJsonPath);

    CodegenHeader fromHeader(Header parameter, String sourceJsonPath);

    CodegenParameter fromParameter(Parameter parameter, String sourceJsonPath);
}
