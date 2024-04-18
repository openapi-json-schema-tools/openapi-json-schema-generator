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

public class PatternpropertiesValidatesPropertiesMatchingARegexTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

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
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testASingleValidMatchIsValidPasses() throws ValidationException {
        // a single valid match is valid
        final var schema = PatternpropertiesValidatesPropertiesMatchingARegex.PatternpropertiesValidatesPropertiesMatchingARegex1.getInstance();
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
    public void testIgnoresOtherNonObjectsPasses() throws ValidationException {
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
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testMultipleValidMatchesIsValidPasses() throws ValidationException {
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
    public void testIgnoresArraysPasses() throws ValidationException {
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
    public void testIgnoresStringsPasses() throws ValidationException {
        // ignores strings
        final var schema = PatternpropertiesValidatesPropertiesMatchingARegex.PatternpropertiesValidatesPropertiesMatchingARegex1.getInstance();
        schema.validate(
            "foo",
            configuration
        );
    }
}
