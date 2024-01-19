package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.ArrayList;
import java.util.List;

public interface KeywordValidator {
    @Nullable PathToSchemasMap validate(
        ValidationData data
    ) throws ValidationException;

    default List<PathToSchemasMap> getContainsPathToSchemas(
        @Nullable Object arg,
        ValidationMetadata validationMetadata
    ) {
        return new ArrayList<>();
    }

    default PathToSchemasMap getPatternPropertiesPathToSchemas(
        @Nullable Object arg,
        ValidationMetadata validationMetadata
    ) {
        return new PathToSchemasMap();
    }

    default PathToSchemasMap getIfPathToSchemas(
        @Nullable Object arg,
        ValidationMetadata validationMetadata
    ) {
        return new PathToSchemasMap();
    }
}