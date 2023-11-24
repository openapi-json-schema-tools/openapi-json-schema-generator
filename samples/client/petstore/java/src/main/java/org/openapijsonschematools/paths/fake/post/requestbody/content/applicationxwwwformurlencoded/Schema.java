package org.openapijsonschematools.paths.fake.post.requestbody.content.applicationxwwwformurlencoded;
import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.DateJsonSchema;
import org.openapijsonschematools.schemas.Int64JsonSchema;
import org.openapijsonschematools.schemas.StringJsonSchema;
import org.openapijsonschematools.schemas.validation.FormatValidator;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.RequiredValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class Schema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class IntegerSchema extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                Integer.class,
                Long.class,
                Float.class,
                Double.class
            )))
        ));
        public static long validate(int arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(IntegerSchema.class, Long.valueOf(arg), configuration);
        }
        
        public static long validate(float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(IntegerSchema.class, Long.parseLong(String.valueOf(arg)), configuration);
        }
        
        public static long validate(long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(IntegerSchema.class, arg, configuration);
        }
        
        public static long validate(double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(IntegerSchema.class, Long.parseLong(String.valueOf(arg)), configuration);
        }
    }    
    
    public class Int32 extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                Integer.class,
                Long.class,
                Float.class,
                Double.class
            ))),
            new KeywordEntry("format", new FormatValidator("int32"))
        ));
        public static long validate(int arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Int32.class, Long.valueOf(arg), configuration);
        }
        
        public static long validate(float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Int32.class, Long.parseLong(String.valueOf(arg)), configuration);
        }
        
        public static long validate(long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Int32.class, arg, configuration);
        }
        
        public static long validate(double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Int32.class, Long.parseLong(String.valueOf(arg)), configuration);
        }
    }    
    
    public class Int64 extends Int64JsonSchema {}
    
    
    public class NumberSchema extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                Integer.class,
                Long.class,
                Float.class,
                Double.class
            )))
        ));
        public static Number validate(int arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(NumberSchema.class, arg, configuration);
        }
        
        public static Number validate(long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(NumberSchema.class, arg, configuration);
        }
        
        public static Number validate(float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(NumberSchema.class, arg, configuration);
        }
        
        public static Number validate(double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(NumberSchema.class, arg, configuration);
        }
    }    
    
    public class FloatSchema extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                Integer.class,
                Long.class,
                Float.class,
                Double.class
            ))),
            new KeywordEntry("format", new FormatValidator("float"))
        ));
        public static float validate(float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(FloatSchema.class, arg, configuration);
        }
    }    
    
    public class DoubleSchema extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                Integer.class,
                Long.class,
                Float.class,
                Double.class
            ))),
            new KeywordEntry("format", new FormatValidator("double"))
        ));
        public static double validate(double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(DoubleSchema.class, arg, configuration);
        }
    }    
    
    public class StringSchema extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                String.class
            )))
        ));
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(StringSchema.class, arg, configuration);
        }
    }    
    
    public class PatternWithoutDelimiter extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                String.class
            )))
        ));
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(PatternWithoutDelimiter.class, arg, configuration);
        }
    }    
    
    public class ByteSchema extends StringJsonSchema {}
    
    
    public class Binary extends JsonSchema {
        // BinarySchema
    }
    
    
    public class Date extends DateJsonSchema {}
    
    
    public class DateTime extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                String.class
            ))),
            new KeywordEntry("format", new FormatValidator("date-time"))
        ));
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(DateTime.class, arg, configuration);
        }
    }    
    
    public class Password extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                String.class
            ))),
            new KeywordEntry("format", new FormatValidator("password"))
        ));
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Password.class, arg, configuration);
        }
    }    
    
    public class Callback extends StringJsonSchema {}
    
    
    public static class SchemaMap extends FrozenMap<String, Object> {

        SchemaMap(FrozenMap<String, Object> m) {

            super(m);
        }
        public static SchemaMap of(Map<String, Object> arg, SchemaConfiguration configuration) {

            return Schema1.validate(arg, configuration);
        }
        
        public String pattern_without_delimiter() {

            String key = "pattern_without_delimiter";
            return String get(key);

        }
        
        public int int32() {

            String key = "int32";
            if (!containsKey(key)) {
                throw new RuntimeException("int32 is unset");
            }
            return int get(key);

        }
        
        public long int64() {

            String key = "int64";
            if (!containsKey(key)) {
                throw new RuntimeException("int64 is unset");
            }
            return long get(key);

        }
        
        public String binary() {

            String key = "binary";
            if (!containsKey(key)) {
                throw new RuntimeException("binary is unset");
            }
            return String get(key);

        }
        
        public String date() {

            String key = "date";
            if (!containsKey(key)) {
                throw new RuntimeException("date is unset");
            }
            return String get(key);

        }
        
        public String dateTime() {

            String key = "dateTime";
            if (!containsKey(key)) {
                throw new RuntimeException("dateTime is unset");
            }
            return String get(key);

        }
        
        public String password() {

            String key = "password";
            if (!containsKey(key)) {
                throw new RuntimeException("password is unset");
            }
            return String get(key);

        }
        
        public String callback() {

            String key = "callback";
            if (!containsKey(key)) {
                throw new RuntimeException("callback is unset");
            }
            return String get(key);

        }
        
        public Object getAdditionalProperty(String name) {
            schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
            return self.get(name, schemas.unset)
        }
    }    
    
    public class Schema1 extends JsonSchema {
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
        public static SchemaMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(Schema1.class, arg, configuration);
        }
    }
}
