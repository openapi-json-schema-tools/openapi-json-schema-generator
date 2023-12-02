package org.openapijsonschematools.client.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
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
            return ObjectModelWithArgAndArgsProperties1.validate(arg, configuration);
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
    
    public static class ObjectModelWithArgAndArgsProperties1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("arg", Arg.class),
                new PropertyEntry("args", Args.class)
            ))),
            new KeywordEntry("required", new RequiredValidator(Set.of(
                "arg",
                "args"
            )))
        ));
        
        protected static ObjectModelWithArgAndArgsPropertiesMap getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new ObjectModelWithArgAndArgsPropertiesMap(arg);
        }
        public static ObjectModelWithArgAndArgsPropertiesMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateMap(ObjectModelWithArgAndArgsProperties1.class, arg, configuration);
        }
    }
}