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

public class NotMultipleTypesTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testOtherMismatchFails() {
        // other mismatch
        final var schema = NotMultipleTypes.NotMultipleTypes1.getInstance();
        try {
            schema.validate(
                true,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testValidPasses() throws ValidationException {
        // valid
        final var schema = NotMultipleTypes.NotMultipleTypes1.getInstance();
        schema.validate(
            "foo",
            configuration
        );
    }

    @Test
    public void testMismatchFails() {
        // mismatch
        final var schema = NotMultipleTypes.NotMultipleTypes1.getInstance();
        try {
            schema.validate(
                1,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }
}
