package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.math.BigDecimal;

public class MultipleOfValidator extends BigDecimalValidator implements KeywordValidator {
    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) throws ValidationException {
        var multipleOf = data.schema().multipleOf;
        if (multipleOf == null) {
            return null;
        }
        if (!(data.arg() instanceof Number numberArg)) {
            return null;
        }
        BigDecimal castArg = getBigDecimal(numberArg);
        String msg = "Value " + numberArg + " is invalid because it is not a multiple of " + multipleOf;
        if (castArg.remainder(multipleOf).compareTo(BigDecimal.ZERO) != 0) {
            throw new ValidationException(msg);
        }
        return null;
    }
}