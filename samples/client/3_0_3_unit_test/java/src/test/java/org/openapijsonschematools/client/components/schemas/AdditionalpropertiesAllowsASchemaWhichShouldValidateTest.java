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

public class AdditionalpropertiesAllowsASchemaWhichShouldValidateTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testNoAdditionalPropertiesIsValidPasses() {
        // no additional properties is valid
        final var schema = AdditionalpropertiesAllowsASchemaWhichShouldValidate.AdditionalpropertiesAllowsASchemaWhichShouldValidate1.getInstance();
        schema.validate(
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    1L
                )
            ),
            configuration
        );
    }

    @Test
    public void testAnAdditionalValidPropertyIsValidPasses() {
        // an additional valid property is valid
        final var schema = AdditionalpropertiesAllowsASchemaWhichShouldValidate.AdditionalpropertiesAllowsASchemaWhichShouldValidate1.getInstance();
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

    @Test
    public void testAnAdditionalInvalidPropertyIsInvalidFails() {
        // an additional invalid property is invalid
        final var schema = AdditionalpropertiesAllowsASchemaWhichShouldValidate.AdditionalpropertiesAllowsASchemaWhichShouldValidate1.getInstance();
        try {
            schema.validate(
                MapMaker.makeMap(
                    new AbstractMap.SimpleEntry<String, Long>(
                        "foo",
                        1L
                    ),
                    new AbstractMap.SimpleEntry<String, Long>(
                        "bar",
                        2L
                    ),
                    new AbstractMap.SimpleEntry<String, Long>(
                        "quux",
                        12L
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
