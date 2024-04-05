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

public class EnumWith1DoesNotMatchTrueTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

    @Test
    public void testTrueIsInvalidFails() {
        // true is invalid
        final var schema = EnumWith1DoesNotMatchTrue.EnumWith1DoesNotMatchTrue1.getInstance();
        try {
            schema.validate(
                true,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testFloatOneIsValidPasses() throws ValidationException {
        // float one is valid
        final var schema = EnumWith1DoesNotMatchTrue.EnumWith1DoesNotMatchTrue1.getInstance();
        schema.validate(
            1.0d,
            configuration
        );
    }

    @Test
    public void testIntegerOneIsValidPasses() throws ValidationException {
        // integer one is valid
        final var schema = EnumWith1DoesNotMatchTrue.EnumWith1DoesNotMatchTrue1.getInstance();
        schema.validate(
            1,
            configuration
        );
    }
}
