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

public class NumberSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final NumberJsonSchema.NumberJsonSchema1 numberJsonSchema = NumberJsonSchema.NumberJsonSchema1.getInstance();
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testValidateInteger() throws ValidationException, InvalidTypeException {
        int validatedValue = numberJsonSchema.validate(1, configuration);
        Assert.assertEquals(validatedValue, 1);
    }

    @Test
    public void testValidateLong() throws ValidationException, InvalidTypeException {
        long validatedValue = numberJsonSchema.validate(1L, configuration);
        Assert.assertEquals(validatedValue, 1L);
    }

    @Test
    public void testValidateFloat() throws ValidationException, InvalidTypeException {
        float validatedValue = numberJsonSchema.validate(3.14f, configuration);
        Assert.assertEquals(Float.compare(validatedValue, 3.14f), 0);
    }

    @Test
    public void testValidateDouble() throws ValidationException, InvalidTypeException {
        double validatedValue = numberJsonSchema.validate(3.14d, configuration);
        Assert.assertEquals(Double.compare(validatedValue, 3.14d), 0);
    }

    @Test
    public void testExceptionThrownForInvalidType() {
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
                numberJsonSchema,
                null,
                validationMetadata
        ));
    }
}
