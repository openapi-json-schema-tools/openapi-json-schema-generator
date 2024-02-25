package org.openapijsonschematools.client.paths.fakerefsmammal.post.responses.code200response.content.applicationjson;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.components.schemas.Mammal;

public class ApplicationjsonSchema extends Mammal {
    // $refed class
    
    
    public static class ApplicationjsonSchema1 extends Mammal1 {
        private static @Nullable ApplicationjsonSchema1 instance = null;
        public static ApplicationjsonSchema1 getInstance() {
            if (instance == null) {
                instance = new ApplicationjsonSchema1();
            }
            return instance;
        }
    }
}
