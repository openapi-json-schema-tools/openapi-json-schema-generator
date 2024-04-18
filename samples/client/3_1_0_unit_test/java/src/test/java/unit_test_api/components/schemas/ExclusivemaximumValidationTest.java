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

public class ExclusivemaximumValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testBelowTheExclusivemaximumIsValidPasses() throws ValidationException {
        // below the exclusiveMaximum is valid
        final var schema = ExclusivemaximumValidation.ExclusivemaximumValidation1.getInstance();
        schema.validate(
            2.2d,
            configuration
        );
    }

    @Test
    public void testIgnoresNonNumbersPasses() throws ValidationException {
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
        } catch (ValidationException ignored) {
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
        } catch (ValidationException ignored) {
            ;
        }
    }
}
