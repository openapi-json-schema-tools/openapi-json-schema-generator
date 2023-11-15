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
public class ObjectWithDifficultlyNamedProps {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record Specialpropertyname() implements JsonSchema {
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
    
    
    public record Schema123list(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static Schema123list withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Schema123list(type);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Schema123list.class, arg, configuration);
        }
    }    
    
    public record Schema123Number() implements JsonSchema {
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
    
    
    public record ObjectWithDifficultlyNamedProps1(LinkedHashSet<Class<?>> type, LinkedHashMap<String, Class<?>> properties, Set<String> required) implements JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
    
        model with properties that have invalid names for python
        */
        public static ObjectWithDifficultlyNamedProps1 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(FrozenMap.class);
            LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>();
            properties.put("$special[property.name]", Specialpropertyname.class);
            properties.put("123-list", Schema123list.class);
            properties.put("123Number", Schema123Number.class);
            Set<String> required = new LinkedHashSet<>();
            required.add("123-list");
            return new ObjectWithDifficultlyNamedProps1(type, properties, required);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ObjectWithDifficultlyNamedProps1.class, arg, configuration);
        }
    }
}
