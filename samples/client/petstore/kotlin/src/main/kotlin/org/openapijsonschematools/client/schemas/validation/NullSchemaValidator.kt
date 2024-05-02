package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;

public interface NullSchemaValidator<T> {
    Nothing? validate(Nothing? arg, SchemaConfiguration configuration) throws ValidationException;
    T validateAndBox(Nothing? arg, SchemaConfiguration configuration) throws ValidationException;
}