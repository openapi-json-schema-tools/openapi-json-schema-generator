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

public class OneofWithBaseSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final OneofWithBaseSchema.OneofWithBaseSchema1 schema = JsonSchemaFactory.getInstance(
        OneofWithBaseSchema.OneofWithBaseSchema1.class
    );

    @Test
    public void testMismatchBaseSchemaFails() {
        // mismatch base schema
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            3,
            configuration
        ));
    }

    @Test
    public void testOneOneofValidPasses() {
        // one oneOf valid
        schema.validate(
            "foobar",
            configuration
        );
    }

    @Test
    public void testBothOneofValidFails() {
        // both oneOf valid
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            "foo",
            configuration
        ));
    }
}
