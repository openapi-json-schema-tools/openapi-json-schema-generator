package org.openapijsonschematools.client.paths.user.post.requestbody.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.User;

public class ApplicationjsonSchema extends User {
    // $refed class
    
    
    public static class ApplicationjsonSchema1 extends User1 {
        private static @Nullable ApplicationjsonSchema1 instance = null;
        public static ApplicationjsonSchema1 getInstance() {
            if (instance == null) {
                instance = new ApplicationjsonSchema1();
            }
            return instance;
        }
    }
}
