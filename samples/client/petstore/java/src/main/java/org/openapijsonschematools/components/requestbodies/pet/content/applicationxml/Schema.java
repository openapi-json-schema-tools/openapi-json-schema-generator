package org.openapijsonschematools.components.requestbodies.pet.content.applicationxml;

public class Schema {
    // $refed class
    
    
    public record Schema2() implements JsonSchema {
        public static Pet.Pet2 withDefaults() {
            return RefPet.RefPet2.withDefaults();
        }
    
        public static <T extends FrozenMap> T validate(Map<String, Object> arg, SchemaConfiguration configuration) {
            return JsonSchema.validate(Pet.Pet2.class, arg, configuration);
        }
    }
}
