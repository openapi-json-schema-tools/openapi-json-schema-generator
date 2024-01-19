package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.List;

public class MaximumValidator implements KeywordValidator {
    public final Number maximum;

    public MaximumValidator(Number maximum) {
        this.maximum = maximum;
    }

    @Override
    public @Nullable PathToSchemasMap validate(
        JsonSchema schema,
        @Nullable Object arg,
        ValidationMetadata validationMetadata,
        @Nullable List<PathToSchemasMap> containsPathToSchemas,
        @Nullable PathToSchemasMap patternPropertiesPathToSchemas,
        @Nullable PathToSchemasMap ifPathToSchemas
    ) {
        if (!(arg instanceof Number)) {
            return null;
        }
        String msg = "Value " + arg + " is invalid because it is > the maximum of " + maximum;
        if (arg instanceof Integer) {
            if (((Integer) arg).compareTo(maximum.intValue()) == 1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (arg instanceof Long) {
            if (((Long) arg).compareTo(maximum.longValue()) == 1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (arg instanceof Float) {
            if (((Float) arg).compareTo(maximum.floatValue()) == 1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (arg instanceof Double) {
            if (((Double) arg).compareTo(maximum.doubleValue()) == 1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        return null;
    }
}
