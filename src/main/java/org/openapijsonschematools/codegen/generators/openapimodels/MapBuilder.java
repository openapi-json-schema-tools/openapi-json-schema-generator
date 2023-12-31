package org.openapijsonschematools.codegen.generators.openapimodels;

import java.util.LinkedHashMap;

public class MapBuilder {
    public final String className;
    public final LinkedHashMap<CodegenKey, MapBuilder> keyToBuilder;
    boolean isFirstBuilder;

    public MapBuilder(String className, LinkedHashMap<CodegenKey, MapBuilder> keyToBuilder, boolean isFirstBuilder) {
        this.className = className;
        this.keyToBuilder = keyToBuilder;
        this.isFirstBuilder = isFirstBuilder;
    }
}
