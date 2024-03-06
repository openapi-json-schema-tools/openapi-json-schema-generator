package org.openapijsonschematools.client.paths.petpetid.delete;

import org.openapijsonschematools.client.paths.petpetid.delete.parameters.Parameter0;
import org.openapijsonschematools.client.paths.petpetid.delete.parameters.Parameter1;
import org.openapijsonschematools.client.parameter.HeadersSerializer;

import org.openapijsonschematools.client.parameter.Parameter;

import java.util.Map;
import java.util.AbstractMap;

public class Parameters {

    public static class PathParametersSerializer {
        Map<String, Parameter> parameters;

        public PathParametersSerializer() {
            parameters = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("petId", new Parameter1.Parameter11())
            );
        }

        // deserialize PathParameters
    }

    public static class HeaderParametersSerializer extends HeadersSerializer {
        public HeaderParametersSerializer() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("api_key", new Parameter0.Parameter01())
                )
            );
        }
    }
}
