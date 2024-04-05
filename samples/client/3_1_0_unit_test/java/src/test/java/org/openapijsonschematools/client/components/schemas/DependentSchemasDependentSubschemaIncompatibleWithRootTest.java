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

public class DependentSchemasDependentSubschemaIncompatibleWithRootTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

    @Test
    public void testMatchesRootFails() {
        // matches root
        final var schema = DependentSchemasDependentSubschemaIncompatibleWithRoot.DependentSchemasDependentSubschemaIncompatibleWithRoot1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Number>(
                        "foo",
                        1
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
    public void testMatchesDependencyPasses() throws ValidationException {
        // matches dependency
        final var schema = DependentSchemasDependentSubschemaIncompatibleWithRoot.DependentSchemasDependentSubschemaIncompatibleWithRoot1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Number>(
                    "bar",
                    1
                )
            ),
            configuration
        );
    }

    @Test
    public void testNoDependencyPasses() throws ValidationException {
        // no dependency
        final var schema = DependentSchemasDependentSubschemaIncompatibleWithRoot.DependentSchemasDependentSubschemaIncompatibleWithRoot1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Number>(
                    "baz",
                    1
                )
            ),
            configuration
        );
    }

    @Test
    public void testMatchesBothFails() {
        // matches both
        final var schema = DependentSchemasDependentSubschemaIncompatibleWithRoot.DependentSchemasDependentSubschemaIncompatibleWithRoot1.getInstance();
        try {
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
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }
}
