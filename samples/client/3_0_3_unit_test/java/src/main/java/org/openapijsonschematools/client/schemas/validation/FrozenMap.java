package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.KeyFor;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException;

import java.util.AbstractMap;
import java.util.HashMap;
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

    @Override
    public @NonNull Set<Entry<@KeyFor("this") String, V>> entrySet() {
        return  map.entrySet().stream()
                .map(x -> new AbstractMap.SimpleEntry<>(x.getKey(), x.getValue()))
                .collect(Collectors.toSet());
    }
}

