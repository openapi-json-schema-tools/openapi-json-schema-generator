package org.openapijsonschematools.client.schemas;

import java.util.HashMap;
import java.util.Map;

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
}