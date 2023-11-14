package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.AnyTypeSchema;
import org.openapijsonschematools.schemas.BooleanSchema;
import org.openapijsonschematools.schemas.DateSchema;
import org.openapijsonschematools.schemas.DateTimeSchema;
import org.openapijsonschematools.schemas.DecimalSchema;
import org.openapijsonschematools.schemas.DoubleSchema;
import org.openapijsonschematools.schemas.FloatSchema;
import org.openapijsonschematools.schemas.Int32Schema;
import org.openapijsonschematools.schemas.Int64Schema;
import org.openapijsonschematools.schemas.IntSchema;
import org.openapijsonschematools.schemas.ListSchema;
import org.openapijsonschematools.schemas.MapSchema;
import org.openapijsonschematools.schemas.NullSchema;
import org.openapijsonschematools.schemas.NumberSchema;
import org.openapijsonschematools.schemas.StringSchema;

import java.util.LinkedHashSet;
public class ComposedAnyOfDifferentTypesNoValidations {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record Schema0() implements JsonSchema {
        public static MapSchema withDefaults() {
            return MapSchema.withDefaults();
        }
    
        public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(MapSchema.class, arg, configuration);
        }
    }
    
    
    public record Schema1(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static Schema1 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Schema1(type);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema1.class, arg, configuration);
        }
    }    
    
    public record Schema2(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static Schema2 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Schema2(type);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema2.class, arg, configuration);
        }
    }    
    
    public record Schema3(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static Schema3 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            // FileIO,
            // bytes,
            return new Schema3(type);
        }
        // FileIO,
        // bytes,
    }    
    
    public record Schema4(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static Schema4 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Schema4(type);
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
        public static MapSchema withDefaults() {
            return MapSchema.withDefaults();
        }
    
        public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(MapSchema.class, arg, configuration);
        }
    }
    
    
    public record Schema7() implements JsonSchema {
        public static BooleanSchema withDefaults() {
            return BooleanSchema.withDefaults();
        }
    
        public static Boolean validate(Boolean arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(BooleanSchema.class, arg, configuration);
        }
    }
    
    
    public record Schema8(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static Schema8 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
                type(None),
            return new Schema8(type);
        }
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema8.class, arg, configuration);
        }
    }    
    
    public record Items() implements JsonSchema {
        public static AnyTypeSchema withDefaults() {
            return AnyTypeSchema.withDefaults();
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
    
    
    public record Schema10() implements JsonSchema {
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
    
    
    public record Schema11() implements JsonSchema {
        public static FloatSchema withDefaults() {
            return FloatSchema.withDefaults();
        }
    
        public static Float validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(FloatSchema.class, arg, configuration);
        }
    }
    
    
    public record Schema12() implements JsonSchema {
        public static DoubleSchema withDefaults() {
            return DoubleSchema.withDefaults();
        }
    
        public static Double validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(DoubleSchema.class, arg, configuration);
        }
    }
    
    
    public record Schema13() implements JsonSchema {
        public static IntSchema withDefaults() {
            return IntSchema.withDefaults();
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
    
    
    public record Schema14() implements JsonSchema {
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
    
    
    public record Schema15() implements JsonSchema {
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
}
