package org.openapijsonschematools.client.paths.commonparamsubdir.post;

import org.openapijsonschematools.client.paths.commonparamsubdir.parameters.RouteParameter0;
import org.openapijsonschematools.client.paths.commonparamsubdir.post.parameters.Parameter0;
import org.openapijsonschematools.client.parameter.NonQueryParameter;

import java.util.Map;
import java.util.AbstractMap;

public class Parameters {

    public static class PathParametersDeserializer {
        Map<String, NonQueryParameter> parameters;

        public PathParametersDeserializer() {
            parameters = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("subDir", new RouteParameter0.RouteParameter01())
            );
        }

        // deserialize PathParameters
    }

    public static class HeaderParametersDeserializer {
        Map<String, NonQueryParameter> parameters;

        public HeaderParametersDeserializer() {
            parameters = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("someHeader", new Parameter0.Parameter01())
            );
        }

        // HeaderParameters
    }
}
