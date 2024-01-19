package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

public interface KeywordValidator {
    @Nullable PathToSchemasMap validate(
        ValidationData data
    ) throws ValidationException;

    default PathToSchemasMap getIfPathToSchemas(
        @Nullable Object arg,
        ValidationMetadata validationMetadata
    ) {
        return new PathToSchemasMap();
    }
}