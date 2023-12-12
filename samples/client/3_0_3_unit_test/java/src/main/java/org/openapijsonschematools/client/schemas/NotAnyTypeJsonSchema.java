package org.openapijsonschematools.client.schemas;

import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.NotValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NotAnyTypeJsonSchema extends JsonSchema<Object, Object, Object> {
    public NotAnyTypeJsonSchema() {
        super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("not", new NotValidator(AnyTypeJsonSchema.class))
        )));
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
