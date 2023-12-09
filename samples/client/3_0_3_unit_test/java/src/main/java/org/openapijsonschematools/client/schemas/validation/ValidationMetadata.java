package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import java.util.List;
import java.util.Map;
import java.util.Set;

public record ValidationMetadata(
        List<Object> pathToItem,
        SchemaConfiguration configuration,
        PathToSchemasMap validatedPathToSchemas,
        Set<Class<?>> seenClasses
) {

    public boolean validationRanEarlier(JsonSchema<?, ?, ?, ?, ?> schema) {
        Map<JsonSchema<?, ?, ?, ?, ?>, Void> validatedSchemas = validatedPathToSchemas.getOrDefault(pathToItem, null);
        if (validatedSchemas != null && validatedSchemas.containsKey(schema)) {
            return true;
        }
        if (seenClasses.contains(schema)) {
            return true;
        }
        return false;
    }
}