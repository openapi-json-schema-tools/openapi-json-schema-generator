package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class AnyofComplexTypesTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testSecondAnyofValidComplexPasses() {
        // second anyOf valid (complex)
        final var schema = AnyofComplexTypes.AnyofComplexTypes1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    "baz"
                )
            ),
            configuration
        );
    }

    @Test
    public void testBothAnyofValidComplexPasses() {
        // both anyOf valid (complex)
        final var schema = AnyofComplexTypes.AnyofComplexTypes1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Object>(
                    "foo",
                    "baz"
                ),
                new AbstractMap.SimpleEntry<String, Object>(
                    "bar",
                    2
                )
            ),
            configuration
        );
    }

    @Test
    public void testFirstAnyofValidComplexPasses() {
        // first anyOf valid (complex)
        final var schema = AnyofComplexTypes.AnyofComplexTypes1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    2
                )
            ),
            configuration
        );
    }

    @Test
    public void testNeitherAnyofValidComplexFails() {
        // neither anyOf valid (complex)
        final var schema = AnyofComplexTypes.AnyofComplexTypes1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Object>(
                        "foo",
                        2
                    ),
                    new AbstractMap.SimpleEntry<String, Object>(
                        "bar",
                        "quux"
                    )
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }
}
