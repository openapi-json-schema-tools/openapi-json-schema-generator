package org.openapijsonschematools.client.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.BooleanJsonSchema;
import org.openapijsonschematools.client.schemas.validation.EnumValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.RequiredValidator;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class Whale {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class HasBaleen extends BooleanJsonSchema {}
    
    
    public static class HasTeeth extends BooleanJsonSchema {}
    
    
    public static class ClassName extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                String.class
            ))),
            new KeywordEntry("enum", new EnumValidator(Set.of(
                "whale"
            )))
        ));
        public static String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateString(ClassName.class, arg, configuration);
        }
    }    
    
    public static class WhaleMap extends FrozenMap<String, Object> {
        WhaleMap(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "className"
        );
        public static final Set<String> optionalKeys = Set.of(
            "hasBaleen",
            "hasTeeth"
        );
        public static WhaleMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return Whale1.validate(arg, configuration);
        }
        
        public String className() {
            return (String) get("className");
        }
        
        public boolean hasBaleen() {
            String key = "hasBaleen";
            throwIfKeyNotPresent(key);
            return (boolean) get(key);
        }
        
        public boolean hasTeeth() {
            String key = "hasTeeth";
            throwIfKeyNotPresent(key);
            return (boolean) get(key);
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }    
    
    public static class Whale1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("hasBaleen", HasBaleen.class),
                new PropertyEntry("hasTeeth", HasTeeth.class),
                new PropertyEntry("className", ClassName.class)
            ))),
            new KeywordEntry("required", new RequiredValidator(Set.of(
                "className"
            )))
        ));
        
        protected static WhaleMap getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new WhaleMap(arg);
        }
        public static WhaleMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateMap(Whale1.class, arg, configuration);
        }
    }
}