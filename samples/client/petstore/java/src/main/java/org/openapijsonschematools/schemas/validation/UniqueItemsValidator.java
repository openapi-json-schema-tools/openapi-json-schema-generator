package org.openapijsonschematools.schemas.validation;

import org.openapijsonschematools.exceptions.ValidationException;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueItemsValidator implements KeywordValidator {
    public final boolean uniqueItems;

    public UniqueItemsValidator(boolean uniqueItems) {
        this.uniqueItems = uniqueItems;
    }

    @Override
    public Object getConstraint() {
        return true;
    }

    @Override
    public PathToSchemasMap validate(Class<? extends JsonSchema> cls, Object arg, ValidationMetadata validationMetadata, Object extra) {
        if (!(arg instanceof List)) {
            return null;
        }
        if (!uniqueItems) {
            return null;
        }
        Set<Object> seenItems = new HashSet<>();
        for (Object item: (List<?>) arg) {
            int startingSeenItemsSize = seenItems.size();
            seenItems.add(item);
            if (seenItems.size() == startingSeenItemsSize) {
                throw new ValidationException("Invalid list value, list contains duplicate items when uniqueItems is true");
            }
        }
        return null;
    }
}