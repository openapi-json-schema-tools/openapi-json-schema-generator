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

public class AdditionalpropertiesAreAllowedByDefaultTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final AdditionalpropertiesAreAllowedByDefault.AdditionalpropertiesAreAllowedByDefault1 schema = JsonSchemaFactory.getInstance(
        AdditionalpropertiesAreAllowedByDefault.AdditionalpropertiesAreAllowedByDefault1.class
    );

    @Test
    public void testAdditionalPropertiesAreAllowedPasses() {
        // additional properties are allowed
        schema.validate(
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    1
                ),
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    2
                ),
                new AbstractMap.SimpleEntry<>(
                    "quux",
                    true
                )
            ),
            configuration
        );
    }
}
