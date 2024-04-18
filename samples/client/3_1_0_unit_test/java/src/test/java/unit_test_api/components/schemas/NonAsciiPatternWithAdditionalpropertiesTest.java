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

public class NonAsciiPatternWithAdditionalpropertiesTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testNotMatchingThePatternIsInvalidFails() {
        // not matching the pattern is invalid
        final var schema = NonAsciiPatternWithAdditionalproperties.NonAsciiPatternWithAdditionalproperties1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Number>(
                        "élmény",
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

    @Test
    public void testMatchingThePatternIsValidPasses() throws ValidationException {
        // matching the pattern is valid
        final var schema = NonAsciiPatternWithAdditionalproperties.NonAsciiPatternWithAdditionalproperties1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Number>(
                    "ármányos",
                    2
                )
            ),
            configuration
        );
    }
}
