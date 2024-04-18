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

public class NotMoreComplexSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testOtherMatchPasses() throws ValidationException {
        // other match
        final var schema = NotMoreComplexSchema.NotMoreComplexSchema1.getInstance();
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
    public void testMismatchFails() {
        // mismatch
        final var schema = NotMoreComplexSchema.NotMoreComplexSchema1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, String>(
                        "foo",
                        "bar"
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
    public void testMatchPasses() throws ValidationException {
        // match
        final var schema = NotMoreComplexSchema.NotMoreComplexSchema1.getInstance();
        schema.validate(
            1,
            configuration
        );
    }
}
