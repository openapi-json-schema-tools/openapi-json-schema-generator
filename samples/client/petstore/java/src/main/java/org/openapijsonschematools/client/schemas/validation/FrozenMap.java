package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FrozenMap<V> extends LinkedHashMap<String, V> {
    /*
    A frozen Map
    Once schema validation has been run, written accessor methods return values of the correct type
    If values were mutable, the types in those methods would not agree with returned values
     */
    public FrozenMap(Map<String, ? extends V> m) {
        super(m);
    }

    protected void throwIfKeyNotPresent(String key) throws UnsetPropertyException {
        if (!containsKey(key)) {
            throw new UnsetPropertyException(key+" is unset");
        }
    }

    protected void throwIfKeyKnown(String key, Set<String> requiredKeys, Set<String> optionalKeys) throws IllegalArgumentException {
        if (requiredKeys.contains(key) || optionalKeys.contains(key)) {
            throw new InvalidAdditionalPropertyException ("The known key " + key + " may not be passed in when getting an additional property");
        }
    }

    public V put(String key, V value) {
        throw new UnsupportedOperationException();
    }
    public V remove(Object key) {
        throw new UnsupportedOperationException();
    }
    public void putAll(Map<? extends String, ? extends V> m) {
        throw new UnsupportedOperationException();
    }
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void replaceAll(BiFunction<? super String, ? super V, ? extends V> function) {
        throw new UnsupportedOperationException();
    }

    @Override
    public V putIfAbsent(String key, V value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object key, Object value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean replace(String key, V oldValue, V newValue) {
        throw new UnsupportedOperationException();
    }

    @Override
    public V replace(String key, V value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public V computeIfAbsent(String key, Function<? super String, ? extends V> mappingFunction) {
        throw new UnsupportedOperationException();
    }

    @Override
    public V computeIfPresent(String key,
                              BiFunction<? super String, ? super V, ? extends V> remappingFunction) {
        throw new UnsupportedOperationException();
    }

    @Override
    public V compute(String key,
                     BiFunction<? super String, ? super V, ? extends V> remappingFunction) {
        throw new UnsupportedOperationException();
    }

    @Override
    public V merge(String key, V value,
                   BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
        throw new UnsupportedOperationException();
    }
}
