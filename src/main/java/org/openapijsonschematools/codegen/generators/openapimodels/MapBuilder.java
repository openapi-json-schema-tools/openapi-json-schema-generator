package org.openapijsonschematools.codegen.generators.openapimodels;

import java.util.LinkedHashMap;

public class MapBuilder<T> {
    public static class BuilderSchemaPair<T> {
        public final MapBuilder<T> builder;
        public final T schema;

        public BuilderSchemaPair(MapBuilder<T> builder, T schema) {
            this.builder = builder;
            this.schema = schema;
        }
    }

    public final CodegenKey className;
    public final LinkedHashMap<CodegenKey, BuilderSchemaPair<T>> keyToBuilder;

    public MapBuilder(CodegenKey className, LinkedHashMap<CodegenKey, BuilderSchemaPair<T>> keyToBuilder) {
        this.className = className;
        this.keyToBuilder = keyToBuilder;
    }
}
