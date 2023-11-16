package org.openapijsonschematools.components.responses.headerswithnobody.headers.location;
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

public class LocationSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record LocationSchema1(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static LocationSchema1 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new LocationSchema1(type);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(LocationSchema1.class, arg, configuration);
        }
    }}
