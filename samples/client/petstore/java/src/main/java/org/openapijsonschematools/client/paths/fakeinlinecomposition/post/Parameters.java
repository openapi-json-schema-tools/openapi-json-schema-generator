package org.openapijsonschematools.client.paths.fakeinlinecomposition.post;

import org.openapijsonschematools.client.paths.fakeinlinecomposition.post.parameters.Parameter0;
import org.openapijsonschematools.client.paths.fakeinlinecomposition.post.parameters.Parameter1;
import org.openapijsonschematools.client.parameter.Parameter;

import java.util.Map;
import java.util.AbstractMap;

public class Parameters {

    public static class QueryParametersDeserializer {
        Map<String, Parameter> parameters;

        public QueryParametersDeserializer() {
            parameters = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("compositionAtRoot", new Parameter0.Parameter01()),
                new AbstractMap.SimpleEntry<>("compositionInProperty", new Parameter1.Parameter11())
            );
        }

        // QueryParameters
    }
}
