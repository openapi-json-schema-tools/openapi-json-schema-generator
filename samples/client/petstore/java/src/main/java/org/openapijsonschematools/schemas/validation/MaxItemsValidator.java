package org.openapijsonschematools.schemas.validation;

import org.openapijsonschematools.exceptions.ValidationException;

public class MaxItemsValidator implements KeywordValidator {
    public final int maxItems;

    public MaxItemsValidator(int maxItems) {
        this.maxItems = maxItems;
    }

    @Override
    public Object getConstraint() {
        return maxItems;
    }

    @Override
    public PathToSchemasMap validate(Class<? extends JsonSchema> cls, Object arg, ValidationMetadata validationMetadata, Object extra) {
        if (!(arg instanceof List)) {
            return null;
        }
        if (((List) arg).size() > maxItems) {
            throw new ValidationException("Value " + arg + " is invalid because has > the maxItems of " + maxItems);
        }
        return null;
    }
}
