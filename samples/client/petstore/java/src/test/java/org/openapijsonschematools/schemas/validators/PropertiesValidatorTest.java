package org.openapijsonschematools.schemas.validators;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.FrozenMap;
import org.openapijsonschematools.schemas.PathToSchemasMap;
import org.openapijsonschematools.schemas.SchemaValidator;
import org.openapijsonschematools.schemas.JsonSchemas;
import org.openapijsonschematools.schemas.ValidationMetadata;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class PropertiesValidatorTest {

    @Test
    public void testCorrectPropertySucceeds() {
        Map<String, Class<?>> properties = new LinkedHashMap<>();
        properties.put("someString", JsonSchemas.StringSchema.class);

        final PropertiesValidator validator = new PropertiesValidator();
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
        PathToSchemasMap pathToSchemas = validator.validate(
                SchemaValidator.class,
                arg,
                properties,
                validationMetadata,
                null
        );
        List<Object> expectedPathToItem = new ArrayList<>();
        expectedPathToItem.add("args[0]");
        expectedPathToItem.add("someString");
        LinkedHashMap<Class<?>, Void> expectedClasses = new LinkedHashMap<>();
        expectedClasses.put(String.class, null);
        expectedClasses.put(JsonSchemas.StringSchema.class, null);
        PathToSchemasMap expectedPathToSchemas = new PathToSchemasMap();
        expectedPathToSchemas.put(expectedPathToItem, expectedClasses);
        Assert.assertEquals(pathToSchemas, expectedPathToSchemas);
    }

    @Test
    public void testNotApplicableTypeReturnsNull() {
        Map<String, Class<?>> properties = new LinkedHashMap<>();
        properties.put("someString", JsonSchemas.StringSchema.class);

        final PropertiesValidator validator = new PropertiesValidator();
        List<Object> pathToItem = new ArrayList<>();
        pathToItem.add("args[0]");
        ValidationMetadata validationMetadata = new ValidationMetadata(
                pathToItem,
                new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()),
                new PathToSchemasMap(),
                new LinkedHashSet<>()
        );
        PathToSchemasMap pathToSchemas = validator.validate(
                SchemaValidator.class,
                1,
                properties,
                validationMetadata,
                null
        );
        Assert.assertNull(pathToSchemas);
    }

    @Test
    public void testIncorrectPropertyValueFails() {
        Map<String, Class<?>> properties = new LinkedHashMap<>();
        properties.put("someString", JsonSchemas.StringSchema.class);

        final PropertiesValidator validator = new PropertiesValidator();
        List<Object> pathToItem = new ArrayList<>();
        pathToItem.add("args[0]");
        ValidationMetadata validationMetadata = new ValidationMetadata(
                pathToItem,
                new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()),
                new PathToSchemasMap(),
                new LinkedHashSet<>()
        );
        LinkedHashMap<String, Object> mutableMap = new LinkedHashMap<>();
        mutableMap.put("someString", 1);
        FrozenMap<String, Object> arg = new FrozenMap<>(mutableMap);
        Assert.assertThrows(RuntimeException.class, () -> validator.validate(
                SchemaValidator.class,
                arg,
                properties,
                validationMetadata,
                null
        ));
    }
}
