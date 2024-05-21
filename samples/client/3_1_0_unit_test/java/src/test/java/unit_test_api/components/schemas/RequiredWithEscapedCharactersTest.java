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

public class RequiredWithEscapedCharactersTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testObjectWithSomePropertiesMissingIsInvalidFails() {
        // object with some properties missing is invalid
        final var schema = RequiredWithEscapedCharacters.RequiredWithEscapedCharacters1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, String>(
                        "foo\nbar",
                        "1"
                    ),
                    new AbstractMap.SimpleEntry<String, String>(
                        "foo\"bar",
                        "1"
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
    public void testObjectWithAllPropertiesPresentIsValidPasses() throws ValidationException {
        // object with all properties present is valid
        final var schema = RequiredWithEscapedCharacters.RequiredWithEscapedCharacters1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Number>(
                    "foo\nbar",
                    1
                ),
                new AbstractMap.SimpleEntry<String, Number>(
                    "foo\"bar",
                    1
                ),
                new AbstractMap.SimpleEntry<String, Number>(
                    "foo\\bar",
                    1
                ),
                new AbstractMap.SimpleEntry<String, Number>(
                    "foo\rbar",
                    1
                ),
                new AbstractMap.SimpleEntry<String, Number>(
                    "foo\tbar",
                    1
                ),
                new AbstractMap.SimpleEntry<String, Number>(
                    "foo\fbar",
                    1
                )
            ),
            configuration
        );
    }
}
