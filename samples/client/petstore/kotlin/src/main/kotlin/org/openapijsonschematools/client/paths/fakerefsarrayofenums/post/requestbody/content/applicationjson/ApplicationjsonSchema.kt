package org.openapijsonschematools.client.paths.fakerefsarrayofenums.post.requestbody.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.ArrayOfEnums;

public class ApplicationjsonSchema extends ArrayOfEnums {
    // $refed class
    
    
    public static class ApplicationjsonSchema1 extends ArrayOfEnums1 {
        private static @Nullable ApplicationjsonSchema1 instance = null;
        public static ApplicationjsonSchema1 getInstance() {
            if (instance == null) {
                instance = new ApplicationjsonSchema1();
            }
            return instance;
        }
    }
}
