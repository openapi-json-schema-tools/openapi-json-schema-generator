package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class UniqueitemsFalseWithAnArrayOfItemsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

    @Test
    public void testFalseFalseFromItemsArrayIsValidPasses() throws ValidationException {
        // [false, false] from items array is valid
        final var schema = UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItems1.getInstance();
        schema.validate(
            new UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItemsListBuilder()
                .add(false)

                .add(false)

            .build(),
            configuration
        );
    }

    @Test
    public void testNonUniqueArrayExtendedFromFalseTrueIsValidPasses() throws ValidationException {
        // non-unique array extended from [false, true] is valid
        final var schema = UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItems1.getInstance();
        schema.validate(
            new UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItemsListBuilder()
                .add(false)

                .add(true)

                .add("foo")

                .add("foo")

            .build(),
            configuration
        );
    }

    @Test
    public void testTrueTrueFromItemsArrayIsValidPasses() throws ValidationException {
        // [true, true] from items array is valid
        final var schema = UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItems1.getInstance();
        schema.validate(
            new UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItemsListBuilder()
                .add(true)

                .add(true)

            .build(),
            configuration
        );
    }

    @Test
    public void testUniqueArrayExtendedFromFalseTrueIsValidPasses() throws ValidationException {
        // unique array extended from [false, true] is valid
        final var schema = UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItems1.getInstance();
        schema.validate(
            new UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItemsListBuilder()
                .add(false)

                .add(true)

                .add("foo")

                .add("bar")

            .build(),
            configuration
        );
    }

    @Test
    public void testUniqueArrayExtendedFromTrueFalseIsValidPasses() throws ValidationException {
        // unique array extended from [true, false] is valid
        final var schema = UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItems1.getInstance();
        schema.validate(
            new UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItemsListBuilder()
                .add(true)

                .add(false)

                .add("foo")

                .add("bar")

            .build(),
            configuration
        );
    }

    @Test
    public void testFalseTrueFromItemsArrayIsValidPasses() throws ValidationException {
        // [false, true] from items array is valid
        final var schema = UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItems1.getInstance();
        schema.validate(
            new UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItemsListBuilder()
                .add(false)

                .add(true)

            .build(),
            configuration
        );
    }

    @Test
    public void testTrueFalseFromItemsArrayIsValidPasses() throws ValidationException {
        // [true, false] from items array is valid
        final var schema = UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItems1.getInstance();
        schema.validate(
            new UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItemsListBuilder()
                .add(true)

                .add(false)

            .build(),
            configuration
        );
    }

    @Test
    public void testNonUniqueArrayExtendedFromTrueFalseIsValidPasses() throws ValidationException {
        // non-unique array extended from [true, false] is valid
        final var schema = UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItems1.getInstance();
        schema.validate(
            new UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItemsListBuilder()
                .add(true)

                .add(false)

                .add("foo")

                .add("foo")

            .build(),
            configuration
        );
    }
}
