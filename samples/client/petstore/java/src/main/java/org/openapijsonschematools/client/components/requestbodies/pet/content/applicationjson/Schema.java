package org.openapijsonschematools.client.components.requestbodies.pet.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.Pet;

public class Schema extends Pet {
    // $refed class
    
    
    public static class Schema1 extends Pet1 {
        private static @Nullable Schema1 instance = null;
        public static Schema1 getInstance() {
            if (instance == null) {
                instance = new Schema1();
            }
            return instance;
        }
    }
}
