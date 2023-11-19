package org.openapijsonschematools.components.schemas;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.DateJsonSchema;
import org.openapijsonschematools.schemas.DateTimeJsonSchema;
import org.openapijsonschematools.schemas.DoubleJsonSchema;
import org.openapijsonschematools.schemas.FloatJsonSchema;
import org.openapijsonschematools.schemas.FrozenList;
import org.openapijsonschematools.schemas.FrozenMap;
import org.openapijsonschematools.schemas.Int32JsonSchema;
import org.openapijsonschematools.schemas.Int64JsonSchema;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.NullJsonSchema;
import org.openapijsonschematools.schemas.NumberJsonSchema;
import org.openapijsonschematools.schemas.StringJsonSchema;
import org.openapijsonschematools.schemas.UuidJsonSchema;

public class FormatTest {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class IntegerSchema implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            Integer.class,
            Long.class,
            Float.class,
            Double.class
        ));
        public static Long validate(Integer arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(IntegerSchema.class, Long.valueOf(arg), configuration);
        }
        
        public static Long validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(IntegerSchema.class, Long.parseLong(arg.toString()), configuration);
        }
        
        public static Long validate(Long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(IntegerSchema.class, arg, configuration);
        }
        
        public static Long validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(IntegerSchema.class, Long.parseLong(arg.toString()), configuration);
        }
    }    
    
    public class Int32 extends Int32JsonSchema {}
    
    
    public class Int32withValidations implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            Integer.class,
            Long.class,
            Float.class,
            Double.class
        ));
        static final String format = "int32";
        public static Long validate(Integer arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Int32withValidations.class, Long.valueOf(arg), configuration);
        }
        
        public static Long validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Int32withValidations.class, Long.parseLong(arg.toString()), configuration);
        }
        
        public static Long validate(Long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Int32withValidations.class, arg, configuration);
        }
        
        public static Long validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Int32withValidations.class, Long.parseLong(arg.toString()), configuration);
        }
    }    
    
    public class Int64 extends Int64JsonSchema {}
    
    
    public class NumberSchema implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            Integer.class,
            Long.class,
            Float.class,
            Double.class
        ));
        public static Number validate(Integer arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(NumberSchema.class, arg, configuration);
        }
        
        public static Number validate(Long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(NumberSchema.class, arg, configuration);
        }
        
        public static Number validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(NumberSchema.class, arg, configuration);
        }
        
        public static Number validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(NumberSchema.class, arg, configuration);
        }
    }    
    
    public class FloatSchema implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            Integer.class,
            Long.class,
            Float.class,
            Double.class
        ));
        static final String format = "float";
        public static Float validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(FloatSchema.class, arg, configuration);
        }
    }    
    
    public class Float32 extends FloatJsonSchema {}
    
    
    public class DoubleSchema implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            Integer.class,
            Long.class,
            Float.class,
            Double.class
        ));
        static final String format = "double";
        public static Double validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(DoubleSchema.class, arg, configuration);
        }
    }    
    
    public class Float64 extends DoubleJsonSchema {}
    
    
    public class Items extends NumberJsonSchema {}
    
    
    public class ArrayWithUniqueItems implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenList.class
        ));
        static final Class<?> items = Items.class;
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ArrayWithUniqueItems.class, arg, configuration);
        }
    }    
    
    public class StringSchema implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            String.class
        ));
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(StringSchema.class, arg, configuration);
        }
    }    
    
    public class ByteSchema extends StringJsonSchema {}
    
    
    public class Binary implements JsonSchema {
        // BinarySchema
    }
    
    
    public class Date extends DateJsonSchema {}
    
    
    public class DateTime extends DateTimeJsonSchema {}
    
    
    public class UuidSchema extends UuidJsonSchema {}
    
    
    public class UuidNoExample extends UuidJsonSchema {}
    
    
    public class Password implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            String.class
        ));
        static final String format = "password";
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Password.class, arg, configuration);
        }
    }    
    
    public class PatternWithDigits implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            String.class
        ));
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(PatternWithDigits.class, arg, configuration);
        }
    }    
    
    public class PatternWithDigitsAndDelimiter implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            String.class
        ));
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(PatternWithDigitsAndDelimiter.class, arg, configuration);
        }
    }    
    
    public class NoneProp extends NullJsonSchema {}
    
    
    class FormatTestMap extends FrozenMap<String, Object> {
        FormatTestMap(FrozenMap<? extends String, ?> m) {
            super(m);
        }
    }    
    
    public class FormatTest1 implements JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("integer", IntegerSchema.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("int32", Int32.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("int32withValidations", Int32withValidations.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("int64", Int64.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("number", NumberSchema.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("float", FloatSchema.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("float32", Float32.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("double", DoubleSchema.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("float64", Float64.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("arrayWithUniqueItems", ArrayWithUniqueItems.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("string", StringSchema.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("byte", ByteSchema.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("binary", Binary.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("date", Date.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("dateTime", DateTime.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("uuid", UuidSchema.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("uuidNoExample", UuidNoExample.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("password", Password.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("pattern_with_digits", PatternWithDigits.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("pattern_with_digits_and_delimiter", PatternWithDigitsAndDelimiter.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("noneProp", NoneProp.class)
        ));
        static final Set<String> required = new LinkedHashSet<>(Set.of(
            "byte",
            "date",
            "number",
            "password"
        ));
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(FormatTest1.class, arg, configuration);
        }
    }
}
