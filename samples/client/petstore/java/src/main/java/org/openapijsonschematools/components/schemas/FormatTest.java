package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class FormatTest {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record Int32 implements JsonSchema {
        public static Int32Schema withDefaults() {
            return Int32Schema.withDefaults();
        }
    
        public static Integer validate(Integer arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Int32Schema.class, arg, configuration);
        }
    
        public static Integer validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Int32Schema.class, Integer.parseInt(arg.toString()), configuration);
        }
    }
    
    
    public record Int64 implements JsonSchema {
        public static Int64Schema withDefaults() {
            return Int64Schema.withDefaults();
        }
    
        public static Long validate(Integer arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Int64Schema.class, Long.valueOf(arg), configuration);
        }
    
        public static Long validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Int64Schema.class, Long.parseLong(arg.toString()), configuration);
        }
    
        public static Long validate(Long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Int64Schema.class, arg, configuration);
        }
    
        public static Long validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Int64Schema.class, Long.parseLong(arg.toString()), configuration);
        }
    }
    
    
    public record Float32 implements JsonSchema {
        public static FloatSchema withDefaults() {
            return FloatSchema.withDefaults();
        }
    
        public static Float validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(FloatSchema.class, arg, configuration);
        }
    }
    
    
    public record Float64 implements JsonSchema {
        public static DoubleSchema withDefaults() {
            return DoubleSchema.withDefaults();
        }
    
        public static Double validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(DoubleSchema.class, arg, configuration);
        }
    }
    
    
    public record Items implements JsonSchema {
        public static NumberSchema withDefaults() {
            return NumberSchema.withDefaults();
        }
    
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
    
    
    public record StringSchema(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static StringSchema withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new StringSchema(type);
        }
    }    
    
    public record ByteSchema(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static ByteSchema withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new ByteSchema(type);
        }
    }    
    
    public record Binary(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static Binary withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            // FileIO,
            // bytes,
            return new Binary(type);
        }
    }    
    
    public record Date(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static Date withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Date(type);
        }
    }    
    
    public record DateTime(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static DateTime withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new DateTime(type);
        }
    }    
    
    public record UuidSchema(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static UuidSchema withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new UuidSchema(type);
        }
    }    
    
    public record UuidNoExample(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static UuidNoExample withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new UuidNoExample(type);
        }
    }    
    
    public record Password(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static Password withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Password(type);
        }
    }    
    
    public record PatternWithDigits(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static PatternWithDigits withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new PatternWithDigits(type);
        }
    }    
    
    public record PatternWithDigitsAndDelimiter(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static PatternWithDigitsAndDelimiter withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new PatternWithDigitsAndDelimiter(type);
        }
    }    
    
    public record NoneProp(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static NoneProp withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
                type(None),
            return new NoneProp(type);
        }
    }}
