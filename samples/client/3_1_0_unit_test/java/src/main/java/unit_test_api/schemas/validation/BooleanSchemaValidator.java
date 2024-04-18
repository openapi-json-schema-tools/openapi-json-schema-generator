package unit_test_api.schemas.validation;

import unit_test_api.configurations.SchemaConfiguration;
import unit_test_api.exceptions.ValidationException;

public interface BooleanSchemaValidator<T> {
    boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException;
    T validateAndBox(boolean arg, SchemaConfiguration configuration) throws ValidationException;
}