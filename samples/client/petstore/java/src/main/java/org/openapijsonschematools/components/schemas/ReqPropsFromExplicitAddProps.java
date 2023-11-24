package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.StringJsonSchema;
import org.openapijsonschematools.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.RequiredValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class ReqPropsFromExplicitAddProps {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties extends StringJsonSchema {}
    
    
    public static class ReqPropsFromExplicitAddPropsMap extends FrozenMap<String, String> {

        ReqPropsFromExplicitAddPropsMap(FrozenMap<String, String> m) {

            super(m);
        }
        public static ReqPropsFromExplicitAddPropsMap of(Map<String, String> arg, SchemaConfiguration configuration) {

            return ReqPropsFromExplicitAddProps1.validate(arg, configuration);
        }
        
        public String validName() {

            String key = "validName";
            return get(key);
        }
        
        public String getAdditionalProperty(String name) {

            schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
            val = self.get(name, schemas.unset)
            if isinstance(val, schemas.Unset):
                return val
            return typing.cast(
                String,
                val
            )
        }
    }    
    
    public class ReqPropsFromExplicitAddProps1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("required", new RequiredValidator(Set.of(
                "invalid-name",
                "validName"
            ))),
            new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
        ));
        protected static ReqPropsFromExplicitAddPropsMap getMapOutputInstance(FrozenMap<String, String> arg) {

            return new ReqPropsFromExplicitAddPropsMap(arg);
        }
        public static ReqPropsFromExplicitAddPropsMap validate(Map<String, String> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(ReqPropsFromExplicitAddProps1.class, arg, configuration);
        }
    }
}
