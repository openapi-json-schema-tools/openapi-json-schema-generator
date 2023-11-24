package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.DateTimeJsonSchema;
import org.openapijsonschematools.schemas.UuidJsonSchema;
import org.openapijsonschematools.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class MixedPropertiesAndAdditionalPropertiesClass {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class UuidSchema extends UuidJsonSchema {}
    
    
    public class DateTime extends DateTimeJsonSchema {}
    
    
    public static class MapMap extends FrozenMap<String, Animal.AnimalMap> {

        MapMap(FrozenMap<String, Animal.AnimalMap> m) {

            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of();
        public static MapMap of(Map<String, Map<String, Object>> arg, SchemaConfiguration configuration) {


            return MapSchema.validate(arg, configuration);
        }
        
        public Animal.AnimalMap getAdditionalProperty(String name) {}

            throwIfKeyNotPresent(name);
            return get(name);
        }
    }    
    
    public class MapSchema extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(Animal.Animal1.class))
        ));
        protected static MapMap getMapOutputInstance(FrozenMap<String, Animal.AnimalMap> arg) {

            return new MapMap(arg);
        }
        public static MapMap validate(Map<String, Map<String, Object>> arg, SchemaConfiguration configuration) {


            return JsonSchema.validate(MapSchema.class, arg, configuration);
        }
    }
    
    
    public static class MixedPropertiesAndAdditionalPropertiesClassMap extends FrozenMap<String, Object> {

        MixedPropertiesAndAdditionalPropertiesClassMap(FrozenMap<String, Object> m) {

            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "uuid",
            "dateTime",
            "map"
        );
        public static MixedPropertiesAndAdditionalPropertiesClassMap of(Map<String, Object> arg, SchemaConfiguration configuration) {

            return MixedPropertiesAndAdditionalPropertiesClass1.validate(arg, configuration);
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
    
    public class MixedPropertiesAndAdditionalPropertiesClass1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("uuid", UuidSchema.class),
                new PropertyEntry("dateTime", DateTime.class),
                new PropertyEntry("map", MapSchema.class)
            )))
        ));
        protected static MixedPropertiesAndAdditionalPropertiesClassMap getMapOutputInstance(FrozenMap<String, Object> arg) {

            return new MixedPropertiesAndAdditionalPropertiesClassMap(arg);
        }
        public static MixedPropertiesAndAdditionalPropertiesClassMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(MixedPropertiesAndAdditionalPropertiesClass1.class, arg, configuration);
        }
    }
}
