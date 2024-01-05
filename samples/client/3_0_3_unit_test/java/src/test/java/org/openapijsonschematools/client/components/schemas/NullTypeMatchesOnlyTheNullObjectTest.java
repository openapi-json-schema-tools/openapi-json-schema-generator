package org.openapijsonschematools.client.components.schemas;

import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.schemas.validation.MapMaker;

import java.util.Arrays;

public class NullTypeMatchesOnlyTheNullObjectTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testZeroIsNotNullFails() {
        // zero is not null
        final var schema = NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.getInstance();
        try {
            schema.validate(
                0,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testAnArrayIsNotNullFails() {
        // an array is not null
        final var schema = NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.getInstance();
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
    public void testAnObjectIsNotNullFails() {
        // an object is not null
        final var schema = NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.getInstance();
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

    @Test
    public void testTrueIsNotNullFails() {
        // true is not null
        final var schema = NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.getInstance();
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
    public void testFalseIsNotNullFails() {
        // false is not null
        final var schema = NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.getInstance();
        try {
            schema.validate(
                false,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testNullIsNullPasses() {
        // null is null
        final var schema = NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.getInstance();
        schema.validate(
            (Void) null,
            configuration
        );
    }

    @Test
    public void testAStringIsNotNullFails() {
        // a string is not null
        final var schema = NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.getInstance();
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
    public void testAnIntegerIsNotNullFails() {
        // an integer is not null
        final var schema = NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.getInstance();
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
    public void testAnEmptyStringIsNotNullFails() {
        // an empty string is not null
        final var schema = NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.getInstance();
        try {
            schema.validate(
                "",
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testAFloatIsNotNullFails() {
        // a float is not null
        final var schema = NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.getInstance();
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
