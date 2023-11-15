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
public class Whale {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record HasBaleen() implements JsonSchema {
        public static JsonSchemas.BooleanSchema withDefaults() {
            return JsonSchemas.BooleanSchema.withDefaults();
        }
    
        public static Boolean validate(Boolean arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.BooleanSchema.class, arg, configuration);
        }
    }
    
    
    public record HasTeeth() implements JsonSchema {
        public static JsonSchemas.BooleanSchema withDefaults() {
            return JsonSchemas.BooleanSchema.withDefaults();
        }
    
        public static Boolean validate(Boolean arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.BooleanSchema.class, arg, configuration);
        }
    }
    
    
    public record ClassName(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static ClassName withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new ClassName(type);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ClassName.class, arg, configuration);
        }
    }}
