package org.openapijsonschematools.schemas;

import org.openapijsonschematools.configurations.SchemaConfiguration;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class JsonSchemas {
    // holds all standard json schema types

    public record AnyTypeSchema() implements JsonSchema {
        public static AnyTypeSchema withDefaults() {
            return new AnyTypeSchema();
        }
    
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AnyTypeSchema.class, arg, configuration);
        }
    
        public static Boolean validate(Boolean arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AnyTypeSchema.class, arg, configuration);
        }
    
        public static Integer validate(Integer arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AnyTypeSchema.class, arg, configuration);
        }
    
        public static Long validate(Long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AnyTypeSchema.class, arg, configuration);
        }
    
        public static Float validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AnyTypeSchema.class, arg, configuration);
        }
    
        public static Double validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AnyTypeSchema.class, arg, configuration);
        }
    
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AnyTypeSchema.class, arg, configuration);
        }
    
        public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AnyTypeSchema.class, arg, configuration);
        }
    
        public static String validate(LocalDate arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AnyTypeSchema.class, arg, configuration);
        }
    
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AnyTypeSchema.class, arg, configuration);
        }
    
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AnyTypeSchema.class, arg, configuration);
        }
    }
    public record BooleanSchema(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static BooleanSchema withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(Boolean.class);
            return new BooleanSchema(type);
        }
    
        public static Boolean validate(Boolean arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(BooleanSchema.class, arg, configuration);
        }
    }
    public record DateSchema(LinkedHashSet<Class<?>> type, String format) implements JsonSchema {
        public static DateSchema withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            String format = "date";
            return new DateSchema(type, format);
        }
    
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(DateSchema.class, arg, configuration);
        }
    
        public static String validate(LocalDate arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(DateSchema.class, arg, configuration);
        }
    }
    public record DateTimeSchema(LinkedHashSet<Class<?>> type, String format) implements JsonSchema {
        public static DateTimeSchema withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            String format = "date-time";
            return new DateTimeSchema(type, format);
        }
    
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(DateTimeSchema.class, arg, configuration);
        }
    
        public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(DateTimeSchema.class, arg, configuration);
        }
    }
    public record DecimalSchema(LinkedHashSet<Class<?>> type, String format) implements JsonSchema {
        public static DecimalSchema withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            String format = "number";
            return new DecimalSchema(type, format);
        }
    
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(DecimalSchema.class, arg, configuration);
        }
    }
    public record DoubleSchema(LinkedHashSet<Class<?>> type, String format) implements JsonSchema {
        public static DoubleSchema withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(Double.class);
            String format = "double";
            return new DoubleSchema(type, format);
        }
    
        public static Double validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(DoubleSchema.class, arg, configuration);
        }
    }
    public record FloatSchema(LinkedHashSet<Class<?>> type, String format) implements JsonSchema {
        public static FloatSchema withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(Float.class);
            String format = "float";
            return new FloatSchema(type, format);
        }
    
        public static Float validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(FloatSchema.class, arg, configuration);
        }
    }
    public record Int32Schema(LinkedHashSet<Class<?>> type, String format) implements JsonSchema {
        public static Int32Schema withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(Integer.class);
            type.add(Float.class);
            String format = "int32";
            return new Int32Schema(type, format);
        }
    
        public static Integer validate(Integer arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Int32Schema.class, arg, configuration);
        }
    
        public static Integer validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Int32Schema.class, Integer.parseInt(arg.toString()), configuration);
        }
    }
    public record Int64Schema(LinkedHashSet<Class<?>> type, String format) implements JsonSchema {
        public static Int64Schema withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(Integer.class);
            type.add(Long.class);
            type.add(Float.class);
            type.add(Double.class);
            String format = "int64";
            return new Int64Schema(type, format);
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
    public record IntSchema(LinkedHashSet<Class<?>> type, String format) implements JsonSchema {
        public static IntSchema withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(Number.class);
            String format = "int";
            return new IntSchema(type, format);
        }
    
        public static Long validate(Integer arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(IntSchema.class, Long.valueOf(arg), configuration);
        }
    
        public static Long validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(IntSchema.class, Long.parseLong(arg.toString()), configuration);
        }
    
        public static Long validate(Long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(IntSchema.class, arg, configuration);
        }
    
        public static Long validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(IntSchema.class, Long.parseLong(arg.toString()), configuration);
        }
    }
    public record ListSchema(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static ListSchema withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(FrozenList.class);
            return new ListSchema(type);
        }
    
        public static FrozenList<Object> validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ListSchema.class, arg, configuration);
        }
    }
    public record MapSchema(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static MapSchema withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            // can't use ImmutableMap because it does not allow null values in entries
            // can't use Collections.unmodifiableMap because Collections.UnmodifiableMap is not public + extensible
            type.add(FrozenMap.class);
            return new MapSchema(type);
        }
    
        public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(MapSchema.class, arg, configuration);
        }
    }
    public record NotAnyTypeSchema() implements JsonSchema {
        public static NotAnyTypeSchema withDefaults() {
            // todo add not definition here when that validator is added
            return new NotAnyTypeSchema();
        }
    }
    public record NullSchema(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static NullSchema withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(Void.class);
            return new NullSchema(type);
        }
    
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(NullSchema.class, arg, configuration);
        }
    }
    public record NumberSchema(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static NumberSchema withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(Integer.class);
            type.add(Long.class);
            type.add(Float.class);
            type.add(Double.class);
            return new NumberSchema(type);
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
    
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(StringSchema.class, arg, configuration);
        }
    
        public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(StringSchema.class, arg, configuration);
        }
    
        public static String validate(LocalDate arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(StringSchema.class, arg, configuration);
        }
    }
    public record UnsetAnyTypeSchema() implements JsonSchema {
        static UnsetAnyTypeSchema withDefaults() {
            return new UnsetAnyTypeSchema();
        }
    
        static Void validate(Void arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(UnsetAnyTypeSchema.class, arg, configuration);
        }
    
        static Boolean validate(Boolean arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(UnsetAnyTypeSchema.class, arg, configuration);
        }
    
        static Integer validate(Integer arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(UnsetAnyTypeSchema.class, arg, configuration);
        }
    
        public static Long validate(Long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(UnsetAnyTypeSchema.class, arg, configuration);
        }
    
        static Float validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(UnsetAnyTypeSchema.class, arg, configuration);
        }
    
        static Double validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(UnsetAnyTypeSchema.class, arg, configuration);
        }
    
        static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(UnsetAnyTypeSchema.class, arg, configuration);
        }
    
        static String validate(ZonedDateTime arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(UnsetAnyTypeSchema.class, arg, configuration);
        }
    
        static String validate(LocalDate arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(UnsetAnyTypeSchema.class, arg, configuration);
        }
    
        static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(UnsetAnyTypeSchema.class, arg, configuration);
        }
    
        static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(UnsetAnyTypeSchema.class, arg, configuration);
        }
    }
    public record UuidSchema(LinkedHashSet<Class<?>> type, String format) implements JsonSchema {
        public static UuidSchema withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            String format = "uuid";
            return new UuidSchema(type, format);
        }
    
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(UuidSchema.class, arg, configuration);
        }
    
        public static String validate(UUID arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(UuidSchema.class, arg, configuration);
        }
    }
}