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

public class PatternValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testIgnoresBooleansPasses() throws ValidationException {
        // ignores booleans
        final var schema = PatternValidation.PatternValidation1.getInstance();
        schema.validate(
            true,
            configuration
        );
    }

    @Test
    public void testIgnoresFloatsPasses() throws ValidationException {
        // ignores floats
        final var schema = PatternValidation.PatternValidation1.getInstance();
        schema.validate(
            1.0d,
            configuration
        );
    }

    @Test
    public void testANonMatchingPatternIsInvalidFails() {
        // a non-matching pattern is invalid
        final var schema = PatternValidation.PatternValidation1.getInstance();
        try {
            schema.validate(
                "abc",
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testIgnoresIntegersPasses() throws ValidationException {
        // ignores integers
        final var schema = PatternValidation.PatternValidation1.getInstance();
        schema.validate(
            123,
            configuration
        );
    }

    @Test
    public void testAMatchingPatternIsValidPasses() throws ValidationException {
        // a matching pattern is valid
        final var schema = PatternValidation.PatternValidation1.getInstance();
        schema.validate(
            "aaa",
            configuration
        );
    }

    @Test
    public void testIgnoresArraysPasses() throws ValidationException {
        // ignores arrays
        final var schema = PatternValidation.PatternValidation1.getInstance();
        schema.validate(
            Arrays.asList(
            ),
            configuration
        );
    }

    @Test
    public void testIgnoresObjectsPasses() throws ValidationException {
        // ignores objects
        final var schema = PatternValidation.PatternValidation1.getInstance();
        schema.validate(
            MapUtils.makeMap(
            ),
            configuration
        );
    }

    @Test
    public void testIgnoresNullPasses() throws ValidationException {
        // ignores null
        final var schema = PatternValidation.PatternValidation1.getInstance();
        schema.validate(
            (Void) null,
            configuration
        );
    }
}
