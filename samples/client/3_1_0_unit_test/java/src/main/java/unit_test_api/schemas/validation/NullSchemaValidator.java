package unit_test_api.schemas.validation;

import unit_test_api.configurations.SchemaConfiguration;
import unit_test_api.exceptions.ValidationException;

public interface NullSchemaValidator<T> {
    Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException;
    T validateAndBox(Void arg, SchemaConfiguration configuration) throws ValidationException;
}