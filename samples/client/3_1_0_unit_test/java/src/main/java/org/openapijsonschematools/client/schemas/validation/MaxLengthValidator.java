package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

public class MaxLengthValidator extends LengthValidator implements KeywordValidator {
    public final int maxLength;

    public MaxLengthValidator(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) {
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
