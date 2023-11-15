package org.openapijsonschematools.paths.fakerefsobjectmodelwithrefprops.post.requestbody.content.applicationjson;

public class Schema {
    // $refed class
    
    
    public record Schema2() implements JsonSchema {
        public static ObjectModelWithRefProps.ObjectModelWithRefProps2 withDefaults() {
            return ObjectModelWithRefProps.ObjectModelWithRefProps2.withDefaults();
        }
    
        // container included
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ObjectModelWithRefProps.ObjectModelWithRefProps2.class, arg, configuration);
        }
    }
}
