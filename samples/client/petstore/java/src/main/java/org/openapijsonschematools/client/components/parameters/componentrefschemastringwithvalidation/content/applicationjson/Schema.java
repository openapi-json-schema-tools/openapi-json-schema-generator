package org.openapijsonschematools.client.components.parameters.componentrefschemastringwithvalidation.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.StringWithValidation;

public class Schema extends StringWithValidation {
    // $refed class
    
    
    public static class Schema1 extends StringWithValidation1 {
        private static @Nullable Schema1 instance = null;
        public static Schema1 getInstance() {
            if (instance == null) {
                instance = new Schema1();
            }
            return instance;
        }
    }
}
