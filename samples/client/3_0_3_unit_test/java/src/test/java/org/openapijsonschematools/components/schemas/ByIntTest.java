package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class ByIntTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testIntByIntFailFails() {
        // int by int fail
        Assert.assertThrows(ValidationException.class, () -> ByInt.ByInt1.validate(
            7,
            configuration
        ));
    }

    @Test
    public void testIntByIntPasses() {
        // int by int
        ByInt.ByInt1.validate(
            10,
            configuration
        );
    }

    @Test
    public void testIgnoresNonNumbersPasses() {
        // ignores non-numbers
        ByInt.ByInt1.validate(
            "foo",
            configuration
        );
    }
}
