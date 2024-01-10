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

public class ExclusivemaximumValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

    @Test
    public void testBelowTheExclusivemaximumIsValidPasses() {
        // below the exclusiveMaximum is valid
        final var schema = ExclusivemaximumValidation.ExclusivemaximumValidation1.getInstance();
        schema.validate(
            2.2d,
            configuration
        );
    }

    @Test
    public void testIgnoresNonNumbersPasses() {
        // ignores non-numbers
        final var schema = ExclusivemaximumValidation.ExclusivemaximumValidation1.getInstance();
        schema.validate(
            "x",
            configuration
        );
    }

    @Test
    public void testAboveTheExclusivemaximumIsInvalidFails() {
        // above the exclusiveMaximum is invalid
        final var schema = ExclusivemaximumValidation.ExclusivemaximumValidation1.getInstance();
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
    public void testBoundaryPointIsInvalidFails() {
        // boundary point is invalid
        final var schema = ExclusivemaximumValidation.ExclusivemaximumValidation1.getInstance();
        try {
            schema.validate(
                3.0d,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }
}
