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

public class AnyofWithBaseSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testMismatchBaseSchemaFails() {
        // mismatch base schema
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            AnyofWithBaseSchema.AnyofWithBaseSchema1.class,
            3,
            configuration
        ));
    }

    @Test
    public void testOneAnyofValidPasses() {
        // one anyOf valid
        AnyofWithBaseSchema.AnyofWithBaseSchema1.validate(
            "foobar",
            configuration
        );
    }

    @Test
    public void testBothAnyofInvalidFails() {
        // both anyOf invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            AnyofWithBaseSchema.AnyofWithBaseSchema1.class,
            "foo",
            configuration
        ));
    }
}
