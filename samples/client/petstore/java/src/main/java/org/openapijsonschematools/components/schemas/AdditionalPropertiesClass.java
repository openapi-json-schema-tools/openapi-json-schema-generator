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
public class AdditionalPropertiesClass {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record AdditionalProperties(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static AdditionalProperties withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new AdditionalProperties(type);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties.class, arg, configuration);
        }
    }    
    
    public record MapProperty(LinkedHashSet<Class<?>> type, Class<?> additionalProperties) implements JsonSchema {
        public static MapProperty withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(FrozenMap.class);
            Class<?> additionalProperties = AdditionalProperties.class;
            return new MapProperty(type, additionalProperties);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(MapProperty.class, arg, configuration);
        }
    }
    
    
    public record AdditionalProperties3(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static AdditionalProperties3 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new AdditionalProperties3(type);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties3.class, arg, configuration);
        }
    }    
    
    public record AdditionalProperties2(LinkedHashSet<Class<?>> type, Class<?> additionalProperties) implements JsonSchema {
        public static AdditionalProperties2 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(FrozenMap.class);
            Class<?> additionalProperties = AdditionalProperties3.class;
            return new AdditionalProperties2(type, additionalProperties);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties2.class, arg, configuration);
        }
    }
    
    
    public record MapOfMapProperty(LinkedHashSet<Class<?>> type, Class<?> additionalProperties) implements JsonSchema {
        public static MapOfMapProperty withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(FrozenMap.class);
            Class<?> additionalProperties = AdditionalProperties2.class;
            return new MapOfMapProperty(type, additionalProperties);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(MapOfMapProperty.class, arg, configuration);
        }
    }
    
    
    public record Anytype1() implements JsonSchema {
        public static JsonSchemas.AnyTypeSchema withDefaults() {
            return JsonSchemas.AnyTypeSchema.withDefaults();
        }
    
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.AnyTypeSchema.class, arg, configuration);
        }
    
        public static Boolean validate(Boolean arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.AnyTypeSchema.class, arg, configuration);
        }
    
        public static Integer validate(Integer arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.AnyTypeSchema.class, arg, configuration);
        }
    
        public static Long validate(Long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.AnyTypeSchema.class, arg, configuration);
        }
    
        public static Float validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.AnyTypeSchema.class, arg, configuration);
        }
    
        public static Double validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.AnyTypeSchema.class, arg, configuration);
        }
    
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.AnyTypeSchema.class, arg, configuration);
        }
    
        public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.AnyTypeSchema.class, arg, configuration);
        }
    
        public static String validate(LocalDate arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.AnyTypeSchema.class, arg, configuration);
        }
    
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.AnyTypeSchema.class, arg, configuration);
        }
    
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.AnyTypeSchema.class, arg, configuration);
        }
    }
    
    
    public record MapWithUndeclaredPropertiesAnytype1() implements JsonSchema {
        public static JsonSchemas.MapSchema withDefaults() {
            return JsonSchemas.MapSchema.withDefaults();
        }
    
        public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.MapSchema.class, arg, configuration);
        }
    }
    
    
    public record MapWithUndeclaredPropertiesAnytype2() implements JsonSchema {
        public static JsonSchemas.MapSchema withDefaults() {
            return JsonSchemas.MapSchema.withDefaults();
        }
    
        public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.MapSchema.class, arg, configuration);
        }
    }
    
    
    public record AdditionalProperties4() implements JsonSchema {
        public static JsonSchemas.AnyTypeSchema withDefaults() {
            return JsonSchemas.AnyTypeSchema.withDefaults();
        }
    
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.AnyTypeSchema.class, arg, configuration);
        }
    
        public static Boolean validate(Boolean arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.AnyTypeSchema.class, arg, configuration);
        }
    
        public static Integer validate(Integer arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.AnyTypeSchema.class, arg, configuration);
        }
    
        public static Long validate(Long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.AnyTypeSchema.class, arg, configuration);
        }
    
        public static Float validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.AnyTypeSchema.class, arg, configuration);
        }
    
        public static Double validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.AnyTypeSchema.class, arg, configuration);
        }
    
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.AnyTypeSchema.class, arg, configuration);
        }
    
        public static String validate(ZonedDateTime arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.AnyTypeSchema.class, arg, configuration);
        }
    
        public static String validate(LocalDate arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.AnyTypeSchema.class, arg, configuration);
        }
    
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.AnyTypeSchema.class, arg, configuration);
        }
    
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.AnyTypeSchema.class, arg, configuration);
        }
    }
    
    
    public record MapWithUndeclaredPropertiesAnytype3(LinkedHashSet<Class<?>> type, Class<?> additionalProperties) implements JsonSchema {
        public static MapWithUndeclaredPropertiesAnytype3 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(FrozenMap.class);
            Class<?> additionalProperties = AdditionalProperties4.class;
            return new MapWithUndeclaredPropertiesAnytype3(type, additionalProperties);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(MapWithUndeclaredPropertiesAnytype3.class, arg, configuration);
        }
    }
    
    
    public record AdditionalProperties5() implements JsonSchema {
        public static JsonSchemas.NotAnyTypeSchema withDefaults() {
            return JsonSchemas.NotAnyTypeSchema.withDefaults();
        }
    
        // NotAnyTypeSchema
    }
    
    
    public record EmptyMap(LinkedHashSet<Class<?>> type, Class<?> additionalProperties) implements JsonSchema {
        public static EmptyMap withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(FrozenMap.class);
            Class<?> additionalProperties = AdditionalProperties5.class;
            return new EmptyMap(type, additionalProperties);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(EmptyMap.class, arg, configuration);
        }
    }
    
    
    public record AdditionalProperties6(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static AdditionalProperties6 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new AdditionalProperties6(type);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties6.class, arg, configuration);
        }
    }    
    
    public record MapWithUndeclaredPropertiesString(LinkedHashSet<Class<?>> type, Class<?> additionalProperties) implements JsonSchema {
        public static MapWithUndeclaredPropertiesString withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(FrozenMap.class);
            Class<?> additionalProperties = AdditionalProperties6.class;
            return new MapWithUndeclaredPropertiesString(type, additionalProperties);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(MapWithUndeclaredPropertiesString.class, arg, configuration);
        }
    }
    
    
    public record AdditionalPropertiesClass2(LinkedHashSet<Class<?>> type, LinkedHashMap<String, Class<?>> properties) implements JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static AdditionalPropertiesClass2 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(FrozenMap.class);
            LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>();
            properties.put("map_property", MapProperty.class);
            properties.put("map_of_map_property", MapOfMapProperty.class);
            properties.put("anytype_1", Anytype1.class);
            properties.put("map_with_undeclared_properties_anytype_1", MapWithUndeclaredPropertiesAnytype1.class);
            properties.put("map_with_undeclared_properties_anytype_2", MapWithUndeclaredPropertiesAnytype2.class);
            properties.put("map_with_undeclared_properties_anytype_3", MapWithUndeclaredPropertiesAnytype3.class);
            properties.put("empty_map", EmptyMap.class);
            properties.put("map_with_undeclared_properties_string", MapWithUndeclaredPropertiesString.class);
            return new AdditionalPropertiesClass2(type, properties);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalPropertiesClass2.class, arg, configuration);
        }
    }
}
