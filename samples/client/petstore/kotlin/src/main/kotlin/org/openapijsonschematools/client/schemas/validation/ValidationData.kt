package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.List;

public record ValidationData(
    JsonSchema<?> schema,
    @Nullable Object arg,
    ValidationMetadata validationMetadata,
    @Nullable List<PathToSchemasMap> containsPathToSchemas,
    @Nullable PathToSchemasMap patternPropertiesPathToSchemas,
    @Nullable PathToSchemasMap ifPathToSchemas,
    @Nullable PathToSchemasMap knownPathToSchemas
) {
    public ValidationData(
            JsonSchema<?> schema,
            @Nullable Object arg,
            ValidationMetadata validationMetadata
    ) {
        this(schema, arg, validationMetadata, null, null, null, null);
    }
}