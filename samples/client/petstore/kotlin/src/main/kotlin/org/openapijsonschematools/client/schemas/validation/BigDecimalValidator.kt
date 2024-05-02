package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;

import java.math.BigDecimal;

public abstract class BigDecimalValidator {
    protected BigDecimal getBigDecimal(Number arg) throws ValidationException {
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
}
