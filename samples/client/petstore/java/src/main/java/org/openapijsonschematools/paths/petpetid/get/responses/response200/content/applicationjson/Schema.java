package org.openapijsonschematools.paths.petpetid.get.responses.response200.content.applicationjson;

public class Schema {
    // $refed class
    
    
    public record Schema2() implements JsonSchema {
        public static Pet.Pet2 withDefaults() {
            return RefPet.RefPet2.withDefaults();
        }
    
        // RefPet.RefPet2
    }
}
