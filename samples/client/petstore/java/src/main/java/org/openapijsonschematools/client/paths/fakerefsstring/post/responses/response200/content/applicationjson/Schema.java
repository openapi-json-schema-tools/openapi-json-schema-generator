package org.openapijsonschematools.client.paths.fakerefsstring.post.responses.response200.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.StringSchema;

public class Schema extends StringSchema {
    // $refed class
    
    
    public static class Schema1 extends StringSchema1 {
        private static @Nullable Schema1 instance = null;
        public static Schema1 getInstance() {
            if (instance == null) {
                instance = new Schema1();
            }
            return instance;
        }
    }
}
