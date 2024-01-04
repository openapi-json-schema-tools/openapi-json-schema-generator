package org.openapijsonschematools.client.components.schemas;

import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;

public class MaximumValidationWithUnsignedIntegerTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testAboveTheMaximumIsInvalidFails() {
        // above the maximum is invalid
        final var schema = MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1.getInstance();
        try {
            schema.validate(
                300.5d,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testBelowTheMaximumIsInvalidPasses() {
        // below the maximum is invalid
        final var schema = MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1.getInstance();
        schema.validate(
            299.97d,
            configuration
        );
    }

    @Test
    public void testBoundaryPointIntegerIsValidPasses() {
        // boundary point integer is valid
        final var schema = MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1.getInstance();
        schema.validate(
            300,
            configuration
        );
    }

    @Test
    public void testBoundaryPointFloatIsValidPasses() {
        // boundary point float is valid
        final var schema = MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1.getInstance();
        schema.validate(
            300.0d,
            configuration
        );
    }
}
