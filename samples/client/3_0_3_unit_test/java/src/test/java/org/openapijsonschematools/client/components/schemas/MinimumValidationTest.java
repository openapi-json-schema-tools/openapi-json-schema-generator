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

public class MinimumValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final MinimumValidation.MinimumValidation1 schema = (
        MinimumValidation.MinimumValidation1.getInstance()
    );
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
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
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            0.6d,
            validationMetadata
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
