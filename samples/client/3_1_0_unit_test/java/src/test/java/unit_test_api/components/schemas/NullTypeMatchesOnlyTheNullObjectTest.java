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

public class NullTypeMatchesOnlyTheNullObjectTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testZeroIsNotNullFails() {
        // zero is not null
        final var schema = NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.getInstance();
        try {
            schema.validate(
                0,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testAnArrayIsNotNullFails() {
        // an array is not null
        final var schema = NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.getInstance();
        try {
            schema.validate(
                Arrays.asList(
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testAnObjectIsNotNullFails() {
        // an object is not null
        final var schema = NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.getInstance();
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

    @Test
    public void testTrueIsNotNullFails() {
        // true is not null
        final var schema = NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.getInstance();
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
    public void testFalseIsNotNullFails() {
        // false is not null
        final var schema = NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.getInstance();
        try {
            schema.validate(
                false,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testNullIsNullPasses() throws ValidationException {
        // null is null
        final var schema = NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.getInstance();
        schema.validate(
            (Void) null,
            configuration
        );
    }

    @Test
    public void testAStringIsNotNullFails() {
        // a string is not null
        final var schema = NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.getInstance();
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
    public void testAnIntegerIsNotNullFails() {
        // an integer is not null
        final var schema = NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.getInstance();
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
    public void testAnEmptyStringIsNotNullFails() {
        // an empty string is not null
        final var schema = NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.getInstance();
        try {
            schema.validate(
                "",
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testAFloatIsNotNullFails() {
        // a float is not null
        final var schema = NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.getInstance();
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
}
