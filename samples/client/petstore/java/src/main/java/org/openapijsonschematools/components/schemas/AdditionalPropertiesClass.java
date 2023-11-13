package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.Schema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class AdditionalPropertiesClass {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record AdditionalProperties(LinkedHashSet<Class<?>> type) implements Schema {
        public static AdditionalProperties withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new AdditionalProperties(type);
        }
    }    
    
    public record AdditionalProperties3(LinkedHashSet<Class<?>> type) implements Schema {
        public static AdditionalProperties3 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new AdditionalProperties3(type);
        }
    }    public record class Anytype1 implements Schema {
        public static AnyTypeSchema withDefaults() {
            return AnyTypeSchema.withDefaults();
        }
    
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return Schema.validate(AnyTypeSchema.class, arg, configuration);
        }
    
        public static Boolean validate(Boolean arg, SchemaConfiguration configuration) {
            return Schema.validate(AnyTypeSchema.class, arg, configuration);
        }
    
        public static Integer validate(Integer arg, SchemaConfiguration configuration) {
            return Schema.validate(AnyTypeSchema.class, arg, configuration);
        }
    
        public static Long validate(Long arg, SchemaConfiguration configuration) {
            return Schema.validate(AnyTypeSchema.class, arg, configuration);
        }
    
        public static Float validate(Float arg, SchemaConfiguration configuration) {
            return Schema.validate(AnyTypeSchema.class, arg, configuration);
        }
    
        public static Double validate(Double arg, SchemaConfiguration configuration) {
            return Schema.validate(AnyTypeSchema.class, arg, configuration);
        }
    
        public static String validate(String arg, SchemaConfiguration configuration) {
            return Schema.validate(AnyTypeSchema.class, arg, configuration);
        }
    
        public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) {
            return Schema.validate(AnyTypeSchema.class, arg, configuration);
        }
    
        public static String validate(LocalDate arg, SchemaConfiguration configuration) {
            return Schema.validate(AnyTypeSchema.class, arg, configuration);
        }
    
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return Schema.validate(AnyTypeSchema.class, arg, configuration);
        }
    
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return Schema.validate(AnyTypeSchema.class, arg, configuration);
        }
    }
    public record class MapWithUndeclaredPropertiesAnytype1 implements Schema {
        public static MapSchema withDefaults() {
            return MapSchema.withDefaults();
        }
    
        public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return Schema.validate(MapSchema.class, arg, configuration);
        }
    }
    public record class MapWithUndeclaredPropertiesAnytype2 implements Schema {
        public static MapSchema withDefaults() {
            return MapSchema.withDefaults();
        }
    
        public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return Schema.validate(MapSchema.class, arg, configuration);
        }
    }
    public record class AdditionalProperties4 implements Schema {
        public static AnyTypeSchema withDefaults() {
            return AnyTypeSchema.withDefaults();
        }
    
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return Schema.validate(AnyTypeSchema.class, arg, configuration);
        }
    
        public static Boolean validate(Boolean arg, SchemaConfiguration configuration) {
            return Schema.validate(AnyTypeSchema.class, arg, configuration);
        }
    
        public static Integer validate(Integer arg, SchemaConfiguration configuration) {
            return Schema.validate(AnyTypeSchema.class, arg, configuration);
        }
    
        public static Long validate(Long arg, SchemaConfiguration configuration) {
            return Schema.validate(AnyTypeSchema.class, arg, configuration);
        }
    
        public static Float validate(Float arg, SchemaConfiguration configuration) {
            return Schema.validate(AnyTypeSchema.class, arg, configuration);
        }
    
        public static Double validate(Double arg, SchemaConfiguration configuration) {
            return Schema.validate(AnyTypeSchema.class, arg, configuration);
        }
    
        public static String validate(String arg, SchemaConfiguration configuration) {
            return Schema.validate(AnyTypeSchema.class, arg, configuration);
        }
    
        public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) {
            return Schema.validate(AnyTypeSchema.class, arg, configuration);
        }
    
        public static String validate(LocalDate arg, SchemaConfiguration configuration) {
            return Schema.validate(AnyTypeSchema.class, arg, configuration);
        }
    
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return Schema.validate(AnyTypeSchema.class, arg, configuration);
        }
    
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return Schema.validate(AnyTypeSchema.class, arg, configuration);
        }
    }
    public record class AdditionalProperties5 implements Schema {
        public static NotAnyTypeSchema withDefaults() {
            return NotAnyTypeSchema.withDefaults();
        }
    
        // NotAnyTypeSchema
    }
    
    
    public record AdditionalProperties6(LinkedHashSet<Class<?>> type) implements Schema {
        public static AdditionalProperties6 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new AdditionalProperties6(type);
        }
    }}
