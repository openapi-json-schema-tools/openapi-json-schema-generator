package org.openapijsonschematools.client.schemas.validation;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapJsonSchema;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RequiredValidatorTest {

    @Test
    public void testCorrectPropertySucceeds() {
        Set<String> requiredProperties = new LinkedHashSet<>();
        requiredProperties.add("someString");

        List<Object> pathToItem = new ArrayList<>();
        pathToItem.add("args[0]");
        ValidationMetadata validationMetadata = new ValidationMetadata(
                pathToItem,
                new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()),
                new PathToSchemasMap(),
                new LinkedHashSet<>()
        );
        LinkedHashMap<String, Object> mutableMap = new LinkedHashMap<>();
        mutableMap.put("someString", "abc");
        FrozenMap<Object> arg = new FrozenMap<>(mutableMap);
        final RequiredValidator validator = new RequiredValidator(requiredProperties);
        PathToSchemasMap pathToSchemas = validator.validate(
                MapJsonSchema.getInstance(),
                arg,
                validationMetadata
        );
        Assert.assertNull(pathToSchemas);
    }

    @Test
    public void testNotApplicableTypeReturnsNull() {
        Set<String> requiredProperties = new LinkedHashSet<>();
        requiredProperties.add("someString");

        List<Object> pathToItem = new ArrayList<>();
        pathToItem.add("args[0]");
        ValidationMetadata validationMetadata = new ValidationMetadata(
                pathToItem,
                new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()),
                new PathToSchemasMap(),
                new LinkedHashSet<>()
        );
        final RequiredValidator validator = new RequiredValidator(requiredProperties);
        PathToSchemasMap pathToSchemas = validator.validate(
                MapJsonSchema.getInstance(),
                1,
                validationMetadata
        );
        Assert.assertNull(pathToSchemas);
    }

    @Test
    public void testIncorrectPropertyFails() {
        Set<String> requiredProperties = new LinkedHashSet<>();
        requiredProperties.add("someString");

        List<Object> pathToItem = new ArrayList<>();
        pathToItem.add("args[0]");
        ValidationMetadata validationMetadata = new ValidationMetadata(
                pathToItem,
                new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()),
                new PathToSchemasMap(),
                new LinkedHashSet<>()
        );
        LinkedHashMap<String, Object> mutableMap = new LinkedHashMap<>();
        mutableMap.put("aDifferentProp", 1);
        FrozenMap<Object> arg = new FrozenMap<>(mutableMap);
        final RequiredValidator validator = new RequiredValidator(requiredProperties);
        Assert.assertThrows(ValidationException.class, () -> validator.validate(
                MapJsonSchema.getInstance(),
                arg,
                validationMetadata
        ));
    }
}