package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class NulCharactersInStringsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testMatchStringWithNulPasses() {
        // match string with nul
        NulCharactersInStrings.NulCharactersInStrings1.validate(
            "hello\x00there",
            configuration
        );
    }

    @Test
    public void testDoNotMatchStringLackingNulFails() {
        // do not match string lacking nul
        Assert.assertThrows(ValidationException.class, () -> NulCharactersInStrings.NulCharactersInStrings1.validate(
            "hellothere",
            configuration
        ));
    }
}
