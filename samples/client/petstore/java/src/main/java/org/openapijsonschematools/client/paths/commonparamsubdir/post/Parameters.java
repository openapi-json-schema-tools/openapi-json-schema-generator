package org.openapijsonschematools.client.paths.commonparamsubdir.post;

import org.openapijsonschematools.client.paths.commonparamsubdir.parameters.RouteParameter0;
import org.openapijsonschematools.client.paths.commonparamsubdir.post.parameters.Parameter0;
import org.openapijsonschematools.client.parameter.HeadersSerializer;

import org.openapijsonschematools.client.parameter.Parameter;

import java.util.Map;
import java.util.AbstractMap;

public class Parameters {

    public static class PathParametersSerializer {
        Map<String, Parameter> parameters;

        public PathParametersSerializer() {
            parameters = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("subDir", new RouteParameter0.RouteParameter01())
            );
        }

        // deserialize PathParameters
    }

    public static class HeaderParametersSerializer extends HeadersSerializer {
        public HeaderParametersSerializer() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("someHeader", new Parameter0.Parameter01())
                )
            );
        }
    }
}
