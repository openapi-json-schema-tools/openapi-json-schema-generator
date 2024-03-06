package org.openapijsonschematools.client.paths.fake.get;

import org.openapijsonschematools.client.paths.fake.get.parameters.Parameter0;
import org.openapijsonschematools.client.paths.fake.get.parameters.Parameter1;
import org.openapijsonschematools.client.paths.fake.get.parameters.Parameter2;
import org.openapijsonschematools.client.paths.fake.get.parameters.Parameter3;
import org.openapijsonschematools.client.paths.fake.get.parameters.Parameter4;
import org.openapijsonschematools.client.paths.fake.get.parameters.Parameter5;
import org.openapijsonschematools.client.parameter.PathSerializer;
import org.openapijsonschematools.client.parameter.HeadersSerializer;
import org.openapijsonschematools.client.parameter.QuerySerializer;

import org.openapijsonschematools.client.parameter.Parameter;

import java.util.Map;
import java.util.AbstractMap;

public class Parameters {

    public static class QueryParametersSerializer extends QuerySerializer {
        public QueryParametersSerializer() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("enum_query_string_array", new Parameter2.Parameter21()),
                    new AbstractMap.SimpleEntry<>("enum_query_string", new Parameter3.Parameter31()),
                    new AbstractMap.SimpleEntry<>("enum_query_integer", new Parameter4.Parameter41()),
                    new AbstractMap.SimpleEntry<>("enum_query_double", new Parameter5.Parameter51())
                )
            );
        }
    }

    public static class HeaderParametersSerializer extends HeadersSerializer {
        public HeaderParametersSerializer() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("enum_header_string_array", new Parameter0.Parameter01()),
                    new AbstractMap.SimpleEntry<>("enum_header_string", new Parameter1.Parameter11())
                )
            );
        }
    }
}
