package org.openapijsonschematools.paths.fakeuploadfile.post.responses.response200.content.applicationjson;
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
import org.openapijsonschematools.components.schemas.ApiResponseSchema;

public class Schema {
    // $refed class
    
    
    public record Schema1() implements JsonSchema {
        public static ApiResponseSchema.ApiResponseSchema1 withDefaults() {
            return ApiResponseSchema.ApiResponseSchema1.withDefaults();
        }
    
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ApiResponseSchema.ApiResponseSchema1.class, arg, configuration);
        }
    }
}
