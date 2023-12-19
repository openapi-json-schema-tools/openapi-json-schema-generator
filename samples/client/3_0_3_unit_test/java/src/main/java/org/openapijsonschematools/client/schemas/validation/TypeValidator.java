package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class TypeValidator implements KeywordValidator {
    public final @NonNull Set<Class<?>> type;

    public TypeValidator(Set<Class<?>> type) {
        this.type = type;
    }

    @Override
    public Object getConstraint() {
        return type;
    }

    @Override
    public PathToSchemasMap validate(JsonSchema schema, Object arg, ValidationMetadata validationMetadata) {
        Class<?> argClass;
        if (arg == null) {
            argClass = Void.class;
        } else if (arg instanceof List) {
            argClass = List.class;
        } else if (arg instanceof Map) {
            argClass = Map.class;
        } else {
            argClass = arg.getClass();
        }
        if (!type.contains(argClass)) {
            throw new ValidationException("invalid type");
        }
        return null;
    }
}
