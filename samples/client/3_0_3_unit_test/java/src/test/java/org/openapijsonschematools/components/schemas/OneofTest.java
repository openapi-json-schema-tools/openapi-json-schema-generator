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

public class OneofTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testBothOneofValidFails() {
        // both oneOf valid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            Oneof.Oneof1.class,
            3,
            configuration
        ));
    }

    @Test
    public void testNeitherOneofValidFails() {
        // neither oneOf valid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            Oneof.Oneof1.class,
            1.5,
            configuration
        ));
    }

    @Test
    public void testSecondOneofValidPasses() {
        // second oneOf valid
        Oneof.Oneof1.validate(
            2.5,
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
