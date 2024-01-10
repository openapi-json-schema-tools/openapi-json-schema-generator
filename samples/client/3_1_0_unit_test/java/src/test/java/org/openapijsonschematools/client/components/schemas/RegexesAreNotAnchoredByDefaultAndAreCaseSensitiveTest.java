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

public class RegexesAreNotAnchoredByDefaultAndAreCaseSensitiveTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testRegexesAreCaseSensitivePasses() {
        // regexes are case sensitive
        final var schema = RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Number>(
                    "a_x_3",
                    3
                )
            ),
            configuration
        );
    }

    @Test
    public void testNonRecognizedMembersAreIgnoredPasses() {
        // non recognized members are ignored
        final var schema = RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, String>(
                    "answer 1",
                    "42"
                )
            ),
            configuration
        );
    }

    @Test
    public void testRecognizedMembersAreAccountedForFails() {
        // recognized members are accounted for
        final var schema = RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Void>(
                        "a31b",
                        null
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
    public void testRegexesAreCaseSensitive2Fails() {
        // regexes are case sensitive, 2
        final var schema = RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Number>(
                        "a_X_3",
                        3
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
