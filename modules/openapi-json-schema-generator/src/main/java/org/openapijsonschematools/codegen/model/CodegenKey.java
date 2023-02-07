package org.openapijsonschematools.codegen.model;

import java.util.Objects;

public class CodegenKey {
    public final String name;
    public final boolean isValid;
    public final String snakeCase;
    public final String camelCaseName;

    public CodegenKey(String name, boolean isValid, String snakeCase, String camelCaseName) {
        this.name = name;
        this.isValid = isValid;
        this.snakeCase = snakeCase;
        this.camelCaseName = camelCaseName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodegenKey that = (CodegenKey) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(isValid, that.isValid) &&
                Objects.equals(snakeCase, that.snakeCase) &&
                Objects.equals(camelCaseName, that.camelCaseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isValid, snakeCase, camelCaseName);
    }
}
