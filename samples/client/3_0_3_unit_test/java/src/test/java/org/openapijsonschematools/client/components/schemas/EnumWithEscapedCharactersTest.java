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

public class EnumWithEscapedCharactersTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final EnumWithEscapedCharacters.EnumWithEscapedCharacters1 schema = (
        EnumWithEscapedCharacters.EnumWithEscapedCharacters1.getInstance()
    );
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testAnotherStringIsInvalidFails() {
        // another string is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            "abc",
            validationMetadata
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
