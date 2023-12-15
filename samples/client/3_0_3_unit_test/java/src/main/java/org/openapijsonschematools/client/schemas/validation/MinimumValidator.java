package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;


public class MinimumValidator implements KeywordValidator {
    public final Number minimum;

    public MinimumValidator(Number minimum) {
        this.minimum = minimum;
    }

    @Override
    public Object getConstraint() {
        return minimum;
    }

    @Override
    public PathToSchemasMap validate(JsonSchema schema, Object arg, ValidationMetadata validationMetadata) {
        if (!(arg instanceof Number)) {
            return null;
        }
        String msg = "Value " + arg + " is invalid because it is < the minimum of " + minimum;
        if (arg instanceof Integer) {
            if (((Integer) arg).compareTo(minimum.intValue()) == -1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (arg instanceof Long) {
            if (((Long) arg).compareTo(minimum.longValue()) == -1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (arg instanceof Float) {
            if (((Float) arg).compareTo(minimum.floatValue()) == -1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (arg instanceof Double) {
            if (((Double) arg).compareTo(minimum.doubleValue()) == -1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        return null;
    }
}
