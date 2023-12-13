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

public class ByIntTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final ByInt.ByInt1 schema = JsonSchemaFactory.getInstance(
        ByInt.ByInt1.class
    );

    @Test
    public void testIntByIntFailFails() {
        // int by int fail
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            7,
            configuration
        ));
    }

    @Test
    public void testIntByIntPasses() {
        // int by int
        schema.validate(
            10,
            configuration
        );
    }

    @Test
    public void testIgnoresNonNumbersPasses() {
        // ignores non-numbers
        schema.validate(
            "foo",
            configuration
        );
    }
}
