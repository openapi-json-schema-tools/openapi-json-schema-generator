package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class AllofWithBaseSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testMismatchBaseSchemaFails() {
        // mismatch base schema
        final var schema = AllofWithBaseSchema.AllofWithBaseSchema1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, @Nullable String>(
                        "foo",
                        "quux"
                    ),
                    new AbstractMap.SimpleEntry<String, @Nullable String>(
                        "baz",
                        null
                    )
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testMismatchFirstAllofFails() {
        // mismatch first allOf
        final var schema = AllofWithBaseSchema.AllofWithBaseSchema1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, @Nullable Number>(
                        "bar",
                        2
                    ),
                    new AbstractMap.SimpleEntry<String, @Nullable Number>(
                        "baz",
                        null
                    )
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testValidPasses() throws ValidationException {
        // valid
        final var schema = AllofWithBaseSchema.AllofWithBaseSchema1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, @Nullable Object>(
                    "foo",
                    "quux"
                ),
                new AbstractMap.SimpleEntry<String, @Nullable Object>(
                    "bar",
                    2
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
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Number>(
                        "bar",
                        2
                    )
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testMismatchSecondAllofFails() {
        // mismatch second allOf
        final var schema = AllofWithBaseSchema.AllofWithBaseSchema1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Object>(
                        "foo",
                        "quux"
                    ),
                    new AbstractMap.SimpleEntry<String, Object>(
                        "bar",
                        2
                    )
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }
}
