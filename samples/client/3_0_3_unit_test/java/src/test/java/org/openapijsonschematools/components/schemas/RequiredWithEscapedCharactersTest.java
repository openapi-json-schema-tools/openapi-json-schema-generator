package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class RequiredWithEscapedCharactersTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testObjectWithSomePropertiesMissingIsInvalidFails() {
        // object with some properties missing is invalid
        Assert.assertThrows(ValidationException.class, () -> RequiredWithEscapedCharacters.RequiredWithEscapedCharacters1.validate(
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>(
                    "foo\nbar",
                    "1"
                ),
                new AbstractMap.SimpleEntry<>(
                    "foo\"bar",
                    "1"
                )
            ),
            configuration
        ));
    }

    @Test
    public void testObjectWithAllPropertiesPresentIsValidPasses() {
        // object with all properties present is valid
        RequiredWithEscapedCharacters.RequiredWithEscapedCharacters1.validate(
            Map.ofEntries(
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
