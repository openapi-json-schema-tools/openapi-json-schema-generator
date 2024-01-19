package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.List;

public class MinItemsValidator implements KeywordValidator {
    public final int minItems;

    public MinItemsValidator(int minItems) {
        this.minItems = minItems;
    }

    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) {
        if (!(data.arg() instanceof List<?> listArg)) {
            return null;
        }
        if (listArg.size() < minItems) {
            throw new ValidationException("Value " + listArg + " is invalid because has < the minItems of " + minItems);
        }
        return null;
    }
}
