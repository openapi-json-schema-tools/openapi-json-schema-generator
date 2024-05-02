package org.openapijsonschematools.client.components.headers.refschemaheader;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.StringWithValidation;

public class RefSchemaHeaderSchema extends StringWithValidation {
    // $refed class
    
    
    public static class RefSchemaHeaderSchema1 extends StringWithValidation1 {
        private static @Nullable RefSchemaHeaderSchema1 instance = null;
        public static RefSchemaHeaderSchema1 getInstance() {
            if (instance == null) {
                instance = new RefSchemaHeaderSchema1();
            }
            return instance;
        }
    }
}
