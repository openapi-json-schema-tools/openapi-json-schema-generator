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

public class UnevaluateditemsAsSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testWithValidUnevaluatedItemsPasses() {
        // with valid unevaluated items
        final var schema = UnevaluateditemsAsSchema.UnevaluateditemsAsSchema1.getInstance();
        schema.validate(
            Arrays.asList(
                "foo"
            ),
            configuration
        );
    }

    @Test
    public void testWithInvalidUnevaluatedItemsFails() {
        // with invalid unevaluated items
        final var schema = UnevaluateditemsAsSchema.UnevaluateditemsAsSchema1.getInstance();
        try {
            schema.validate(
                Arrays.asList(
                    42
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testWithNoUnevaluatedItemsPasses() {
        // with no unevaluated items
        final var schema = UnevaluateditemsAsSchema.UnevaluateditemsAsSchema1.getInstance();
        schema.validate(
            Arrays.asList(
            ),
            configuration
        );
    }
}
