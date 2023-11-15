package org.openapijsonschematools.paths.anotherfakedummy.patch.responses.response200.content.applicationjson;

public class Schema {
    // $refed class
    
    
    public record Schema2() implements JsonSchema {
        public static Client.Client2 withDefaults() {
            return Client.Client2.withDefaults();
        }
    
        // container included
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Client.Client2.class, arg, configuration);
        }
    }
}
