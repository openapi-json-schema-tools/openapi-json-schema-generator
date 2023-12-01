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

public class MaxlengthValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testShorterIsValidPasses() {
        // shorter is valid
        MaxlengthValidation.MaxlengthValidation1.validate(
            "f",
            configuration
        );
    }

    @Test
    public void testExactLengthIsValidPasses() {
        // exact length is valid
        MaxlengthValidation.MaxlengthValidation1.validate(
            "fo",
            configuration
        );
    }

    @Test
    public void testTooLongIsInvalidFails() {
        // too long is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            MaxlengthValidation.MaxlengthValidation1.class,
            "foo",
            configuration
        ));
    }

    @Test
    public void testIgnoresNonStringsPasses() {
        // ignores non-strings
        MaxlengthValidation.MaxlengthValidation1.validate(
            100,
            configuration
        );
    }

    @Test
    public void testTwoSupplementaryUnicodeCodePointsIsLongEnoughPasses() {
        // two supplementary Unicode code points is long enough
        MaxlengthValidation.MaxlengthValidation1.validate(
            "💩💩",
            configuration
        );
    }
}
