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
import org.openapijsonschematools.client.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.ItemsValidator;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.SchemaListValidator;
import org.openapijsonschematools.client.schemas.validation.SchemaMapValidator;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

public class AdditionalPropertiesWithArrayOfEnums {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalPropertiesList extends FrozenList<String> {
        AdditionalPropertiesList(FrozenList<String> m) {
            super(m);
        }
        public static AdditionalPropertiesList of(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            return AdditionalProperties.getInstance().validate(arg, configuration);
        }
    }
    
    public static class AdditionalPropertiesListInput {
        // class to build List<String>
    }
    
    
    public static class AdditionalProperties extends JsonSchema implements SchemaListValidator<String, String, AdditionalPropertiesList> {
        private static AdditionalProperties instance;
        protected AdditionalProperties() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(EnumClass.EnumClass1.class))
            )));
        }
    
        public static AdditionalProperties getInstance() {
            if (instance == null) {
                instance = new AdditionalProperties();
            }
            return instance;
        }
    
        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof FrozenList) {
                @SuppressWarnings("unchecked") FrozenList<String> castArg = (FrozenList<String>) arg;
                return getNewInstance(castArg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
        
        @Override
        public FrozenList<String> castToAllowedTypes(List<String> arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            pathSet.add(pathToItem);
            List<String> argFixed = new ArrayList<>();
            int i =0;
            for (String item: arg) {
                List<Object> newPathToItem = new ArrayList<>(pathToItem);
                newPathToItem.add(i);
                                String fixedVal = (String) castToAllowedObjectTypes(item, newPathToItem, pathSet);
                argFixed.add(fixedVal);
                i += 1;
            }
            return new FrozenList<>(argFixed);
        }
        
        @Override
        public AdditionalPropertiesList getNewInstance(FrozenList<String> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
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
            return new AdditionalPropertiesList(newInstanceItems);
        }
        
        @Override
        public AdditionalPropertiesList validate(List<String> arg, SchemaConfiguration configuration) throws ValidationException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            FrozenList<String> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
    }    
    
    public static class AdditionalPropertiesWithArrayOfEnumsMap extends FrozenMap<AdditionalPropertiesList> {
        AdditionalPropertiesWithArrayOfEnumsMap(FrozenMap<AdditionalPropertiesList> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of();
        public static AdditionalPropertiesWithArrayOfEnumsMap of(Map<String, List<String>> arg, SchemaConfiguration configuration) throws ValidationException {
            return AdditionalPropertiesWithArrayOfEnums1.getInstance().validate(arg, configuration);
        }
        
        public AdditionalPropertiesList getAdditionalProperty(String name) {
            throwIfKeyNotPresent(name);
            return (AdditionalPropertiesList) get(name);
        }
    }
    public static class AdditionalPropertiesWithArrayOfEnumsMapInput {
        // Map<String, additionalProperties>
    }
    
    
    public static class AdditionalPropertiesWithArrayOfEnums1 extends JsonSchema implements SchemaMapValidator<List<String>, FrozenList<String>, AdditionalPropertiesWithArrayOfEnumsMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        private static AdditionalPropertiesWithArrayOfEnums1 instance;
        protected AdditionalPropertiesWithArrayOfEnums1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
            )));
        }
    
        public static AdditionalPropertiesWithArrayOfEnums1 getInstance() {
            if (instance == null) {
                instance = new AdditionalPropertiesWithArrayOfEnums1();
            }
            return instance;
        }
    
        @Override
        public Object getNewInstance(Object arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            if (arg instanceof FrozenMap) {
                @SuppressWarnings("unchecked") FrozenMap<FrozenList<String>> castArg = (FrozenMap<FrozenList<String>>) arg;
                return getNewInstance(castArg, pathToItem, pathToSchemas);
            }
            throw new InvalidTypeException("Invalid input type="+arg.getClass()+". It can't be instantiated by this schema");
        }
        
        @Override
        public FrozenMap<FrozenList<String>> castToAllowedTypes(Map<String, List<String>> arg, List<Object> pathToItem, Set<List<Object>> pathSet) {
            pathSet.add(pathToItem);
            LinkedHashMap<String, FrozenList<String>> argFixed = new LinkedHashMap<>();
            for (Map.Entry<String, List<String>> entry: arg.entrySet()) {
                String key = entry.getKey();
                                List<String> val = entry.getValue();
                List<Object> newPathToItem = new ArrayList<>(pathToItem);
                newPathToItem.add(key);
                                FrozenList<String> fixedVal = (FrozenList<String>) castToAllowedObjectTypes(val, newPathToItem, pathSet);
                argFixed.put(key, fixedVal);
            }
            return new FrozenMap<>(argFixed);
        }
        
        public AdditionalPropertiesWithArrayOfEnumsMap getNewInstance(FrozenMap<FrozenList<String>> arg, List<Object> pathToItem, PathToSchemasMap pathToSchemas) {
            LinkedHashMap<String, AdditionalPropertiesList> properties = new LinkedHashMap<>();
            for(Map.Entry<String, FrozenList<String>> entry: arg.entrySet()) {
                String propertyName = entry.getKey();
                List<Object> propertyPathToItem = new ArrayList<>(pathToItem);
                propertyPathToItem.add(propertyName);
                FrozenList<String> value = entry.getValue();
                JsonSchema propertySchema = pathToSchemas.get(propertyPathToItem).entrySet().iterator().next().getKey();
                AdditionalPropertiesList castValue = (AdditionalPropertiesList) propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas);
                properties.put(propertyName, castValue);
            }
            FrozenMap<AdditionalPropertiesList> castProperties = new FrozenMap<>(properties);
            return new AdditionalPropertiesWithArrayOfEnumsMap(castProperties);
        }
        
        @Override
        public AdditionalPropertiesWithArrayOfEnumsMap validate(Map<String, List<String>> arg, SchemaConfiguration configuration) throws ValidationException, InvalidTypeException {
            Set<List<Object>> pathSet = new HashSet<>();
            List<Object> pathToItem = List.of("args[0");
            FrozenMap<FrozenList<String>> castArg = castToAllowedTypes(arg, pathToItem, pathSet);
            SchemaConfiguration usedConfiguration = Objects.requireNonNullElseGet(configuration, () -> new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()));
            ValidationMetadata validationMetadata = new ValidationMetadata(pathToItem, usedConfiguration, new PathToSchemasMap(), new LinkedHashSet<>());
            PathToSchemasMap pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet);
            return getNewInstance(castArg, validationMetadata.pathToItem(), pathToSchemasMap);
        }
        
    }

}
