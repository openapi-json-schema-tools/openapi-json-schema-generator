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

public class ArrayTypeMatchesArraysTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testABooleanIsNotAnArrayFails() {
        // a boolean is not an array
        final var schema = ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            true,
            validationMetadata
        ));
    }

    @Test
    public void testAFloatIsNotAnArrayFails() {
        // a float is not an array
        final var schema = ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            1.1d,
            validationMetadata
        ));
    }

    @Test
    public void testAnArrayIsAnArrayPasses() {
        // an array is an array
        final var schema = ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.getInstance();
        schema.validate(
            Arrays.asList(
            ),
            configuration
        );
    }

    @Test
    public void testNullIsNotAnArrayFails() {
        // null is not an array
        final var schema = ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            (Void) null,
            validationMetadata
        ));
    }

    @Test
    public void testAStringIsNotAnArrayFails() {
        // a string is not an array
        final var schema = ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            "foo",
            validationMetadata
        ));
    }

    @Test
    public void testAnIntegerIsNotAnArrayFails() {
        // an integer is not an array
        final var schema = ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            1,
            validationMetadata
        ));
    }

    @Test
    public void testAnObjectIsNotAnArrayFails() {
        // an object is not an array
        final var schema = ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            MapMaker.makeMap(
            ),
            validationMetadata
        ));
    }
}
