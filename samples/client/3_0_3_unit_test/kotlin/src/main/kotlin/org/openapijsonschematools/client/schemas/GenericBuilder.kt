package org.openapijsonschematools.client.schemas

/**
 * Builders must implement this class
 * @param <T> the type that the builder returns
</T> */
interface GenericBuilder<T> {
    fun build(): T
}