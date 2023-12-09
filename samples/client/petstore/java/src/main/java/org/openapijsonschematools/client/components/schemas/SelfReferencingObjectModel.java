package org.openapijsonschematools.client.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
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

public class SelfReferencingObjectModel {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class SelfReferencingObjectModelMap extends FrozenMap<String, Object> {
        SelfReferencingObjectModelMap(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "selfRef"
        );
        public static SelfReferencingObjectModelMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(SelfReferencingObjectModel1.class).validate(arg, configuration);
        }
        
        public SelfReferencingObjectModelMap selfRef() {
            String key = "selfRef";
            throwIfKeyNotPresent(key);
            return (SelfReferencingObjectModelMap) get(key);
        }
        
        public SelfReferencingObjectModelMap getAdditionalProperty(String name) {
            throwIfKeyNotPresent(name);
            return (SelfReferencingObjectModelMap) get(name);
        }
    }
    public class SelfReferencingObjectModelMapInput {
        // optionalProperties + additionalProperties
    }
    
    
    public static class SelfReferencingObjectModel1 extends JsonSchema<Object, SelfReferencingObjectModelMap, Object, FrozenList<Object>> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public SelfReferencingObjectModel1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("selfRef", SelfReferencingObjectModel1.class)
                ))),
                new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(SelfReferencingObjectModel1.class))
            )));
        }
        
        @Override
        protected SelfReferencingObjectModelMap getMapOutputInstance(FrozenMap<String, ?> arg) {
            return new SelfReferencingObjectModelMap((FrozenMap<String, Object>) arg);
        }
        public SelfReferencingObjectModelMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
}
