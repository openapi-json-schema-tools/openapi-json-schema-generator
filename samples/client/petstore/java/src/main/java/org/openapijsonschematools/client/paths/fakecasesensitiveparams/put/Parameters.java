package org.openapijsonschematools.client.paths.fakecasesensitiveparams.put;

import org.openapijsonschematools.client.paths.fakecasesensitiveparams.put.parameters.Parameter0;
import org.openapijsonschematools.client.paths.fakecasesensitiveparams.put.parameters.Parameter1;
import org.openapijsonschematools.client.paths.fakecasesensitiveparams.put.parameters.Parameter2;
import org.openapijsonschematools.client.parameter.Parameter;

import java.util.Map;
import java.util.AbstractMap;

public class Parameters {

    public static class QueryParametersDeserializer {
        Map<String, Parameter> parameters;

        public QueryParametersDeserializer() {
            parameters = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("someVar", new Parameter0.Parameter01()),
                new AbstractMap.SimpleEntry<>("SomeVar", new Parameter1.Parameter11()),
                new AbstractMap.SimpleEntry<>("some_var", new Parameter2.Parameter21())
            );
        }

        // QueryParameters
    }
}
