package org.openapijsonschematools.paths.commonparamsubdir.delete;
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
public class PathParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record AdditionalProperties() implements JsonSchema {
        public static JsonSchemas.NotAnyTypeSchema withDefaults() {
            return JsonSchemas.NotAnyTypeSchema.withDefaults();
        }
    
        // NotAnyTypeSchema
    }
    
    
    public record PathParameters2(LinkedHashSet<Class<?>> type, LinkedHashMap<String, Class<?>> properties, Set<String> required) implements JsonSchema {
        public static PathParameters2 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(FrozenMap.class);
            LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>();
            properties.put("subDir", Schema.Schema2.class);
            Set<String> required = new LinkedHashSet<>();
            required.add("subDir");
            return new PathParameters2(type, properties, required);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(PathParameters2.class, arg, configuration);
        }
    }
}
