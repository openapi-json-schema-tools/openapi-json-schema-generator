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
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.IntJsonSchema;
import org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.ItemsValidator;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.RequiredValidator;
import org.openapijsonschematools.client.schemas.validation.SchemaListValidator;
import org.openapijsonschematools.client.schemas.validation.SchemaMapValidator;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class PaginatedResultMyObjectDto {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public static class Count extends IntJsonSchema {}
    
    
    public static class ResultsList extends FrozenList<MyObjectDto.MyObjectDtoMap> {
        ResultsList(FrozenList<MyObjectDto.MyObjectDtoMap> m) {
            super(m);
        }
        public static ResultsList of(List<Map<String, String>> arg, SchemaConfiguration configuration) throws ValidationException {
            return Results.getInstance().validate(arg, configuration);
        }
    }
    
    public static class ResultsListInput {
        // class to build List<Map<String, String>>
    }
    
    
    public static class Results extends JsonSchema implements SchemaListValidator<Map<String, String>, FrozenMap<String, String>, ResultsList> {
        private static Results instance;
        protected Results() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(MyObjectDto.MyObjectDto1.class))
            )));
        }
    
        public static Results getInstance() {
            if (instance == null) {
                instance = new Results();
            }
            return instance;
        }
        
        @Override
        public FrozenList<FrozenMap<String, String>> castToAllowedTypes(List<Map<String, String>> arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            pathSet.add(pathToItem);
            List<FrozenMap<String, String>> argFixed = new ArrayList<>();
            int i =0;
            for (Map<String, String> item: arg) {
                List<Object> newPathToItem = new ArrayList<>(pathToItem);
                newPathToItem.add(i);
                                FrozenMap<String, String> fixedVal = (FrozenMap<String, String>) castToAllowedObjectTypes(item, newPathToItem, pathSet);
                argFixed.add(fixedVal);
                i += 1;
            }
            return new FrozenList<>(argFixed);
        }
        
        @Override
        public ResultsList getNewInstance(FrozenList<FrozenMap<String, String>> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            ArrayList<MyObjectDto.MyObjectDtoMap> items = new ArrayList<>();
            int i = 0;
            for (FrozenMap<String, String> item: arg) {
                List<Object> itemPathToItem = new ArrayList<>(pathToItem);
                itemPathToItem.add(i);
                JsonSchema itemSchema = pathToSchemas.get(itemPathToItem).entrySet().iterator().next().getKey();
                                MyObjectDto.MyObjectDtoMap castItem = (MyObjectDto.MyObjectDtoMap) itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas);
                items.add(castItem);
                i += 1;
            }
            FrozenList<MyObjectDto.MyObjectDtoMap> newInstanceItems = new FrozenList<>(items);
            return new ResultsList(newInstanceItems);
        }
        
        @Override
        public ResultsList validate(List<Map<String, String>> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            FrozenList<FrozenMap<String, String>> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof FrozenList) {
                @SuppressWarnings("unchecked") FrozenList<Map<String, String>> castArg = (FrozenList<Map<String, String>>) arg;
                return getNewInstance(castArg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }    
    
    public static class PaginatedResultMyObjectDtoMap extends FrozenMap<Object> {
        PaginatedResultMyObjectDtoMap(FrozenMap<Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "count",
            "results"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static PaginatedResultMyObjectDtoMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return PaginatedResultMyObjectDto1.getInstance().validate(arg, configuration);
        }
        
        public long count() {
            return (long) get("count");
        }
        
        public ResultsList results() {
            return (ResultsList) get("results");
        }
    }
    public static class PaginatedResultMyObjectDtoMapInput {
        // empty mapping
    }
    
    
    public static class PaginatedResultMyObjectDto1 extends JsonSchema implements SchemaMapValidator<Object, Object, PaginatedResultMyObjectDtoMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static PaginatedResultMyObjectDto1 instance;
        protected PaginatedResultMyObjectDto1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("count", Count.class),
                    new PropertyEntry("results", Results.class)
                ))),
                new KeywordEntry("required", new RequiredValidator(Set.of(
                    "count",
                    "results"
                ))),
                new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
            )));
        }
    
        public static PaginatedResultMyObjectDto1 getInstance() {
            if (instance == null) {
                instance = new PaginatedResultMyObjectDto1();
            }
            return instance;
        }
        
        @Override
        public FrozenMap<Object> castToAllowedTypes(Map<String, Object> arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            pathSet.add(pathToItem);
            LinkedHashMap<String, Object> argFixed = new LinkedHashMap<>();
            for (Map.Entry<String, Object> entry: arg.entrySet()) {
                String key = entry.getKey();
                                Object val = entry.getValue();
                List<Object> newPathToItem = new ArrayList<>(pathToItem);
                newPathToItem.add(key);
                                Object fixedVal = (Object) castToAllowedObjectTypes(val, newPathToItem, pathSet);
                argFixed.put(key, fixedVal);
            }
            return new FrozenMap<>(argFixed);
        }
        
        public PaginatedResultMyObjectDtoMap getNewInstance(FrozenMap<Object> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, Object> properties = new LinkedHashMap<>();
            for(Map.Entry<String, Object> entry: arg.entrySet()) {
                String propertyName = entry.getKey();
                List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
                propertyPathToItem.add(propertyName);
                Object value = entry.getValue();
                JsonSchema propertySchema = pathToSchemas.get(propertyPathToItem).entrySet().iterator().next().getKey();
                Object castValue = (Object) propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                properties.put(propertyName, castValue);
            }
            FrozenMap<Object> castProperties = new FrozenMap<>(properties);
            return new PaginatedResultMyObjectDtoMap(castProperties);
        }
        
        @Override
        public PaginatedResultMyObjectDtoMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            FrozenMap<Object> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof FrozenMap) {
                @SuppressWarnings("unchecked") FrozenMap<Object> castArg = (FrozenMap<Object>) arg;
                return getNewInstance(castArg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }

}
