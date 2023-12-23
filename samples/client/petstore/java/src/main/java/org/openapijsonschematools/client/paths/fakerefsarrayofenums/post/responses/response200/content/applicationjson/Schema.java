package org.openapijsonschematools.client.paths.fakerefsarrayofenums.post.responses.response200.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.ArrayOfEnums;

public class Schema extends ArrayOfEnums {
    // $refed class
    
    
    public static class Schema1 extends ArrayOfEnums1 {
        private static @Nullable Schema1 instance = null;
        public static Schema1 getInstance() {
            if (instance == null) {
                instance = new Schema1();
            }
            return instance;
        }
    }
}
