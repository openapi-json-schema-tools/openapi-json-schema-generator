package org.openapijsonschematools.client.components.schemas;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.NumberJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.ListSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class NestedItems {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Items3 extends NumberJsonSchema {
        private static @Nullable Items3 instance = null;
        public static Items3 getInstance() {
            if (instance == null) {
                instance = new Items3();
            }
            return instance;
        }
    }
    
    
    public static class ItemsList extends FrozenList<Number> {
        protected ItemsList(FrozenList<Number> m) {
            super(m);
        }
        public static ItemsList of(List<Number> arg, SchemaConfiguration configuration) throws ValidationException {
            return Items2.getInstance().validate(arg, configuration);
        }
    }
    
    public static class ItemsListInput {
        // class to build List<Number>
    }
    
    
    public static class Items2 extends JsonSchema implements ListSchemaValidator<ItemsList> {
        private static @Nullable Items2 instance = null;
    
        protected Items2() {
            super(new JsonSchemaInfo()
                .type(Set.of(List.class))
                .items(Items3.class)
            );
        }
    
        public static Items2 getInstance() {
            if (instance == null) {
                instance = new Items2();
            }
            return instance;
        }
        
        @Override
        public ItemsList getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<Number> items = new ArrayList<>();
            int i = 0;
            for (Object item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                LinkedHashMap<JsonSchema, Void> schemas = pathToSchemas.get(itemPathToItem);
                if (schemas == null) {
                    throw new InvalidTypeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema itemSchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object itemInstance = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                if (!(itemInstance instanceof Number)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                items.add((Number) itemInstance);
                i += 1;
            }
            FrozenList<Number> newInstanceItems = new FrozenList<>(items);
            return new ItemsList(newInstanceItems);
        }
        
        public ItemsList validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            if (arg instanceof List) {
                return getNewInstance((List<?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }    
    
    public static class ItemsList1 extends FrozenList<ItemsList> {
        protected ItemsList1(FrozenList<ItemsList> m) {
            super(m);
        }
        public static ItemsList1 of(List<List<Number>> arg, SchemaConfiguration configuration) throws ValidationException {
            return Items1.getInstance().validate(arg, configuration);
        }
    }
    
    public static class ItemsListInput1 {
        // class to build List<List<Number>>
    }
    
    
    public static class Items1 extends JsonSchema implements ListSchemaValidator<ItemsList1> {
        private static @Nullable Items1 instance = null;
    
        protected Items1() {
            super(new JsonSchemaInfo()
                .type(Set.of(List.class))
                .items(Items2.class)
            );
        }
    
        public static Items1 getInstance() {
            if (instance == null) {
                instance = new Items1();
            }
            return instance;
        }
        
        @Override
        public ItemsList1 getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<ItemsList> items = new ArrayList<>();
            int i = 0;
            for (Object item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                LinkedHashMap<JsonSchema, Void> schemas = pathToSchemas.get(itemPathToItem);
                if (schemas == null) {
                    throw new InvalidTypeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema itemSchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object itemInstance = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                if (!(itemInstance instanceof ItemsList)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                items.add((ItemsList) itemInstance);
                i += 1;
            }
            FrozenList<ItemsList> newInstanceItems = new FrozenList<>(items);
            return new ItemsList1(newInstanceItems);
        }
        
        public ItemsList1 validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            if (arg instanceof List) {
                return getNewInstance((List<?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }    
    
    public static class ItemsList2 extends FrozenList<ItemsList1> {
        protected ItemsList2(FrozenList<ItemsList1> m) {
            super(m);
        }
        public static ItemsList2 of(List<List<List<Number>>> arg, SchemaConfiguration configuration) throws ValidationException {
            return Items.getInstance().validate(arg, configuration);
        }
    }
    
    public static class ItemsListInput2 {
        // class to build List<List<List<Number>>>
    }
    
    
    public static class Items extends JsonSchema implements ListSchemaValidator<ItemsList2> {
        private static @Nullable Items instance = null;
    
        protected Items() {
            super(new JsonSchemaInfo()
                .type(Set.of(List.class))
                .items(Items1.class)
            );
        }
    
        public static Items getInstance() {
            if (instance == null) {
                instance = new Items();
            }
            return instance;
        }
        
        @Override
        public ItemsList2 getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<ItemsList1> items = new ArrayList<>();
            int i = 0;
            for (Object item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                LinkedHashMap<JsonSchema, Void> schemas = pathToSchemas.get(itemPathToItem);
                if (schemas == null) {
                    throw new InvalidTypeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema itemSchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object itemInstance = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                if (!(itemInstance instanceof ItemsList1)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                items.add((ItemsList1) itemInstance);
                i += 1;
            }
            FrozenList<ItemsList1> newInstanceItems = new FrozenList<>(items);
            return new ItemsList2(newInstanceItems);
        }
        
        public ItemsList2 validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            if (arg instanceof List) {
                return getNewInstance((List<?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }    
    
    public static class NestedItemsList extends FrozenList<ItemsList2> {
        protected NestedItemsList(FrozenList<ItemsList2> m) {
            super(m);
        }
        public static NestedItemsList of(List<List<List<List<Number>>>> arg, SchemaConfiguration configuration) throws ValidationException {
            return NestedItems1.getInstance().validate(arg, configuration);
        }
    }
    
    public static class NestedItemsListInput {
        // class to build List<List<List<List<Number>>>>
    }
    
    
    public static class NestedItems1 extends JsonSchema implements ListSchemaValidator<NestedItemsList> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static @Nullable NestedItems1 instance = null;
    
        protected NestedItems1() {
            super(new JsonSchemaInfo()
                .type(Set.of(List.class))
                .items(Items.class)
            );
        }
    
        public static NestedItems1 getInstance() {
            if (instance == null) {
                instance = new NestedItems1();
            }
            return instance;
        }
        
        @Override
        public NestedItemsList getNewInstance(List<?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            List<ItemsList2> items = new ArrayList<>();
            int i = 0;
            for (Object item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                LinkedHashMap<JsonSchema, Void> schemas = pathToSchemas.get(itemPathToItem);
                if (schemas == null) {
                    throw new InvalidTypeException("Validation result is invalid, schemas must exist for a pathToItem");
                }
                JsonSchema itemSchema = schemas.entrySet().iterator().next().getKey();
                @Nullable Object itemInstance = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                if (!(itemInstance instanceof ItemsList2)) {
                    throw new InvalidTypeException("Invalid instantiated value");
                }
                items.add((ItemsList2) itemInstance);
                i += 1;
            }
            FrozenList<ItemsList2> newInstanceItems = new FrozenList<>(items);
            return new NestedItemsList(newInstanceItems);
        }
        
        public NestedItemsList validate(List<?> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            List<?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public @Nullable Object getNewInstance(@Nullable Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) throws InvalidTypeException {
            if (arg instanceof List) {
                return getNewInstance((List<?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema");
        }
    }
}
