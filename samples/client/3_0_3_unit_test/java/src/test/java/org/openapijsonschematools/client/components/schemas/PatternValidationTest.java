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

public class PatternValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final PatternValidation.PatternValidation1 schema = (
        PatternValidation.PatternValidation1.getInstance()
    );
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testIgnoresBooleansPasses() {
        // ignores booleans
        schema.validate(
            true,
            configuration
        );
    }

    @Test
    public void testIgnoresFloatsPasses() {
        // ignores floats
        schema.validate(
            1.0d,
            configuration
        );
    }

    @Test
    public void testANonMatchingPatternIsInvalidFails() {
        // a non-matching pattern is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            "abc",
            validationMetadata
        ));
    }

    @Test
    public void testIgnoresIntegersPasses() {
        // ignores integers
        schema.validate(
            123,
            configuration
        );
    }

    @Test
    public void testAMatchingPatternIsValidPasses() {
        // a matching pattern is valid
        schema.validate(
            "aaa",
            configuration
        );
    }

    @Test
    public void testIgnoresArraysPasses() {
        // ignores arrays
        schema.validate(
            Arrays.asList(
            ),
            configuration
        );
    }

    @Test
    public void testIgnoresObjectsPasses() {
        // ignores objects
        schema.validate(
            MapMaker.makeMap(
            ),
            configuration
        );
    }

    @Test
    public void testIgnoresNullPasses() {
        // ignores null
        schema.validate(
            (Void) null,
            configuration
        );
    }
}
