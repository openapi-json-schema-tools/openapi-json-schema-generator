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

public class AllofCombinedWithAnyofOneofTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testAllofFalseAnyofFalseOneofTrueFails() {
        // allOf: false, anyOf: false, oneOf: true
        final var schema = AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            5L,
            validationMetadata
        ));
    }

    @Test
    public void testAllofFalseAnyofTrueOneofFalseFails() {
        // allOf: false, anyOf: true, oneOf: false
        final var schema = AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            3L,
            validationMetadata
        ));
    }

    @Test
    public void testAllofFalseAnyofTrueOneofTrueFails() {
        // allOf: false, anyOf: true, oneOf: true
        final var schema = AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            15L,
            validationMetadata
        ));
    }

    @Test
    public void testAllofTrueAnyofFalseOneofFalseFails() {
        // allOf: true, anyOf: false, oneOf: false
        final var schema = AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            2L,
            validationMetadata
        ));
    }

    @Test
    public void testAllofTrueAnyofTrueOneofTruePasses() {
        // allOf: true, anyOf: true, oneOf: true
        final var schema = AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.getInstance();
        schema.validate(
            30L,
            configuration
        );
    }

    @Test
    public void testAllofFalseAnyofFalseOneofFalseFails() {
        // allOf: false, anyOf: false, oneOf: false
        final var schema = AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            1L,
            validationMetadata
        ));
    }

    @Test
    public void testAllofTrueAnyofFalseOneofTrueFails() {
        // allOf: true, anyOf: false, oneOf: true
        final var schema = AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            10L,
            validationMetadata
        ));
    }

    @Test
    public void testAllofTrueAnyofTrueOneofFalseFails() {
        // allOf: true, anyOf: true, oneOf: false
        final var schema = AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            6L,
            validationMetadata
        ));
    }
}
