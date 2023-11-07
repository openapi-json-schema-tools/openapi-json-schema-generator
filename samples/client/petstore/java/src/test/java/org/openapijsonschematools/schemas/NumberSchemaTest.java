package org.openapijsonschematools.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.math.BigDecimal;

public class NumberSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testValidateInteger() {
        BigDecimal validatedValue = NumberSchema.validate(1, configuration);
        Assert.assertEquals(validatedValue, BigDecimal.valueOf(1));
    }

    @Test
    public void testValidateLong() {
        BigDecimal validatedValue = NumberSchema.validate(1L, configuration);
        Assert.assertEquals(validatedValue, BigDecimal.valueOf(1L));
    }

    @Test
    public void testValidateFloat() {
        BigDecimal validatedValue = NumberSchema.validate(3.14f, configuration);
        Assert.assertEquals(validatedValue, BigDecimal.valueOf(3.14f));
    }

    @Test
    public void testValidateDouble() {
        BigDecimal validatedValue = NumberSchema.validate(3.14d, configuration);
        Assert.assertEquals(validatedValue, BigDecimal.valueOf(3.14d));
    }

    @Test
    public void testExceptionThrownForInvalidType() {
        Assert.assertThrows(RuntimeException.class, () -> Schema.validate(
                NumberSchema.class, (Void) null, configuration
        ));
    }
}
