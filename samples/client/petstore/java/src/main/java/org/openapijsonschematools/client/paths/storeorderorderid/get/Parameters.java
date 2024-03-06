package org.openapijsonschematools.client.paths.storeorderorderid.get;

import org.openapijsonschematools.client.paths.storeorderorderid.get.parameters.Parameter0;
import org.openapijsonschematools.client.parameter.Parameter;

import java.util.Map;
import java.util.AbstractMap;

public class Parameters {

    public static class PathParametersDeserializer {
        Map<String, Parameter> parameters;

        public PathParametersDeserializer() {
            parameters = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("order_id", new Parameter0.Parameter01())
            );
        }

        // deserialize PathParameters
    }
}
