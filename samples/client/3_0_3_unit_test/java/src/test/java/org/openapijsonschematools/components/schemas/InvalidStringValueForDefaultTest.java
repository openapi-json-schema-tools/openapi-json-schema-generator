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

public class InvalidStringValueForDefaultTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testValidWhenPropertyIsSpecifiedPasses() {
        // valid when property is specified
        // payload type = object
        // dataType =
        InvalidStringValueForDefault.InvalidStringValueForDefault1.validate(
            MapBuilder.of(Arrays.asList(
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    "good"
                )
            )),
            configuration
        );
    }

    @Test
    public void testStillValidWhenTheInvalidDefaultIsUsedPasses() {
        // still valid when the invalid default is used
        // payload type = object
        // dataType =
        InvalidStringValueForDefault.InvalidStringValueForDefault1.validate(
            MapBuilder.of(Arrays.asList(
            )),
            configuration
        );
    }
}
