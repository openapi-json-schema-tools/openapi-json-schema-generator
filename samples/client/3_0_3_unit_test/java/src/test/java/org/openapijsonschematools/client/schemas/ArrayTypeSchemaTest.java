package org.openapijsonschematools.client.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.SchemaListValidator;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

import java.util.ArrayList;
import java.util.HashSet;
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

    public static class ArrayWithItemsSchema extends JsonSchema implements SchemaListValidator<String, String, FrozenList<String>> {
        public ArrayWithItemsSchema() {
            super(new JsonSchemaInfo()
                .type(Set.of(FrozenList.class))
                .items(StringJsonSchema.class)
            );
        }

        @Override
        public FrozenList<String> castToAllowedTypes(List<String> arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            pathSet.add(pathToItem);
            List<String> argFixed = new ArrayList<>();
            int i =0;
            for (String item: arg) {
                List<Object> newPathToItem = new ArrayList<>(pathToItem);
                newPathToItem.add(i);
                String fixedVal = StringJsonSchema.getInstance().castToAllowedTypes(item, newPathToItem, pathSet);
                argFixed.add(fixedVal);
                i += 1;
            }
            return new FrozenList<>(argFixed);
        }

        @Override
        public FrozenList<String> getNewInstance(FrozenList<String> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            return arg;
        }

        @Override
        public FrozenList<String> validate(List<String> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            FrozenList<String> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }

        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof FrozenList) {
                @SuppressWarnings("unchecked") FrozenList<String> castArg = (FrozenList<String>) arg;
                return getNewInstance(castArg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }

    public static class ArrayWithOutputClsSchemaList extends FrozenList<String> {
        ArrayWithOutputClsSchemaList(FrozenList<String> m) {
            super(m);
        }

        public static ArrayWithOutputClsSchemaList of(List<String> arg, SchemaConfiguration configuration) {
            return new ArrayWithOutputClsSchema().validate(arg, configuration);
        }
    }

    public static class ArrayWithOutputClsSchema extends JsonSchema implements SchemaListValidator<String, String, ArrayWithOutputClsSchemaList> {
        public ArrayWithOutputClsSchema() {
            super(new JsonSchemaInfo()
                .type(Set.of(FrozenList.class))
                .items(StringJsonSchema.class)
            );

        }

        @Override
        public FrozenList<String> castToAllowedTypes(List<String> arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            pathSet.add(pathToItem);
            List<String> argFixed = new ArrayList<>();
            int i =0;
            for (String item: arg) {
                List<Object> newPathToItem = new ArrayList<>(pathToItem);
                newPathToItem.add(i);
                String fixedVal = StringJsonSchema.getInstance().castToAllowedTypes(item, newPathToItem, pathSet);
                argFixed.add(fixedVal);
                i += 1;
            }
            return new FrozenList<>(argFixed);
        }

        @Override
        public ArrayWithOutputClsSchemaList getNewInstance(FrozenList<String> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            ArrayList<String> items = new ArrayList<>();
            int i = 0;
            for (String item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                JsonSchema itemSchema = pathToSchemas.get(itemPathToItem).entrySet().iterator().next().getKey();
                String castItem = (String) itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                items.add(castItem);
                i += 1;
            }
            FrozenList<String> newInstanceItems = new FrozenList<>(items);
            return new ArrayWithOutputClsSchemaList(newInstanceItems);
        }

        @Override
        public ArrayWithOutputClsSchemaList validate(List<String> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            FrozenList<String> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }

        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof FrozenList) {
                @SuppressWarnings("unchecked") FrozenList<String> castArg = (FrozenList<String>) arg;
                return getNewInstance(castArg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
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
