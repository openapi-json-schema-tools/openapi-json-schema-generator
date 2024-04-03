package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;

public interface DoubleEnumValidator <EnumType extends DoubleValueMethod> {
    double validate(EnumType arg, SchemaConfiguration configuration) throws ValidationException;
}