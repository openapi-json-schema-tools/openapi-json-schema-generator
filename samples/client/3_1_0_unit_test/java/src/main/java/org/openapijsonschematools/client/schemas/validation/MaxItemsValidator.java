package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.List;

public class MaxItemsValidator implements KeywordValidator {
    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) throws ValidationException {
        var maxItems = data.schema().maxItems;
        if (maxItems == null) {
            return null;
        }
        if (!(data.arg() instanceof List<?> listArg)) {
            return null;
        }
        if (listArg.size() > maxItems) {
            throw new ValidationException("Value " + listArg + " is invalid because has > the maxItems of " + maxItems);
        }
        return null;
    }
}
