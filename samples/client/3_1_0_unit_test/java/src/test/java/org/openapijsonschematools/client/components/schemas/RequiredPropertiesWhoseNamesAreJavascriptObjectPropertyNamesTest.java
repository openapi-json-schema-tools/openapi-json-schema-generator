package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testTostringPresentFails() {
        // toString present
        final var schema = RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<>(
                        "toString",
                        MapUtils.makeMap(
                            new AbstractMap.SimpleEntry<>(
                                "length",
                                37
                            )
                        )
                    )
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testNoneOfThePropertiesMentionedFails() {
        // none of the properties mentioned
        final var schema = RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testIgnoresOtherNonObjectsPasses() {
        // ignores other non-objects
        final var schema = RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1.getInstance();
        schema.validate(
            12,
            configuration
        );
    }

    @Test
    public void testConstructorPresentFails() {
        // constructor present
        final var schema = RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<>(
                        "constructor",
                        MapUtils.makeMap(
                            new AbstractMap.SimpleEntry<>(
                                "length",
                                37
                            )
                        )
                    )
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testAllPresentPasses() {
        // all present
        final var schema = RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Object>(
                    "__proto__",
                    12
                ),
                new AbstractMap.SimpleEntry<String, Object>(
                    "toString",
                    MapUtils.makeMap(
                        new AbstractMap.SimpleEntry<>(
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
    public void testProtoPresentFails() {
        // __proto__ present
        final var schema = RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<>(
                        "__proto__",
                        "foo"
                    )
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testIgnoresArraysPasses() {
        // ignores arrays
        final var schema = RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1.getInstance();
        schema.validate(
            Arrays.asList(
            ),
            configuration
        );
    }
}
