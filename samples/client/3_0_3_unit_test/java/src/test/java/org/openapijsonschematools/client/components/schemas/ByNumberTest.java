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

public class ByNumberTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

    @Test
    public void test35IsNotMultipleOf15Fails() {
        // 35 is not multiple of 1.5
        final var schema = ByNumber.ByNumber1.getInstance();
        try {
            schema.validate(
                35,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void test45IsMultipleOf15Passes() throws ValidationException, InvalidTypeException {
        // 4.5 is multiple of 1.5
        final var schema = ByNumber.ByNumber1.getInstance();
        schema.validate(
            4.5d,
            configuration
        );
    }

    @Test
    public void testZeroIsMultipleOfAnythingPasses() throws ValidationException, InvalidTypeException {
        // zero is multiple of anything
        final var schema = ByNumber.ByNumber1.getInstance();
        schema.validate(
            0,
            configuration
        );
    }
}
