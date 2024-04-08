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

public class MultipleTypesCanBeSpecifiedInAnArrayTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testNullIsInvalidFails() {
        // null is invalid
        final var schema = MultipleTypesCanBeSpecifiedInAnArray.MultipleTypesCanBeSpecifiedInAnArray1.getInstance();
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
    public void testAnIntegerIsValidPasses() throws ValidationException {
        // an integer is valid
        final var schema = MultipleTypesCanBeSpecifiedInAnArray.MultipleTypesCanBeSpecifiedInAnArray1.getInstance();
        schema.validate(
            1,
            configuration
        );
    }

    @Test
    public void testAnArrayIsInvalidFails() {
        // an array is invalid
        final var schema = MultipleTypesCanBeSpecifiedInAnArray.MultipleTypesCanBeSpecifiedInAnArray1.getInstance();
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
    public void testABooleanIsInvalidFails() {
        // a boolean is invalid
        final var schema = MultipleTypesCanBeSpecifiedInAnArray.MultipleTypesCanBeSpecifiedInAnArray1.getInstance();
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
    public void testAFloatIsInvalidFails() {
        // a float is invalid
        final var schema = MultipleTypesCanBeSpecifiedInAnArray.MultipleTypesCanBeSpecifiedInAnArray1.getInstance();
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
    public void testAStringIsValidPasses() throws ValidationException {
        // a string is valid
        final var schema = MultipleTypesCanBeSpecifiedInAnArray.MultipleTypesCanBeSpecifiedInAnArray1.getInstance();
        schema.validate(
            "foo",
            configuration
        );
    }

    @Test
    public void testAnObjectIsInvalidFails() {
        // an object is invalid
        final var schema = MultipleTypesCanBeSpecifiedInAnArray.MultipleTypesCanBeSpecifiedInAnArray1.getInstance();
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
}
