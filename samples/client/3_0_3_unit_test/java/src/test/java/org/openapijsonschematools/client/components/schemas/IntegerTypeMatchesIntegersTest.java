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

public class IntegerTypeMatchesIntegersTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1 schema = JsonSchemaFactory.getInstance(
        IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.class
    );

    @Test
    public void testAnObjectIsNotAnIntegerFails() {
        // an object is not an integer
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            MapMaker.makeMap(
            ),
            configuration
        ));
    }

    @Test
    public void testAnArrayIsNotAnIntegerFails() {
        // an array is not an integer
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            Arrays.asList(
            ),
            configuration
        ));
    }

    @Test
    public void testNullIsNotAnIntegerFails() {
        // null is not an integer
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            (Void) null,
            configuration
        ));
    }

    @Test
    public void testAFloatWithZeroFractionalPartIsAnIntegerPasses() {
        // a float with zero fractional part is an integer
        schema.validate(
            1.0d,
            configuration
        );
    }

    @Test
    public void testABooleanIsNotAnIntegerFails() {
        // a boolean is not an integer
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            true,
            configuration
        ));
    }

    @Test
    public void testAStringIsStillNotAnIntegerEvenIfItLooksLikeOneFails() {
        // a string is still not an integer, even if it looks like one
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            "1",
            configuration
        ));
    }

    @Test
    public void testAStringIsNotAnIntegerFails() {
        // a string is not an integer
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            "foo",
            configuration
        ));
    }

    @Test
    public void testAnIntegerIsAnIntegerPasses() {
        // an integer is an integer
        schema.validate(
            1,
            configuration
        );
    }

    @Test
    public void testAFloatIsNotAnIntegerFails() {
        // a float is not an integer
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            1.1d,
            configuration
        ));
    }
}
