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

public class IfAndElseWithoutThenTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

    @Test
    public void testValidWhenIfTestPassesPasses() {
        // valid when if test passes
        final var schema = IfAndElseWithoutThen.IfAndElseWithoutThen1.getInstance();
        schema.validate(
            -1,
            configuration
        );
    }

    @Test
    public void testValidThroughElsePasses() {
        // valid through else
        final var schema = IfAndElseWithoutThen.IfAndElseWithoutThen1.getInstance();
        schema.validate(
            4,
            configuration
        );
    }

    @Test
    public void testInvalidThroughElseFails() {
        // invalid through else
        final var schema = IfAndElseWithoutThen.IfAndElseWithoutThen1.getInstance();
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
}
