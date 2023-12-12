package org.openapijsonschematools.client.schemas;

import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

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
