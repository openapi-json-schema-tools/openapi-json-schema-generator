package org.openapijsonschematools.client.paths.fakerefsobjectmodelwithrefprops.post.requestbody.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.ObjectModelWithRefProps;

public class ApplicationjsonSchema extends ObjectModelWithRefProps {
    // $refed class
    
    
    public static class ApplicationjsonSchema1 extends ObjectModelWithRefProps1 {
        private static @Nullable ApplicationjsonSchema1 instance = null;
        public static ApplicationjsonSchema1 getInstance() {
            if (instance == null) {
                instance = new ApplicationjsonSchema1();
            }
            return instance;
        }
    }
}
