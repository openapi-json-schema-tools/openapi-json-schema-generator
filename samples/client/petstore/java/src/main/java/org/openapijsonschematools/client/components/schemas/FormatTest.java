package org.openapijsonschematools.client.components.schemas;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.DateJsonSchema;
import org.openapijsonschematools.client.schemas.DateTimeJsonSchema;
import org.openapijsonschematools.client.schemas.DoubleJsonSchema;
import org.openapijsonschematools.client.schemas.FloatJsonSchema;
import org.openapijsonschematools.client.schemas.Int32JsonSchema;
import org.openapijsonschematools.client.schemas.Int64JsonSchema;
import org.openapijsonschematools.client.schemas.NullJsonSchema;
import org.openapijsonschematools.client.schemas.NumberJsonSchema;
import org.openapijsonschematools.client.schemas.StringJsonSchema;
import org.openapijsonschematools.client.schemas.UuidJsonSchema;
import org.openapijsonschematools.client.schemas.validation.FormatValidator;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.ItemsValidator;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.validation.KeywordEntry;
import org.openapijsonschematools.client.schemas.validation.KeywordValidator;
import org.openapijsonschematools.client.schemas.validation.MaxLengthValidator;
import org.openapijsonschematools.client.schemas.validation.MaximumValidator;
import org.openapijsonschematools.client.schemas.validation.MinLengthValidator;
import org.openapijsonschematools.client.schemas.validation.MinimumValidator;
import org.openapijsonschematools.client.schemas.validation.MultipleOfValidator;
import org.openapijsonschematools.client.schemas.validation.PatternValidator;
import org.openapijsonschematools.client.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.client.schemas.validation.PropertyEntry;
import org.openapijsonschematools.client.schemas.validation.RequiredValidator;
import org.openapijsonschematools.client.schemas.validation.TypeValidator;
import org.openapijsonschematools.client.schemas.validation.UniqueItemsValidator;

public class FormatTest {
    // nest classes so all schemas and input/output classes can be public
    
    
    public static class IntegerSchema extends JsonSchema {
        public IntegerSchema() {
            keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
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
        }
        public int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return validateInt(arg, configuration);
        }
        
        public float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return validateFloat(arg, configuration);
        }
        
        public long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return validateLong(arg, configuration);
        }
        
        public double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return validateDouble(arg, configuration);
        }
    }    
    
    public static class Int32 extends Int32JsonSchema {}
    
    
    public static class Int32withValidations extends JsonSchema {
        public Int32withValidations() {
            keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
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
        }
        public int validate(int arg, SchemaConfiguration configuration) throws ValidationException {
            return validateInt(arg, configuration);
        }
        
        public float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return validateFloat(arg, configuration);
        }
        
        public long validate(long arg, SchemaConfiguration configuration) throws ValidationException {
            return validateLong(arg, configuration);
        }
        
        public double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return validateDouble(arg, configuration);
        }
    }    
    
    public static class Int64 extends Int64JsonSchema {}
    
    
    public static class NumberSchema extends JsonSchema {
        public NumberSchema() {
            keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
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
    
    public static class FloatSchema extends JsonSchema {
        public FloatSchema() {
            keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
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
        }
        public float validate(float arg, SchemaConfiguration configuration) throws ValidationException {
            return validateFloat(arg, configuration);
        }
    }    
    
    public static class Float32 extends FloatJsonSchema {}
    
    
    public static class DoubleSchema extends JsonSchema {
        public DoubleSchema() {
            keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
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
        }
        public double validate(double arg, SchemaConfiguration configuration) throws ValidationException {
            return validateDouble(arg, configuration);
        }
    }    
    
    public static class Float64 extends DoubleJsonSchema {}
    
    
    public static class Items extends NumberJsonSchema {}
    
    
    public static class ArrayWithUniqueItemsList extends FrozenList<Number> {
        ArrayWithUniqueItemsList(FrozenList<Number> m) {
            super(m);
        }
        public static ArrayWithUniqueItemsList of(List<Number> arg, SchemaConfiguration configuration) throws ValidationException {
            return JsonSchemaFactory.getInstance(ArrayWithUniqueItems.class).validate(arg, configuration);
        }
    }
    
    public class ArrayWithUniqueItemsListInput {
        // class to build List<Number>
    }
    
    
    public static class ArrayWithUniqueItems extends JsonSchema<FrozenMap, ArrayWithUniqueItemsList> {
        public ArrayWithUniqueItems() {
            keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
                new KeywordEntry("items", new ItemsValidator(Items.class)),
                new KeywordEntry("uniqueItems", new UniqueItemsValidator(true))
            ));
        }
        
        @Override
        protected ArrayWithUniqueItemsList getListOutputInstance(FrozenList<?> arg) {
            return new ArrayWithUniqueItemsList((FrozenList<Number>) arg);
        }
        public ArrayWithUniqueItemsList validate(List<Number> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateList(arg, configuration);
        }
    }    
    
    public static class StringSchema extends JsonSchema {
        public StringSchema() {
            keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    String.class
                ))),
                new KeywordEntry("pattern", new PatternValidator(Pattern.compile(
                    "[a-z]",
                    Pattern.CASE_INSENSITIVE
                )))
            ));
        }
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return validateString(arg, configuration);
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
        public Password() {
            keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    String.class
                ))),
                new KeywordEntry("format", new FormatValidator("password")),
                new KeywordEntry("maxLength", new MaxLengthValidator(64)),
                new KeywordEntry("minLength", new MinLengthValidator(10))
            ));
        }
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return validateString(arg, configuration);
        }
    }    
    
    public static class PatternWithDigits extends JsonSchema {
        public PatternWithDigits() {
            keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    String.class
                ))),
                new KeywordEntry("pattern", new PatternValidator(Pattern.compile(
                    "^\\d{10}$"
                )))
            ));
        }
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return validateString(arg, configuration);
        }
    }    
    
    public static class PatternWithDigitsAndDelimiter extends JsonSchema {
        public PatternWithDigitsAndDelimiter() {
            keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
                new KeywordEntry("type", new TypeValidator(Set.of(
                    String.class
                ))),
                new KeywordEntry("pattern", new PatternValidator(Pattern.compile(
                    "^image_\\d{1,3}$",
                    Pattern.CASE_INSENSITIVE
                )))
            ));
        }
        public String validate(String arg, SchemaConfiguration configuration) throws ValidationException {
            return validateString(arg, configuration);
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
            return JsonSchemaFactory.getInstance(FormatTest1.class).validate(arg, configuration);
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
    public class FormatTestMapInput {
        // Map<String, Object> because addProps is unset
    }
    
    
    public static class FormatTest1 extends JsonSchema<FormatTestMap, FrozenList> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public FormatTest1() {
            keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
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
        }
        
        @Override
        protected FormatTestMap getMapOutputInstance(FrozenMap<?, ?> arg) {
            return new FormatTestMap((FrozenMap<String, Object>) arg);
        }
        public FormatTestMap validate(Map<String, Object> arg, SchemaConfiguration configuration) throws ValidationException {
            return validateMap(arg, configuration);
        }
    }
}
