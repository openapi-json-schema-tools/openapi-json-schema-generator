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

public class BooleanSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final BooleanJsonSchema booleanJsonSchema = JsonSchemaFactory.getInstance(BooleanJsonSchema.class);
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );
    
    @Test
    public void testValidateTrue() {
        boolean validatedValue = booleanJsonSchema.validate(true, configuration);
        Assert.assertTrue(validatedValue);
    }

    @Test
    public void testValidateFalse() {
        boolean validatedValue = booleanJsonSchema.validate(false, configuration);
        Assert.assertFalse(validatedValue);
    }

    @Test
    public void testExceptionThrownForInvalidType() {
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
                booleanJsonSchema,
                null,
                validationMetadata
        ));
    }
}
