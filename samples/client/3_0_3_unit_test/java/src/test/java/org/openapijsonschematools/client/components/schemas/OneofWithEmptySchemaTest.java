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

public class OneofWithEmptySchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final OneofWithEmptySchema.OneofWithEmptySchema1 schema = JsonSchemaFactory.getInstance(
        OneofWithEmptySchema.OneofWithEmptySchema1.class
    );

    @Test
    public void testOneValidValidPasses() {
        // one valid - valid
        schema.validate(
            "foo",
            configuration
        );
    }

    @Test
    public void testBothValidInvalidFails() {
        // both valid - invalid
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            123,
            configuration
        ));
    }
}
