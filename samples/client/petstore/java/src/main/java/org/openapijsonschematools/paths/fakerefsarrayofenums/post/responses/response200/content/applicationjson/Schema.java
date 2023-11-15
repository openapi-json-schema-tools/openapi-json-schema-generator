package org.openapijsonschematools.paths.fakerefsarrayofenums.post.responses.response200.content.applicationjson;

public class Schema {
    // $refed class
    
    
    public record Schema2() implements JsonSchema {
        public static ArrayOfEnums.ArrayOfEnums2 withDefaults() {
            return ArrayOfEnums.ArrayOfEnums2.withDefaults();
        }
    
        // container included
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(ArrayOfEnums.ArrayOfEnums2.class, arg, configuration);
        }
    }
}
