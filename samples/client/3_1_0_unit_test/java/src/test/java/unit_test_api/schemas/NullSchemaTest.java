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

public class NullSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());
    static final NullJsonSchema.NullJsonSchema1 nullJsonSchema = NullJsonSchema.NullJsonSchema1.getInstance();
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );


    @Test
    @SuppressWarnings("nullness")
    public void testValidateNull() throws ValidationException {
        Void validatedValue = nullJsonSchema.validate(null, configuration);
        Assert.assertNull(validatedValue);
    }

    @Test
    public void testExceptionThrownForInvalidType() {
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
                nullJsonSchema,
                Boolean.TRUE,
                validationMetadata
        ));
    }
}
