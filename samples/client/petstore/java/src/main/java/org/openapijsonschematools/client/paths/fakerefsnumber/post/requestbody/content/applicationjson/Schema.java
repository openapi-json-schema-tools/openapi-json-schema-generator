package org.openapijsonschematools.client.paths.fakerefsnumber.post.requestbody.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.NumberWithValidations;

public class Schema extends NumberWithValidations {
    // $refed class
    
    
    public static class Schema1 extends NumberWithValidations1 {
        private static @Nullable Schema1 instance = null;
        public static Schema1 getInstance() {
            if (instance == null) {
                instance = new Schema1();
            }
            return instance;
        }
    }
}
