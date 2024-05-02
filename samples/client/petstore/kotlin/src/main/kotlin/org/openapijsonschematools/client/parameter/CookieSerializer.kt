package org.openapijsonschematools.client.parameter;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.exceptions.NotImplementedException;

import java.util.AbstractMap;
import java.util.Map;
import java.util.TreeMap;

public abstract class CookieSerializer {
    private final Map<String, Parameter> parameters;

    protected CookieSerializer(Map<String, Parameter> parameters) {
        this.parameters = parameters;
    }

    public String serialize(Map<String, ?> inData) throws NotImplementedException {
        String result = "";
        Map<String, @Nullable Object> sortedData = new TreeMap<>(inData);
        for (Map.Entry<String, ?> entry: sortedData.entrySet()) {
            String mapKey = entry.getKey();
            @Nullable Parameter parameter = parameters.get(mapKey);
            if (parameter == null) {
                throw new RuntimeException("Invalid state, a parameter must exist for every key");
            }
            @Nullable Object value = entry.getValue();
            AbstractMap.SimpleEntry<String, String> serialized = parameter.serialize(value);
            if (result.isEmpty()) {
                result = serialized.getValue();
            } else {
                result = result + "; " + serialized.getValue();
            }
        }
        return result;
    }
}
