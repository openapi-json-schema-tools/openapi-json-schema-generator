package org.openapijsonschematools.codegen.generators.models;

public class CodeGeneratorSettings {
    public final String apiPackage;
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
    public CodeGeneratorSettings(
        String apiPackage,
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
        String templateEngineName
    ) {
        this.apiPackage = apiPackage;
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
    }
}
