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
import org.openapijsonschematools.codegen.common.CodegenConstants;
import org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorLanguage;
import org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorType;
import org.openapijsonschematools.codegen.generators.models.VendorExtension;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenKeyType;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenRefInfo;
import org.openapijsonschematools.codegen.generators.openapimodels.ReportFileType;
import org.openapijsonschematools.codegen.templating.SupportingFile;
import org.openapijsonschematools.codegen.generators.models.CliOption;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenKey;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenPatternInfo;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenSchema;
import org.openapijsonschematools.codegen.templating.TemplatingEngineAdapter;
import org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet;
import org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata;

import javax.validation.constraints.NotNull;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;

public interface Generator extends OpenApiProcessor, Comparable<Generator> {
    String getReportFilename(ReportFileType type);

    GeneratorMetadata getGeneratorMetadata();

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

    CodegenKey getKey(String key, String keyType);

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

    List<VendorExtension> getSupportedVendorExtensions();

    String toRefClass(String ref, String sourceJsonPath, String expectedComponentType);
    Function<CodegenSchema, List<CodegenSchema>> getSchemasFn();

    boolean generateSeparateServerSchemas();
    boolean shouldGenerateFile(String jsonPath, boolean isDoc);

    String getPascalCase(CodegenKeyType type, String lastJsonPathFragment, String jsonPath);
    String getFilename(CodegenKeyType type, String lastJsonPathFragment, String jsonPath);
    Set<String> getImports(String sourceJsonPath, CodegenSchema schema, FeatureSet featureSet);

    default int compareTo(Generator o) {
        return getGeneratorMetadata().getName().compareTo(o.getGeneratorMetadata().getName());
    }

    @Deprecated
    default String getSchemaFilename(String jsonPath) {
        String[] pathPieces = jsonPath.split("/");
        return getFilename(CodegenKeyType.SCHEMA, pathPieces[pathPieces.length-1], jsonPath);
    }

    @Deprecated
    default String getSchemaPascalCaseName(String name, @NotNull String sourceJsonPath) {
        return getPascalCase(CodegenKeyType.SCHEMA, name, sourceJsonPath);
    }
    @Deprecated
    default String toContentTypeFilename(String name) {
        return getFilename(CodegenKeyType.CONTENT_TYPE, name, null);
    }

    @Deprecated
    default String toRequestBodyFilename(String componentName, String jsonPath) {
        return getFilename(CodegenKeyType.REQUEST_BODY, componentName, jsonPath);
    }

    @Deprecated
    default String toHeaderFilename(String componentName, String jsonPath) {
        return getFilename(CodegenKeyType.HEADER, componentName, jsonPath);
    }

    @Deprecated
    default String toPathFilename(String path, String jsonPath) {
        return getFilename(CodegenKeyType.PATH, path, jsonPath);
    }

    @Deprecated
    default String toParameterFilename(String baseName, String jsonPath) {
        return getFilename(CodegenKeyType.PARAMETER, baseName, jsonPath);
    }

    @Deprecated
    default String toOperationFilename(String name, String jsonPath) {
        return getFilename(CodegenKeyType.OPERATION, name, jsonPath);
    }

    @Deprecated
    default String toSecuritySchemeFilename(String baseName, String jsonPath) {
        return getFilename(CodegenKeyType.SECURITY_SCHEME, baseName, jsonPath);
    }

    @Deprecated
    default String toServerFilename(String baseName, String jsonPath) {
        return getFilename(CodegenKeyType.SERVER, baseName, jsonPath);
    }

    @Deprecated
    default String toSecurityFilename(String baseName, String jsonPath) {
        return getFilename(CodegenKeyType.SECURITY, baseName, jsonPath);
    }

    @Deprecated
    default String getPascalCaseServer(String basename, String jsonPath) {
        return getPascalCase(CodegenKeyType.SERVER, basename, jsonPath);
    }

    @Deprecated
    default String getFilesMetadataFilename() {
        return getReportFilename(ReportFileType.FILES);
    }

    @Deprecated
    default String getVersionMetadataFilename() {
        return getReportFilename(ReportFileType.VERSION);
    }

    @Deprecated
    default String getName() {
        return getGeneratorMetadata().getName();
    }

    @Deprecated
    default GeneratorType getTag() {
        return getGeneratorMetadata().getType();
    }

    @Deprecated
    default GeneratorLanguage generatorLanguage() {
        return getGeneratorMetadata().getLanguage();
    }

    @Deprecated
    default String generatorLanguageVersion() {
        return getGeneratorMetadata().getLanguageVersion();
    }
}
