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

public class DependentSchemasSingleDependencyTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testWrongTypeFails() {
        // wrong type
        final var schema = DependentSchemasSingleDependency.DependentSchemasSingleDependency1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Object>(
                        "foo",
                        "quux"
                    ),
                    new AbstractMap.SimpleEntry<String, Object>(
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

    @Test
    public void testValidPasses() throws ValidationException {
        // valid
        final var schema = DependentSchemasSingleDependency.DependentSchemasSingleDependency1.getInstance();
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
    }

    @Test
    public void testNoDependencyPasses() throws ValidationException {
        // no dependency
        final var schema = DependentSchemasSingleDependency.DependentSchemasSingleDependency1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, String>(
                    "foo",
                    "quux"
                )
            ),
            configuration
        );
    }

    @Test
    public void testIgnoresOtherNonObjectsPasses() throws ValidationException {
        // ignores other non-objects
        final var schema = DependentSchemasSingleDependency.DependentSchemasSingleDependency1.getInstance();
        schema.validate(
            12,
            configuration
        );
    }

    @Test
    public void testIgnoresArraysPasses() throws ValidationException {
        // ignores arrays
        final var schema = DependentSchemasSingleDependency.DependentSchemasSingleDependency1.getInstance();
        schema.validate(
            Arrays.asList(
                "bar"
            ),
            configuration
        );
    }

    @Test
    public void testWrongTypeBothFails() {
        // wrong type both
        final var schema = DependentSchemasSingleDependency.DependentSchemasSingleDependency1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, String>(
                        "foo",
                        "quux"
                    ),
                    new AbstractMap.SimpleEntry<String, String>(
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

    @Test
    public void testIgnoresStringsPasses() throws ValidationException {
        // ignores strings
        final var schema = DependentSchemasSingleDependency.DependentSchemasSingleDependency1.getInstance();
        schema.validate(
            "foobar",
            configuration
        );
    }

    @Test
    public void testWrongTypeOtherFails() {
        // wrong type other
        final var schema = DependentSchemasSingleDependency.DependentSchemasSingleDependency1.getInstance();
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
