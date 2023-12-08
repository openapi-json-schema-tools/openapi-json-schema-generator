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

public class NumberTypeMatchesNumbersTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1 schema = JsonSchemaFactory.getInstance(
        NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.class
    );

    @Test
    public void testAFloatIsANumberPasses() {
        // a float is a number
        schema.validate(
            1.1d,
            configuration
        );
    }

    @Test
    public void testAnIntegerIsANumberPasses() {
        // an integer is a number
        schema.validate(
            1,
            configuration
        );
    }

    @Test
    public void testAStringIsStillNotANumberEvenIfItLooksLikeOneFails() {
        // a string is still not a number, even if it looks like one
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            "1",
            configuration
        ));
    }

    @Test
    public void testABooleanIsNotANumberFails() {
        // a boolean is not a number
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            true,
            configuration
        ));
    }

    @Test
    public void testAFloatWithZeroFractionalPartIsANumberAndAnIntegerPasses() {
        // a float with zero fractional part is a number (and an integer)
        schema.validate(
            1.0d,
            configuration
        );
    }

    @Test
    public void testNullIsNotANumberFails() {
        // null is not a number
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            (Void) null,
            configuration
        ));
    }

    @Test
    public void testAStringIsNotANumberFails() {
        // a string is not a number
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            "foo",
            configuration
        ));
    }

    @Test
    public void testAnArrayIsNotANumberFails() {
        // an array is not a number
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            Arrays.asList(
            ),
            configuration
        ));
    }

    @Test
    public void testAnObjectIsNotANumberFails() {
        // an object is not a number
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            MapMaker.makeMap(
            ),
            configuration
        ));
    }
}
