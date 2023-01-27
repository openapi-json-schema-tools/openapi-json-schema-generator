package org.openapijsonschematools.codegen.model;
import io.swagger.v3.oas.models.tags.Tag;

public class CodegenTag extends Tag {
    public final String name;
    public final String moduleName;
    public final String className;

    public CodegenTag(String name, String moduleName, String className) {
        this.name = name;
        this.moduleName = moduleName;
        this.className = className;
    }
}
