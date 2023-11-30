package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class IntegerTypeMatchesIntegersTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testAnObjectIsNotAnIntegerFails() {
        // an object is not an integer
        Assert.assertThrows(ValidationException.class, () -> IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.validate(
            Map.ofEntries(
            ),
            configuration
        ));
    }

    @Test
    public void testAnArrayIsNotAnIntegerFails() {
        // an array is not an integer
        Assert.assertThrows(ValidationException.class, () -> IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.validate(
            List.of(
            ),
            configuration
        ));
    }

    @Test
    public void testNullIsNotAnIntegerFails() {
        // null is not an integer
        Assert.assertThrows(ValidationException.class, () -> IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.validate(
            null,
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
        Assert.assertThrows(ValidationException.class, () -> IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.validate(
            true,
            configuration
        ));
    }

    @Test
    public void testAStringIsStillNotAnIntegerEvenIfItLooksLikeOneFails() {
        // a string is still not an integer, even if it looks like one
        Assert.assertThrows(ValidationException.class, () -> IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.validate(
            "1",
            configuration
        ));
    }

    @Test
    public void testAStringIsNotAnIntegerFails() {
        // a string is not an integer
        Assert.assertThrows(ValidationException.class, () -> IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.validate(
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
        Assert.assertThrows(ValidationException.class, () -> IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.validate(
            1.1,
            configuration
        ));
    }
}
