package org.openapijsonschematools.client.paths.fakebodywithqueryparams.put;

import org.openapijsonschematools.client.paths.fakebodywithqueryparams.put.parameters.Parameter0;
import org.openapijsonschematools.client.parameter.QuerySerializer;

import java.util.Map;
import java.util.AbstractMap;

public class Parameters {

    public static class QueryParametersSerializer extends QuerySerializer {
        public QueryParametersSerializer() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("query", new Parameter0.Parameter01())
                )
            );
        }
    }
}
