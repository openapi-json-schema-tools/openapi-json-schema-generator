package org.openapijsonschematools.schemas.validators;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.PathToSchemasMap;
import org.openapijsonschematools.schemas.SchemaValidator;
import org.openapijsonschematools.schemas.ValidationMetadata;

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
                "hi",
                value,
                null,
                SchemaValidator.class,
                validationMetadata
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
                1,
                value,
                null,
                SchemaValidator.class,
                validationMetadata
        ));
    }
}
