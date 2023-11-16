package org.openapijsonschematools.schemas.validators;

import org.openapijsonschematools.schemas.PathToSchemasMap;
import org.openapijsonschematools.schemas.SchemaValidator;
import org.openapijsonschematools.schemas.ValidationMetadata;

public class RequiredValidator implements KeywordValidator {
    @Override
    public PathToSchemasMap validate(Class<SchemaValidator> cls, Object arg, Object constraint, ValidationMetadata validationMetadata, Object extra) {
        return null;
    }
}
