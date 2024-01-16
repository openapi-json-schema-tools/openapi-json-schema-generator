package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Map;

public class PropertyNamesValidator implements KeywordValidator {
    public final Class<? extends JsonSchema> propertyNames;

    public PropertyNamesValidator(Class<? extends JsonSchema> propertyNames) {
        this.propertyNames = propertyNames;
    }

    @Override
    public @Nullable PathToSchemasMap validate(
        JsonSchema schema,
        @Nullable Object arg,
        ValidationMetadata validationMetadata,
        @Nullable List<PathToSchemasMap> containsPathToSchemas
    ) {
        if (!(arg instanceof Map)) {
            return null;
        }
        PathToSchemasMap pathToSchemas = new PathToSchemasMap();
        // todo add implementation
        return pathToSchemas;
    }
}
