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

public class MinlengthValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final MinlengthValidation.MinlengthValidation1 schema = JsonSchemaFactory.getInstance(
        MinlengthValidation.MinlengthValidation1.class
    );

    @Test
    public void testExactLengthIsValidPasses() {
        // exact length is valid
        schema.validate(
            "fo",
            configuration
        );
    }

    @Test
    public void testLongerIsValidPasses() {
        // longer is valid
        schema.validate(
            "foo",
            configuration
        );
    }

    @Test
    public void testIgnoresNonStringsPasses() {
        // ignores non-strings
        schema.validate(
            1,
            configuration
        );
    }

    @Test
    public void testTooShortIsInvalidFails() {
        // too short is invalid
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            "f",
            configuration
        ));
    }

    @Test
    public void testOneSupplementaryUnicodeCodePointIsNotLongEnoughFails() {
        // one supplementary Unicode code point is not long enough
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            "💩",
            configuration
        ));
    }
}
