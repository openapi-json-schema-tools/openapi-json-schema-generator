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
public class NullableClass {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record AdditionalProperties3(
        LinkedHashSet<Class<?>> type
    ) implements JsonSchema {
        public static AdditionalProperties3 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(Void.class);
            type.add(FrozenMap.class);
            return new AdditionalProperties3(type);
        }
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties3.class, arg, configuration);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties3.class, arg, configuration);
        }
    }    
    
    public record IntegerProp(
        LinkedHashSet<Class<?>> type
    ) implements JsonSchema {
        public static IntegerProp withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(Void.class);
            type.add(Integer.class);
            type.add(Long.class);
            type.add(Float.class);
            type.add(Double.class);
            return new IntegerProp(type);
        }
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(IntegerProp.class, arg, configuration);
        }
        public static Long validate(Integer arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(IntegerProp.class, Long.valueOf(arg), configuration);
        }
        
        public static Long validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(IntegerProp.class, Long.parseLong(arg.toString()), configuration);
        }
        
        public static Long validate(Long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(IntegerProp.class, arg, configuration);
        }
        
        public static Long validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(IntegerProp.class, Long.parseLong(arg.toString()), configuration);
        }
    }    
    
    public record NumberProp(
        LinkedHashSet<Class<?>> type
    ) implements JsonSchema {
        public static NumberProp withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(Void.class);
            type.add(Integer.class);
            type.add(Long.class);
            type.add(Float.class);
            type.add(Double.class);
            return new NumberProp(type);
        }
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(NumberProp.class, arg, configuration);
        }
        public static Number validate(Integer arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(NumberProp.class, arg, configuration);
        }
        
        public static Number validate(Long arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(NumberProp.class, arg, configuration);
        }
        
        public static Number validate(Float arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(NumberProp.class, arg, configuration);
        }
        
        public static Number validate(Double arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(NumberProp.class, arg, configuration);
        }
    }    
    
    public record BooleanProp(
        LinkedHashSet<Class<?>> type
    ) implements JsonSchema {
        public static BooleanProp withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(Void.class);
            type.add(Boolean.class);
            return new BooleanProp(type);
        }
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(BooleanProp.class, arg, configuration);
        }
        public static Boolean validate(Boolean arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(BooleanProp.class, arg, configuration);
        }
    }    
    
    public record StringProp(
        Void pattern,
        LinkedHashSet<Class<?>> type
    ) implements JsonSchema {
        public static StringProp withDefaults() {
            Void pattern = null;
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(Void.class);
            type.add(String.class);
            return new StringProp(pattern, type);
        }
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(StringProp.class, arg, configuration);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(StringProp.class, arg, configuration);
        }
    }    
    
    public record DateProp(
        Void pattern,
        LinkedHashSet<Class<?>> type
    ) implements JsonSchema {
        public static DateProp withDefaults() {
            Void pattern = null;
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(Void.class);
            type.add(String.class);
            return new DateProp(pattern, type);
        }
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(DateProp.class, arg, configuration);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(DateProp.class, arg, configuration);
        }
    }    
    
    public record DatetimeProp(
        Void pattern,
        LinkedHashSet<Class<?>> type
    ) implements JsonSchema {
        public static DatetimeProp withDefaults() {
            Void pattern = null;
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(Void.class);
            type.add(String.class);
            return new DatetimeProp(pattern, type);
        }
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(DatetimeProp.class, arg, configuration);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(DatetimeProp.class, arg, configuration);
        }
    }    
    
    public record Items() implements JsonSchema {
        public static JsonSchemas.MapSchema withDefaults() {
            return JsonSchemas.MapSchema.withDefaults();
        }
    
        public static FrozenMap<String, Object> validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JsonSchemas.MapSchema.class, arg, configuration);
        }
    }
    
    
    public record ArrayNullableProp(
        LinkedHashSet<Class<?>> type,
        Class<?> items
    ) implements JsonSchema {
        public static ArrayNullableProp withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(Void.class);
            type.add(FrozenList.class);
            Class<?> items = Items.class;
            return new ArrayNullableProp(type, items);
        }
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ArrayNullableProp.class, arg, configuration);
        }
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ArrayNullableProp.class, arg, configuration);
        }
    }    
    
    public record Items1(
        LinkedHashSet<Class<?>> type
    ) implements JsonSchema {
        public static Items1 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(Void.class);
            type.add(FrozenMap.class);
            return new Items1(type);
        }
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Items1.class, arg, configuration);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Items1.class, arg, configuration);
        }
    }    
    
    public record ArrayAndItemsNullableProp(
        LinkedHashSet<Class<?>> type,
        Class<?> items
    ) implements JsonSchema {
        public static ArrayAndItemsNullableProp withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(Void.class);
            type.add(FrozenList.class);
            Class<?> items = Items1.class;
            return new ArrayAndItemsNullableProp(type, items);
        }
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ArrayAndItemsNullableProp.class, arg, configuration);
        }
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ArrayAndItemsNullableProp.class, arg, configuration);
        }
    }    
    
    public record Items2(
        LinkedHashSet<Class<?>> type
    ) implements JsonSchema {
        public static Items2 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(Void.class);
            type.add(FrozenMap.class);
            return new Items2(type);
        }
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Items2.class, arg, configuration);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Items2.class, arg, configuration);
        }
    }    
    
    public record ArrayItemsNullable(LinkedHashSet<Class<?>> type, Class<?> items) implements JsonSchema {
        public static ArrayItemsNullable withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(FrozenList.class);
            Class<?> items = Items2.class;
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
    
    
    public record ObjectNullableProp(
        LinkedHashSet<Class<?>> type,
        Class<?> additionalProperties
    ) implements JsonSchema {
        public static ObjectNullableProp withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(Void.class);
            type.add(FrozenMap.class);
            Class<?> additionalProperties = AdditionalProperties.class;
            return new ObjectNullableProp(type, additionalProperties);
        }
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ObjectNullableProp.class, arg, configuration);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ObjectNullableProp.class, arg, configuration);
        }
    }    
    
    public record AdditionalProperties1(
        LinkedHashSet<Class<?>> type
    ) implements JsonSchema {
        public static AdditionalProperties1 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(Void.class);
            type.add(FrozenMap.class);
            return new AdditionalProperties1(type);
        }
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties1.class, arg, configuration);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties1.class, arg, configuration);
        }
    }    
    
    public record ObjectAndItemsNullableProp(
        LinkedHashSet<Class<?>> type,
        Class<?> additionalProperties
    ) implements JsonSchema {
        public static ObjectAndItemsNullableProp withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(Void.class);
            type.add(FrozenMap.class);
            Class<?> additionalProperties = AdditionalProperties1.class;
            return new ObjectAndItemsNullableProp(type, additionalProperties);
        }
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ObjectAndItemsNullableProp.class, arg, configuration);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ObjectAndItemsNullableProp.class, arg, configuration);
        }
    }    
    
    public record AdditionalProperties2(
        LinkedHashSet<Class<?>> type
    ) implements JsonSchema {
        public static AdditionalProperties2 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(Void.class);
            type.add(FrozenMap.class);
            return new AdditionalProperties2(type);
        }
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties2.class, arg, configuration);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AdditionalProperties2.class, arg, configuration);
        }
    }    
    
    public record ObjectItemsNullable(LinkedHashSet<Class<?>> type, Class<?> additionalProperties) implements JsonSchema {
        public static ObjectItemsNullable withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(FrozenMap.class);
            Class<?> additionalProperties = AdditionalProperties2.class;
            return new ObjectItemsNullable(type, additionalProperties);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ObjectItemsNullable.class, arg, configuration);
        }
    }
    
    
    public record NullableClass1(LinkedHashSet<Class<?>> type, LinkedHashMap<String, Class<?>> properties, Class<?> additionalProperties) implements JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static NullableClass1 withDefaults() {
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
            Class<?> additionalProperties = AdditionalProperties3.class;
            return new NullableClass1(type, properties, additionalProperties);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(NullableClass1.class, arg, configuration);
        }
    }
}
