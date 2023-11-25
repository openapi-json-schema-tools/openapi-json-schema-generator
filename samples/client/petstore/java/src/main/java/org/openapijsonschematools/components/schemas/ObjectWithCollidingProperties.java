package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.MapJsonSchema;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class ObjectWithCollidingProperties {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class SomeProp extends MapJsonSchema {}
    
    
    public class Someprop extends MapJsonSchema {}
    
    
    public static class ObjectWithCollidingPropertiesMap extends FrozenMap<String, Object> {
        ObjectWithCollidingPropertiesMap(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "someProp",
            "someprop"
        );
        public static ObjectWithCollidingPropertiesMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return ObjectWithCollidingProperties1.validate(arg, configuration);
        }
        
        public FrozenMap<String, Object> someProp() {
            String key = "someProp";
            throwIfKeyNotPresent(key);
            return (FrozenMap<String, Object>) get(key);
        }
        
        public FrozenMap<String, Object> someprop() {
            String key = "someprop";
            throwIfKeyNotPresent(key);
            return (FrozenMap<String, Object>) get(key);
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }    
    
    public class ObjectWithCollidingProperties1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
    
        component with properties that have name collisions
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("someProp", SomeProp.class),
                new PropertyEntry("someprop", Someprop.class)
            )))
        ));
        protected static ObjectWithCollidingPropertiesMap getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new ObjectWithCollidingPropertiesMap(arg);
        }
        public static ObjectWithCollidingPropertiesMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(ObjectWithCollidingProperties1.class, arg, configuration);
        }
    }
}
