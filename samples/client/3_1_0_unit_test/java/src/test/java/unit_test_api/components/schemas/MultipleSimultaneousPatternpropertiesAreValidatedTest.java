package unit_test_api.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import unit_test_api.configurations.JsonSchemaKeywordFlags;
import unit_test_api.configurations.SchemaConfiguration;
import unit_test_api.exceptions.ValidationException;
import unit_test_api.schemas.validation.MapUtils;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class MultipleSimultaneousPatternpropertiesAreValidatedTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testASimultaneousMatchIsValidPasses() throws ValidationException {
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
    public void testASingleValidMatchIsValidPasses() throws ValidationException {
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
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testMultipleMatchesIsValidPasses() throws ValidationException {
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
        } catch (ValidationException ignored) {
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
        } catch (ValidationException ignored) {
            ;
        }
    }
}
