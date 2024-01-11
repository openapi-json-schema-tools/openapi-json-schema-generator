package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class ConstValidator extends BigDecimalValidator implements KeywordValidator {
    public final @Nullable Object constValue;

    public ConstValidator(@Nullable Object constValue) {
        this.constValue = constValue;
    }

    @Override
    public @Nullable PathToSchemasMap validate(
        JsonSchema schema,
        @Nullable Object arg,
        ValidationMetadata validationMetadata,
        List<PathToSchemasMap> containsPathToSchemas
    ) {
        if (arg instanceof Number) {
            BigDecimal castArg = getBigDecimal((Number) arg);
            if (Objects.equals(castArg, constValue)) {
                return null;
            }
            if (constValue instanceof BigDecimal && ((BigDecimal) constValue).compareTo(castArg) == 0) {
                return null;
            }
        } else {
            if (Objects.equals(arg, constValue)) {
                return null;
            }
        }
        throw new ValidationException("Invalid value "+arg+" was not equal to const "+constValue);
    }
}
