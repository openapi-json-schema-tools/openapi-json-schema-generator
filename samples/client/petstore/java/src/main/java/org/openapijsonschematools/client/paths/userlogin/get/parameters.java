package org.openapijsonschematools.client.paths.userlogin.get;

import org.openapijsonschematools.client.paths.userlogin.get.parameters.Parameter0;
import org.openapijsonschematools.client.paths.userlogin.get.parameters.Parameter1;
import org.openapijsonschematools.client.parameter.QueryParameter;

import java.util.Map;
import java.util.AbstractMap;

public class Parameters {

    public static class QueryParametersDeserializer {
        Map<String, QueryParameter> parameters;

        public QueryParametersDeserializer() {
            parameters = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("username", new Parameter0.Parameter01()),
                new AbstractMap.SimpleEntry<>("password", new Parameter1.Parameter11())
            );
        }

        // QueryParameters
    }
}
