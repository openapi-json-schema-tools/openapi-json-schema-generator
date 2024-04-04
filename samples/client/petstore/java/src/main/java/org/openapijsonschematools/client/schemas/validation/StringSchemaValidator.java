package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.ValidationException;

public interface StringSchemaValidator<T> {
    String validate(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException;
    T validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException;
}