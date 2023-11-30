package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class EnumsInPropertiesTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testWrongBarValueFails() {
        // wrong bar value
        Assert.assertThrows(ValidationException.class, () -> EnumsInProperties.EnumsInProperties1.validate(
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    "foo"
                ),
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    "bart"
                )
            ),
            configuration
        ));
    }

    @Test
    public void testWrongFooValueFails() {
        // wrong foo value
        Assert.assertThrows(ValidationException.class, () -> EnumsInProperties.EnumsInProperties1.validate(
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    "foot"
                ),
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    "bar"
                )
            ),
            configuration
        ));
    }

    @Test
    public void testMissingAllPropertiesIsInvalidFails() {
        // missing all properties is invalid
        Assert.assertThrows(ValidationException.class, () -> EnumsInProperties.EnumsInProperties1.validate(
            Map.ofEntries(
            ),
            configuration
        ));
    }

    @Test
    public void testBothPropertiesAreValidPasses() {
        // both properties are valid
        EnumsInProperties.EnumsInProperties1.validate(
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    "foo"
                ),
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    "bar"
                )
            ),
            configuration
        );
    }

    @Test
    public void testMissingOptionalPropertyIsValidPasses() {
        // missing optional property is valid
        EnumsInProperties.EnumsInProperties1.validate(
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>(
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
        Assert.assertThrows(ValidationException.class, () -> EnumsInProperties.EnumsInProperties1.validate(
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    "foo"
                )
            ),
            configuration
        ));
    }
}
