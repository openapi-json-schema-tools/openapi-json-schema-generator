package org.openapijsonschematools.client.paths.requestbodypostminimumvalidationwithsignedintegerrequestbody.post.requestbody.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.MinimumValidationWithSignedInteger;

public class Schema2 extends MinimumValidationWithSignedInteger {
    // $refed class
    
    
    public static class Schema3 extends MinimumValidationWithSignedInteger1 {
        private static @Nullable Schema3 instance = null;
        public static Schema3 getInstance() {
            if (instance == null) {
                instance = new Schema3();
            }
            return instance;
        }
    }
}
