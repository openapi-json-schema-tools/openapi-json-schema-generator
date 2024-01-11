package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.List;

public class MaxLengthValidator extends LengthValidator implements KeywordValidator {
    public final int maxLength;

    public MaxLengthValidator(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public @Nullable PathToSchemasMap validate(
        JsonSchema schema,
        @Nullable Object arg,
        ValidationMetadata validationMetadata,
        List<PathToSchemasMap> containsPathToSchemas
    ) {
        if (!(arg instanceof String)) {
            return null;
        }
        int length = getLength((String) arg);
        if (length > maxLength) {
            throw new ValidationException("Value " + arg + " is invalid because has > the maxLength of " + maxLength);
        }
        return null;
    }
}
