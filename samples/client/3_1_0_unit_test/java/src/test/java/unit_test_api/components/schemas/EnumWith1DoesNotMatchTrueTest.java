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

public class EnumWith1DoesNotMatchTrueTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testTrueIsInvalidFails() {
        // true is invalid
        final var schema = EnumWith1DoesNotMatchTrue.EnumWith1DoesNotMatchTrue1.getInstance();
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
    public void testFloatOneIsValidPasses() throws ValidationException {
        // float one is valid
        final var schema = EnumWith1DoesNotMatchTrue.EnumWith1DoesNotMatchTrue1.getInstance();
        schema.validate(
            1.0d,
            configuration
        );
    }

    @Test
    public void testIntegerOneIsValidPasses() throws ValidationException {
        // integer one is valid
        final var schema = EnumWith1DoesNotMatchTrue.EnumWith1DoesNotMatchTrue1.getInstance();
        schema.validate(
            1,
            configuration
        );
    }
}
