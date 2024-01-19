package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.List;

public class ExclusiveMinimumValidator implements KeywordValidator {
    public final Number exclusiveMinimum;

    public ExclusiveMinimumValidator(Number exclusiveMinimum) {
        this.exclusiveMinimum = exclusiveMinimum;
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
        String msg = "Value " + arg + " is invalid because it is <= the exclusiveMinimum of " + exclusiveMinimum;
        if (arg instanceof Integer) {
            if (((Integer) arg).compareTo(exclusiveMinimum.intValue()) < 1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (arg instanceof Long) {
            if (((Long) arg).compareTo(exclusiveMinimum.longValue()) < 1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (arg instanceof Float) {
            if (((Float) arg).compareTo(exclusiveMinimum.floatValue()) < 1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (arg instanceof Double) {
            if (((Double) arg).compareTo(exclusiveMinimum.doubleValue()) < 1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        return null;
    }
}
