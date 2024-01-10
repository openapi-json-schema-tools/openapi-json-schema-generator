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

public class NotMultipleTypesTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testOtherMismatchFails() {
        // other mismatch
        final var schema = NotMultipleTypes.NotMultipleTypes1.getInstance();
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
    public void testValidPasses() {
        // valid
        final var schema = NotMultipleTypes.NotMultipleTypes1.getInstance();
        schema.validate(
            "foo",
            configuration
        );
    }

    @Test
    public void testMismatchFails() {
        // mismatch
        final var schema = NotMultipleTypes.NotMultipleTypes1.getInstance();
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
}
