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

public class MaximumValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

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
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testBoundaryPointIsValidPasses() throws ValidationException {
        // boundary point is valid
        final var schema = MaximumValidation.MaximumValidation1.getInstance();
        schema.validate(
            3.0d,
            configuration
        );
    }

    @Test
    public void testBelowTheMaximumIsValidPasses() throws ValidationException {
        // below the maximum is valid
        final var schema = MaximumValidation.MaximumValidation1.getInstance();
        schema.validate(
            2.6d,
            configuration
        );
    }

    @Test
    public void testIgnoresNonNumbersPasses() throws ValidationException {
        // ignores non-numbers
        final var schema = MaximumValidation.MaximumValidation1.getInstance();
        schema.validate(
            "x",
            configuration
        );
    }
}
