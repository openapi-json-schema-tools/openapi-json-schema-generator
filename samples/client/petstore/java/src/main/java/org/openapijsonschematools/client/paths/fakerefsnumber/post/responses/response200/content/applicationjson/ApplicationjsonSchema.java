package org.openapijsonschematools.client.paths.fakerefsnumber.post.responses.response200.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.NumberWithValidations;

public class ApplicationjsonSchema extends NumberWithValidations {
    // $refed class
    
    
    public static class ApplicationjsonSchema1 extends NumberWithValidations1 {
        private static @Nullable ApplicationjsonSchema1 instance = null;
        public static ApplicationjsonSchema1 getInstance() {
            if (instance == null) {
                instance = new ApplicationjsonSchema1();
            }
            return instance;
        }
    }
}
