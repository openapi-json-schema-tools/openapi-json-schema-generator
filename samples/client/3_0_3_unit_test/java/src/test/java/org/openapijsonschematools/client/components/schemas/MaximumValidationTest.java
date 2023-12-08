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

public class MaximumValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final MaximumValidation.MaximumValidation1 schema = JsonSchemaFactory.getInstance(
        MaximumValidation.MaximumValidation1.class
    );

    @Test
    public void testAboveTheMaximumIsInvalidFails() {
        // above the maximum is invalid
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            3.5d,
            configuration
        ));
    }

    @Test
    public void testBoundaryPointIsValidPasses() {
        // boundary point is valid
        schema.validate(
            3.0d,
            configuration
        );
    }

    @Test
    public void testBelowTheMaximumIsValidPasses() {
        // below the maximum is valid
        schema.validate(
            2.6d,
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
}
