package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;

public class FakeValidator implements KeywordValidator {
    @Override
    public Object getConstraint() {
        return null;
    }

    @Override
    public PathToSchemasMap validate(JsonSchema schema, @Nullable Object arg, ValidationMetadata validationMetadata) {
        return null;
    }
}
