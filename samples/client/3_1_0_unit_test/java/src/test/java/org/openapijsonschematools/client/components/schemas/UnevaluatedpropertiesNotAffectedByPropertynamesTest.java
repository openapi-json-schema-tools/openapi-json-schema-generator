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

public class UnevaluatedpropertiesNotAffectedByPropertynamesTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testAllowsOnlyNumberPropertiesPasses() {
        // allows only number properties
        final var schema = UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedpropertiesNotAffectedByPropertynames1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Number>(
                    "a",
                    1
                )
            ),
            configuration
        );
    }

    @Test
    public void testStringPropertyIsInvalidFails() {
        // string property is invalid
        final var schema = UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedpropertiesNotAffectedByPropertynames1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, String>(
                        "a",
                        "b"
                    )
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }
}
