package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.MapBuilder;

import java.util.Arrays;
import java.util.AbstractMap;

public class EnumsInPropertiesTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testWrongBarValueFails() {
        // wrong bar value
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            EnumsInProperties.EnumsInProperties1.class,
            MapBuilder.of(Arrays.asList(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    "foo"
                ),
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    "bart"
                )
            )),
            configuration
        ));
    }

    @Test
    public void testWrongFooValueFails() {
        // wrong foo value
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            EnumsInProperties.EnumsInProperties1.class,
            MapBuilder.of(Arrays.asList(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    "foot"
                ),
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    "bar"
                )
            )),
            configuration
        ));
    }

    @Test
    public void testMissingAllPropertiesIsInvalidFails() {
        // missing all properties is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            EnumsInProperties.EnumsInProperties1.class,
            MapBuilder.of(Arrays.asList(
            )),
            configuration
        ));
    }

    @Test
    public void testBothPropertiesAreValidPasses() {
        // both properties are valid
        // payload type = object
        // dataType =
        EnumsInProperties.EnumsInProperties1.validate(
            MapBuilder.of(Arrays.asList(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    "foo"
                ),
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    "bar"
                )
            )),
            configuration
        );
    }

    @Test
    public void testMissingOptionalPropertyIsValidPasses() {
        // missing optional property is valid
        // payload type = object
        // dataType =
        EnumsInProperties.EnumsInProperties1.validate(
            MapBuilder.of(Arrays.asList(
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    "bar"
                )
            )),
            configuration
        );
    }

    @Test
    public void testMissingRequiredPropertyIsInvalidFails() {
        // missing required property is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            EnumsInProperties.EnumsInProperties1.class,
            MapBuilder.of(Arrays.asList(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    "foo"
                )
            )),
            configuration
        ));
    }
}
