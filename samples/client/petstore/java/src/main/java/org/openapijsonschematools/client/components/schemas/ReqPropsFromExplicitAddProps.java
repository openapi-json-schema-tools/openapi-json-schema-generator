package org.openapijsonschematools.client.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.RequiredValidator;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class ReqPropsFromExplicitAddProps {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends StringJsonSchema {}
    
    
    public static class ReqPropsFromExplicitAddPropsMap extends FrozenMap<String, String> {
        ReqPropsFromExplicitAddPropsMap(FrozenMap<String, String> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "invalid-name",
            "validName"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static ReqPropsFromExplicitAddPropsMap of(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(ReqPropsFromExplicitAddProps1.class).validate(arg, configuration);
        }
        
        public String validName() {
            return get("validName");
        }
        
        public String getAdditionalProperty(String name) {
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public class ReqPropsFromExplicitAddPropsMapInput {
        // requiredProperties + additionalProperties
    }
    
    
    public static class ReqPropsFromExplicitAddProps1 extends JsonSchema<ReqPropsFromExplicitAddPropsMap, FrozenList> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public ReqPropsFromExplicitAddProps1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("required", new RequiredValidator(Set.of(
                    "invalid-name",
                    "validName"
                ))),
                new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
            )));
        }
        
        @Override
        protected ReqPropsFromExplicitAddPropsMap getMapOutputInstance(FrozenMap<?, ?> arg) {
            return new ReqPropsFromExplicitAddPropsMap((FrozenMap<String, String>) arg);
        }
        public ReqPropsFromExplicitAddPropsMap validate(Map<String, String> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
}
