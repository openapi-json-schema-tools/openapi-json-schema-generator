package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class MaxpropertiesValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testShorterIsValidPasses() {
        // shorter is valid
        final var schema = MaxpropertiesValidation.MaxpropertiesValidation1.getInstance();
        schema.validate(
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    1L
                )
            ),
            configuration
        );
    }

    @Test
    public void testExactLengthIsValidPasses() {
        // exact length is valid
        final var schema = MaxpropertiesValidation.MaxpropertiesValidation1.getInstance();
        schema.validate(
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<String, Long>(
                    "foo",
                    1L
                ),
                new AbstractMap.SimpleEntry<String, Long>(
                    "bar",
                    2L
                )
            ),
            configuration
        );
    }

    @Test
    public void testTooLongIsInvalidFails() {
        // too long is invalid
        final var schema = MaxpropertiesValidation.MaxpropertiesValidation1.getInstance();
        try {
            schema.validate(
                MapMaker.makeMap(
                    new AbstractMap.SimpleEntry<String, Long>(
                        "foo",
                        1L
                    ),
                    new AbstractMap.SimpleEntry<String, Long>(
                        "bar",
                        2L
                    ),
                    new AbstractMap.SimpleEntry<String, Long>(
                        "baz",
                        3L
                    )
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testIgnoresOtherNonObjectsPasses() {
        // ignores other non-objects
        final var schema = MaxpropertiesValidation.MaxpropertiesValidation1.getInstance();
        schema.validate(
            12L,
            configuration
        );
    }

    @Test
    public void testIgnoresArraysPasses() {
        // ignores arrays
        final var schema = MaxpropertiesValidation.MaxpropertiesValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                1L,
                2L,
                3L
            ),
            configuration
        );
    }

    @Test
    public void testIgnoresStringsPasses() {
        // ignores strings
        final var schema = MaxpropertiesValidation.MaxpropertiesValidation1.getInstance();
        schema.validate(
            "foobar",
            configuration
        );
    }
}
