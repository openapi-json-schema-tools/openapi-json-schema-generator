package org.openapijsonschematools.codegen;
import io.swagger.v3.oas.models.tags.Tag;

public class CodegenTag extends Tag {
    private String moduleName = null;
    private String className = null;

    public String getModuleName() {
        return this.moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getClassName() {
        return this.className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
