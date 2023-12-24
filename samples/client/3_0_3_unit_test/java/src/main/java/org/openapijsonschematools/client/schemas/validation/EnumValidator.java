package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.math.BigDecimal;
import java.util.Set;

public class EnumValidator implements KeywordValidator {
    public final Set<@Nullable Object> enumValues;

    public EnumValidator(Set<@Nullable Object> enumValues) {
        this.enumValues = enumValues;
    }

    @SuppressWarnings("nullness")
    private boolean enumContainsArg(@Nullable Object arg){
        return enumValues.contains(arg);
    }

    @Override
    public @Nullable PathToSchemasMap validate(JsonSchema schema, @Nullable Object arg, ValidationMetadata validationMetadata) {
        if (enumValues.isEmpty()) {
            throw new ValidationException("No value can match enum because enum is empty");
        }
        if (enumContainsArg(arg)) {
            return null;
        }
        if (arg instanceof Float) {
            BigDecimal castArg = BigDecimal.valueOf((Float) arg);
            boolean hasIntValue = castArg.stripTrailingZeros().scale() <= 0;
            if (hasIntValue && enumValues.contains(castArg.intValue())) {
                return null;
            }
        } else if (arg instanceof Double) {
            BigDecimal castArg = new BigDecimal(String.valueOf(arg));
            boolean hasIntValue = castArg.stripTrailingZeros().scale() <= 0;
            if (hasIntValue && enumValues.contains(castArg.intValue())) {
                return null;
            }
        } else if (arg instanceof Long && (Long) arg <= 2147483647L && (Long) arg >= -2147483648L) {
            int castArg = Integer.valueOf(arg.toString());
            if (enumValues.contains(castArg)) {
                return null;
            }
        }
        throw new ValidationException("Invalid value "+arg+" was not one of the allowed enum "+enumValues);
    }
}
