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

public class BooleanTypeMatchesBooleansTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

    @Test
    public void testAFloatIsNotABooleanFails() {
        // a float is not a boolean
        final var schema = BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.getInstance();
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

    @Test
    public void testAStringIsNotABooleanFails() {
        // a string is not a boolean
        final var schema = BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.getInstance();
        try {
            schema.validate(
                "foo",
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testFalseIsABooleanPasses() throws ValidationException {
        // false is a boolean
        final var schema = BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.getInstance();
        schema.validate(
            false,
            configuration
        );
    }

    @Test
    public void testTrueIsABooleanPasses() throws ValidationException {
        // true is a boolean
        final var schema = BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.getInstance();
        schema.validate(
            true,
            configuration
        );
    }

    @Test
    public void testAnObjectIsNotABooleanFails() {
        // an object is not a boolean
        final var schema = BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.getInstance();
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
    public void testAnArrayIsNotABooleanFails() {
        // an array is not a boolean
        final var schema = BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.getInstance();
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
    public void testNullIsNotABooleanFails() {
        // null is not a boolean
        final var schema = BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.getInstance();
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
    public void testAnIntegerIsNotABooleanFails() {
        // an integer is not a boolean
        final var schema = BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.getInstance();
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
    public void testZeroIsNotABooleanFails() {
        // zero is not a boolean
        final var schema = BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.getInstance();
        try {
            schema.validate(
                0,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testAnEmptyStringIsNotABooleanFails() {
        // an empty string is not a boolean
        final var schema = BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.getInstance();
        try {
            schema.validate(
                "",
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }
}
