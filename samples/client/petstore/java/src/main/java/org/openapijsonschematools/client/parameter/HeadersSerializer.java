package org.openapijsonschematools.client.parameter;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.exceptions.NotImplementedException;

import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.List;

public abstract class HeadersSerializer {
    private final Map<String, Parameter> parameters;

    protected HeadersSerializer(Map<String, Parameter> parameters) {
        this.parameters = parameters;
    }

    public Map<String, List<String>> serialize(Map<String, ?> inData) throws NotImplementedException {
        Map<String, List<String>> results = new LinkedHashMap<>();
        for (Map.Entry<String, ?> entry: inData.entrySet()) {
            String mapKey = entry.getKey();
            @Nullable Parameter parameter = parameters.get(mapKey);
            if (parameter == null) {
                throw new RuntimeException("Invalid state, a parameter must exist for every key");
            }
            @Nullable Object value = entry.getValue();
            AbstractMap.SimpleEntry<String, String> serialized = parameter.serialize(value);
            results.put(serialized.getKey(), List.of(serialized.getValue()));
        }
        return results;
    }
}
