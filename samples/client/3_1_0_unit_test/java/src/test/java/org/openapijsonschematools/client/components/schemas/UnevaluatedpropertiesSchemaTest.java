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

public class UnevaluatedpropertiesSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testWithInvalidUnevaluatedPropertiesFails() {
        // with invalid unevaluated properties
        final var schema = UnevaluatedpropertiesSchema.UnevaluatedpropertiesSchema1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<>(
                        "foo",
                        "fo"
                    )
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testWithNoUnevaluatedPropertiesPasses() {
        // with no unevaluated properties
        final var schema = UnevaluatedpropertiesSchema.UnevaluatedpropertiesSchema1.getInstance();
        schema.validate(
            MapUtils.makeMap(
            ),
            configuration
        );
    }

    @Test
    public void testWithValidUnevaluatedPropertiesPasses() {
        // with valid unevaluated properties
        final var schema = UnevaluatedpropertiesSchema.UnevaluatedpropertiesSchema1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    "foo"
                )
            ),
            configuration
        );
    }
}
