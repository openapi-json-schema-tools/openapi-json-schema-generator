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

public class ExclusiveminimumValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testBelowTheExclusiveminimumIsInvalidFails() {
        // below the exclusiveMinimum is invalid
        final var schema = ExclusiveminimumValidation.ExclusiveminimumValidation1.getInstance();
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
    public void testAboveTheExclusiveminimumIsValidPasses() throws ValidationException {
        // above the exclusiveMinimum is valid
        final var schema = ExclusiveminimumValidation.ExclusiveminimumValidation1.getInstance();
        schema.validate(
            1.2d,
            configuration
        );
    }

    @Test
    public void testIgnoresNonNumbersPasses() throws ValidationException {
        // ignores non-numbers
        final var schema = ExclusiveminimumValidation.ExclusiveminimumValidation1.getInstance();
        schema.validate(
            "x",
            configuration
        );
    }

    @Test
    public void testBoundaryPointIsInvalidFails() {
        // boundary point is invalid
        final var schema = ExclusiveminimumValidation.ExclusiveminimumValidation1.getInstance();
        try {
            schema.validate(
                1.1d,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }
}
