package org.openapijsonschematools.schemas.validation;

import org.openapijsonschematools.exceptions.ValidationException;

import java.util.Set;

public class TypeValidator implements KeywordValidator {
    public final Set<Class<?>> type;

    public TypeValidator(Set<Class<?>> type) {
        this.type = type;
    }

    @Override
    public Object getConstraint() {
        return type;
    }

    @Override
    public PathToSchemasMap validate(Class<? extends JsonSchema> cls, Object arg, ValidationMetadata validationMetadata, Object extra) {
        Class<?> argClass;
        if (arg == null) {
            argClass = Void.class;
        } else {
            argClass = arg.getClass();
        }
        if (!type.contains(argClass)) {
            throw new ValidationException("invalid type");
        }
        return null;
    }
}
