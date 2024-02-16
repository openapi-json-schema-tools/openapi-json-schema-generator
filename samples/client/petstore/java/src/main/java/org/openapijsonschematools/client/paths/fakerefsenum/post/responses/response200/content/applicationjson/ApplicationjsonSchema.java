package org.openapijsonschematools.client.paths.fakerefsenum.post.responses.response200.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.StringEnum;

public class ApplicationjsonSchema extends StringEnum {
    // $refed class
    
    
    public static class ApplicationjsonSchema1 extends StringEnum1 {
        private static @Nullable ApplicationjsonSchema1 instance = null;
        public static ApplicationjsonSchema1 getInstance() {
            if (instance == null) {
                instance = new ApplicationjsonSchema1();
            }
            return instance;
        }
    }
}
