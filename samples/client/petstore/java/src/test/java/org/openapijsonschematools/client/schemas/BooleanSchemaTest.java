package org.openapijsonschematools.client.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

import java.util.LinkedHashSet;
import java.util.List;

public class BooleanSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final BooleanJsonSchema.BooleanJsonSchema1 booleanJsonSchema = BooleanJsonSchema.BooleanJsonSchema1.getInstance();
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );
    
    @Test
    public void testValidateTrue() throws ValidationException {
        boolean validatedValue = booleanJsonSchema.validate(true, configuration);
        Assert.assertTrue(validatedValue);
    }

    @Test
    public void testValidateFalse() throws ValidationException {
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
