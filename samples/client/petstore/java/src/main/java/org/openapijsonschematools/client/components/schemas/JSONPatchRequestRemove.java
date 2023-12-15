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
import org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.SetMaker;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo;
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class JSONPatchRequestRemove {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends NotAnyTypeJsonSchema {}
        // NotAnyTypeSchema
    
    
    public static class Path extends StringJsonSchema {}
    
    
    public static class Op extends JsonSchema implements StringSchemaValidator {
        private static Op instance;
    
        protected Op() {
            super(new JsonSchemaInfo()
                .type(Set.of(
                    String.class
                ))
                .enumValues(SetMaker.makeSet(
                    "remove"
                ))
            );
        }
    
        public static Op getInstance() {
            if (instance == null) {
                instance = new Op();
            }
            return instance;
        }
        
        @Override
        public String castToAllowedTypes(String arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            return castToAllowedStringTypes(arg, pathToItem, pathSet);
        }
        
        @Override
        public String getNewInstance(String arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            return arg;
        }
        
        @Override
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            String castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof String) {
                return getNewInstance((String) arg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }    
    
    public static class JSONPatchRequestRemoveMap extends FrozenMap<String> {
        JSONPatchRequestRemoveMap(FrozenMap<String> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "op",
            "path"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static JSONPatchRequestRemoveMap of(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException {
            return JSONPatchRequestRemove1.getInstance().validate(arg, configuration);
        }
        
        public String op() {
            return (String) get("op");
        }
        
        public String path() {
            return get("path");
        }
    }
    public static class JSONPatchRequestRemoveMapInput {
        // empty mapping
    }
    
    
    public static class JSONPatchRequestRemove1 extends JsonSchema implements MapSchemaValidator<String, String, JSONPatchRequestRemoveMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static JSONPatchRequestRemove1 instance;
    
        protected JSONPatchRequestRemove1() {
            super(new JsonSchemaInfo()
                .type(Set.of(FrozenMap.class))
                .properties(Map.ofEntries(
                    new PropertyEntry("path", Path.class),
                    new PropertyEntry("op", Op.class)
                ))
                .required(Set.of(
                    "op",
                    "path"
                ))
                .additionalProperties(AdditionalProperties.class)
            );
        }
    
        public static JSONPatchRequestRemove1 getInstance() {
            if (instance == null) {
                instance = new JSONPatchRequestRemove1();
            }
            return instance;
        }
        
        @Override
        public FrozenMap<String> castToAllowedTypes(Map<String, String> arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            pathSet.add(pathToItem);
            LinkedHashMap<String, String> argFixed = new LinkedHashMap<>();
            for (Map.Entry<String, String> entry: arg.entrySet()) {
                String key = entry.getKey();
                                String val = entry.getValue();
                List<Object> newPathToItem = new ArrayList<>(pathToItem);
                newPathToItem.add(key);
                                String fixedVal = (String) castToAllowedObjectTypes(val, newPathToItem, pathSet);
                argFixed.put(key, fixedVal);
            }
            return new FrozenMap<>(argFixed);
        }
        
        public JSONPatchRequestRemoveMap getNewInstance(FrozenMap<String> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, String> properties = new LinkedHashMap<>();
            for(Map.Entry<String, String> entry: arg.entrySet()) {
                String propertyName = entry.getKey();
                List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
                propertyPathToItem.add(propertyName);
                String value = entry.getValue();
                JsonSchema propertySchema = pathToSchemas.get(propertyPathToItem).entrySet().iterator().next().getKey();
                String castValue = (String) propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                properties.put(propertyName, castValue);
            }
            FrozenMap<String> castProperties = new FrozenMap<>(properties);
            return new JSONPatchRequestRemoveMap(castProperties);
        }
        
        @Override
        public JSONPatchRequestRemoveMap validate(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            FrozenMap<String> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
        
        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof FrozenMap) {
                @SuppressWarnings("unchecked") FrozenMap<String> castArg = (FrozenMap<String>) arg;
                return getNewInstance(castArg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
    }

}
