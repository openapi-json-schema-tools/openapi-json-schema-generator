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
public class SpecialModelname {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record A(LinkedHashSet<Class<?>> type) implements JsonSchema {
        public static A withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(String.class);
            return new A(type);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(A.class, arg, configuration);
        }
    }    
    
    public record SpecialModelname2(LinkedHashSet<Class<?>> type) implements JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
    
        model with an invalid class name for python
        */
        public static SpecialModelname2 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(FrozenMap.class);
            return new SpecialModelname2(type);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(SpecialModelname2.class, arg, configuration);
        }
    }
}
