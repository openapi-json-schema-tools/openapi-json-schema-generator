package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.ArrayList;
import java.util.List;

public interface KeywordValidator {
    @Nullable PathToSchemasMap validate(
        JsonSchema schema,
        @Nullable Object arg,
        ValidationMetadata validationMetadata,
        @Nullable List<PathToSchemasMap> containsPathToSchemas
    ) throws ValidationException;

    default List<PathToSchemasMap> getContainsPathToSchemas(
        @Nullable Object arg,
        ValidationMetadata validationMetadata
    ) {
        return new ArrayList<>();
    }
}