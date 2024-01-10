package org.openapijsonschematools.client.paths.requestbodypostenumwith1doesnotmatchtruerequestbody.post.requestbody.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.EnumWith1DoesNotMatchTrue;

public class Schema2 extends EnumWith1DoesNotMatchTrue {
    // $refed class
    
    
    public static class Schema3 extends EnumWith1DoesNotMatchTrue1 {
        private static @Nullable Schema3 instance = null;
        public static Schema3 getInstance() {
            if (instance == null) {
                instance = new Schema3();
            }
            return instance;
        }
    }
}
