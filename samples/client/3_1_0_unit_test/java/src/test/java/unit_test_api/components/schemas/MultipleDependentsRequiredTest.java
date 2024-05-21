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

public class MultipleDependentsRequiredTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testNondependantsPasses() throws ValidationException {
        // nondependants
        final var schema = MultipleDependentsRequired.MultipleDependentsRequired1.getInstance();
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
    public void testMissingOtherDependencyFails() {
        // missing other dependency
        final var schema = MultipleDependentsRequired.MultipleDependentsRequired1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Number>(
                        "bar",
                        1
                    ),
                    new AbstractMap.SimpleEntry<String, Number>(
                        "quux",
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
    public void testWithDependenciesPasses() throws ValidationException {
        // with dependencies
        final var schema = MultipleDependentsRequired.MultipleDependentsRequired1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Number>(
                    "foo",
                    1
                ),
                new AbstractMap.SimpleEntry<String, Number>(
                    "bar",
                    2
                ),
                new AbstractMap.SimpleEntry<String, Number>(
                    "quux",
                    3
                )
            ),
            configuration
        );
    }

    @Test
    public void testMissingBothDependenciesFails() {
        // missing both dependencies
        final var schema = MultipleDependentsRequired.MultipleDependentsRequired1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Number>(
                        "quux",
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
    public void testMissingDependencyFails() {
        // missing dependency
        final var schema = MultipleDependentsRequired.MultipleDependentsRequired1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Number>(
                        "foo",
                        1
                    ),
                    new AbstractMap.SimpleEntry<String, Number>(
                        "quux",
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
    public void testNeitherPasses() throws ValidationException {
        // neither
        final var schema = MultipleDependentsRequired.MultipleDependentsRequired1.getInstance();
        schema.validate(
            MapUtils.makeMap(
            ),
            configuration
        );
    }
}
