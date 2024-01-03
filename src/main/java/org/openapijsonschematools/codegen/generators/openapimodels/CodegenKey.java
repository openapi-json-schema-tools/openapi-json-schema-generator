package org.openapijsonschematools.codegen.generators.openapimodels;

import java.util.Objects;

public class CodegenKey implements Comparable<CodegenKey> {
    public final String original;
    public final boolean isValid;
    public final String snakeCase;
    public final String pascalCase;
    public final String camelCase;
    public final String kebabCase;

    public CodegenKey(String original, boolean isValid, String snakeCase, String pascalCase, String kebabCase, String camelCase) {
        this.original = original;
        this.isValid = isValid;
        this.snakeCase = snakeCase;
        this.pascalCase = pascalCase;
        this.kebabCase = kebabCase;
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
                Objects.equals(camelCase, that.camelCase) &&
                Objects.equals(kebabCase, that.kebabCase) &&
                Objects.equals(pascalCase, that.pascalCase);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CodegenKey{");
        sb.append("original=").append(original);
        sb.append(", isValid=").append(isValid);
        sb.append(", snakeCase=").append(snakeCase);
        sb.append(", pascalCase=").append(pascalCase);
        sb.append(", kebabCase=").append(kebabCase);
        sb.append(", camelCase=").append(camelCase);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(original, isValid, snakeCase, camelCase, kebabCase, pascalCase);
    }

    @Override
    public int compareTo(CodegenKey other) {
        return original.compareTo(other.original);
    }
}
