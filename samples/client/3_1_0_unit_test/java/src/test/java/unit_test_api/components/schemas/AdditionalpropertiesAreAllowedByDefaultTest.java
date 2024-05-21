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

public class AdditionalpropertiesAreAllowedByDefaultTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testAdditionalPropertiesAreAllowedPasses() throws ValidationException {
        // additional properties are allowed
        final var schema = AdditionalpropertiesAreAllowedByDefault.AdditionalpropertiesAreAllowedByDefault1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Object>(
                    "foo",
                    1
                ),
                new AbstractMap.SimpleEntry<String, Object>(
                    "bar",
                    2
                ),
                new AbstractMap.SimpleEntry<String, Object>(
                    "quux",
                    true
                )
            ),
            configuration
        );
    }
}
