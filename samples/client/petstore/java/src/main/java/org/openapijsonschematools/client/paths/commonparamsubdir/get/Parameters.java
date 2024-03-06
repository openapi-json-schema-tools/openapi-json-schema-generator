package org.openapijsonschematools.client.paths.commonparamsubdir.get;

import org.openapijsonschematools.client.paths.commonparamsubdir.parameters.RouteParameter0;
import org.openapijsonschematools.client.paths.commonparamsubdir.get.parameters.Parameter0;
import org.openapijsonschematools.client.parameter.QuerySerializer;

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
