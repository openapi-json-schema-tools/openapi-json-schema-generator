package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;

import java.math.BigDecimal;
import java.util.Set;

public class EnumValidator implements KeywordValidator {
    public final Set<Object> enumValues;

    public EnumValidator(Set<Object> enumValues) {
        this.enumValues = enumValues;
    }

    @Override
    public Object getConstraint() {
        return enumValues;
    }

    @Override
    public PathToSchemasMap validate(JsonSchema schema, Object arg, ValidationMetadata validationMetadata) {
        if (enumValues.isEmpty()) {
            throw new ValidationException("No value can match enum because enum is empty");
        }
        if (enumValues.contains(arg)) {
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
        }
        throw new ValidationException("Invalid value "+arg+" was not one of the allowed enum "+enumValues);
    }
}
