package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class IntegerTypeMatchesIntegersTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

    @Test
    public void testAnObjectIsNotAnIntegerFails() {
        // an object is not an integer
        final var schema = IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testAnArrayIsNotAnIntegerFails() {
        // an array is not an integer
        final var schema = IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.getInstance();
        try {
            schema.validate(
                Arrays.asList(
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testNullIsNotAnIntegerFails() {
        // null is not an integer
        final var schema = IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.getInstance();
        try {
            schema.validate(
                (Void) null,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testAFloatWithZeroFractionalPartIsAnIntegerPasses() throws ValidationException, InvalidTypeException {
        // a float with zero fractional part is an integer
        final var schema = IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.getInstance();
        schema.validate(
            1.0d,
            configuration
        );
    }

    @Test
    public void testABooleanIsNotAnIntegerFails() {
        // a boolean is not an integer
        final var schema = IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.getInstance();
        try {
            schema.validate(
                true,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testAStringIsStillNotAnIntegerEvenIfItLooksLikeOneFails() {
        // a string is still not an integer, even if it looks like one
        final var schema = IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.getInstance();
        try {
            schema.validate(
                "1",
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testAStringIsNotAnIntegerFails() {
        // a string is not an integer
        final var schema = IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.getInstance();
        try {
            schema.validate(
                "foo",
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testAnIntegerIsAnIntegerPasses() throws ValidationException, InvalidTypeException {
        // an integer is an integer
        final var schema = IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.getInstance();
        schema.validate(
            1,
            configuration
        );
    }

    @Test
    public void testAFloatIsNotAnIntegerFails() {
        // a float is not an integer
        final var schema = IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.getInstance();
        try {
            schema.validate(
                1.1d,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }
}
