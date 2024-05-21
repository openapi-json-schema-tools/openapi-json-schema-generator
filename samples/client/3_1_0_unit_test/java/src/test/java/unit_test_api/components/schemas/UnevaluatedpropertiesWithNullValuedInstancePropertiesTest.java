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

public class UnevaluatedpropertiesWithNullValuedInstancePropertiesTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testAllowsNullValuedPropertiesPasses() throws ValidationException {
        // allows null valued properties
        final var schema = UnevaluatedpropertiesWithNullValuedInstanceProperties.UnevaluatedpropertiesWithNullValuedInstanceProperties1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Void>(
                    "foo",
                    null
                )
            ),
            configuration
        );
    }
}
