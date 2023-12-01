package org.openapijsonschematools.schemas.validation;

import org.openapijsonschematools.exceptions.ValidationException;

import java.math.BigDecimal;

public class MultipleOfValidator implements KeywordValidator {
    public final BigDecimal multipleOf;

    public MultipleOfValidator(Number multipleOf) {
        this.multipleOf = getBigDecimal(multipleOf);
    }

    @Override
    public Object getConstraint() {
        return multipleOf;
    }

    private BigDecimal getBigDecimal(Number arg) {
        if (arg instanceof Integer) {
            return new BigDecimal((Integer) arg);
        } else if (arg instanceof Long) {
            return new BigDecimal((Long) arg);
        } else if (arg instanceof Float) {
            return new BigDecimal(Float.toString((Float) arg));
        } else if (arg instanceof  Double) {
            return new BigDecimal(Double.toString((Double) arg));
        } else {
            throw new ValidationException("Invalid type input for arg");
        }
    }

    @Override
    public PathToSchemasMap validate(Class<? extends JsonSchema> cls, Object arg, ValidationMetadata validationMetadata, Object extra) {
        if (!(arg instanceof Number)) {
            return null;
        }
        BigDecimal castArg = getBigDecimal((Number) arg);
        String msg = "Value " + arg + " is invalid because it is not a multiple of " + multipleOf;
        if (castArg.remainder(multipleOf).compareTo(BigDecimal.ZERO) != 0) {
            throw new ValidationException(msg);
        }
        return null;
    }
}
