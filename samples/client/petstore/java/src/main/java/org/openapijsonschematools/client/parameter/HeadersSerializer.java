package org.openapijsonschematools.client.parameter;

import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class HeadersSerializer {
    private final Map<String, Parameter> parameters;

    protected HeadersSerializer(Map<String, Parameter> parameters) {
        this.parameters = parameters;
    }

    public Map<String, String> serialize(Map<String, ?> inData) {
        Map<String, String> results = new LinkedHashMap<>();
        for (Map.Entry<String, ?> entry: inData.entrySet()) {
            String mapKey = entry.getKey();
            @Nullable Object value = entry.getValue();
            @Nullable Parameter parameter = parameters.get(mapKey);
            if (parameter == null) {
                throw new RuntimeException("Invalid state, a parameter must exist for every key");
            }
            AbstractMap.SimpleEntry<String, String> serialized = parameter.serialize(inData);
            results.put(serialized.getKey(), serialized.getValue());
        }
        return results;
    }
}
