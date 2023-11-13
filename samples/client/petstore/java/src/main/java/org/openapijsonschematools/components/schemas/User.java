package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.Schema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class User {
    // nest classes so all schemas and input/output classes can be public
    public record class Id implements Schema {
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
    
    
    public record Username(LinkedHashSet<Class<?>> type) implements Schema {
        public static Username withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Username(type);
        }
    }    
    
    public record FirstName(LinkedHashSet<Class<?>> type) implements Schema {
        public static FirstName withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new FirstName(type);
        }
    }    
    
    public record LastName(LinkedHashSet<Class<?>> type) implements Schema {
        public static LastName withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new LastName(type);
        }
    }    
    
    public record Email(LinkedHashSet<Class<?>> type) implements Schema {
        public static Email withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Email(type);
        }
    }    
    
    public record Password(LinkedHashSet<Class<?>> type) implements Schema {
        public static Password withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Password(type);
        }
    }    
    
    public record Phone(LinkedHashSet<Class<?>> type) implements Schema {
        public static Phone withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Phone(type);
        }
    }    public record class UserStatus implements Schema {
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
    public record class ObjectWithNoDeclaredProps implements Schema {
        public static MapSchema withDefaults() {
            return MapSchema.withDefaults();
        }
    
        public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return Schema.validate(MapSchema.class, arg, configuration);
        }
    }
    
    
    public record Not(LinkedHashSet<Class<?>> type) implements Schema {
        public static Not withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
                type(None),
            return new Not(type);
        }
    }}
