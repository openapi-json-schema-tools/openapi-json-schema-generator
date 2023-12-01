package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.MapMaker;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

public class EnumsInPropertiesTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testWrongBarValueFails() {
        // wrong bar value
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            EnumsInProperties.EnumsInProperties1.class,
            MapMaker.makeMap(
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
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            EnumsInProperties.EnumsInProperties1.class,
            MapMaker.makeMap(
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
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            EnumsInProperties.EnumsInProperties1.class,
            MapMaker.makeMap(
            ),
            configuration
        ));
    }

    @Test
    public void testBothPropertiesAreValidPasses() {
        // both properties are valid
        EnumsInProperties.EnumsInProperties1.validate(
            MapMaker.makeMap(
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
            MapMaker.makeMap(
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
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            EnumsInProperties.EnumsInProperties1.class,
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    "foo"
                )
            ),
            configuration
        ));
    }
}
