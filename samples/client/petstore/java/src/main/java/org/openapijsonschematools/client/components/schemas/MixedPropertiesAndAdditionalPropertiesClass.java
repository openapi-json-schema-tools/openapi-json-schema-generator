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
import org.openapijsonschematools.client.schemas.DateTimeJsonSchema;
import org.openapijsonschematools.client.schemas.UuidJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class MixedPropertiesAndAdditionalPropertiesClass {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class UuidSchema extends UuidJsonSchema {}
    
    
    public static class DateTime extends DateTimeJsonSchema {}
    
    
    public static class MapMap extends FrozenMap<Animal.AnimalMap> {
        protected MapMap(FrozenMap<Animal.AnimalMap> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of();
        public static MapMap of(Map<String, Map<String, Object>> arg, SchemaConfiguration configuration) throws ValidationException {
            return MapSchema.getInstance().validate(arg, configuration);
        }
        
        public Animal.AnimalMap getAdditionalProperty(String name) {
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public static class MapMapInput {
        // Map<String, additionalProperties>
    }
    
    
    public static class MapSchema extends JsonSchema implements MapSchemaValidator<Map<String, Object>, MapMap> {
        private static MapSchema instance;
    
        protected MapSchema() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .additionalProperties(Animal.Animal1.class)
            );
        }
    
        public static MapSchema getInstance() {
            if (instance == null) {
                instance = new MapSchema();
            }
            return instance;
        }
        
        public MapMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, Animal.AnimalMap> properties = new LinkedHashMap<>();
            for(Map.Entry<?, ?> entry: arg.entrySet()) {
                String propertyName = (String) entry.getKey();
                List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
                propertyPathToItem.add(propertyName);
                Object value = entry.getValue();
                JsonSchema propertySchema = pathToSchemas.get(propertyPathToItem).entrySet().iterator().next().getKey();
                Animal.AnimalMap castValue = (Animal.AnimalMap) propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                properties.put(propertyName, castValue);
            }
            FrozenMap<Animal.AnimalMap> castProperties = new FrozenMap<>(properties);
            return new MapMap(castProperties);
        }
        
        @Override
        public MapMap validate(Map<String, Map<String, Object>> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }
    
    
    public static class MixedPropertiesAndAdditionalPropertiesClassMap extends FrozenMap<Object> {
        protected MixedPropertiesAndAdditionalPropertiesClassMap(FrozenMap<Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "uuid",
            "dateTime",
            "map"
        );
        public static MixedPropertiesAndAdditionalPropertiesClassMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return MixedPropertiesAndAdditionalPropertiesClass1.getInstance().validate(arg, configuration);
        }
        
        public String dateTime() {
            String key = "dateTime";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public static class MixedPropertiesAndAdditionalPropertiesClassMapInput {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class MixedPropertiesAndAdditionalPropertiesClass1 extends JsonSchema implements MapSchemaValidator<Object, MixedPropertiesAndAdditionalPropertiesClassMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static MixedPropertiesAndAdditionalPropertiesClass1 instance;
    
        protected MixedPropertiesAndAdditionalPropertiesClass1() {
            super(new JsonSchemaInfo()
                .type(Set.of(Map.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("uuid", UuidSchema.class),
                    new PropertyEntry("dateTime", DateTime.class),
                    new PropertyEntry("map", MapSchema.class)
                ))
            );
        }
    
        public static MixedPropertiesAndAdditionalPropertiesClass1 getInstance() {
            if (instance == null) {
                instance = new MixedPropertiesAndAdditionalPropertiesClass1();
            }
            return instance;
        }
        
        public MixedPropertiesAndAdditionalPropertiesClassMap getNewInstance(Map<?, ?> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, Object> properties = new LinkedHashMap<>();
            for(Map.Entry<?, ?> entry: arg.entrySet()) {
                String propertyName = (String) entry.getKey();
                List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
                propertyPathToItem.add(propertyName);
                Object value = entry.getValue();
                JsonSchema propertySchema = pathToSchemas.get(propertyPathToItem).entrySet().iterator().next().getKey();
                Object castValue = (Object) propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                properties.put(propertyName, castValue);
            }
            FrozenMap<Object> castProperties = new FrozenMap<>(properties);
            return new MixedPropertiesAndAdditionalPropertiesClassMap(castProperties);
        }
        
        @Override
        public MixedPropertiesAndAdditionalPropertiesClassMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            Map<?, ?> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof Map) {
                return getNewInstance((Map<?, ?>) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }

}
