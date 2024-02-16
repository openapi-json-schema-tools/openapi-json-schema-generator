package org.openapijsonschematools.client.components.parameters.componentrefschemastringwithvalidation.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.StringWithValidation;

public class ApplicationjsonSchema extends StringWithValidation {
    // $refed class
    
    
    public static class ApplicationjsonSchema1 extends StringWithValidation1 {
        private static @Nullable ApplicationjsonSchema1 instance = null;
        public static ApplicationjsonSchema1 getInstance() {
            if (instance == null) {
                instance = new ApplicationjsonSchema1();
            }
            return instance;
        }
    }
}
