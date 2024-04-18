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

public class EnumsInPropertiesTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testWrongBarValueFails() {
        // wrong bar value
        final var schema = EnumsInProperties.EnumsInProperties1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, String>(
                        "foo",
                        "foo"
                    ),
                    new AbstractMap.SimpleEntry<String, String>(
                        "bar",
                        "bart"
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
    public void testWrongFooValueFails() {
        // wrong foo value
        final var schema = EnumsInProperties.EnumsInProperties1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, String>(
                        "foo",
                        "foot"
                    ),
                    new AbstractMap.SimpleEntry<String, String>(
                        "bar",
                        "bar"
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
    public void testMissingAllPropertiesIsInvalidFails() {
        // missing all properties is invalid
        final var schema = EnumsInProperties.EnumsInProperties1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testBothPropertiesAreValidPasses() throws ValidationException {
        // both properties are valid
        final var schema = EnumsInProperties.EnumsInProperties1.getInstance();
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
    public void testMissingOptionalPropertyIsValidPasses() throws ValidationException {
        // missing optional property is valid
        final var schema = EnumsInProperties.EnumsInProperties1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, String>(
                    "bar",
                    "bar"
                )
            ),
            configuration
        );
    }

    @Test
    public void testMissingRequiredPropertyIsInvalidFails() {
        // missing required property is invalid
        final var schema = EnumsInProperties.EnumsInProperties1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, String>(
                        "foo",
                        "foo"
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
