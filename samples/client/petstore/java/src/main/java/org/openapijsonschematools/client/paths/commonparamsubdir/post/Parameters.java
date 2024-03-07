package org.openapijsonschematools.client.paths.commonparamsubdir.post;

import org.openapijsonschematools.client.paths.commonparamsubdir.parameters.RouteParameter0;
import org.openapijsonschematools.client.paths.commonparamsubdir.post.parameters.Parameter0;
import org.openapijsonschematools.client.parameter.PathSerializer;
import org.openapijsonschematools.client.parameter.HeadersSerializer;

import java.util.Map;
import java.util.AbstractMap;

public class Parameters {

    public static class PathParametersSerializer extends PathSerializer {
        public PathParametersSerializer() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("subDir", new RouteParameter0.RouteParameter01())
                )
            );
        }
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
