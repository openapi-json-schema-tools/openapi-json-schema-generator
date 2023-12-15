package org.openapijsonschematools.client.schemas.validation;

public class FakeValidator implements KeywordValidator {
    @Override
    public Object getConstraint() {
        return null;
    }

    @Override
    public PathToSchemasMap validate(JsonSchema schema, Object arg, ValidationMetadata validationMetadata) {
        return null;
    }
}
