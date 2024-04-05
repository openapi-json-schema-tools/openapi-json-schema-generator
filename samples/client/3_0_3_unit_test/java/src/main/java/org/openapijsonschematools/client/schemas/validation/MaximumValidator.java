package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

public class MaximumValidator implements KeywordValidator {
    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) throws ValidationException {
        var maximum = data.schema().maximum;
        if (maximum == null) {
            return null;
        }
        if (!(data.arg() instanceof Number)) {
            return null;
        }
        String msg = "Value " + data.arg() + " is invalid because it is > the maximum of " + maximum;
        if (data.arg() instanceof Integer intArg) {
            if (intArg.compareTo(maximum.intValue()) > 0) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (data.arg() instanceof Long longArg) {
            if (longArg.compareTo(maximum.longValue()) > 0) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (data.arg() instanceof Float floatArg) {
            if (floatArg.compareTo(maximum.floatValue()) > 0) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (data.arg() instanceof Double doubleArg) {
            if (doubleArg.compareTo(maximum.doubleValue()) > 0) {
                throw new ValidationException(msg);
            }
            return null;
        }
        return null;
    }
}