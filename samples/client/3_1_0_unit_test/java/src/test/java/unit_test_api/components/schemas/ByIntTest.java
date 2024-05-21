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

public class ByIntTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testIntByIntFailFails() {
        // int by int fail
        final var schema = ByInt.ByInt1.getInstance();
        try {
            schema.validate(
                7,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testIntByIntPasses() throws ValidationException {
        // int by int
        final var schema = ByInt.ByInt1.getInstance();
        schema.validate(
            10,
            configuration
        );
    }

    @Test
    public void testIgnoresNonNumbersPasses() throws ValidationException {
        // ignores non-numbers
        final var schema = ByInt.ByInt1.getInstance();
        schema.validate(
            "foo",
            configuration
        );
    }
}
