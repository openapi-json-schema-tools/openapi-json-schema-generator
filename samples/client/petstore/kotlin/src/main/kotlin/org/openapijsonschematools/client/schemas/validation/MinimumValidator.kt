package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

public class MinimumValidator implements KeywordValidator {
    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) throws ValidationException {
        var minimum = data.schema().minimum;
        if (minimum == null) {
            return null;
        }
        if (!(data.arg() instanceof Number)) {
            return null;
        }
        String msg = "Value " + data.arg() + " is invalid because it is < the minimum of " + minimum;
        if (data.arg() instanceof Integer intArg) {
            if (intArg.compareTo(minimum.intValue()) < 0) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (data.arg() instanceof Long longArg) {
            if (longArg.compareTo(minimum.longValue()) < 0) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (data.arg() instanceof Float floatArg) {
            if (floatArg.compareTo(minimum.floatValue()) < 0) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (data.arg() instanceof Double doubleArg) {
            if (doubleArg.compareTo(minimum.doubleValue()) < 0) {
                throw new ValidationException(msg);
            }
            return null;
        }
        return null;
    }
}
