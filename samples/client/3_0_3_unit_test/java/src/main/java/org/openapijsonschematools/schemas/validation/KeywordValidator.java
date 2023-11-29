package org.openapijsonschematools.schemas.validation;

import org.openapijsonschematools.exceptions.ValidationException;

public interface KeywordValidator {
    PathToSchemasMap validate(
            Class<? extends JsonSchema> cls,
            Object arg,
            ValidationMetadata validationMetadata,
            Object extra) throws ValidationException;

    Object getConstraint();
}
