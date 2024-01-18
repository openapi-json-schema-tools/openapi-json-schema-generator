package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.List;
import java.util.Map;

public class MinPropertiesValidator implements KeywordValidator {
    public final int minProperties;

    public MinPropertiesValidator(int minProperties) {
        this.minProperties = minProperties;
    }

    @Override
    public @Nullable PathToSchemasMap validate(
        JsonSchema schema,
        @Nullable Object arg,
        ValidationMetadata validationMetadata,
        @Nullable List<PathToSchemasMap> containsPathToSchemas,
        @Nullable PathToSchemasMap patternPropertiesPathToSchemas
    ) {
        if (!(arg instanceof Map)) {
            return null;
        }
        if (((Map) arg).size() < minProperties) {
            throw new ValidationException("Value " + arg + " is invalid because has < the minProperties of " + minProperties);
        }
        return null;
    }
}
