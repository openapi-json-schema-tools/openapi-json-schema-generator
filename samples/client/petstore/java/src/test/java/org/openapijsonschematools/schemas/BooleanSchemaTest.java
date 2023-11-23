package org.openapijsonschematools.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.validation.JsonSchema;

public class BooleanSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testValidateTrue() {
        boolean validatedValue = BooleanJsonSchema.validate(true, configuration);
        Assert.assertEquals(validatedValue, true);
    }

    @Test
    public void testValidateFalse() {
        boolean validatedValue = BooleanJsonSchema.validate(false, configuration);
        Assert.assertEquals(validatedValue, false);
    }

    @Test
    public void testExceptionThrownForInvalidType() {
        Assert.assertThrows(RuntimeException.class, () -> JsonSchema.validateObject(
                BooleanJsonSchema.class, (Void) null, configuration
        ));
    }
}
