package org.openapijsonschematools.client.paths.fakebodywithqueryparams.put.requestbody.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.User;

public class Schema extends User {
    // $refed class
    
    
    public static class Schema1 extends User1 {
        private static @Nullable Schema1 instance = null;
        public static Schema1 getInstance() {
            if (instance == null) {
                instance = new Schema1();
            }
            return instance;
        }
    }
}
