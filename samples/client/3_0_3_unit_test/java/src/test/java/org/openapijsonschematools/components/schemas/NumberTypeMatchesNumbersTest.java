package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.MapMaker;

import java.util.Arrays;
import java.util.List;
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
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.class,
            "1",
            configuration
        ));
    }

    @Test
    public void testABooleanIsNotANumberFails() {
        // a boolean is not a number
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.class,
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
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.class,
            (Void) null,
            configuration
        ));
    }

    @Test
    public void testAStringIsNotANumberFails() {
        // a string is not a number
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.class,
            "foo",
            configuration
        ));
    }

    @Test
    public void testAnArrayIsNotANumberFails() {
        // an array is not a number
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.class,
            Arrays.asList(
            ),
            configuration
        ));
    }

    @Test
    public void testAnObjectIsNotANumberFails() {
        // an object is not a number
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.class,
            MapMaker.makeMap(
            ),
            configuration
        ));
    }
}
