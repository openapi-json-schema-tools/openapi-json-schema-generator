package org.openapijsonschematools.client.paths.responsebodypostallofwithoneemptyschemaresponsebodyforcontenttypes.post.responses.response200.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.AllofWithOneEmptySchema;

public class Schema2 extends AllofWithOneEmptySchema {
    // $refed class
    
    
    public static class Schema3 extends AllofWithOneEmptySchema1 {
        private static @Nullable Schema3 instance = null;
        public static Schema3 getInstance() {
            if (instance == null) {
                instance = new Schema3();
            }
            return instance;
        }
    }
}
