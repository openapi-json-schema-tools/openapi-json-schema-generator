package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.TypeValidator;

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
            return SelfReferencingObjectModel1.validate(arg, configuration);
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
    
    public static class SelfReferencingObjectModel1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("selfRef", SelfReferencingObjectModel1.class)
            ))),
            
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(SelfReferencingObjectModel1.class))
        ));
        protected static SelfReferencingObjectModelMap getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new SelfReferencingObjectModelMap(arg);
        }
        public static SelfReferencingObjectModelMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(SelfReferencingObjectModel1.class, arg, configuration);
        }
    }
}
