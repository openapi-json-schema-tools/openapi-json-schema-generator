package org.openapijsonschematools.client.components.requestbodies.pet.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.Pet;

public class ApplicationjsonSchema extends Pet {
    // $refed class
    
    
    public static class ApplicationjsonSchema1 extends Pet1 {
        private static @Nullable ApplicationjsonSchema1 instance = null;
        public static ApplicationjsonSchema1 getInstance() {
            if (instance == null) {
                instance = new ApplicationjsonSchema1();
            }
            return instance;
        }
    }
}
