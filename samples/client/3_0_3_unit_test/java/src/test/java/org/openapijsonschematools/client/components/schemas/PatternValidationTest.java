package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class PatternValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

    @Test
    public void testIgnoresBooleansPasses() throws ValidationException {
        // ignores booleans
        final var schema = PatternValidation.PatternValidation1.getInstance();
        schema.validate(
            true,
            configuration
        );
    }

    @Test
    public void testIgnoresFloatsPasses() throws ValidationException {
        // ignores floats
        final var schema = PatternValidation.PatternValidation1.getInstance();
        schema.validate(
            1.0d,
            configuration
        );
    }

    @Test
    public void testANonMatchingPatternIsInvalidFails() {
        // a non-matching pattern is invalid
        final var schema = PatternValidation.PatternValidation1.getInstance();
        try {
            schema.validate(
                "abc",
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testIgnoresIntegersPasses() throws ValidationException {
        // ignores integers
        final var schema = PatternValidation.PatternValidation1.getInstance();
        schema.validate(
            123,
            configuration
        );
    }

    @Test
    public void testAMatchingPatternIsValidPasses() throws ValidationException {
        // a matching pattern is valid
        final var schema = PatternValidation.PatternValidation1.getInstance();
        schema.validate(
            "aaa",
            configuration
        );
    }

    @Test
    public void testIgnoresArraysPasses() throws ValidationException {
        // ignores arrays
        final var schema = PatternValidation.PatternValidation1.getInstance();
        schema.validate(
            Arrays.asList(
            ),
            configuration
        );
    }

    @Test
    public void testIgnoresObjectsPasses() throws ValidationException {
        // ignores objects
        final var schema = PatternValidation.PatternValidation1.getInstance();
        schema.validate(
            MapUtils.makeMap(
            ),
            configuration
        );
    }

    @Test
    public void testIgnoresNullPasses() throws ValidationException {
        // ignores null
        final var schema = PatternValidation.PatternValidation1.getInstance();
        schema.validate(
            (Void) null,
            configuration
        );
    }
}
