package org.openapijsonschematools.client.paths.petpetid.delete;

import org.openapijsonschematools.client.paths.petpetid.delete.parameters.Parameter0;
import org.openapijsonschematools.client.paths.petpetid.delete.parameters.Parameter1;
import org.openapijsonschematools.client.parameter.NonQueryParameter;

import java.util.Map;
import java.util.AbstractMap;

public class Parameters {

    public static class PathParametersDeserializer {
        Map<String, NonQueryParameter> parameters;

        public PathParametersDeserializer() {
            parameters = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("petId", new Parameter1.Parameter11())
            );
        }

        // deserialize PathParameters
    }

    public static class HeaderParametersDeserializer {
        Map<String, NonQueryParameter> parameters;

        public HeaderParametersDeserializer() {
            parameters = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("api_key", new Parameter0.Parameter01())
            );
        }

        // HeaderParameters
    }
}
