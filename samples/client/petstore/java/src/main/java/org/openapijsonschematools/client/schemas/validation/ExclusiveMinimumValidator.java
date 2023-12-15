package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;


public class ExclusiveMinimumValidator implements KeywordValidator {
    public final Number exclusiveMinimum;

    public ExclusiveMinimumValidator(Number exclusiveMinimum) {
        this.exclusiveMinimum = exclusiveMinimum;
    }

    @Override
    public Object getConstraint() {
        return exclusiveMinimum;
    }

    @Override
    public PathToSchemasMap validate(JsonSchema schema, Object arg, ValidationMetadata validationMetadata) {
        if (!(arg instanceof Number)) {
            return null;
        }
        String msg = "Value " + arg + " is invalid because it is <= the exclusiveMinimum of " + exclusiveMinimum;
        if (arg instanceof Integer) {
            if (((Integer) arg).compareTo(exclusiveMinimum.intValue()) < 1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (arg instanceof Long) {
            if (((Long) arg).compareTo(exclusiveMinimum.longValue()) < 1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (arg instanceof Float) {
            if (((Float) arg).compareTo(exclusiveMinimum.floatValue()) < 1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (arg instanceof Double) {
            if (((Double) arg).compareTo(exclusiveMinimum.doubleValue()) < 1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        return null;
    }
}
