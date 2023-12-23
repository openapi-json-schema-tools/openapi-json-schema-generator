package org.openapijsonschematools.client.paths.fakerefsenum.post.requestbody.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.StringEnum;

public class Schema extends StringEnum {
    // $refed class
    
    
    public static class Schema1 extends StringEnum1 {
        private static @Nullable Schema1 instance = null;
        public static Schema1 getInstance() {
            if (instance == null) {
                instance = new Schema1();
            }
            return instance;
        }
    }
}
