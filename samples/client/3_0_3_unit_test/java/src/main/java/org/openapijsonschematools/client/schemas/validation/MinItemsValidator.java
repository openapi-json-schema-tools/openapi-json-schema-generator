package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.List;

public class MinItemsValidator implements KeywordValidator {
    public final int minItems;

    public MinItemsValidator(int minItems) {
        this.minItems = minItems;
    }

    @Override
    public Object getConstraint() {
        return minItems;
    }

    @Override
    public PathToSchemasMap validate(JsonSchema schema, @Nullable Object arg, ValidationMetadata validationMetadata) {
        if (!(arg instanceof List)) {
            return null;
        }
        if (((List) arg).size() < minItems) {
            throw new ValidationException("Value " + arg + " is invalid because has < the minItems of " + minItems);
        }
        return null;
    }
}
