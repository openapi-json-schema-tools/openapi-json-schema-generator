package org.openapijsonschematools.codegen.model;

import java.util.Objects;

public class PairCacheKey {
    public PairCacheKey(String sourceJsonPath, String currentJsonPath) {
        this.sourceJsonPath = sourceJsonPath;
        this.currentJsonPath = currentJsonPath;
    }

    private final String sourceJsonPath;
    private final String currentJsonPath;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PairCacheKey that = (PairCacheKey) o;
        return Objects.equals(sourceJsonPath, that.sourceJsonPath) &&
                Objects.equals(currentJsonPath, that.currentJsonPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceJsonPath, currentJsonPath);
    }
}
