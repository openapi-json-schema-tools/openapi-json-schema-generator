package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

public class PatternValidator implements KeywordValidator {
    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) throws ValidationException {
        var pattern = data.schema().pattern;
        if (pattern == null) {
            return null;
        }
        if (!(data.arg() instanceof String stringArg)) {
            return null;
        }
        if (!pattern.matcher(stringArg).find()) {
            throw new ValidationException("Invalid value "+stringArg+" did not find a match for pattern "+pattern);
        }
        return null;
    }
}