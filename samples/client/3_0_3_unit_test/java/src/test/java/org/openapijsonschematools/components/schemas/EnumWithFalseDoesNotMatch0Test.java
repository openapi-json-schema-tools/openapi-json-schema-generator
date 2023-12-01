package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.MapMaker;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

public class EnumWithFalseDoesNotMatch0Test {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testFloatZeroIsInvalidFails() {
        // float zero is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            EnumWithFalseDoesNotMatch0.EnumWithFalseDoesNotMatch01.class,
            0.0,
            configuration
        ));
    }

    @Test
    public void testFalseIsValidPasses() {
        // false is valid
        EnumWithFalseDoesNotMatch0.EnumWithFalseDoesNotMatch01.validate(
            false,
            configuration
        );
    }

    @Test
    public void testIntegerZeroIsInvalidFails() {
        // integer zero is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            EnumWithFalseDoesNotMatch0.EnumWithFalseDoesNotMatch01.class,
            0,
            configuration
        ));
    }
}
