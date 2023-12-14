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

public class MaxlengthValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final MaxlengthValidation.MaxlengthValidation1 schema = (
        MaxlengthValidation.MaxlengthValidation1.getInstance()
    );
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testShorterIsValidPasses() {
        // shorter is valid
        schema.validate(
            "f",
            configuration
        );
    }

    @Test
    public void testExactLengthIsValidPasses() {
        // exact length is valid
        schema.validate(
            "fo",
            configuration
        );
    }

    @Test
    public void testTooLongIsInvalidFails() {
        // too long is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            "foo",
            validationMetadata
        ));
    }

    @Test
    public void testIgnoresNonStringsPasses() {
        // ignores non-strings
        schema.validate(
            100,
            configuration
        );
    }

    @Test
    public void testTwoSupplementaryUnicodeCodePointsIsLongEnoughPasses() {
        // two supplementary Unicode code points is long enough
        schema.validate(
            "💩💩",
            configuration
        );
    }
}
