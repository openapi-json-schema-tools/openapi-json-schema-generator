package unit_test_api.schemas.validation;

import unit_test_api.configurations.SchemaConfiguration;
import unit_test_api.exceptions.ValidationException;

public interface DoubleEnumValidator <EnumType extends DoubleValueMethod> {
    double validate(EnumType arg, SchemaConfiguration configuration) throws ValidationException;
}