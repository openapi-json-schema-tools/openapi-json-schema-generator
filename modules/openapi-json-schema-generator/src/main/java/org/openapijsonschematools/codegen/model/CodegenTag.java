package org.openapijsonschematools.codegen.model;

import java.util.Objects;

public class CodegenTag {
    public final String name;
    public final String moduleName;
    public final String className;
    // TODO add description and other tag fields

    public CodegenTag(String name, String moduleName, String className) {
        this.name = name;
        this.moduleName = moduleName;
        this.className = className;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodegenTag that = (CodegenTag) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(moduleName, that.moduleName) &&
                Objects.equals(className, that.className);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, moduleName, className);
    }
}
