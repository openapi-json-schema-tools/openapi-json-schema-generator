package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.MapMaker;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

public class InvalidStringValueForDefaultTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final InvalidStringValueForDefault.InvalidStringValueForDefault1 schema = JsonSchemaFactory.getInstance(
        InvalidStringValueForDefault.InvalidStringValueForDefault1.class
    );

    @Test
    public void testValidWhenPropertyIsSpecifiedPasses() {
        // valid when property is specified
        schema.validate(
            MapMaker.makeMap(
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
        schema.validate(
            MapMaker.makeMap(
            ),
            configuration
        );
    }
}
