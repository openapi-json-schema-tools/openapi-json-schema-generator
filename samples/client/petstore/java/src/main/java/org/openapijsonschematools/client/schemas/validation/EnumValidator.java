package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

public class EnumValidator extends BigDecimalValidator implements KeywordValidator {
    public final Set<@Nullable Object> enumValues;

    public EnumValidator(Set<@Nullable Object> enumValues) {
        this.enumValues = enumValues;
    }

    @SuppressWarnings("nullness")
    private boolean enumContainsArg(@Nullable Object arg){
        return enumValues.contains(arg);
    }

    @Override
    public @Nullable PathToSchemasMap validate(
        JsonSchema schema,
        @Nullable Object arg,
        ValidationMetadata validationMetadata,
        @Nullable List<PathToSchemasMap> containsPathToSchemas,
        @Nullable PathToSchemasMap patternPropertiesPathToSchemas,
        @Nullable PathToSchemasMap ifPathToSchemas
    ) {
        if (enumValues.isEmpty()) {
            throw new ValidationException("No value can match enum because enum is empty");
        }
        if (arg instanceof Number) {
            BigDecimal castArg = getBigDecimal((Number) arg);
            if (enumContainsArg(castArg)) {
                return null;
            }
            for (Object enumValue: enumValues) {
                if (enumValue instanceof BigDecimal && ((BigDecimal) enumValue).compareTo(castArg) == 0) {
                    return null;
                }
            }
        } else {
            if (enumContainsArg(arg)) {
                return null;
            }
        }
        throw new ValidationException("Invalid value "+arg+" was not one of the allowed enum "+enumValues);
    }
}
