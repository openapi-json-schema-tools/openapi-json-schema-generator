package org.openapijsonschematools.client.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.BooleanJsonSchema;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.EnumValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
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
            return AdditionalProperties.validate(arg, configuration);
        }
        
        public String getAdditionalProperty(String name) {
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public class AdditionalPropertiesMapInput {
        // Map<String, additionalProperties>
    }
    
    
    public static class AdditionalProperties extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties1.class))
        ));
        
        protected static AdditionalPropertiesMap getMapOutputInstance(FrozenMap<String, String> arg) {
            return new AdditionalPropertiesMap(arg);
        }
        public static AdditionalPropertiesMap validate(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateMap(AdditionalProperties.class, arg, configuration);
        }
    }
    
    
    public static class MapMapOfStringMap extends FrozenMap<String, AdditionalPropertiesMap> {
        MapMapOfStringMap(FrozenMap<String, AdditionalPropertiesMap> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of();
        public static MapMapOfStringMap of(Map<String, Map<String, String>> arg, SchemaConfiguration configuration) throws ValidationException {
            return MapMapOfString.validate(arg, configuration);
        }
        
        public AdditionalPropertiesMap getAdditionalProperty(String name) {
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public class MapMapOfStringMapInput {
        // Map<String, additionalProperties>
    }
    
    
    public static class MapMapOfString extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
        ));
        
        protected static MapMapOfStringMap getMapOutputInstance(FrozenMap<String, AdditionalPropertiesMap> arg) {
            return new MapMapOfStringMap(arg);
        }
        public static MapMapOfStringMap validate(Map<String, Map<String, String>> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateMap(MapMapOfString.class, arg, configuration);
        }
    }
    
    
    public static class AdditionalProperties2 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                String.class
            ))),
            new KeywordEntry("enum", new EnumValidator(Set.of(
                "UPPER",
                "lower"
            )))
        ));
        public static String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateString(AdditionalProperties2.class, arg, configuration);
        }
    }    
    
    public static class MapOfEnumStringMap extends FrozenMap<String, String> {
        MapOfEnumStringMap(FrozenMap<String, String> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of();
        public static MapOfEnumStringMap of(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException {
            return MapOfEnumString.validate(arg, configuration);
        }
        
        public String getAdditionalProperty(String name) {
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public class MapOfEnumStringMapInput {
        // Map<String, additionalProperties>
    }
    
    
    public static class MapOfEnumString extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties2.class))
        ));
        
        protected static MapOfEnumStringMap getMapOutputInstance(FrozenMap<String, String> arg) {
            return new MapOfEnumStringMap(arg);
        }
        public static MapOfEnumStringMap validate(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateMap(MapOfEnumString.class, arg, configuration);
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
            return DirectMap.validate(arg, configuration);
        }
        
        public boolean getAdditionalProperty(String name) {
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public class DirectMapMapInput {
        // Map<String, additionalProperties>
    }
    
    
    public static class DirectMap extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties3.class))
        ));
        
        protected static DirectMapMap getMapOutputInstance(FrozenMap<String, Boolean> arg) {
            return new DirectMapMap(arg);
        }
        public static DirectMapMap validate(Map<String, Boolean> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateMap(DirectMap.class, arg, configuration);
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
            return MapTest1.validate(arg, configuration);
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
    
    
    public static class MapTest1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("map_map_of_string", MapMapOfString.class),
                new PropertyEntry("map_of_enum_string", MapOfEnumString.class),
                new PropertyEntry("direct_map", DirectMap.class),
                new PropertyEntry("indirect_map", StringBooleanMap.StringBooleanMap1.class)
            )))
        ));
        
        protected static MapTestMap getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new MapTestMap(arg);
        }
        public static MapTestMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateMap(MapTest1.class, arg, configuration);
        }
    }
}
