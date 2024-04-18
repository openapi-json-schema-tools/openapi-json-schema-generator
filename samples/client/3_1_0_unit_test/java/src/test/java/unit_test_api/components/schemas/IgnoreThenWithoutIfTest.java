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

public class IgnoreThenWithoutIfTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testValidWhenValidAgainstLoneThenPasses() throws ValidationException {
        // valid when valid against lone then
        final var schema = IgnoreThenWithoutIf.IgnoreThenWithoutIf1.getInstance();
        schema.validate(
            0,
            configuration
        );
    }

    @Test
    public void testValidWhenInvalidAgainstLoneThenPasses() throws ValidationException {
        // valid when invalid against lone then
        final var schema = IgnoreThenWithoutIf.IgnoreThenWithoutIf1.getInstance();
        schema.validate(
            "hello",
            configuration
        );
    }
}
