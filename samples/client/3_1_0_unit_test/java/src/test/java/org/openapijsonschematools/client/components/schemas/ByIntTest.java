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

public class ByIntTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testIntByIntFailFails() {
        // int by int fail
        final var schema = ByInt.ByInt1.getInstance();
        try {
            schema.validate(
                7,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testIntByIntPasses() {
        // int by int
        final var schema = ByInt.ByInt1.getInstance();
        schema.validate(
            10,
            configuration
        );
    }

    @Test
    public void testIgnoresNonNumbersPasses() {
        // ignores non-numbers
        final var schema = ByInt.ByInt1.getInstance();
        schema.validate(
            "foo",
            configuration
        );
    }
}
