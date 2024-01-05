package org.openapijsonschematools.client.components.schemas;

import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;

public class EnumWith1DoesNotMatchTrueTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

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
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testFloatOneIsValidPasses() {
        // float one is valid
        final var schema = EnumWith1DoesNotMatchTrue.EnumWith1DoesNotMatchTrue1.getInstance();
        schema.validate(
            1.0d,
            configuration
        );
    }

    @Test
    public void testIntegerOneIsValidPasses() {
        // integer one is valid
        final var schema = EnumWith1DoesNotMatchTrue.EnumWith1DoesNotMatchTrue1.getInstance();
        schema.validate(
            1,
            configuration
        );
    }
}
