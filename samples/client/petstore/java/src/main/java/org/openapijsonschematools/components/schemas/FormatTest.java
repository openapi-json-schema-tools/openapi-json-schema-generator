package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.DateJsonSchema;
import org.openapijsonschematools.schemas.DateTimeJsonSchema;
import org.openapijsonschematools.schemas.DoubleJsonSchema;
import org.openapijsonschematools.schemas.FloatJsonSchema;
import org.openapijsonschematools.schemas.Int32JsonSchema;
import org.openapijsonschematools.schemas.Int64JsonSchema;
import org.openapijsonschematools.schemas.NullJsonSchema;
import org.openapijsonschematools.schemas.NumberJsonSchema;
import org.openapijsonschematools.schemas.StringJsonSchema;
import org.openapijsonschematools.schemas.UuidJsonSchema;
import org.openapijsonschematools.schemas.validation.FormatValidator;
import org.openapijsonschematools.schemas.validation.FrozenList;
import org.openapijsonschematools.schemas.validation.FrozenMap;
import org.openapijsonschematools.schemas.validation.ItemsValidator;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.validation.KeywordEntry;
import org.openapijsonschematools.schemas.validation.KeywordValidator;
import org.openapijsonschematools.schemas.validation.MaxLengthValidator;
import org.openapijsonschematools.schemas.validation.MaximumValidator;
import org.openapijsonschematools.schemas.validation.MinLengthValidator;
import org.openapijsonschematools.schemas.validation.MinimumValidator;
import org.openapijsonschematools.schemas.validation.MultipleOfValidator;
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.RequiredValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class FormatTest {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class IntegerSchema extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                Integer.class,
                Long.class,
                Float.class,
                Double.class
            ))),
            new KeywordEntry("maximum", new MaximumValidator(100)),
            new KeywordEntry("minimum", new MinimumValidator(10)),
            new KeywordEntry("multipleOf", new MultipleOfValidator(2))
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
    
    public static class Int32 extends Int32JsonSchema {}
    
    
    public static class Int32withValidations extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                Integer.class,
                Long.class,
                Float.class,
                Double.class
            ))),
            new KeywordEntry("format", new FormatValidator("int32")),
            new KeywordEntry("maximum", new MaximumValidator(200)),
            new KeywordEntry("minimum", new MinimumValidator(20))
        ));
        public static long validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(Int32withValidations.class, Long.valueOf(arg), configuration);
        }
        
        public static long validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(Int32withValidations.class, Long.parseLong(String.valueOf(arg)), configuration);
        }
        
        public static long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(Int32withValidations.class, arg, configuration);
        }
        
        public static long validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(Int32withValidations.class, Long.parseLong(String.valueOf(arg)), configuration);
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
            new KeywordEntry("maximum", new MaximumValidator(543.2)),
            new KeywordEntry("minimum", new MinimumValidator(32.1)),
            new KeywordEntry("multipleOf", new MultipleOfValidator(32.5))
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
            new KeywordEntry("maximum", new MaximumValidator(987.6)),
            new KeywordEntry("minimum", new MinimumValidator(54.3))
        ));
        public static float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(FloatSchema.class, arg, configuration);
        }
    }    
    
    public static class Float32 extends FloatJsonSchema {}
    
    
    public static class DoubleSchema extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                Integer.class,
                Long.class,
                Float.class,
                Double.class
            ))),
            new KeywordEntry("format", new FormatValidator("double")),
            new KeywordEntry("maximum", new MaximumValidator(123.4)),
            new KeywordEntry("minimum", new MinimumValidator(67.8))
        ));
        public static double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(DoubleSchema.class, arg, configuration);
        }
    }    
    
    public static class Float64 extends DoubleJsonSchema {}
    
    
    public static class Items extends NumberJsonSchema {}
    
    
    public static class ArrayWithUniqueItemsList extends FrozenList<Number> {
        ArrayWithUniqueItemsList(FrozenList<Number> m) {
            super(m);
        }
        public static ArrayWithUniqueItemsList of(List<Number> arg, SchemaConfiguration configuration) throws ValidationException {
            return ArrayWithUniqueItems.validate(arg, configuration);
        }
    }
    
    
    public static class ArrayWithUniqueItems extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
            new KeywordEntry("items", new ItemsValidator(Items.class))
        ));
        protected static ArrayWithUniqueItemsList getListOutputInstance(FrozenList<Number> arg) {
            return new ArrayWithUniqueItemsList(arg);
        }
        public static ArrayWithUniqueItemsList validate(List<Number> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(ArrayWithUniqueItems.class, arg, configuration);
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
    
    public static class ByteSchema extends StringJsonSchema {}
    
    
    public static class Binary extends JsonSchema {
        // BinarySchema
    }
    
    
    public static class Date extends DateJsonSchema {}
    
    
    public static class DateTime extends DateTimeJsonSchema {}
    
    
    public static class UuidSchema extends UuidJsonSchema {}
    
    
    public static class UuidNoExample extends UuidJsonSchema {}
    
    
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
    
    public static class PatternWithDigits extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                String.class
            )))
        ));
        public static String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(PatternWithDigits.class, arg, configuration);
        }
    }    
    
    public static class PatternWithDigitsAndDelimiter extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                String.class
            )))
        ));
        public static String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(PatternWithDigitsAndDelimiter.class, arg, configuration);
        }
    }    
    
    public static class NoneProp extends NullJsonSchema {}
    
    
    public static class FormatTestMap extends FrozenMap<String, Object> {
        FormatTestMap(FrozenMap<String, Object> m) {
            super(m);
        }
        public static final Set<String> requiredKeys = Set.of(
            "byte",
            "date",
            "number",
            "password"
        );
        public static final Set<String> optionalKeys = Set.of(
            "integer",
            "int32",
            "int32withValidations",
            "int64",
            "float",
            "float32",
            "double",
            "float64",
            "arrayWithUniqueItems",
            "string",
            "binary",
            "dateTime",
            "uuid",
            "uuidNoExample",
            "pattern_with_digits",
            "pattern_with_digits_and_delimiter",
            "noneProp"
        );
        public static FormatTestMap of(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return FormatTest1.validate(arg, configuration);
        }
        
        public String date() {
            return (String) get("date");
        }
        
        public String password() {
            return (String) get("password");
        }
        
        public int int32() {
            String key = "int32";
            throwIfKeyNotPresent(key);
            return (int) get(key);
        }
        
        public int int32withValidations() {
            String key = "int32withValidations";
            throwIfKeyNotPresent(key);
            return (int) get(key);
        }
        
        public long int64() {
            String key = "int64";
            throwIfKeyNotPresent(key);
            return (long) get(key);
        }
        
        public float float32() {
            String key = "float32";
            throwIfKeyNotPresent(key);
            return (float) get(key);
        }
        
        public double float64() {
            String key = "float64";
            throwIfKeyNotPresent(key);
            return (double) get(key);
        }
        
        public ArrayWithUniqueItemsList arrayWithUniqueItems() {
            String key = "arrayWithUniqueItems";
            throwIfKeyNotPresent(key);
            return (ArrayWithUniqueItemsList) get(key);
        }
        
        public String binary() {
            String key = "binary";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public String dateTime() {
            String key = "dateTime";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public String uuidNoExample() {
            String key = "uuidNoExample";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public String pattern_with_digits() {
            String key = "pattern_with_digits";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public String pattern_with_digits_and_delimiter() {
            String key = "pattern_with_digits_and_delimiter";
            throwIfKeyNotPresent(key);
            return (String) get(key);
        }
        
        public Void noneProp() {
            String key = "noneProp";
            throwIfKeyNotPresent(key);
            return (Void) get(key);
        }
        
        public Object getAdditionalProperty(String name) {
            throwIfKeyKnown(name, requiredKeys, optionalKeys);
            throwIfKeyNotPresent(name);
            return get(name);
        }
    }    
    
    public static class FormatTest1 extends JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
            new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
                new PropertyEntry("integer", IntegerSchema.class),
                new PropertyEntry("int32", Int32.class),
                new PropertyEntry("int32withValidations", Int32withValidations.class),
                new PropertyEntry("int64", Int64.class),
                new PropertyEntry("number", NumberSchema.class),
                new PropertyEntry("float", FloatSchema.class),
                new PropertyEntry("float32", Float32.class),
                new PropertyEntry("double", DoubleSchema.class),
                new PropertyEntry("float64", Float64.class),
                new PropertyEntry("arrayWithUniqueItems", ArrayWithUniqueItems.class),
                new PropertyEntry("string", StringSchema.class),
                new PropertyEntry("byte", ByteSchema.class),
                new PropertyEntry("binary", Binary.class),
                new PropertyEntry("date", Date.class),
                new PropertyEntry("dateTime", DateTime.class),
                new PropertyEntry("uuid", UuidSchema.class),
                new PropertyEntry("uuidNoExample", UuidNoExample.class),
                new PropertyEntry("password", Password.class),
                new PropertyEntry("pattern_with_digits", PatternWithDigits.class),
                new PropertyEntry("pattern_with_digits_and_delimiter", PatternWithDigitsAndDelimiter.class),
                new PropertyEntry("noneProp", NoneProp.class)
            ))),
            
            new KeywordEntry("required", new RequiredValidator(Set.of(
                "byte",
                "date",
                "number",
                "password"
            )))
            
        ));
        protected static FormatTestMap getMapOutputInstance(FrozenMap<String, Object> arg) {
            return new FormatTestMap(arg);
        }
        public static FormatTestMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchema.validate(FormatTest1.class, arg, configuration);
        }
    }
}
