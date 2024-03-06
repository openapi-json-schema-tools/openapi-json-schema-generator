package org.openapijsonschematools.client.parameter;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;
import java.util.Set;

public class SchemaNonQueryParameterTest {
    public record ParamTestCase(@Nullable Object payload, AbstractMap.SimpleEntry<String, String> expectedSerialization, @Nullable Boolean explode) {
        public ParamTestCase(@Nullable Object payload,  AbstractMap.SimpleEntry<String, String> expectedSerialization) {
            this(payload, expectedSerialization, null);
        }
    }

    public static class HeaderParameter extends SchemaParameter {
        public HeaderParameter(@Nullable Boolean explode) {
            super("color", ParameterInType.HEADER, true, null, explode, null, AnyTypeJsonSchema.AnyTypeJsonSchema1.getInstance());
        }
    }

    @Test
    public void testHeaderSerialization() {
        var mapPayload = new LinkedHashMap<String, Integer>();
        mapPayload.put("R", 100);
        mapPayload.put("G", 200);
        mapPayload.put("B", 150);
        var testCases = List.of(
                new ParamTestCase(
                        null,
                        new AbstractMap.SimpleEntry<>("color", "")
                ),
                new ParamTestCase(
                        1,
                        new AbstractMap.SimpleEntry<>("color", "1")
                ),
                new ParamTestCase(
                        3.14,
                        new AbstractMap.SimpleEntry<>("color","3.14")
                ),
                new ParamTestCase(
                        "blue",
                        new AbstractMap.SimpleEntry<>("color", "blue")
                ),
                new ParamTestCase(
                        "hello world",
                        new AbstractMap.SimpleEntry<>("color", "hello world")
                ),
                new ParamTestCase(
                        "",
                        new AbstractMap.SimpleEntry<>("color", "")
                ),
                new ParamTestCase(
                        List.of(),
                        new AbstractMap.SimpleEntry<>("color", "")
                ),
                new ParamTestCase(
                        List.of("blue", "black", "brown"),
                        new AbstractMap.SimpleEntry<>("color", "blue,black,brown")
                ),
                new ParamTestCase(
                        List.of("blue", "black", "brown"),
                        new AbstractMap.SimpleEntry<>("color", "blue,black,brown"),
                    true
                ),
                new ParamTestCase(
                        Map.of(),
                        new AbstractMap.SimpleEntry<>("color", "")
                ),
                new ParamTestCase(
                        mapPayload,
                        new AbstractMap.SimpleEntry<>("color", "R,100,G,200,B,150")
                ),
                new ParamTestCase(
                        mapPayload,
                        new AbstractMap.SimpleEntry<>("color", "R=100,G=200,B=150"),
                        true
                )
        );
        SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
        for (ParamTestCase testCase: testCases) {
            var header = new HeaderParameter(testCase.explode);
            var serialization = header.serialize(testCase.payload, false, configuration);
            Assert.assertEquals(testCase.expectedSerialization, serialization);
        }
        var boolHeader = new HeaderParameter(false);
        for (boolean value: Set.of(true, false)) {
            Assert.assertThrows(
                    InvalidTypeException.class,
                    () -> boolHeader.serialize(value, false, configuration)
            );
        }
    }

    public static class PathParameter extends SchemaParameter {
        public PathParameter(@Nullable Boolean explode) {
            super("color", ParameterInType.PATH, true, null, explode, null, AnyTypeJsonSchema.AnyTypeJsonSchema1.getInstance());
        }
    }

    @Test
    public void testPathSerialization() {
        var mapPayload = new LinkedHashMap<String, Integer>();
        mapPayload.put("R", 100);
        mapPayload.put("G", 200);
        mapPayload.put("B", 150);
        var testCases = List.of(
                new ParamTestCase(
                        null,
                        new AbstractMap.SimpleEntry<>("color", "")
                ),
                new ParamTestCase(
                        1,
                        new AbstractMap.SimpleEntry<>("color", "1")
                ),
                new ParamTestCase(
                        3.14,
                        new AbstractMap.SimpleEntry<>("color","3.14")
                ),
                new ParamTestCase(
                        "blue",
                        new AbstractMap.SimpleEntry<>("color", "blue")
                ),
                new ParamTestCase(
                        "hello world",
                        new AbstractMap.SimpleEntry<>("color", "hello%20world")
                ),
                new ParamTestCase(
                        "",
                        new AbstractMap.SimpleEntry<>("color", "")
                ),
                new ParamTestCase(
                        List.of(),
                        new AbstractMap.SimpleEntry<>("color", "")
                ),
                new ParamTestCase(
                        List.of("blue", "black", "brown"),
                        new AbstractMap.SimpleEntry<>("color", "blue,black,brown")
                ),
                new ParamTestCase(
                        List.of("blue", "black", "brown"),
                        new AbstractMap.SimpleEntry<>("color", "blue,black,brown"),
                        true
                ),
                new ParamTestCase(
                        Map.of(),
                        new AbstractMap.SimpleEntry<>("color", "")
                ),
                new ParamTestCase(
                        mapPayload,
                        new AbstractMap.SimpleEntry<>("color", "R,100,G,200,B,150")
                ),
                new ParamTestCase(
                        mapPayload,
                        new AbstractMap.SimpleEntry<>("color", "R=100,G=200,B=150"),
                        true
                )
        );
        SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
        for (ParamTestCase testCase: testCases) {
            var pathParameter = new PathParameter(testCase.explode);
            var serialization = pathParameter.serialize(testCase.payload, false, configuration);
            Assert.assertEquals(testCase.expectedSerialization, serialization);
        }
        var pathParameter = new PathParameter(false);
        for (boolean value: Set.of(true, false)) {
            Assert.assertThrows(
                    InvalidTypeException.class,
                    () -> pathParameter.serialize(value, false, configuration)
            );
        }
    }

    public static class CookieParameter extends SchemaParameter {
        public CookieParameter(@Nullable Boolean explode) {
            super("color", ParameterInType.COOKIE, true, null, explode, null, AnyTypeJsonSchema.AnyTypeJsonSchema1.getInstance());
        }
    }

    @Test
    public void testCookieSerialization() {
        var mapPayload = new LinkedHashMap<String, Integer>();
        mapPayload.put("R", 100);
        mapPayload.put("G", 200);
        mapPayload.put("B", 150);
        var testCases = List.of(
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
                        new AbstractMap.SimpleEntry<>("color", "color=hello world")
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
        SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
        for (ParamTestCase testCase: testCases) {
            var cookieParameter = new CookieParameter(testCase.explode);
            var serialization = cookieParameter.serialize(testCase.payload, false, configuration);
            Assert.assertEquals(testCase.expectedSerialization, serialization);
        }
        var cookieParameter = new CookieParameter(false);
        for (boolean value: Set.of(true, false)) {
            Assert.assertThrows(
                    InvalidTypeException.class,
                    () -> cookieParameter.serialize(value, false, configuration)
            );
        }
    }

    public static class PathMatrixParameter extends SchemaParameter {
        public PathMatrixParameter(@Nullable Boolean explode) {
            super("color", ParameterInType.PATH, true, ParameterStyle.MATRIX, explode, null, AnyTypeJsonSchema.AnyTypeJsonSchema1.getInstance());
        }
    }

    @Test
    public void testPathMatrixSerialization() {
        var mapPayload = new LinkedHashMap<String, Integer>();
        mapPayload.put("R", 100);
        mapPayload.put("G", 200);
        mapPayload.put("B", 150);
        var testCases = List.of(
                new ParamTestCase(
                        null,
                        new AbstractMap.SimpleEntry<>("color", "")
                ),
                new ParamTestCase(
                        1,
                        new AbstractMap.SimpleEntry<>("color", ";color=1")
                ),
                new ParamTestCase(
                        3.14,
                        new AbstractMap.SimpleEntry<>("color",";color=3.14")
                ),
                new ParamTestCase(
                        "blue",
                        new AbstractMap.SimpleEntry<>("color", ";color=blue")
                ),
                new ParamTestCase(
                        "hello world",
                        new AbstractMap.SimpleEntry<>("color", ";color=hello%20world")
                ),
                new ParamTestCase(
                        "",
                        new AbstractMap.SimpleEntry<>("color", ";color")
                ),
                new ParamTestCase(
                        List.of(),
                        new AbstractMap.SimpleEntry<>("color", "")
                ),
                new ParamTestCase(
                        List.of("blue", "black", "brown"),
                        new AbstractMap.SimpleEntry<>("color", ";color=blue,black,brown")
                ),
                new ParamTestCase(
                        List.of("blue", "black", "brown"),
                        new AbstractMap.SimpleEntry<>("color", ";color=blue;color=black;color=brown"),
                        true
                ),
                new ParamTestCase(
                        Map.of(),
                        new AbstractMap.SimpleEntry<>("color", "")
                ),
                new ParamTestCase(
                        mapPayload,
                        new AbstractMap.SimpleEntry<>("color", ";color=R,100,G,200,B,150")
                ),
                new ParamTestCase(
                        mapPayload,
                        new AbstractMap.SimpleEntry<>("color", ";R=100;G=200;B=150"),
                        true
                )
        );
        SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
        for (ParamTestCase testCase: testCases) {
            var pathParameter = new PathMatrixParameter(testCase.explode);
            var serialization = pathParameter.serialize(testCase.payload, false, configuration);
            Assert.assertEquals(testCase.expectedSerialization, serialization);
        }
    }

    public static class PathLabelParameter extends SchemaParameter {
        public PathLabelParameter(@Nullable Boolean explode) {
            super("color", ParameterInType.PATH, true, ParameterStyle.LABEL, explode, null, AnyTypeJsonSchema.AnyTypeJsonSchema1.getInstance());
        }
    }

    @Test
    public void testPathLabelSerialization() {
        var mapPayload = new LinkedHashMap<String, Integer>();
        mapPayload.put("R", 100);
        mapPayload.put("G", 200);
        mapPayload.put("B", 150);
        var testCases = List.of(
                new ParamTestCase(
                        null,
                        new AbstractMap.SimpleEntry<>("color", "")
                ),
                new ParamTestCase(
                        1,
                        new AbstractMap.SimpleEntry<>("color", ".1")
                ),
                new ParamTestCase(
                        3.14,
                        new AbstractMap.SimpleEntry<>("color",".3.14")
                ),
                new ParamTestCase(
                        "blue",
                        new AbstractMap.SimpleEntry<>("color", ".blue")
                ),
                new ParamTestCase(
                        "hello world",
                        new AbstractMap.SimpleEntry<>("color", ".hello%20world")
                ),
                new ParamTestCase(
                        "",
                        new AbstractMap.SimpleEntry<>("color", ".")
                ),
                new ParamTestCase(
                        List.of(),
                        new AbstractMap.SimpleEntry<>("color", "")
                ),
                new ParamTestCase(
                        List.of("blue", "black", "brown"),
                        new AbstractMap.SimpleEntry<>("color", ".blue.black.brown")
                ),
                new ParamTestCase(
                        List.of("blue", "black", "brown"),
                        new AbstractMap.SimpleEntry<>("color", ".blue.black.brown"),
                        true
                ),
                new ParamTestCase(
                        Map.of(),
                        new AbstractMap.SimpleEntry<>("color", "")
                ),
                new ParamTestCase(
                        mapPayload,
                        new AbstractMap.SimpleEntry<>("color", ".R.100.G.200.B.150")
                ),
                new ParamTestCase(
                        mapPayload,
                        new AbstractMap.SimpleEntry<>("color", ".R=100.G=200.B=150"),
                        true
                )
        );
        SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
        for (ParamTestCase testCase: testCases) {
            var pathParameter = new PathLabelParameter(testCase.explode);
            var serialization = pathParameter.serialize(testCase.payload, false, configuration);
            Assert.assertEquals(testCase.expectedSerialization, serialization);
        }
    }
}