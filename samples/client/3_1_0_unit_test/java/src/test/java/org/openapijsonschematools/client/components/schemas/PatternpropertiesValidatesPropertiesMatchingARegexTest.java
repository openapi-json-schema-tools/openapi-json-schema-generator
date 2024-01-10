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

public class PatternpropertiesValidatesPropertiesMatchingARegexTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testMultipleInvalidMatchesIsInvalidFails() {
        // multiple invalid matches is invalid
        final var schema = PatternpropertiesValidatesPropertiesMatchingARegex.PatternpropertiesValidatesPropertiesMatchingARegex1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, String>(
                        "foo",
                        "bar"
                    ),
                    new AbstractMap.SimpleEntry<String, String>(
                        "foooooo",
                        "baz"
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
    public void testASingleValidMatchIsValidPasses() {
        // a single valid match is valid
        final var schema = PatternpropertiesValidatesPropertiesMatchingARegex.PatternpropertiesValidatesPropertiesMatchingARegex1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    1
                )
            ),
            configuration
        );
    }

    @Test
    public void testIgnoresOtherNonObjectsPasses() {
        // ignores other non-objects
        final var schema = PatternpropertiesValidatesPropertiesMatchingARegex.PatternpropertiesValidatesPropertiesMatchingARegex1.getInstance();
        schema.validate(
            12,
            configuration
        );
    }

    @Test
    public void testASingleInvalidMatchIsInvalidFails() {
        // a single invalid match is invalid
        final var schema = PatternpropertiesValidatesPropertiesMatchingARegex.PatternpropertiesValidatesPropertiesMatchingARegex1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Object>(
                        "foo",
                        "bar"
                    ),
                    new AbstractMap.SimpleEntry<String, Object>(
                        "fooooo",
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
    public void testMultipleValidMatchesIsValidPasses() {
        // multiple valid matches is valid
        final var schema = PatternpropertiesValidatesPropertiesMatchingARegex.PatternpropertiesValidatesPropertiesMatchingARegex1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Number>(
                    "foo",
                    1
                ),
                new AbstractMap.SimpleEntry<String, Number>(
                    "foooooo",
                    2
                )
            ),
            configuration
        );
    }

    @Test
    public void testIgnoresArraysPasses() {
        // ignores arrays
        final var schema = PatternpropertiesValidatesPropertiesMatchingARegex.PatternpropertiesValidatesPropertiesMatchingARegex1.getInstance();
        schema.validate(
            Arrays.asList(
                "foo"
            ),
            configuration
        );
    }

    @Test
    public void testIgnoresStringsPasses() {
        // ignores strings
        final var schema = PatternpropertiesValidatesPropertiesMatchingARegex.PatternpropertiesValidatesPropertiesMatchingARegex1.getInstance();
        schema.validate(
            "foo",
            configuration
        );
    }
}
