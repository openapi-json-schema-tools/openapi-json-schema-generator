package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.JsonSchema;

import java.util.Arrays;
import java.util.Map;
import java.util.AbstractMap;

public class RefInItemsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testPropertyNamedRefValidPasses() {
        // property named $ref valid
        RefInItems.RefInItems1.validate(
            Arrays.asList(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>(
                        "$ref",
                        "a"
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
            RefInItems.RefInItems1.class,
            Arrays.asList(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>(
                        "$ref",
                        2
                    )
                )
            ),
            configuration
        ));
    }
}
