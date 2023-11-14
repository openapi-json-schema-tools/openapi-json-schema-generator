package org.openapijsonschematools.paths.fake.post.requestbody.content.applicationxwwwformurlencoded;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.Schema;
import org.openapijsonschematools.schemas.AnyTypeSchema;

import java.util.LinkedHashSet;
public class Schema {
    // nest classes so all schemas and input/output classes can be public
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
    
    
    public record StringSchema(LinkedHashSet<Class<?>> type) implements Schema {
        public static StringSchema withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new StringSchema(type);
        }
    }    
    
    public record PatternWithoutDelimiter(LinkedHashSet<Class<?>> type) implements Schema {
        public static PatternWithoutDelimiter withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new PatternWithoutDelimiter(type);
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
    
    public record Password(LinkedHashSet<Class<?>> type) implements Schema {
        public static Password withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Password(type);
        }
    }    
    
    public record Callback(LinkedHashSet<Class<?>> type) implements Schema {
        public static Callback withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Callback(type);
        }
    }}
