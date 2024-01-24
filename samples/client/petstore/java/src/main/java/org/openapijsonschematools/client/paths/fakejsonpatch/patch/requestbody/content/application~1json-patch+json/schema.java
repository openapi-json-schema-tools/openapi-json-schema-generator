package org.openapijsonschematools.client.paths.fakejsonpatch.patch.requestbody.content.application~1json-patch+json;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.JSONPatchRequest;

public class Schema extends JSONPatchRequest {
    // $refed class
    
    
    public static class Schema1 extends JSONPatchRequest1 {
        private static @Nullable Schema1 instance = null;
        public static Schema1 getInstance() {
            if (instance == null) {
                instance = new Schema1();
            }
            return instance;
        }
    }
}
