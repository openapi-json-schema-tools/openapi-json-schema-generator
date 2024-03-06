package org.openapijsonschematools.client.paths.faketestqueryparamters.put;

import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.Parameter0;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.Parameter1;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.Parameter2;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.Parameter3;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.Parameter4;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.Parameter5;
import org.openapijsonschematools.client.parameter.QuerySerializer;

import java.util.Map;
import java.util.AbstractMap;

public class Parameters {

    public static class QueryParametersSerializer extends QuerySerializer {
        public QueryParametersSerializer() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("pipe", new Parameter0.Parameter01()),
                    new AbstractMap.SimpleEntry<>("ioutil", new Parameter1.Parameter11()),
                    new AbstractMap.SimpleEntry<>("http", new Parameter2.Parameter21()),
                    new AbstractMap.SimpleEntry<>("url", new Parameter3.Parameter31()),
                    new AbstractMap.SimpleEntry<>("context", new Parameter4.Parameter41()),
                    new AbstractMap.SimpleEntry<>("refParam", new Parameter5.Parameter51())
                )
            );
        }
    }
}
