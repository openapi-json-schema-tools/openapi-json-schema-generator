package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.JsonSchema;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class OneofWithRequiredTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testFirstValidValidPasses() {
        // first valid - valid
        OneofWithRequired.OneofWithRequired1.validate(
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    1
                ),
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    2
                )
            ),
            configuration
        );
    }

    @Test
    public void testBothValidInvalidFails() {
        // both valid - invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            OneofWithRequired.OneofWithRequired1.class,
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    1
                ),
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    2
                ),
                new AbstractMap.SimpleEntry<>(
                    "baz",
                    3
                )
            ),
            configuration
        ));
    }

    @Test
    public void testSecondValidValidPasses() {
        // second valid - valid
        OneofWithRequired.OneofWithRequired1.validate(
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    1
                ),
                new AbstractMap.SimpleEntry<>(
                    "baz",
                    3
                )
            ),
            configuration
        );
    }

    @Test
    public void testBothInvalidInvalidFails() {
        // both invalid - invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            OneofWithRequired.OneofWithRequired1.class,
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    2
                )
            ),
            configuration
        ));
    }
}
