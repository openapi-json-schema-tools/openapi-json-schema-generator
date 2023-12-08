package org.openapijsonschematools.client.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.BooleanJsonSchema;
import org.openapijsonschematools.client.schemas.SetMaker;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.EnumValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class MapTest {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties1 extends StringJsonSchema {}
    
    
    public static class AdditionalPropertiesMap extends FrozenMap<String, String> {
        AdditionalPropertiesMap(FrozenMap<String, String> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of();
        public static AdditionalPropertiesMap of(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(AdditionalProperties.class).validate(arg, configuration);
        }
        
        public String getAdditionalProperty(String name) {
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public class AdditionalPropertiesMapInput {
        // Map<String, additionalProperties>
    }
    
    
    public static class AdditionalProperties extends JsonSchema<AdditionalPropertiesMap, FrozenList> {
        public AdditionalProperties() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties1.class))
            )));
        }
        
        @Override
        protected AdditionalPropertiesMap getMapOutputInstance(FrozenMap<?, ?> arg) {
            return new AdditionalPropertiesMap((FrozenMap<String, String>) arg);
        }
        public AdditionalPropertiesMap validate(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
    
    
    public static class MapMapOfStringMap extends FrozenMap<String, AdditionalPropertiesMap> {
        MapMapOfStringMap(FrozenMap<String, AdditionalPropertiesMap> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of();
        public static MapMapOfStringMap of(Map<String, Map<String, String>> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(MapMapOfString.class).validate(arg, configuration);
        }
        
        public AdditionalPropertiesMap getAdditionalProperty(String name) {
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public class MapMapOfStringMapInput {
        // Map<String, additionalProperties>
    }
    
    
    public static class MapMapOfString extends JsonSchema<MapMapOfStringMap, FrozenList> {
        public MapMapOfString() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
            )));
        }
        
        @Override
        protected MapMapOfStringMap getMapOutputInstance(FrozenMap<?, ?> arg) {
            return new MapMapOfStringMap((FrozenMap<String, AdditionalPropertiesMap>) arg);
        }
        public MapMapOfStringMap validate(Map<String, Map<String, String>> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
    
    
    public static class AdditionalProperties2 extends JsonSchema {
        public AdditionalProperties2() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    String.class
                ))),
                new KeywordEntry("enum", new EnumValidator(SetMaker.makeSet(
                    "UPPER",
                    "lower"
                )))
            )));
        }
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return validateString(arg, configuration);
        }
    }    
    
    public static class MapOfEnumStringMap extends FrozenMap<String, String> {
        MapOfEnumStringMap(FrozenMap<String, String> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of();
        public static MapOfEnumStringMap of(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(MapOfEnumString.class).validate(arg, configuration);
        }
        
        public String getAdditionalProperty(String name) {
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public class MapOfEnumStringMapInput {
        // Map<String, additionalProperties>
    }
    
    
    public static class MapOfEnumString extends JsonSchema<MapOfEnumStringMap, FrozenList> {
        public MapOfEnumString() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties2.class))
            )));
        }
        
        @Override
        protected MapOfEnumStringMap getMapOutputInstance(FrozenMap<?, ?> arg) {
            return new MapOfEnumStringMap((FrozenMap<String, String>) arg);
        }
        public MapOfEnumStringMap validate(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
    
    
    public static class AdditionalProperties3 extends BooleanJsonSchema {}
    
    
    public static class DirectMapMap extends FrozenMap<String, Boolean> {
        DirectMapMap(FrozenMap<String, Boolean> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of();
        public static DirectMapMap of(Map<String, Boolean> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(DirectMap.class).validate(arg, configuration);
        }
        
        public boolean getAdditionalProperty(String name) {
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public class DirectMapMapInput {
        // Map<String, additionalProperties>
    }
    
    
    public static class DirectMap extends JsonSchema<DirectMapMap, FrozenList> {
        public DirectMap() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties3.class))
            )));
        }
        
        @Override
        protected DirectMapMap getMapOutputInstance(FrozenMap<?, ?> arg) {
            return new DirectMapMap((FrozenMap<String, Boolean>) arg);
        }
        public DirectMapMap validate(Map<String, Boolean> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
    
    
    public static class MapTestMap extends FrozenMap<String, Object> {
        MapTestMap(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "map_map_of_string",
            "map_of_enum_string",
            "direct_map",
            "indirect_map"
        );
        public static MapTestMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(MapTest1.class).validate(arg, configuration);
        }
        
        public MapMapOfStringMap map_map_of_string() {
            String key = "map_map_of_string";
            throwIfKeyNotPresent(key);
            return (MapMapOfStringMap) get(key);
        }
        
        public MapOfEnumStringMap map_of_enum_string() {
            String key = "map_of_enum_string";
            throwIfKeyNotPresent(key);
            return (MapOfEnumStringMap) get(key);
        }
        
        public DirectMapMap direct_map() {
            String key = "direct_map";
            throwIfKeyNotPresent(key);
            return (DirectMapMap) get(key);
        }
        
        public StringBooleanMap.StringBooleanMapMap indirect_map() {
            String key = "indirect_map";
            throwIfKeyNotPresent(key);
            return (StringBooleanMap.StringBooleanMapMap) get(key);
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public class MapTestMapInput {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class MapTest1 extends JsonSchema<MapTestMap, FrozenList> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public MapTest1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("map_map_of_string", MapMapOfString.class),
                    new PropertyEntry("map_of_enum_string", MapOfEnumString.class),
                    new PropertyEntry("direct_map", DirectMap.class),
                    new PropertyEntry("indirect_map", StringBooleanMap.StringBooleanMap1.class)
                )))
            )));
        }
        
        @Override
        protected MapTestMap getMapOutputInstance(FrozenMap<?, ?> arg) {
            return new MapTestMap((FrozenMap<String, Object>) arg);
        }
        public MapTestMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
}
