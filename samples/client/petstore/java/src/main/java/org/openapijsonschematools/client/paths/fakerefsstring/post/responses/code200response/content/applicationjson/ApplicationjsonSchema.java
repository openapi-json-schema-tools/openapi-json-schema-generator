package org.openapijsonschematools.client.paths.fakerefsstring.post.responses.code200response.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.String;

public class ApplicationjsonSchema extends String {
    // $refed class
    
    
    public static class ApplicationjsonSchema1 extends String1 {
        private static @Nullable ApplicationjsonSchema1 instance = null;
        public static ApplicationjsonSchema1 getInstance() {
            if (instance == null) {
                instance = new ApplicationjsonSchema1();
            }
            return instance;
        }
    }
}
