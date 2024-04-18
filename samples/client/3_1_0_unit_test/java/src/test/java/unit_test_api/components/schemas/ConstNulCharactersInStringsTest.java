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

public class ConstNulCharactersInStringsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testMatchStringWithNulPasses() throws ValidationException {
        // match string with nul
        final var schema = ConstNulCharactersInStrings.ConstNulCharactersInStrings1.getInstance();
        schema.validate(
            "hello\0there",
            configuration
        );
    }

    @Test
    public void testDoNotMatchStringLackingNulFails() {
        // do not match string lacking nul
        final var schema = ConstNulCharactersInStrings.ConstNulCharactersInStrings1.getInstance();
        try {
            schema.validate(
                "hellothere",
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }
}
