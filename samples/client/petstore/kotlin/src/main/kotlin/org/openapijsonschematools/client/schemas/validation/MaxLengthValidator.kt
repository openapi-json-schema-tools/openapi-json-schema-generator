package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

public class MaxLengthValidator extends LengthValidator implements KeywordValidator {
    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) throws ValidationException {
        var maxLength = data.schema().maxLength;
        if (maxLength == null) {
            return null;
        }
        if (!(data.arg() instanceof String stringArg)) {
            return null;
        }
        int length = getLength(stringArg);
        if (length > maxLength) {
            throw new ValidationException("Value " + stringArg + " is invalid because has > the maxLength of " + maxLength);
        }
        return null;
    }
}
