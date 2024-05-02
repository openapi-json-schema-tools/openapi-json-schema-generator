package org.openapijsonschematools.client.components.requestbodies.pet.content.applicationxml;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.Pet;
import org.openapijsonschematools.client.components.schemas.RefPet;

public class ApplicationxmlSchema extends RefPet {
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
