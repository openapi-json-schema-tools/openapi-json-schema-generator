package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.JsonSchema;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class AnyofWithBaseSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testMismatchBaseSchemaFails() {
        // mismatch base schema
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
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
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            AnyofWithBaseSchema.AnyofWithBaseSchema1.class,
            "foo",
            configuration
        ));
    }
}
