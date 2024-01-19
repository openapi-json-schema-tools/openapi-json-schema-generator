package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.List;

public class ExclusiveMaximumValidator implements KeywordValidator {
    public final Number exclusiveMaximum;

    public ExclusiveMaximumValidator(Number exclusiveMaximum) {
        this.exclusiveMaximum = exclusiveMaximum;
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
        String msg = "Value " + arg + " is invalid because it is >= the exclusiveMaximum of " + exclusiveMaximum;
        if (arg instanceof Integer) {
            if (((Integer) arg).compareTo(exclusiveMaximum.intValue()) > -1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (arg instanceof Long) {
            if (((Long) arg).compareTo(exclusiveMaximum.longValue()) > -1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (arg instanceof Float) {
            if (((Float) arg).compareTo(exclusiveMaximum.floatValue()) > -1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        if (arg instanceof Double) {
            if (((Double) arg).compareTo(exclusiveMaximum.doubleValue()) > -1) {
                throw new ValidationException(msg);
            }
            return null;
        }
        return null;
    }
}
