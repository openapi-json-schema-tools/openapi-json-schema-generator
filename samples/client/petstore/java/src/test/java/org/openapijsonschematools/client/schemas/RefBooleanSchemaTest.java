package org.openapijsonschematools.client.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

import java.util.LinkedHashSet;
import java.util.List;

public class RefBooleanSchemaTest {
    public static class RefBooleanSchema {
        public static class RefBooleanSchema1 extends BooleanJsonSchema.BooleanJsonSchema1 {}
    }

    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final BooleanJsonSchema.BooleanJsonSchema1 refBooleanJsonSchema = RefBooleanSchema.RefBooleanSchema1.getInstance();
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );
    
    @Test
    public void testValidateTrue() throws ValidationException, InvalidTypeException {
        Boolean validatedValue = refBooleanJsonSchema.validate(true, configuration);
        Assert.assertEquals(validatedValue, Boolean.TRUE);
    }

    @Test
    public void testValidateFalse() throws ValidationException, InvalidTypeException {
        Boolean validatedValue = refBooleanJsonSchema.validate(false, configuration);
        Assert.assertEquals(validatedValue, Boolean.FALSE);
    }

    @Test
    public void testExceptionThrownForInvalidType() {
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
                refBooleanJsonSchema,
                null,
                validationMetadata
        ));
    }
}