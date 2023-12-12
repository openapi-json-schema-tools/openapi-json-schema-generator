package org.openapijsonschematools.client.schemas;

import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BooleanJsonSchema extends JsonSchema<Boolean, Boolean, Boolean> {
    public BooleanJsonSchema() {
        super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(Boolean.class)))
        )));
    }

    @Override
    protected Boolean castToAllowedTypes(Boolean arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
        return castToAllowedBooleanTypes(arg, pathToItem, pathSet);
    }

    @Override
    protected Boolean getNewInstance(Boolean arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
        return arg;
    }
}