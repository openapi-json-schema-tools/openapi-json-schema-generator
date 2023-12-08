package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.MapMaker;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

public class EnumsInPropertiesTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final EnumsInProperties.EnumsInProperties1 schema = JsonSchemaFactory.getInstance(
        EnumsInProperties.EnumsInProperties1.class
    );

    @Test
    public void testWrongBarValueFails() {
        // wrong bar value
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
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
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
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
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            MapMaker.makeMap(
            ),
            configuration
        ));
    }

    @Test
    public void testBothPropertiesAreValidPasses() {
        // both properties are valid
        schema.validate(
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
        schema.validate(
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
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
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
