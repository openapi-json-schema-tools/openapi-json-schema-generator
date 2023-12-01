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

public class PropertiesWithEscapedCharactersTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testObjectWithAllNumbersIsValidPasses() {
        // object with all numbers is valid
        PropertiesWithEscapedCharacters.PropertiesWithEscapedCharacters1.validate(
            MapBuilder.of(Arrays.asList(
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
            )),
            configuration
        );
    }

    @Test
    public void testObjectWithStringsIsInvalidFails() {
        // object with strings is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            PropertiesWithEscapedCharacters.PropertiesWithEscapedCharacters1.class,
            MapBuilder.of(Arrays.asList(
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
            )),
            configuration
        ));
    }
}
