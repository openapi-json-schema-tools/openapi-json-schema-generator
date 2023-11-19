package org.openapijsonschematools.schemas.validation;

public interface KeywordValidator {
    PathToSchemasMap validate(
            Class<? extends SchemaValidator> cls,
            Object arg,
            Object constraint,
            ValidationMetadata validationMetadata,
            Object extra);
}
