package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.MapMaker;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

public class ByIntTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testIntByIntFailFails() {
        // int by int fail
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            ByInt.ByInt1.class,
            7,
            configuration
        ));
    }

    @Test
    public void testIntByIntPasses() {
        // int by int
        ByInt.ByInt1.validate(
            10,
            configuration
        );
    }

    @Test
    public void testIgnoresNonNumbersPasses() {
        // ignores non-numbers
        ByInt.ByInt1.validate(
            "foo",
            configuration
        );
    }
}
