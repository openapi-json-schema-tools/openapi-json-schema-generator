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

public class UnevaluateditemsAsSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testWithValidUnevaluatedItemsPasses() throws ValidationException {
        // with valid unevaluated items
        final var schema = UnevaluateditemsAsSchema.UnevaluateditemsAsSchema1.getInstance();
        schema.validate(
            Arrays.asList(
                "foo"
            ),
            configuration
        );
    }

    @Test
    public void testWithInvalidUnevaluatedItemsFails() {
        // with invalid unevaluated items
        final var schema = UnevaluateditemsAsSchema.UnevaluateditemsAsSchema1.getInstance();
        try {
            schema.validate(
                Arrays.asList(
                    42
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testWithNoUnevaluatedItemsPasses() throws ValidationException {
        // with no unevaluated items
        final var schema = UnevaluateditemsAsSchema.UnevaluateditemsAsSchema1.getInstance();
        schema.validate(
            Arrays.asList(
            ),
            configuration
        );
    }
}
