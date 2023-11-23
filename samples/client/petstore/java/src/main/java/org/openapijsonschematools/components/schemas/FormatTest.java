package org.openapijsonschematools.components.schemas;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
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
import org.openapijsonschematools.schemas.validation.PropertiesValidator;
import org.openapijsonschematools.schemas.validation.PropertyEntry;
import org.openapijsonschematools.schemas.validation.RequiredValidator;
import org.openapijsonschematools.schemas.validation.TypeValidator;

public class FormatTest {
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
    
    public class Int32 extends Int32JsonSchema {}
    
    
    public class Int32withValidations extends JsonSchema {
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
            return JsonSchema.validate(Int32withValidations.class, Long.valueOf(arg), configuration);
        }
        
        public static long validate(float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Int32withValidations.class, Long.parseLong(String.valueOf(arg)), configuration);
        }
        
        public static long validate(long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Int32withValidations.class, arg, configuration);
        }
        
        public static long validate(double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Int32withValidations.class, Long.parseLong(String.valueOf(arg)), configuration);
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
    
    public class Float32 extends FloatJsonSchema {}
    
    
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
    
    public class Float64 extends DoubleJsonSchema {}
    
    
    public class Items extends NumberJsonSchema {}
    
    
    public static class ArrayWithUniqueItemsList extends FrozenList<Number> {

        ArrayWithUniqueItemsList(FrozenList<Number> m) {

            super(m);
        }
        public static ArrayWithUniqueItemsList of(List<Number> arg, SchemaConfiguration configuration) {

            return ArrayWithUniqueItems.validate(arg, configuration);
        }
    }
    
    
    public class ArrayWithUniqueItems extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),
            new KeywordEntry("items", new ItemsValidator(Items.class))
        ));
        protected static ArrayWithUniqueItemsList getListOutputInstance(FrozenList<Number> arg) {

            return new ArrayWithUniqueItemsList(arg);
        }
        public static ArrayWithUniqueItemsList validate(List<Number> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(ArrayWithUniqueItems.class, arg, configuration);
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
    
    public class ByteSchema extends StringJsonSchema {}
    
    
    public class Binary extends JsonSchema {
        // BinarySchema
    }
    
    
    public class Date extends DateJsonSchema {}
    
    
    public class DateTime extends DateTimeJsonSchema {}
    
    
    public class UuidSchema extends UuidJsonSchema {}
    
    
    public class UuidNoExample extends UuidJsonSchema {}
    
    
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
    
    public class PatternWithDigits extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                String.class
            )))
        ));
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(PatternWithDigits.class, arg, configuration);
        }
    }    
    
    public class PatternWithDigitsAndDelimiter extends JsonSchema {
        public static final LinkedHashMap<String, KeywordValidator> keywordToValidator = new LinkedHashMap<>(Map.ofEntries(
            new KeywordEntry("type", new TypeValidator(Set.of(
                String.class
            )))
        ));
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(PatternWithDigitsAndDelimiter.class, arg, configuration);
        }
    }    
    
    public class NoneProp extends NullJsonSchema {}
    
    
    public static class FormatTestMap extends FrozenMap<String, Object> {
        FormatTestMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
        public static FormatTestMap of(Map<String, Object> arg, SchemaConfiguration configuration) {

            return FormatTest1.validate(arg, configuration);
        }
    }    
    
    public class FormatTest1 extends JsonSchema {
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
        protected static FormatTestMap getMapOutputInstance(FrozenMap<? extends String, ?> arg) {
            return new FormatTestMap(arg);
        }
        public static FormatTestMap validate(Map<String, Object> arg, SchemaConfiguration configuration) {

            return JsonSchema.validate(FormatTest1.class, arg, configuration);
        }
    }
}
