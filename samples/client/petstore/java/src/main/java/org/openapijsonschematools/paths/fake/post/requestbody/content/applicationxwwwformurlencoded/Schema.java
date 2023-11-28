package org.openapijsonschematools.paths.fake.post.requestbody.content.applicationxwwwformurlencoded;
import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.DateJsonSchema;
import org.openapijsonschematools.schemas.Int64JsonSchema;
import org.openapijsonschematools.schemas.StringJsonSchema;
import org.openapijsonschematools.schemas.validation.FormatValidator;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.MaxLengthValidator;
import org.openapijsonschematools.schemas.validation.MaximumValidator;
import org.openapijsonschematools.schemas.validation.MinLengthValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.RequiredValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class IntegerSchema extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                Integer.class,
                Long.class,
                Float.class,
                Double.class
            ))),
            new KeywordEntry("maximum", new MaximumValidator(100))
        ));
        public static long validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(IntegerSchema.class, Long.valueOf(arg), configuration);
        }
        
        public static long validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(IntegerSchema.class, Long.parseLong(String.valueOf(arg)), configuration);
        }
        
        public static long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(IntegerSchema.class, arg, configuration);
        }
        
        public static long validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(IntegerSchema.class, Long.parseLong(String.valueOf(arg)), configuration);
        }
    }    
    
    public static class Int32 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                Integer.class,
                Long.class,
                Float.class,
                Double.class
            ))),
            new KeywordEntry("format", new FormatValidator("int32")),
            new KeywordEntry("maximum", new MaximumValidator(200))
        ));
        public static long validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(Int32.class, Long.valueOf(arg), configuration);
        }
        
        public static long validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(Int32.class, Long.parseLong(String.valueOf(arg)), configuration);
        }
        
        public static long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(Int32.class, arg, configuration);
        }
        
        public static long validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(Int32.class, Long.parseLong(String.valueOf(arg)), configuration);
        }
    }    
    
    public static class Int64 extends Int64JsonSchema {}
    
    
    public static class NumberSchema extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                Integer.class,
                Long.class,
                Float.class,
                Double.class
            ))),
            new KeywordEntry("maximum", new MaximumValidator(543.2))
        ));
        public static Number validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(NumberSchema.class, arg, configuration);
        }
        
        public static Number validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(NumberSchema.class, arg, configuration);
        }
        
        public static Number validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(NumberSchema.class, arg, configuration);
        }
        
        public static Number validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(NumberSchema.class, arg, configuration);
        }
    }    
    
    public static class FloatSchema extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                Integer.class,
                Long.class,
                Float.class,
                Double.class
            ))),
            new KeywordEntry("format", new FormatValidator("float")),
            new KeywordEntry("maximum", new MaximumValidator(987.6))
        ));
        public static float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(FloatSchema.class, arg, configuration);
        }
    }    
    
    public static class DoubleSchema extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                Integer.class,
                Long.class,
                Float.class,
                Double.class
            ))),
            new KeywordEntry("format", new FormatValidator("double")),
            new KeywordEntry("maximum", new MaximumValidator(123.4))
        ));
        public static double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(DoubleSchema.class, arg, configuration);
        }
    }    
    
    public static class StringSchema extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                String.class
            )))
        ));
        public static String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(StringSchema.class, arg, configuration);
        }
    }    
    
    public static class PatternWithoutDelimiter extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                String.class
            )))
        ));
        public static String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(PatternWithoutDelimiter.class, arg, configuration);
        }
    }    
    
    public static class ByteSchema extends StringJsonSchema {}
    
    
    public static class Binary extends JsonSchema {
        // BinarySchema
    }
    
    
    public static class Date extends DateJsonSchema {}
    
    
    public static class DateTime extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                String.class
            ))),
            new KeywordEntry("format", new FormatValidator("date-time"))
        ));
        public static String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(DateTime.class, arg, configuration);
        }
    }    
    
    public static class Password extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                String.class
            ))),
            new KeywordEntry("format", new FormatValidator("password")),
            new KeywordEntry("maxLength", new MaxLengthValidator(64)),
            new KeywordEntry("minLength", new MinLengthValidator(10))
        ));
        public static String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(Password.class, arg, configuration);
        }
    }    
    
    public static class Callback extends StringJsonSchema {}
    
    
    public static class SchemaMap extends FrozenMap<String, Object> {
        SchemaMap(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "byte",
            "double",
            "number",
            "pattern_without_delimiter"
        );
        public static final Set<String> optionalKeys = Set.of(
            "integer",
            "int32",
            "int64",
            "float",
            "string",
            "binary",
            "date",
            "dateTime",
            "password",
            "callback"
        );
        public static SchemaMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return Schema1.validate(arg, configuration);
        }
        
        public String pattern_without_delimiter() {
            return (String) get("pattern_without_delimiter");
        }
        
        public int int32() {
            String key = "int32";
            throwIfKeyNotPresent(key);
            return (int) get(key);
        }
        
        public long int64() {
            String key = "int64";
            throwIfKeyNotPresent(key);
            return (long) get(key);
        }
        
        public String binary() {
            String key = "binary";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public String date() {
            String key = "date";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public String dateTime() {
            String key = "dateTime";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public String password() {
            String key = "password";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public String callback() {
            String key = "callback";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }    
    
    public static class Schema1 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("integer", IntegerSchema.class),
                new PropertyEntry("int32", Int32.class),
                new PropertyEntry("int64", Int64.class),
                new PropertyEntry("number", NumberSchema.class),
                new PropertyEntry("float", FloatSchema.class),
                new PropertyEntry("double", DoubleSchema.class),
                new PropertyEntry("string", StringSchema.class),
                new PropertyEntry("pattern_without_delimiter", PatternWithoutDelimiter.class),
                new PropertyEntry("byte", ByteSchema.class),
                new PropertyEntry("binary", Binary.class),
                new PropertyEntry("date", Date.class),
                new PropertyEntry("dateTime", DateTime.class),
                new PropertyEntry("password", Password.class),
                new PropertyEntry("callback", Callback.class)
            ))),
            
            new KeywordEntry("required", new RequiredValidator(Set.of(
                "byte",
                "double",
                "number",
                "pattern_without_delimiter"
            )))
            
        ));
        protected static SchemaMap getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new SchemaMap(arg);
        }
        public static SchemaMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(Schema1.class, arg, configuration);
        }
    }
}
