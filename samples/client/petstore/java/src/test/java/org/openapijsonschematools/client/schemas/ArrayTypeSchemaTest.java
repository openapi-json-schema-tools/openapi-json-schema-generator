package org.openapijsonschematools.client.schemas;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ListSchemaValidator;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class ArrayTypeSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    public sealed interface ArrayWithItemsSchemaBoxed permits ArrayWithItemsSchemaBoxedList {
    }
    public record ArrayWithItemsSchemaBoxedList(FrozenList<String> data) implements ArrayWithItemsSchemaBoxed {
    }

    public static class ArrayWithItemsSchema extends JsonSchema<ArrayWithItemsSchemaBoxed> implements ListSchemaValidator<FrozenList<String>, ArrayWithItemsSchemaBoxedList> {
        public ArrayWithItemsSchema() {
            super(new JsonSchemaInfo()
                .type(Set.of(List.class))
                .items(StringJsonSchema.StringJsonSchema1.class)
            );
        }

        @Override
        public FrozenList<String> getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<String> items = new ArrayList<>();
            int i = 0;
            for (Object item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                LinkedHashMap<JsonSchema<?>, Void> schemas = pathToSchemas.get(itemPathToItem);
                if (schemas == null) {
                    throw new InvalidTypeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema<?> itemSchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object castItem = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                if (!(castItem instanceof String)) {
                    throw new InvalidTypeException("Instantiated type of item is invalid");
                }
                items.add((String) castItem);
                i += 1;
            }
            return new FrozenList<>(items);
        }

        public FrozenList<String> validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }

        @Override
        public ArrayWithItemsSchemaBoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ArrayWithItemsSchemaBoxedList(validate(arg, configuration));
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

        @Override
        public ArrayWithItemsSchemaBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws InvalidTypeException, ValidationException {
            if (arg instanceof List<?> listArg) {
                return new ArrayWithItemsSchemaBoxedList(validate(listArg, configuration));
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

    public static class ArrayWithOutputClsSchemaList extends FrozenList<String> {
        protected ArrayWithOutputClsSchemaList(FrozenList<String> m) {
            super(m);
        }

        public static ArrayWithOutputClsSchemaList of(List<String> arg, SchemaConfiguration configuration) {
            return new ArrayWithOutputClsSchema().validate(arg, configuration);
        }
    }

    public sealed interface ArrayWithOutputClsSchemaBoxed permits ArrayWithOutputClsSchemaBoxedList {
    }
    public record ArrayWithOutputClsSchemaBoxedList(ArrayWithOutputClsSchemaList data) implements ArrayWithOutputClsSchemaBoxed {
    }
    public static class ArrayWithOutputClsSchema extends JsonSchema<ArrayWithOutputClsSchemaBoxed> implements ListSchemaValidator<ArrayWithOutputClsSchemaList, ArrayWithOutputClsSchemaBoxedList> {
        public ArrayWithOutputClsSchema() {
            super(new JsonSchemaInfo()
                .type(Set.of(List.class))
                .items(StringJsonSchema.StringJsonSchema1.class)
            );

        }

        @Override
        public ArrayWithOutputClsSchemaList getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<String> items = new ArrayList<>();
            int i = 0;
            for (Object item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                LinkedHashMap<JsonSchema<?>, Void> schemas = pathToSchemas.get(itemPathToItem);
                if (schemas == null) {
                    throw new InvalidTypeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema<?> itemSchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object castItem = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                if (!(castItem instanceof String)) {
                    throw new InvalidTypeException("Instantiated type of item is invalid");
                }
                items.add((String) castItem);
                i += 1;
            }
            FrozenList<String> newInstanceItems = new FrozenList<>(items);
            return new ArrayWithOutputClsSchemaList(newInstanceItems);
        }

        public ArrayWithOutputClsSchemaList validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }

        @Override
        public ArrayWithOutputClsSchemaBoxedList validateAndBox(List<?> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            return new ArrayWithOutputClsSchemaBoxedList(validate(arg, configuration));
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

        @Override
        public ArrayWithOutputClsSchemaBoxed validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) throws InvalidTypeException, ValidationException {
            if (arg instanceof List<?> listArg) {
                return new ArrayWithOutputClsSchemaBoxedList(validate(listArg, configuration));
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be validated by this schema");
        }
    }

    @Test
    public void testExceptionThrownForInvalidType() {
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
                new ArrayWithItemsSchema(),
                null,
                validationMetadata
        ));
    }

    @Test
    public void testValidateArrayWithItemsSchema() {
        // list with only item works
        List<String> inList = new ArrayList<>();
        inList.add("abc");
        FrozenList<String> validatedValue = new ArrayWithItemsSchema().validate(inList, configuration);
        List<Object> outList = new ArrayList<>();
        outList.add("abc");
        Assert.assertEquals(validatedValue, outList);

        // list with no items works
        inList = new ArrayList<>();
        validatedValue = new ArrayWithItemsSchema().validate(inList, configuration);
        outList = new ArrayList<>();
        Assert.assertEquals(validatedValue, outList);

        // invalid item type fails
        List<Integer> intList = List.of(1);
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
                new ArrayWithItemsSchema(),
                intList,
                validationMetadata
        ));
    }

    @Test
    public void testValidateArrayWithOutputClsSchema() {
        // list with only item works
        List<String> inList = new ArrayList<>();
        inList.add("abc");
        ArrayWithOutputClsSchemaList validatedValue = new ArrayWithOutputClsSchema().validate(inList, configuration);
        List<Object> outList = new ArrayList<>();
        outList.add("abc");
        Assert.assertEquals(validatedValue, outList);

        // list with no items works
        inList = new ArrayList<>();
        validatedValue = new ArrayWithOutputClsSchema().validate(inList, configuration);
        outList = new ArrayList<>();
        Assert.assertEquals(validatedValue, outList);

        // invalid item type fails
        List<Integer> intList = List.of(1);
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
                new ArrayWithOutputClsSchema(),
                intList,
                validationMetadata
        ));
    }
}