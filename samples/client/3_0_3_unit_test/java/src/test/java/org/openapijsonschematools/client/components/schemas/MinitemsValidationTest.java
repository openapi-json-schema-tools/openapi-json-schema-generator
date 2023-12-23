package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;
import java.util.LinkedHashSet;

public class MinitemsValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testExactLengthIsValidPasses() {
        // exact length is valid
        final var schema = MinitemsValidation.MinitemsValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                1L
            ),
            configuration
        );
    }

    @Test
    public void testIgnoresNonArraysPasses() {
        // ignores non-arrays
        final var schema = MinitemsValidation.MinitemsValidation1.getInstance();
        schema.validate(
            "",
            configuration
        );
    }

    @Test
    public void testLongerIsValidPasses() {
        // longer is valid
        final var schema = MinitemsValidation.MinitemsValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                1L,
                2L
            ),
            configuration
        );
    }

    @Test
    public void testTooShortIsInvalidFails() {
        // too short is invalid
        final var schema = MinitemsValidation.MinitemsValidation1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            Arrays.asList(
            ),
            validationMetadata
        ));
    }
}
