package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class IgnoreElseWithoutIfTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

    @Test
    public void testValidWhenInvalidAgainstLoneElsePasses() throws ValidationException {
        // valid when invalid against lone else
        final var schema = IgnoreElseWithoutIf.IgnoreElseWithoutIf1.getInstance();
        schema.validate(
            "hello",
            configuration
        );
    }

    @Test
    public void testValidWhenValidAgainstLoneElsePasses() throws ValidationException {
        // valid when valid against lone else
        final var schema = IgnoreElseWithoutIf.IgnoreElseWithoutIf1.getInstance();
        schema.validate(
            0,
            configuration
        );
    }
}
