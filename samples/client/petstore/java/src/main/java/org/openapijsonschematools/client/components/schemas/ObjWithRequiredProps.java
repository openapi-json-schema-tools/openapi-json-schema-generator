package org.openapijsonschematools.client.components.schemas;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.validation.AllOfValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.RequiredValidator;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class ObjWithRequiredProps {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class A extends StringJsonSchema {}
    
    
    public static class ObjWithRequiredPropsMap extends FrozenMap<String, Object> {
        ObjWithRequiredPropsMap(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "a"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static ObjWithRequiredPropsMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(ObjWithRequiredProps1.class).validate(arg, configuration);
        }
        
        public String a() {
            return (String) get("a");
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public class ObjWithRequiredPropsMapInput {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class ObjWithRequiredProps1 extends JsonSchema<ObjWithRequiredPropsMap, FrozenList> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public ObjWithRequiredProps1() {
            keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("a", A.class)
                ))),
                new KeywordEntry("required", new RequiredValidator(Set.of(
                    "a"
                ))),
                new KeywordEntry("allOf", new AllOfValidator(List.of(
                    ObjWithRequiredPropsBase.ObjWithRequiredPropsBase1.class
                )))
            ));
        }
        
        @Override
        protected ObjWithRequiredPropsMap getMapOutputInstance(FrozenMap<?, ?> arg) {
            return new ObjWithRequiredPropsMap((FrozenMap<String, Object>) arg);
        }
        public ObjWithRequiredPropsMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
}
