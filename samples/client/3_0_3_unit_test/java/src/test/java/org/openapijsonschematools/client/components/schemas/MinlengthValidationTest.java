package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class MinlengthValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

    @Test
    public void testExactLengthIsValidPasses() throws ValidationException, InvalidTypeException {
        // exact length is valid
        final var schema = MinlengthValidation.MinlengthValidation1.getInstance();
        schema.validate(
            "fo",
            configuration
        );
    }

    @Test
    public void testLongerIsValidPasses() throws ValidationException, InvalidTypeException {
        // longer is valid
        final var schema = MinlengthValidation.MinlengthValidation1.getInstance();
        schema.validate(
            "foo",
            configuration
        );
    }

    @Test
    public void testIgnoresNonStringsPasses() throws ValidationException, InvalidTypeException {
        // ignores non-strings
        final var schema = MinlengthValidation.MinlengthValidation1.getInstance();
        schema.validate(
            1,
            configuration
        );
    }

    @Test
    public void testTooShortIsInvalidFails() {
        // too short is invalid
        final var schema = MinlengthValidation.MinlengthValidation1.getInstance();
        try {
            schema.validate(
                "f",
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testOneSupplementaryUnicodeCodePointIsNotLongEnoughFails() {
        // one supplementary Unicode code point is not long enough
        final var schema = MinlengthValidation.MinlengthValidation1.getInstance();
        try {
            schema.validate(
                "💩",
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }
}
