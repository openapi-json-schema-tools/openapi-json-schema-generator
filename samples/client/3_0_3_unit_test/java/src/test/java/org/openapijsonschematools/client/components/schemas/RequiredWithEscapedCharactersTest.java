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

public class RequiredWithEscapedCharactersTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final RequiredWithEscapedCharacters.RequiredWithEscapedCharacters1 schema = (
        RequiredWithEscapedCharacters.RequiredWithEscapedCharacters1.getInstance()
    );
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testObjectWithSomePropertiesMissingIsInvalidFails() {
        // object with some properties missing is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "foo\nbar",
                    "1"
                ),
                new AbstractMap.SimpleEntry<>(
                    "foo\"bar",
                    "1"
                )
            ),
            validationMetadata
        ));
    }

    @Test
    public void testObjectWithAllPropertiesPresentIsValidPasses() {
        // object with all properties present is valid
        schema.validate(
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "foo\nbar",
                    1
                ),
                new AbstractMap.SimpleEntry<>(
                    "foo\"bar",
                    1
                ),
                new AbstractMap.SimpleEntry<>(
                    "foo\\bar",
                    1
                ),
                new AbstractMap.SimpleEntry<>(
                    "foo\rbar",
                    1
                ),
                new AbstractMap.SimpleEntry<>(
                    "foo\tbar",
                    1
                ),
                new AbstractMap.SimpleEntry<>(
                    "foo\fbar",
                    1
                )
            ),
            configuration
        );
    }
}
