package org.openapijsonschematools.paths.fakepetiduploadimagewithrequiredfile.post.responses.response200.content.applicationjson;
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
        public static ApiResponseSchema.ApiResponseSchema2 withDefaults() {
            return ModelApiResponse.ModelApiResponse2.withDefaults();
        }
    
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ApiResponseSchema.ApiResponseSchema2.class, arg, configuration);
        }
    }
}
