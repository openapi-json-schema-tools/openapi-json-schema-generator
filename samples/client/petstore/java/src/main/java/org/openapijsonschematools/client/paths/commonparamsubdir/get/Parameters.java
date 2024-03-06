package org.openapijsonschematools.client.paths.commonparamsubdir.get;

import org.openapijsonschematools.client.paths.commonparamsubdir.parameters.RouteParameter0;
import org.openapijsonschematools.client.paths.commonparamsubdir.get.parameters.Parameter0;
import org.openapijsonschematools.client.parameter.QuerySerializer;

import org.openapijsonschematools.client.parameter.Parameter;

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

    public static class QueryParametersSerializer extends QuerySerializer {
        public QueryParametersSerializer() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("searchStr", new Parameter0.Parameter01())
                )
            );
        }
    }
}
