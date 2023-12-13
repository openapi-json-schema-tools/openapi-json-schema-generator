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

public class NulCharactersInStringsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final NulCharactersInStrings.NulCharactersInStrings1 schema = JsonSchemaFactory.getInstance(
        NulCharactersInStrings.NulCharactersInStrings1.class
    );

    @Test
    public void testMatchStringWithNulPasses() {
        // match string with nul
        schema.validate(
            "hello\0there",
            configuration
        );
    }

    @Test
    public void testDoNotMatchStringLackingNulFails() {
        // do not match string lacking nul
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            "hellothere",
            configuration
        ));
    }
}
