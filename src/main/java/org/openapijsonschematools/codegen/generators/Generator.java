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
import org.apache.commons.lang3.tuple.Pair;
import org.openapijsonschematools.codegen.common.CodegenConstants;
import org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorLanguage;
import org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorType;
import org.openapijsonschematools.codegen.generators.models.VendorExtension;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenRefInfo;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenSecurityRequirementObject;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenList;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenServer;
import org.openapijsonschematools.codegen.templating.SupportingFile;
import org.openapijsonschematools.codegen.generators.models.CliOption;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenHeader;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenKey;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenOperation;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenParameter;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenPathItem;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenPatternInfo;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenRequestBody;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenResponse;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenSchema;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenSecurityRequirementValue;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenSecurityScheme;
import org.openapijsonschematools.codegen.templating.TemplatingEngineAdapter;
import org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet;
import org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenTag;

import javax.validation.constraints.NotNull;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;

public interface Generator {
    String getFilesMetadataFilename();

    String getVersionMetadataFilename();

    GeneratorMetadata getGeneratorMetadata();

    GeneratorType getTag();

    String getName();

    String getHelp();

    Map<String, Object> additionalProperties();

    Map<String, Object> vendorExtensions();

    String apiPackage();

    String outputFolder();

    String templateDir();

    String embeddedTemplateDir();

    String modelPackage();

    String modelPackagePathFragment();

    String packageName();

    String toApiName(String name);

    String toApiVarName(String name);

    String toModelName(String name, String jsonPath);

    String getSchemaFilename(String jsonPath);

    String getSchemaPascalCaseName(String name, @NotNull String sourceJsonPath);
    Set<String> getImports(String sourceJsonPath, CodegenSchema schema, FeatureSet featureSet);
    String toContentTypeFilename(String name);

    String toParamName(String name);

    String escapeText(String text);

    String escapeTextWhileAllowingNewLines(String text);

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

    CodegenList<CodegenSecurityRequirementObject> fromSecurity(List<SecurityRequirement> security, String jsonPath);

    CodegenOperation fromOperation(Operation operation, String jsonPath, LinkedHashMap<Pair<String, String>, CodegenParameter> pathItemParameters);

    CodegenKey getKey(String key, String keyType);

    CodegenSecurityScheme fromSecurityScheme(SecurityScheme securityScheme, String jsonPath);

    HashMap<String, CodegenSecurityRequirementValue> fromSecurityRequirement(SecurityRequirement securityScheme, String jsonPath);

    TreeMap<CodegenKey, CodegenPathItem> fromPaths(Paths paths);

    CodegenPathItem fromPathItem(PathItem pathItem, String jsonPath);

    CodegenList<CodegenServer> fromServers(List<Server> servers, String jsonPath);

    CodegenSchema fromServerVariables(Map<String, ServerVariable> variables, String jsonPath);

    Map<String, String> instantiationTypes();

    HashMap<CodegenConstants.JSON_PATH_LOCATION_TYPE, HashMap<String, String>> jsonPathTemplateFiles();

    HashMap<CodegenConstants.JSON_PATH_LOCATION_TYPE, HashMap<String, String>> jsonPathDocTemplateFiles();

    HashMap<CodegenConstants.JSON_PATH_LOCATION_TYPE, HashMap<String, String>> jsonPathTestTemplateFiles();

    Set<String> languageSpecificPrimitives();

    void preprocessOpenAPI(OpenAPI openAPI);

    void processOpenAPI(OpenAPI openAPI);

    Compiler processCompiler(Compiler compiler);

    String toApiFilename(String name);

    String toModelFilename(String name, String jsonPath);

    String toModuleFilename(String name, String jsonPath);

    String toRequestBodyFilename(String componentName, String jsonPath);

    String toHeaderFilename(String componentName, String jsonPath);

    String toPathFilename(String path, String jsonPath);

    String toParameterFilename(String baseName, String jsonPath);

    String toSecuritySchemeFilename(String baseName, String jsonPath);

    String toServerFilename(String baseName, String jsonPath);

    String toSecurityFilename(String baseName, String jsonPath);

    String getPascalCaseServer(String baseName, String jsonPath);

    String toModelImport(String refClass);

    TreeMap<String, CodegenSchema> updateAllModels(TreeMap<String, CodegenSchema> models);

    void postProcess();

    TreeMap<String, CodegenSchema> postProcessAllModels(TreeMap<String, CodegenSchema> schemas);

    TreeMap<String, CodegenSchema> postProcessModels(TreeMap<String, CodegenSchema> models);

    Map<String, Object> postProcessSupportingFileData(Map<String, Object> data);

    void postProcessModelProperty(CodegenSchema model, CodegenSchema property);

    // handles almost all files to be written
    String getFilepath(String jsonPath);

    String getImport(CodegenRefInfo<?> refInfo);
    String getRefModuleLocation(String ref);
    String getSubpackage(String jsonPath);

    String getDocsFilepath(String jsonPath);

    String getTestFilepath(String jsonPath);

    boolean isSkipOverwrite();

    void setSkipOverwrite(boolean skipOverwrite);

    void setRemoveOperationIdPrefix(boolean removeOperationIdPrefix);

    void setSkipOperationExample(boolean skipOperationExample);

    boolean isHideGenerationTimestamp();

    void setHideGenerationTimestamp(boolean hideGenerationTimestamp);

    void setDocExtension(String docExtension);

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

    void setTemplateEngineName(String name);

    TemplatingEngineAdapter getTemplatingEngine();

    boolean isEnableMinimalUpdate();

    void setEnableMinimalUpdate(boolean isEnableMinimalUpdate);

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

    Function<CodegenSchema, List<CodegenSchema>> getSchemasFn();

    boolean generateSeparateServerSchemas();
}
