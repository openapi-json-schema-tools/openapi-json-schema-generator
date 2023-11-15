package org.openapijsonschematools.components.schemas;

public class RefPet {
    // $refed class
    
    
    public record RefPet2() implements JsonSchema {
        public static Pet.Pet2 withDefaults() {
            return Pet.Pet2.withDefaults();
        }
    
        // Pet.Pet2
    }
}
