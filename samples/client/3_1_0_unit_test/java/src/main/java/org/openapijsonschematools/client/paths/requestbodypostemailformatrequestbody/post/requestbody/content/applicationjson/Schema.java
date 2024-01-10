package org.openapijsonschematools.client.paths.requestbodypostemailformatrequestbody.post.requestbody.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.EmailFormat;

public class Schema2 extends EmailFormat {
    // $refed class
    
    
    public static class Schema3 extends EmailFormat1 {
        private static @Nullable Schema3 instance = null;
        public static Schema3 getInstance() {
            if (instance == null) {
                instance = new Schema3();
            }
            return instance;
        }
    }
}
