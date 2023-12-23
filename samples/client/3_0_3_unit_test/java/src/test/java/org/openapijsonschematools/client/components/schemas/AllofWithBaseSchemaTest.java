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

public class AllofWithBaseSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testMismatchBaseSchemaFails() {
        // mismatch base schema
        final var schema = AllofWithBaseSchema.AllofWithBaseSchema1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<String, @Nullable String>(
                    "foo",
                    "quux"
                ),
                new AbstractMap.SimpleEntry<String, @Nullable String>(
                    "baz",
                    null
                )
            ),
            validationMetadata
        ));
    }

    @Test
    public void testMismatchFirstAllofFails() {
        // mismatch first allOf
        final var schema = AllofWithBaseSchema.AllofWithBaseSchema1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<String, @Nullable Long>(
                    "bar",
                    2L
                ),
                new AbstractMap.SimpleEntry<String, @Nullable Long>(
                    "baz",
                    null
                )
            ),
            validationMetadata
        ));
    }

    @Test
    public void testValidPasses() {
        // valid
        final var schema = AllofWithBaseSchema.AllofWithBaseSchema1.getInstance();
        schema.validate(
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<String, @Nullable Object>(
                    "foo",
                    "quux"
                ),
                new AbstractMap.SimpleEntry<String, @Nullable Object>(
                    "bar",
                    2L
                ),
                new AbstractMap.SimpleEntry<String, @Nullable Object>(
                    "baz",
                    null
                )
            ),
            configuration
        );
    }

    @Test
    public void testMismatchBothFails() {
        // mismatch both
        final var schema = AllofWithBaseSchema.AllofWithBaseSchema1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<String, Long>(
                    "bar",
                    2L
                )
            ),
            validationMetadata
        ));
    }

    @Test
    public void testMismatchSecondAllofFails() {
        // mismatch second allOf
        final var schema = AllofWithBaseSchema.AllofWithBaseSchema1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<String, Object>(
                    "foo",
                    "quux"
                ),
                new AbstractMap.SimpleEntry<String, Object>(
                    "bar",
                    2L
                )
            ),
            validationMetadata
        ));
    }
}
