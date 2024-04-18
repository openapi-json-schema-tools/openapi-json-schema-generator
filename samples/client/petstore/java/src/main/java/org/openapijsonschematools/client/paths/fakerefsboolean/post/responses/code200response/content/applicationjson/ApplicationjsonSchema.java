package org.openapijsonschematools.client.paths.fakerefsboolean.post.responses.code200response.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.Boolean;

public class ApplicationjsonSchema extends Boolean {
    // $refed class
    
    
    public static class ApplicationjsonSchema1 extends Boolean1 {
        private static @Nullable ApplicationjsonSchema1 instance = null;
        public static ApplicationjsonSchema1 getInstance() {
            if (instance == null) {
                instance = new ApplicationjsonSchema1();
            }
            return instance;
        }
    }
}
