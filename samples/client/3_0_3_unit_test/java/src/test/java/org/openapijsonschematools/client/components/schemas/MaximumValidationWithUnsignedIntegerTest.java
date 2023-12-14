package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;
import java.util.LinkedHashSet;

public class MaximumValidationWithUnsignedIntegerTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1 schema = (
        MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1.getInstance()
    );
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testAboveTheMaximumIsInvalidFails() {
        // above the maximum is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            300.5d,
            validationMetadata
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
