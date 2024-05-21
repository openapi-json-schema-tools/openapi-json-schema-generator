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

public class MaxlengthValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testShorterIsValidPasses() throws ValidationException {
        // shorter is valid
        final var schema = MaxlengthValidation.MaxlengthValidation1.getInstance();
        schema.validate(
            "f",
            configuration
        );
    }

    @Test
    public void testExactLengthIsValidPasses() throws ValidationException {
        // exact length is valid
        final var schema = MaxlengthValidation.MaxlengthValidation1.getInstance();
        schema.validate(
            "fo",
            configuration
        );
    }

    @Test
    public void testTooLongIsInvalidFails() {
        // too long is invalid
        final var schema = MaxlengthValidation.MaxlengthValidation1.getInstance();
        try {
            schema.validate(
                "foo",
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testIgnoresNonStringsPasses() throws ValidationException {
        // ignores non-strings
        final var schema = MaxlengthValidation.MaxlengthValidation1.getInstance();
        schema.validate(
            100,
            configuration
        );
    }

    @Test
    public void testTwoSupplementaryUnicodeCodePointsIsLongEnoughPasses() throws ValidationException {
        // two supplementary Unicode code points is long enough
        final var schema = MaxlengthValidation.MaxlengthValidation1.getInstance();
        schema.validate(
            "💩💩",
            configuration
        );
    }
}
