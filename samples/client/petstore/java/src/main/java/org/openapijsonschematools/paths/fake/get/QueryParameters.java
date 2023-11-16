package org.openapijsonschematools.paths.fake.get;
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
import org.openapijsonschematools.paths.fake.get.parameters.parameter2.Schema2;
import org.openapijsonschematools.paths.fake.get.parameters.parameter3.Schema3;
import org.openapijsonschematools.paths.fake.get.parameters.parameter4.Schema4;
import org.openapijsonschematools.paths.fake.get.parameters.parameter5.Schema5;

public class QueryParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record AdditionalProperties() implements JsonSchema {
        public static JsonSchemas.NotAnyTypeSchema withDefaults() {
            return JsonSchemas.NotAnyTypeSchema.withDefaults();
        }
    
        // NotAnyTypeSchema
    }
    
    
    public record QueryParameters1(LinkedHashSet<Class<?>> type, LinkedHashMap<String, Class<?>> properties, Class<?> additionalProperties) implements JsonSchema {
        public static QueryParameters1 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(FrozenMap.class);
            LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>();
            properties.put("enum_query_double", Schema5.Schema51.class);
            properties.put("enum_query_string", Schema3.Schema31.class);
            properties.put("enum_query_integer", Schema4.Schema41.class);
            properties.put("enum_query_string_array", Schema2.Schema21.class);
            Class<?> additionalProperties = AdditionalProperties.class;
            return new QueryParameters1(type, properties, additionalProperties);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(QueryParameters1.class, arg, configuration);
        }
    }
}
