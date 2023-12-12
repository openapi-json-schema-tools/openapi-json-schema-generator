package org.openapijsonschematools.client.schemas;

import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;

import java.util.List;
import java.util.Set;

public class AnyTypeJsonSchema extends JsonSchema<Object, Object, Object> {
    public AnyTypeJsonSchema() {
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
