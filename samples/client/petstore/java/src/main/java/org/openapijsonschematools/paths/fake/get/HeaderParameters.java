package org.openapijsonschematools.paths.fake.get;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.JsonSchema;
import org.openapijsonschematools.schemas.JsonSchemas;
import org.openapijsonschematools.schemas.FrozenList;
import org.openapijsonschematools.schemas.FrozenMap;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapijsonschematools.paths.fake.get.parameters.parameter0.Schema0;
import org.openapijsonschematools.paths.fake.get.parameters.parameter1.Schema1;

public class HeaderParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public class AdditionalProperties implements JsonSchema {
        // NotAnyTypeSchema
    }
    
    
    public class HeaderParameters1 implements JsonSchema {
        static final LinkedHashSet<Class<?>> type = new LinkedHashSet<>(Set.of(
            FrozenMap.class
        ));
        static final LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>(Map.ofEntries(
            new AbstractMap.SimpleEntry<String, Class<?>>("enum_header_string", Schema1.Schema11.class),
            new AbstractMap.SimpleEntry<String, Class<?>>("enum_header_string_array", Schema0.Schema01.class)
        ));
        static final Class<?> additionalProperties = AdditionalProperties.class;
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(HeaderParameters1.class, arg, configuration);
        }
    }
}
