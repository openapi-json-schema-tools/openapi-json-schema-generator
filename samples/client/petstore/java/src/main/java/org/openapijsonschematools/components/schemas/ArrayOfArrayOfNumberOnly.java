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
public class ArrayOfArrayOfNumberOnly {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record Items2() implements JsonSchema {
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
    
    
    public record Items(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static Items withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(FrozenList.class);
            return new Items(type);
        }
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Items.class, arg, configuration);
        }
    }    
    
    public record ArrayArrayNumber(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static ArrayArrayNumber withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(FrozenList.class);
            return new ArrayArrayNumber(type);
        }
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ArrayArrayNumber.class, arg, configuration);
        }
    }}
