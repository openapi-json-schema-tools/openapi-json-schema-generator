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

public class RegexesAreNotAnchoredByDefaultAndAreCaseSensitiveTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testRegexesAreCaseSensitivePasses() throws ValidationException {
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
    public void testNonRecognizedMembersAreIgnoredPasses() throws ValidationException {
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
        } catch (ValidationException ignored) {
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
        } catch (ValidationException ignored) {
            ;
        }
    }
}
