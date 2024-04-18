package unit_test_api.schemas.validation;

import unit_test_api.configurations.SchemaConfiguration;
import unit_test_api.exceptions.ValidationException;

public interface StringSchemaValidator<T> {
    String validate(String arg, SchemaConfiguration configuration) throws ValidationException;
    T validateAndBox(String arg, SchemaConfiguration configuration) throws ValidationException;
}