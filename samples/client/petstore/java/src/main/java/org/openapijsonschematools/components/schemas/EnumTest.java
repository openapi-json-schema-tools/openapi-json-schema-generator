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
    
    
    public record EnumString(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static EnumString withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new EnumString(type);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(EnumString.class, arg, configuration);
        }
    }    
    
    public record EnumStringRequired(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static EnumStringRequired withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new EnumStringRequired(type);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(EnumStringRequired.class, arg, configuration);
        }
    }    
    
    public record EnumInteger(LinkedHashSet<Class<?>> type, String format) implements JsonSchema {
        public static EnumInteger withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(Integer.class);
            type.add(Long.class);
            type.add(Float.class);
            type.add(Double.class);
            String format = "int32";
            return new EnumInteger(type, format);
        }
        public static Long validate(Integer arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(EnumInteger.class, Long.valueOf(arg), configuration);
        }
        
        public static Long validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(EnumInteger.class, Long.parseLong(arg.toString()), configuration);
        }
        
        public static Long validate(Long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(EnumInteger.class, arg, configuration);
        }
        
        public static Long validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(EnumInteger.class, Long.parseLong(arg.toString()), configuration);
        }
    }    
    
    public record EnumNumber(LinkedHashSet<Class<?>> type, String format) implements JsonSchema {
        public static EnumNumber withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(Integer.class);
            type.add(Long.class);
            type.add(Float.class);
            type.add(Double.class);
            String format = "double";
            return new EnumNumber(type, format);
        }
        public static Double validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(EnumNumber.class, arg, configuration);
        }
    }}
