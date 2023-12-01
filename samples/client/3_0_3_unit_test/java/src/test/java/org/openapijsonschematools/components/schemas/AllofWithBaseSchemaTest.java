package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.MapMaker;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

public class AllofWithBaseSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testMismatchBaseSchemaFails() {
        // mismatch base schema
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            AllofWithBaseSchema.AllofWithBaseSchema1.class,
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    "quux"
                ),
                new AbstractMap.SimpleEntry<>(
                    "baz",
                    (Void) null
                )
            ),
            configuration
        ));
    }

    @Test
    public void testMismatchFirstAllofFails() {
        // mismatch first allOf
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            AllofWithBaseSchema.AllofWithBaseSchema1.class,
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    2
                ),
                new AbstractMap.SimpleEntry<>(
                    "baz",
                    (Void) null
                )
            ),
            configuration
        ));
    }

    @Test
    public void testValidPasses() {
        // valid
        AllofWithBaseSchema.AllofWithBaseSchema1.validate(
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    "quux"
                ),
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    2
                ),
                new AbstractMap.SimpleEntry<>(
                    "baz",
                    (Void) null
                )
            ),
            configuration
        );
    }

    @Test
    public void testMismatchBothFails() {
        // mismatch both
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            AllofWithBaseSchema.AllofWithBaseSchema1.class,
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    2
                )
            ),
            configuration
        ));
    }

    @Test
    public void testMismatchSecondAllofFails() {
        // mismatch second allOf
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            AllofWithBaseSchema.AllofWithBaseSchema1.class,
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    "quux"
                ),
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    2
                )
            ),
            configuration
        ));
    }
}
