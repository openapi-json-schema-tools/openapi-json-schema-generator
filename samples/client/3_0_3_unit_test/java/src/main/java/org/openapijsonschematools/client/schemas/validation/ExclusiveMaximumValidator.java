package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

public class ExclusiveMaximumValidator implements KeywordValidator {
    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) throws ValidationException {
        var exclusiveMaximum = data.schema().exclusiveMaximum;
        if (exclusiveMaximum == null) {
            return null;
        }
        if (!(data.arg() instanceof Number)) {
            return null;
        }
        String msg = "Value " + data.arg() + " is invalid because it is >= the exclusiveMaximum of " + exclusiveMaximum;
        if (data.arg() instanceof Integer intArg) {
            if (intArg.compareTo(exclusiveMaximum.intValue()) > -1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (data.arg() instanceof Long longArg) {
            if (longArg.compareTo(exclusiveMaximum.longValue()) > -1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (data.arg() instanceof Float floatArg) {
            if (floatArg.compareTo(exclusiveMaximum.floatValue()) > -1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (data.arg() instanceof Double doubleArg) {
            if (doubleArg.compareTo(exclusiveMaximum.doubleValue()) > -1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        return null;
    }
}
