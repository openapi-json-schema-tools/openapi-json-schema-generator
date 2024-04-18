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

public class UnevaluatedpropertiesWithAdjacentAdditionalpropertiesTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testWithAdditionalPropertiesPasses() throws ValidationException {
        // with additional properties
        final var schema = UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedpropertiesWithAdjacentAdditionalproperties1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, String>(
                    "foo",
                    "foo"
                ),
                new AbstractMap.SimpleEntry<String, String>(
                    "bar",
                    "bar"
                )
            ),
            configuration
        );
    }

    @Test
    public void testWithNoAdditionalPropertiesPasses() throws ValidationException {
        // with no additional properties
        final var schema = UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedpropertiesWithAdjacentAdditionalproperties1.getInstance();
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
