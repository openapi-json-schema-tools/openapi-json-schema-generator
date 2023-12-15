package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;

public interface KeywordValidator {
    PathToSchemasMap validate(
            JsonSchema cls,
            Object arg,
            ValidationMetadata validationMetadata,
            Object extra) throws ValidationException;

    Object getConstraint();
}
