package org.openapijsonschematools.codegen.model;

import java.util.Objects;

public class CodegenKey {
    public final String original;
    public final boolean isValid;
    public final String snakeCase;
    public final String camelCase;

    public CodegenKey(String original, boolean isValid, String snakeCase, String camelCase) {
        this.original = original;
        this.isValid = isValid;
        this.snakeCase = snakeCase;
        this.camelCase = camelCase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodegenKey that = (CodegenKey) o;
        return Objects.equals(original, that.original) &&
                Objects.equals(isValid, that.isValid) &&
                Objects.equals(snakeCase, that.snakeCase) &&
                Objects.equals(camelCase, that.camelCase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(original, isValid, snakeCase, camelCase);
    }
}
