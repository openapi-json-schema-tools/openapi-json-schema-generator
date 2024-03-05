package org.openapijsonschematools.client.paths.fake.get;

import org.openapijsonschematools.client.paths.fake.get.parameters.Parameter0;
import org.openapijsonschematools.client.paths.fake.get.parameters.Parameter1;
import org.openapijsonschematools.client.paths.fake.get.parameters.Parameter2;
import org.openapijsonschematools.client.paths.fake.get.parameters.Parameter3;
import org.openapijsonschematools.client.paths.fake.get.parameters.Parameter4;
import org.openapijsonschematools.client.paths.fake.get.parameters.Parameter5;
import org.openapijsonschematools.client.parameter.QueryParameter;
import org.openapijsonschematools.client.parameter.NonQueryParameter;

import java.util.Map;
import java.util.AbstractMap;

public class Parameters {

    public static class QueryParametersDeserializer {
        Map<String, QueryParameter> parameters;

        public QueryParametersDeserializer() {
            parameters = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("enum_query_string_array", new Parameter2.Parameter21()),
                new AbstractMap.SimpleEntry<>("enum_query_string", new Parameter3.Parameter31()),
                new AbstractMap.SimpleEntry<>("enum_query_integer", new Parameter4.Parameter41()),
                new AbstractMap.SimpleEntry<>("enum_query_double", new Parameter5.Parameter51())
            );
        }

        // QueryParameters
    }

    public static class HeaderParametersDeserializer {
        Map<String, NonQueryParameter> parameters;

        public HeaderParametersDeserializer() {
            parameters = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("enum_header_string_array", new Parameter0.Parameter01()),
                new AbstractMap.SimpleEntry<>("enum_header_string", new Parameter1.Parameter11())
            );
        }

        // HeaderParameters
    }
}
