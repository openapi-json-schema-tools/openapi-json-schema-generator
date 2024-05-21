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

public class RefBooleanSchemaTest {
    public static class RefBooleanSchema {
        public static class RefBooleanSchema1 extends BooleanJsonSchema.BooleanJsonSchema1 {}
    }

    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());
    static final BooleanJsonSchema.BooleanJsonSchema1 refBooleanJsonSchema = RefBooleanSchema.RefBooleanSchema1.getInstance();
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );
    
    @Test
    public void testValidateTrue() throws ValidationException {
        Boolean validatedValue = refBooleanJsonSchema.validate(true, configuration);
        Assert.assertEquals(validatedValue, Boolean.TRUE);
    }

    @Test
    public void testValidateFalse() throws ValidationException {
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