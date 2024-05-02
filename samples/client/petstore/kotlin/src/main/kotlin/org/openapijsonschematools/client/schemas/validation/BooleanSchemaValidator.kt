package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;

public interface BooleanSchemaValidator<T> {
    boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException;
    T validateAndBox(boolean arg, SchemaConfiguration configuration) throws ValidationException;
}