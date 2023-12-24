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

public class MinpropertiesValidationTest {
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
        final var schema = MinpropertiesValidation.MinpropertiesValidation1.getInstance();
        schema.validate(
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    1L
                )
            ),
            configuration
        );
    }

    @Test
    public void testIgnoresOtherNonObjectsPasses() {
        // ignores other non-objects
        final var schema = MinpropertiesValidation.MinpropertiesValidation1.getInstance();
        schema.validate(
            12L,
            configuration
        );
    }

    @Test
    public void testLongerIsValidPasses() {
        // longer is valid
        final var schema = MinpropertiesValidation.MinpropertiesValidation1.getInstance();
        schema.validate(
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<String, Long>(
                    "foo",
                    1L
                ),
                new AbstractMap.SimpleEntry<String, Long>(
                    "bar",
                    2L
                )
            ),
            configuration
        );
    }

    @Test
    public void testIgnoresArraysPasses() {
        // ignores arrays
        final var schema = MinpropertiesValidation.MinpropertiesValidation1.getInstance();
        schema.validate(
            Arrays.asList(
            ),
            configuration
        );
    }

    @Test
    public void testTooShortIsInvalidFails() {
        // too short is invalid
        final var schema = MinpropertiesValidation.MinpropertiesValidation1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            MapMaker.makeMap(
            ),
            validationMetadata
        ));
    }

    @Test
    public void testIgnoresStringsPasses() {
        // ignores strings
        final var schema = MinpropertiesValidation.MinpropertiesValidation1.getInstance();
        schema.validate(
            "",
            configuration
        );
    }
}
