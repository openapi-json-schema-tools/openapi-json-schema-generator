package org.openapijsonschematools.client.paths.fake.delete;

import org.openapijsonschematools.client.paths.fake.delete.parameters.Parameter0;
import org.openapijsonschematools.client.paths.fake.delete.parameters.Parameter1;
import org.openapijsonschematools.client.paths.fake.delete.parameters.Parameter2;
import org.openapijsonschematools.client.paths.fake.delete.parameters.Parameter3;
import org.openapijsonschematools.client.paths.fake.delete.parameters.Parameter4;
import org.openapijsonschematools.client.paths.fake.delete.parameters.Parameter5;
import org.openapijsonschematools.client.parameter.QueryParameter;
import org.openapijsonschematools.client.parameter.NonQueryParameter;

import java.util.Map;
import java.util.AbstractMap;

public class Parameters {

    public static class QueryParametersDeserializer {
        Map<String, QueryParameter> parameters;

        public QueryParametersDeserializer() {
            parameters = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("required_string_group", new Parameter0.Parameter01()),
                new AbstractMap.SimpleEntry<>("required_int64_group", new Parameter2.Parameter21()),
                new AbstractMap.SimpleEntry<>("string_group", new Parameter3.Parameter31()),
                new AbstractMap.SimpleEntry<>("int64_group", new Parameter5.Parameter51())
            );
        }

        // QueryParameters
    }

    public static class HeaderParametersDeserializer {
        Map<String, NonQueryParameter> parameters;

        public HeaderParametersDeserializer() {
            parameters = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("required_boolean_group", new Parameter1.Parameter11()),
                new AbstractMap.SimpleEntry<>("boolean_group", new Parameter4.Parameter41())
            );
        }

        // HeaderParameters
    }
}
