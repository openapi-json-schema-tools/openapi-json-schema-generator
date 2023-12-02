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

public class NotTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testDisallowedFails() {
        // disallowed
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            Not.Not1.class,
            1,
            configuration
        ));
    }

    @Test
    public void testAllowedPasses() {
        // allowed
        Not.Not1.validate(
            "foo",
            configuration
        );
    }
}
