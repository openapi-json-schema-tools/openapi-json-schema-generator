package org.openapijsonschematools.schemas.validators;

import org.openapijsonschematools.schemas.PathToSchemasMap;
import org.openapijsonschematools.schemas.SchemaValidator;
import org.openapijsonschematools.schemas.ValidationMetadata;

import java.util.HashSet;

public class TypeValidator implements KeywordValidator {
    @Override
    public PathToSchemasMap validate(Object arg, Object value, Object extra, Class<SchemaValidator> cls, ValidationMetadata validationMetadata) {
        HashSet<Class<?>> types = (HashSet<Class<?>>) value;
        Class<?> argClass;
        if (arg == null) {
            argClass = Void.class;
        } else {
            argClass = arg.getClass();
        }
        if (!types.contains(argClass)) {
            throw new RuntimeException("invalid type");
        }
        return null;
    }
}
