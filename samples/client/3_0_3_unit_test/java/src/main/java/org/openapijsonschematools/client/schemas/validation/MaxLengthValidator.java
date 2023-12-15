package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;

public class MaxLengthValidator extends LengthValidator implements KeywordValidator {
    public final int maxLength;

    public MaxLengthValidator(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Object getConstraint() {
        return maxLength;
    }

    @Override
    public PathToSchemasMap validate(JsonSchema schema, Object arg, ValidationMetadata validationMetadata) {
        if (!(arg instanceof String)) {
            return null;
        }
        int length = getLength((String) arg);
        if (length > maxLength) {
            throw new ValidationException("Value " + arg + " is invalid because has > the maxLength of " + maxLength);
        }
        return null;
    }
}
