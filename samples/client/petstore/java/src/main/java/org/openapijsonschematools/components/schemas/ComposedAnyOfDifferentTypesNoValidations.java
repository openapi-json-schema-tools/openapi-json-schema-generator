package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.JsonSchemas;
import org.openapijsonschematools.schemas.FrozenList;
import org.openapijsonschematools.schemas.FrozenMap;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class ComposedAnyOfDifferentTypesNoValidations {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record Schema0() implements JsonSchema {
        public static JsonSchemas.MapSchema withDefaults() {
            return JsonSchemas.MapSchema.withDefaults();
        }
    
        public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.MapSchema.class, arg, configuration);
        }
    }
    
    
    public record Schema1(LinkedHashSet<Class<?>> type, String format) implements JsonSchema {
        public static Schema1 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            String format = "date";
            return new Schema1(type, format);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema1.class, arg, configuration);
        }
    }    
    
    public record Schema2(LinkedHashSet<Class<?>> type, String format) implements JsonSchema {
        public static Schema2 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            String format = "date-time";
            return new Schema2(type, format);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema2.class, arg, configuration);
        }
    }    
    
    public record Schema3(LinkedHashSet<Class<?>> type, String format) implements JsonSchema {
        public static Schema3 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            // FileIO,
            // bytes,
            String format = "binary";
            return new Schema3(type, format);
        }
        // FileIO,
        // bytes,
    }    
    
    public record Schema4(LinkedHashSet<Class<?>> type, String format) implements JsonSchema {
        public static Schema4 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            String format = "byte";
            return new Schema4(type, format);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema4.class, arg, configuration);
        }
    }    
    
    public record Schema5(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static Schema5 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Schema5(type);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema5.class, arg, configuration);
        }
    }    
    
    public record Schema6() implements JsonSchema {
        public static JsonSchemas.MapSchema withDefaults() {
            return JsonSchemas.MapSchema.withDefaults();
        }
    
        public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.MapSchema.class, arg, configuration);
        }
    }
    
    
    public record Schema7() implements JsonSchema {
        public static JsonSchemas.BooleanSchema withDefaults() {
            return JsonSchemas.BooleanSchema.withDefaults();
        }
    
        public static Boolean validate(Boolean arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.BooleanSchema.class, arg, configuration);
        }
    }
    
    
    public record Schema8(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static Schema8 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(Void.class);
            return new Schema8(type);
        }
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema8.class, arg, configuration);
        }
    }    
    
    public record Items() implements JsonSchema {
        public static JsonSchemas.AnyTypeSchema withDefaults() {
            return JsonSchemas.AnyTypeSchema.withDefaults();
        }
    
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.AnyTypeSchema.class, arg, configuration);
        }
    
        public static Boolean validate(Boolean arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.AnyTypeSchema.class, arg, configuration);
        }
    
        public static Integer validate(Integer arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.AnyTypeSchema.class, arg, configuration);
        }
    
        public static Long validate(Long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.AnyTypeSchema.class, arg, configuration);
        }
    
        public static Float validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.AnyTypeSchema.class, arg, configuration);
        }
    
        public static Double validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.AnyTypeSchema.class, arg, configuration);
        }
    
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.AnyTypeSchema.class, arg, configuration);
        }
    
        public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.AnyTypeSchema.class, arg, configuration);
        }
    
        public static String validate(LocalDate arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.AnyTypeSchema.class, arg, configuration);
        }
    
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.AnyTypeSchema.class, arg, configuration);
        }
    
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.AnyTypeSchema.class, arg, configuration);
        }
    }
    
    
    public record Schema9(LinkedHashSet<Class<?>> type, Class<?> items) implements JsonSchema {
        public static Schema9 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(FrozenList.class);
            Class<?> items = Items.class;
            return new Schema9(type, items);
        }
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema9.class, arg, configuration);
        }
    }    
    
    public record Schema10() implements JsonSchema {
        public static JsonSchemas.NumberSchema withDefaults() {
            return JsonSchemas.NumberSchema.withDefaults();
        }
    
        public static Number validate(Integer arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.NumberSchema.class, arg, configuration);
        }
    
        public static Number validate(Long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.NumberSchema.class, arg, configuration);
        }
    
        public static Number validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.NumberSchema.class, arg, configuration);
        }
    
        public static Number validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.NumberSchema.class, arg, configuration);
        }
    }
    
    
    public record Schema11() implements JsonSchema {
        public static JsonSchemas.FloatSchema withDefaults() {
            return JsonSchemas.FloatSchema.withDefaults();
        }
    
        public static Float validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.FloatSchema.class, arg, configuration);
        }
    }
    
    
    public record Schema12() implements JsonSchema {
        public static JsonSchemas.DoubleSchema withDefaults() {
            return JsonSchemas.DoubleSchema.withDefaults();
        }
    
        public static Double validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.DoubleSchema.class, arg, configuration);
        }
    }
    
    
    public record Schema13() implements JsonSchema {
        public static JsonSchemas.IntSchema withDefaults() {
            return JsonSchemas.IntSchema.withDefaults();
        }
    
        public static Long validate(Integer arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.IntSchema.class, Long.valueOf(arg), configuration);
        }
    
        public static Long validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.IntSchema.class, Long.parseLong(arg.toString()), configuration);
        }
    
        public static Long validate(Long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.IntSchema.class, arg, configuration);
        }
    
        public static Long validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.IntSchema.class, Long.parseLong(arg.toString()), configuration);
        }
    }
    
    
    public record Schema14() implements JsonSchema {
        public static JsonSchemas.Int32Schema withDefaults() {
            return JsonSchemas.Int32Schema.withDefaults();
        }
    
        public static Integer validate(Integer arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.Int32Schema.class, arg, configuration);
        }
    
        public static Integer validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.Int32Schema.class, Integer.parseInt(arg.toString()), configuration);
        }
    }
    
    
    public record Schema15() implements JsonSchema {
        public static JsonSchemas.Int64Schema withDefaults() {
            return JsonSchemas.Int64Schema.withDefaults();
        }
    
        public static Long validate(Integer arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.Int64Schema.class, Long.valueOf(arg), configuration);
        }
    
        public static Long validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.Int64Schema.class, Long.parseLong(arg.toString()), configuration);
        }
    
        public static Long validate(Long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.Int64Schema.class, arg, configuration);
        }
    
        public static Long validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.Int64Schema.class, Long.parseLong(arg.toString()), configuration);
        }
    }
}
