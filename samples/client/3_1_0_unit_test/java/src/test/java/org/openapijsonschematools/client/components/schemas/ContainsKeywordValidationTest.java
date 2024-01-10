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

public class ContainsKeywordValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testArrayWithTwoItemsMatchingSchema56IsValidPasses() {
        // array with two items matching schema (5, 6) is valid
        final var schema = ContainsKeywordValidation.ContainsKeywordValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                3,
                4,
                5,
                6
            ),
            configuration
        );
    }

    @Test
    public void testNotArrayIsValidPasses() {
        // not array is valid
        final var schema = ContainsKeywordValidation.ContainsKeywordValidation1.getInstance();
        schema.validate(
            MapUtils.makeMap(
            ),
            configuration
        );
    }

    @Test
    public void testArrayWithItemMatchingSchema5IsValidPasses() {
        // array with item matching schema (5) is valid
        final var schema = ContainsKeywordValidation.ContainsKeywordValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                3,
                4,
                5
            ),
            configuration
        );
    }

    @Test
    public void testArrayWithItemMatchingSchema6IsValidPasses() {
        // array with item matching schema (6) is valid
        final var schema = ContainsKeywordValidation.ContainsKeywordValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                3,
                4,
                6
            ),
            configuration
        );
    }

    @Test
    public void testArrayWithoutItemsMatchingSchemaIsInvalidFails() {
        // array without items matching schema is invalid
        final var schema = ContainsKeywordValidation.ContainsKeywordValidation1.getInstance();
        try {
            schema.validate(
                Arrays.asList(
                    2,
                    3,
                    4
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testEmptyArrayIsInvalidFails() {
        // empty array is invalid
        final var schema = ContainsKeywordValidation.ContainsKeywordValidation1.getInstance();
        try {
            schema.validate(
                Arrays.asList(
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }
}
