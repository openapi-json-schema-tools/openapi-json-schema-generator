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
import org.openapijsonschematools.codegen.generators.models.CodeGeneratorSettings;
import org.openapijsonschematools.codegen.generators.models.VendorExtension;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenKeyType;
import org.openapijsonschematools.codegen.generators.openapimodels.CodegenRefInfo;
import org.openapijsonschematools.codegen.generators.models.GeneratedFileType;
import org.openapijsonschematools.codegen.generators.models.ReportFileType;
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

    Map<String, Object> additionalProperties();

    Map<String, Object> vendorExtensions();

    CodeGeneratorSettings generatorSettings();

    // todo deprecate this and make a key of api
    String toApiName(String name);

    // todo remove this because it is unused
    String toApiVarName(String name);

    // todo deprecate this and change it to getClassName
    String toModelName(String name, String jsonPath);

    String escapeText(String text);

    // todo remove because unused
    String escapeTextWhileAllowingNewLines(String text);

    String escapeUnsafeCharacters(String input);

    String escapeReservedWord(String name);

    String escapeQuotationMark(String input);

    // todo deprecate this and move it into new
    void processOpts();

    List<CliOption> cliOptions();

    Set<String> reservedWords();

    List<SupportingFile> supportingFiles();

    // todo deprecate this
    String getInputSpec();

    // todo remove this, pass in new
    void setInputSpec(String inputSpec);

    // todo deprecate this
    CodegenKey getKey(String key, String keyType);

    Map<String, String> instantiationTypes();

    HashMap<CodegenConstants.JSON_PATH_LOCATION_TYPE, HashMap<String, String>> getJsonPathTemplateFiles(GeneratedFileType type);

    Set<String> languageSpecificPrimitives();

    // todo remove + move this into the new constructor
    void preprocessOpenAPI(OpenAPI openAPI);

    // todo remove and move this into the new constructor
    void processOpenAPI(OpenAPI openAPI);

    // todo deprecate this, use getKey with api type
    String toApiFilename(String name);

    // todo deprecate and change to getSnakeCase
    String toModelFilename(String name, String jsonPath);

    // todo can this be eliminated? getPascalCase/getSnakeCase and getFileName should do everything
    String toModuleFilename(String name, String jsonPath);

    TreeMap<String, CodegenSchema> updateAllModels(TreeMap<String, CodegenSchema> models);

    // todo remove and use postGenerationMsg in generationMetadata
    void postProcess();

    TreeMap<String, CodegenSchema> postProcessAllModels(TreeMap<String, CodegenSchema> schemas);

    Map<String, Object> postProcessSupportingFileData(Map<String, Object> data);

    void postProcessModelProperty(CodegenSchema model, CodegenSchema property);
    
    String getImport(CodegenRefInfo<?> refInfo);
    String getRefModuleLocation(String ref);
    String getSubpackage(String jsonPath);

    String getFilePath(GeneratedFileType type, String jsonPath);

    boolean isSkipOverwrite();

    // todo remove this, set in new
    void setSkipOverwrite(boolean skipOverwrite);

    // todo remove this, set in new
    void setRemoveOperationIdPrefix(boolean removeOperationIdPrefix);

    // todo remove this set in new
    void setSkipOperationExample(boolean skipOperationExample);

    boolean isHideGenerationTimestamp();

    void setHideGenerationTimestamp(boolean hideGenerationTimestamp);

    void setDocExtension(String docExtension);

    // todo remove this set in new
    void setIgnoreFilePathOverride(String ignoreFileOverride);

    // todo deprecate and use settings
    String getIgnoreFilePathOverride();

    String sanitizeName(String name);

    void postProcessFile(File file, String fileType);

    boolean isEnablePostProcessFile();

    // todo remove this, set in new
    void setEnablePostProcessFile(boolean isEnablePostProcessFile);

    /**
     * Set the OpenAPI instance. This method needs to be called right after the instantiation of the Codegen class.
     *
     * @param openAPI specification being generated
     */
    void setOpenAPI(OpenAPI openAPI);

    // todo remove this set in new
    void setTemplateEngineName(String name);

    TemplatingEngineAdapter getTemplatingEngine();

    boolean isEnableMinimalUpdate();

    // todo remove this set in new
    void setEnableMinimalUpdate(boolean isEnableMinimalUpdate);

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

    @Deprecated
    default String getHelp() {
        return getGeneratorMetadata().getHelpTxt();
    }

    @Deprecated
    String toParamName(String name);

    @Deprecated
    default FeatureSet getFeatureSet() {
        return getGeneratorMetadata().getFeatureSet();
    }

    @Deprecated
    default HashMap<CodegenConstants.JSON_PATH_LOCATION_TYPE, HashMap<String, String>> jsonPathTemplateFiles() {
        return getJsonPathTemplateFiles(GeneratedFileType.CODE);
    }

    @Deprecated
    default HashMap<CodegenConstants.JSON_PATH_LOCATION_TYPE, HashMap<String, String>> jsonPathDocTemplateFiles() {
        return getJsonPathTemplateFiles(GeneratedFileType.DOCUMENTATION);
    }

    @Deprecated
    default HashMap<CodegenConstants.JSON_PATH_LOCATION_TYPE, HashMap<String, String>> jsonPathTestTemplateFiles() {
        return getJsonPathTemplateFiles(GeneratedFileType.TEST);
    }

    @Deprecated
    default String getFilepath(String jsonPath) {
        return getFilePath(GeneratedFileType.CODE, jsonPath);
    }

    @Deprecated
    default String getDocsFilepath(String jsonPath) {
        return getFilePath(GeneratedFileType.DOCUMENTATION, jsonPath);
    }

    @Deprecated
    default String getTestFilePath(String jsonPath) {
        return getFilePath(GeneratedFileType.TEST, jsonPath);
    }

    @Deprecated
    String toModelImport(String refClass);

    @Deprecated
    String modelPackage();

    @Deprecated
    String modelPackagePathFragment();

    @Deprecated
    default String apiPackage() {
        return generatorSettings().apiPackage;
    }

    @Deprecated
    default String outputFolder() {
        return generatorSettings().outputFolder;
    }

    @Deprecated
    default String getOutputDir() {
        return outputFolder();
    }

    @Deprecated
    default String templateDir() {
        return generatorSettings().templateDir;
    }

    @Deprecated
    default String embeddedTemplateDir() {
        return generatorSettings().templateDir;
    }

    @Deprecated
    default String packageName() {
        return generatorSettings().packageName;
    }
    // 107 - 36 -> 71
}
