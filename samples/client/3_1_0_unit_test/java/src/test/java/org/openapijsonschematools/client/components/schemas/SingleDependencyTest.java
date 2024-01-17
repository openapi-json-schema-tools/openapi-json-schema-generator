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

public class SingleDependencyTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

    @Test
    public void testNondependantPasses() {
        // nondependant
        final var schema = SingleDependency.SingleDependency1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Number>(
                    "foo",
                    1
                )
            ),
            configuration
        );
    }

    @Test
    public void testWithDependencyPasses() {
        // with dependency
        final var schema = SingleDependency.SingleDependency1.getInstance();
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
    public void testMissingDependencyFails() {
        // missing dependency
        final var schema = SingleDependency.SingleDependency1.getInstance();
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
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testIgnoresOtherNonObjectsPasses() {
        // ignores other non-objects
        final var schema = SingleDependency.SingleDependency1.getInstance();
        schema.validate(
            12,
            configuration
        );
    }

    @Test
    public void testIgnoresArraysPasses() {
        // ignores arrays
        final var schema = SingleDependency.SingleDependency1.getInstance();
        schema.validate(
            Arrays.asList(
                "bar"
            ),
            configuration
        );
    }

    @Test
    public void testNeitherPasses() {
        // neither
        final var schema = SingleDependency.SingleDependency1.getInstance();
        schema.validate(
            MapUtils.makeMap(
            ),
            configuration
        );
    }

    @Test
    public void testIgnoresStringsPasses() {
        // ignores strings
        final var schema = SingleDependency.SingleDependency1.getInstance();
        schema.validate(
            "foobar",
            configuration
        );
    }
}
