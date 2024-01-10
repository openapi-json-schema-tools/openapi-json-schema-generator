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

public class BySmallNumberTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void test000751IsNotMultipleOf00001Fails() {
        // 0.00751 is not multiple of 0.0001
        final var schema = BySmallNumber.BySmallNumber1.getInstance();
        try {
            schema.validate(
                0.00751d,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void test00075IsMultipleOf00001Passes() {
        // 0.0075 is multiple of 0.0001
        final var schema = BySmallNumber.BySmallNumber1.getInstance();
        schema.validate(
            0.0075d,
            configuration
        );
    }
}
