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

public class BySmallNumberTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void test000751IsNotMultipleOf00001Fails() {
        // 0.00751 is not multiple of 0.0001
        final var schema = BySmallNumber.BySmallNumber1.getInstance();
        try {
            schema.validate(
                0.00751d,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void test00075IsMultipleOf00001Passes() throws ValidationException {
        // 0.0075 is multiple of 0.0001
        final var schema = BySmallNumber.BySmallNumber1.getInstance();
        schema.validate(
            0.0075d,
            configuration
        );
    }
}
