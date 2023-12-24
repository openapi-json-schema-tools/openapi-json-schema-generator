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

public class MinimumValidationWithSignedIntegerTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testBoundaryPointWithFloatIsValidPasses() {
        // boundary point with float is valid
        final var schema = MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1.getInstance();
        schema.validate(
            -2.0d,
            configuration
        );
    }

    @Test
    public void testBoundaryPointIsValidPasses() {
        // boundary point is valid
        final var schema = MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1.getInstance();
        schema.validate(
            -2L,
            configuration
        );
    }

    @Test
    public void testIntBelowTheMinimumIsInvalidFails() {
        // int below the minimum is invalid
        final var schema = MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1.getInstance();
        try {
            schema.validate(
                -3L,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testPositiveAboveTheMinimumIsValidPasses() {
        // positive above the minimum is valid
        final var schema = MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1.getInstance();
        schema.validate(
            0L,
            configuration
        );
    }

    @Test
    public void testNegativeAboveTheMinimumIsValidPasses() {
        // negative above the minimum is valid
        final var schema = MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1.getInstance();
        schema.validate(
            -1L,
            configuration
        );
    }

    @Test
    public void testIgnoresNonNumbersPasses() {
        // ignores non-numbers
        final var schema = MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1.getInstance();
        schema.validate(
            "x",
            configuration
        );
    }

    @Test
    public void testFloatBelowTheMinimumIsInvalidFails() {
        // float below the minimum is invalid
        final var schema = MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1.getInstance();
        try {
            schema.validate(
                -2.0001d,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }
}
