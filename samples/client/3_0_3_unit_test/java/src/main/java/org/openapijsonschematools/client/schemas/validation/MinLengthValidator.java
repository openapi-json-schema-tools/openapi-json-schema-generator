package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;

public class MinLengthValidator extends LengthValidator implements KeywordValidator {
    public final int minLength;

    public MinLengthValidator(int minLength) {
        this.minLength = minLength;
    }

    @Override
    public Object getConstraint() {
        return minLength;
    }

    @Override
    public PathToSchemasMap validate(JsonSchema schema, Object arg, ValidationMetadata validationMetadata, Object extra) {
        if (!(arg instanceof String)) {
            return null;
        }
        int length = getLength((String) arg);
        if (length < minLength) {
            throw new ValidationException("Value " + arg + " is invalid because has < the minLength of " + minLength);
        }
        return null;
    }
}
