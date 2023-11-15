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
public class ObjectModelWithArgAndArgsProperties {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record Arg(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static Arg withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Arg(type);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Arg.class, arg, configuration);
        }
    }    
    
    public record Args(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static Args withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new Args(type);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Args.class, arg, configuration);
        }
    }    
    
    public record ObjectModelWithArgAndArgsProperties2(LinkedHashSet<Class<?>> type, LinkedHashMap<String, Class<?>> properties) implements JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static ObjectModelWithArgAndArgsProperties2 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(FrozenMap.class);
            LinkedHashMap<String, Class<?>> properties = new LinkedHashMap<>();
            properties.put("arg", Arg.class);
            properties.put("args", Args.class);
            return new ObjectModelWithArgAndArgsProperties2(type, properties);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ObjectModelWithArgAndArgsProperties2.class, arg, configuration);
        }
    }
}
