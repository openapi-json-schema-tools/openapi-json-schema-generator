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

public class ArrayTypeMatchesArraysTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1 schema = JsonSchemaFactory.getInstance(
        ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.class
    );

    @Test
    public void testABooleanIsNotAnArrayFails() {
        // a boolean is not an array
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            true,
            configuration
        ));
    }

    @Test
    public void testAFloatIsNotAnArrayFails() {
        // a float is not an array
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            1.1d,
            configuration
        ));
    }

    @Test
    public void testAnArrayIsAnArrayPasses() {
        // an array is an array
        schema.validate(
            Arrays.asList(
            ),
            configuration
        );
    }

    @Test
    public void testNullIsNotAnArrayFails() {
        // null is not an array
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            (Void) null,
            configuration
        ));
    }

    @Test
    public void testAStringIsNotAnArrayFails() {
        // a string is not an array
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            "foo",
            configuration
        ));
    }

    @Test
    public void testAnIntegerIsNotAnArrayFails() {
        // an integer is not an array
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            1,
            configuration
        ));
    }

    @Test
    public void testAnObjectIsNotAnArrayFails() {
        // an object is not an array
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            MapMaker.makeMap(
            ),
            configuration
        ));
    }
}
