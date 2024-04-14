package org.openapijsonschematools.codegen.generators.models;

public class CodeGeneratorSettings {
    public final String apiPackage;
    public final String outputFolder;
    public final String templateDir;
    public final String embeddedTemplateDir;
    public final String packageName;
    public CodeGeneratorSettings(String apiPackage, String outputFolder, String templateDir, String embeddedTemplateDir, String packageName) {
        this.apiPackage = apiPackage;
        this.outputFolder = outputFolder;
        this.templateDir = templateDir;
        this.embeddedTemplateDir = embeddedTemplateDir;
        this.packageName = packageName;
    }
}
