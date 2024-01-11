package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class TypeValidator implements KeywordValidator {
    public final Set<Class<?>> type;

    public TypeValidator(Set<Class<?>> type) {
        this.type = type;
    }

    @Override
    public @Nullable PathToSchemasMap validate(
        JsonSchema schema,
        @Nullable Object arg,
        ValidationMetadata validationMetadata,
        List<PathToSchemasMap> containsPathToSchemas
    ) {
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
