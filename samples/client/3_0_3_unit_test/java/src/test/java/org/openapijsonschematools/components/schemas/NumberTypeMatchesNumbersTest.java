package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class NumberTypeMatchesNumbersTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testAFloatIsANumberPasses() {
        // a float is a number
        NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.validate(
            1.1,
            configuration
        );
    }

    @Test
    public void testAnIntegerIsANumberPasses() {
        // an integer is a number
        NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.validate(
            1,
            configuration
        );
    }

    @Test
    public void testAStringIsStillNotANumberEvenIfItLooksLikeOneFails() {
        // a string is still not a number, even if it looks like one
        Assert.assertThrows(ValidationException.class, () -> NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.validate(
            "1",
            configuration
        ));
    }

    @Test
    public void testABooleanIsNotANumberFails() {
        // a boolean is not a number
        Assert.assertThrows(ValidationException.class, () -> NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.validate(
            true,
            configuration
        ));
    }

    @Test
    public void testAFloatWithZeroFractionalPartIsANumberAndAnIntegerPasses() {
        // a float with zero fractional part is a number (and an integer)
        NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.validate(
            1.0,
            configuration
        );
    }

    @Test
    public void testNullIsNotANumberFails() {
        // null is not a number
        Assert.assertThrows(ValidationException.class, () -> NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.validate(
            null,
            configuration
        ));
    }

    @Test
    public void testAStringIsNotANumberFails() {
        // a string is not a number
        Assert.assertThrows(ValidationException.class, () -> NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.validate(
            "foo",
            configuration
        ));
    }

    @Test
    public void testAnArrayIsNotANumberFails() {
        // an array is not a number
        Assert.assertThrows(ValidationException.class, () -> NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.validate(
            List.of(
            ),
            configuration
        ));
    }

    @Test
    public void testAnObjectIsNotANumberFails() {
        // an object is not a number
        Assert.assertThrows(ValidationException.class, () -> NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.validate(
            Map.ofEntries(
            ),
            configuration
        ));
    }
}
