package org.openapijsonschematools.client.components.schemas;
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
    
    
    public static class Items2 extends JsonSchema implements SchemaListValidator<Number, Number, ItemsList<Number>> {
        public Items2() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(Items3.class))
            )));
        }
        
        @Override
        protected ItemsList getListOutputInstance(FrozenList<Number> arg) {
            return new ItemsList(arg);
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
    
    
    public static class Items1 extends JsonSchema implements SchemaListValidator<List<Number>, ItemsList, ItemsList1<ItemsList>> {
        public Items1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(Items2.class))
            )));
        }
        
        @Override
        protected ItemsList1 getListOutputInstance(FrozenList<ItemsList> arg) {
            return new ItemsList1(arg);
        }
        @Override
        public ItemsList1 validate(List<List<Number>> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            FrozenList<ItemsList> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
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
    
    
    public static class Items extends JsonSchema implements SchemaListValidator<List<List<Number>>, ItemsList1, ItemsList2<ItemsList1>> {
        public Items() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(Items1.class))
            )));
        }
        
        @Override
        protected ItemsList2 getListOutputInstance(FrozenList<ItemsList1> arg) {
            return new ItemsList2(arg);
        }
        @Override
        public ItemsList2 validate(List<List<List<Number>>> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            FrozenList<ItemsList1> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
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
    
    
    public static class NestedItems1 extends JsonSchema implements SchemaListValidator<List<List<List<Number>>>, ItemsList2, NestedItemsList<ItemsList2>> {
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
        protected NestedItemsList getListOutputInstance(FrozenList<ItemsList2> arg) {
            return new NestedItemsList(arg);
        }
        @Override
        public NestedItemsList validate(List<List<List<List<Number>>>> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            FrozenList<ItemsList2> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
    }
}
