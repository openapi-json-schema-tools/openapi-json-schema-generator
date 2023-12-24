package org.openapijsonschematools.client.components.requestbodies.pet.content.applicationxml;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.Pet;
import org.openapijsonschematools.client.components.schemas.RefPet;

public class Schema extends RefPet {
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
