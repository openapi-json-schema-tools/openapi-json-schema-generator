package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;

public interface FloatEnumValidator <EnumType extends FloatValueMethod> {
    float validate(EnumType arg, SchemaConfiguration configuration) throws ValidationException;
}