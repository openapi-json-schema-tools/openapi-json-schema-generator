package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.Schema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class FormatTest {
    // nest classes so all schemas and input/output classes can be public
    public record class Int32 implements Schema {
        public static Int32Schema withDefaults() {
            return Int32Schema.withDefaults();
        }
    
        public static Integer validate(Integer arg, SchemaConfiguration configuration) {
            return Schema.validate(Int32Schema.class, arg, configuration);
        }
    
        public static Integer validate(Float arg, SchemaConfiguration configuration) {
            return Schema.validate(Int32Schema.class, Integer.parseInt(arg.toString()), configuration);
        }
    }
    public record class Int64 implements Schema {
        public static Int64Schema withDefaults() {
            return Int64Schema.withDefaults();
        }
    
        public static Long validate(Integer arg, SchemaConfiguration configuration) {
            return Schema.validate(Int64Schema.class, Long.valueOf(arg), configuration);
        }
    
        public static Long validate(Float arg, SchemaConfiguration configuration) {
            return Schema.validate(Int64Schema.class, Long.parseLong(arg.toString()), configuration);
        }
    
        public static Long validate(Long arg, SchemaConfiguration configuration) {
            return Schema.validate(Int64Schema.class, arg, configuration);
        }
    
        public static Long validate(Double arg, SchemaConfiguration configuration) {
            return Schema.validate(Int64Schema.class, Long.parseLong(arg.toString()), configuration);
        }
    }
    public record class Float32 implements Schema {
        public static FloatSchema withDefaults() {
            return FloatSchema.withDefaults();
        }
    
        public static Float validate(Float arg, SchemaConfiguration configuration) {
            return Schema.validate(FloatSchema.class, arg, configuration);
        }
    }
    public record class Float64 implements Schema {
        public static DoubleSchema withDefaults() {
            return DoubleSchema.withDefaults();
        }
    
        public static Double validate(Double arg, SchemaConfiguration configuration) {
            return Schema.validate(DoubleSchema.class, arg, configuration);
        }
    }
    public record class Items implements Schema {
        public static NumberSchema withDefaults() {
            return NumberSchema.withDefaults();
        }
    
        public static Number validate(Integer arg, SchemaConfiguration configuration) {
            return Schema.validate(NumberSchema.class, arg, configuration);
        }
    
        public static Number validate(Long arg, SchemaConfiguration configuration) {
            return Schema.validate(NumberSchema.class, arg, configuration);
        }
    
        public static Number validate(Float arg, SchemaConfiguration configuration) {
            return Schema.validate(NumberSchema.class, arg, configuration);
        }
    
        public static Number validate(Double arg, SchemaConfiguration configuration) {
            return Schema.validate(NumberSchema.class, arg, configuration);
        }
    }
    
    
    public record StringSchema(LinkedHashSet<Class<?>> type) implements Schema {
        public static StringSchema withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new StringSchema(type);
        }
    }    
    
    public record ByteSchema(LinkedHashSet<Class<?>> type) implements Schema {
        public static ByteSchema withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new ByteSchema(type);
        }
    }    
    
    public record Binary(LinkedHashSet<Class<?>> type) implements Schema {
        public static Binary withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            // FileIO,
            // bytes,
            return new Binary(type);
        }
    }    
    
    public record Date(LinkedHashSet<Class<?>> type) implements Schema {
        public static Date withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Date(type);
        }
    }    
    
    public record DateTime(LinkedHashSet<Class<?>> type) implements Schema {
        public static DateTime withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new DateTime(type);
        }
    }    
    
    public record UuidSchema(LinkedHashSet<Class<?>> type) implements Schema {
        public static UuidSchema withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new UuidSchema(type);
        }
    }    
    
    public record UuidNoExample(LinkedHashSet<Class<?>> type) implements Schema {
        public static UuidNoExample withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new UuidNoExample(type);
        }
    }    
    
    public record Password(LinkedHashSet<Class<?>> type) implements Schema {
        public static Password withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Password(type);
        }
    }    
    
    public record PatternWithDigits(LinkedHashSet<Class<?>> type) implements Schema {
        public static PatternWithDigits withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new PatternWithDigits(type);
        }
    }    
    
    public record PatternWithDigitsAndDelimiter(LinkedHashSet<Class<?>> type) implements Schema {
        public static PatternWithDigitsAndDelimiter withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new PatternWithDigitsAndDelimiter(type);
        }
    }    
    
    public record NoneProp(LinkedHashSet<Class<?>> type) implements Schema {
        public static NoneProp withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
                type(None),
            return new NoneProp(type);
        }
    }}
