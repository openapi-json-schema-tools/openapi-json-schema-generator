package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

public class ExclusiveMinimumValidator implements KeywordValidator {
    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) throws ValidationException {
        var exclusiveMinimum = data.schema().exclusiveMinimum;
        if (exclusiveMinimum == null) {
            return null;
        }
        if (!(data.arg() instanceof Number)) {
            return null;
        }
        String msg = "Value " + data.arg() + " is invalid because it is <= the exclusiveMinimum of " + exclusiveMinimum;
        if (data.arg() instanceof Integer intArg) {
            if (intArg.compareTo(exclusiveMinimum.intValue()) < 1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (data.arg() instanceof Long longArg) {
            if (longArg.compareTo(exclusiveMinimum.longValue()) < 1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (data.arg() instanceof Float floatArg) {
            if (floatArg.compareTo(exclusiveMinimum.floatValue()) < 1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (data.arg() instanceof Double doubleArg) {
            if (doubleArg.compareTo(exclusiveMinimum.doubleValue()) < 1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        return null;
    }
}
