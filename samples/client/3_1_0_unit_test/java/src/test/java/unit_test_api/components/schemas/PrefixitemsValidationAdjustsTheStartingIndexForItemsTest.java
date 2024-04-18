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

public class PrefixitemsValidationAdjustsTheStartingIndexForItemsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testValidItemsPasses() throws ValidationException {
        // valid items
        final var schema = PrefixitemsValidationAdjustsTheStartingIndexForItems.PrefixitemsValidationAdjustsTheStartingIndexForItems1.getInstance();
        schema.validate(
            new PrefixitemsValidationAdjustsTheStartingIndexForItems.PrefixitemsValidationAdjustsTheStartingIndexForItemsListBuilder()
                .add("x")

                .add(2)

                .add(3)

            .build(),
            configuration
        );
    }

    @Test
    public void testWrongTypeOfSecondItemFails() {
        // wrong type of second item
        final var schema = PrefixitemsValidationAdjustsTheStartingIndexForItems.PrefixitemsValidationAdjustsTheStartingIndexForItems1.getInstance();
        try {
            schema.validate(
                Arrays.asList(
                    "x",
                    "y"
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }
}
