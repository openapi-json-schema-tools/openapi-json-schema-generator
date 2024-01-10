package org.openapijsonschematools.client.paths.requestbodypostnotmultipletypesrequestbody.post.requestbody.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.NotMultipleTypes;

public class Schema2 extends NotMultipleTypes {
    // $refed class
    
    
    public static class Schema3 extends NotMultipleTypes1 {
        private static @Nullable Schema3 instance = null;
        public static Schema3 getInstance() {
            if (instance == null) {
                instance = new Schema3();
            }
            return instance;
        }
    }
}
