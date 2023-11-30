package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class NotTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testDisallowedFails() {
        // disallowed
        Assert.assertThrows(ValidationException.class, () -> Not.Not1.validate(
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
