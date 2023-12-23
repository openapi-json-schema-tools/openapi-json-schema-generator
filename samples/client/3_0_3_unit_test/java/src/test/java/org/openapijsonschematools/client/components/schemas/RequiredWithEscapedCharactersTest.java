package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;
import java.util.LinkedHashSet;

public class RequiredWithEscapedCharactersTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testObjectWithSomePropertiesMissingIsInvalidFails() {
        // object with some properties missing is invalid
        final var schema = RequiredWithEscapedCharacters.RequiredWithEscapedCharacters1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<String, String>(
                    "foo\nbar",
                    "1"
                ),
                new AbstractMap.SimpleEntry<String, String>(
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
        final var schema = RequiredWithEscapedCharacters.RequiredWithEscapedCharacters1.getInstance();
        schema.validate(
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<String, Long>(
                    "foo\nbar",
                    1L
                ),
                new AbstractMap.SimpleEntry<String, Long>(
                    "foo\"bar",
                    1L
                ),
                new AbstractMap.SimpleEntry<String, Long>(
                    "foo\\bar",
                    1L
                ),
                new AbstractMap.SimpleEntry<String, Long>(
                    "foo\rbar",
                    1L
                ),
                new AbstractMap.SimpleEntry<String, Long>(
                    "foo\tbar",
                    1L
                ),
                new AbstractMap.SimpleEntry<String, Long>(
                    "foo\fbar",
                    1L
                )
            ),
            configuration
        );
    }
}
