package org.openapijsonschematools.paths.fakerefsarraymodel.post.requestbody.content.applicationjson;

public class Schema {
    // $refed class
    
    
    public record Schema2() implements JsonSchema {
        public static AnimalFarm.AnimalFarm2 withDefaults() {
            return AnimalFarm.AnimalFarm2.withDefaults();
        }
    
        // container included
        public static <U extends FrozenList> U validate(List<Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(AnimalFarm.AnimalFarm2.class, arg, configuration);
        }
    }
}
