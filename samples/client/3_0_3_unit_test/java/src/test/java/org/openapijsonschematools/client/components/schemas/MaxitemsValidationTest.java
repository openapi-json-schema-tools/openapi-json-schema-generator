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

public class MaxitemsValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testShorterIsValidPasses() {
        // shorter is valid
        final var schema = MaxitemsValidation.MaxitemsValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                1L
            ),
            configuration
        );
    }

    @Test
    public void testExactLengthIsValidPasses() {
        // exact length is valid
        final var schema = MaxitemsValidation.MaxitemsValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                1L,
                2L
            ),
            configuration
        );
    }

    @Test
    public void testTooLongIsInvalidFails() {
        // too long is invalid
        final var schema = MaxitemsValidation.MaxitemsValidation1.getInstance();
        try {
            schema.validate(
                Arrays.asList(
                    1L,
                    2L,
                    3L
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testIgnoresNonArraysPasses() {
        // ignores non-arrays
        final var schema = MaxitemsValidation.MaxitemsValidation1.getInstance();
        schema.validate(
            "foobar",
            configuration
        );
    }
}
