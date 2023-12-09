package org.openapijsonschematools.client.components.schemas;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.MaximumValidator;
import org.openapijsonschematools.client.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Alpha extends JsonSchema {
        public Alpha() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    Integer.class,
                    Long.class,
                    Float.class,
                    Double.class
                ))),
                new KeywordEntry("maximum", new MaximumValidator(3))
            )));
        }
        public int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return validateInt(arg, configuration);
        }
        
        public long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return validateLong(arg, configuration);
        }
        
        public float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return validateFloat(arg, configuration);
        }
        
        public double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return validateDouble(arg, configuration);
        }
    }    
    
    public static class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap extends FrozenMap<String, Object> {
        TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of();
        public static final Set<String> optionalKeys = Set.of(
            "alpha"
        );
        public static TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1.class).validate(arg, configuration);
        }
        
        public Number alpha() {
            String key = "alpha";
            throwIfKeyNotPresent(key);
            return (Number) get(key);
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapInput {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1 extends JsonSchema<Object, TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap, Object, FrozenList<Object>> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1() {
            super(new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
                new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                    new PropertyEntry("alpha", Alpha.class)
                )))
            )));
        }
        
        @Override
        protected TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap getMapOutputInstance(FrozenMap<String, ?> arg) {
            return new TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap((FrozenMap<String, Object>) arg);
        }
        public TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
}
