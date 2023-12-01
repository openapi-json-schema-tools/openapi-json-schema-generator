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

public class EnumWithTrueDoesNotMatch1Test {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testFloatOneIsInvalidFails() {
        // float one is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            EnumWithTrueDoesNotMatch1.EnumWithTrueDoesNotMatch11.class,
            1.0,
            configuration
        ));
    }

    @Test
    public void testIntegerOneIsInvalidFails() {
        // integer one is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            EnumWithTrueDoesNotMatch1.EnumWithTrueDoesNotMatch11.class,
            1,
            configuration
        ));
    }

    @Test
    public void testTrueIsValidPasses() {
        // true is valid
        EnumWithTrueDoesNotMatch1.EnumWithTrueDoesNotMatch11.validate(
            true,
            configuration
        );
    }
}
