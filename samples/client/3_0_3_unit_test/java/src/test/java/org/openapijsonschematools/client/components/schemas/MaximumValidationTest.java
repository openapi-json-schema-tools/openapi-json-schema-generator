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

public class MaximumValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

    @Test
    public void testAboveTheMaximumIsInvalidFails() {
        // above the maximum is invalid
        final var schema = MaximumValidation.MaximumValidation1.getInstance();
        try {
            schema.validate(
                3.5d,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testBoundaryPointIsValidPasses() {
        // boundary point is valid
        final var schema = MaximumValidation.MaximumValidation1.getInstance();
        schema.validate(
            3.0d,
            configuration
        );
    }

    @Test
    public void testBelowTheMaximumIsValidPasses() {
        // below the maximum is valid
        final var schema = MaximumValidation.MaximumValidation1.getInstance();
        schema.validate(
            2.6d,
            configuration
        );
    }

    @Test
    public void testIgnoresNonNumbersPasses() {
        // ignores non-numbers
        final var schema = MaximumValidation.MaximumValidation1.getInstance();
        schema.validate(
            "x",
            configuration
        );
    }
}
