package org.openapijsonschematools.paths.fakejsonpatch.patch.requestbody.content.applicationjsonpatchjson;
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
public class Schema {
    // $refed class
    
    
    public record Schema2() implements JsonSchema {
        public static JSONPatchRequest.JSONPatchRequest2 withDefaults() {
            return JSONPatchRequest.JSONPatchRequest2.withDefaults();
        }
    
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(JSONPatchRequest.JSONPatchRequest2.class, arg, configuration);
        }
    }
}
