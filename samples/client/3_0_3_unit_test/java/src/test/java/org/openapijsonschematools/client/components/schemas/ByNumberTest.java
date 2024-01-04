package org.openapijsonschematools.client.components.schemas;

import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;

public class ByNumberTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

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
    public void test45IsMultipleOf15Passes() {
        // 4.5 is multiple of 1.5
        final var schema = ByNumber.ByNumber1.getInstance();
        schema.validate(
            4.5d,
            configuration
        );
    }

    @Test
    public void testZeroIsMultipleOfAnythingPasses() {
        // zero is multiple of anything
        final var schema = ByNumber.ByNumber1.getInstance();
        schema.validate(
            0,
            configuration
        );
    }
}
