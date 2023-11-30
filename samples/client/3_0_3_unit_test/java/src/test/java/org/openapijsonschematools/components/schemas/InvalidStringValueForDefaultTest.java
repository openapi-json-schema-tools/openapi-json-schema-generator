package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class InvalidStringValueForDefaultTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testValidWhenPropertyIsSpecifiedPasses() {
        // valid when property is specified
        InvalidStringValueForDefault.InvalidStringValueForDefault1.validate(
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    "good"
                )
            ),
            configuration
        );
    }

    @Test
    public void testStillValidWhenTheInvalidDefaultIsUsedPasses() {
        // still valid when the invalid default is used
        InvalidStringValueForDefault.InvalidStringValueForDefault1.validate(
            Map.ofEntries(
            ),
            configuration
        );
    }
}
