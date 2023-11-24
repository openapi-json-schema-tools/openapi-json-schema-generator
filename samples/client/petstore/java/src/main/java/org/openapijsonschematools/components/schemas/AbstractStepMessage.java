package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.StringJsonSchema;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.RequiredValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class AbstractStepMessage {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class Discriminator extends StringJsonSchema {}
    
    
    public static class AbstractStepMessageMap extends FrozenMap<String, Object> {

        AbstractStepMessageMap(FrozenMap<String, Object> m) {

            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "description",
            "discriminator",
            "sequenceNumber"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static AbstractStepMessageMap of(Map<String, Object> arg, SchemaConfiguration configuration) {

            return AbstractStepMessage1.validate(arg, configuration);
        }
        
        public Object description() {
            return get("description");
        }
        
        public String discriminator() {

            return (String) get("discriminator");

        }
        
        public Object sequenceNumber() {
            return get("sequenceNumber");
        }
        
        public Object getAdditionalProperty(String name) {
            schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
            return self.get(name, schemas.unset)
        }
    }    
    
    public class AbstractStepMessage1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
    
        Abstract Step
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("discriminator", Discriminator.class)
            ))),
            new KeywordEntry("required", new RequiredValidator(Set.of(
                "description",
                "discriminator",
                "sequenceNumber"
            )))
        ));
        protected static AbstractStepMessageMap getMapOutputInstance(FrozenMap<String, Object> arg) {

            return new AbstractStepMessageMap(arg);
        }
        public static AbstractStepMessageMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(AbstractStepMessage1.class, arg, configuration);
        }
    }
}
