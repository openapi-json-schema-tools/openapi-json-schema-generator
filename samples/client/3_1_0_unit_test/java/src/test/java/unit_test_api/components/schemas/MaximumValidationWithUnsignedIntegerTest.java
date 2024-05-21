package unit_test_api.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import unit_test_api.configurations.JsonSchemaKeywordFlags;
import unit_test_api.configurations.SchemaConfiguration;
import unit_test_api.exceptions.ValidationException;
import unit_test_api.schemas.validation.MapUtils;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class MaximumValidationWithUnsignedIntegerTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

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
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testBelowTheMaximumIsInvalidPasses() throws ValidationException {
        // below the maximum is invalid
        final var schema = MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1.getInstance();
        schema.validate(
            299.97d,
            configuration
        );
    }

    @Test
    public void testBoundaryPointIntegerIsValidPasses() throws ValidationException {
        // boundary point integer is valid
        final var schema = MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1.getInstance();
        schema.validate(
            300,
            configuration
        );
    }

    @Test
    public void testBoundaryPointFloatIsValidPasses() throws ValidationException {
        // boundary point float is valid
        final var schema = MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1.getInstance();
        schema.validate(
            300.0d,
            configuration
        );
    }
}
