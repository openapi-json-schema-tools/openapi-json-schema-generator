package org.openapijsonschematools.schemas.validation;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class TypeValidatorTest {

    @Test
    public void testValidateSucceeds() {
        final TypeValidator validator = new TypeValidator();
        LinkedHashSet<Class<?>> value = new LinkedHashSet<>();
        value.add(String.class);
        ValidationMetadata validationMetadata = new ValidationMetadata(
                new ArrayList<>(),
                new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()),
                new PathToSchemasMap(),
                new LinkedHashSet<>()
        );
        PathToSchemasMap pathToSchemasMap = validator.validate(
                SchemaValidator.class,
                "hi",
                value,
                validationMetadata,
                null
        );
        Assert.assertNull(pathToSchemasMap);
    }

    @Test
    public void testValidateFailsIntIsNotString() throws RuntimeException {
        final TypeValidator validator = new TypeValidator();
        LinkedHashSet<Class<?>> value = new LinkedHashSet<>();
        value.add(String.class);
        ValidationMetadata validationMetadata = new ValidationMetadata(
                new ArrayList<>(),
                new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()),
                new PathToSchemasMap(),
                new LinkedHashSet<>()
        );
        Assert.assertThrows(RuntimeException.class, () -> validator.validate(
                SchemaValidator.class,
                1,
                value,
                validationMetadata,
                null
        ));
    }
}
