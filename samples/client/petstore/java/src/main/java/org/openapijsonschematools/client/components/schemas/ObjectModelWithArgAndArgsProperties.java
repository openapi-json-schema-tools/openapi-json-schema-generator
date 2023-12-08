package org.openapijsonschematools.client.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
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

public class ObjectModelWithArgAndArgsProperties {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Arg extends StringJsonSchema {}
    
    
    public static class Args extends StringJsonSchema {}
    
    
    public static class ObjectModelWithArgAndArgsPropertiesMap extends FrozenMap<String, Object> {
        ObjectModelWithArgAndArgsPropertiesMap(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "arg",
            "args"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static ObjectModelWithArgAndArgsPropertiesMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(ObjectModelWithArgAndArgsProperties1.class).validate(arg, configuration);
        }
        
        public String arg() {
            return (String) get("arg");
        }
        
        public String args() {
            return (String) get("args");
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public class ObjectModelWithArgAndArgsPropertiesMapInput {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class ObjectModelWithArgAndArgsProperties1 extends JsonSchema<ObjectModelWithArgAndArgsPropertiesMap, FrozenList> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public ObjectModelWithArgAndArgsProperties1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("arg", Arg.class),
                    new PropertyEntry("args", Args.class)
                ))),
                new KeywordEntry("required", new RequiredValidator(Set.of(
                    "arg",
                    "args"
                )))
            )));
        }
        
        @Override
        protected ObjectModelWithArgAndArgsPropertiesMap getMapOutputInstance(FrozenMap<?, ?> arg) {
            return new ObjectModelWithArgAndArgsPropertiesMap((FrozenMap<String, Object>) arg);
        }
        public ObjectModelWithArgAndArgsPropertiesMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
}
