package org.openapitools.codegen;

import java.util.Objects;

public class CodegenKey {
    private CodegenKey(String name, boolean isUnsafe, String snakeCaseName, String camelCaseName) {
        this.name = name;
        this.isUnsafe = isUnsafe;
        this.snakeCaseName = snakeCaseName;
        this.camelCaseName = camelCaseName;
    }

    private String name;
    private boolean isUnsafe;
    private String snakeCaseName;
    private String camelCaseName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodegenKey that = (CodegenKey) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(isUnsafe, that.isUnsafe) &&
                Objects.equals(snakeCaseName, that.snakeCaseName) &&
                Objects.equals(camelCaseName, that.camelCaseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isUnsafe, snakeCaseName, camelCaseName);
    }
}
