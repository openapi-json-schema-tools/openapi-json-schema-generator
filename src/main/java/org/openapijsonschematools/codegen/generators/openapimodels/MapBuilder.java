package org.openapijsonschematools.codegen.generators.openapimodels;

import java.util.List;

public class MapBuilder {
    public final String className;
    public final List<CodegenSchema> setterSchemas;
    public final MapBuilder nextBuilder;

    public MapBuilder(String className, List<CodegenSchema> setterSchemas, MapBuilder nextBuilder) {
        this.className = className;
        this.setterSchemas = setterSchemas;
        this.nextBuilder = nextBuilder;
    }
}
