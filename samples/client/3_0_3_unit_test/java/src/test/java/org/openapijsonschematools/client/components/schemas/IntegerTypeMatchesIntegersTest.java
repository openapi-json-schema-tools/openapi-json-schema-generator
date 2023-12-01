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

public class IntegerTypeMatchesIntegersTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testAnObjectIsNotAnIntegerFails() {
        // an object is not an integer
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.class,
            MapMaker.makeMap(
            ),
            configuration
        ));
    }

    @Test
    public void testAnArrayIsNotAnIntegerFails() {
        // an array is not an integer
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.class,
            Arrays.asList(
            ),
            configuration
        ));
    }

    @Test
    public void testNullIsNotAnIntegerFails() {
        // null is not an integer
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.class,
            (Void) null,
            configuration
        ));
    }

    @Test
    public void testAFloatWithZeroFractionalPartIsAnIntegerPasses() {
        // a float with zero fractional part is an integer
        IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.validate(
            1.0,
            configuration
        );
    }

    @Test
    public void testABooleanIsNotAnIntegerFails() {
        // a boolean is not an integer
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.class,
            true,
            configuration
        ));
    }

    @Test
    public void testAStringIsStillNotAnIntegerEvenIfItLooksLikeOneFails() {
        // a string is still not an integer, even if it looks like one
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.class,
            "1",
            configuration
        ));
    }

    @Test
    public void testAStringIsNotAnIntegerFails() {
        // a string is not an integer
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.class,
            "foo",
            configuration
        ));
    }

    @Test
    public void testAnIntegerIsAnIntegerPasses() {
        // an integer is an integer
        IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.validate(
            1,
            configuration
        );
    }

    @Test
    public void testAFloatIsNotAnIntegerFails() {
        // a float is not an integer
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.class,
            1.1,
            configuration
        ));
    }
}
