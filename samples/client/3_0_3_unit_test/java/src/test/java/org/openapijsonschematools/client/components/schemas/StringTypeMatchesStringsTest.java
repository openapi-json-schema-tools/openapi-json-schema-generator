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

public class StringTypeMatchesStringsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final StringTypeMatchesStrings.StringTypeMatchesStrings1 schema = JsonSchemaFactory.getInstance(
        StringTypeMatchesStrings.StringTypeMatchesStrings1.class
    );

    @Test
    public void testAStringIsStillAStringEvenIfItLooksLikeANumberPasses() {
        // a string is still a string, even if it looks like a number
        schema.validate(
            "1",
            configuration
        );
    }

    @Test
    public void test1IsNotAStringFails() {
        // 1 is not a string
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            1,
            configuration
        ));
    }

    @Test
    public void testABooleanIsNotAStringFails() {
        // a boolean is not a string
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            true,
            configuration
        ));
    }

    @Test
    public void testAnEmptyStringIsStillAStringPasses() {
        // an empty string is still a string
        schema.validate(
            "",
            configuration
        );
    }

    @Test
    public void testAnArrayIsNotAStringFails() {
        // an array is not a string
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            Arrays.asList(
            ),
            configuration
        ));
    }

    @Test
    public void testAnObjectIsNotAStringFails() {
        // an object is not a string
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            MapMaker.makeMap(
            ),
            configuration
        ));
    }

    @Test
    public void testNullIsNotAStringFails() {
        // null is not a string
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            (Void) null,
            configuration
        ));
    }

    @Test
    public void testAStringIsAStringPasses() {
        // a string is a string
        schema.validate(
            "foo",
            configuration
        );
    }

    @Test
    public void testAFloatIsNotAStringFails() {
        // a float is not a string
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            1.1d,
            configuration
        ));
    }
}
