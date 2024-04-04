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

public class OneofTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

    @Test
    public void testBothOneofValidFails() {
        // both oneOf valid
        final var schema = Oneof.Oneof1.getInstance();
        try {
            schema.validate(
                3,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testNeitherOneofValidFails() {
        // neither oneOf valid
        final var schema = Oneof.Oneof1.getInstance();
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
    public void testSecondOneofValidPasses() {
        // second oneOf valid
        final var schema = Oneof.Oneof1.getInstance();
        schema.validate(
            2.5d,
            configuration
        );
    }

    @Test
    public void testFirstOneofValidPasses() {
        // first oneOf valid
        final var schema = Oneof.Oneof1.getInstance();
        schema.validate(
            1,
            configuration
        );
    }
}
