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

public class PropertyNamedRefThatIsNotAReferenceTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testPropertyNamedRefValidPasses() throws ValidationException {
        // property named $ref valid
        final var schema = PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, String>(
                    "$ref",
                    "a"
                )
            ),
            configuration
        );
    }

    @Test
    public void testPropertyNamedRefInvalidFails() {
        // property named $ref invalid
        final var schema = PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Number>(
                        "$ref",
                        2
                    )
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }
}
