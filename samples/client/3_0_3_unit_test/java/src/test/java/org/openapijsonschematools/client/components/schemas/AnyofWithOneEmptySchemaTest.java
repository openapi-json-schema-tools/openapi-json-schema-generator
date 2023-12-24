package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class AnyofWithOneEmptySchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testNumberIsValidPasses() {
        // number is valid
        final var schema = AnyofWithOneEmptySchema.AnyofWithOneEmptySchema1.getInstance();
        schema.validate(
            123L,
            configuration
        );
    }

    @Test
    public void testStringIsValidPasses() {
        // string is valid
        final var schema = AnyofWithOneEmptySchema.AnyofWithOneEmptySchema1.getInstance();
        schema.validate(
            "foo",
            configuration
        );
    }
}
