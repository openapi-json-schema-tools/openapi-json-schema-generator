package org.openapijsonschematools.client.paths.petpetid.get.responses.code200response.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.Pet;
import org.openapijsonschematools.client.components.schemas.RefPet;

public class ApplicationjsonSchema extends RefPet {
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
