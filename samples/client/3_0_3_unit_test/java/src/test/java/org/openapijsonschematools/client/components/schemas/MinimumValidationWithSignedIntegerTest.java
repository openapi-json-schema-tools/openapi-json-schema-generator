package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.MapMaker;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

public class MinimumValidationWithSignedIntegerTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testBoundaryPointWithFloatIsValidPasses() {
        // boundary point with float is valid
        MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1.validate(
            -2.0d,
            configuration
        );
    }

    @Test
    public void testBoundaryPointIsValidPasses() {
        // boundary point is valid
        MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1.validate(
            -2,
            configuration
        );
    }

    @Test
    public void testIntBelowTheMinimumIsInvalidFails() {
        // int below the minimum is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1.class,
            -3,
            configuration
        ));
    }

    @Test
    public void testPositiveAboveTheMinimumIsValidPasses() {
        // positive above the minimum is valid
        MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1.validate(
            0,
            configuration
        );
    }

    @Test
    public void testNegativeAboveTheMinimumIsValidPasses() {
        // negative above the minimum is valid
        MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1.validate(
            -1,
            configuration
        );
    }

    @Test
    public void testIgnoresNonNumbersPasses() {
        // ignores non-numbers
        MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1.validate(
            "x",
            configuration
        );
    }

    @Test
    public void testFloatBelowTheMinimumIsInvalidFails() {
        // float below the minimum is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1.class,
            -2.0001d,
            configuration
        ));
    }
}
