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

public class MinimumValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testBoundaryPointIsValidPasses() {
        // boundary point is valid
        // payload type = number
        // dataType =
        MinimumValidation.MinimumValidation1.validate(
            1.1,
            configuration
        );
    }

    @Test
    public void testBelowTheMinimumIsInvalidFails() {
        // below the minimum is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            MinimumValidation.MinimumValidation1.class,
            0.6,
            configuration
        ));
    }

    @Test
    public void testIgnoresNonNumbersPasses() {
        // ignores non-numbers
        // payload type = string
        // dataType =
        MinimumValidation.MinimumValidation1.validate(
            "x",
            configuration
        );
    }

    @Test
    public void testAboveTheMinimumIsValidPasses() {
        // above the minimum is valid
        // payload type = number
        // dataType =
        MinimumValidation.MinimumValidation1.validate(
            2.6,
            configuration
        );
    }
}
