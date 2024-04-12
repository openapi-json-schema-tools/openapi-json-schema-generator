package org.openapijsonschematools.client.paths.fakeinlinecomposition.post;

import org.openapijsonschematools.client.paths.fakeinlinecomposition.post.parameters.Parameter0;
import org.openapijsonschematools.client.paths.fakeinlinecomposition.post.parameters.Parameter1;
import org.openapijsonschematools.client.parameter.QuerySerializer;

import java.util.Map;
import java.util.AbstractMap;

public class Parameters {

    public static class QueryParametersSerializer extends QuerySerializer {
        public QueryParametersSerializer() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("compositionAtRoot", new Parameter0.Parameter01()),
                    new AbstractMap.SimpleEntry<>("compositionInProperty", new Parameter1.Parameter11())
                )
            );
        }
    }
}
