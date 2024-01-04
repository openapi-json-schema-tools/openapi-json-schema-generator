package org.openapijsonschematools.client.schemas;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException;

import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class UnsetAddPropsSetter<T> {
    abstract Map<String, @Nullable Object> getInstance();
    abstract Set<String> getKnownKeys();
    abstract T getBuilderAfterAdditionalProperty(Map<String, @Nullable Object> instance);
    public T additionalProperty(String key, Void value) throws InvalidAdditionalPropertyException {
        MapMaker.throwIfKeyKnown(key, getKnownKeys(), true);
        var instance = getInstance();
        instance.put(key, value);
        return getBuilderAfterAdditionalProperty(instance);
    }

    public T additionalProperty(String key, boolean value) throws InvalidAdditionalPropertyException {
        MapMaker.throwIfKeyKnown(key, getKnownKeys(), true);
        var instance = getInstance();
        instance.put(key, value);
        return getBuilderAfterAdditionalProperty(instance);
    }

    public T additionalProperty(String key, String value) throws InvalidAdditionalPropertyException {
        MapMaker.throwIfKeyKnown(key, getKnownKeys(), true);
        var instance = getInstance();
        instance.put(key, value);
        return getBuilderAfterAdditionalProperty(instance);
    }

    public T additionalProperty(String key, int value) throws InvalidAdditionalPropertyException {
        MapMaker.throwIfKeyKnown(key, getKnownKeys(), true);
        var instance = getInstance();
        instance.put(key, value);
        return getBuilderAfterAdditionalProperty(instance);
    }

    public T additionalProperty(String key, float value) throws InvalidAdditionalPropertyException {
        MapMaker.throwIfKeyKnown(key, getKnownKeys(), true);
        var instance = getInstance();
        instance.put(key, value);
        return getBuilderAfterAdditionalProperty(instance);
    }

    public T additionalProperty(String key, long value) throws InvalidAdditionalPropertyException {
        MapMaker.throwIfKeyKnown(key, getKnownKeys(), true);
        var instance = getInstance();
        instance.put(key, value);
        return getBuilderAfterAdditionalProperty(instance);
    }

    public T additionalProperty(String key, double value) throws InvalidAdditionalPropertyException {
        MapMaker.throwIfKeyKnown(key, getKnownKeys(), true);
        var instance = getInstance();
        instance.put(key, value);
        return getBuilderAfterAdditionalProperty(instance);
    }

    public T additionalProperty(String key, List<?> value) throws InvalidAdditionalPropertyException {
        MapMaker.throwIfKeyKnown(key, getKnownKeys(), true);
        var instance = getInstance();
        instance.put(key, value);
        return getBuilderAfterAdditionalProperty(instance);
    }

    public T additionalProperty(String key, Map<String, ?> value) throws InvalidAdditionalPropertyException {
        MapMaker.throwIfKeyKnown(key, getKnownKeys(), true);
        var instance = getInstance();
        instance.put(key, value);
        return getBuilderAfterAdditionalProperty(instance);
    }
}
