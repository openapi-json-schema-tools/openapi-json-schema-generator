package org.openapijsonschematools.schemas.validators;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.FrozenMap;
import org.openapijsonschematools.schemas.PathToSchemasMap;
import org.openapijsonschematools.schemas.SchemaValidator;
import org.openapijsonschematools.schemas.StringSchema;
import org.openapijsonschematools.schemas.ValidationMetadata;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class AdditionalPropertiesValidatorTest {

    @Test
    public void testCorrectPropertySucceeds() {
        Map<String, Class<?>> properties = new LinkedHashMap<>();
        properties.put("someString", StringSchema.class);

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
        mutableMap.put("someAddProp", "def");
        FrozenMap<String, Object> arg = new FrozenMap<>(mutableMap);
        final AdditionalPropertiesValidator validator = new AdditionalPropertiesValidator();
        PathToSchemasMap pathToSchemas = validator.validate(
                arg,
                StringSchema.class,
                SchemaValidator.class,
                validationMetadata,
                properties
        );
        List<Object> expectedPathToItem = new ArrayList<>();
        expectedPathToItem.add("args[0]");
        expectedPathToItem.add("someAddProp");
        LinkedHashMap<Class<?>, Void> expectedClasses = new LinkedHashMap<>();
        expectedClasses.put(String.class, null);
        expectedClasses.put(StringSchema.class, null);
        PathToSchemasMap expectedPathToSchemas = new PathToSchemasMap();
        expectedPathToSchemas.put(expectedPathToItem, expectedClasses);
        Assert.assertEquals(pathToSchemas, expectedPathToSchemas);
    }

    @Test
    public void testNotApplicableTypeReturnsNull() {
        List<Object> pathToItem = new ArrayList<>();
        pathToItem.add("args[0]");
        ValidationMetadata validationMetadata = new ValidationMetadata(
                pathToItem,
                new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()),
                new PathToSchemasMap(),
                new LinkedHashSet<>()
        );
        final AdditionalPropertiesValidator validator = new AdditionalPropertiesValidator();
        PathToSchemasMap pathToSchemas = validator.validate(
                1,
                StringSchema.class,
                SchemaValidator.class,
                validationMetadata,
                null
        );
        Assert.assertNull(pathToSchemas);
    }

    @Test
    public void testIncorrectPropertyValueFails() {
        Map<String, Class<?>> properties = new LinkedHashMap<>();
        properties.put("someString", StringSchema.class);

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
        mutableMap.put("someAddProp", 1);
        FrozenMap<String, Object> arg = new FrozenMap<>(mutableMap);
        final AdditionalPropertiesValidator validator = new AdditionalPropertiesValidator();
        Assert.assertThrows(RuntimeException.class, () -> validator.validate(
                arg,
                StringSchema.class,
                SchemaValidator.class,
                validationMetadata,
                properties
        ));
    }
}
