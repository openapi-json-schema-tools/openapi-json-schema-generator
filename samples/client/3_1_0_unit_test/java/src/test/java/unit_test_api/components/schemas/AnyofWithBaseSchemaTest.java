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

public class AnyofWithBaseSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testMismatchBaseSchemaFails() {
        // mismatch base schema
        final var schema = AnyofWithBaseSchema.AnyofWithBaseSchema1.getInstance();
        try {
            schema.validate(
                3,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testOneAnyofValidPasses() throws ValidationException {
        // one anyOf valid
        final var schema = AnyofWithBaseSchema.AnyofWithBaseSchema1.getInstance();
        schema.validate(
            "foobar",
            configuration
        );
    }

    @Test
    public void testBothAnyofInvalidFails() {
        // both anyOf invalid
        final var schema = AnyofWithBaseSchema.AnyofWithBaseSchema1.getInstance();
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
}
