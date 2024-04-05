package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;

public interface DefaultValueMethod<T> {
    T defaultValue() throws ValidationException;
}