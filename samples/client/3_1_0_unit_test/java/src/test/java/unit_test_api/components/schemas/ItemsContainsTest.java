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

public class ItemsContainsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testMatchesItemsDoesNotMatchContainsFails() {
        // matches items, does not match contains
        final var schema = ItemsContains.ItemsContains1.getInstance();
        try {
            schema.validate(
                Arrays.asList(
                    2,
                    4,
                    8
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testMatchesNeitherItemsNorContainsFails() {
        // matches neither items nor contains
        final var schema = ItemsContains.ItemsContains1.getInstance();
        try {
            schema.validate(
                Arrays.asList(
                    1,
                    5
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testDoesNotMatchItemsMatchesContainsFails() {
        // does not match items, matches contains
        final var schema = ItemsContains.ItemsContains1.getInstance();
        try {
            schema.validate(
                Arrays.asList(
                    3,
                    6,
                    9
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testMatchesBothItemsAndContainsPasses() throws ValidationException {
        // matches both items and contains
        final var schema = ItemsContains.ItemsContains1.getInstance();
        schema.validate(
            new ItemsContains.ItemsContainsListBuilder()
                .add(6)

                .add(12)

            .build(),
            configuration
        );
    }
}
