package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.math.BigDecimal;

public class MultipleOfValidator extends BigDecimalValidator implements KeywordValidator {
    public final BigDecimal multipleOf;

    public MultipleOfValidator(BigDecimal multipleOf) {
        this.multipleOf = multipleOf;
    }

    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) {
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
