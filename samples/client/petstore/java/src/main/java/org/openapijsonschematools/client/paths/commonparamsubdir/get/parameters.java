package org.openapijsonschematools.client.paths.commonparamsubdir.get;

import org.openapijsonschematools.client.paths.commonparamsubdir.parameters.RouteParameter0;
import org.openapijsonschematools.client.paths.commonparamsubdir.get.parameters.Parameter0;
import org.openapijsonschematools.client.parameter.QueryParameter;
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

    public static class QueryParametersDeserializer {
        Map<String, QueryParameter> parameters;

        public QueryParametersDeserializer() {
            parameters = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("searchStr", new Parameter0.Parameter01())
            );
        }

        // QueryParameters
    }
}
