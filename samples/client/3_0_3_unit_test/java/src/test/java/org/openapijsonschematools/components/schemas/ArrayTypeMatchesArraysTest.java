package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.JsonSchema;

import java.util.Arrays;
import java.util.Map;
import java.util.AbstractMap;

public class ArrayTypeMatchesArraysTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testABooleanIsNotAnArrayFails() {
        // a boolean is not an array
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.class,
            true,
            configuration
        ));
    }

    @Test
    public void testAFloatIsNotAnArrayFails() {
        // a float is not an array
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.class,
            1.1,
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
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.class,
            (Void) null,
            configuration
        ));
    }

    @Test
    public void testAStringIsNotAnArrayFails() {
        // a string is not an array
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.class,
            "foo",
            configuration
        ));
    }

    @Test
    public void testAnIntegerIsNotAnArrayFails() {
        // an integer is not an array
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.class,
            1,
            configuration
        ));
    }

    @Test
    public void testAnObjectIsNotAnArrayFails() {
        // an object is not an array
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.class,
            Map.ofEntries(
            ),
            configuration
        ));
    }
}
