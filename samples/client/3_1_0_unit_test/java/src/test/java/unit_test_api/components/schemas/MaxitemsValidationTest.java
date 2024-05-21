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

public class MaxitemsValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testShorterIsValidPasses() throws ValidationException {
        // shorter is valid
        final var schema = MaxitemsValidation.MaxitemsValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                1
            ),
            configuration
        );
    }

    @Test
    public void testExactLengthIsValidPasses() throws ValidationException {
        // exact length is valid
        final var schema = MaxitemsValidation.MaxitemsValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                1,
                2
            ),
            configuration
        );
    }

    @Test
    public void testTooLongIsInvalidFails() {
        // too long is invalid
        final var schema = MaxitemsValidation.MaxitemsValidation1.getInstance();
        try {
            schema.validate(
                Arrays.asList(
                    1,
                    2,
                    3
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testIgnoresNonArraysPasses() throws ValidationException {
        // ignores non-arrays
        final var schema = MaxitemsValidation.MaxitemsValidation1.getInstance();
        schema.validate(
            "foobar",
            configuration
        );
    }
}
