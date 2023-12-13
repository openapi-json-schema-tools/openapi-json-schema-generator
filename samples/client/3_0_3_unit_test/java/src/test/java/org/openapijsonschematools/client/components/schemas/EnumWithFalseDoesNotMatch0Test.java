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

public class EnumWithFalseDoesNotMatch0Test {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final EnumWithFalseDoesNotMatch0.EnumWithFalseDoesNotMatch01 schema = JsonSchemaFactory.getInstance(
        EnumWithFalseDoesNotMatch0.EnumWithFalseDoesNotMatch01.class
    );

    @Test
    public void testFloatZeroIsInvalidFails() {
        // float zero is invalid
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            0.0d,
            configuration
        ));
    }

    @Test
    public void testFalseIsValidPasses() {
        // false is valid
        schema.validate(
            false,
            configuration
        );
    }

    @Test
    public void testIntegerZeroIsInvalidFails() {
        // integer zero is invalid
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            0,
            configuration
        ));
    }
}
