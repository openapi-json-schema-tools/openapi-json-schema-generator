package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.List;
import java.util.Map;

public class TypeValidator implements KeywordValidator {
    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) throws ValidationException {
        var type = data.schema().type;
        if (type == null) {
            return null;
        }
        Class<?> argClass;
        var arg = data.arg();
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
