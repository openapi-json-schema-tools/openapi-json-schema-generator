package org.openapijsonschematools.codegen.generators.openapimodels;

import java.util.LinkedHashMap;
import java.util.List;

public class MapBuilder {
    public final String className;
    public final LinkedHashMap<CodegenKey, MapBuilder> keyToBuilder;

    public MapBuilder(String className, LinkedHashMap<CodegenKey, MapBuilder> keyToBuilder) {
        this.className = className;
        this.keyToBuilder = keyToBuilder;
    }
}
