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

public class ContainsWithNullInstanceElementsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testAllowsNullItemsPasses() throws ValidationException {
        // allows null items
        final var schema = ContainsWithNullInstanceElements.ContainsWithNullInstanceElements1.getInstance();
        schema.validate(
            Arrays.asList(
                (Void) null
            ),
            configuration
        );
    }
}
