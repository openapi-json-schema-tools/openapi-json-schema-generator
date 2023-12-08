package org.openapijsonschematools.client.components.schemas;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.OneOfValidator;
import org.openapijsonschematools.client.schemas.validation.RequiredValidator;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;

public class OneofWithRequired {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Schema0Map extends FrozenMap<String, Object> {
        Schema0Map(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "bar",
            "foo"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static Schema0Map of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(Schema0.class).validate(arg, configuration);
        }
        
        public Object bar() {
            return get("bar");
        }
        
        public Object foo() {
            return get("foo");
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public class Schema0MapInput {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class Schema0 extends JsonSchema<Schema0Map, FrozenList> {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("required", new RequiredValidator(Set.of(
                "bar",
                "foo"
            )))
        ));
        
        @Override
        protected Schema0Map getMapOutputInstance(FrozenMap<?, ?> arg) {
            return new Schema0Map((FrozenMap<String, Object>) arg);
        }
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return validateVoid(arg, configuration);
        }
        
        public boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return validateBoolean(arg, configuration);
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
        
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return validateString(arg, configuration);
        }
        
        public String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return validateZonedDateTime(arg, configuration);
        }
        
        public String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return validateLocalDate(arg, configuration);
        }
        
        public String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return validateUUID(arg, configuration);
        }
        
        public Schema0Map validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
        
        public FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }    
    
    public static class Schema1Map extends FrozenMap<String, Object> {
        Schema1Map(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "baz",
            "foo"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static Schema1Map of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(Schema1.class).validate(arg, configuration);
        }
        
        public Object baz() {
            return get("baz");
        }
        
        public Object foo() {
            return get("foo");
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }
    public class Schema1MapInput {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class Schema1 extends JsonSchema<Schema1Map, FrozenList> {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("required", new RequiredValidator(Set.of(
                "baz",
                "foo"
            )))
        ));
        
        @Override
        protected Schema1Map getMapOutputInstance(FrozenMap<?, ?> arg) {
            return new Schema1Map((FrozenMap<String, Object>) arg);
        }
        public Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return validateVoid(arg, configuration);
        }
        
        public boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return validateBoolean(arg, configuration);
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
        
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return validateString(arg, configuration);
        }
        
        public String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return validateZonedDateTime(arg, configuration);
        }
        
        public String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return validateLocalDate(arg, configuration);
        }
        
        public String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return validateUUID(arg, configuration);
        }
        
        public Schema1Map validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
        
        public FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }    
    
    public static class OneofWithRequired1 extends JsonSchema<FrozenMap, FrozenList> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("oneOf", new OneOfValidator(List.of(
                Schema0.class,
                Schema1.class
            )))
        ));
        public FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
}
