package org.openapijsonschematools.client.schemas;

import java.util.Map;

/**
 * Builders must implement this class
 * For Map builders,
 * @param <T> the type that the builder returns
 */
public interface MapBuilder<T> {
    Map<String, T> build();
}
