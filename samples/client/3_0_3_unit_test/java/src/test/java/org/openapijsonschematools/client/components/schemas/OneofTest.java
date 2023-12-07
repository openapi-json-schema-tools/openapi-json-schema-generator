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

public class OneofTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testBothOneofValidFails() {
        // both oneOf valid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            Oneof.Oneof1.class,
            3,
            configuration
        ));
    }

    @Test
    public void testNeitherOneofValidFails() {
        // neither oneOf valid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            Oneof.Oneof1.class,
            1.5d,
            configuration
        ));
    }

    @Test
    public void testSecondOneofValidPasses() {
        // second oneOf valid
        Oneof.Oneof1.validate(
            2.5d,
            configuration
        );
    }

    @Test
    public void testFirstOneofValidPasses() {
        // first oneOf valid
        Oneof.Oneof1.validate(
            1,
            configuration
        );
    }
}
