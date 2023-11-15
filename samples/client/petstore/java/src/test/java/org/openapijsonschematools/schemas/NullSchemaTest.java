package org.openapijsonschematools.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;

public class NullSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testValidateNull() {
        Void validatedValue = JsonSchemas.NullSchema.validate(null, configuration);
        Assert.assertNull(validatedValue);
    }

    @Test
    public void testExceptionThrownForInvalidType() {
        Assert.assertThrows(RuntimeException.class, () -> JsonSchema.validate(
                JsonSchemas.NullSchema.class, Boolean.TRUE, configuration
        ));
    }
}
