package org.openapijsonschematools.paths.userusername.get.responses.response200.content.applicationxml;

public class Schema {
    // $refed class
    
    
    public record Schema2() implements JsonSchema {
        public static User.User2 withDefaults() {
            return User.User2.withDefaults();
        }
    
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(User.User2.class, arg, configuration);
        }
    }
}
