package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.MapMaker;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

public class EnumWithEscapedCharactersTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testAnotherStringIsInvalidFails() {
        // another string is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            EnumWithEscapedCharacters.EnumWithEscapedCharacters1.class,
            "abc",
            configuration
        ));
    }

    @Test
    public void testMember2IsValidPasses() {
        // member 2 is valid
        EnumWithEscapedCharacters.EnumWithEscapedCharacters1.validate(
            "foo\rbar",
            configuration
        );
    }

    @Test
    public void testMember1IsValidPasses() {
        // member 1 is valid
        EnumWithEscapedCharacters.EnumWithEscapedCharacters1.validate(
            "foo\nbar",
            configuration
        );
    }
}
