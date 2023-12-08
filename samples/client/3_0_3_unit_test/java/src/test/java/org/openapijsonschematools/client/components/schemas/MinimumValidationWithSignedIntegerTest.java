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

public class MinimumValidationWithSignedIntegerTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1 schema = JsonSchemaFactory.getInstance(
        MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1.class
    );

    @Test
    public void testBoundaryPointWithFloatIsValidPasses() {
        // boundary point with float is valid
        schema.validate(
            -2.0d,
            configuration
        );
    }

    @Test
    public void testBoundaryPointIsValidPasses() {
        // boundary point is valid
        schema.validate(
            -2,
            configuration
        );
    }

    @Test
    public void testIntBelowTheMinimumIsInvalidFails() {
        // int below the minimum is invalid
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            -3,
            configuration
        ));
    }

    @Test
    public void testPositiveAboveTheMinimumIsValidPasses() {
        // positive above the minimum is valid
        schema.validate(
            0,
            configuration
        );
    }

    @Test
    public void testNegativeAboveTheMinimumIsValidPasses() {
        // negative above the minimum is valid
        schema.validate(
            -1,
            configuration
        );
    }

    @Test
    public void testIgnoresNonNumbersPasses() {
        // ignores non-numbers
        schema.validate(
            "x",
            configuration
        );
    }

    @Test
    public void testFloatBelowTheMinimumIsInvalidFails() {
        // float below the minimum is invalid
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            -2.0001d,
            configuration
        ));
    }
}
