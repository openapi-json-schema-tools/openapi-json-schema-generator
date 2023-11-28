package org.openapijsonschematools.schemas.validation;

import org.openapijsonschematools.exceptions.ValidationException;

public class MaxLengthValidator implements KeywordValidator {
    public final int maxLength;

    public MaxItemsValidator(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Object getConstraint() {
        return maxLength;
    }

    @Override
    public PathToSchemasMap validate(Class<? extends JsonSchema> cls, Object arg, ValidationMetadata validationMetadata, Object extra) {
        if (!(arg instanceof String)) {
            return null;
        }
        if (((String) arg).length() > maxLength) {
            throw new ValidationException("Value " + arg + " is invalid because has > the maxLength of " + maxLength);
        }
        return null;
    }
}
