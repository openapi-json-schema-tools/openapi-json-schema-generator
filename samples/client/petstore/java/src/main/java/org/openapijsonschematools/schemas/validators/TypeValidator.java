package org.openapijsonschematools.schemas.validators;

import org.openapijsonschematools.schemas.PathToSchemasMap;
import org.openapijsonschematools.schemas.SchemaValidator;
import org.openapijsonschematools.schemas.ValidationMetadata;

import java.util.HashSet;

public class TypeValidator implements KeywordValidator {
    @Override
    public PathToSchemasMap validate(Object arg, Object value, Object extra, Class<SchemaValidator> cls, ValidationMetadata validationMetadata) {
        HashSet<Class<?>> types = (HashSet<Class<?>>) value;
        if (!types.contains(arg.getClass())) {
            throw new RuntimeException("invalid type");
        }
        return null;
    }
}
