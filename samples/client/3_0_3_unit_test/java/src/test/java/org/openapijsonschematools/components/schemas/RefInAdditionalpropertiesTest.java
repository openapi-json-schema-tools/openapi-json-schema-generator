package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.JsonSchema;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class RefInAdditionalpropertiesTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testPropertyNamedRefValidPasses() {
        // property named $ref valid
        RefInAdditionalproperties.RefInAdditionalproperties1.validate(
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>(
                    "someProp",
                    Map.ofEntries(
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
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            RefInAdditionalproperties.RefInAdditionalproperties1.class,
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>(
                    "someProp",
                    Map.ofEntries(
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
