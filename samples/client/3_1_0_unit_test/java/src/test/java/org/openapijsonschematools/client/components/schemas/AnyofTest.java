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

public class AnyofTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testBothAnyofValidPasses() {
        // both anyOf valid
        final var schema = Anyof.Anyof1.getInstance();
        schema.validate(
            3,
            configuration
        );
    }

    @Test
    public void testNeitherAnyofValidFails() {
        // neither anyOf valid
        final var schema = Anyof.Anyof1.getInstance();
        try {
            schema.validate(
                1.5d,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testFirstAnyofValidPasses() {
        // first anyOf valid
        final var schema = Anyof.Anyof1.getInstance();
        schema.validate(
            1,
            configuration
        );
    }

    @Test
    public void testSecondAnyofValidPasses() {
        // second anyOf valid
        final var schema = Anyof.Anyof1.getInstance();
        schema.validate(
            2.5d,
            configuration
        );
    }
}
