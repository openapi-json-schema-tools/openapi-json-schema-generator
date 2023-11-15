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
public class BananaReq {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record AdditionalProperties() implements JsonSchema {
        public static JsonSchemas.NotAnyTypeSchema withDefaults() {
            return JsonSchemas.NotAnyTypeSchema.withDefaults();
        }
    
        // NotAnyTypeSchema
    }
    
    
    public record LengthCm() implements JsonSchema {
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
    
    
    public record Sweet() implements JsonSchema {
        public static JsonSchemas.BooleanSchema withDefaults() {
            return JsonSchemas.BooleanSchema.withDefaults();
        }
    
        public static Boolean validate(Boolean arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.BooleanSchema.class, arg, configuration);
        }
    }
    
    
    public record BananaReq1(LinkedHashSet<Class<?>> type, LinkedHashMap<String, Class<?>> properties, Set<String> required, Class<?> additionalProperties) implements JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static BananaReq1 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(FrozenMap.class);
            LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>();
            properties.put("lengthCm", LengthCm.class);
            properties.put("sweet", Sweet.class);
            Set<String> required = new LinkedHashSet<>();
            required.add("lengthCm");
            Class<?> additionalProperties = AdditionalProperties.class;
            return new BananaReq1(type, properties, required, additionalProperties);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(BananaReq1.class, arg, configuration);
        }
    }
}
