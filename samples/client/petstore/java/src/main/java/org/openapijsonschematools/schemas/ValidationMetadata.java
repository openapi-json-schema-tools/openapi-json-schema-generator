package org.openapijsonschematools.schemas;

import org.openapijsonschematools.configurations.SchemaConfiguration;
import java.util.List;
import java.util.Map;
import java.util.Set;

public record ValidationMetadata(
        List<Object> pathToItem,
        SchemaConfiguration configuration,
        PathToSchemasMap validatedPathToSchemas,
        Set<Class<?>> seenClasses
) {

    protected boolean validationRanEarlier(Class<?> cls) {
        Map<Class<?>, Void> validatedSchemas = validatedPathToSchemas.getOrDefault(pathToItem, null);
        if (validatedSchemas != null && validatedSchemas.containsKey(cls)) {
            return true;
        }
        if (seenClasses.contains(cls)) {
            return true;
        }
        return false;
    }

}