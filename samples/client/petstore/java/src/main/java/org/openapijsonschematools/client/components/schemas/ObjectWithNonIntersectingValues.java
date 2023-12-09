package org.openapijsonschematools.client.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.NumberJsonSchema;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class ObjectWithNonIntersectingValues {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends StringJsonSchema {}
    
    
    public static class A extends NumberJsonSchema {}
    
    
    public static class ObjectWithNonIntersectingValuesMap extends FrozenMap<String, Object> {
        ObjectWithNonIntersectingValuesMap(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "a"
        );
        public static ObjectWithNonIntersectingValuesMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(ObjectWithNonIntersectingValues1.class).validate(arg, configuration);
        }
        
        public Number a() {
            String key = "a";
            throwIfKeyNotPresent(key);
            return (Number) get(key);
        }
        
        public String getAdditionalProperty(String name) {
            throwIfKeyNotPresent(name);
            return (String) get(name);
        }
    }
    public class ObjectWithNonIntersectingValuesMapInput {
        // optionalProperties + additionalProperties
    }
    
    
    public static class ObjectWithNonIntersectingValues1 extends JsonSchema<Object, ObjectWithNonIntersectingValuesMap, Object, FrozenList<Object>> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public ObjectWithNonIntersectingValues1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("a", A.class)
                ))),
                new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
            )));
        }
        
        @Override
        protected ObjectWithNonIntersectingValuesMap getMapOutputInstance(FrozenMap<String, ?> arg) {
            return new ObjectWithNonIntersectingValuesMap((FrozenMap<String, Object>) arg);
        }
        public ObjectWithNonIntersectingValuesMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
}
