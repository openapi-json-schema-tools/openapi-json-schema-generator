package org.openapijsonschematools.client.parameter;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.exceptions.NotImplementedException;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public abstract class QuerySerializer {
    private final Map<String, Parameter> parameters;

    protected QuerySerializer(Map<String, Parameter> parameters) {
        this.parameters = parameters;
    }

    public Map<String, String> getQueryMap(Map<String, ?> inData) throws NotImplementedException {
        Map<String, String> results = new HashMap<>();
        for (Map.Entry<String, ?> entry: inData.entrySet()) {
            String mapKey = entry.getKey();
            @Nullable Parameter parameter = parameters.get(mapKey);
            if (parameter == null) {
                throw new RuntimeException("Invalid state, a parameter must exist for every key");
            }
            @Nullable Object value = entry.getValue();
            AbstractMap.SimpleEntry<String, String> serialized = parameter.serialize(value);
            results.put(serialized.getKey(), serialized.getValue());
        }
        return new TreeMap<>(results);
    }

    public String serialize(Map<String, String> queryMap) {
        if (queryMap.isEmpty()) {
            return "";
        }
        String result = "?";
        for (String serializedValue: queryMap.values()) {
            if (result.length() == 1) {
                result = result + serializedValue;
            } else {
                result = result + "&" + serializedValue;
            }
        }
        // TODO what if the style is not FORM?
        return result;
    }
}
