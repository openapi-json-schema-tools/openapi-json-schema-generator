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

public class EnumWith0DoesNotMatchFalseTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testFloatZeroIsValidPasses() throws ValidationException {
        // float zero is valid
        final var schema = EnumWith0DoesNotMatchFalse.EnumWith0DoesNotMatchFalse1.getInstance();
        schema.validate(
            0.0d,
            configuration
        );
    }

    @Test
    public void testFalseIsInvalidFails() {
        // false is invalid
        final var schema = EnumWith0DoesNotMatchFalse.EnumWith0DoesNotMatchFalse1.getInstance();
        try {
            schema.validate(
                false,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testIntegerZeroIsValidPasses() throws ValidationException {
        // integer zero is valid
        final var schema = EnumWith0DoesNotMatchFalse.EnumWith0DoesNotMatchFalse1.getInstance();
        schema.validate(
            0,
            configuration
        );
    }
}
