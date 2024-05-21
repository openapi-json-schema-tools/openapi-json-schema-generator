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

public class AnyofComplexTypesTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testSecondAnyofValidComplexPasses() throws ValidationException {
        // second anyOf valid (complex)
        final var schema = AnyofComplexTypes.AnyofComplexTypes1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, String>(
                    "foo",
                    "baz"
                )
            ),
            configuration
        );
    }

    @Test
    public void testBothAnyofValidComplexPasses() throws ValidationException {
        // both anyOf valid (complex)
        final var schema = AnyofComplexTypes.AnyofComplexTypes1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Object>(
                    "foo",
                    "baz"
                ),
                new AbstractMap.SimpleEntry<String, Object>(
                    "bar",
                    2
                )
            ),
            configuration
        );
    }

    @Test
    public void testFirstAnyofValidComplexPasses() throws ValidationException {
        // first anyOf valid (complex)
        final var schema = AnyofComplexTypes.AnyofComplexTypes1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Number>(
                    "bar",
                    2
                )
            ),
            configuration
        );
    }

    @Test
    public void testNeitherAnyofValidComplexFails() {
        // neither anyOf valid (complex)
        final var schema = AnyofComplexTypes.AnyofComplexTypes1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Object>(
                        "foo",
                        2
                    ),
                    new AbstractMap.SimpleEntry<String, Object>(
                        "bar",
                        "quux"
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
