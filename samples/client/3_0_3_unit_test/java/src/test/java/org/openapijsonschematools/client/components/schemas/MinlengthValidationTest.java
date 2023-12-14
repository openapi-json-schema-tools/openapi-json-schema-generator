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

public class MinlengthValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final MinlengthValidation.MinlengthValidation1 schema = (
        MinlengthValidation.MinlengthValidation1.getInstance()
    );
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
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
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            "f",
            validationMetadata
        ));
    }

    @Test
    public void testOneSupplementaryUnicodeCodePointIsNotLongEnoughFails() {
        // one supplementary Unicode code point is not long enough
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            "💩",
            validationMetadata
        ));
    }
}
