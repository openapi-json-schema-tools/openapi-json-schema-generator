package org.openapitools.codegen;

import java.util.Objects;

public class CodegenKey {
    public CodegenKey(String name, boolean nameIsValid, String snakeCaseName, String camelCaseName) {
        this.name = name;
        this.nameIsValid = nameIsValid;
        this.snakeCaseName = snakeCaseName;
        this.camelCaseName = camelCaseName;
    }

    private String name;
    private boolean nameIsValid;
    private String snakeCaseName;
    private String camelCaseName;

    public String getName() { return name; }
    public boolean getNameIsValid() { return nameIsValid; }
    public String getSnakeCaseName() { return snakeCaseName; }
    public String getCamelCaseName() { return camelCaseName; }

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
