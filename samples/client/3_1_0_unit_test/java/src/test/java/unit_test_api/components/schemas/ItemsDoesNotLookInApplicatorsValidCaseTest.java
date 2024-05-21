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

public class ItemsDoesNotLookInApplicatorsValidCaseTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testPrefixitemsInAllofDoesNotConstrainItemsValidCasePasses() throws ValidationException {
        // prefixItems in allOf does not constrain items, valid case
        final var schema = ItemsDoesNotLookInApplicatorsValidCase.ItemsDoesNotLookInApplicatorsValidCase1.getInstance();
        schema.validate(
            new ItemsDoesNotLookInApplicatorsValidCase.ItemsDoesNotLookInApplicatorsValidCaseListBuilder()
                .add(5)

                .add(5)

            .build(),
            configuration
        );
    }

    @Test
    public void testPrefixitemsInAllofDoesNotConstrainItemsInvalidCaseFails() {
        // prefixItems in allOf does not constrain items, invalid case
        final var schema = ItemsDoesNotLookInApplicatorsValidCase.ItemsDoesNotLookInApplicatorsValidCase1.getInstance();
        try {
            schema.validate(
                Arrays.asList(
                    3,
                    5
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }
}
