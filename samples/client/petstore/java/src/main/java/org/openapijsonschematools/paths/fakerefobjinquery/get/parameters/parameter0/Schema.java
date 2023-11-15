package org.openapijsonschematools.paths.fakerefobjinquery.get.parameters.parameter0;

public class Schema {
    // $refed class
    
    
    public record Schema2() implements JsonSchema {
        public static Foo.Foo2 withDefaults() {
            return Foo.Foo2.withDefaults();
        }
    
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Foo.Foo2.class, arg, configuration);
        }
    }
}
