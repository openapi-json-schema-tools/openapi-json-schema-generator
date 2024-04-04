package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class StringTypeMatchesStringsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

    @Test
    public void testAStringIsStillAStringEvenIfItLooksLikeANumberPasses() throws ValidationException {
        // a string is still a string, even if it looks like a number
        final var schema = StringTypeMatchesStrings.StringTypeMatchesStrings1.getInstance();
        schema.validate(
            "1",
            configuration
        );
    }

    @Test
    public void test1IsNotAStringFails() {
        // 1 is not a string
        final var schema = StringTypeMatchesStrings.StringTypeMatchesStrings1.getInstance();
        try {
            schema.validate(
                1,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testABooleanIsNotAStringFails() {
        // a boolean is not a string
        final var schema = StringTypeMatchesStrings.StringTypeMatchesStrings1.getInstance();
        try {
            schema.validate(
                true,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testAnEmptyStringIsStillAStringPasses() throws ValidationException {
        // an empty string is still a string
        final var schema = StringTypeMatchesStrings.StringTypeMatchesStrings1.getInstance();
        schema.validate(
            "",
            configuration
        );
    }

    @Test
    public void testAnArrayIsNotAStringFails() {
        // an array is not a string
        final var schema = StringTypeMatchesStrings.StringTypeMatchesStrings1.getInstance();
        try {
            schema.validate(
                Arrays.asList(
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testAnObjectIsNotAStringFails() {
        // an object is not a string
        final var schema = StringTypeMatchesStrings.StringTypeMatchesStrings1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testNullIsNotAStringFails() {
        // null is not a string
        final var schema = StringTypeMatchesStrings.StringTypeMatchesStrings1.getInstance();
        try {
            schema.validate(
                (Void) null,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testAStringIsAStringPasses() throws ValidationException {
        // a string is a string
        final var schema = StringTypeMatchesStrings.StringTypeMatchesStrings1.getInstance();
        schema.validate(
            "foo",
            configuration
        );
    }

    @Test
    public void testAFloatIsNotAStringFails() {
        // a float is not a string
        final var schema = StringTypeMatchesStrings.StringTypeMatchesStrings1.getInstance();
        try {
            schema.validate(
                1.1d,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }
}
