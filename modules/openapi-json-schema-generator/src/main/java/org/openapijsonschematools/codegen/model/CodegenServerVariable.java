package org.openapijsonschematools.codegen.model;

import java.util.List;
import java.util.Objects;

public class CodegenServerVariable {
    public final String name;
    public final String defaultValue;
    public final String description;
    public final List<String> enumValues;

    public CodegenServerVariable(String name, String defaultValue, String description, List<String> enumValues) {
        this.name = name;
        this.defaultValue = defaultValue;
        this.description = description;
        this.enumValues = enumValues;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodegenServerVariable that = (CodegenServerVariable) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(defaultValue, that.defaultValue) &&
                Objects.equals(description, that.description) &&
                Objects.equals(enumValues, that.enumValues);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, defaultValue, description, enumValues);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CodegenServerVariable{");
        sb.append("name='").append(name).append('\'');
        sb.append(", defaultValue='").append(defaultValue).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", enumValues=").append(enumValues);
        sb.append('}');
        return sb.toString();
    }
}
