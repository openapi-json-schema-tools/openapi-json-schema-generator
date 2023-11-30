package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.MapBuilder;

import java.util.Arrays;
import java.util.AbstractMap;

public class InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInfTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testAlwaysInvalidButNaiveImplementationsMayRaiseAnOverflowErrorFails() {
        // always invalid, but naive implementations may raise an overflow error
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf.InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1.class,
            1.0E308,
            configuration
        ));
    }

    @Test
    public void testValidIntegerWithMultipleofFloatPasses() {
        // valid integer with multipleOf float
        // payload type = integer
        // dataType =
        InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf.InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1.validate(
            123456789,
            configuration
        );
    }
}
