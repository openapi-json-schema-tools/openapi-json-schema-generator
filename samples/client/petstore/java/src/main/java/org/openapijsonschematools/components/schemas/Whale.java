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
    }    
    
    public record Whale1(LinkedHashSet<Class<?>> type, LinkedHashMap<String, Class<?>> properties, Set<String> required) implements JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static Whale1 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(FrozenMap.class);
            LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>();
            properties.put("hasBaleen", HasBaleen.class);
            properties.put("hasTeeth", HasTeeth.class);
            properties.put("className", ClassName.class);
            Set<String> required = new LinkedHashSet<>();
            required.add("className");
            return new Whale1(type, properties, required);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Whale1.class, arg, configuration);
        }
    }
}
