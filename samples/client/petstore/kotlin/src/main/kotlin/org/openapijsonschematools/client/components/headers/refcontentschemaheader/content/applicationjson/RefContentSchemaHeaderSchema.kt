package org.openapijsonschematools.client.components.headers.refcontentschemaheader.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.StringWithValidation;

public class RefContentSchemaHeaderSchema extends StringWithValidation {
    // $refed class
    
    
    public static class RefContentSchemaHeaderSchema1 extends StringWithValidation1 {
        private static @Nullable RefContentSchemaHeaderSchema1 instance = null;
        public static RefContentSchemaHeaderSchema1 getInstance() {
            if (instance == null) {
                instance = new RefContentSchemaHeaderSchema1();
            }
            return instance;
        }
    }
}
