package org.openapijsonschematools.client.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class ObjectWithCollidingProperties {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class SomeProp extends MapJsonSchema {}
    
    
    public static class Someprop extends MapJsonSchema {}
    
    
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
            return JsonSchemaFactory.getInstance(ObjectWithCollidingProperties1.class).validate(arg, configuration);
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
    public class ObjectWithCollidingPropertiesMapInput {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class ObjectWithCollidingProperties1 extends JsonSchema<Object, Object, ObjectWithCollidingPropertiesMap, Object, Object, FrozenList<Object>> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
    
        component with properties that have name collisions
        */
        public ObjectWithCollidingProperties1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("someProp", SomeProp.class),
                    new PropertyEntry("someprop", Someprop.class)
                )))
            )));
        }
        
        @Override
        protected ObjectWithCollidingPropertiesMap getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new ObjectWithCollidingPropertiesMap(arg);
        }
        
        @Override
        protected FrozenList<Object> getListOutputInstance(FrozenList<Object> arg) {
            return arg;
        }
        public ObjectWithCollidingPropertiesMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
}
