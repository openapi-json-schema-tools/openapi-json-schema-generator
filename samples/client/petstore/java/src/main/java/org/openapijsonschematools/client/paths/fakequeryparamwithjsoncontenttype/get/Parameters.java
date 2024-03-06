package org.openapijsonschematools.client.paths.fakequeryparamwithjsoncontenttype.get;

import org.openapijsonschematools.client.paths.fakequeryparamwithjsoncontenttype.get.parameters.Parameter0;
import org.openapijsonschematools.client.parameter.Parameter;

import java.util.Map;
import java.util.AbstractMap;

public class Parameters {

    public static class QueryParametersDeserializer {
        Map<String, Parameter> parameters;

        public QueryParametersDeserializer() {
            parameters = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("someParam", new Parameter0.Parameter01())
            );
        }

        // QueryParameters
    }
}
