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

public class MaxlengthValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testShorterIsValidPasses() {
        // shorter is valid
        final var schema = MaxlengthValidation.MaxlengthValidation1.getInstance();
        schema.validate(
            "f",
            configuration
        );
    }

    @Test
    public void testExactLengthIsValidPasses() {
        // exact length is valid
        final var schema = MaxlengthValidation.MaxlengthValidation1.getInstance();
        schema.validate(
            "fo",
            configuration
        );
    }

    @Test
    public void testTooLongIsInvalidFails() {
        // too long is invalid
        final var schema = MaxlengthValidation.MaxlengthValidation1.getInstance();
        try {
            schema.validate(
                "foo",
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testIgnoresNonStringsPasses() {
        // ignores non-strings
        final var schema = MaxlengthValidation.MaxlengthValidation1.getInstance();
        schema.validate(
            100,
            configuration
        );
    }

    @Test
    public void testTwoSupplementaryUnicodeCodePointsIsLongEnoughPasses() {
        // two supplementary Unicode code points is long enough
        final var schema = MaxlengthValidation.MaxlengthValidation1.getInstance();
        schema.validate(
            "💩💩",
            configuration
        );
    }
}
