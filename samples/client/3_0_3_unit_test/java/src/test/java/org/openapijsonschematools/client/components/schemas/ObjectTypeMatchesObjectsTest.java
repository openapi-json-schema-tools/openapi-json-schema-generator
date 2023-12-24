package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class ObjectTypeMatchesObjectsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testAnObjectIsAnObjectPasses() {
        // an object is an object
        final var schema = ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.getInstance();
        schema.validate(
            MapMaker.makeMap(
            ),
            configuration
        );
    }

    @Test
    public void testAnArrayIsNotAnObjectFails() {
        // an array is not an object
        final var schema = ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.getInstance();
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
    public void testAnIntegerIsNotAnObjectFails() {
        // an integer is not an object
        final var schema = ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.getInstance();
        try {
            schema.validate(
                1L,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testABooleanIsNotAnObjectFails() {
        // a boolean is not an object
        final var schema = ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.getInstance();
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
    public void testAStringIsNotAnObjectFails() {
        // a string is not an object
        final var schema = ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.getInstance();
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
    public void testAFloatIsNotAnObjectFails() {
        // a float is not an object
        final var schema = ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.getInstance();
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
    public void testNullIsNotAnObjectFails() {
        // null is not an object
        final var schema = ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.getInstance();
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
}
