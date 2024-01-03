package org.openapijsonschematools.client.schemas;

import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * A builder for maps that allows in null values
 * Schema tests + doc code samples need it
 */
public class MapMaker {
    @SafeVarargs
    @SuppressWarnings("varargs")
    public static <K, V> Map<K, V> makeMap(Map.Entry<K, V>... entries) {
        Map<K, V> map = new HashMap<>();
        for (Map.Entry<K, V> entry : entries) {
            map.put(entry.getKey(), entry.getValue());
        }
        return map;
    }

    public static void throwIfKeyKnown(String key, Set<String> requiredKeys, Set<String> optionalKeys, boolean setting) throws InvalidAdditionalPropertyException {
        if (requiredKeys.contains(key) || optionalKeys.contains(key)) {
            String verb = "getting";
            if (setting) {
                verb = "setting";
            }
            throw new InvalidAdditionalPropertyException ("The known key " + key + " may not be passed in when "+verb+" an additional property");
        }
    }
}