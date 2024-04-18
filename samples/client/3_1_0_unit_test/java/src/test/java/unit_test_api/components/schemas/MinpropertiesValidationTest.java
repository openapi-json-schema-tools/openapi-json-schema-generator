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

public class MinpropertiesValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testExactLengthIsValidPasses() throws ValidationException {
        // exact length is valid
        final var schema = MinpropertiesValidation.MinpropertiesValidation1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Number>(
                    "foo",
                    1
                )
            ),
            configuration
        );
    }

    @Test
    public void testIgnoresOtherNonObjectsPasses() throws ValidationException {
        // ignores other non-objects
        final var schema = MinpropertiesValidation.MinpropertiesValidation1.getInstance();
        schema.validate(
            12,
            configuration
        );
    }

    @Test
    public void testLongerIsValidPasses() throws ValidationException {
        // longer is valid
        final var schema = MinpropertiesValidation.MinpropertiesValidation1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Number>(
                    "foo",
                    1
                ),
                new AbstractMap.SimpleEntry<String, Number>(
                    "bar",
                    2
                )
            ),
            configuration
        );
    }

    @Test
    public void testIgnoresArraysPasses() throws ValidationException {
        // ignores arrays
        final var schema = MinpropertiesValidation.MinpropertiesValidation1.getInstance();
        schema.validate(
            Arrays.asList(
            ),
            configuration
        );
    }

    @Test
    public void testTooShortIsInvalidFails() {
        // too short is invalid
        final var schema = MinpropertiesValidation.MinpropertiesValidation1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testIgnoresStringsPasses() throws ValidationException {
        // ignores strings
        final var schema = MinpropertiesValidation.MinpropertiesValidation1.getInstance();
        schema.validate(
            "",
            configuration
        );
    }
}
