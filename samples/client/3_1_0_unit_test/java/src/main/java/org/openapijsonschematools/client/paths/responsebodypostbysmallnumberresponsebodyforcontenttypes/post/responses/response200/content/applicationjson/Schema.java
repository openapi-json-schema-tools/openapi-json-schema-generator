package org.openapijsonschematools.client.paths.responsebodypostbysmallnumberresponsebodyforcontenttypes.post.responses.response200.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.BySmallNumber;

public class Schema2 extends BySmallNumber {
    // $refed class
    
    
    public static class Schema3 extends BySmallNumber1 {
        private static @Nullable Schema3 instance = null;
        public static Schema3 getInstance() {
            if (instance == null) {
                instance = new Schema3();
            }
            return instance;
        }
    }
}
