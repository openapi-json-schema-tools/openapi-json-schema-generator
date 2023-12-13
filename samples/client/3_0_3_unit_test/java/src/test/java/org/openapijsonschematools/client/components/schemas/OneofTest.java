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

public class OneofTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final Oneof.Oneof1 schema = JsonSchemaFactory.getInstance(
        Oneof.Oneof1.class
    );

    @Test
    public void testBothOneofValidFails() {
        // both oneOf valid
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            3,
            configuration
        ));
    }

    @Test
    public void testNeitherOneofValidFails() {
        // neither oneOf valid
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            1.5d,
            configuration
        ));
    }

    @Test
    public void testSecondOneofValidPasses() {
        // second oneOf valid
        schema.validate(
            2.5d,
            configuration
        );
    }

    @Test
    public void testFirstOneofValidPasses() {
        // first oneOf valid
        schema.validate(
            1,
            configuration
        );
    }
}
