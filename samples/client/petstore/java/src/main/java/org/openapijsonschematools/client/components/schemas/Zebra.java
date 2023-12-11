package org.openapijsonschematools.client.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;
import org.openapijsonschematools.client.schemas.SetMaker;
import org.openapijsonschematools.client.schemas.validation.AdditionalPropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.EnumValidator;
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

public class Zebra {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class AdditionalProperties extends AnyTypeJsonSchema {}
    
    
    public static class Type extends JsonSchema<Object, Object, FrozenMap<String, Object>, Object, Object, FrozenList<Object>> {
        public Type() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    String.class
                ))),
                new KeywordEntry("enum", new EnumValidator(SetMaker.makeSet(
                    "plains",
                    "mountain",
                    "grevys"
                )))
            )));
        }
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return validateString(arg, configuration);
        }
    }    
    
    public static class ClassName extends JsonSchema<Object, Object, FrozenMap<String, Object>, Object, Object, FrozenList<Object>> {
        public ClassName() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    String.class
                ))),
                new KeywordEntry("enum", new EnumValidator(SetMaker.makeSet(
                    "zebra"
                )))
            )));
        }
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return validateString(arg, configuration);
        }
    }    
    
    public static class ZebraMap extends FrozenMap<String, Object> {
        ZebraMap(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "className"
        );
        public static final Set<String> optionalKeys = Set.of(
            "type"
        );
        public static ZebraMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(Zebra1.class).validate(arg, configuration);
        }
        
        public String className() {
            return (String) get("className");
        }
        
        public String type() {
            String key = "type";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public class ZebraMapInput {
        // Map<String, Object> because additionalProperties == true
    }
    
    
    public static class Zebra1 extends JsonSchema<Object, Object, ZebraMap, Object, Object, FrozenList<Object>> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public Zebra1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("type", Type.class),
                    new PropertyEntry("className", ClassName.class)
                ))),
                new KeywordEntry("required", new RequiredValidator(Set.of(
                    "className"
                ))),
                new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
            )));
        }
        
        @Override
        protected ZebraMap getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new ZebraMap(arg);
        }
        public ZebraMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
}
