package org.openapijsonschematools.client.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

import java.util.LinkedHashSet;
import java.util.List;

public class RefBooleanSchemaTest {
    public static class RefBooleanSchema {
        public static class RefBooleanSchema1 extends BooleanJsonSchema{}
    }

    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final RefBooleanSchema.RefBooleanSchema1 refBooleanJsonSchema = JsonSchemaFactory.getInstance(RefBooleanSchema.RefBooleanSchema1.class);
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testValidateTrue() {
        Boolean validatedValue = refBooleanJsonSchema.validate(true, configuration);
        Assert.assertEquals(validatedValue, Boolean.TRUE);
    }

    @Test
    public void testValidateFalse() {
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