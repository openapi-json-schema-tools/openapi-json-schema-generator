package org.openapijsonschematools.components.schemas;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.IntJsonSchema;
import org.openapijsonschematools.schemas.StringJsonSchema;
import org.openapijsonschematools.schemas.validation.FrozenList;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.OneOfValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.RequiredValidator;

public class OneofComplexTypes {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class Bar extends IntJsonSchema {}
    
    
    public static class Schema0Map extends FrozenMap<String, Object> {
        Schema0Map(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "bar"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static Schema0Map of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return Schema0.validate(arg, configuration);
        }
        
        public long bar() {
            return (long) get("bar");
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }    
    
    public static class Schema0 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("bar", Bar.class)
            ))),
            new KeywordEntry("required", new RequiredValidator(Set.of(
                "bar"
            )))
        ));
        
        protected static Schema0Map getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new Schema0Map(arg);
        }
        public static Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateVoid(Schema0.class, arg, configuration);
        }
        
        public static boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateBoolean(Schema0.class, arg, configuration);
        }
        
        public static int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateInt(Schema0.class, arg, configuration);
        }
        
        public static long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateLong(Schema0.class, arg, configuration);
        }
        
        public static float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateFloat(Schema0.class, arg, configuration);
        }
        
        public static double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateDouble(Schema0.class, arg, configuration);
        }
        
        public static String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateString(Schema0.class, arg, configuration);
        }
        
        public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateZonedDateTime(Schema0.class, arg, configuration);
        }
        
        public static String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateLocalDate(Schema0.class, arg, configuration);
        }
        
        public static String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateUUID(Schema0.class, arg, configuration);
        }
        
        public static Schema0Map validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateMap(Schema0.class, arg, configuration);
        }
        
        public static FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateList(Schema0.class, arg, configuration);
        }
    }    
    
    public static class Foo extends StringJsonSchema {}
    
    
    public static class Schema1Map extends FrozenMap<String, Object> {
        Schema1Map(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "foo"
        );
        public static final Set<String> optionalKeys = Set.of();
        public static Schema1Map of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return Schema1.validate(arg, configuration);
        }
        
        public String foo() {
            return (String) get("foo");
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }    
    
    public static class Schema1 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("foo", Foo.class)
            ))),
            new KeywordEntry("required", new RequiredValidator(Set.of(
                "foo"
            )))
        ));
        
        protected static Schema1Map getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new Schema1Map(arg);
        }
        public static Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateVoid(Schema1.class, arg, configuration);
        }
        
        public static boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateBoolean(Schema1.class, arg, configuration);
        }
        
        public static int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateInt(Schema1.class, arg, configuration);
        }
        
        public static long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateLong(Schema1.class, arg, configuration);
        }
        
        public static float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateFloat(Schema1.class, arg, configuration);
        }
        
        public static double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateDouble(Schema1.class, arg, configuration);
        }
        
        public static String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateString(Schema1.class, arg, configuration);
        }
        
        public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateZonedDateTime(Schema1.class, arg, configuration);
        }
        
        public static String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateLocalDate(Schema1.class, arg, configuration);
        }
        
        public static String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateUUID(Schema1.class, arg, configuration);
        }
        
        public static Schema1Map validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateMap(Schema1.class, arg, configuration);
        }
        
        public static FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateList(Schema1.class, arg, configuration);
        }
    }    
    
    public static class OneofComplexTypes1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("oneOf", new OneOfValidator(List.of(
                Schema0.class,
                Schema1.class
            )))
        ));
        public static Void validate(Void arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateVoid(OneofComplexTypes1.class, arg, configuration);
        }
        
        public static boolean validate(boolean arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateBoolean(OneofComplexTypes1.class, arg, configuration);
        }
        
        public static int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateInt(OneofComplexTypes1.class, arg, configuration);
        }
        
        public static long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateLong(OneofComplexTypes1.class, arg, configuration);
        }
        
        public static float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateFloat(OneofComplexTypes1.class, arg, configuration);
        }
        
        public static double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateDouble(OneofComplexTypes1.class, arg, configuration);
        }
        
        public static String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateString(OneofComplexTypes1.class, arg, configuration);
        }
        
        public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateZonedDateTime(OneofComplexTypes1.class, arg, configuration);
        }
        
        public static String validate(LocalDate arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateLocalDate(OneofComplexTypes1.class, arg, configuration);
        }
        
        public static String validate(UUID arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateUUID(OneofComplexTypes1.class, arg, configuration);
        }
        
        public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateMap(OneofComplexTypes1.class, arg, configuration);
        }
        
        public static FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validateList(OneofComplexTypes1.class, arg, configuration);
        }
    }}
