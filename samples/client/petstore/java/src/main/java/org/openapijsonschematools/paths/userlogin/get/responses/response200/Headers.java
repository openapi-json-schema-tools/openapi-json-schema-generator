package org.openapijsonschematools.paths.userlogin.get.responses.response200;
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
public class Headers {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record AdditionalProperties() implements JsonSchema {
        public static JsonSchemas.NotAnyTypeSchema withDefaults() {
            return JsonSchemas.NotAnyTypeSchema.withDefaults();
        }
    
        // NotAnyTypeSchema
    }
    
    
    public record Headers2(LinkedHashSet<Class<?>> type, LinkedHashMap<String, Class<?>> properties, Set<String> required, Class<?> additionalProperties) implements JsonSchema {
        public static Headers2 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(FrozenMap.class);
            LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>();
            properties.put("X-Rate-Limit", Schema.Schema2.class);
            properties.put("int32", Schema.Schema2.class);
            properties.put("X-Expires-After", Schema.Schema2.class);
            properties.put("ref-content-schema-header", StringWithValidation.StringWithValidation2.class);
            properties.put("numberHeader", Schema.Schema2.class);
            Set<String> required = new LinkedHashSet<>();
            required.add("X-Rate-Limit");
            required.add("int32");
            required.add("ref-content-schema-header");
            Class<?> additionalProperties = AdditionalProperties.class;
            return new Headers2(type, properties, required, additionalProperties);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Headers2.class, arg, configuration);
        }
    }
}
