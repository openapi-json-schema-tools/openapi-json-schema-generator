package org.openapijsonschematools.components.responses.successwithjsonapiresponse;
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
    
    
    public record Headers1(LinkedHashSet<Class<?>> type, LinkedHashMap<String, Class<?>> properties, Set<String> required, Class<?> additionalProperties) implements JsonSchema {
        public static Headers1 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(FrozenMap.class);
            LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>();
            properties.put("ref-schema-header", StringWithValidation.StringWithValidation1.class);
            properties.put("int32", Schema.Schema1.class);
            properties.put("ref-content-schema-header", StringWithValidation.StringWithValidation1.class);
            properties.put("stringHeader", Schema.Schema1.class);
            properties.put("numberHeader", Schema.Schema1.class);
            Set<String> required = new LinkedHashSet<>();
            required.add("int32");
            required.add("ref-content-schema-header");
            required.add("ref-schema-header");
            required.add("stringHeader");
            Class<?> additionalProperties = AdditionalProperties.class;
            return new Headers1(type, properties, required, additionalProperties);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Headers1.class, arg, configuration);
        }
    }
}
