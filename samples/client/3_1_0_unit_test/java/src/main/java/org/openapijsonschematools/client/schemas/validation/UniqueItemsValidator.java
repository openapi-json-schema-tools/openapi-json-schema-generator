package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueItemsValidator implements KeywordValidator {
    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) throws ValidationException {
        var uniqueItems = data.schema().uniqueItems;
        if (uniqueItems == null) {
            return null;
        }
        if (!(data.arg() instanceof List<?> listArg)) {
            return null;
        }
        if (!uniqueItems) {
            return null;
        }
        Set<@Nullable Object> seenItems = new HashSet<>();
        for (@Nullable Object item: listArg) {
            int startingSeenItemsSize = seenItems.size();
            seenItems.add(item);
            if (seenItems.size() == startingSeenItemsSize) {
                throw new ValidationException("Invalid list value, list contains duplicate items when uniqueItems is true");
            }
        }
        return null;
    }
}
