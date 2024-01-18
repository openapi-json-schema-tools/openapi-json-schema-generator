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
        LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
        type.add(String.class);
        final TypeValidator validator = new TypeValidator(type);
        ValidationMetadata validationMetadata = new ValidationMetadata(
                new ArrayList<>(),
                new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()),
                new PathToSchemasMap(),
                new LinkedHashSet<>()
        );
        @Nullable PathToSchemasMap pathToSchemasMap = validator.validate(
                StringJsonSchema.getInstance(),
                "hi",
                validationMetadata,
                new ArrayList<>(),
                new PathToSchemasMap()
        );
        assertNull(pathToSchemasMap);
    }

    @Test
    public void testValidateFailsIntIsNotString() {
        LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
        type.add(String.class);
        final TypeValidator validator = new TypeValidator(type);
        ValidationMetadata validationMetadata = new ValidationMetadata(
                new ArrayList<>(),
                new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()),
                new PathToSchemasMap(),
                new LinkedHashSet<>()
        );
        Assert.assertThrows(ValidationException.class, () -> validator.validate(
                StringJsonSchema.getInstance(),
                1,
                validationMetadata,
                new ArrayList<>(),
                new PathToSchemasMap()
        ));
    }
}