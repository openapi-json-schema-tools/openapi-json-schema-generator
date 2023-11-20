package org.openapijsonschematools.schemas.validation;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.StringJsonSchema;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
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
        FrozenMap<String, Object> arg = new FrozenMap<>(mutableMap);
        final RequiredValidator validator = new RequiredValidator();
        PathToSchemasMap pathToSchemas = validator.validate(
                JsonSchema.class,
                arg,
                requiredProperties,
                validationMetadata,
                null
        );
        Assert.assertNull(pathToSchemas);
    }

    @Test
    public void testNotApplicableTypeReturnsNull() {
        Map<String, Class<?>> properties = new LinkedHashMap<>();
        properties.put("someString", StringJsonSchema.class);

        List<Object> pathToItem = new ArrayList<>();
        pathToItem.add("args[0]");
        ValidationMetadata validationMetadata = new ValidationMetadata(
                pathToItem,
                new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()),
                new PathToSchemasMap(),
                new LinkedHashSet<>()
        );
        final RequiredValidator validator = new RequiredValidator();
        PathToSchemasMap pathToSchemas = validator.validate(
                JsonSchema.class,
                1,
                properties,
                validationMetadata,
                null
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
        FrozenMap<String, Object> arg = new FrozenMap<>(mutableMap);
        final RequiredValidator validator = new RequiredValidator();
        Assert.assertThrows(RuntimeException.class, () -> validator.validate(
                JsonSchema.class,
                arg,
                requiredProperties,
                validationMetadata,
                null
        ));
    }
}
