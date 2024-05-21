package unit_test_api.schemas.validation;

import unit_test_api.exceptions.ValidationException;

public interface DefaultValueMethod<T> {
    T defaultValue() throws ValidationException;
}