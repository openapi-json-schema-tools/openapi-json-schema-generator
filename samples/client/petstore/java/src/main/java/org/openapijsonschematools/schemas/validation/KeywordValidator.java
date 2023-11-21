package org.openapijsonschematools.schemas.validation;

public interface KeywordValidator {
    PathToSchemasMap validate(
            Class<? extends JsonSchema> cls,
            Object arg,
            ValidationMetadata validationMetadata,
            Object extra);

    Object getConstraint();
}