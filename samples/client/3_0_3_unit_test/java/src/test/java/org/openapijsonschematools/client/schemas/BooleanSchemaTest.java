package org.openapijsonschematools.client.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.exceptions.ValidationException;

public class BooleanSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final BooleanJsonSchema booleanJsonSchema = JsonSchemaFactory.getInstance(BooleanJsonSchema.class);

    @Test
    public void testValidateTrue() {
        boolean validatedValue = booleanJsonSchema.validate(true, configuration);
        Assert.assertEquals(validatedValue, true);
    }

    @Test
    public void testValidateFalse() {
        boolean validatedValue = booleanJsonSchema.validate(false, configuration);
        Assert.assertEquals(validatedValue, false);
    }

    @Test
    public void testExceptionThrownForInvalidType() {
        Assert.assertThrows(ValidationException.class, () -> booleanJsonSchema.validate(
                (Void) null, configuration
        ));
    }
}
