package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.StringJsonSchema;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.RequiredValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class ObjWithRequiredPropsBase {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class B extends StringJsonSchema {}
    
    
    public static class ObjWithRequiredPropsBaseMap extends FrozenMap<String, Object> {
        ObjWithRequiredPropsBaseMap(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "b"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static ObjWithRequiredPropsBaseMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return ObjWithRequiredPropsBase1.validate(arg, configuration);
        }
        
        public String b() {
            return (String) get("b");
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }    
    
    public class ObjWithRequiredPropsBase1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("b", B.class)
            ))),
            new KeywordEntry("required", new RequiredValidator(Set.of(
                "b"
            )))
        ));
        protected static ObjWithRequiredPropsBaseMap getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new ObjWithRequiredPropsBaseMap(arg);
        }
        public static ObjWithRequiredPropsBaseMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(ObjWithRequiredPropsBase1.class, arg, configuration);
        }
    }
}
