package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class UnevaluatedpropertiesWithAdjacentAdditionalpropertiesTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testWithAdditionalPropertiesPasses() {
        // with additional properties
        final var schema = UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedpropertiesWithAdjacentAdditionalproperties1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, String>(
                    "foo",
                    "foo"
                ),
                new AbstractMap.SimpleEntry<String, String>(
                    "bar",
                    "bar"
                )
            ),
            configuration
        );
    }

    @Test
    public void testWithNoAdditionalPropertiesPasses() {
        // with no additional properties
        final var schema = UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedpropertiesWithAdjacentAdditionalproperties1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, String>(
                    "foo",
                    "foo"
                )
            ),
            configuration
        );
    }
}
