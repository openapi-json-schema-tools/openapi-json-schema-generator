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
        Boolean validatedValue = BooleanJsonSchema.validate(Boolean.TRUE, configuration);
        Assert.assertEquals(validatedValue, Boolean.TRUE);
    }

    @Test
    public void testValidateFalse() {
        Boolean validatedValue = BooleanJsonSchema.validate(Boolean.FALSE, configuration);
        Assert.assertEquals(validatedValue, Boolean.FALSE);
    }

    @Test
    public void testExceptionThrownForInvalidType() {
        Assert.assertThrows(RuntimeException.class, () -> JsonSchema.validateObject(
                BooleanJsonSchema.class, (Void) null, configuration
        ));
    }
}
