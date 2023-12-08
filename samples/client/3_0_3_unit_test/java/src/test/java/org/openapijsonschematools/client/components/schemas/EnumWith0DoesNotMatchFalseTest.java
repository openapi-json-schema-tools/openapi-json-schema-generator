package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.MapMaker;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

public class EnumWith0DoesNotMatchFalseTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final EnumWith0DoesNotMatchFalse.EnumWith0DoesNotMatchFalse1 schema = JsonSchemaFactory.getInstance(
        EnumWith0DoesNotMatchFalse.EnumWith0DoesNotMatchFalse1.class
    );

    @Test
    public void testFloatZeroIsValidPasses() {
        // float zero is valid
        schema.validate(
            0.0d,
            configuration
        );
    }

    @Test
    public void testFalseIsInvalidFails() {
        // false is invalid
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            false,
            configuration
        ));
    }

    @Test
    public void testIntegerZeroIsValidPasses() {
        // integer zero is valid
        schema.validate(
            0,
            configuration
        );
    }
}
