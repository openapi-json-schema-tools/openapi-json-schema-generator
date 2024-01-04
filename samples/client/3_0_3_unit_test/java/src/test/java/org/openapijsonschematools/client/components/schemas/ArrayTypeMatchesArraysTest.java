package org.openapijsonschematools.client.components.schemas;

import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.schemas.validation.MapMaker;

import java.util.Arrays;

public class ArrayTypeMatchesArraysTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testABooleanIsNotAnArrayFails() {
        // a boolean is not an array
        final var schema = ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.getInstance();
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
    public void testAFloatIsNotAnArrayFails() {
        // a float is not an array
        final var schema = ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.getInstance();
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

    @Test
    public void testAnArrayIsAnArrayPasses() {
        // an array is an array
        final var schema = ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.getInstance();
        schema.validate(
            new ArrayTypeMatchesArrays.ArrayTypeMatchesArraysListBuilder(
                Arrays.asList(
                )
            ).build(),
            configuration
        );
    }

    @Test
    public void testNullIsNotAnArrayFails() {
        // null is not an array
        final var schema = ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.getInstance();
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
    public void testAStringIsNotAnArrayFails() {
        // a string is not an array
        final var schema = ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.getInstance();
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
    public void testAnIntegerIsNotAnArrayFails() {
        // an integer is not an array
        final var schema = ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.getInstance();
        try {
            schema.validate(
                1,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testAnObjectIsNotAnArrayFails() {
        // an object is not an array
        final var schema = ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.getInstance();
        try {
            schema.validate(
                MapMaker.makeMap(
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }
}
