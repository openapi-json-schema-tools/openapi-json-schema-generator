package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;

public interface BooleanEnumValidator <EnumType extends BooleanValueMethod> {
    boolean validate(EnumType arg, SchemaConfiguration configuration) throws ValidationException;
}