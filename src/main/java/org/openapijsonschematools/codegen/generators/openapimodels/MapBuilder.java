package org.openapijsonschematools.codegen.generators.openapimodels;

import java.util.LinkedHashMap;

public class MapBuilder<T> {
    public static class BuilderPropertyPair<T> {
        public final MapBuilder<T> builder;
        public final T property;

        public BuilderPropertyPair(MapBuilder<T> builder, T property) {
            this.builder = builder;
            this.property = property;
        }
    }

    public final CodegenKey className;
    public final LinkedHashMap<CodegenKey, BuilderPropertyPair<T>> keyToBuilder;

    public MapBuilder(CodegenKey className, LinkedHashMap<CodegenKey, BuilderPropertyPair<T>> keyToBuilder) {
        this.className = className;
        this.keyToBuilder = keyToBuilder;
    }
}
