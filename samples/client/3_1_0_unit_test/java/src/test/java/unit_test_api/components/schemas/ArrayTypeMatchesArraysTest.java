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

public class ArrayTypeMatchesArraysTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testABooleanIsNotAnArrayFails() {
        // a boolean is not an array
        final var schema = ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.getInstance();
        try {
            schema.validate(
                true,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testAFloatIsNotAnArrayFails() {
        // a float is not an array
        final var schema = ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.getInstance();
        try {
            schema.validate(
                1.1d,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testAnArrayIsAnArrayPasses() throws ValidationException {
        // an array is an array
        final var schema = ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.getInstance();
        schema.validate(
            Arrays.asList(
            ),
            configuration
        );
    }

    @Test
    public void testNullIsNotAnArrayFails() {
        // null is not an array
        final var schema = ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.getInstance();
        try {
            schema.validate(
                (Void) null,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testAStringIsNotAnArrayFails() {
        // a string is not an array
        final var schema = ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.getInstance();
        try {
            schema.validate(
                "foo",
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testAnIntegerIsNotAnArrayFails() {
        // an integer is not an array
        final var schema = ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.getInstance();
        try {
            schema.validate(
                1,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testAnObjectIsNotAnArrayFails() {
        // an object is not an array
        final var schema = ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }
}
