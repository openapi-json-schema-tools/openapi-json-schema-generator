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

public class SmallMultipleOfLargeIntegerTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

    @Test
    public void testAnyIntegerIsAMultipleOf1E8Passes() throws ValidationException {
        // any integer is a multiple of 1e-8
        final var schema = SmallMultipleOfLargeInteger.SmallMultipleOfLargeInteger1.getInstance();
        schema.validate(
            12391239123L,
            configuration
        );
    }
}
