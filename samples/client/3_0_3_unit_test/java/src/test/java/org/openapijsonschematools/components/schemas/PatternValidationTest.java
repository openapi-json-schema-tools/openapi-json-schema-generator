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

public class PatternValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testIgnoresBooleansPasses() {
        // ignores booleans
        // payload type = boolean
        // dataType =
        PatternValidation.PatternValidation1.validate(
            true,
            configuration
        );
    }

    @Test
    public void testIgnoresFloatsPasses() {
        // ignores floats
        // payload type = number
        // dataType =
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
        // payload type = integer
        // dataType =
        PatternValidation.PatternValidation1.validate(
            123,
            configuration
        );
    }

    @Test
    public void testAMatchingPatternIsValidPasses() {
        // a matching pattern is valid
        // payload type = string
        // dataType =
        PatternValidation.PatternValidation1.validate(
            "aaa",
            configuration
        );
    }

    @Test
    public void testIgnoresArraysPasses() {
        // ignores arrays
        // payload type = array
        // dataType =
        PatternValidation.PatternValidation1.validate(
            Arrays.asList(
            ),
            configuration
        );
    }

    @Test
    public void testIgnoresObjectsPasses() {
        // ignores objects
        // payload type = object
        // dataType =
        PatternValidation.PatternValidation1.validate(
            MapBuilder.of(Arrays.asList(
            )),
            configuration
        );
    }

    @Test
    public void testIgnoresNullPasses() {
        // ignores null
        // payload type = null
        // dataType =
        PatternValidation.PatternValidation1.validate(
            (Void) null,
            configuration
        );
    }
}
