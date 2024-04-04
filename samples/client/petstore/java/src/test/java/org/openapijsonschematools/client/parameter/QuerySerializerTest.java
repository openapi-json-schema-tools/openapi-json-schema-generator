package org.openapijsonschematools.client.parameter;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;

import java.util.AbstractMap;
import java.util.Map;

public class QuerySerializerTest {
    public static class Param1QueryParameter extends SchemaParameter {
        public Param1QueryParameter() {
            super("param1", ParameterInType.QUERY, true, null, null, null, AnyTypeJsonSchema.AnyTypeJsonSchema1.getInstance());
        }
    }

    public static class Param2QueryParameter extends SchemaParameter {
        public Param2QueryParameter() {
            super("param2", ParameterInType.QUERY, true, null, null, null, AnyTypeJsonSchema.AnyTypeJsonSchema1.getInstance());
        }
    }

    public static class QueryParametersSerializer extends QuerySerializer {
        protected QueryParametersSerializer() {
            super(
                    Map.ofEntries(
                            new AbstractMap.SimpleEntry<>("param1", new Param1QueryParameter()),
                            new AbstractMap.SimpleEntry<>("param2", new Param2QueryParameter())
                    )
            );
        }
    }

    @Test
    public void testSerialization() throws NotImplementedException {
        Map<String, ?> inData = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("param1", "a"),
                new AbstractMap.SimpleEntry<>("param2", 3.14d)
        );
        var serializer = new QueryParametersSerializer();
        var queryMap = serializer.getQueryMap(inData);
        Map<String, String> expectedQueryMap = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("param1", "param1=a"),
                new AbstractMap.SimpleEntry<>("param2", "param2=3.14")
        );
        Assert.assertEquals(expectedQueryMap, queryMap);
        String query = serializer.serialize(queryMap);
        String expectedQuery = "?param1=a&param2=3.14";
        Assert.assertEquals(expectedQuery, query);
    }
}