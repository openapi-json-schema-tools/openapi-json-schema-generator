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

public class MaximumValidationWithUnsignedIntegerTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testAboveTheMaximumIsInvalidFails() {
        // above the maximum is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1.class,
            300.5,
            configuration
        ));
    }

    @Test
    public void testBelowTheMaximumIsInvalidPasses() {
        // below the maximum is invalid
        // payload type = number
        // dataType =
        MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1.validate(
            299.97,
            configuration
        );
    }

    @Test
    public void testBoundaryPointIntegerIsValidPasses() {
        // boundary point integer is valid
        // payload type = integer
        // dataType =
        MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1.validate(
            300,
            configuration
        );
    }

    @Test
    public void testBoundaryPointFloatIsValidPasses() {
        // boundary point float is valid
        // payload type = number
        // dataType =
        MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1.validate(
            300.0,
            configuration
        );
    }
}
