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

public class MultipleSimultaneousPatternpropertiesAreValidatedTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

    @Test
    public void testASimultaneousMatchIsValidPasses() {
        // a simultaneous match is valid
        final var schema = MultipleSimultaneousPatternpropertiesAreValidated.MultipleSimultaneousPatternpropertiesAreValidated1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Number>(
                    "aaaa",
                    18
                )
            ),
            configuration
        );
    }

    @Test
    public void testASingleValidMatchIsValidPasses() {
        // a single valid match is valid
        final var schema = MultipleSimultaneousPatternpropertiesAreValidated.MultipleSimultaneousPatternpropertiesAreValidated1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Number>(
                    "a",
                    21
                )
            ),
            configuration
        );
    }

    @Test
    public void testAnInvalidDueToTheOtherIsInvalidFails() {
        // an invalid due to the other is invalid
        final var schema = MultipleSimultaneousPatternpropertiesAreValidated.MultipleSimultaneousPatternpropertiesAreValidated1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Number>(
                        "aaaa",
                        31
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
    public void testMultipleMatchesIsValidPasses() {
        // multiple matches is valid
        final var schema = MultipleSimultaneousPatternpropertiesAreValidated.MultipleSimultaneousPatternpropertiesAreValidated1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Number>(
                    "a",
                    21
                ),
                new AbstractMap.SimpleEntry<String, Number>(
                    "aaaa",
                    18
                )
            ),
            configuration
        );
    }

    @Test
    public void testAnInvalidDueToOneIsInvalidFails() {
        // an invalid due to one is invalid
        final var schema = MultipleSimultaneousPatternpropertiesAreValidated.MultipleSimultaneousPatternpropertiesAreValidated1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, String>(
                        "a",
                        "bar"
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
    public void testAnInvalidDueToBothIsInvalidFails() {
        // an invalid due to both is invalid
        final var schema = MultipleSimultaneousPatternpropertiesAreValidated.MultipleSimultaneousPatternpropertiesAreValidated1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Object>(
                        "aaa",
                        "foo"
                    ),
                    new AbstractMap.SimpleEntry<String, Object>(
                        "aaaa",
                        31
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
