package org.openapijsonschematools.client.paths.petpetid.get.responses.code200response.content.applicationxml;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.Pet;

public class ApplicationxmlSchema extends Pet {
    // $refed class
    
    
    public static class ApplicationxmlSchema1 extends Pet1 {
        private static @Nullable ApplicationxmlSchema1 instance = null;
        public static ApplicationxmlSchema1 getInstance() {
            if (instance == null) {
                instance = new ApplicationxmlSchema1();
            }
            return instance;
        }
    }
}
