package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;
import java.util.LinkedHashSet;

public class AdditionalpropertiesAllowsASchemaWhichShouldValidateTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

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
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
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
            validationMetadata
        ));
    }
}
