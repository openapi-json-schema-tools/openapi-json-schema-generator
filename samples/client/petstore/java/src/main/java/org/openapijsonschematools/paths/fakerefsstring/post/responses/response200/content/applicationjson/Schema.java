package org.openapijsonschematools.paths.fakerefsstring.post.responses.response200.content.applicationjson;

public class Schema {
    // $refed class
    
    
    public record Schema2() implements JsonSchema {
        public static StringSchema.StringSchema2 withDefaults() {
            return ModelString.ModelString2.withDefaults();
        }
    
        public static String validate(String arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(StringSchema.StringSchema2.class, arg, configuration);
        }
    }
}
