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

public class UnevaluatedpropertiesSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testWithInvalidUnevaluatedPropertiesFails() {
        // with invalid unevaluated properties
        final var schema = UnevaluatedpropertiesSchema.UnevaluatedpropertiesSchema1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, String>(
                        "foo",
                        "fo"
                    )
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testWithNoUnevaluatedPropertiesPasses() throws ValidationException {
        // with no unevaluated properties
        final var schema = UnevaluatedpropertiesSchema.UnevaluatedpropertiesSchema1.getInstance();
        schema.validate(
            MapUtils.makeMap(
            ),
            configuration
        );
    }

    @Test
    public void testWithValidUnevaluatedPropertiesPasses() throws ValidationException {
        // with valid unevaluated properties
        final var schema = UnevaluatedpropertiesSchema.UnevaluatedpropertiesSchema1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, String>(
                    "foo",
                    "foo"
                )
            ),
            configuration
        );
    }
}
