package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.KeyFor;
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FrozenMap<V> extends AbstractMap<String, V> {
    /*
    A frozen Map
    Once schema validation has been run, written accessor methods return values of the correct type
    If values were mutable, the types in those methods would not agree with returned values
     */
    private final Map<String, V> map;
    public FrozenMap(Map<String, ? extends V> m) {

        super();
        map = new HashMap<>(m);
    }

    protected V getOrThrow(String key) throws UnsetPropertyException {
        if (containsKey(key)) {
            return get(key);
        }
        throw new UnsetPropertyException(key+" is unset");
    }

    protected void throwIfKeyNotPresent(String key) throws UnsetPropertyException {
        if (!containsKey(key)) {
            throw new UnsetPropertyException(key+" is unset");
        }
    }

    protected void throwIfKeyKnown(String key, Set<String> requiredKeys, Set<String> optionalKeys) throws InvalidAdditionalPropertyException {
        Set<String> knownKeys = new HashSet<>();
        knownKeys.addAll(requiredKeys);
        knownKeys.addAll(optionalKeys);
        MapUtils.throwIfKeyKnown(key, knownKeys, false);
    }

    @Override
    public Set<Entry<@KeyFor("this") String, V>> entrySet() {
        return  map.entrySet().stream()
                .map(x -> new AbstractMap.SimpleEntry<>(x.getKey(), x.getValue()))
                .collect(Collectors.toSet());
    }
}

