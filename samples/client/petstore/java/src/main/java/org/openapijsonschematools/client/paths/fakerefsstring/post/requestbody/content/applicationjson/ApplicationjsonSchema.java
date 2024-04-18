package org.openapijsonschematools.client.paths.fakerefsstring.post.requestbody.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.StringSchema;

public class ApplicationjsonSchema extends StringSchema {
    // $refed class
    
    
    public static class ApplicationjsonSchema1 extends StringSchema1 {
        private static @Nullable ApplicationjsonSchema1 instance = null;
        public static ApplicationjsonSchema1 getInstance() {
            if (instance == null) {
                instance = new ApplicationjsonSchema1();
            }
            return instance;
        }
    }
}
