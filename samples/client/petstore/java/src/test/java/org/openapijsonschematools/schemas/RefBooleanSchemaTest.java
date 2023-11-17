package org.openapijsonschematools.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;

class RefBooleanSchema {
    public class RefBooleanSchema1 extends BooleanJsonSchema{}
}

public class RefBooleanSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testValidateTrue() {
        Boolean validatedValue = RefBooleanSchema.RefBooleanSchema1.validate(Boolean.TRUE, configuration);
        Assert.assertEquals(validatedValue, Boolean.TRUE);
    }

    @Test
    public void testValidateFalse() {
        Boolean validatedValue = RefBooleanSchema.RefBooleanSchema1.validate(Boolean.FALSE, configuration);
        Assert.assertEquals(validatedValue, Boolean.FALSE);
    }

    @Test
    public void testExceptionThrownForInvalidType() {
        Assert.assertThrows(RuntimeException.class, () -> JsonSchema.validate(
                RefBooleanSchema.RefBooleanSchema1.class, (Void) null, configuration
        ));
    }
}
