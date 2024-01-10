package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class DependentSchemasSingleDependencyTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testWrongTypeFails() {
        // wrong type
        final var schema = DependentSchemasSingleDependency.DependentSchemasSingleDependency1.getInstance();
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
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testValidPasses() {
        // valid
        final var schema = DependentSchemasSingleDependency.DependentSchemasSingleDependency1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Number>(
                    "foo",
                    1
                ),
                new AbstractMap.SimpleEntry<String, Number>(
                    "bar",
                    2
                )
            ),
            configuration
        );
    }

    @Test
    public void testNoDependencyPasses() {
        // no dependency
        final var schema = DependentSchemasSingleDependency.DependentSchemasSingleDependency1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, String>(
                    "foo",
                    "quux"
                )
            ),
            configuration
        );
    }

    @Test
    public void testIgnoresOtherNonObjectsPasses() {
        // ignores other non-objects
        final var schema = DependentSchemasSingleDependency.DependentSchemasSingleDependency1.getInstance();
        schema.validate(
            12,
            configuration
        );
    }

    @Test
    public void testIgnoresArraysPasses() {
        // ignores arrays
        final var schema = DependentSchemasSingleDependency.DependentSchemasSingleDependency1.getInstance();
        schema.validate(
            Arrays.asList(
                "bar"
            ),
            configuration
        );
    }

    @Test
    public void testWrongTypeBothFails() {
        // wrong type both
        final var schema = DependentSchemasSingleDependency.DependentSchemasSingleDependency1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, String>(
                        "foo",
                        "quux"
                    ),
                    new AbstractMap.SimpleEntry<String, String>(
                        "bar",
                        "quux"
                    )
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testIgnoresStringsPasses() {
        // ignores strings
        final var schema = DependentSchemasSingleDependency.DependentSchemasSingleDependency1.getInstance();
        schema.validate(
            "foobar",
            configuration
        );
    }

    @Test
    public void testWrongTypeOtherFails() {
        // wrong type other
        final var schema = DependentSchemasSingleDependency.DependentSchemasSingleDependency1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Object>(
                        "foo",
                        2
                    ),
                    new AbstractMap.SimpleEntry<String, Object>(
                        "bar",
                        "quux"
                    )
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }
}
