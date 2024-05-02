package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.math.BigDecimal;
import java.util.Objects;

public class ConstValidator extends BigDecimalValidator implements KeywordValidator {
    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) throws ValidationException {
        if (!data.schema().constValueSet) {
            return null;
        }
        var constValue = data.schema().constValue;
        if (data.arg() instanceof Number numberArg) {
            BigDecimal castArg = getBigDecimal(numberArg);
            if (Objects.equals(castArg, constValue)) {
                return null;
            }
            if (constValue instanceof BigDecimal && ((BigDecimal) constValue).compareTo(castArg) == 0) {
                return null;
            }
        } else {
            if (Objects.equals(data.arg(), constValue)) {
                return null;
            }
        }
        throw new ValidationException("Invalid value "+data.arg()+" was not equal to const "+constValue);
    }
}