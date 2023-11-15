package org.openapijsonschematools.paths.fakerefsboolean.post.requestbody.content.applicationjson;

public class Schema {
    // $refed class
    
    
    public record Schema2() implements JsonSchema {
        public static BooleanSchema.BooleanSchema2 withDefaults() {
            return ModelBoolean.ModelBoolean2.withDefaults();
        }
    
        public static Boolean validate(Boolean arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(BooleanSchema.BooleanSchema2.class, arg, configuration);
        }
    }
}
