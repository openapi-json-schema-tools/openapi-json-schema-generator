package org.openapijsonschematools.client.paths.fakeuploadfile.post.responses.response200.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.ApiResponseSchema;

public class Schema extends ApiResponseSchema {
    // $refed class
    
    
    public static class Schema1 extends ApiResponseSchema1 {
        private static @Nullable Schema1 instance = null;
        public static Schema1 getInstance() {
            if (instance == null) {
                instance = new Schema1();
            }
            return instance;
        }
    }
}
