package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;

public interface IntegerEnumValidator <EnumType extends IntegerValueMethod> {
    int validate(EnumType arg, SchemaConfiguration configuration) throws ValidationException;
}