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

public class EnumWithFalseDoesNotMatch0Test {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testFloatZeroIsInvalidFails() {
        // float zero is invalid
        final var schema = EnumWithFalseDoesNotMatch0.EnumWithFalseDoesNotMatch01.getInstance();
        try {
            schema.validate(
                0.0d,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testFalseIsValidPasses() {
        // false is valid
        final var schema = EnumWithFalseDoesNotMatch0.EnumWithFalseDoesNotMatch01.getInstance();
        schema.validate(
            false,
            configuration
        );
    }

    @Test
    public void testIntegerZeroIsInvalidFails() {
        // integer zero is invalid
        final var schema = EnumWithFalseDoesNotMatch0.EnumWithFalseDoesNotMatch01.getInstance();
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
}
