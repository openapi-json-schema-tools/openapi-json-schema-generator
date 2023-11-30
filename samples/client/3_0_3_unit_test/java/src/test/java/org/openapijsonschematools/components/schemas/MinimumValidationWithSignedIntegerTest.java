package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class MinimumValidationWithSignedIntegerTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testBoundaryPointWithFloatIsValidPasses() {
        // boundary point with float is valid
        MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1.validate(
            -2.0,
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
        Assert.assertThrows(ValidationException.class, () -> MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1.validate(
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
        Assert.assertThrows(ValidationException.class, () -> MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1.validate(
            -2.0001,
            configuration
        ));
    }
}
