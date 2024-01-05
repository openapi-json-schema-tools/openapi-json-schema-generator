package org.openapijsonschematools.codegen.generators.openapimodels;

import java.util.LinkedHashMap;

public class MapBuilder {
    public static class BuilderSchemaPair {
        public final MapBuilder builder;
        public final CodegenSchema schema;

        public BuilderSchemaPair(MapBuilder builder, CodegenSchema schema) {
            this.builder = builder;
            this.schema = schema;
        }
    }

    public final CodegenKey className;
    public final LinkedHashMap<CodegenKey, BuilderSchemaPair> keyToBuilder;

    public MapBuilder(CodegenKey className, LinkedHashMap<CodegenKey, BuilderSchemaPair> keyToBuilder) {
        this.className = className;
        this.keyToBuilder = keyToBuilder;
    }
}
