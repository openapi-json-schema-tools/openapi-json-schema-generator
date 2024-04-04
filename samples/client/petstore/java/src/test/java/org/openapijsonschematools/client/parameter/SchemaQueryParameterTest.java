package org.openapijsonschematools.client.parameter;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

public class SchemaQueryParameterTest {
    public record ParamTestCase(@Nullable Object payload, AbstractMap.SimpleEntry<String, String> expectedSerialization, @Nullable Boolean explode) {
        public ParamTestCase(@Nullable Object payload,  AbstractMap.SimpleEntry<String, String> expectedSerialization) {
            this(payload, expectedSerialization, null);
        }
    }

    public static class QueryParameterNoStyle extends SchemaParameter {
        public QueryParameterNoStyle(@Nullable Boolean explode) {
            super("color", ParameterInType.QUERY, true, null, explode, null, AnyTypeJsonSchema.AnyTypeJsonSchema1.getInstance());
        }
    }

    @Test
    public void testQueryParameterNoStyleSerialization() {
        var mapPayload = new LinkedHashMap<String, Integer>();
        mapPayload.put("R", 100);
        mapPayload.put("G", 200);
        mapPayload.put("B", 150);
        List<ParamTestCase> testCases = List.of(
                new ParamTestCase(
                        null,
                        new AbstractMap.SimpleEntry<>("color", "")
                ),
                new ParamTestCase(
                        1,
                        new AbstractMap.SimpleEntry<>("color", "color=1")
                ),
                new ParamTestCase(
                        3.14,
                        new AbstractMap.SimpleEntry<>("color","color=3.14")
                ),
                new ParamTestCase(
                        "blue",
                        new AbstractMap.SimpleEntry<>("color", "color=blue")
                ),
                new ParamTestCase(
                        "hello world",
                        new AbstractMap.SimpleEntry<>("color", "color=hello%20world")
                ),
                new ParamTestCase(
                        "",
                        new AbstractMap.SimpleEntry<>("color", "color=")
                ),
                new ParamTestCase(
                        List.of(),
                        new AbstractMap.SimpleEntry<>("color", "")
                ),
                new ParamTestCase(
                        List.of("blue", "black", "brown"),
                        new AbstractMap.SimpleEntry<>("color", "color=blue&color=black&color=brown")
                ),
                new ParamTestCase(
                        List.of("blue", "black", "brown"),
                        new AbstractMap.SimpleEntry<>("color", "color=blue&color=black&color=brown"),
                    true
                ),
                new ParamTestCase(
                        Map.of(),
                        new AbstractMap.SimpleEntry<>("color", "")
                ),
                new ParamTestCase(
                        mapPayload,
                        new AbstractMap.SimpleEntry<>("color", "R=100&G=200&B=150")
                ),
                new ParamTestCase(
                        mapPayload,
                        new AbstractMap.SimpleEntry<>("color", "R=100&G=200&B=150"),
                        true
                )
        );
        for (ParamTestCase testCase: testCases) {
            var parameter = new QueryParameterNoStyle(testCase.explode);
            var serialization = parameter.serialize(testCase.payload);
            Assert.assertEquals(testCase.expectedSerialization, serialization);
        }
        var parameter = new QueryParameterNoStyle(false);
        for (boolean value: Set.of(true, false)) {
            Assert.assertThrows(
                    InvalidTypeException.class,
                    () -> parameter.serialize(value)
            );
        }
    }

    public static class QueryParameterSpaceDelimited extends SchemaParameter {
        public QueryParameterSpaceDelimited(@Nullable Boolean explode) {
            super("color", ParameterInType.QUERY, true, ParameterStyle.SPACE_DELIMITED, explode, null, AnyTypeJsonSchema.AnyTypeJsonSchema1.getInstance());
        }
    }

    @Test
    public void testQueryParameterSpaceDelimitedSerialization() {
        var mapPayload = new LinkedHashMap<String, Integer>();
        mapPayload.put("R", 100);
        mapPayload.put("G", 200);
        mapPayload.put("B", 150);
        List<ParamTestCase> testCases = List.of(
                new ParamTestCase(
                        List.of(),
                        new AbstractMap.SimpleEntry<>("color", "")
                ),
                new ParamTestCase(
                        List.of("blue", "black", "brown"),
                        new AbstractMap.SimpleEntry<>("color", "blue%20black%20brown")
                ),
                new ParamTestCase(
                        List.of("blue", "black", "brown"),
                        new AbstractMap.SimpleEntry<>("color", "blue%20black%20brown"),
                        true
                ),
                new ParamTestCase(
                        Map.of(),
                        new AbstractMap.SimpleEntry<>("color", "")
                ),
                new ParamTestCase(
                        mapPayload,
                        new AbstractMap.SimpleEntry<>("color", "R%20100%20G%20200%20B%20150")
                ),
                new ParamTestCase(
                        mapPayload,
                        new AbstractMap.SimpleEntry<>("color", "R=100%20G=200%20B=150"),
                        true
                )
        );
        for (ParamTestCase testCase: testCases) {
            var parameter = new QueryParameterSpaceDelimited(testCase.explode);
            var serialization = parameter.serialize(testCase.payload);
            Assert.assertEquals(testCase.expectedSerialization, serialization);
        }
    }

    public static class QueryParameterPipeDelimited extends SchemaParameter {
        public QueryParameterPipeDelimited(@Nullable Boolean explode) {
            super("color", ParameterInType.QUERY, true, ParameterStyle.PIPE_DELIMITED, explode, null, AnyTypeJsonSchema.AnyTypeJsonSchema1.getInstance());
        }
    }

    @Test
    public void testQueryParameterPipeDelimitedSerialization() {
        var mapPayload = new LinkedHashMap<String, Integer>();
        mapPayload.put("R", 100);
        mapPayload.put("G", 200);
        mapPayload.put("B", 150);
        List<ParamTestCase> testCases = List.of(
                new ParamTestCase(
                        List.of(),
                        new AbstractMap.SimpleEntry<>("color", "")
                ),
                new ParamTestCase(
                        List.of("blue", "black", "brown"),
                        new AbstractMap.SimpleEntry<>("color", "blue|black|brown")
                ),
                new ParamTestCase(
                        List.of("blue", "black", "brown"),
                        new AbstractMap.SimpleEntry<>("color", "blue|black|brown"),
                        true
                ),
                new ParamTestCase(
                        Map.of(),
                        new AbstractMap.SimpleEntry<>("color", "")
                ),
                new ParamTestCase(
                        mapPayload,
                        new AbstractMap.SimpleEntry<>("color", "R|100|G|200|B|150")
                ),
                new ParamTestCase(
                        mapPayload,
                        new AbstractMap.SimpleEntry<>("color", "R=100|G=200|B=150"),
                        true
                )
        );
        for (ParamTestCase testCase: testCases) {
            var parameter = new QueryParameterPipeDelimited(testCase.explode);
            var serialization = parameter.serialize(testCase.payload);
            Assert.assertEquals(testCase.expectedSerialization, serialization);
        }
    }
}
