package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class AdditionalpropertiesAreAllowedByDefaultTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testAdditionalPropertiesAreAllowedPasses() {
        // additional properties are allowed
        final var schema = AdditionalpropertiesAreAllowedByDefault.AdditionalpropertiesAreAllowedByDefault1.getInstance();
        schema.validate(
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<String, Object>(
                    "foo",
                    1L
                ),
                new AbstractMap.SimpleEntry<String, Object>(
                    "bar",
                    2L
                ),
                new AbstractMap.SimpleEntry<String, Object>(
                    "quux",
                    true
                )
            ),
            configuration
        );
    }
}
