package org.openapijsonschematools.codegen.model;
import io.swagger.v3.oas.models.tags.Tag;

import java.util.Objects;

public class CodegenTag extends Tag {
    public final String name;
    public final String moduleName;
    public final String className;

    public CodegenTag(String name, String moduleName, String className) {
        this.name = name;
        this.moduleName = moduleName;
        this.className = className;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, moduleName, className);
    }
}
