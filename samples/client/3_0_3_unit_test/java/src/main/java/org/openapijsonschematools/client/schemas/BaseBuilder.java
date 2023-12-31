package org.openapijsonschematools.client.schemas;

/**
 * Builders must implement this class
 * For Map builders,
 * @param <T> the type that the builder returns
 */
public interface BaseBuilder<T> {
    T build();
}
