package org.openapijsonschematools.schemas.validation;

import org.openapijsonschematools.exceptions.ValidationException;


public class MaximumValidator implements KeywordValidator {
    public final Number maximum;

    public MaximumValidator(Number maximum) {
        this.maximum = maximum;
    }

    @Override
    public Object getConstraint() {
        return maximum;
    }

    @Override
    public PathToSchemasMap validate(Class<? extends JsonSchema> cls, Object arg, ValidationMetadata validationMetadata, Object extra) {
        if (!(arg instanceof Number)) {
            return null;
        }
        String msg = "Value " + arg + " is invalid because it is > the maximum of " + maximum;
        if (arg instanceof Integer) {
            if (((Integer) arg).compareTo(maximum.intValue()) == 1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (arg instanceof Long) {
            if (((Long) arg).compareTo(maximum.longValue()) == 1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (arg instanceof Float) {
            if (((Float) arg).compareTo(maximum.floatValue()) == 1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (arg instanceof Double) {
            if (((Double) arg).compareTo(maximum.doubleValue()) == 1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        return null;
    }
}