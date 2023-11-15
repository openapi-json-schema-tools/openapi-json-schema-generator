package org.openapijsonschematools.components.schemas;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.JsonSchemas;
import org.openapijsonschematools.schemas.FrozenList;
import org.openapijsonschematools.schemas.FrozenMap;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
public class EnumTest {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record Enumstring(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static Enumstring withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Enumstring(type);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Enumstring.class, arg, configuration);
        }
    }    
    
    public record Enumstringrequired(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static Enumstringrequired withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Enumstringrequired(type);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Enumstringrequired.class, arg, configuration);
        }
    }    
    
    public record Enuminteger(LinkedHashSet<Class<?>> type, String format) implements JsonSchema {
        public static Enuminteger withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(Integer.class);
            type.add(Long.class);
            type.add(Float.class);
            type.add(Double.class);
            String format = "int32";
            return new Enuminteger(type, format);
        }
        public static Long validate(Integer arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Enuminteger.class, Long.valueOf(arg), configuration);
        }
        
        public static Long validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Enuminteger.class, Long.parseLong(arg.toString()), configuration);
        }
        
        public static Long validate(Long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Enuminteger.class, arg, configuration);
        }
        
        public static Long validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Enuminteger.class, Long.parseLong(arg.toString()), configuration);
        }
    }    
    
    public record Enumnumber(LinkedHashSet<Class<?>> type, String format) implements JsonSchema {
        public static Enumnumber withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(Integer.class);
            type.add(Long.class);
            type.add(Float.class);
            type.add(Double.class);
            String format = "double";
            return new Enumnumber(type, format);
        }
        public static Double validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Enumnumber.class, arg, configuration);
        }
    }}
