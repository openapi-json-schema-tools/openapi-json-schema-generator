package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ItemsValidatorTest {
    @SuppressWarnings("nullness")
    private void assertNull(@Nullable Object object) {
        Assert.assertNull(object);
    }

    public static class ArrayWithItemsSchema extends JsonSchema {
        public ArrayWithItemsSchema() {
            super(new JsonSchemaInfo()
                    .type(Set.of(List.class))
                    .items(StringJsonSchema.class)
            );
        }

        @Override
        public Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof List) {
                return getNewInstance((List<?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }

        @Override
        public @Nullable Object validate(@Nullable Object arg, SchemaConfiguration configuration) throws InvalidTypeException, ValidationException {
            if (arg instanceof List) {
                return validate((List<?>) arg, configuration);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
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
        final ItemsValidator validator = new ItemsValidator();
        PathToSchemasMap pathToSchemas = validator.validate(
                new ValidationData(
                    new ArrayWithItemsSchema(),
                    arg,
                    validationMetadata
                )
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
        final ItemsValidator validator = new ItemsValidator();
        PathToSchemasMap pathToSchemas = validator.validate(
                new ValidationData(
                    new ArrayWithItemsSchema(),
                    1,
                    validationMetadata
                )
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
        final ItemsValidator validator = new ItemsValidator();
        Assert.assertThrows(ValidationException.class, () -> validator.validate(
                new ValidationData(
                    new ArrayWithItemsSchema(),
                    arg,
                    validationMetadata
                )
        ));
    }
}
