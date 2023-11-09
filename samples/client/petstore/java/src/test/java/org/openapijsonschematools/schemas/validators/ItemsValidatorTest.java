package org.openapijsonschematools.schemas.validators;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.FrozenList;
import org.openapijsonschematools.schemas.PathToSchemasMap;
import org.openapijsonschematools.schemas.SchemaValidator;
import org.openapijsonschematools.schemas.StringSchema;
import org.openapijsonschematools.schemas.ValidationMetadata;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

public class ItemsValidatorTest {

    @Test
    public void testCorrectItemsSucceeds() {
        List<Object> pathToItem = new ArrayList<>();
        pathToItem.add("args[0]");
        ValidationMetadata validationMetadata = new ValidationMetadata(
                pathToItem,
                new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()),
                new PathToSchemasMap(),
                new LinkedHashSet<>()
        );
        List<Object> mutableList = new ArrayList<>();
        mutableList.add("a");
        FrozenList<Object> arg = new FrozenList<>(mutableList);
        final ItemsValidator validator = new ItemsValidator();
        PathToSchemasMap pathToSchemas = validator.validate(
                SchemaValidator.class,
                arg,
                StringSchema.class,
                validationMetadata,
                null
        );
        List<Object> expectedPathToItem = new ArrayList<>();
        expectedPathToItem.add("args[0]");
        expectedPathToItem.add(0);
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
        final ItemsValidator validator = new ItemsValidator();
        PathToSchemasMap pathToSchemas = validator.validate(
                SchemaValidator.class,
                1,
                StringSchema.class,
                validationMetadata,
                null
        );
        Assert.assertNull(pathToSchemas);
    }

    @Test
    public void testIncorrectItemFails() {
        List<Object> pathToItem = new ArrayList<>();
        pathToItem.add("args[0]");
        ValidationMetadata validationMetadata = new ValidationMetadata(
                pathToItem,
                new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()),
                new PathToSchemasMap(),
                new LinkedHashSet<>()
        );
        List<Object> mutableList = new ArrayList<>();
        mutableList.add(1);
        FrozenList<Object> arg = new FrozenList<>(mutableList);
        final ItemsValidator validator = new ItemsValidator();
        Assert.assertThrows(RuntimeException.class, () -> validator.validate(
                SchemaValidator.class,
                arg,
                StringSchema.class,
                validationMetadata,
                null
        ));
    }
}
