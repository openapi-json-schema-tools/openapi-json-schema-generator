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

public class DependentSchemasDependenciesWithEscapedCharactersTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

    @Test
    public void testQuotedQuoteInvalidUnderDependentSchemaFails() {
        // quoted quote invalid under dependent schema
        final var schema = DependentSchemasDependenciesWithEscapedCharacters.DependentSchemasDependenciesWithEscapedCharacters1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Number>(
                        "foo'bar",
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
    public void testQuotedTabInvalidUnderDependentSchemaFails() {
        // quoted tab invalid under dependent schema
        final var schema = DependentSchemasDependenciesWithEscapedCharacters.DependentSchemasDependenciesWithEscapedCharacters1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Number>(
                        "foo\tbar",
                        1
                    ),
                    new AbstractMap.SimpleEntry<String, Number>(
                        "a",
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
    public void testQuotedTabPasses() throws ValidationException {
        // quoted tab
        final var schema = DependentSchemasDependenciesWithEscapedCharacters.DependentSchemasDependenciesWithEscapedCharacters1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Number>(
                    "foo\tbar",
                    1
                ),
                new AbstractMap.SimpleEntry<String, Number>(
                    "a",
                    2
                ),
                new AbstractMap.SimpleEntry<String, Number>(
                    "b",
                    3
                ),
                new AbstractMap.SimpleEntry<String, Number>(
                    "c",
                    4
                )
            ),
            configuration
        );
    }

    @Test
    public void testQuotedQuoteFails() {
        // quoted quote
        final var schema = DependentSchemasDependenciesWithEscapedCharacters.DependentSchemasDependenciesWithEscapedCharacters1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Map<String, ?>>(
                        "foo'bar",
                        MapUtils.makeMap(
                            new AbstractMap.SimpleEntry<String, Number>(
                                "foo\"bar",
                                1
                            )
                        )
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
