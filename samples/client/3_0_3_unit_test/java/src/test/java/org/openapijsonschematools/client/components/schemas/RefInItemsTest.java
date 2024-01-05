package org.openapijsonschematools.client.components.schemas;

import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.schemas.validation.MapMaker;

import java.util.Arrays;
import java.util.AbstractMap;

public class RefInItemsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testPropertyNamedRefValidPasses() {
        // property named $ref valid
        final var schema = RefInItems.RefInItems1.getInstance();
        schema.validate(
            new RefInItems.RefInItemsListBuilder(
                Arrays.asList(
                    MapMaker.makeMap(
                        new AbstractMap.SimpleEntry<>(
                            "$ref",
                            "a"
                        )
                    )
                )
            ).build(),
            configuration
        );
    }

    @Test
    public void testPropertyNamedRefInvalidFails() {
        // property named $ref invalid
        final var schema = RefInItems.RefInItems1.getInstance();
        try {
            schema.validate(
                Arrays.asList(
                    MapMaker.makeMap(
                        new AbstractMap.SimpleEntry<>(
                            "$ref",
                            2
                        )
                    )
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }
}
