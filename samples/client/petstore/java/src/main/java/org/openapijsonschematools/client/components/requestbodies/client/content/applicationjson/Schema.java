package org.openapijsonschematools.client.components.requestbodies.client.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.Client;

public class Schema extends Client {
    // $refed class
    
    
    public static class Schema1 extends Client1 {
        private static @Nullable Schema1 instance = null;
        public static Schema1 getInstance() {
            if (instance == null) {
                instance = new Schema1();
            }
            return instance;
        }
    }
}
