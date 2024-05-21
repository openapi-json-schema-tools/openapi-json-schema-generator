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

public class IgnoreElseWithoutIfTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testValidWhenInvalidAgainstLoneElsePasses() throws ValidationException {
        // valid when invalid against lone else
        final var schema = IgnoreElseWithoutIf.IgnoreElseWithoutIf1.getInstance();
        schema.validate(
            "hello",
            configuration
        );
    }

    @Test
    public void testValidWhenValidAgainstLoneElsePasses() throws ValidationException {
        // valid when valid against lone else
        final var schema = IgnoreElseWithoutIf.IgnoreElseWithoutIf1.getInstance();
        schema.validate(
            0,
            configuration
        );
    }
}
