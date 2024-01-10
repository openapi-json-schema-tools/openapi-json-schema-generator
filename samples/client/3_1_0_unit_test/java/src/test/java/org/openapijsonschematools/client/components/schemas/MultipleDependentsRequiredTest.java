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

public class MultipleDependentsRequiredTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testNondependantsPasses() {
        // nondependants
        final var schema = MultipleDependentsRequired.MultipleDependentsRequired1.getInstance();
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
    public void testMissingOtherDependencyFails() {
        // missing other dependency
        final var schema = MultipleDependentsRequired.MultipleDependentsRequired1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Number>(
                        "bar",
                        1
                    ),
                    new AbstractMap.SimpleEntry<String, Number>(
                        "quux",
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
    public void testWithDependenciesPasses() {
        // with dependencies
        final var schema = MultipleDependentsRequired.MultipleDependentsRequired1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Number>(
                    "foo",
                    1
                ),
                new AbstractMap.SimpleEntry<String, Number>(
                    "bar",
                    2
                ),
                new AbstractMap.SimpleEntry<String, Number>(
                    "quux",
                    3
                )
            ),
            configuration
        );
    }

    @Test
    public void testMissingBothDependenciesFails() {
        // missing both dependencies
        final var schema = MultipleDependentsRequired.MultipleDependentsRequired1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<>(
                        "quux",
                        1
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
    public void testMissingDependencyFails() {
        // missing dependency
        final var schema = MultipleDependentsRequired.MultipleDependentsRequired1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Number>(
                        "foo",
                        1
                    ),
                    new AbstractMap.SimpleEntry<String, Number>(
                        "quux",
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
    public void testNeitherPasses() {
        // neither
        final var schema = MultipleDependentsRequired.MultipleDependentsRequired1.getInstance();
        schema.validate(
            MapUtils.makeMap(
            ),
            configuration
        );
    }
}
