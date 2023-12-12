package org.openapijsonschematools.client.schemas.validation;

import java.util.List;
import java.util.Set;

public class UnsetAnyTypeJsonSchema extends JsonSchema<Object, Object, Object> {
    public UnsetAnyTypeJsonSchema() {
        super(null);
    }

    @Override
    protected Object castToAllowedTypes(Object arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
        return castToAllowedObjectTypes(arg, pathToItem, pathSet);
    }

    @Override
    protected Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
        return arg;
    }
}