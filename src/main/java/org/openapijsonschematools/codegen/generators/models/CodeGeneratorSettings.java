package org.openapijsonschematools.codegen.generators.models;

import org.openapijsonschematools.codegen.config.GeneratorSettings;
import org.openapijsonschematools.codegen.config.WorkflowSettings;

import java.util.Objects;

public class CodeGeneratorSettings {
    public final String apiPackage;
    public final String artifactId;
    public final String outputFolder;
    public final String templateDir;
    public final String embeddedTemplateDir;
    public final String packageName;
    public final boolean strictSpecBehavior;
    public final boolean enableMinimalUpdate;  // flag to indicate whether to only update files whose contents have changed
    public final boolean skipOverwrite;
    public final boolean removeOperationIdPrefix;
    public final String ignoreFilePathOverride;
    public final boolean skipOperationExample;
    public final boolean enablePostProcessFile;  // boolean value indicating the state of the option for post-processing file using environment variables.
    public final String templateEngineName;
    public final String inputSpecLocation;  // input spec's location, as URL or file
    public final boolean removeEnumValuePrefix;
    public final boolean hideGenerationTimestamp;
    public final boolean intsAllowedForFloatDoubleFormats;
    public CodeGeneratorSettings(
        String apiPackage,
        String artifactId,
        String outputFolder,
        String templateDir,
        String embeddedTemplateDir,
        String packageName,
        boolean strictSpecBehavior,
        boolean enableMinimalUpdate,
        boolean skipOverwrite,
        boolean removeOperationIdPrefix,
        String ignoreFilePathOverride,
        boolean skipOperationExample,
        boolean enablePostProcessFile,
        String templateEngineName,
        String inputSpecLocation,
        boolean removeEnumValuePrefix,
        boolean hideGenerationTimestamp,
        boolean intsAllowedForFloatDoubleFormats
    ) {
        this.apiPackage = apiPackage;
        this.artifactId = artifactId;
        this.outputFolder = outputFolder;
        this.templateDir = templateDir;
        this.embeddedTemplateDir = embeddedTemplateDir;
        this.packageName = packageName;
        this.strictSpecBehavior = strictSpecBehavior;
        this.enableMinimalUpdate = enableMinimalUpdate;
        this.skipOverwrite = skipOverwrite;
        this.removeOperationIdPrefix = removeOperationIdPrefix;
        this.ignoreFilePathOverride = ignoreFilePathOverride;
        this.skipOperationExample = skipOperationExample;
        this.enablePostProcessFile = enablePostProcessFile;
        this.templateEngineName = templateEngineName;
        this.inputSpecLocation = inputSpecLocation;
        this.removeEnumValuePrefix = removeEnumValuePrefix;
        this.hideGenerationTimestamp = hideGenerationTimestamp;
        this.intsAllowedForFloatDoubleFormats = intsAllowedForFloatDoubleFormats;
    }

    public static CodeGeneratorSettings of(GeneratorSettings generatorSettings, WorkflowSettings workflowSettings, String embeddedTemplateDir, String packageNameDefault, String artifactIdDefault, String outputFolderDefault) {
        String apiPackageDefault = "apis";
        String apiPackage = generatorSettings != null ? Objects.requireNonNullElse(generatorSettings.getApiPackage(), apiPackageDefault) : apiPackageDefault;
        String artifactId = generatorSettings != null ? Objects.requireNonNullElse(generatorSettings.getArtifactId(), artifactIdDefault) : artifactIdDefault;
        String packageName = generatorSettings != null ? Objects.requireNonNullElse(generatorSettings.getPackageName(), packageNameDefault) : packageNameDefault;
        String outputDir = workflowSettings != null ? workflowSettings.getOutputDir() : outputFolderDefault;
        String templateDir = workflowSettings != null ? workflowSettings.getTemplateDir() : null;
        boolean strictSpecBehavior = workflowSettings != null ? workflowSettings.isStrictSpecBehavior() : WorkflowSettings.DEFAULT_STRICT_SPEC_BEHAVIOR;
        boolean enableMinimalUpdate = workflowSettings != null ? workflowSettings.isEnableMinimalUpdate() : WorkflowSettings.DEFAULT_ENABLE_MINIMAL_UPDATE;
        boolean skipOverwrite = workflowSettings != null ? workflowSettings.isSkipOverwrite() : WorkflowSettings.DEFAULT_SKIP_OVERWRITE;
        boolean removeOperationIdPrefix = workflowSettings != null ? workflowSettings.isRemoveOperationIdPrefix() : WorkflowSettings.DEFAULT_REMOVE_OPERATION_ID_PREFIX;
        String ignoreFileOverride = workflowSettings != null ? workflowSettings.getIgnoreFileOverride() : null;
        boolean skipOperationExample = workflowSettings != null ? workflowSettings.isSkipOperationExample() : WorkflowSettings.DEFAULT_SKIP_OPERATION_EXAMPLE;
        boolean enablePostProcessingFile = workflowSettings != null ? workflowSettings.isSkipOperationExample() : WorkflowSettings.DEFAULT_ENABLE_POST_PROCESS_FILE;
        String templateEnginName = workflowSettings != null ? workflowSettings.getTemplatingEngineName() : WorkflowSettings.DEFAULT_TEMPLATING_ENGINE_NAME;
        String inputSpecLocation = workflowSettings != null ? workflowSettings.getInputSpec() : null;
        boolean removeEnumValuePrefix = workflowSettings != null ? workflowSettings.isRemoveEnumValuePrefix() : WorkflowSettings.DEFAULT_REMOVE_ENUM_VALUE_PREFIX;
        boolean hideGenerationTimestamp = workflowSettings != null ? workflowSettings.isHideGenerationTimestamp() : WorkflowSettings.DEFAULT_HIDE_GENERATION_TIMESTAMP;
        boolean intsAllowedForFloatDoubleFormats = workflowSettings != null ? workflowSettings.isIntsAllowedForFloatDoubleFormats() : WorkflowSettings.DEFAULT_INTS_ALLOWED_FOR_FLOAT_DOUBLE_FORMATS;
        return new CodeGeneratorSettings(
            apiPackage,
            artifactId,
            outputDir,
            templateDir,
            embeddedTemplateDir,
            packageName,
            strictSpecBehavior,
            enableMinimalUpdate,
            skipOverwrite,
            removeOperationIdPrefix,
            ignoreFileOverride,
            skipOperationExample,
            enablePostProcessingFile,
            templateEnginName,
            inputSpecLocation,
            removeEnumValuePrefix,
            hideGenerationTimestamp,
            intsAllowedForFloatDoubleFormats
        );
    }
}
