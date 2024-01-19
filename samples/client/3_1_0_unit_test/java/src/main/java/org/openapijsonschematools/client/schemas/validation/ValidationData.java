package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.List;

public record ValidationData(
    JsonSchema schema,
    @Nullable Object arg,
    ValidationMetadata validationMetadata,
    @Nullable List<PathToSchemasMap> containsPathToSchemas,
    @Nullable PathToSchemasMap patternPropertiesPathToSchemas,
    @Nullable PathToSchemasMap ifPathToSchemas) {
}