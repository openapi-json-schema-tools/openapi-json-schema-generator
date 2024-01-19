package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.regex.Pattern;

public class PatternValidator implements KeywordValidator {
    public final Pattern pattern;

    public PatternValidator(Pattern pattern) {
        this.pattern = pattern;
    }

    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) {
        if (!(data.arg() instanceof String stringArg)) {
            return null;
        }
        if (!pattern.matcher(stringArg).find()) {
            throw new ValidationException("Invalid value "+stringArg+" did not find a match for pattern "+pattern);
        }
        return null;
    }
}
