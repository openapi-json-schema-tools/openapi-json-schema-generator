package org.openapijsonschematools.client.components.schemas;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.validation.AnyOfValidator;
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

public class AbstractStepMessage {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Discriminator extends StringJsonSchema {}
    
    
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
        public static AbstractStepMessageMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(AbstractStepMessage1.class).validate(arg, configuration);
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
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public class AbstractStepMessageMapInput {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class AbstractStepMessage1 extends JsonSchema<Object, AbstractStepMessageMap, Object, FrozenList<Object>> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
    
        Abstract Step
        */
        public AbstractStepMessage1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("discriminator", Discriminator.class)
                ))),
                new KeywordEntry("required", new RequiredValidator(Set.of(
                    "description",
                    "discriminator",
                    "sequenceNumber"
                ))),
                new KeywordEntry("anyOf", new AnyOfValidator(List.of(
                    AbstractStepMessage1.class
                )))
            )));
        }
        
        @Override
        protected AbstractStepMessageMap getMapOutputInstance(FrozenMap<String, ?> arg) {
            return new AbstractStepMessageMap((FrozenMap<String, Object>) arg);
        }
        public AbstractStepMessageMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
}
