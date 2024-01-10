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

public class EnumWithEscapedCharactersTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testAnotherStringIsInvalidFails() {
        // another string is invalid
        final var schema = EnumWithEscapedCharacters.EnumWithEscapedCharacters1.getInstance();
        try {
            schema.validate(
                "abc",
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testMember2IsValidPasses() {
        // member 2 is valid
        final var schema = EnumWithEscapedCharacters.EnumWithEscapedCharacters1.getInstance();
        schema.validate(
            "foo\rbar",
            configuration
        );
    }

    @Test
    public void testMember1IsValidPasses() {
        // member 1 is valid
        final var schema = EnumWithEscapedCharacters.EnumWithEscapedCharacters1.getInstance();
        schema.validate(
            "foo\nbar",
            configuration
        );
    }
}
