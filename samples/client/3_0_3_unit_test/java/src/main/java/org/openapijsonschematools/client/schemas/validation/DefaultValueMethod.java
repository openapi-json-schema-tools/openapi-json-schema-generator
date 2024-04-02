package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.InvalidTypeException;

public interface DefaultValueMethod<T> {
    T defaultValue() throws InvalidTypeException;
}