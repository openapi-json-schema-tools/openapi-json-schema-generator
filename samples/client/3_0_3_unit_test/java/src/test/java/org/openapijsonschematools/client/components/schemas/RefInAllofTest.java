package org.openapijsonschematools.client.components.schemas;

import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.schemas.validation.MapMaker;

import java.util.AbstractMap;

public class RefInAllofTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testPropertyNamedRefValidPasses() {
        // property named $ref valid
        final var schema = RefInAllof.RefInAllof1.getInstance();
        schema.validate(
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "$ref",
                    "a"
                )
            ),
            configuration
        );
    }

    @Test
    public void testPropertyNamedRefInvalidFails() {
        // property named $ref invalid
        final var schema = RefInAllof.RefInAllof1.getInstance();
        try {
            schema.validate(
                MapMaker.makeMap(
                    new AbstractMap.SimpleEntry<>(
                        "$ref",
                        2
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
