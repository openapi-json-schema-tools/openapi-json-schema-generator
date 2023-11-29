package org.openapijsonschematools.schemas.validation;

import org.openapijsonschematools.exceptions.ValidationException;

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
    public PathToSchemasMap validate(Class<? extends JsonSchema> cls, Object arg, ValidationMetadata validationMetadata, Object extra) {
        if (!(arg instanceof List)) {
            return null;
        }
        if (((List) arg).size() < minItems) {
            throw new ValidationException("Value " + arg + " is invalid because has < the minItems of " + minItems);
        }
        return null;
    }
}
