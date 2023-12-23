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

public class AdditionalpropertiesShouldNotLookInApplicatorsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testPropertiesDefinedInAllofAreNotExaminedFails() {
        // properties defined in allOf are not examined
        final var schema = AdditionalpropertiesShouldNotLookInApplicators.AdditionalpropertiesShouldNotLookInApplicators1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<String, Object>(
                    "foo",
                    1L
                ),
                new AbstractMap.SimpleEntry<String, Object>(
                    "bar",
                    true
                )
            ),
            validationMetadata
        ));
    }

    @Test
    public void testValidTestCasePasses() {
        // valid test case
        final var schema = AdditionalpropertiesShouldNotLookInApplicators.AdditionalpropertiesShouldNotLookInApplicators1.getInstance();
        schema.validate(
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<String, Boolean>(
                    "foo",
                    false
                ),
                new AbstractMap.SimpleEntry<String, Boolean>(
                    "bar",
                    true
                )
            ),
            configuration
        );
    }
}
