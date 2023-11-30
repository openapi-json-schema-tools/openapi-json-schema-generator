package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class OneofWithEmptySchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testOneValidValidPasses() {
        // one valid - valid
        OneofWithEmptySchema.OneofWithEmptySchema1.validate(
            "foo",
            configuration
        );
    }

    @Test
    public void testBothValidInvalidFails() {
        // both valid - invalid
        Assert.assertThrows(ValidationException.class, () -> OneofWithEmptySchema.OneofWithEmptySchema1.validate(
            123,
            configuration
        ));
    }
}
