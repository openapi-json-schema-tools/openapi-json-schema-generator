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

public class ItemsContainsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

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
        } catch (ValidationException | InvalidTypeException ignored) {
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
        } catch (ValidationException | InvalidTypeException ignored) {
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
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testMatchesBothItemsAndContainsPasses() {
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
