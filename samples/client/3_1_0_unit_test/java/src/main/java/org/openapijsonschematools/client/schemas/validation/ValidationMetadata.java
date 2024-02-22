package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;
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

    public boolean validationRanEarlier(JsonSchema<?> schema) {
        @Nullable Map<JsonSchema<?>, Void> validatedSchemas = validatedPathToSchemas.get(pathToItem);
        if (validatedSchemas != null && validatedSchemas.containsKey(schema)) {
            return true;
        }
        if (seenClasses.contains(schema)) {
            return true;
        }
        return false;
    }
}