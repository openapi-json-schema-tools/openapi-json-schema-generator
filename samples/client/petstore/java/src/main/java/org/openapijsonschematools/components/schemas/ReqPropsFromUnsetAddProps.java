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
public class ReqPropsFromUnsetAddProps {
    // nest classes so all schemas and input/output classes can be public
    
    
    public record ReqPropsFromUnsetAddProps2(LinkedHashSet<Class<?>> type, Set<String> required) implements JsonSchema {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
        public static ReqPropsFromUnsetAddProps2 withDefaults() {
            LinkedHashSet<Class<?>> type = new LinkedHashSet<>();
            type.add(FrozenMap.class);
            Set<String> required = new LinkedHashSet<>();
            required.add("invalid-name");
            required.add("validName");
            return new ReqPropsFromUnsetAddProps2(type, required);
        }
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ReqPropsFromUnsetAddProps2.class, arg, configuration);
        }
    }
}
