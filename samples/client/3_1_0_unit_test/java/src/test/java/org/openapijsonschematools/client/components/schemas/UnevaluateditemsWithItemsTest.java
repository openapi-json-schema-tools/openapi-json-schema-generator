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

public class UnevaluateditemsWithItemsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testInvalidUnderItemsFails() {
        // invalid under items
        final var schema = UnevaluateditemsWithItems.UnevaluateditemsWithItems1.getInstance();
        try {
            schema.validate(
                Arrays.asList(
                    "foo",
                    "bar",
                    "baz"
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testValidUnderItemsPasses() {
        // valid under items
        final var schema = UnevaluateditemsWithItems.UnevaluateditemsWithItems1.getInstance();
        schema.validate(
            new UnevaluateditemsWithItems.UnevaluateditemsWithItemsListBuilder(
                Arrays.asList(
                    5,
                    6,
                    7,
                    8
                )
            ).build(),
            configuration
        );
    }
}
