package org.openapijsonschematools.client.header;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.ListJsonSchema;
import org.openapijsonschematools.client.schemas.NullJsonSchema;
import org.openapijsonschematools.client.schemas.NumberJsonSchema;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;

import java.net.http.HttpHeaders;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiPredicate;

public class SchemaHeaderTest {
    public record ParamTestCase(@Nullable Object payload, Map<String, List<String>> expectedSerialization, @Nullable Boolean explode) {
        public ParamTestCase(@Nullable Object payload,  Map<String, List<String>> expectedSerialization) {
            this(payload, expectedSerialization, null);
        }
    }

    @Test
    public void testSerialization() throws ValidationException, NotImplementedException {
        var mapPayload = new LinkedHashMap<String, Integer>();
        mapPayload.put("R", 100);
        mapPayload.put("G", 200);
        mapPayload.put("B", 150);
        List<ParamTestCase> testCases = List.of(
                new ParamTestCase(
                        null,
                        Map.of("color", List.of(""))
                ),
                new ParamTestCase(
                        1,
                        Map.of("color", List.of("1"))
                ),
                new ParamTestCase(
                        3.14,
                        Map.of("color",List.of("3.14"))
                ),
                new ParamTestCase(
                        "blue",
                        Map.of("color", List.of("blue"))
                ),
                new ParamTestCase(
                        "hello world",
                        Map.of("color", List.of("hello world"))
                ),
                new ParamTestCase(
                        "",
                        Map.of("color", List.of(""))
                ),
                new ParamTestCase(
                        List.of(),
                        Map.of("color", List.of(""))
                ),
                new ParamTestCase(
                        List.of("blue", "black", "brown"),
                        Map.of("color", List.of("blue,black,brown"))
                ),
                new ParamTestCase(
                        List.of("blue", "black", "brown"),
                        Map.of("color", List.of("blue,black,brown")),
                    true
                ),
                new ParamTestCase(
                        Map.of(),
                        Map.of("color", List.of(""))
                ),
                new ParamTestCase(
                        mapPayload,
                        Map.of("color", List.of("R,100,G,200,B,150"))
                ),
                new ParamTestCase(
                        mapPayload,
                        Map.of("color", List.of("R=100,G=200,B=150")),
                        true
                )
        );
        SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());
        BiPredicate<String, String> headerFilter = (key, val) -> true;
        for (ParamTestCase testCase: testCases) {
            var header = new SchemaHeader(
                    true,
                    false,
                    testCase.explode,
                    AnyTypeJsonSchema.AnyTypeJsonSchema1.getInstance()
            );
            var serialization = header.serialize(testCase.payload, "color", false, configuration);
            Assert.assertEquals(HttpHeaders.of(testCase.expectedSerialization, headerFilter), serialization);
        }
        SchemaHeader boolHeader = new SchemaHeader(
                true,
                false,
                false,
                AnyTypeJsonSchema.AnyTypeJsonSchema1.getInstance()
        );
        for (boolean value: Set.of(true, false)) {
            Assert.assertThrows(
                    NotImplementedException.class,
                    () -> boolHeader.serialize(value, "color", false, configuration)
            );
        }
    }

    private static SchemaHeader getHeader(JsonSchema<?> schema) {
        return new SchemaHeader(
                true,
                false,
                false,
                schema
        );
    }

    @SuppressWarnings("nullness")
    private void assertNull(@Nullable Object object) {
        Assert.assertNull(object);
    }

    @Test
    public void testDeserialization() throws ValidationException, NotImplementedException {
        SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

        SchemaHeader header = getHeader(NullJsonSchema.NullJsonSchema1.getInstance());
        @Nullable Object deserialized = header.deserialize(List.of(""), false, configuration);
        assertNull(deserialized);

        header = getHeader(NumberJsonSchema.NumberJsonSchema1.getInstance());
        var deserializedOne = header.deserialize(List.of("1"), false, configuration);
        if (deserializedOne == null) {
            throw new RuntimeException("invalid value");
        }
        @Nullable Object expected = 1L;
        Assert.assertEquals(expected, deserializedOne);

        header = getHeader(NumberJsonSchema.NumberJsonSchema1.getInstance());
        var deserialized314 = header.deserialize(List.of("3.14"), false, configuration);
        if (deserialized314 == null) {
            throw new RuntimeException("invalid value");
        }
        expected = 3.14d;
        Assert.assertEquals(expected, deserialized314);

        header = getHeader(StringJsonSchema.StringJsonSchema1.getInstance());
        var deserializedBlue = header.deserialize(List.of("blue"), false, configuration);
        if (deserializedBlue == null) {
            throw new RuntimeException("invalid value");
        }
        expected = "blue";
        Assert.assertEquals(expected, deserializedBlue);

        header = getHeader(StringJsonSchema.StringJsonSchema1.getInstance());
        var deserializedHelloWorld = header.deserialize(List.of("hello world"), false, configuration);
        if (deserializedHelloWorld == null) {
            throw new RuntimeException("invalid value");
        }
        expected = "hello world";
        Assert.assertEquals(expected, deserializedHelloWorld);

        header = getHeader(ListJsonSchema.ListJsonSchema1.getInstance());
        var deserializedColorsList = header.deserialize(List.of("blue", "black", "brown"), false, configuration);
        if (deserializedColorsList == null) {
            throw new RuntimeException("invalid value");
        }
        expected = List.of("blue", "black", "brown");
        Assert.assertEquals(expected, deserializedColorsList);
    }
}
