package org.openapijsonschematools.codegen.model;

import java.util.Objects;

public class CodegenKey {
    public final String name;
    public final boolean nameIsValid;
    public final String snakeCaseName;
    public final String camelCaseName;

    public CodegenKey(String name, boolean nameIsValid, String snakeCaseName, String camelCaseName) {
        this.name = name;
        this.nameIsValid = nameIsValid;
        this.snakeCaseName = snakeCaseName;
        this.camelCaseName = camelCaseName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodegenKey that = (CodegenKey) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(nameIsValid, that.nameIsValid) &&
                Objects.equals(snakeCaseName, that.snakeCaseName) &&
                Objects.equals(camelCaseName, that.camelCaseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nameIsValid, snakeCaseName, camelCaseName);
    }
}
