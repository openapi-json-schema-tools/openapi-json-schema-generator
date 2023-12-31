package org.openapijsonschematools.client.schemas;

/**
 * Interface used by map builder setters
 * @param <T> the instance map
 */
public interface InstanceGetter<T> {
    T getInstance();
}
