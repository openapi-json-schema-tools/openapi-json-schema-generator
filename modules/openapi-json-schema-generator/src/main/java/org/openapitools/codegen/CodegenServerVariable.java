package org.openapitools.codegen;

import java.util.List;
import java.util.Objects;

public class CodegenServerVariable {
    public final String name;
    public final String defaultValue;
    public final String description;
    public final List<String> enumValues;
    public final String value;

    public CodegenServerVariable(String name, String defaultValue, String description, List<String> enumValues, String value) {
        this.name = name;
        this.defaultValue = defaultValue;
        this.description = description;
        this.enumValues = enumValues;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodegenServerVariable that = (CodegenServerVariable) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(defaultValue, that.defaultValue) &&
                Objects.equals(description, that.description) &&
                Objects.equals(enumValues, that.enumValues) &&
                Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, defaultValue, description, enumValues, value);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CodegenServerVariable{");
        sb.append("name='").append(name).append('\'');
        sb.append(", defaultValue='").append(defaultValue).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", enumValues=").append(enumValues);
        sb.append(", value='").append(value).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
