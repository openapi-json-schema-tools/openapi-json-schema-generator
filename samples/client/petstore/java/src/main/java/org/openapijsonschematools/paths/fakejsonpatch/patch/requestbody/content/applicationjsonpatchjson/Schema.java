package org.openapijsonschematools.paths.fakejsonpatch.patch.requestbody.content.applicationjsonpatchjson;

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
