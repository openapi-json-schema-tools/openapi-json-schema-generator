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

public class MinimumValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

    @Test
    public void testBoundaryPointIsValidPasses() throws ValidationException {
        // boundary point is valid
        final var schema = MinimumValidation.MinimumValidation1.getInstance();
        schema.validate(
            1.1d,
            configuration
        );
    }

    @Test
    public void testBelowTheMinimumIsInvalidFails() {
        // below the minimum is invalid
        final var schema = MinimumValidation.MinimumValidation1.getInstance();
        try {
            schema.validate(
                0.6d,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testIgnoresNonNumbersPasses() throws ValidationException {
        // ignores non-numbers
        final var schema = MinimumValidation.MinimumValidation1.getInstance();
        schema.validate(
            "x",
            configuration
        );
    }

    @Test
    public void testAboveTheMinimumIsValidPasses() throws ValidationException {
        // above the minimum is valid
        final var schema = MinimumValidation.MinimumValidation1.getInstance();
        schema.validate(
            2.6d,
            configuration
        );
    }
}
