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

public class MinimumValidationWithSignedIntegerTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1 schema = (
        MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1.getInstance()
    );
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
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
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            -3,
            validationMetadata
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
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            -2.0001d,
            validationMetadata
        ));
    }
}
