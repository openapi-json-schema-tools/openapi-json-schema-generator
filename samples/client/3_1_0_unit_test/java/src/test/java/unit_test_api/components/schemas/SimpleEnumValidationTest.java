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

public class SimpleEnumValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testSomethingElseIsInvalidFails() {
        // something else is invalid
        final var schema = SimpleEnumValidation.SimpleEnumValidation1.getInstance();
        try {
            schema.validate(
                4,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testOneOfTheEnumIsValidPasses() throws ValidationException {
        // one of the enum is valid
        final var schema = SimpleEnumValidation.SimpleEnumValidation1.getInstance();
        schema.validate(
            1,
            configuration
        );
    }
}
