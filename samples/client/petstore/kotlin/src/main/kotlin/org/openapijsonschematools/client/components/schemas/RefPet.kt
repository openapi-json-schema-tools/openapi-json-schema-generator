package org.openapijsonschematools.client.components.schemas;

import org.checkerframework.checker.nullness.qual.Nullable;

public class RefPet extends Pet {
    // $refed class
    
    
    public static class RefPet1 extends Pet1 {
        private static @Nullable RefPet1 instance = null;
        public static RefPet1 getInstance() {
            if (instance == null) {
                instance = new RefPet1();
            }
            return instance;
        }
    }
}
