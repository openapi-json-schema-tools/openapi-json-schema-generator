package unit_test_api.schemas.validation;

import unit_test_api.configurations.SchemaConfiguration;
import unit_test_api.exceptions.ValidationException;

public interface NumberSchemaValidator<T> {
    Number validate(Number arg, SchemaConfiguration configuration) throws ValidationException;
    T validateAndBox(Number arg, SchemaConfiguration configuration) throws ValidationException;
}