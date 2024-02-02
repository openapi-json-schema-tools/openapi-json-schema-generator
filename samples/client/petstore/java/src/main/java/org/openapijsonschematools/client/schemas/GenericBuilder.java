package org.openapijsonschematools.client.schemas;

/**
 * Builders must implement this class
 * @param <T> the type that the builder returns
 */
public interface GenericBuilder<T> {
    T build();
}
