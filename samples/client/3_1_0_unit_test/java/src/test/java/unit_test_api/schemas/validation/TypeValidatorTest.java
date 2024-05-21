package unit_test_api.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.junit.Assert;
import org.junit.Test;
import unit_test_api.configurations.JsonSchemaKeywordFlags;
import unit_test_api.configurations.SchemaConfiguration;
import unit_test_api.exceptions.ValidationException;
import unit_test_api.schemas.StringJsonSchema;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class TypeValidatorTest {
    @SuppressWarnings("nullness")
    private void assertNull(@Nullable Object object) {
        Assert.assertNull(object);
    }

    @Test
    public void testValidateSucceeds() throws ValidationException {
        final TypeValidator validator = new TypeValidator();
        ValidationMetadata validationMetadata = new ValidationMetadata(
                new ArrayList<>(),
                new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()),
                new PathToSchemasMap(),
                new LinkedHashSet<>()
        );
        @Nullable PathToSchemasMap pathToSchemasMap = validator.validate(
                new ValidationData(
                    StringJsonSchema.StringJsonSchema1.getInstance(),
                    "hi",
                    validationMetadata
                )
        );
        assertNull(pathToSchemasMap);
    }

    @Test
    public void testValidateFailsIntIsNotString() {
        final TypeValidator validator = new TypeValidator();
        ValidationMetadata validationMetadata = new ValidationMetadata(
                new ArrayList<>(),
                new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()),
                new PathToSchemasMap(),
                new LinkedHashSet<>()
        );
        Assert.assertThrows(ValidationException.class, () -> validator.validate(
                new ValidationData(
                    StringJsonSchema.StringJsonSchema1.getInstance(),
                    1,
                    validationMetadata
                )
        ));
    }
}