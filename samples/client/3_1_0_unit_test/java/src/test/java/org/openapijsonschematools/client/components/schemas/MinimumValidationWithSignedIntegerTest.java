package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class MinimumValidationWithSignedIntegerTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

    @Test
    public void testBoundaryPointWithFloatIsValidPasses() throws ValidationException {
        // boundary point with float is valid
        final var schema = MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1.getInstance();
        schema.validate(
            -2.0d,
            configuration
        );
    }

    @Test
    public void testBoundaryPointIsValidPasses() throws ValidationException {
        // boundary point is valid
        final var schema = MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1.getInstance();
        schema.validate(
            -2,
            configuration
        );
    }

    @Test
    public void testIntBelowTheMinimumIsInvalidFails() {
        // int below the minimum is invalid
        final var schema = MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1.getInstance();
        try {
            schema.validate(
                -3,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testPositiveAboveTheMinimumIsValidPasses() throws ValidationException {
        // positive above the minimum is valid
        final var schema = MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1.getInstance();
        schema.validate(
            0,
            configuration
        );
    }

    @Test
    public void testNegativeAboveTheMinimumIsValidPasses() throws ValidationException {
        // negative above the minimum is valid
        final var schema = MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1.getInstance();
        schema.validate(
            -1,
            configuration
        );
    }

    @Test
    public void testIgnoresNonNumbersPasses() throws ValidationException {
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
        } catch (ValidationException ignored) {
            ;
        }
    }
}
