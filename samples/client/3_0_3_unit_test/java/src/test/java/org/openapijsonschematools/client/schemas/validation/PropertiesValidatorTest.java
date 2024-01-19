package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.schemas.MapJsonSchema;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class PropertiesValidatorTest {
    @SuppressWarnings("nullness")
    private void assertNull(@Nullable Object object) {
        Assert.assertNull(object);
    }

    @Test
    public void testCorrectPropertySucceeds() {
        Map<String, Class<? extends JsonSchema>> properties = new LinkedHashMap<>();
        properties.put("someString", StringJsonSchema.class);

        final PropertiesValidator validator = new PropertiesValidator(properties);
        List<Object> pathToItem = List.of("args[0]");
        ValidationMetadata validationMetadata = new ValidationMetadata(
                pathToItem,
                new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()),
                new PathToSchemasMap(),
                new LinkedHashSet<>()
        );
        LinkedHashMap<String, Object> mutableMap = new LinkedHashMap<>();
        mutableMap.put("someString", "abc");
        FrozenMap<Object> arg = new FrozenMap<>(mutableMap);
        PathToSchemasMap pathToSchemas = validator.validate(
                MapJsonSchema.getInstance(),
                arg,
                validationMetadata,
                new ArrayList<>(),
                new PathToSchemasMap(),
                new PathToSchemasMap()
        );
        if (pathToSchemas == null) {
            throw new RuntimeException("Invalid null value for pathToSchemas for this test case");
        }
        List<Object> expectedPathToItem = new ArrayList<>();
        expectedPathToItem.add("args[0]");
        expectedPathToItem.add("someString");
        LinkedHashMap<JsonSchema, Void> expectedClasses = new LinkedHashMap<>();
        expectedClasses.put(JsonSchemaFactory.getInstance(StringJsonSchema.class), null);
        PathToSchemasMap expectedPathToSchemas = new PathToSchemasMap();
        expectedPathToSchemas.put(expectedPathToItem, expectedClasses);
        Assert.assertEquals(pathToSchemas, expectedPathToSchemas);
    }

    @Test
    public void testNotApplicableTypeReturnsNull() {
        Map<String, Class<? extends JsonSchema>> properties = new LinkedHashMap<>();
        properties.put("someString", StringJsonSchema.class);

        final PropertiesValidator validator = new PropertiesValidator(properties);
        List<Object> pathToItem = List.of("args[0]");
        ValidationMetadata validationMetadata = new ValidationMetadata(
                pathToItem,
                new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()),
                new PathToSchemasMap(),
                new LinkedHashSet<>()
        );
        PathToSchemasMap pathToSchemas = validator.validate(
                MapJsonSchema.getInstance(),
                1,
                validationMetadata,
                new ArrayList<>(),
                new PathToSchemasMap(),
                new PathToSchemasMap()
        );
        assertNull(pathToSchemas);
    }

    @Test
    public void testIncorrectPropertyValueFails() {
        Map<String, Class<? extends JsonSchema>> properties = new LinkedHashMap<>();
        properties.put("someString", StringJsonSchema.class);

        final PropertiesValidator validator = new PropertiesValidator(properties);
        List<Object> pathToItem = List.of("args[0]");
        ValidationMetadata validationMetadata = new ValidationMetadata(
                pathToItem,
                new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()),
                new PathToSchemasMap(),
                new LinkedHashSet<>()
        );
        LinkedHashMap<String, Object> mutableMap = new LinkedHashMap<>();
        mutableMap.put("someString", 1);
        FrozenMap<Object> arg = new FrozenMap<>(mutableMap);
        Assert.assertThrows(ValidationException.class, () -> validator.validate(
                MapJsonSchema.getInstance(),
                arg,
                validationMetadata,
                new ArrayList<>(),
                new PathToSchemasMap(),
                new PathToSchemasMap()
        ));
    }
}