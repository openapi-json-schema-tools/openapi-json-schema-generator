package org.openapijsonschematools.schemas.validation;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.StringJsonSchema;
import org.openapijsonschematools.exceptions.ValidationException;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class AdditionalPropertiesValidatorTest {

    @Test
    public void testCorrectPropertySucceeds() {
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
        LinkedHashMap<String, Object> mutableMap = new LinkedHashMap<>();
        mutableMap.put("someString", "abc");
        mutableMap.put("someAddProp", "def");
        FrozenMap<String, Object> arg = new FrozenMap<>(mutableMap);
        final AdditionalPropertiesValidator validator = new AdditionalPropertiesValidator(StringJsonSchema.class);
        PathToSchemasMap pathToSchemas = validator.validate(
                JsonSchema.class,
                arg,
                validationMetadata,
                properties
        );
        List<Object> expectedPathToItem = new ArrayList<>();
        expectedPathToItem.add("args[0]");
        expectedPathToItem.add("someAddProp");
        LinkedHashMap<Class<? extends JsonSchema>, Void> expectedClasses = new LinkedHashMap<>();
        expectedClasses.put(StringJsonSchema.class, null);
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
        final AdditionalPropertiesValidator validator = new AdditionalPropertiesValidator(StringJsonSchema.class);
        PathToSchemasMap pathToSchemas = validator.validate(
                JsonSchema.class,
                1,
                validationMetadata,
                null
        );
        Assert.assertNull(pathToSchemas);
    }

    @Test
    public void testIncorrectPropertyValueFails() {
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
        LinkedHashMap<String, Object> mutableMap = new LinkedHashMap<>();
        mutableMap.put("someString", "abc");
        mutableMap.put("someAddProp", 1);
        FrozenMap<String, Object> arg = new FrozenMap<>(mutableMap);
        final AdditionalPropertiesValidator validator = new AdditionalPropertiesValidator(StringJsonSchema.class);
        Assert.assertThrows(ValidationException.class, () -> validator.validate(
                JsonSchema.class,
                arg,
                validationMetadata,
                properties
        ));
    }
}
