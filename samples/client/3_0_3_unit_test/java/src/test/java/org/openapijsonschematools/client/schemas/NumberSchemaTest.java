package org.openapijsonschematools.client.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.math.BigDecimal;

public class NumberSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final NumberJsonSchema numberJsonSchema = JsonSchemaFactory.getInstance(NumberJsonSchema.class);

    @Test
    public void testValidateInteger() {
        int validatedValue = numberJsonSchema.validate(1, configuration);
        Assert.assertEquals(validatedValue, 1);
    }

    @Test
    public void testValidateLong() {
        long validatedValue = numberJsonSchema.validate(1L, configuration);
        Assert.assertEquals(validatedValue, 1L);
    }

    @Test
    public void testValidateFloat() {
        float validatedValue = numberJsonSchema.validate(3.14f, configuration);
        Assert.assertEquals(validatedValue, 3.14f);
    }

    @Test
    public void testValidateDouble() {
        double validatedValue = numberJsonSchema.validate(3.14d, configuration);
        Assert.assertEquals(validatedValue, 3.14d);
    }

    @Test
    public void testExceptionThrownForInvalidType() {
        Assert.assertThrows(ValidationException.class, () -> numberJsonSchema.validate(
                null, configuration
        ));
    }
}
