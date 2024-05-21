package unit_test_api.schemas.validation;

import unit_test_api.configurations.SchemaConfiguration;
import unit_test_api.exceptions.ValidationException;

public interface FloatEnumValidator <EnumType extends FloatValueMethod> {
    float validate(EnumType arg, SchemaConfiguration configuration) throws ValidationException;
}