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
    
    
    public record ArrayItemsNullable(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static ArrayItemsNullable withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(FrozenList.class);
            return new ArrayItemsNullable(type);
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
}
