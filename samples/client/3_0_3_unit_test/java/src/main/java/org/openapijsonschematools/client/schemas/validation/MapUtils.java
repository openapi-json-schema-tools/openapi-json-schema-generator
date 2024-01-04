package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapUtils {
    /**
     * A builder for maps that allows in null values
     * Schema tests + doc code samples need it
     * @param entries items to add
     * @return the output map
     * @param <K> key type
     * @param <V> value type
     */
    @SafeVarargs
    @SuppressWarnings("varargs")
    public static <K, V> Map<K, V> makeMap(Map.Entry<K, V>... entries) {
        Map<K, V> map = new HashMap<>();
        for (Map.Entry<K, V> entry : entries) {
            map.put(entry.getKey(), entry.getValue());
        }
        return map;
    }

    public static void throwIfKeyKnown(String key, Set<String> knownKeys, boolean setting) throws InvalidAdditionalPropertyException {
        if (knownKeys.contains(key)) {
            String verb = "getting";
            if (setting) {
                verb = "setting";
            }
            throw new InvalidAdditionalPropertyException ("The known key " + key + " may not be passed in when "+verb+" an additional property");
        }
    }
}