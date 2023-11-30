package org.openapijsonschematools.schemas;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * A builder for maps that allows in null values
 * Schema tests need this
 * Future schema doc code samples will need it
 */
public class MapBuilder {
    public static <K, V> Map<K, V> of(List<Map.Entry<K, V>> pairs) {
        Map<K, V> map = new HashMap<>();

        for (Map.Entry<K, V> pair : pairs) {
            map.put(pair.getKey(), pair.getValue());
        }

        return map;
    }
}