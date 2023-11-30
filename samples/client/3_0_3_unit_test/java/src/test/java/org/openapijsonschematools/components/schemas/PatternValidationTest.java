package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.JsonSchema;

import java.util.Arrays;
import java.util.Map;
import java.util.AbstractMap;

public class PatternValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testIgnoresBooleansPasses() {
        // ignores booleans
        PatternValidation.PatternValidation1.validate(
            true,
            configuration
        );
    }

    @Test
    public void testIgnoresFloatsPasses() {
        // ignores floats
        PatternValidation.PatternValidation1.validate(
            1.0,
            configuration
        );
    }

    @Test
    public void testANonMatchingPatternIsInvalidFails() {
        // a non-matching pattern is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            PatternValidation.PatternValidation1.class,
            "abc",
            configuration
        ));
    }

    @Test
    public void testIgnoresIntegersPasses() {
        // ignores integers
        PatternValidation.PatternValidation1.validate(
            123,
            configuration
        );
    }

    @Test
    public void testAMatchingPatternIsValidPasses() {
        // a matching pattern is valid
        PatternValidation.PatternValidation1.validate(
            "aaa",
            configuration
        );
    }

    @Test
    public void testIgnoresArraysPasses() {
        // ignores arrays
        PatternValidation.PatternValidation1.validate(
            Arrays.asList(
            ),
            configuration
        );
    }

    @Test
    public void testIgnoresObjectsPasses() {
        // ignores objects
        PatternValidation.PatternValidation1.validate(
            Map.ofEntries(
            ),
            configuration
        );
    }

    @Test
    public void testIgnoresNullPasses() {
        // ignores null
        PatternValidation.PatternValidation1.validate(
            (Void) null,
            configuration
        );
    }
}
