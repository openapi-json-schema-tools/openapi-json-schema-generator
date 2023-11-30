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

public class NotTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testDisallowedFails() {
        // disallowed
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            Not.Not1.class,
            1,
            configuration
        ));
    }

    @Test
    public void testAllowedPasses() {
        // allowed
        // payload type = string
        // dataType =
        Not.Not1.validate(
            "foo",
            configuration
        );
    }
}
