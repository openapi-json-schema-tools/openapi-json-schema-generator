package org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post;
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
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter14.Schema14;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter15.Schema15;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter16.Schema16;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter17.Schema17;
import org.openapijsonschematools.paths.fakeparametercollisions1ababselfab.post.parameters.parameter18.Schema18;

public class CookieParameters {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record AdditionalProperties() implements JsonSchema {
        public static JsonSchemas.NotAnyTypeSchema withDefaults() {
            return JsonSchemas.NotAnyTypeSchema.withDefaults();
        }
    
        // NotAnyTypeSchema
    }
    
    
    public record CookieParameters1(LinkedHashSet<Class<?>> type, LinkedHashMap<String, Class<?>> properties, Class<?> additionalProperties) implements JsonSchema {
        public static CookieParameters1 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(FrozenMap.class);
            LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>();
            properties.put("1", Schema14.Schema141.class);
            properties.put("aB", Schema15.Schema151.class);
            properties.put("Ab", Schema16.Schema161.class);
            properties.put("A-B", Schema18.Schema181.class);
            properties.put("self", Schema17.Schema171.class);
            Class<?> additionalProperties = AdditionalProperties.class;
            return new CookieParameters1(type, properties, additionalProperties);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(CookieParameters1.class, arg, configuration);
        }
    }
}
