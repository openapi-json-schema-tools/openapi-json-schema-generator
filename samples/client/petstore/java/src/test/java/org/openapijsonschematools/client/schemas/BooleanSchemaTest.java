package org.openapijsonschematools.client.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.exceptions.ValidationException;

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
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
                BooleanJsonSchema.class, (Void) null, configuration
        ));
    }
}
