package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.MapMaker;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

public class EnumWithEscapedCharactersTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final EnumWithEscapedCharacters.EnumWithEscapedCharacters1 schema = JsonSchemaFactory.getInstance(
        EnumWithEscapedCharacters.EnumWithEscapedCharacters1.class
    );

    @Test
    public void testAnotherStringIsInvalidFails() {
        // another string is invalid
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            "abc",
            configuration
        ));
    }

    @Test
    public void testMember2IsValidPasses() {
        // member 2 is valid
        schema.validate(
            "foo\rbar",
            configuration
        );
    }

    @Test
    public void testMember1IsValidPasses() {
        // member 1 is valid
        schema.validate(
            "foo\nbar",
            configuration
        );
    }
}
