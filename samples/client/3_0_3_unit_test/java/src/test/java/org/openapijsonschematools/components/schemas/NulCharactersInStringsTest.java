package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.MapBuilder;

import java.util.Arrays;
import java.util.AbstractMap;

public class NulCharactersInStringsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testMatchStringWithNulPasses() {
        // match string with nul
        // payload type = string
        // dataType =
        NulCharactersInStrings.NulCharactersInStrings1.validate(
            "hello\0there",
            configuration
        );
    }

    @Test
    public void testDoNotMatchStringLackingNulFails() {
        // do not match string lacking nul
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            NulCharactersInStrings.NulCharactersInStrings1.class,
            "hellothere",
            configuration
        ));
    }
}
