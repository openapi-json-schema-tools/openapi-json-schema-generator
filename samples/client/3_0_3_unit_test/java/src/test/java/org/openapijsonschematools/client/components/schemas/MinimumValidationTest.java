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

public class MinimumValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final MinimumValidation.MinimumValidation1 schema = JsonSchemaFactory.getInstance(
        MinimumValidation.MinimumValidation1.class
    );

    @Test
    public void testBoundaryPointIsValidPasses() {
        // boundary point is valid
        schema.validate(
            1.1d,
            configuration
        );
    }

    @Test
    public void testBelowTheMinimumIsInvalidFails() {
        // below the minimum is invalid
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            0.6d,
            configuration
        ));
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
    public void testAboveTheMinimumIsValidPasses() {
        // above the minimum is valid
        schema.validate(
            2.6d,
            configuration
        );
    }
}
