package org.openapijsonschematools.paths.fakerefsenum.post.responses.response200.content.applicationjson;

public class Schema {
    // $refed class
    
    
    public record Schema2() implements JsonSchema {
        public static StringEnum.StringEnum2 withDefaults() {
            return StringEnum.StringEnum2.withDefaults();
        }
    
        public static Void validate(Void arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(StringEnum.StringEnum2.class, arg, configuration);
        }
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(StringEnum.StringEnum2.class, arg, configuration);
        }
    }
}
