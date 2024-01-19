package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

public class MinLengthValidator extends LengthValidator implements KeywordValidator {
    public final int minLength;

    public MinLengthValidator(int minLength) {
        this.minLength = minLength;
    }

    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) {
        if (!(data.arg() instanceof String stringArg)) {
            return null;
        }
        int length = getLength(stringArg);
        if (length < minLength) {
            throw new ValidationException("Value " + stringArg + " is invalid because has < the minLength of " + minLength);
        }
        return null;
    }
}
