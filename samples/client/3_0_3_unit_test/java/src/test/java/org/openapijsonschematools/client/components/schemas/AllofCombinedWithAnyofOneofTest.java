package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.MapMaker;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

public class AllofCombinedWithAnyofOneofTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testAllofFalseAnyofFalseOneofTrueFails() {
        // allOf: false, anyOf: false, oneOf: true
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.class,
            5,
            configuration
        ));
    }

    @Test
    public void testAllofFalseAnyofTrueOneofFalseFails() {
        // allOf: false, anyOf: true, oneOf: false
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.class,
            3,
            configuration
        ));
    }

    @Test
    public void testAllofFalseAnyofTrueOneofTrueFails() {
        // allOf: false, anyOf: true, oneOf: true
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.class,
            15,
            configuration
        ));
    }

    @Test
    public void testAllofTrueAnyofFalseOneofFalseFails() {
        // allOf: true, anyOf: false, oneOf: false
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.class,
            2,
            configuration
        ));
    }

    @Test
    public void testAllofTrueAnyofTrueOneofTruePasses() {
        // allOf: true, anyOf: true, oneOf: true
        AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.validate(
            30,
            configuration
        );
    }

    @Test
    public void testAllofFalseAnyofFalseOneofFalseFails() {
        // allOf: false, anyOf: false, oneOf: false
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.class,
            1,
            configuration
        ));
    }

    @Test
    public void testAllofTrueAnyofFalseOneofTrueFails() {
        // allOf: true, anyOf: false, oneOf: true
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.class,
            10,
            configuration
        ));
    }

    @Test
    public void testAllofTrueAnyofTrueOneofFalseFails() {
        // allOf: true, anyOf: true, oneOf: false
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.class,
            6,
            configuration
        ));
    }
}
