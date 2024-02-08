package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.List;
import java.util.Set;

public interface NullSchemaValidator<T> {
    Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException;
    T validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException;
}