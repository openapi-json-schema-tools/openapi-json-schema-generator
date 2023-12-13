package org.openapijsonschematools.client.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.schemas.validation.ItemsValidator;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.SchemaListValidator;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
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
            super(new LinkedHashMap<>(Map.ofEntries(
                    new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                    new KeywordEntry("items", new ItemsValidator(StringJsonSchema.class))
            )));
        }

        @Override
        public FrozenList<String> castToAllowedTypes(List<String> arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            pathSet.add(pathToItem);
            List<String> argFixed = new ArrayList<>();
            int i =0;
            for (String item: arg) {
                List<Object> newPathToItem = new ArrayList<>(pathToItem);
                newPathToItem.add(i);
                String fixedVal = JsonSchemaFactory.getInstance(StringJsonSchema.class).castToAllowedTypes(item, newPathToItem, pathSet);
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
    }

    public static class ArrayWithOutputClsSchemaList extends FrozenList<String> {
        ArrayWithOutputClsSchemaList(FrozenList<String> m) {
            super(m);
        }

        public static ArrayWithOutputClsSchemaList of(List<String> arg, SchemaConfiguration configuration) {
            return JsonSchemaFactory.getInstance(ArrayWithOutputClsSchema.class).validate(arg, configuration);
        }
    }

    public static class ArrayWithOutputClsSchema extends JsonSchema implements SchemaListValidator<String, String, ArrayWithOutputClsSchemaList> {
        public ArrayWithOutputClsSchema() {
            super(new LinkedHashMap<>(Map.ofEntries(
                    new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                    new KeywordEntry("items", new ItemsValidator(StringJsonSchema.class))
            )));

        }

        @Override
        public FrozenList<String> castToAllowedTypes(List<String> arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            pathSet.add(pathToItem);
            List<String> argFixed = new ArrayList<>();
            int i =0;
            for (String item: arg) {
                List<Object> newPathToItem = new ArrayList<>(pathToItem);
                newPathToItem.add(i);
                String fixedVal = JsonSchemaFactory.getInstance(StringJsonSchema.class).castToAllowedTypes(item, newPathToItem, pathSet);
                argFixed.add(fixedVal);
                i += 1;
            }
            return new FrozenList<>(argFixed);
        }

        @Override
        public ArrayWithOutputClsSchemaList getNewInstance(FrozenList<String> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            return new ArrayWithOutputClsSchemaList(arg);
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
    }

    @Test
    public void testExceptionThrownForInvalidType() {
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
                JsonSchemaFactory.getInstance(ArrayWithItemsSchema.class),
                (Void) null,
                validationMetadata
        ));
    }

    @Test
    public void testValidateArrayWithItemsSchema() {
        // list with only item works
        List<String> inList = new ArrayList<>();
        inList.add("abc");
        FrozenList<String> validatedValue = JsonSchemaFactory.getInstance(ArrayWithItemsSchema.class).validate(inList, configuration);
        List<Object> outList = new ArrayList<>();
        outList.add("abc");
        Assert.assertEquals(validatedValue, outList);

        // list with no items works
        inList = new ArrayList<>();
        validatedValue = JsonSchemaFactory.getInstance(ArrayWithItemsSchema.class).validate(inList, configuration);
        outList = new ArrayList<>();
        Assert.assertEquals(validatedValue, outList);

        // invalid item type fails
        List<Integer> intList = List.of(1);
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
                JsonSchemaFactory.getInstance(ArrayWithItemsSchema.class),
                intList,
                validationMetadata
        ));
    }

    @Test
    public void testValidateArrayWithOutputClsSchema() {
        // list with only item works
        List<String> inList = new ArrayList<>();
        inList.add("abc");
        ArrayWithOutputClsSchemaList validatedValue = JsonSchemaFactory.getInstance(ArrayWithOutputClsSchema.class).validate(inList, configuration);
        List<Object> outList = new ArrayList<>();
        outList.add("abc");
        Assert.assertEquals(validatedValue, outList);

        // list with no items works
        inList = new ArrayList<>();
        validatedValue = JsonSchemaFactory.getInstance(ArrayWithOutputClsSchema.class).validate(inList, configuration);
        outList = new ArrayList<>();
        Assert.assertEquals(validatedValue, outList);

        // invalid item type fails
        List<Integer> intList = List.of(1);
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
                JsonSchemaFactory.getInstance(ArrayWithOutputClsSchema.class),
                intList,
                validationMetadata
        ));
    }
}
