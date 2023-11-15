package org.openapijsonschematools.paths.fakerefsboolean.post.responses.response200.content.applicationjson;

public class Schema {
    // $refed class
    
    
    public record Schema2() implements JsonSchema {
        public static BooleanSchema.BooleanSchema2 withDefaults() {
            return ModelBoolean.ModelBoolean2.withDefaults();
        }
    
        // container included
        public static Boolean validate(Boolean arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(BooleanSchema.BooleanSchema2.class, arg, configuration);
        }
    }
}
