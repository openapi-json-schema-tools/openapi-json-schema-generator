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
    public void testValidateFailsIntIsNotString() throws RuntimeException {
        LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
        type.add(String.class);
        final TypeValidator validator = new TypeValidator(type);
        ValidationMetadata validationMetadata = new ValidationMetadata(
                new ArrayList<>(),
                new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()),
                new PathToSchemasMap(),
                new LinkedHashSet<>()
        );
        Assert.assertThrows(RuntimeException.class, () -> validator.validate(
                JsonSchema.class,
                1,
                validationMetadata,
                null
        ));
    }
}
