package org.openapijsonschematools.client.schemas.validation;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class TypeValidatorTest {

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
        PathToSchemasMap pathToSchemasMap = validator.validate(
                JsonSchema.class,
                "hi",
                validationMetadata,
                null
        );
        Assert.assertNull(pathToSchemasMap);
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
                JsonSchema.class,
                1,
                validationMetadata,
                null
        ));
    }
}