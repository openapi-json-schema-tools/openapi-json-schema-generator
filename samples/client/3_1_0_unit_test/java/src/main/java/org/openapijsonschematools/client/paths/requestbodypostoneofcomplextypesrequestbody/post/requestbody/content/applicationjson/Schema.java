package org.openapijsonschematools.client.paths.requestbodypostoneofcomplextypesrequestbody.post.requestbody.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.OneofComplexTypes;

public class Schema2 extends OneofComplexTypes {
    // $refed class
    
    
    public static class Schema3 extends OneofComplexTypes1 {
        private static @Nullable Schema3 instance = null;
        public static Schema3 getInstance() {
            if (instance == null) {
                instance = new Schema3();
            }
            return instance;
        }
    }
}
