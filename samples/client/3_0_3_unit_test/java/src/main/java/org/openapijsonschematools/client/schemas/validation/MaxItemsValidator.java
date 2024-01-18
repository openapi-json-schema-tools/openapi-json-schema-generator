package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.List;

public class MaxItemsValidator implements KeywordValidator {
    public final int maxItems;

    public MaxItemsValidator(int maxItems) {
        this.maxItems = maxItems;
    }

    @Override
    public @Nullable PathToSchemasMap validate(
        JsonSchema schema,
        @Nullable Object arg,
        ValidationMetadata validationMetadata,
        @Nullable List<PathToSchemasMap> containsPathToSchemas,
        @Nullable PathToSchemasMap patternPropertiesPathToSchemas
    ) {
        if (!(arg instanceof List)) {
            return null;
        }
        if (((List) arg).size() > maxItems) {
            throw new ValidationException("Value " + arg + " is invalid because has > the maxItems of " + maxItems);
        }
        return null;
    }
}
