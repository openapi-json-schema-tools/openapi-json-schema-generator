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
public class NullableClass {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record Items() implements JsonSchema {
        public static JsonSchemas.MapSchema withDefaults() {
            return JsonSchemas.MapSchema.withDefaults();
        }
    
        public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.MapSchema.class, arg, configuration);
        }
    }
    
    
    public record ArrayItemsNullable(LinkedHashSet<Class<?>> type, Class<?> items) implements JsonSchema {
        public static ArrayItemsNullable withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(FrozenList.class);
            Class<?> items = Items3.class;
            return new ArrayItemsNullable(type, items);
        }
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ArrayItemsNullable.class, arg, configuration);
        }
    }    
    
    public record AdditionalProperties() implements JsonSchema {
        public static JsonSchemas.MapSchema withDefaults() {
            return JsonSchemas.MapSchema.withDefaults();
        }
    
        public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.MapSchema.class, arg, configuration);
        }
    }
    
    
    public record ObjectItemsNullable(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static ObjectItemsNullable withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(FrozenMap.class);
            return new ObjectItemsNullable(type);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ObjectItemsNullable.class, arg, configuration);
        }
    }
    
    
    public record NullableClass2(LinkedHashSet<Class<?>> type, LinkedHashMap<String, Class<?>> properties) implements JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static NullableClass2 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(FrozenMap.class);
            LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>();
            properties.put("integer_prop", IntegerProp.class);
            properties.put("number_prop", NumberProp.class);
            properties.put("boolean_prop", BooleanProp.class);
            properties.put("string_prop", StringProp.class);
            properties.put("date_prop", DateProp.class);
            properties.put("datetime_prop", DatetimeProp.class);
            properties.put("array_nullable_prop", ArrayNullableProp.class);
            properties.put("array_and_items_nullable_prop", ArrayAndItemsNullableProp.class);
            properties.put("array_items_nullable", ArrayItemsNullable.class);
            properties.put("object_nullable_prop", ObjectNullableProp.class);
            properties.put("object_and_items_nullable_prop", ObjectAndItemsNullableProp.class);
            properties.put("object_items_nullable", ObjectItemsNullable.class);
            return new NullableClass2(type, properties);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(NullableClass2.class, arg, configuration);
        }
    }
}
