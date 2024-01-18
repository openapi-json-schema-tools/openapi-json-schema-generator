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

public class ASchemaGivenForPrefixitemsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

    @Test
    public void testCorrectTypesPasses() {
        // correct types
        final var schema = ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1.getInstance();
        schema.validate(
            Arrays.asList(
                1,
                "foo"
            ),
            configuration
        );
    }

    @Test
    public void testArrayWithAdditionalItemsPasses() {
        // array with additional items
        final var schema = ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1.getInstance();
        schema.validate(
            Arrays.asList(
                1,
                "foo",
                true
            ),
            configuration
        );
    }

    @Test
    public void testJavascriptPseudoArrayIsValidPasses() {
        // JavaScript pseudo-array is valid
        final var schema = ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Object>(
                    "0",
                    "invalid"
                ),
                new AbstractMap.SimpleEntry<String, Object>(
                    "1",
                    "valid"
                ),
                new AbstractMap.SimpleEntry<String, Object>(
                    "length",
                    2
                )
            ),
            configuration
        );
    }

    @Test
    public void testEmptyArrayPasses() {
        // empty array
        final var schema = ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1.getInstance();
        schema.validate(
            Arrays.asList(
            ),
            configuration
        );
    }

    @Test
    public void testWrongTypesFails() {
        // wrong types
        final var schema = ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1.getInstance();
        try {
            schema.validate(
                Arrays.asList(
                    "foo",
                    1
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testIncompleteArrayOfItemsPasses() {
        // incomplete array of items
        final var schema = ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1.getInstance();
        schema.validate(
            Arrays.asList(
                1
            ),
            configuration
        );
    }
}
