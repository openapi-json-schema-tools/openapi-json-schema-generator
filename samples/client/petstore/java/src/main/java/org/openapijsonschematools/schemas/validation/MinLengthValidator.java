package org.openapijsonschematools.schemas.validation;

import org.openapijsonschematools.exceptions.ValidationException;

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
    public PathToSchemasMap validate(Class<? extends JsonSchema> cls, Object arg, ValidationMetadata validationMetadata, Object extra) {
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
