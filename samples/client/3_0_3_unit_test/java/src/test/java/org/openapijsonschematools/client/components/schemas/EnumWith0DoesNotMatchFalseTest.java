package org.openapijsonschematools.client.components.schemas;

import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;

public class EnumWith0DoesNotMatchFalseTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testFloatZeroIsValidPasses() {
        // float zero is valid
        final var schema = EnumWith0DoesNotMatchFalse.EnumWith0DoesNotMatchFalse1.getInstance();
        schema.validate(
            0.0d,
            configuration
        );
    }

    @Test
    public void testFalseIsInvalidFails() {
        // false is invalid
        final var schema = EnumWith0DoesNotMatchFalse.EnumWith0DoesNotMatchFalse1.getInstance();
        try {
            schema.validate(
                false,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testIntegerZeroIsValidPasses() {
        // integer zero is valid
        final var schema = EnumWith0DoesNotMatchFalse.EnumWith0DoesNotMatchFalse1.getInstance();
        schema.validate(
            0,
            configuration
        );
    }
}
