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

public class TypeArrayOrObjectTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testNumberIsInvalidFails() {
        // number is invalid
        final var schema = TypeArrayOrObject.TypeArrayOrObject1.getInstance();
        try {
            schema.validate(
                123,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testStringIsInvalidFails() {
        // string is invalid
        final var schema = TypeArrayOrObject.TypeArrayOrObject1.getInstance();
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
    public void testNullIsInvalidFails() {
        // null is invalid
        final var schema = TypeArrayOrObject.TypeArrayOrObject1.getInstance();
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
    public void testArrayIsValidPasses() throws ValidationException {
        // array is valid
        final var schema = TypeArrayOrObject.TypeArrayOrObject1.getInstance();
        schema.validate(
            Arrays.asList(
                1,
                2,
                3
            ),
            configuration
        );
    }

    @Test
    public void testObjectIsValidPasses() throws ValidationException {
        // object is valid
        final var schema = TypeArrayOrObject.TypeArrayOrObject1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Number>(
                    "foo",
                    123
                )
            ),
            configuration
        );
    }
}
