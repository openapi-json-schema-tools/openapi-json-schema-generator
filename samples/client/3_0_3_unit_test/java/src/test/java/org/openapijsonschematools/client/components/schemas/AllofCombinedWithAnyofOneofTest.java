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

public class AllofCombinedWithAnyofOneofTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testAllofFalseAnyofFalseOneofTrueFails() {
        // allOf: false, anyOf: false, oneOf: true
        final var schema = AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.getInstance();
        try {
            schema.validate(
                5L,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testAllofFalseAnyofTrueOneofFalseFails() {
        // allOf: false, anyOf: true, oneOf: false
        final var schema = AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.getInstance();
        try {
            schema.validate(
                3L,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testAllofFalseAnyofTrueOneofTrueFails() {
        // allOf: false, anyOf: true, oneOf: true
        final var schema = AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.getInstance();
        try {
            schema.validate(
                15L,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testAllofTrueAnyofFalseOneofFalseFails() {
        // allOf: true, anyOf: false, oneOf: false
        final var schema = AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.getInstance();
        try {
            schema.validate(
                2L,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
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
        try {
            schema.validate(
                1L,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testAllofTrueAnyofFalseOneofTrueFails() {
        // allOf: true, anyOf: false, oneOf: true
        final var schema = AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.getInstance();
        try {
            schema.validate(
                10L,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testAllofTrueAnyofTrueOneofFalseFails() {
        // allOf: true, anyOf: true, oneOf: false
        final var schema = AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.getInstance();
        try {
            schema.validate(
                6L,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }
}
