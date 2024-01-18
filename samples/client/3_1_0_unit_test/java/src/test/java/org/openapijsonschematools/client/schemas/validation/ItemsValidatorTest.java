package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.schemas.ListJsonSchema;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

public class ItemsValidatorTest {
    @SuppressWarnings("nullness")
    private void assertNull(@Nullable Object object) {
        Assert.assertNull(object);
    }

    @Test
    public void testCorrectItemsSucceeds() {
        List<Object> pathToItem = List.of("args[0]");
        ValidationMetadata validationMetadata = new ValidationMetadata(
                pathToItem,
                new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()),
                new PathToSchemasMap(),
                new LinkedHashSet<>()
        );
        List<Object> mutableList = new ArrayList<>();
        mutableList.add("a");
        FrozenList<Object> arg = new FrozenList<>(mutableList);
        final ItemsValidator validator = new ItemsValidator(StringJsonSchema.class);
        PathToSchemasMap pathToSchemas = validator.validate(
                ListJsonSchema.getInstance(),
                arg,
                validationMetadata,
                new ArrayList<>(),
                new PathToSchemasMap()
        );
        if (pathToSchemas == null) {
            throw new RuntimeException("Invalid null value in pathToSchemas for this test case");
        }
        List<Object> expectedPathToItem = new ArrayList<>();
        expectedPathToItem.add("args[0]");
        expectedPathToItem.add(0);
        LinkedHashMap<JsonSchema, Void> expectedClasses = new LinkedHashMap<>();
        StringJsonSchema schema = JsonSchemaFactory.getInstance(StringJsonSchema.class);
        expectedClasses.put(schema, null);
        PathToSchemasMap expectedPathToSchemas = new PathToSchemasMap();
        expectedPathToSchemas.put(expectedPathToItem, expectedClasses);
        Assert.assertEquals(pathToSchemas, expectedPathToSchemas);
    }

    @Test
    public void testNotApplicableTypeReturnsNull() {
        List<Object> pathToItem = List.of("args[0]");
        ValidationMetadata validationMetadata = new ValidationMetadata(
                pathToItem,
                new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()),
                new PathToSchemasMap(),
                new LinkedHashSet<>()
        );
        final ItemsValidator validator = new ItemsValidator(StringJsonSchema.class);
        PathToSchemasMap pathToSchemas = validator.validate(
                ListJsonSchema.getInstance(),
                1,
                validationMetadata,
                new ArrayList<>(),
                new PathToSchemasMap()
        );
        assertNull(pathToSchemas);
    }

    @Test
    public void testIncorrectItemFails() {
        List<Object> pathToItem = List.of("args[0]");
        ValidationMetadata validationMetadata = new ValidationMetadata(
                pathToItem,
                new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()),
                new PathToSchemasMap(),
                new LinkedHashSet<>()
        );
        List<Object> mutableList = new ArrayList<>();
        mutableList.add(1);
        FrozenList<Object> arg = new FrozenList<>(mutableList);
        final ItemsValidator validator = new ItemsValidator(StringJsonSchema.class);
        Assert.assertThrows(ValidationException.class, () -> validator.validate(
                ListJsonSchema.getInstance(),
                arg,
                validationMetadata,
                new ArrayList<>(),
                new PathToSchemasMap()
        ));
    }
}

