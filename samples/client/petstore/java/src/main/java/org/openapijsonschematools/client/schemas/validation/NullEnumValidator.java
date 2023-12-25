package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.ValidationException;

public interface NullEnumValidator <EnumType> {
    Void validate(EnumType arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException;
}