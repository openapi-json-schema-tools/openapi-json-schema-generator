package org.openapijsonschematools.schemas.validation;

import org.openapijsonschematools.exceptions.ValidationException;


public class MultipleOfValidator implements KeywordValidator {
    public final Number multipleOf;

    public MultipleOfValidator(Number multipleOf) {
        this.multipleOf = multipleOf;
    }

    @Override
    public Object getConstraint() {
        return multipleOf;
    }

    @Override
    public PathToSchemasMap validate(Class<? extends JsonSchema> cls, Object arg, ValidationMetadata validationMetadata, Object extra) {
        if (!(arg instanceof Number)) {
            return null;
        }
        String msg = "Value " + arg + " is invalid because it is not a multiple of " + multipleOf;
        if (arg instanceof Integer) {
            if (((Integer) arg) % maximum.intValue()) != 0) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (arg instanceof Long) {
            if (((Long) arg) % maximum.longValue()) != 0) {
                throw new ValidationException(msg);
            }
            return null;
        }
        /*
        todo improve the below logic. per the spec
        A numeric instance is valid only if division by this keyword's value results in an integer.
        */
        if (arg instanceof Float) {
            if (((Float) arg) % maximum.floatValue()) > validationMetadata.configuration.precision.floatValue()) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (arg instanceof Double) {
            if (((Double) arg) % maximum.doubleValue()) > validationMetadata.configuration.precision.doubleValue()) {
                throw new ValidationException(msg);
            }
            return null;
        }
        return null;
    }
}
