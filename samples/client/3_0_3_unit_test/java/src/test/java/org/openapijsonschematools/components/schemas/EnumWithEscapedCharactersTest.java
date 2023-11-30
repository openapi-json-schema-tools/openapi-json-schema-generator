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

public class EnumWithEscapedCharactersTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testAnotherStringIsInvalidFails() {
        // another string is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            EnumWithEscapedCharacters.EnumWithEscapedCharacters1.class,
            "abc",
            configuration
        ));
    }

    @Test
    public void testMember2IsValidPasses() {
        // member 2 is valid
        // payload type = string
        // dataType =
        EnumWithEscapedCharacters.EnumWithEscapedCharacters1.validate(
            "foo\rbar",
            configuration
        );
    }

    @Test
    public void testMember1IsValidPasses() {
        // member 1 is valid
        // payload type = string
        // dataType =
        EnumWithEscapedCharacters.EnumWithEscapedCharacters1.validate(
            "foo\nbar",
            configuration
        );
    }
}
