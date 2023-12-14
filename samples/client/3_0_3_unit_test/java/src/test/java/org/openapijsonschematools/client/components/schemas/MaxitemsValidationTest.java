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

public class MaxitemsValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final MaxitemsValidation.MaxitemsValidation1 schema = (
        MaxitemsValidation.MaxitemsValidation1.getInstance()
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
            Arrays.asList(
                1
            ),
            configuration
        );
    }

    @Test
    public void testExactLengthIsValidPasses() {
        // exact length is valid
        schema.validate(
            Arrays.asList(
                1,
                2
            ),
            configuration
        );
    }

    @Test
    public void testTooLongIsInvalidFails() {
        // too long is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            Arrays.asList(
                1,
                2,
                3
            ),
            validationMetadata
        ));
    }

    @Test
    public void testIgnoresNonArraysPasses() {
        // ignores non-arrays
        schema.validate(
            "foobar",
            configuration
        );
    }
}
