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

public class PropertiesWhoseNamesAreJavascriptObjectPropertyNamesTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testProtoNotValidFails() {
        // __proto__ not valid
        final var schema = PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNames1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, String>(
                        "__proto__",
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

    @Test
    public void testNoneOfThePropertiesMentionedPasses() throws ValidationException {
        // none of the properties mentioned
        final var schema = PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNames1.getInstance();
        schema.validate(
            MapUtils.makeMap(
            ),
            configuration
        );
    }

    @Test
    public void testIgnoresOtherNonObjectsPasses() throws ValidationException {
        // ignores other non-objects
        final var schema = PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNames1.getInstance();
        schema.validate(
            12,
            configuration
        );
    }

    @Test
    public void testAllPresentAndValidPasses() throws ValidationException {
        // all present and valid
        final var schema = PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNames1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Object>(
                    "__proto__",
                    12
                ),
                new AbstractMap.SimpleEntry<String, Object>(
                    "toString",
                    MapUtils.makeMap(
                        new AbstractMap.SimpleEntry<String, String>(
                            "length",
                            "foo"
                        )
                    )
                ),
                new AbstractMap.SimpleEntry<String, Object>(
                    "constructor",
                    37
                )
            ),
            configuration
        );
    }

    @Test
    public void testConstructorNotValidFails() {
        // constructor not valid
        final var schema = PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNames1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Map<String, ?>>(
                        "constructor",
                        MapUtils.makeMap(
                            new AbstractMap.SimpleEntry<String, Number>(
                                "length",
                                37
                            )
                        )
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
    public void testIgnoresArraysPasses() throws ValidationException {
        // ignores arrays
        final var schema = PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNames1.getInstance();
        schema.validate(
            Arrays.asList(
            ),
            configuration
        );
    }

    @Test
    public void testTostringNotValidFails() {
        // toString not valid
        final var schema = PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNames1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Map<String, ?>>(
                        "toString",
                        MapUtils.makeMap(
                            new AbstractMap.SimpleEntry<String, Number>(
                                "length",
                                37
                            )
                        )
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
