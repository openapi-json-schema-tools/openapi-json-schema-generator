package org.openapijsonschematools.schemas.validation;

import org.openapijsonschematools.exceptions.ValidationException;


public class MinimumValidator implements KeywordValidator {
    public final Number minimum;

    public MinimumValidator(Number minimum) {
        this.maximum = minimum;
    }

    @Override
    public Object getConstraint() {
        return minimum;
    }

    @Override
    public PathToSchemasMap validate(Class<? extends JsonSchema> cls, Object arg, ValidationMetadata validationMetadata, Object extra) {
        if (!(arg instanceof Number)) {
            return null;
        }
        String msg = "Value " + arg + " is invalid because it is < the minimum of " + minimum;
        if (arg instanceof Integer) {
            if (((Integer) arg).compareTo(maximum.intValue()) == -1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (arg instanceof Long) {
            if (((Long) arg).compareTo(maximum.longValue()) == -1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (arg instanceof Float) {
            if (((Float) arg).compareTo(maximum.floatValue()) == -1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (arg instanceof Double) {
            if (((Double) arg).compareTo(maximum.doubleValue()) == -1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        return null;
    }
}
