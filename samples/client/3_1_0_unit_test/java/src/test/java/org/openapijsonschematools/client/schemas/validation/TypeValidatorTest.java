package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.StringJsonSchema;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class TypeValidatorTest {
    @SuppressWarnings("nullness")
    private void assertNull(@Nullable Object object) {
        Assert.assertNull(object);
    }

    @Test
    public void testValidateSucceeds() {
        final TypeValidator validator = new TypeValidator();
        ValidationMetadata validationMetadata = new ValidationMetadata(
                new ArrayList<>(),
                new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()),
                new PathToSchemasMap(),
                new LinkedHashSet<>()
        );
        @Nullable PathToSchemasMap pathToSchemasMap = validator.validate(
                new ValidationData(
                    StringJsonSchema.getInstance(),
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
                new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()),
                new PathToSchemasMap(),
                new LinkedHashSet<>()
        );
        Assert.assertThrows(ValidationException.class, () -> validator.validate(
                new ValidationData(
                    StringJsonSchema.getInstance(),
                    1,
                    validationMetadata
                )
        ));
    }
}