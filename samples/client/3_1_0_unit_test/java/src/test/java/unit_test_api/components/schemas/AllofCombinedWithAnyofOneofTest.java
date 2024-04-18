package unit_test_api.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import unit_test_api.configurations.JsonSchemaKeywordFlags;
import unit_test_api.configurations.SchemaConfiguration;
import unit_test_api.exceptions.ValidationException;
import unit_test_api.schemas.validation.MapUtils;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class AllofCombinedWithAnyofOneofTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testAllofFalseAnyofFalseOneofTrueFails() {
        // allOf: false, anyOf: false, oneOf: true
        final var schema = AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.getInstance();
        try {
            schema.validate(
                5,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testAllofFalseAnyofTrueOneofFalseFails() {
        // allOf: false, anyOf: true, oneOf: false
        final var schema = AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.getInstance();
        try {
            schema.validate(
                3,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testAllofFalseAnyofTrueOneofTrueFails() {
        // allOf: false, anyOf: true, oneOf: true
        final var schema = AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.getInstance();
        try {
            schema.validate(
                15,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testAllofTrueAnyofFalseOneofFalseFails() {
        // allOf: true, anyOf: false, oneOf: false
        final var schema = AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.getInstance();
        try {
            schema.validate(
                2,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testAllofTrueAnyofTrueOneofTruePasses() throws ValidationException {
        // allOf: true, anyOf: true, oneOf: true
        final var schema = AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.getInstance();
        schema.validate(
            30,
            configuration
        );
    }

    @Test
    public void testAllofFalseAnyofFalseOneofFalseFails() {
        // allOf: false, anyOf: false, oneOf: false
        final var schema = AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.getInstance();
        try {
            schema.validate(
                1,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testAllofTrueAnyofFalseOneofTrueFails() {
        // allOf: true, anyOf: false, oneOf: true
        final var schema = AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.getInstance();
        try {
            schema.validate(
                10,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testAllofTrueAnyofTrueOneofFalseFails() {
        // allOf: true, anyOf: true, oneOf: false
        final var schema = AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1.getInstance();
        try {
            schema.validate(
                6,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }
}
