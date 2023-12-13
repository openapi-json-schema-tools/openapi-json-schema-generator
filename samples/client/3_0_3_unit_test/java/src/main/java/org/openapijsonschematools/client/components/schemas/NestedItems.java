package org.openapijsonschematools.client.components.schemas;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.NumberJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.ItemsValidator;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.SchemaListValidator;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class NestedItems {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Items3 extends NumberJsonSchema {}
    
    
    public static class ItemsList extends FrozenList<Number> {
        ItemsList(FrozenList<Number> m) {
            super(m);
        }
        public static ItemsList of(List<Number> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(Items2.class).validate(arg, configuration);
        }
    }
    
    public class ItemsListInput {
        // class to build List<Number>
    }
    
    
    public static class Items2 extends JsonSchema implements SchemaListValidator<Number, Number, ItemsList> {
        public Items2() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(Items3.class))
            )));
        }
    
        @Override
        public FrozenList<Number> castToAllowedTypes(List<Number> arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            pathSet.add(pathToItem);
            List<Number> argFixed = new ArrayList<>();
            int i =0;
            for (Number item: arg) {
                List<Object> newPathToItem = new ArrayList<>(pathToItem);
                newPathToItem.add(i);
                                Number fixedVal = JsonSchemaFactory.getInstance(Items3.class).castToAllowedTypes(item, newPathToItem, pathSet);
                argFixed.add(fixedVal);
                i += 1;
            }
            return new FrozenList<>(argFixed);
        }
    
        @Override
        public ItemsList getNewInstance(FrozenList<Number> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            ArrayList<Number> items = new ArrayList<>();
            int i = 0;
            for (Number item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                JsonSchema itemSchema = pathToSchemas.get(itemPathToItem).entrySet().iterator().next().getKey();
                assert itemSchema instanceof Items3;
                Number castItem = JsonSchemaFactory.getInstance(Items3.class).getNewInstance(item, itemPathToItem, pathToSchemas);
                items.add(castItem);
                i += 1;
            }
            FrozenList<Number> newInstanceItems = new FrozenList<>(items);
            return new ItemsList(newInstanceItems);
        }
    
        @Override
        public ItemsList validate(List<Number> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            FrozenList<Number> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
    }    
    
    public static class ItemsList1 extends FrozenList<ItemsList> {
        ItemsList1(FrozenList<ItemsList> m) {
            super(m);
        }
        public static ItemsList1 of(List<List<Number>> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(Items1.class).validate(arg, configuration);
        }
    }
    
    public class ItemsListInput1 {
        // class to build List<List<Number>>
    }
    
    
    public static class Items1 extends JsonSchema implements SchemaListValidator<List<Number>, FrozenList<Number>, ItemsList1> {
        public Items1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(Items2.class))
            )));
        }
    
        @Override
        public FrozenList<FrozenList<Number>> castToAllowedTypes(List<List<Number>> arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            pathSet.add(pathToItem);
            List<FrozenList<Number>> argFixed = new ArrayList<>();
            int i =0;
            for (List<Number> item: arg) {
                List<Object> newPathToItem = new ArrayList<>(pathToItem);
                newPathToItem.add(i);
                                FrozenList<Number> fixedVal = JsonSchemaFactory.getInstance(Items2.class).castToAllowedTypes(item, newPathToItem, pathSet);
                argFixed.add(fixedVal);
                i += 1;
            }
            return new FrozenList<>(argFixed);
        }
    
        @Override
        public ItemsList1 getNewInstance(FrozenList<FrozenList<Number>> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            ArrayList<ItemsList> items = new ArrayList<>();
            int i = 0;
            for (FrozenList<Number> item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                JsonSchema itemSchema = pathToSchemas.get(itemPathToItem).entrySet().iterator().next().getKey();
                assert itemSchema instanceof Items2;
                ItemsList castItem = JsonSchemaFactory.getInstance(Items2.class).getNewInstance(item, itemPathToItem, pathToSchemas);
                items.add(castItem);
                i += 1;
            }
            FrozenList<ItemsList> newInstanceItems = new FrozenList<>(items);
            return new ItemsList1(newInstanceItems);
        }
    
        @Override
        public ItemsList1 validate(List<List<Number>> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            FrozenList<FrozenList<Number>> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
    }    
    
    public static class ItemsList2 extends FrozenList<ItemsList1> {
        ItemsList2(FrozenList<ItemsList1> m) {
            super(m);
        }
        public static ItemsList2 of(List<List<List<Number>>> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(Items.class).validate(arg, configuration);
        }
    }
    
    public class ItemsListInput2 {
        // class to build List<List<List<Number>>>
    }
    
    
    public static class Items extends JsonSchema implements SchemaListValidator<List<List<Number>>, FrozenList<FrozenList<Number>>, ItemsList2> {
        public Items() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(Items1.class))
            )));
        }
    
        @Override
        public FrozenList<FrozenList<FrozenList<Number>>> castToAllowedTypes(List<List<List<Number>>> arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            pathSet.add(pathToItem);
            List<FrozenList<FrozenList<Number>>> argFixed = new ArrayList<>();
            int i =0;
            for (List<List<Number>> item: arg) {
                List<Object> newPathToItem = new ArrayList<>(pathToItem);
                newPathToItem.add(i);
                                FrozenList<FrozenList<Number>> fixedVal = JsonSchemaFactory.getInstance(Items1.class).castToAllowedTypes(item, newPathToItem, pathSet);
                argFixed.add(fixedVal);
                i += 1;
            }
            return new FrozenList<>(argFixed);
        }
    
        @Override
        public ItemsList2 getNewInstance(FrozenList<FrozenList<FrozenList<Number>>> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            ArrayList<ItemsList1> items = new ArrayList<>();
            int i = 0;
            for (FrozenList<FrozenList<Number>> item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                JsonSchema itemSchema = pathToSchemas.get(itemPathToItem).entrySet().iterator().next().getKey();
                assert itemSchema instanceof Items1;
                ItemsList1 castItem = JsonSchemaFactory.getInstance(Items1.class).getNewInstance(item, itemPathToItem, pathToSchemas);
                items.add(castItem);
                i += 1;
            }
            FrozenList<ItemsList1> newInstanceItems = new FrozenList<>(items);
            return new ItemsList2(newInstanceItems);
        }
    
        @Override
        public ItemsList2 validate(List<List<List<Number>>> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            FrozenList<FrozenList<FrozenList<Number>>> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
    }    
    
    public static class NestedItemsList extends FrozenList<ItemsList2> {
        NestedItemsList(FrozenList<ItemsList2> m) {
            super(m);
        }
        public static NestedItemsList of(List<List<List<List<Number>>>> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(NestedItems1.class).validate(arg, configuration);
        }
    }
    
    public class NestedItemsListInput {
        // class to build List<List<List<List<Number>>>>
    }
    
    
    public static class NestedItems1 extends JsonSchema implements SchemaListValidator<List<List<List<Number>>>, FrozenList<FrozenList<FrozenList<Number>>>, NestedItemsList> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public NestedItems1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(Items.class))
            )));
        }
    
        @Override
        public FrozenList<FrozenList<FrozenList<FrozenList<Number>>>> castToAllowedTypes(List<List<List<List<Number>>>> arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            pathSet.add(pathToItem);
            List<FrozenList<FrozenList<FrozenList<Number>>>> argFixed = new ArrayList<>();
            int i =0;
            for (List<List<List<Number>>> item: arg) {
                List<Object> newPathToItem = new ArrayList<>(pathToItem);
                newPathToItem.add(i);
                                FrozenList<FrozenList<FrozenList<Number>>> fixedVal = JsonSchemaFactory.getInstance(Items.class).castToAllowedTypes(item, newPathToItem, pathSet);
                argFixed.add(fixedVal);
                i += 1;
            }
            return new FrozenList<>(argFixed);
        }
    
        @Override
        public NestedItemsList getNewInstance(FrozenList<FrozenList<FrozenList<FrozenList<Number>>>> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            ArrayList<ItemsList2> items = new ArrayList<>();
            int i = 0;
            for (FrozenList<FrozenList<FrozenList<Number>>> item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                JsonSchema itemSchema = pathToSchemas.get(itemPathToItem).entrySet().iterator().next().getKey();
                assert itemSchema instanceof Items;
                ItemsList2 castItem = JsonSchemaFactory.getInstance(Items.class).getNewInstance(item, itemPathToItem, pathToSchemas);
                items.add(castItem);
                i += 1;
            }
            FrozenList<ItemsList2> newInstanceItems = new FrozenList<>(items);
            return new NestedItemsList(newInstanceItems);
        }
    
        @Override
        public NestedItemsList validate(List<List<List<List<Number>>>> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            FrozenList<FrozenList<FrozenList<FrozenList<Number>>>> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
    }
}
