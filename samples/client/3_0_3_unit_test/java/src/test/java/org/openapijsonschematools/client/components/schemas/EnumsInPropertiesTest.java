package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;
import java.util.LinkedHashSet;

public class EnumsInPropertiesTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testWrongBarValueFails() {
        // wrong bar value
        final var schema = EnumsInProperties.EnumsInProperties1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
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
            validationMetadata
        ));
    }

    @Test
    public void testWrongFooValueFails() {
        // wrong foo value
        final var schema = EnumsInProperties.EnumsInProperties1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
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
            validationMetadata
        ));
    }

    @Test
    public void testMissingAllPropertiesIsInvalidFails() {
        // missing all properties is invalid
        final var schema = EnumsInProperties.EnumsInProperties1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            MapMaker.makeMap(
            ),
            validationMetadata
        ));
    }

    @Test
    public void testBothPropertiesAreValidPasses() {
        // both properties are valid
        final var schema = EnumsInProperties.EnumsInProperties1.getInstance();
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
        final var schema = EnumsInProperties.EnumsInProperties1.getInstance();
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
        final var schema = EnumsInProperties.EnumsInProperties1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    "foo"
                )
            ),
            validationMetadata
        ));
    }
}
