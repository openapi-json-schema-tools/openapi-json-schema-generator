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

public class StringTypeMatchesStringsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testAStringIsStillAStringEvenIfItLooksLikeANumberPasses() {
        // a string is still a string, even if it looks like a number
        StringTypeMatchesStrings.StringTypeMatchesStrings1.validate(
            "1",
            configuration
        );
    }

    @Test
    public void test1IsNotAStringFails() {
        // 1 is not a string
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            StringTypeMatchesStrings.StringTypeMatchesStrings1.class,
            1,
            configuration
        ));
    }

    @Test
    public void testABooleanIsNotAStringFails() {
        // a boolean is not a string
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            StringTypeMatchesStrings.StringTypeMatchesStrings1.class,
            true,
            configuration
        ));
    }

    @Test
    public void testAnEmptyStringIsStillAStringPasses() {
        // an empty string is still a string
        StringTypeMatchesStrings.StringTypeMatchesStrings1.validate(
            "",
            configuration
        );
    }

    @Test
    public void testAnArrayIsNotAStringFails() {
        // an array is not a string
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            StringTypeMatchesStrings.StringTypeMatchesStrings1.class,
            Arrays.asList(
            ),
            configuration
        ));
    }

    @Test
    public void testAnObjectIsNotAStringFails() {
        // an object is not a string
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            StringTypeMatchesStrings.StringTypeMatchesStrings1.class,
            MapMaker.makeMap(
            ),
            configuration
        ));
    }

    @Test
    public void testNullIsNotAStringFails() {
        // null is not a string
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            StringTypeMatchesStrings.StringTypeMatchesStrings1.class,
            (Void) null,
            configuration
        ));
    }

    @Test
    public void testAStringIsAStringPasses() {
        // a string is a string
        StringTypeMatchesStrings.StringTypeMatchesStrings1.validate(
            "foo",
            configuration
        );
    }

    @Test
    public void testAFloatIsNotAStringFails() {
        // a float is not a string
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            StringTypeMatchesStrings.StringTypeMatchesStrings1.class,
            1.1d,
            configuration
        ));
    }
}
