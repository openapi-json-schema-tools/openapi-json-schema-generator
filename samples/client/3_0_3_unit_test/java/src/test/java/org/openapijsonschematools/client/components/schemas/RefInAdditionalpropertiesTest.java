package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.MapMaker;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

public class RefInAdditionalpropertiesTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final RefInAdditionalproperties.RefInAdditionalproperties1 schema = JsonSchemaFactory.getInstance(
        RefInAdditionalproperties.RefInAdditionalproperties1.class
    );

    @Test
    public void testPropertyNamedRefValidPasses() {
        // property named $ref valid
        schema.validate(
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "someProp",
                    MapMaker.makeMap(
                        new AbstractMap.SimpleEntry<>(
                            "$ref",
                            "a"
                        )
                    )
                )
            ),
            configuration
        );
    }

    @Test
    public void testPropertyNamedRefInvalidFails() {
        // property named $ref invalid
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "someProp",
                    MapMaker.makeMap(
                        new AbstractMap.SimpleEntry<>(
                            "$ref",
                            2
                        )
                    )
                )
            ),
            configuration
        ));
    }
}
