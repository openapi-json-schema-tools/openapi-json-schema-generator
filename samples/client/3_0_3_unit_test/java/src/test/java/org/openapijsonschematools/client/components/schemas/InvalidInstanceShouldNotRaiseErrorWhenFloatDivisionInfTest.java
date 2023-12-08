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

public class InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInfTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf.InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1 schema = JsonSchemaFactory.getInstance(
        InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf.InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1.class
    );

    @Test
    public void testAlwaysInvalidButNaiveImplementationsMayRaiseAnOverflowErrorFails() {
        // always invalid, but naive implementations may raise an overflow error
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            1.0E308d,
            configuration
        ));
    }

    @Test
    public void testValidIntegerWithMultipleofFloatPasses() {
        // valid integer with multipleOf float
        schema.validate(
            123456789,
            configuration
        );
    }
}
