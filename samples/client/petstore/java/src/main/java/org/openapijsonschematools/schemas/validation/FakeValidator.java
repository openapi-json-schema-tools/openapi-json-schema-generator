package org.openapijsonschematools.schemas.validation;

public class FakeValidator implements KeywordValidator {
    @Override
    public PathToSchemasMap validate(Class<? extends SchemaValidator> cls, Object arg, Object constraint, ValidationMetadata validationMetadata, Object extra) {
        return null;
    }
}
