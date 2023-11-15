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
public class AbstractStepMessage {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record Discriminator(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static Discriminator withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Discriminator(type);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Discriminator.class, arg, configuration);
        }
    }    
    
    public record AbstractStepMessage2(LinkedHashSet<Class<?>> type, LinkedHashMap<String, Class<?>> properties, Set<String> required) implements JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
    
        Abstract Step
        */
        public static AbstractStepMessage2 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(FrozenMap.class);
            LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>();
            properties.put("discriminator", Discriminator.class);
            Set<String> required = new LinkedHashSet<>();
            required.add("description");
            required.add("discriminator");
            required.add("sequenceNumber");
            return new AbstractStepMessage2(type, properties, required);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AbstractStepMessage2.class, arg, configuration);
        }
    }
}
