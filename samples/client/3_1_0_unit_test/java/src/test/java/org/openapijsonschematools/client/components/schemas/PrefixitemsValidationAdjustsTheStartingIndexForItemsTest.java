package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class PrefixitemsValidationAdjustsTheStartingIndexForItemsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testValidItemsPasses() {
        // valid items
        final var schema = PrefixitemsValidationAdjustsTheStartingIndexForItems.PrefixitemsValidationAdjustsTheStartingIndexForItems1.getInstance();
        schema.validate(
            new PrefixitemsValidationAdjustsTheStartingIndexForItems.PrefixitemsValidationAdjustsTheStartingIndexForItemsListBuilder(
                Arrays.asList(
                    "x",
                    2,
                    3
                )
            ).build(),
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
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }
}
