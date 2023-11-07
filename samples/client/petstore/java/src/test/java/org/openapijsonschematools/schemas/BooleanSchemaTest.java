package org.openapijsonschematools.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;

public class BooleanSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testValidateTrue() {
        Boolean validatedValue = BooleanSchema.validate(Boolean.TRUE, configuration);
        Assert.assertEquals(validatedValue, Boolean.TRUE);
    }

    @Test
    public void testValidateFalse() {
        Boolean validatedValue = BooleanSchema.validate(Boolean.FALSE, configuration);
        Assert.assertEquals(validatedValue, Boolean.FALSE);
    }

    @Test
    public void testExceptionThrownForInvalidType() {
        Assert.assertThrows(RuntimeException.class, () -> Schema.validate(
                BooleanSchema.class, (Void) null, configuration
        ));
    }
}
