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

public class MaximumValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testAboveTheMaximumIsInvalidFails() {
        // above the maximum is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            MaximumValidation.MaximumValidation1.class,
            3.5,
            configuration
        ));
    }

    @Test
    public void testBoundaryPointIsValidPasses() {
        // boundary point is valid
        MaximumValidation.MaximumValidation1.validate(
            3.0,
            configuration
        );
    }

    @Test
    public void testBelowTheMaximumIsValidPasses() {
        // below the maximum is valid
        MaximumValidation.MaximumValidation1.validate(
            2.6,
            configuration
        );
    }

    @Test
    public void testIgnoresNonNumbersPasses() {
        // ignores non-numbers
        MaximumValidation.MaximumValidation1.validate(
            "x",
            configuration
        );
    }
}
