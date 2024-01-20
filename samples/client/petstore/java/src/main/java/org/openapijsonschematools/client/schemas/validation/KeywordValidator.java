package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

@FunctionalInterface
public interface KeywordValidator {
    @Nullable PathToSchemasMap validate(
        ValidationData data
    ) throws ValidationException;
}