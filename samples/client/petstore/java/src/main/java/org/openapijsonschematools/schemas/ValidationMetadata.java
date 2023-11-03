package org.openapijsonschematools.schemas;

import org.openapijsonschematools.configurations.SchemaConfiguration;
import java.util.List;
import java.util.Map;
import java.util.Set;

public record ValidationMetadata(
        List<Object> pathToItem,
        SchemaConfiguration configuration,
        Map<List<Object>, Map<Class<?>, Void>> validatedPathToSchemas,
        Set<Class<?>> seenClasses
) {
}