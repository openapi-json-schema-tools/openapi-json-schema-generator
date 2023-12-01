package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.MapMaker;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

public class MinitemsValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testExactLengthIsValidPasses() {
        // exact length is valid
        MinitemsValidation.MinitemsValidation1.validate(
            Arrays.asList(
                1
            ),
            configuration
        );
    }

    @Test
    public void testIgnoresNonArraysPasses() {
        // ignores non-arrays
        MinitemsValidation.MinitemsValidation1.validate(
            "",
            configuration
        );
    }

    @Test
    public void testLongerIsValidPasses() {
        // longer is valid
        MinitemsValidation.MinitemsValidation1.validate(
            Arrays.asList(
                1,
                2
            ),
            configuration
        );
    }

    @Test
    public void testTooShortIsInvalidFails() {
        // too short is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            MinitemsValidation.MinitemsValidation1.class,
            Arrays.asList(
            ),
            configuration
        ));
    }
}
