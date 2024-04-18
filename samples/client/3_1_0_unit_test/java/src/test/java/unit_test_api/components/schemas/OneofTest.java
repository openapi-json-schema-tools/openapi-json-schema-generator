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

public class OneofTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testBothOneofValidFails() {
        // both oneOf valid
        final var schema = Oneof.Oneof1.getInstance();
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
    public void testNeitherOneofValidFails() {
        // neither oneOf valid
        final var schema = Oneof.Oneof1.getInstance();
        try {
            schema.validate(
                1.5d,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testSecondOneofValidPasses() throws ValidationException {
        // second oneOf valid
        final var schema = Oneof.Oneof1.getInstance();
        schema.validate(
            2.5d,
            configuration
        );
    }

    @Test
    public void testFirstOneofValidPasses() throws ValidationException {
        // first oneOf valid
        final var schema = Oneof.Oneof1.getInstance();
        schema.validate(
            1,
            configuration
        );
    }
}
