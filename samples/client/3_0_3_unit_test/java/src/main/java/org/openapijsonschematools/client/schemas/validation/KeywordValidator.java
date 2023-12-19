package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

public interface KeywordValidator {
    PathToSchemasMap validate(
            JsonSchema schema,
            @Nullable Object arg,
            ValidationMetadata validationMetadata) throws ValidationException;

    Object getConstraint();
}