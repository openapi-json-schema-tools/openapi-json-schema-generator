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

public class ArrayTypeMatchesArraysTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testABooleanIsNotAnArrayFails() {
        // a boolean is not an array
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.class,
            true,
            configuration
        ));
    }

    @Test
    public void testAFloatIsNotAnArrayFails() {
        // a float is not an array
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.class,
            1.1d,
            configuration
        ));
    }

    @Test
    public void testAnArrayIsAnArrayPasses() {
        // an array is an array
        ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.validate(
            Arrays.asList(
            ),
            configuration
        );
    }

    @Test
    public void testNullIsNotAnArrayFails() {
        // null is not an array
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.class,
            (Void) null,
            configuration
        ));
    }

    @Test
    public void testAStringIsNotAnArrayFails() {
        // a string is not an array
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.class,
            "foo",
            configuration
        ));
    }

    @Test
    public void testAnIntegerIsNotAnArrayFails() {
        // an integer is not an array
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.class,
            1,
            configuration
        ));
    }

    @Test
    public void testAnObjectIsNotAnArrayFails() {
        // an object is not an array
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.class,
            MapMaker.makeMap(
            ),
            configuration
        ));
    }
}
