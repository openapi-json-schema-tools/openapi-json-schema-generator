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

public class IfAndThenWithoutElseTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

    @Test
    public void testValidThroughThenPasses() {
        // valid through then
        final var schema = IfAndThenWithoutElse.IfAndThenWithoutElse1.getInstance();
        schema.validate(
            -1,
            configuration
        );
    }

    @Test
    public void testInvalidThroughThenFails() {
        // invalid through then
        final var schema = IfAndThenWithoutElse.IfAndThenWithoutElse1.getInstance();
        try {
            schema.validate(
                -100,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testValidWhenIfTestFailsPasses() {
        // valid when if test fails
        final var schema = IfAndThenWithoutElse.IfAndThenWithoutElse1.getInstance();
        schema.validate(
            3,
            configuration
        );
    }
}
