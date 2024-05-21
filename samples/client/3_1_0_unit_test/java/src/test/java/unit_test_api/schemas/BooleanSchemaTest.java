package unit_test_api.schemas;

import org.junit.Assert;
import org.junit.Test;
import unit_test_api.configurations.JsonSchemaKeywordFlags;
import unit_test_api.configurations.SchemaConfiguration;
import unit_test_api.exceptions.ValidationException;
import unit_test_api.schemas.validation.JsonSchema;
import unit_test_api.schemas.validation.PathToSchemasMap;
import unit_test_api.schemas.validation.ValidationMetadata;

import java.util.LinkedHashSet;
import java.util.List;

public class BooleanSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());
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
