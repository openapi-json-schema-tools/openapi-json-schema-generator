package org.openapijsonschematools.client.paths.responsebodypostidnemailformatresponsebodyforcontenttypes.post.responses.response200.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.IdnEmailFormat;

public class Schema2 extends IdnEmailFormat {
    // $refed class
    
    
    public static class Schema3 extends IdnEmailFormat1 {
        private static @Nullable Schema3 instance = null;
        public static Schema3 getInstance() {
            if (instance == null) {
                instance = new Schema3();
            }
            return instance;
        }
    }
}
