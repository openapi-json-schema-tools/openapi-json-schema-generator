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

public class PropertiesWithEscapedCharactersTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testObjectWithAllNumbersIsValidPasses() {
        // object with all numbers is valid
        PropertiesWithEscapedCharacters.PropertiesWithEscapedCharacters1.validate(
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

    @Test
    public void testObjectWithStringsIsInvalidFails() {
        // object with strings is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            PropertiesWithEscapedCharacters.PropertiesWithEscapedCharacters1.class,
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "foo\nbar",
                    "1"
                ),
                new AbstractMap.SimpleEntry<>(
                    "foo\"bar",
                    "1"
                ),
                new AbstractMap.SimpleEntry<>(
                    "foo\\bar",
                    "1"
                ),
                new AbstractMap.SimpleEntry<>(
                    "foo\rbar",
                    "1"
                ),
                new AbstractMap.SimpleEntry<>(
                    "foo\tbar",
                    "1"
                ),
                new AbstractMap.SimpleEntry<>(
                    "foo\fbar",
                    "1"
                )
            ),
            configuration
        ));
    }
}
