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

public class DependentSchemasDependentSubschemaIncompatibleWithRootTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

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
