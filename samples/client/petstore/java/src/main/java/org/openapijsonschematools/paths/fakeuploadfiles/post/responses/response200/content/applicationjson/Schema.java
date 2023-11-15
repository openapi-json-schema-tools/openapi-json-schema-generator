package org.openapijsonschematools.paths.fakeuploadfiles.post.responses.response200.content.applicationjson;

public class Schema {
    // $refed class
    
    
    public record Schema2() implements JsonSchema {
        public static ApiResponseSchema.ApiResponseSchema2 withDefaults() {
            return ModelApiResponse.ModelApiResponse2.withDefaults();
        }
    
        // container included
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ApiResponseSchema.ApiResponseSchema2.class, arg, configuration);
        }
    }
}
