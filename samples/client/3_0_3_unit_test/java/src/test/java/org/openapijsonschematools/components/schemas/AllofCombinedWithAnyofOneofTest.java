package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class AllofCombinedWithAnyofOneofTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testAllofFalseAnyofFalseOneofTrueFails() {
        // allOf: false, anyOf: false, oneOf: true
        Assert.assertThrows(ValidationException.class, () -> AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.validate(
            5,
            configuration
        ));
    }

    @Test
    public void testAllofFalseAnyofTrueOneofFalseFails() {
        // allOf: false, anyOf: true, oneOf: false
        Assert.assertThrows(ValidationException.class, () -> AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.validate(
            3,
            configuration
        ));
    }

    @Test
    public void testAllofFalseAnyofTrueOneofTrueFails() {
        // allOf: false, anyOf: true, oneOf: true
        Assert.assertThrows(ValidationException.class, () -> AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.validate(
            15,
            configuration
        ));
    }

    @Test
    public void testAllofTrueAnyofFalseOneofFalseFails() {
        // allOf: true, anyOf: false, oneOf: false
        Assert.assertThrows(ValidationException.class, () -> AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.validate(
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
        Assert.assertThrows(ValidationException.class, () -> AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.validate(
            1,
            configuration
        ));
    }

    @Test
    public void testAllofTrueAnyofFalseOneofTrueFails() {
        // allOf: true, anyOf: false, oneOf: true
        Assert.assertThrows(ValidationException.class, () -> AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.validate(
            10,
            configuration
        ));
    }

    @Test
    public void testAllofTrueAnyofTrueOneofFalseFails() {
        // allOf: true, anyOf: true, oneOf: false
        Assert.assertThrows(ValidationException.class, () -> AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.validate(
            6,
            configuration
        ));
    }
}
