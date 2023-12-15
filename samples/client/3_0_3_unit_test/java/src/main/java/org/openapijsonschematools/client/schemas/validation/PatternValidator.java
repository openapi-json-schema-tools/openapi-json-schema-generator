package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.regex.Pattern;

public class PatternValidator implements KeywordValidator {
    public final Pattern pattern;

    public PatternValidator(Pattern pattern) {
        this.pattern = pattern;
    }

    @Override
    public Object getConstraint() {
        return pattern;
    }

    @Override
    public PathToSchemasMap validate(JsonSchema schema, Object arg, ValidationMetadata validationMetadata, Object extra) {
        if (!(arg instanceof String)) {
            return null;
        }
        if (!pattern.matcher((String) arg).find()) {
            throw new ValidationException("Invalid value "+arg+" did not find a match for pattern "+pattern);
        }
        return null;
    }
}
