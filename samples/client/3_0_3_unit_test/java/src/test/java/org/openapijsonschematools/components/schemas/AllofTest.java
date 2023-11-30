package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.JsonSchema;

import java.util.Arrays;
import java.util.Map;
import java.util.AbstractMap;

public class AllofTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testMismatchSecondFails() {
        // mismatch second
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            Allof.Allof1.class,
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    "baz"
                )
            ),
            configuration
        ));
    }

    @Test
    public void testWrongTypeFails() {
        // wrong type
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            Allof.Allof1.class,
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    "baz"
                ),
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    "quux"
                )
            ),
            configuration
        ));
    }

    @Test
    public void testMismatchFirstFails() {
        // mismatch first
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            Allof.Allof1.class,
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    2
                )
            ),
            configuration
        ));
    }

    @Test
    public void testAllofPasses() {
        // allOf
        Allof.Allof1.validate(
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    "baz"
                ),
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    2
                )
            ),
            configuration
        );
    }
}
