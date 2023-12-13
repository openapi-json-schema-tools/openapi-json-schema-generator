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

public class MaximumValidationWithUnsignedIntegerTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1 schema = JsonSchemaFactory.getInstance(
        MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1.class
    );

    @Test
    public void testAboveTheMaximumIsInvalidFails() {
        // above the maximum is invalid
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            300.5d,
            configuration
        ));
    }

    @Test
    public void testBelowTheMaximumIsInvalidPasses() {
        // below the maximum is invalid
        schema.validate(
            299.97d,
            configuration
        );
    }

    @Test
    public void testBoundaryPointIntegerIsValidPasses() {
        // boundary point integer is valid
        schema.validate(
            300,
            configuration
        );
    }

    @Test
    public void testBoundaryPointFloatIsValidPasses() {
        // boundary point float is valid
        schema.validate(
            300.0d,
            configuration
        );
    }
}
